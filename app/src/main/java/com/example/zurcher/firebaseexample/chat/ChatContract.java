package com.example.zurcher.firebaseexample.chat;

import com.example.zurcher.firebaseexample.chat.model.ChatMessage;

import java.util.ArrayList;

/**
 * Created by zurcher on 27/10/16.
 */
public interface ChatContract {

    interface View {
        void refreshCurrentChatList(ArrayList<ChatMessage> currentChatMessage);

        void closeChat();
    }

    interface Presenter {
        void sendNewMessage(ChatMessage message);

        void refreshCurrentChatList(ArrayList<ChatMessage> currentChatMessage);

        void signOut();
    }
}
