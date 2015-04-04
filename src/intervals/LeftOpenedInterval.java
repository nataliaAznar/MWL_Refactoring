package intervals;

public class LeftOpenedInterval extends Interval{

	public LeftOpenedInterval(FromPoint minimum, ExactPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() < value && value <= maximum.getNumber();
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum.getNumber() == interval.maximum.getNumber()) 
			return false;
		if (maximum.getNumber() == interval.minimum.getNumber()) 
			return interval.isIntersected(this);
		return intersectsWithDefault(interval);
	}
	
	@Override
	public boolean isIntersected(RightOpenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersectedMinimum(UnopenedInterval interval){
		return true;
	}

}
