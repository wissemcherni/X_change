/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package x_change2;

import com.esprit.entities.commande;
import com.esprit.entities.livraison;
import com.esprit.entities.produit_echange;
import com.esprit.services.Service_commande;
import com.esprit.services.Service_livraison;
import com.esprit.services.Service_produit_echange;
import java.sql.Date;

/**
 *
 * @author wissem
 */
public class X_change2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Service_commande c1 =new Service_commande();
        //c1.ajouter(new commande("non_livre",1245,"test1","vente"));
        //Service_livraison sl1 = new Service_livraison();
        //String str="2023-03-31";  
    //Date date=Date.valueOf(str);//converting string into sql date   
        //sl1.ajouter(new livraison(1254,132145,date));
        // TODO code application logic here
        Service_produit_echange spe1 =new Service_produit_echange();
        spe1.ajouter(new produit_echange(1245,13455,"emeteur"));
    }
    
}
