import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Adventure("Inception");
//        movie.watchMovie();
        Scanner s = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter 'A' for Adventure , " +
                    "'C' for comedy , 'S' for Science Fiction " +
                    "'Q' for quite App: ");
           String type =  s.nextLine();
           if("Qq".contains(type))
           {
               break;
           }
           System.out.print("Enter Movie Name: ");
           String name = s.nextLine();

           Movie movie = Movie.getMovie(type , name);
           movie.watchMovie();
        }
    }

}
