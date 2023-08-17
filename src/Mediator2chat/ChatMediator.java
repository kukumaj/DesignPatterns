package Mediator2chat;

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user); // Add this method to the mediator interface
}
