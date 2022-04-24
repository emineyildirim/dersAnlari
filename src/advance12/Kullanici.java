package advance12;

import java.time.LocalDateTime;
public class Kullanici {
    String isim;
    LocalDateTime kayitZamani;

    public Kullanici() {
    }
    public Kullanici(String isim, LocalDateTime kayitZamani) {
        this.isim = isim;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "\nisim='" + isim + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
