import java.util.Scanner;

public class InputConsoleScanner {
    public static void main(String[] args) {

        try {
            System.out.println(getFromConsole(2023));

        } catch (NullPointerException e) {
            System.out.println(getFromScanner(2023));
        }
    }

    public static String getFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi , What's Your Name: ");
        String ageDate = System.console().readLine("welcome " + name +"! \n What's Your Birthday"  );

        int age = currentYear - Integer.parseInt(ageDate);

        return "Hey " + name + "Your age is: " + age ;


    }
    public static String getFromScanner(int currentYear)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi , What's Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name +  ", Thanks for taking Course ");
        System.out.println("What's Your Birthday: ");
        int birthday = Integer.parseInt(scanner.nextLine());

        int age = currentYear - birthday;

        return "Your Age is:  "+age +" !";


    }
}

