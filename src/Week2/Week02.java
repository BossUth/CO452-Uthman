package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock 22");
        System.out.println();

        
        System.out.println(" by Nicholas Day and Derek Peacock 22");

        double total = 0;
        int count = 0;
        while( count <= 3)
        {
            total = total + InputReader.getDouble("Enter number : ");
            count++;
        }

        double average = total / (count+1);

        System.out.println("The average is " + average);
    }     
}
