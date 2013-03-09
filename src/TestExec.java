import java.io.*;

public class TestExec
{
    public static void main(String args[])
    {
        if (args.length < 1)
        {
            System.out.println("USAGE: java TestExec <cmd>");
            System.exit(1);
        }
        
        try
        {            
            Runtime rt = Runtime.getRuntime();
            System.out.println("Execing: " + args[0] + "\n");
            Process proc = rt.exec(args[0]);
            
            // Any error message?
            StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR > ");            
            
            // Any output?
            StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT > ");
                
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
                                    
            // Any error???
            int exitVal = proc.waitFor();
            System.out.println("\nExitValue: " + exitVal);        
        } 
        catch (Throwable t)
        {
        	t.printStackTrace();
        }
    }
    
    private static class StreamGobbler extends Thread
    {
        InputStream is;
        String type;
        
        StreamGobbler(InputStream is, String type)
        {
            this.is = is;
            this.type = type;
        }
        
        public void run()
        {
        	BufferedReader br = new BufferedReader(new InputStreamReader(is));
        	
            try
            {
            	String line;
                while ((line = br.readLine()) != null)
                {
                    System.out.println(type + line);
                }
                
                br.close();
            } 
        	catch (IOException ioe)
        	{
        		ioe.printStackTrace();  
        	}
        }
    }
}
