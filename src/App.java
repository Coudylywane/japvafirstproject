import java.util.Scanner;

import models.Chambre;
import models.EtatChambre;
import services.ServiceList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ServiceList service = new ServiceList();

        int choix ;
        Chambre chambre ;
        int numchambre, numEtage ;

        do {
           System.out.println("1-Ajouter Chambre"); 
           System.out.println("2-Lister Chambre"); 
           System.out.println("3-Archiver Chambre"); 
           System.out.println("8-Quitter"); 

           System.out.println("Faites votre choix"); 


           choix = scanner.nextInt();


           switch (choix) {
               case 1:
                   System.out.println("Entrer le numero de la chambre");
                   numchambre = scanner.nextInt();

                   System.out.println("Entrer le numero de l'etage");
                   numEtage = scanner.nextInt();

                  /*  chambre = new Chambre();
                   chambre.setNumCh(numchambre);
                   chambre.setNumEtage(numEtage); */

                   chambre = new Chambre(numchambre , numEtage);
                   service.ajouterChambre(chambre);

                   break;

                case 2:
                   service.listerChambre(EtatChambre.DISPONIBLE);
                   break;
                
                case 3:
                System.out.println("Entrer l'id de la chambre");
                int id = scanner.nextInt();
                    chambre = service.rechercherChambre(id);
                    if (chambre == null) {
                        System.out.println("Chambre inexistante");
                    }else{
                        service.archiverChambre(chambre);
                    }
                   break;
           
               default:
               System.out.println("Veillez faire un bon choix"); 
                   break;
           }
        } while (choix!= 8);
    }
}
