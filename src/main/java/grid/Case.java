package grid;

import coordinate.Coordinate;

public abstract class Case {
	private Coordinate coordinate;
	private String form;
	
	
	public Case(Coordinate coordinate){
		this.coordinate = coordinate;
	};
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
	
	public void printCase() {
		System.out.print(form);
	}
	
}
