package okulProjesi;

public class Ogrenci extends Kisi {
    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String isimSoyisim, String tckNo, int yas, String ogrenciNo, String sinif) {
        super(isimSoyisim, tckNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return ("\nisimSoyisim: "+getIsimSoyisim()+"\ntckNo: "+getTckNo()+"\nyas: "+getYas()+"\nsinif: "+sinif+"\nogrnNo: "+ogrenciNo);
    }
}
