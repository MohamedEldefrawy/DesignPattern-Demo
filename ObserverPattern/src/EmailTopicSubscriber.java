import contract.Observer;
import contract.Subject;

public class EmailTopicSubscriber implements Observer {
    private String message;
    private Subject topic;

    public EmailTopicSubscriber(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        String updatedMessage = (String) this.topic.getUpdate(this);
        if (updatedMessage == null)
            System.out.println(this.message);
        else {
            this.message = updatedMessage;
            System.out.println(this.message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
