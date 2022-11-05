import contract.SocketAdapter;
import model.Socket;
import model.Volt;

public class SocketAdapterImp extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return convert(getVolt(), 1);
    }

    @Override
    public Volt get12Volt() {
        return convert(getVolt(), 10);
    }

    @Override
    public Volt get4Volt() {
        return convert(getVolt(), 30);
    }

    private Volt convert(Volt volt, int factor) {
        return new Volt(volt.getVolts() / factor);
    }
}
