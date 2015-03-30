package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch(opening){
		case BOTH_OPENED: return getBothOpenedInterval(minimum, maximum);
		case LEFT_OPENED: return getLeftOpenedInterval(minimum, maximum);
		case RIGHT_OPENED: return getRightOpenedInterval(minimum, maximum);
		case UNOPENED: return getUnopenedInterval(minimum, maximum);
		default: return null;
		}
	}
	
	public static Interval getBothOpenedInterval(double minimum, double maximum) {
		return new BothOpenedInterval(minimum, maximum);
	}
	
	public static Interval getLeftOpenedInterval(double minimum, double maximum) {
		return new LeftOpenedInterval(minimum, maximum);
	}
	
	public static Interval getRightOpenedInterval(double minimum, double maximum) {
		return new RightOpenedInterval(minimum, maximum);
	}
	
	public static Interval getUnopenedInterval(double minimum, double maximum) {
		return new UnopenedInterval(minimum, maximum);
	}
}
