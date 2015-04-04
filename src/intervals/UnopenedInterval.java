package intervals;

public class UnopenedInterval extends Interval{

	public UnopenedInterval(ExactPoint minimum, ExactPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() <= value && value <= maximum.getNumber();
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum.getNumber() == interval.maximum.getNumber())
			return interval.isIntersectedMinimum(this);
		if (maximum.getNumber() == interval.minimum.getNumber()) 
			return interval.isIntersectedMaximum(this);
		return intersectsWithDefault(interval);
	}
	
	@Override
	public boolean isIntersected(LeftOpenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersected(RightOpenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersectedMinimum(UnopenedInterval interval){
		return true;
	}
	
	@Override
	public boolean isIntersectedMaximum(UnopenedInterval interval){
		return true;
	}
}
