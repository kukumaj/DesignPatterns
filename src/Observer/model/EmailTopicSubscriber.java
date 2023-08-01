package Observer.model;

import Observer.interfaces.Observer;
import Observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    //Reference to our subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " No new messages on this topic!");
        } else {
            System.out.println(name + " Retriving message " + msg);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
