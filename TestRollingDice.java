package Chess_Dice;

import java.util.Scanner;

public class TestRollingDice {

	public static void main(String[] args) {
		
		System.out.print("Please provide the Size of the square bloacks (Row or Column number) : ");
		int N = new Scanner(System.in).nextInt();
		int M=0;
		int cells =  0;
		
		Dice dice = new Dice(6,2,3);
		RollDice rollingDice = new RollDice(dice); 
		
		M = M + dice.base_face;
		System.out.println("Start & Base Number " + dice.base_face + " Sum :"+ M);
		System.out.println("");
		
		
		for(int i=1; i<=N; i++){
			if(i%2 == 0){
				for(int j=N; j>=1; j--){
					cells ++;
					
					if(j>1){
						if( cells < N*N ){
							rollingDice.roll_Left();
							M = M + dice.base_face;
							System.out.println("Rolled Left From : "+ i+j + " Current Base Number " + dice.base_face + " Sum :"+ M);
						} 
					} else {
						if( cells < N*N ){
							rollingDice.roll_Forward();
							M = M + dice.base_face;
							System.out.println("Rolled Forward From : "+ i+j + " Current Base Number " + dice.base_face + " Sum :"+ M);
						} 
						
					}
				}

			} else {
				for(int j=1; j<=N; j++){
					cells++;
					
					if(j<N){
						if( cells < N*N ){
							rollingDice.roll_Right();
							M = M + dice.base_face;
							System.out.println("Rolled Right From: "+ i+j + " Current Base Number " + dice.base_face + " Sum :"+ M);
						} 
						
					}else{
						if( cells < N*N ){
							rollingDice.roll_Forward();
							M = M + dice.base_face;
							System.out.println("Rolled Forward From: "+ i+j + " Current  Base Number " + dice.base_face + " Sum :"+ M);
						} 
							
					}
				}
			}
		}
		
		System.out.print("Total Sum : " + M);
		
		

	}

}
