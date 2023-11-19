//program to genrate a random integer//

import java.util.*;
public class Randominteger
{
    public static void main (String[] args) {
    int rndmno,userno;
    int lives=3,score=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("---menu---");
    System.out.println("1.play\n2.Quit");
    System.out.println("choose only 1 or 2 options");
    // while(lives-->0){
    int op;
    op=sc.nextInt();
    while(lives-->0){
    switch(op){
     case 1:System.out.println("Generating random number from 1 to 100....");
            rndmno=(int)(Math.random()*100+1);//to genrate randomm number from 1 to 100.
            System.out.println("--------------------");
            System.out.println("Random number generated");
            System.out.println("-----------------------");
            System.out.println("Enter a number between 1 to 100:");
            //using a switch casse for a menu driven program..to guess the number.
            userno = sc.nextInt();
            if(userno<rndmno){
                System.out.println("entered number is too less.");
            }
            else if(userno==rndmno){
                score+=5;
                System.out.println("You guessed right both are same :)");
            }
            else{
                System.out.println("entered number is too high.");
            }
            break;
    case 2: System.out.println("\\THANK U VISIT AGAIN//");
            break;
    default:System.out.println("Enter only according to ---menu---");
            break;
    }
    }
    System.out.println("your lives have been completed and the score is"+" "+score);
}
}
