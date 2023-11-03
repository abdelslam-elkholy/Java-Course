public class InputConsoleScanner {
    public static void main(String[] args) {

        try {
            System.out.println(getFromConsole(2023));

        } catch (NullPointerException e) {

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

    }
}

