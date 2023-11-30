package rover;

import coordinate.Coordinate;

public class Rover {
	private Coordinate coordinate;
	private Facing facing;
	
	public Rover(Coordinate coordinate, Facing facing) {
		this.coordinate = coordinate;
		this.facing = facing;
	}
	
	public void moove(char command) {
		if (command == 'F') {
			if (facing == Facing.NORTH) {
				this.coordinate.setY(coordinate.getY()+1);
			} else if (facing == Facing.SOUTH) {
				this.coordinate.setY(coordinate.getY()-1);
			} else if (facing == Facing.EAST) {
				this.coordinate.setX(coordinate.getX()+1);
			} else if (facing == Facing.WEST) {
				this.coordinate.setY(coordinate.getY()-1);
			}
			
		}else if (command == 'B') {
			if (facing == Facing.NORTH) {
				this.coordinate.setY(coordinate.getY()-1);
			} else if (facing == Facing.SOUTH) {
				this.coordinate.setY(coordinate.getY()+1);
			} else if (facing == Facing.EAST) {
				this.coordinate.setX(coordinate.getX()-1);
			} else if (facing == Facing.WEST) {
				this.coordinate.setY(coordinate.getY()+1);
			}
			
		} else if (command == 'L') {
			this.facing = Facing.WEST;
		}
	}
	
	
}
