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
        double dochod = 0;
        for (Stolik stolik : kelnerkiZeStolikami.values()) {
            dochod += stolik.cenaZamowien;
        }

        return dochod;
    }

    public double pobierzDochodKelnerki(String imie) {
        return this.kelnerkiZeStolikami.get(new Kelnerka(imie)).cenaZamowien;
    }
}
