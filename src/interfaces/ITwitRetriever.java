package interfaces;

import java.util.Collection;

/**
 * Interface for the Twit retrieval system (module #3).
 */
public interface ITwitRetriever 
{
	/**
	 * Given a query, return a collection of Twitter messages associated with this query.
	 * For example, this method might return the N most recent messages.
	 * 
	 * @param query The query entered by user into the system
	 * 
	 * @return Collection of Twitter messages related to the specified query
	 */
	Collection<ITwit> getTwits(IQuery query);
}
