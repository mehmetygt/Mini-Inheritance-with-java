
/**
 *
 * @author Mehmet
 */
public class yazilimci extends Calisan{
    private  String dilller;

    public yazilimci(String dilller, String ad, String soyad, int id) {
        super(ad, soyad, id);
        this.dilller = dilller;
    }
public void formatAt(String isletim_sistemi){
    System.out.println(getAd()+", "+isletim_sistemi+" işletim sisteminini yüklüyor.");


}
    @Override
    public void bilgi_goster() {
        super.bilgi_goster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yazılımcının bildiği dilller : "+dilller);
        
    }
    
    
}
