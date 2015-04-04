package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(ExactPoint minimum, UntilPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum.getNumber() == interval.maximum.getNumber()) 
			return interval.isIntersected(this);
		if (maximum.getNumber() == interval.minimum.getNumber())
			return false;
		return intersectsWithDefault(interval);
	}
	
	@Override
	public boolean isIntersectedMaximum(UnopenedInterval interval){
		return true;
	}

}
