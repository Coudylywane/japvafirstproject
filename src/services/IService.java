package services;

import java.util.ArrayList;

import models.Chambre;
import models.Pavillon;

public interface IService {

    public void ajouterChambre(Chambre chambre);
    public void ajouterChambre(Chambre chambre , Pavillon pavillon);

    public Chambre rechercherChambre(int id);
    public void modifierChambre(Chambre chambre);
    public void listerChambre();
    public void archiverChambre(Chambre chambre);

    public void ajouterPavillon(Pavillon pavillon);
    public void ajouterPavillon(Pavillon pavillon , ArrayList<Chambre> chambres);

    public Pavillon rechercherPavillon(int id);
    public void modifierPavillon(Pavillon pavillon);
    public void listerPavillon();





    
}
