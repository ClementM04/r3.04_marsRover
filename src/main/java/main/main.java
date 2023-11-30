package main;

import coordinate.Coordinate;
import grid.Grid;

public class main {

	public static void main(String[] args) {
		Grid grid = new Grid();
		
		grid.makeGrid();
		
		grid.putObstacle(new Coordinate(1, 1));
		grid.printGrid();
	}

}
