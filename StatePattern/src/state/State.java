package state;

public interface State {
    void insertDollar();

    void ejectDollar();

    void selectSoda();

    int dispense();
}
