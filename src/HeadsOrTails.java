import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HeadsOrTails {
	
	public static void main (String[] args) {
		System.out.println("Welcome! Please make a selection: 1 for Heads or 2 for Tails");
		Scanner input = new Scanner (System.in);
		
		int headsOrTailsGuess = input.nextInt();
		
			if(headsOrTailsGuess ==1 || headsOrTailsGuess ==2) {
				System.out.println("Wonderful!! How many attempts are we going to try?");
				int numberOfFlips = input.nextInt(); 
				System.out.println("Lets begine!");
				
				int flips = 0;
				int heads = 0;
				int tails = 0;
				
				while(flips < numberOfFlips) {
					int gen = ThreadLocalRandom.current().nextInt();
					if(gen % 2 == 0){
						System.out.println("...Heads");
						heads++;	
						flips++;
						}else {
						System.out.println("...Tails");
						tails++;
						flips++;
						}
					}
				
				float correctCountHeads= ((float)heads / numberOfFlips)*100;
				float correctCountTails= ((float)tails / numberOfFlips)*100;
				
				System.out.println("Let's see, it landed on Heads " +heads+ " times, and landed on Tails " +tails+ " times!");
				if( headsOrTailsGuess == 1) {
					System.out.print("Your guess of Heads was correct " +math.round(correctCountHeads)+ "%");
				}else {
					System.out.print("Your guess of Tails was correct " +math.round(correctCountTails)+ "%");
					
				}
			}else {
			main(args);
		}	
	}	
}
