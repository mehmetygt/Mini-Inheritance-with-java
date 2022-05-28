
/**
 *
 * @author Mehmet
 */
public class Yonetici extends Calisan{
    private int sorumlu_sayısı;
 
    public Yonetici(String ad, String soyad, int id,int sorumlu_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_sayısı = sorumlu_sayısı;
    }

    @Override
    public void bilgi_goster() {
        super.bilgi_goster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yöneticinin sorumlu olduğu personel sayısı : "+sorumlu_sayısı);
    }
    public void zamyap(int zam){
        System.out.println(getAd()+" çalışanlara "+zam+" kadar zama yapıyor ");}
}
