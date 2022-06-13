package models;

import java.util.ArrayList;

public class Chambre {
    private Integer id ;
    private Integer numCh ;
    private Integer numEtage ;
    private EtatChambre etat ;
    private int nbre;




    public Integer getNumEtage() {
        return numEtage;
    }


    public void setNumEtage(Integer numEtage) {
        this.numEtage = numEtage;
    }


    private TypeChambre type; 
    private Pavillon pavillon ;
    private ArrayList <Boursier> boursiers = new ArrayList<>() ;
    public ArrayList<Boursier> getBoursiers() {
        return boursiers;
    }


    public void setBoursiers(ArrayList<Boursier> boursiers) {
        this.boursiers = boursiers;
    }


    


    

 


    public Chambre(Integer numCh, Integer numEtage) {
        this.numCh = numCh;
        this.numEtage = numEtage;
        nbre++;
        id=nbre;
        etat = EtatChambre.DISPONIBLE;
    }


    public EtatChambre getEtat() {
        return etat;
    }


    public void setEtat(EtatChambre etat) {
        this.etat = etat;
    }


    public Chambre() {
        nbre++;
        id=nbre;
        etat = EtatChambre.DISPONIBLE;

    }



    public Chambre(Integer id) {
        this.id = id;
    }

    




    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNumCh(Integer numCh) {
        this.numCh = numCh;
    }

    public Integer getNumCh() {
        return numCh;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public TypeChambre getType() {
        return type;
    }


    


    @Override
    public boolean equals(Object obj) {
        return ((Chambre)obj).getId()== id;
    }


    @Override
    public String toString() {
        return "Chambre [boursiers=" + boursiers + ", etat=" + etat + ", id=" + id + ", numCh=" + numCh + ", numEtage="
                + numEtage + ", pavillon=" + pavillon + ", type=" + type + "]";
    }


   

}
