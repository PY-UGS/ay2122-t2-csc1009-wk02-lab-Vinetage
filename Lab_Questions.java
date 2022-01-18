import java.util.Scanner;

public class Lab_Questions
{

    public static void main (String[] args)
    {
        //Declare scanner to scan for user input
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter 1 - Question 1");
            System.out.println("Enter 2 - Question 2");
            System.out.println("Enter 3 - Question 3");
            System.out.println("Enter 4 - Question 4");
            System.out.println("Enter 0 - Exit");
            System.out.print("Enter number: ");
            int userChoice = input.nextInt();
            if(userChoice <= 0)
                break;
            //Run all Lab question here
            switch (userChoice)
            {
                case 1:
                    Question_01(input);
                    break;
                case 2:
                    Question_02(input);
                    break;
                case 3:
                    Question_03(input);
                    break;
                case 4:
                    Question_04(input);
                    break;
                default:
                    break;
            }
        }

    }

    //Lab Question 1
    private static void Question_01(Scanner input)
    {
        //Float radius
        float radius;
        //Ask user for radius input
        System.out.print("Enter a float value: ");
        radius = input.nextFloat();
        //Calculate and print out area of circle
        System.out.println("The area for the circle of radius " + radius + " is " + (radius * radius * Math.PI));
    }

    //Lab Question 2
    private static void Question_02(Scanner input)
    {
        //Declare 3 float numbers
        float x,y,z;
        System.out.print("Enter three numbers: ");
        x = input.nextFloat();
        y = input.nextFloat();
        z = input.nextFloat();

        System.out.println("The avarage of " + x + " " + y + " " + z + " is " + (x+y+z)/3);
    }

    //Lab Question 3
    private static void Question_03(Scanner input)
    {
        //Get milli seconds since Jan 1 1970
        long milliSeconds = System.currentTimeMillis();

        //Get total seconds
        long totalSeconds = milliSeconds / 1000;
        //Get Current seconds
        long currentSecond = totalSeconds % 60;

        //Get total minutes
        long totalMinutes = totalSeconds / 60;
        //Get current Minutes
        long currentMinute = totalMinutes % 60;

        //Get total hours
        long totalHours = totalMinutes / 60;
        //Get current hours
        long currentHour = totalHours % 24;

        //Print time to screen
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

    //Lab Question 4
    private static void Question_04(Scanner input)
    {
        int year;
        System.out.print("Enter a year: ");
        year = input.nextInt();

        switch (year%12)
        {
            case 0:
                System.out.println("Year of the Monkey");
                break;
            case 1:
                System.out.println("Year of the Rooster");
                break;
            case 2:
                System.out.println("Year of the Dog");
                break;
            case 3:
                System.out.println("Year of the Pig");
                break;
            case 4:
                System.out.println("Year of the Rat");
                break;
            case 5:
                System.out.println("Year of the Ox");
                break;
            case 6:
                System.out.println("Year of the Tiger");
                break;
            case 7:
                System.out.println("Year of the Rabbit");
                break;
            case 8:
                System.out.println("Year of the Dragon");
                break;
            case 9:
                System.out.println("Year of the Snake");
                break;
            case 10:
                System.out.println("Year of the Horse");
                break;
            case 11:
                System.out.println("Year of the Sheep");
                break;
            default:
                System.out.println("Whut");
                break;
        }
    }
}
