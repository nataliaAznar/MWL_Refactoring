package intervals;

public class UntilPoint extends Point{

	public UntilPoint(double number) {
		super(number);
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
		return this.getNumber() <= p.getNumber();
	}

	@Override
	public boolean intersectsWith(Point p) {
		return p.getNumber() < this.getNumber();
	}

	@Override
	public boolean isIntersected(ExactPoint p) {
		if( p.getType().equals(Type.MAXIMUM))
			return p.getNumber() > this.getNumber();
		else
			return p.getNumber() < this.getNumber();
	}

}
