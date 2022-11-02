import contract.Observer;
import contract.Subject;
import model.EmailTopic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create subscribers
        Observer observer = new EmailTopicSubscriber("Hello from email subscriber 1");
        Observer observer2 = new EmailTopicSubscriber("Hello from email subscriber 2");

        // Create Subject with initial registered subscribers
        EmailTopic emailTopic = new EmailTopic(List.of(observer, observer2));

        // set subscribers subject to update their message from subject after emitting message
        observer.setSubject(emailTopic);
        observer2.setSubject(emailTopic);

        // check values of subscribers before emitting
        System.out.println("Before emitting");
        observer.update();
        observer2.update();

        // values of subscribers will automatically update after emitting new message
        emailTopic.postMessage("Hello from your Email Topic");
    }
}