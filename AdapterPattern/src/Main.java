import contract.SocketAdapter;
import model.Volt;

public class Main {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImp();
        var volt = getVolt(socketAdapter,12);
        System.out.println(volt.getVolts());
    }

    public static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 12 -> {
                return socketAdapter.get12Volt();
            }
            case 4 -> {
                return socketAdapter.get4Volt();

            }
            default -> {
                return socketAdapter.get120Volt();
            }
        }
    }
}