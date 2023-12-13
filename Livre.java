public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;
    // Constructeurs
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        prix = -1;
        prixFixe = false;
    }
    public Livre(String unAuteur, String unTitre, double unPrix) {
        auteur = unAuteur;
        titre = unTitre;
        prix = unPrix;
        prixFixe = true;
    }
    // Accesseurs
    public String getTitre() {
        return titre;
    }
    public int getNbPages() {
        return nbPages;
    }
    public double getPrix() {
        return prix;
    }
    // Modificateurs
    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }
    public void setTitre(String unTitre) {
        titre = unTitre;
    }
    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Le nombre de pages doit être positif.");
        }
    }
    public void setPrix(double unPrix) {
        if (!prixFixe) {
            prix = unPrix;
            prixFixe = true;
        } else {
            System.out.println("Le prix a déjà été fixé et ne peut être modifié.");
        }
    }
    // toString()
    public String toString() {
        String description = "Titre : " + titre + "\nAuteur : " + auteur + "\nNombre de pages : " + nbPages;
        if (prix == -1) {
            description += "\nPrix pas encore fixé";
        } else {
            description += "\nPrix : " + prix;
        }
        return description;
    }
}