package intervals;

public abstract class ExactPoint extends Point{

	public ExactPoint(double number) {
		super(number);
	}

	@Override
	public abstract boolean intersectsWith(Point p);

	public abstract boolean includes(Point p);

	@Override
	public boolean isIncluded(FromPoint p) {
		return p.getNumber() < this.getNumber();
	}

	@Override
	public boolean isIncluded(UntilPoint p) {
		return this.getNumber() < p.getNumber();
	}

	@Override
	public boolean isIntersected(FromExactPoint p) {
		return p.getNumber() <= this.getNumber();
	}
	
	@Override
	public boolean isIntersected(UntilExactPoint p) {
		return p.getNumber() >= this.getNumber();
	}
}
