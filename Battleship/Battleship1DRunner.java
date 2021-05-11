
/**
 * The user side of Battleship
 *
 * Declan DeYoung
 * 5/5/21
 */
import java.util.Scanner;
public class Battleship1DRunner
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Battleship!");
        Battleship1D game = new Battleship1D();
        game.randomShip();
        boolean[] sea = game.getSea();
        boolean[] open = new boolean[7];
        for(int i = 0; i < 7; i++){
            open[i] = true;
        }
        int shotCounter = 0;
        int hitCounter = 0;
        System.out.print("A new ship has been made. Please pick a number between 1 and 7 to shoot. ");
        while(hitCounter < 3){
            int shot = input.nextInt();
            System.out.println();
            if(shot < 1 || shot > 7){
                System.out.print("You must pick a number between 1 and 7. ");
            }
            else if(sea[shot-1] && open[shot-1]){
                hitCounter++;
                shotCounter++;
                open[shot-1] = false;
                if(hitCounter != 3){
                    System.out.print("You got a hit! Please shoot a different spot. ");
                }
            }
            else if (!sea[shot-1] && open[shot-1]){
                shotCounter++;
                open[shot-1] = false;
                System.out.print("You missed. Try shooting a different spot. ");
            }
            else if (!open[shot-1]){
                System.out.print("You already shot there. Pick a different spot. ");
            }
        }
        System.out.println("You sunk the battleship!");
        System.out.print("You shot " + shotCounter + " different places. ");
        double percentHit = ((double)((int)(((3/(double)shotCounter)*1000)+.5)))/10;
        System.out.println("That means that you hit a shot in " + percentHit + "% of places.");
    }
}