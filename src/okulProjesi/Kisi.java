package okulProjesi;

public class Kisi {
    private String isimSoyisim;
    private String tckNo;
    private int yas;

    public Kisi(String isimSoyisim, String tckNo, int yas) {
        this.isimSoyisim = isimSoyisim;
        this.tckNo = tckNo;
        this.yas = yas;
    }
    public Kisi()
    {

    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getTckNo() {
        return tckNo;
    }

    public void setTckNo(String tckNo) {
        this.tckNo = tckNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
