package Adapter.interfaces;

import Adapter.model.Volt;

public interface SocketAdapter {
    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volts();
}
