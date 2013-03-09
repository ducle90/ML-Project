package interfaces;

/**
 * All Query classes must implement this interface.
 * I'm unclear what a Query object must be able to do (Cheng?).
 */
public interface IQuery 
{
	/**
	 * @return The original query that was entered into the system
	 */
	String getOriginal();
	
	/**
	 * @return The processed query that will be fed into the retrieval module (module #3)
	 */
	String getProcessed();
}
