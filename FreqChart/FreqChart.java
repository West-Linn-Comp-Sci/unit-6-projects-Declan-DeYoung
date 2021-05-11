
/**
 * Counts the amount of numbers in different 10 number intervals between 1 and 100 based on user input
 *
 * Declan DeYoung
 * 4/28/21
 */
import java.util.Scanner;
public class FreqChart
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String go = "y";
        int n = 1000000;
        int[] nums = new int[n];
        System.out.print("Please input the first number here (the number must be between 1 and 100): ");
        for(int in = 0; !go.equals("n"); in++){
            int i = input.nextInt();
            System.out.println();
            if(i > 1 && i < 100){
                nums[in] = i;
                System.out.print("Would you like to input another number (y or n)? ");
                go = input.next();
            }
            else{
                System.out.println("The number must be between 1 and 100");
            }
            while(!go.equals("y") && !go.equals("n")){
                System.out.print("You must enter y to continue entering numbers, or n to see the results. ");
                go = input.next();
            }
            System.out.println();
            if(go.equals("y")){
                    System.out.print("Please input another number: ");
                }
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        for(int num : nums){
            if(num>0 && num<11){
                count1++;
            }
            else if(num>10 && num<21){
                count2++;
            }
            else if(num>20 && num<31){
                count3++;
            }
            else if(num>30 && num<41){
                count4++;
            }
            else if(num>40 && num<51){
                count5++;
            }
            else if(num>50 && num<61){
                count6++;
            }
            else if(num>60 && num<71){
                count7++;
            }
            else if(num>70 && num<81){
                count8++;
            }
            else if(num>80 && num<91){
                count9++;
            }
            else if(num>90 && num<101){
                count10++;
            }
        }
        String ast1 = "";
        String ast2 = "";
        String ast3 = "";
        String ast4 = "";
        String ast5 = "";
        String ast6 = "";
        String ast7 = "";
        String ast8 = "";
        String ast9 = "";
        String ast10 = "";
        for(int i1 = 0; i1 < count1; i1++){
            ast1 = ast1 + "*";
        }
        for(int i2 = 0; i2 < count2; i2++){
            ast2 = ast2 + "*";
        }
        for(int i3 = 0; i3 < count3; i3++){
            ast3 = ast3 + "*";
        }
        for(int i4 = 0; i4 < count4; i4++){
            ast4 = ast4 + "*";
        }
        for(int i5 = 0; i5 < count5; i5++){
            ast5 = ast5 + "*";
        }
        for(int i6 = 0; i6 < count6; i6++){
            ast6 = ast6 + "*";
        }
        for(int i7 = 0; i7 < count7; i7++){
            ast7 = ast7 + "*";
        }
        for(int i8 = 0; i8 < count8; i8++){
            ast8 = ast8 + "*";
        }
        for(int i9 = 0; i9 < count9; i9++){
            ast9 = ast9 + "*";
        }
        for(int i10 = 0; i10 < count10; i10++){
            ast10 = ast10 + "*";
        }
        System.out.println("1 - 10: "+ast1);
        System.out.println("11 - 20: "+ast2);
        System.out.println("21 - 30: "+ast3);
        System.out.println("31 - 40: "+ast4);
        System.out.println("41 - 50: "+ast5);
        System.out.println("51 - 60: "+ast6);
        System.out.println("61 - 70: "+ast7);
        System.out.println("71 - 80: "+ast8);
        System.out.println("81 - 90: "+ast9);
        System.out.println("91 - 100: "+ast10);
    }
}
