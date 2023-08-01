package Observer;

import Observer.interfaces.Observer;
import Observer.model.EmailTopic;
import Observer.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observer to subjects
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //check for updates
        firstObserver.update();
        thirdObserver.update();
        //Provider / Subject (broadcaster)
        topic.postMessage("Hello Subscribers!");

        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscribers!");
    }

}
