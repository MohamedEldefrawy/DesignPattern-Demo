package contract;

import model.Volt;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get4Volt();
}
