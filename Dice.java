package Chess_Dice;

public class Dice {
	int base_face;
	int anti_base_face;
	
	int front_face;
	int anti_front_face;

	int righthand_face;
	int anti_righthand_face;

	public Dice(int base_face, int front_face, int righthand_face) {
		this.base_face = base_face;
		this.anti_base_face = 7 - base_face;

		this.front_face = front_face;
		this.anti_front_face = 7 - front_face;

		this.righthand_face = righthand_face;
		this.anti_righthand_face = 7 - righthand_face;
	}
	
	public int getBase_face() {
		return base_face;
	}

	public void setBase_face(int base_face) {
		this.base_face = base_face;
	}

	public int getAnti_base_face() {
		return 7 - this.base_face;
	}
	
	public int getFront_face() {
		return front_face;
	}

	public void setFront_face(int front_face) {
		this.front_face = front_face;
	}

	public int getAnti_front_face() {
		return 7 - front_face;
	}

	public int getRighthand_face() {
		return righthand_face;
	}

	public void setRighthand_face(int righthand_face) {
		this.righthand_face = righthand_face;
	}
	
	public int getAnti_righthand_face() {
		return 7 - righthand_face;
	}

	

}
