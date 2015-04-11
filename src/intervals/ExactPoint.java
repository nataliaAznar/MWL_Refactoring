package intervals;

public abstract class ExactPoint extends Point{
	private Type type;

	public ExactPoint(double number, Type type) {
		super(number);
		this.type = type;
	}
	
	protected Type getType() {
		return type;
	}
	

	@Override
	public abstract boolean intersectsWith(Point p);

	public boolean includes(Point p){
		return p.isIncluded(this);
	}

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
