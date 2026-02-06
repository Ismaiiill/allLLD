package src.LLd.Medium.chatApp;

import jdk.jfr.Timestamp;

import java.time.LocalDateTime;
import java.util.UUID;

public class Messege {
    private UUID messageId;

    @Timestamp
    private LocalDateTime messageTime;

    private User sender;
    private String messageContain;

    public Messege(User sender, String messageContain){
        this.messageContain=messageContain;
        this.sender=sender;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
    public UUID getMessageId() {
        return messageId;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }

    public String getMessageContain() {
        return messageContain;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public void setMessageTime(LocalDateTime messageTime) {
        this.messageTime = messageTime;
    }

    public void setMessageContain(String messageContain) {
        this.messageContain = messageContain;
    }
}
