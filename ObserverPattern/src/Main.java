import contract.Observer;
import contract.Subject;
import model.EmailTopic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer observer = new EmailTopicSubscriber("Hello from email subscriber 1");
        Observer observer2 = new EmailTopicSubscriber("Hello from email subscriber 2");
        EmailTopic emailTopic = new EmailTopic(List.of(observer, observer2));
        observer.setSubject(emailTopic);
        observer2.setSubject(emailTopic);

        System.out.println("Before emitting");
        observer.update();
        observer2.update();

        emailTopic.postMessage("Hello from your Email Topic");
    }
}