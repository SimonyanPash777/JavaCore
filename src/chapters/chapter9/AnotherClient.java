package chapters.chapter9;

import javax.security.auth.callback.Callback;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("another option method callback()");
        System.out.println("p equols" + (p*p));
    }
}
