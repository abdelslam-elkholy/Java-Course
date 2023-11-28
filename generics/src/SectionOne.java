import java.util.ArrayList;
import java.util.List;

public class SectionOne {
}

record BaseballePlayer(String name , String position) {}
class BaseballTeam {
    private String teamName;
    private List<BaseballePlayer> teamMembers = new ArrayList<BaseballePlayer>();
    private int totalWins=  0;
    private int totalLoss =0;
    private int totalTries=0;


    public BaseballTeam(String teamName)
    {
        this.teamName=teamName;
    }

    public void addTeamMember(BaseballePlayer player)
    {
        if (!teamMembers.contains(player))
        {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster");
        System.out.println(teamMembers);
    }

    public int ranking()
    {
        return (totalLoss * 2) + totalTries + 1;
    }

    public String setScore(int ou)
}