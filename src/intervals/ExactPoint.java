package intervals;

public class ExactPoint extends Point{
	private Type type;

	public ExactPoint(double number, Type type) {
		super(number);
		this.type = type;
	}
	
	protected Type getType() {
		return type;
	}

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
	public boolean intersectsWith(Point p) {
		return p.isIntersected(this);
	}

	@Override
	public boolean isIntersected(ExactPoint p) {
		if( p.getType().equals(Type.MAXIMUM))
			return p.getNumber() >= this.getNumber();
		else
			return p.getNumber() <= this.getNumber();
	}
	
	@Override
	public String toString(){
		if( this.getType().equals(Type.MAXIMUM))
			return this.getNumber() + "]";
		else
			return this.getNumber() + "[";
	}
}
