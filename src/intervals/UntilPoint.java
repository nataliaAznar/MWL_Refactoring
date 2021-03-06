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
	public String toString() {
		return this.getNumber() + ")";
	}

	@Override
	public boolean isIntersected(FromExactPoint p) {
		return p.getNumber() < this.getNumber();
	}

	@Override
	public boolean isIntersected(UntilExactPoint p) {
		return p.getNumber() > this.getNumber();
	}

}
