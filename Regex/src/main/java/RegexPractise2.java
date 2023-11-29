import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractise2 {
    public static void main(String[] args) {
//        System.out.println("dog".matches(".*"));

        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
        Student\\sNumber:\\s(?<studentNum>\\d{10}).*
        Grade:\\s+(?<grade>\\d{1,2}).*
        Birthdate:\\s+(?<birthdateDay>\\d{2})/(?<birthdateMonth>\\d{2})/(?<birthdateYear>\\d{4}).*
        Gender:\\s+(?<gender>\\w).*
        State\\sID:\\s+(?<stateId>\\d+).*
        Weighted\\)\\s+(?<gpa>\\d+\\.\\w+)\\b.*
        Unweighted\\)\\s+(?<gpa2>\\d+\\.\\w+)\\b.*

        """;
        Pattern pat = Pattern.compile(regex , Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);

        if(mat.matches()){
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthdateDay"));
            System.out.println(mat.group("birthdateMonth"));
            System.out.println(mat.group("birthdateYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("gpa"));
            System.out.println(mat.group("gpa2"));

        }
    }
}
