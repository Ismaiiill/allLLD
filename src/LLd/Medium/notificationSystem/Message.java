package src.LLd.Medium.notificationSystem;

import java.util.UUID;

public class Message {
    private final String msgId;
    private final String subject;
    private final String content;

    public Message(String subject, String content){
        this.msgId= UUID.randomUUID().toString();
        this.subject=subject;
        this.content=content;
    }
    public String getMsgId(){

    }

    @Override
    public String toString() {
        return "To: "+ msgId+ " | subject: "+ subject +
                "| Content: "+content;
    }
}
