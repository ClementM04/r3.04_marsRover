package grid;

import coordinate.Coordinate;

public class NormalCase extends Case {
	
	private String form = "0";

	public NormalCase(Coordinate coordinate) {
		super(coordinate);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printCase() {
		System.out.print(form);
	}
}
