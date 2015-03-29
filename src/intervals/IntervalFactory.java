package intervals;


public class IntervalFactory {

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
