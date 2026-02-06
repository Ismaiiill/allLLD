package src.LLd.Medium.chatApp;

import java.util.ArrayList;
import java.util.List;

public class GroupChat extends Chat{
    private String groupName;
    List<User> admins;
    public GroupChat(String groupName, User creator){
        super();
        this.groupName=groupName;
        this.admins=new ArrayList<>();
        admins.add(creator);
    }

    @Override
    public void addParticipants(User user){
        if(!getParticipants().contains(user)){
            getParticipants().add(user);
        }
    }
    public String getGroupName(){
        return this.groupName;
    }
}
