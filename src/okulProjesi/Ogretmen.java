package okulProjesi;

public class Ogretmen extends Kisi {
    private String brans;
    private String sicilNo;

    public Ogretmen()
    {

    }

    public Ogretmen(String isimSoyisim, String tckNo, int yas, String brans, String sicilNo) {
        super(isimSoyisim, tckNo, yas);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }


    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return ("\nisimSoyisim: "+getIsimSoyisim()+"\ntckNo: "+getTckNo()+"\nyas: "+getYas()+"\nbrans: "+brans+"\nsicilNo: "+sicilNo);
    }
}
