package com.example.spartan.websocket;


public class ChatMessage {

    private String body;
    private boolean isMine;// Did I send the message(In case of receive this would be false)

    public ChatMessage( String messageString, boolean isMINE) {
        body = messageString;
        isMine = isMINE;
    }


    public String getBody() {
        return body;
    }
    public boolean isMine() {
        return isMine;
    }
}
