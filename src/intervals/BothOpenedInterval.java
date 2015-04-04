package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(FromPoint minimum, UntilPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() < value && value < maximum.getNumber();
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum.getNumber() == interval.maximum.getNumber()) {
			return false;
		}
		if (maximum.getNumber() == interval.minimum.getNumber()) {
			return false;
		}
		return intersectsWithDefault(interval);
	}

}
