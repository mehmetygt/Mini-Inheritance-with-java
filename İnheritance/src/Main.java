
import java.util.Scanner;



/**
 *
 * @author Mehmet
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına Hoşgeldiniz.");
        
        String islemler="İŞLEMLER\n"
                +"1. Yazılımcı işlemleri\n"
                +"2. Yönetici ilemleri\n"
                +"Çıkış için Q'ya basın";
        System.out.println("**************");
        
        System.out.println(islemler);
        
        System.out.println("**************");
        while (true) {
            System.out.println("İşlem seçiniz");
            String islem=scanner.nextLine();
             if (islem.equals("Q")) {
                 System.out.println("Programdan çıkılıyor");
                 
                
            }else if (islem.equals("1")) {
                
                 yazilimci yazilimci1=new yazilimci("java,python,c", "mehmet", "yiğit", 123);
                 String yazilimci_islemler="Yazılımcı İşlemleri\n"
                                           +"1. format at\n"
                                           +"2. bilgileri göster \n"
                                           +"Çıkış için Q'ya basın";
                 System.out.println(yazilimci_islemler);
                 while (true) {    
                      System.out.println("İşlem seçiniz");
                           String yazilimci_islem=scanner.nextLine();
                           if (yazilimci_islem.equals("Q")) {
                 System.out.println("Yazılımcı işlemlerinden  çıkılıyor");
                 break;
                 
                         }else if (yazilimci_islem.equals("1")) {
                               System.out.print("işletim sistem :");
                             String isletim_sistemi=scanner.nextLine();
                         yazilimci1.formatAt(isletim_sistemi);

                    }else if (yazilimci_islem.equals("2")) {
                         yazilimci1.bilgi_goster();

                    }
                    else{ System.out.println("Geçersiz yazılımcı işlemi.");}
                 }
                
            }
            else if (islem.equals("2")){
            Yonetici yonetici1=new Yonetici( "ahmet", "yiğit", 321,40);
              String yonetici_islemler="Yönetici İşlemleri\n"
                                           +"1. zam yap\n"
                                           +"2. bilgileri göster \n"
                                           +"Çıkış için Q'ya basın";
                 System.out.println(yonetici_islemler);
                 while (true) {    
                      System.out.println("İşlem seçiniz");
                           String yonetici_islem=scanner.nextLine();
                           if (yonetici_islem.equals("Q")) {
                 System.out.println("Yönetici işlemlerinden çıkılıyor");
                 break;
                 
                         }else if (yonetici_islem.equals("1")) {
                               System.out.println("ne kadar zam yapılsın?");
                             int zam=scanner.nextInt();
                             scanner.nextLine();
                        yonetici1.zamyap(zam);

                    }else if (yonetici_islem.equals("2")) {
                         yonetici1.bilgi_goster();

                    }
                    else{ System.out.println("Geçersiz yönetici işlemi.");}
                 }
            
            
            }
            else{System.out.println("geçersiz işlem");
            }
            
        }
        
        
        
        
        
        
    }
    
}
