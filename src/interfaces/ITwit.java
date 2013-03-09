package interfaces;

import java.util.Collection;

/**
 * Interface for classes that represent a single Twitter message.
 */
public interface ITwit
{
	/**
	 * @return The original text of this Twitter message
	 */
	String getMessage();
	
	/**
	 * @return Collection of hashtags contained in this message or an empty set if there is none
	 */
	Collection<String> getHashTags();
}
