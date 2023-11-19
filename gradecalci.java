// TASK2
 
import java.util.Scanner;

public class gradecalci {
    public static void main(String[] args) {
        float totalmks=0;
        System.out.println("----WELCOME TO GRADE CALCULATOR----");
          System.out.println("enter the number of subjects:");
          Scanner sc=new Scanner(System.in);
          int subject= sc.nextInt();
          for(int i=1;i<=subject;i++){
            System.out.println("enter the marks of "+i+" subject out of 100 : ");
            float marks=sc.nextFloat();
            totalmks=(totalmks+marks);
          }
          float avgpercent=0;
          avgpercent= (float)(totalmks/subject);
          System.out.println("The Total Marks and Average Percentage acheived are: "+totalmks+" "+avgpercent+"%");
          if(avgpercent>=85){
            System.out.println("You got an A+ grade.");
          }
          else if((avgpercent>=70)&&(avgpercent<85)){
            System.out.println("You got an A grade.");
          }
          else if((avgpercent>55)&&(avgpercent<70)){
            System.out.println("You got a B grade.");
          }
          else if((avgpercent>40)&&(avgpercent<=55)){
            System.out.println("You got a C grade.");
          }
          else {
            System.out.println("You scored less than 40%...");
            System.out.println("hence you have failed the test.");
          }
        }
}
