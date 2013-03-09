package interfaces;

/**
 * Interface for classes that represent a single hidden dimension.
 */
public interface IDimension 
{
	/**
	 * @return Human-readable descriptor for this dimension
	 */
	String getDescriptor();
	
	/**
	 * TODO: should this method be in here?
	 * 
	 * Evaluate a Twitter message with respect to this dimension. For example, suppose the
	 * dimension represents the hashtag '#iphone', this method can return 1 if the message
	 * contains '#iphone' or 0 otherwise.
	 * 
	 * @param twit The message to evaluate
	 * 
	 * @return Value of the message evaluated at this dimension 
	 */
	double eval(ITwit twit);
}
