package interfaces;

/**
 * Interface for the sentiment classification system (module #1).
 */
public interface ISentimentClassifier 
{
	/**
	 * Given a Twitter message, return a sentiment score for this message.
	 * 
	 * @param twit A Twitter message to evaluate
	 * 
	 * @return The sentiment score of this message. Conventions for returned value:
	 * 			(a) Must be a number in the range [-1.0 ; 1.0] 
	 * 			(b) < 0 is negative, > 0 is positive
	 * 			(c) The more the value deviates from 0, the stronger the sentiment is
	 */
	double getSentiment(ITwit twit);
}
