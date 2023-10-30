public class Challenge {
    public static void main(String[] args) {

        int position1 = getPosition(1500);
        int position2 = getPosition(1000);
        int position3 = getPosition(500);
        int position4 = getPosition(100);
        int position5 = getPosition(25);

        displayScore("ahmed", position1);
        displayScore("Mohammed", position2);
        displayScore("adam", position3);
        displayScore("Rana", position4);
        displayScore("Hana", position5);

        System.out.print(areEqualByThreeDecimalPlaces(3.7561 , 3.756));
    }

    public static int getPosition(int score)
    {
        if(score >= 1000) return 1;
        else if (score >=500) {
            return  2;
            
        } else if (score >= 100) {
            return 3;
        }
        else return 4;
    }

    public static void displayScore(String userName , int position )
    {
        System.out.println("the position of player " + userName + " is: " + position);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1 , double num2)
    {
        System.out.println((long)(num1*1000) +" *** " +  (long)(num2*1000));
        return (long)(num1*1000)==(long)(num2*1000);
    }
}
