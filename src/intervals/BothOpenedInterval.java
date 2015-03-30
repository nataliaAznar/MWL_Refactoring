package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}
	
	public boolean includes(double value) {
		return minimum < value && value < maximum;
	}
	
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) {
			return false;
		}
		if (maximum == interval.minimum) {
			return false;
		}
		return intersectsWithDefault(interval);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return this.isIncludedDefault(interval);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return this.isIncludedDefault(interval);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return this.isIncludedDefault(interval);
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return this.isIncludedDefault(interval);
	}

	private boolean isIncludedDefault(Interval interval){
		return (interval.includes(minimum) || minimum == interval.minimum)
				&& (interval.includes(maximum) || maximum == interval.maximum);
	}
}
