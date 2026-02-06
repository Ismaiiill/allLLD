package src.LLd.Medium.chatApp;

public class OnetoOne extends Chat{

    public OnetoOne(User p1, User p2){
        super();
        addParticipants(p1);
        addParticipants(p2);
    }
    @Override
    public void addParticipants(User user){
        if(getParticipants().size()>=2){
            throw new IllegalStateException("OnetoOne chat have only 2 participants");
        }
        if(!getParticipants().contains(user)){
            getParticipants().add(user);
        }
    }
}
