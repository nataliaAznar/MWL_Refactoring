package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch(opening){
		case BOTH_OPENED: return getBothOpenedInterval(minimum, maximum, opening);
		case LEFT_OPENED: return getLeftOpenedInterval(minimum, maximum, opening);
		case RIGHT_OPENED: return getRightOpenedInterval(minimum, maximum, opening);
		case UNOPENED: return getUnopenedInterval(minimum, maximum, opening);
		default: return null;
		}
	}
	
	public static Interval getBothOpenedInterval(double minimum, double maximum, Opening opening) {
		return new BothOpenedInterval(minimum, maximum, opening);
	}
	
	public static Interval getLeftOpenedInterval(double minimum, double maximum, Opening opening) {
		return new LeftOpenedInterval(minimum, maximum, opening);
	}
	
	public static Interval getRightOpenedInterval(double minimum, double maximum, Opening opening) {
		return new RightOpenedInterval(minimum, maximum, opening);
	}
	
	public static Interval getUnopenedInterval(double minimum, double maximum, Opening opening) {
		return new UnopenedInterval(minimum, maximum, opening);
	}
}
