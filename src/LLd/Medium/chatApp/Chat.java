package src.LLd.Medium.chatApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Chat {
    private UUID chatId;
    private List<User> participants;
    private List<Messege> messegesList;

    public UUID getChatId() {
        return chatId;
    }

    public void setChatId(UUID chatId) {
        this.chatId = chatId;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public List<Messege> getMessegesList() {
        return messegesList;
    }

    public void setMessegesList(List<Messege> messegesList) {
        this.messegesList = messegesList;
    }

    public Chat(){
        this.chatId= UUID.randomUUID();
        this.participants=new ArrayList<>();
        this.messegesList=new ArrayList<>();
    }

    public void printHistory(){
        System.out.println(" --chat history ( " + chatId+ ":- ) ---") ;
        for (Messege m:messegesList){
            System.out.println(m.getMessageContain()+" \n");

        }
        System.out.println("---end of the history");
    }

    public void sendSMS(Messege messege){
        this.messegesList.add(messege);

    }

    public void addParticipants(User user){
        this.participants.add(user);
        System.out.println(user.getUserId()+" is added in the pull sms");

    }
}
