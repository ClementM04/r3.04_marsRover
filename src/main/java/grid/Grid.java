package grid;

import java.util.List;

import coordinate.Coordinate;

import java.util.ArrayList;

public class Grid {
	
	private List<List<Case>> Cases = new ArrayList<List<Case>>();
	
	
	
	public void makeGrid() {
		for (int ligne = 0;ligne < 5; ligne++ ) {
			List<Case> x = new ArrayList<>();
			for (int colonne = 0;colonne < 5; colonne++ ) {
				x.add(new NormalCase(new Coordinate(ligne,colonne)));
			}
			Cases.add(x);
		}
	}
	
	public void printGrid() {
		for (List<Case> line : this.Cases) {
			for (Case case1 : line) {
				case1.printCase();
			}
			System.out.println();
		}
	}
	
	public void putObstacle(Coordinate coordinate){
		this.Cases.get(coordinate.getX()).set(coordinate.getY(),new ObstacleCase(coordinate));
	}
	
	
}
