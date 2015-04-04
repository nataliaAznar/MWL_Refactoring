package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(ExactPoint minimum, ExactPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean intersectsWith(Interval interval) {
		return (minimum.intersectsWith(interval.minimum)&&maximum.intersectsWith(interval.minimum))
				|| (minimum.intersectsWith(interval.maximum)&&maximum.intersectsWith(interval.maximum));
	}
	
}
