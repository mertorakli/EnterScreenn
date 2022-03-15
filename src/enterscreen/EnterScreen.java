/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterscreen;

import java.util.Scanner;

/**
 *
 * @author mertorakli
 */
public class EnterScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    String userName, password, c1,np;
    
       System.out.print("Kullanıcı adını giriniz: ");
            userName = inp.nextLine();
       System.out.print("Şifrenizi giriniz: ");
            password = inp.nextLine();
            
            if (userName.equals("patika")&& password.equals("java123")) {
                System.out.println("Giriş Yaptınız");
                
          }
            else {
                System.out.println("Hatalı Giriş Yaptınız");
                System.out.print("Şifrenizi sıfırlamak ister misiniz?: ");
                c1 = inp.nextLine();
                if (c1.equals("evet")) {
                    System.out.println("Yeni Şifrenizi giriniz");
                    np = inp.nextLine();
                    if (np.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    
                            
                       }    
                    
                    else {
                        System.out.println("Şifreniz Oluşturuldu");
                    }
                   
                    
                
            }
            
                        
                        
            }
            
    
   
    }
    
}
