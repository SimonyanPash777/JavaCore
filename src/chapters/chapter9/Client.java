package chapters.chapter9;

import javax.security.auth.callback.Callback;

public class Client implements Callback {

    public void callback(int p) {
        System.out.println("Method callback() " + p);
    }

    void nonIfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы," + "могут определ ятьсяи другие члены.");
    }
}
