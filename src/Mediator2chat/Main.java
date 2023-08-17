package Mediator2chat;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hi, everyone!");
        user2.sendMessage("Hey, Alice!");
        user3.sendMessage("Hello, everyone!");
    }
}
/*
Alice sends: Hi, everyone!
Bob receives: Hi, everyone!
Charlie receives: Hi, everyone!
Bob sends: Hey, Alice!
Alice receives: Hey, Alice!
Charlie receives: Hey, Alice!
Charlie sends: Hello, everyone!
Alice receives: Hello, everyone!
Bob receives: Hello, everyone!
*/