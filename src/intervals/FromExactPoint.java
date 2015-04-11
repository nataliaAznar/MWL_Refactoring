package intervals;

public class FromExactPoint extends ExactPoint{

	public FromExactPoint(double number) {
		super(number);
	}
	
	@Override
	public boolean intersectsWith(Point p) {
		return p.isIntersected(this);
	}
	
	@Override
	public boolean includes(Point p){
		return p.isIncluded(this);
	}
	
	@Override
	public String toString(){
		return this.getNumber() + "[";
	}

}
