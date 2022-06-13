package services;

import java.util.ArrayList;

import models.Chambre;
import models.EtatChambre;
import models.Pavillon;

public class ServiceList implements IService{

   ArrayList<Chambre> bdChambres = new ArrayList<>();
   ArrayList<Pavillon> bdPavillons = new ArrayList<>();

    @Override
    public void ajouterChambre(Chambre chambre) {
        bdChambres.add(chambre);
    }



    @Override
    public void ajouterChambre(Chambre chambre, Pavillon pavillon) {
        //Affecter une chambre a un pavillon
        chambre.setPavillon(pavillon);

        //Pavillon vers chambre 
        pavillon.getChambres().add(chambre);
        bdChambres.add(chambre);
    }

    @Override
    public Chambre rechercherChambre(int id) {
        Chambre ch = new Chambre(id);
        for (Chambre chambre : bdChambres) {
            if (chambre.equals(ch)) {
                return chambre ;
            }
        }
        return null;
    }

    @Override
    public void modifierChambre(Chambre chambre) {
        for (int index = 0; index < bdChambres.size(); index++) {
            if (bdChambres.get(index).equals(chambre)) {
                bdChambres.set(index, chambre);
            }
        }
    }

    @Override
    public void listerChambre() {
        for (Chambre chambre : bdChambres) {
            System.out.println(chambre);
        }
    }

    @Override
    public void listerChambre(EtatChambre etat) {
        for (Chambre chambre : bdChambres) {
            if (chambre.getEtat()== etat) {
                System.out.println(chambre);
            }
        }
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        chambre.setEtat(EtatChambre.ARCHIVER);
    }



/////////////////////////////////////////////////Pavillon/////////////////////////////////////

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        bdPavillons.add(pavillon);      
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon, ArrayList<Chambre> chambres) {
        pavillon.getChambres().addAll(chambres) ;
        bdPavillons.add(pavillon);
    }

    @Override
    public Pavillon rechercherPavillon(int id) {
        Pavillon pav = new Pavillon(id);
        for (Pavillon pavillon : bdPavillons) {
            if (pavillon.equals(pav)) {
                return pavillon ;
            }
        }
        return null;
    }

    @Override
    public void modifierPavillon(Pavillon pavillon) {
        for (int index = 0; index < bdPavillons.size(); index++) {
            if (bdPavillons.get(index).equals(pavillon)) {
                bdPavillons.set(index, pavillon);
            }
        }
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : bdPavillons) {
            System.out.println(pavillon);
        }        
    }



    
    
}
