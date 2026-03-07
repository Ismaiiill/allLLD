package src.LLd.Medium.Cricbuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ata holo manager or singleton service
public class ScoreServiceOrCricbuzz {
    private static ScoreServiceOrCricbuzz instance=null;
    private Map<String ,Match> matches=new HashMap<>();
    private ScoreServiceOrCricbuzz() {
    }

    public  static ScoreServiceOrCricbuzz getInstance(){
        if(instance==null) {
            synchronized (ScoreServiceOrCricbuzz.class) {
                if (instance==null){
                    instance = new ScoreServiceOrCricbuzz();
                }

            }
        }
        return instance;
    }

    //add match
    public void addMatch(Match match){
        matches.put(match.getDetails().split(":")[0], match);
    }

    //get one match
    public Match getMatch(String id){
        return matches.get(id);
    }

    //list of matches
    public List<Match> listMatches(){
        return new ArrayList<>(matches.values());
    }

    //remove matches
    public void removeMatch(String id){
        matches.remove(id);
        //ekhane amra direct match pass kore o delete korate pari
    }

    //simulate update for one particular match
    public void updateOneMatch(String id, int scoreA, int scoreB){
        Match match=getMatch(id);
        if(match!=null){
            match.updateScore(scoreA,scoreB   );
        }
    }

}
