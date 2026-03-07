package src.LLd.Medium.Cricbuzz;

public class User implements Observer {
    private String name;

    public User (String name){
        this.name=name;
    }

    @Override
    public void update(Match match) {
        System.out.println(match.getDetails());
    }
}
