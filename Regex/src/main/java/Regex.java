import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

        public static void main(String[] args) {
//        System.out.println("jat".matches("[^a-fA-F]at"));
//        System.out.println("123-123-1234".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println("123-123-1234".matches("\\d{3}-\\d{3}-\\d{4}"));
//        System.out.println("123-123-1234".matches("\\d{3}[-,]\\d{3}[-,]\\d{4}"));
//        System.out.println("123-  123-1234".matches("\\d{3}[-,\\s.]+\\d{3}[-,]\\d{4}"));
//        System.out.println("123123-1234".matches("\\d{3}[-,\\s.]*\\d{3}[-,]\\d{4}"));
//        System.out.println("123123-1234".matches("\\d{3}[-,\\s.]?\\d{3}[-,]\\d{4}"));
//            String regex = "(?:(\\d{1,3}).)?(?:(\\d{3,4})[-,\\s.]?)(?:(\\d{3,4})[-,\\s.]?)(\\d{4,})";
            String regex = """
                               ([(]?(?<countryCode>\\d{1,3}).[)]?)? #Gets Country Code
                               ((?<firstGroup>\\d{3,4})[-,\\s.]?)
                               ((?<secondGroup>\\d{3,4})[-,\\s.]?)
                               (?<forthGroup>\\d{4,})""";
            String string = "(002)243-243-12445";

            System.out.println(string.matches(regex ));

            Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
            Matcher mat = pat.matcher(string);

            if(mat.matches()){

                System.out.println(mat.group("countryCode"));
                System.out.println(mat.group("firstGroup"));
                System.out.println(mat.group("secondGroup"));
                System.out.println(mat.group("forthGroup"));
            }
        }
}

