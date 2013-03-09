package interfaces;

import java.util.Collection;

/**
 * Interface for the dimension extraction system (module #4).
 */
public interface IDimensionExtractor 
{
	/**
	 * Given a collection of Twitter messages, extract the hidden dimensions associated with
	 * these messages. For example, this method might return the N most frequent hashtags
	 * contained in these messages.
	 * 
	 * @param twits A collection of Twitter messages
	 * 
	 * @return A collection of dimensions extracted from these messages
	 */
	Collection<IDimension> getDimensions(Collection<ITwit> twits);
}
