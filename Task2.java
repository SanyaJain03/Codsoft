import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of Subjects");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        int totalmarks = 0;

        int i;
        for (i =0; i<numSubjects; i++)
        {   
            System.out.println("enter marks obtaioned in each subjects " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
            totalmarks += marks[i];
        }

        double averagePercentage = (double) totalmarks/(numSubjects * 100)*100;
        System.out.println("Your Result is here");
        System.out.println("Your Total Marks"+ totalmarks);
        System.out.println("Average Percentage"+ averagePercentage + "%");

        String grade= Calculate_Grade(averagePercentage);
        System.out.println("grade:"+ grade);

        sc.close();
}
public static String Calculate_Grade(double percentage)
{
    if(percentage >=90)
    {
        return "A+";
    }
    else if(percentage >=80)
    {
        return "A";
    }
    else if(percentage >=70)
    {
        return "B";
    }
    else if(percentage >=60)
    {
        return "C";
    }
    else if(percentage >=50)
    {
        return "D";
    }
    else
    {
        return "F";
    }
}
    
}