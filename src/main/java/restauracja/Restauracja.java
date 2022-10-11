package restauracja;

import java.util.HashMap;
import java.util.Map;

public class Restauracja {
    Map<Kelnerka, Stolik> kelnerkiZeStolikami;

    public Restauracja() {
        this.kelnerkiZeStolikami = new HashMap<>();
    }

    public void ustawKelnerkeIStolik(Kelnerka kelnerka, Stolik stolik) {
        this.kelnerkiZeStolikami.put(kelnerka, stolik);
    }

    public double pobierzCalkowityDochod(){
        return 0;
    }

    public double pobierzDochodKelnerki(String imie) {
        return 0;
    }
}
