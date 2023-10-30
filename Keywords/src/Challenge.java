public class Challenge {
    public static void main(String[] args) {

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
        System.out.print("the position of player" + userName + "is: " + position);

    }
}
