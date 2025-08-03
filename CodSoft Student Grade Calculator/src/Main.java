import java.util.Scanner;


public class Main {

   static double totals(int[] sub){
        int total = 0;

       for (int j : sub) {
           total += j;

       }
        return total;
    }


    static char grade(double avg){
        if(avg>=480 && avg<=500){
            return 'A';
        }
        else if(avg>=400 && avg<=479){
            return 'B';

        }
        else if(avg>=350 && avg<=399){
            return 'C';

        }
        else if(avg>=300 && avg<=349){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sub =new int[5];
        char grade;
        int total;
        double avg;
        System.out.println("Enter your marks out of 100 in Each of the five subjects:");
        for(int i=0;i<sub.length;i++){
            sub[i]=scan.nextInt();
        }
        total=(int)totals(sub);
        grade = grade(total);
        avg=total/(double)sub.length;

        System.out.println("------STUDENT MARKS------");
        System.out.println("Subject 1: "+sub[0] );
        System.out.println("Subject 2: "+sub[1] );
        System.out.println("Subject 3: "+sub[2] );
        System.out.println("Subject 4: "+sub[3] );
        System.out.println("Subject 5: "+sub[4] );
        System.out.println("Total Marks: "+total);
        System.out.println("average percentage: "+avg);
        System.out.println("Student Grade: "+grade);





        scan.close();
        }
    }
