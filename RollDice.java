package Chess_Dice;

public class RollDice {
	
	Dice dice;
	
	public  RollDice(Dice new_dice) {
		dice = new_dice;
		//System.out.println("anti_righthand_face : "+ dice.anti_righthand_face);
		//System.out.println("getAnti_base_face : "+ dice.getAnti_base_face());
	}
	
	public void roll_Right(){
		// Whenever dice rolls to right...  
		// Its right face comes to base
		// Its front face remains unchanged
		// Its top face comes to as right face
		
		int old_base_face = dice.getBase_face();
		
		dice.setBase_face(dice.getRighthand_face());
		dice.setRighthand_face(7-old_base_face);
		
		//System.out.println("getAnti_base_face : "+ dice.getAnti_base_face());
		//System.out.println("anti_righthand_face : "+ dice.getAnti_righthand_face()); // should be 6
		
		
			
	}
	
	public void roll_Forward(){
		// Whenever dice rolls to right...  
		// Its right face will remain same
		// Its anti-front face will be the base face
		// Its anti-front face comes to as front face
		
		int old_base_face = dice.getBase_face();
		int old_anti_front_face = dice.getAnti_front_face();
		
		dice.setFront_face(old_base_face);
		dice.setBase_face(old_anti_front_face); 
		
		//System.out.println("anti_righthand_face : "+ dice.getAnti_righthand_face());
	

		
	}

	public void roll_Left(){
		// Whenever a dice rolls left ...  
		// Its front and anti front face will remain same
		// Its anti-right face will be the base face
		// Its base face comes to as right face
		
		
		
		int old_right_face = dice.getRighthand_face();
		int old_base_face = dice.getBase_face();
		
		dice.setBase_face(dice.getAnti_righthand_face());
		dice.setRighthand_face(old_base_face);
		
		
		//System.out.println("anti_righthand_face : "+ dice.getAnti_righthand_face());
		
		
	}
	
	
		

	
}
