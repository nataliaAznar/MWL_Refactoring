package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch(opening){
		case BOTH_OPENED: return getBothOpenedInterval(new FromPoint(minimum), new UntilPoint(maximum));
		case LEFT_OPENED: return getLeftOpenedInterval(new FromPoint(minimum), new UntilExactPoint(maximum));
		case RIGHT_OPENED: return getRightOpenedInterval(new FromExactPoint(minimum), new UntilPoint(maximum));
		case UNOPENED: return getUnopenedInterval(new FromExactPoint(minimum), new UntilExactPoint(maximum));
		default: return null;
		}
	}
	
	public static Interval getBothOpenedInterval(FromPoint  minimum, UntilPoint maximum) {
		return new Interval(minimum, maximum);
	}
	
	public static Interval getLeftOpenedInterval(FromPoint minimum, ExactPoint maximum) {
		return new Interval(minimum, maximum);
	}
	
	public static Interval getRightOpenedInterval(ExactPoint minimum, UntilPoint maximum) {
		return new Interval(minimum, maximum);
	}
	
	public static Interval getUnopenedInterval(ExactPoint minimum, ExactPoint maximum) {
		return new Interval(minimum, maximum);
	}
}
