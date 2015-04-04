package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(FromPoint minimum, UntilPoint maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum.getNumber() < value && value < maximum.getNumber();
	}
	
	public boolean includes(Interval interval) {
		return minimum.includes(interval.minimum)&&minimum.includes(interval.maximum)&&
				maximum.includes(interval.minimum)&&maximum.includes(interval.maximum);
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

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return this.isIncludedDefault(interval);
	}

	private boolean isIncludedDefault(Interval interval){
		return (interval.includes(minimum.getNumber()) || minimum.getNumber() == interval.minimum.getNumber())
				&& (interval.includes(maximum.getNumber()) || maximum.getNumber() == interval.maximum.getNumber());
	}
}
