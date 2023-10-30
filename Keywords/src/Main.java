public class Main {

    public static void main(String[] args)
    {

        finalRes( true ,500 , 20 , 5);

        finalRes( true ,800 , 40 , 8);

    }
    public static void finalRes( boolean gameOver, int score, int bonus, int level)
    {
        int finalScore = score;
        if(gameOver)
        {
            finalScore+= (level * bonus);
            finalScore+=1000;
            System.out.println("Final Score is: " + finalScore);
        }
    }
}
