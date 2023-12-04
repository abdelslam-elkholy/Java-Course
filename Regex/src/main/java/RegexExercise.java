import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {
    public static void main(String[] args) {
        String regex = "(?<name>[DbL]ark)";
        String st1 = "Dark";
        String st5 = "bark";
        String st2 = "Lark";
        String st3 = "hark";
        String st4 = "jark";

        Pattern pat = Pattern.compile(regex);
        Matcher mat1 = pat.matcher(st1);
        Matcher mat2 = pat.matcher(st2);
        Matcher mat3 = pat.matcher(st3);
        Matcher mat4 = pat.matcher(st4);
        Matcher mat5 = pat.matcher(st5);

        if(mat1.matches())
        {
            System.out.println(mat1.group("name"));
        }
        else {
            System.out.println("Didn't match");
        }
        if(mat2.matches())
        {
            System.out.println(mat2.group("name"));
        }
        else {
            System.out.println("Didn't match");
        }
        if(mat3.matches())
        {
            System.out.println(mat3.group("name"));
        }
        else {
            System.out.println("Didn't match");
        }
        if(mat4.matches())
        {
            System.out.println(mat4.group("name"));
        }
        else {
            System.out.println("Didn't match");
        }
        if(mat5.matches())
        {
            System.out.println(mat5.group("name"));
        }
        else {
            System.out.println("Didn't match");
        }



    }
}
