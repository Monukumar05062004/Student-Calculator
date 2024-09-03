import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int math,science,english,history,hindi;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your mark in five subject");
        math=s.nextInt();
        science=s.nextInt();
        english=s.nextInt();
        history=s.nextInt();
        hindi=s.nextInt();
        int totalMark=math+science+english+history+hindi;
        float averagePercentage=totalMark/5f;
        if(averagePercentage>90.0&&averagePercentage<=100.0){
            System.out.println("Your grade is A");
        }
        else if(averagePercentage>80.0&&averagePercentage<=90.0){
            System.out.println("Your grade is B");
        }
        else if(averagePercentage>70&&averagePercentage<=80.0){
            System.out.println("Your grade is C");
        }
        else if(averagePercentage>60.0&&averagePercentage<=70.0){
            System.out.println("Your grade is D");
        }
        else if(averagePercentage>50&&averagePercentage<=60.0){
            System.out.println("Your grade is E");
        }
       else  if(averagePercentage<=50){
            System.out.println("Your grade is F");
        }
    }
}
