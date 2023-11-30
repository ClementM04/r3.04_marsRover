package grid;

import coordinate.Coordinate;

public class ObstacleCase extends Case{
	
	private String form = "1";

	public ObstacleCase(Coordinate coordinate) {
		super(coordinate);
	}
	
	@Override
	public void printCase() {
		System.out.print(form);
	}
}
