import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {
    public static void main(String[] args) {
        String regex = "(?<name>([DbL]|st)ark)";

        String st1 = "Dark";
        String st5 = "bark";
        String st2 = "Lark";
        String st3 = "stark";
        String st4 = "jark";

        Pattern pat = Pattern.compile(regex);
        Matcher mat1 = pat.matcher(st1);
        Matcher mat2 = pat.matcher(st2);
        Matcher mat3 = pat.matcher(st3);
        Matcher mat4 = pat.matcher(st4);
        Matcher mat5 = pat.matcher(st5);



        String regex2 = "A([bg]ra)cada\\1";
        String st6 = "Abracadabra";
        String st7 = "Agracadagra";
        String st8 = "Abracadagra";
        String st9 = "Agracadabra";

        Pattern pat2 = Pattern.compile(regex2);
        Matcher mat6 = pat2.matcher(st9);


        String mailRegex = "\\w+\\.\\w+@[a-zA-Z]{3,15}\\.(com|net)";
        String st10 ="abd.edj@ggdd.com";

//        Pattern mailPat = Pattern.compile(mailRegex);
//        Matcher mailMat = mailPat.matcher(st10);
        System.out.println(st10.matches(mailRegex));

        if (mat6.matches())
        {
            System.out.println(mat6.group());
        }
        else {
            System.out.println("Abracadabra regex doesnt match");
        }
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
