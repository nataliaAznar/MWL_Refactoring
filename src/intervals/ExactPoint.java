package intervals;

public class ExactPoint extends Point{

	public ExactPoint(double number) {
		super(number);
	}

	@Override
	public boolean isIncluded(FromPoint p) {
		return p.getNumber() < this.getNumber();
	}

	@Override
	public boolean isIncluded(UntilPoint p) {
		return this.getNumber() < p.getNumber();
	}

}
