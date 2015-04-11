package intervals;

public class FromExactPoint extends ExactPoint{

	public FromExactPoint(double number, Type type) {
		super(number, type);
	}
	
	@Override
	public String toString(){
		return this.getNumber() + "[";
	}
	
	@Override
	public boolean intersectsWith(Point p) {
		return p.isIntersected(this);
	}

}
