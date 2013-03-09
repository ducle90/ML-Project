package interfaces;

import java.util.Collection;
import java.util.Map;

/**
 * Interface for the Twitter message analysis system (module #2).
 */
public interface ITwitAnalyzer 
{
	/**
	 * Given a Twitter message and a collection of extracted dimensions, return a collection
	 * of dimensions associated with this particular message, along with their values. Note
	 * that the resulting dimensions may be different from the input dimensions.
	 * 
	 * @param twit The message to analyze
	 * @param dimensions A collection of dimensions that serve as the reference for analysis
	 * 
	 * @return A mapping between the resulting dimensions and their associated values
	 */
	Map<IDimension, Double> analyze(ITwit twit, Collection<IDimension> dimensions);
}
