package ressources;

public abstract class Constantes {

    /****************************** FENETRE ***********************************/
    // Dimension fenetre
    public static final int LARGEUR_FENETRE = 600;
    public static final int HAUTEUR_FENETRE = 800;
    public static final int MARGE_FENETRE = 50;

    /***************************** VAISSEAU **********************************/
    // Dimension vaisseau
    public static final int LARGEUR_VAISSEAU = 65;
    public static final int HAUTEUR_VAISSEAU = 44;

    // Position initiale
    public static final int X_POS_INIT_VAISSEAU = (LARGEUR_FENETRE - LARGEUR_VAISSEAU)/2;
    public static final int Y_POS_VAISSEAU = 645;

    // Deplacement vaisseau
    public static final int DX_VAISSEAU = 1;

    // Limites de mouvements du vaisseau
    public static final int LIMITE_GAUCHE_VAISSEAU = 60;
    public static final int LIMITE_DROITE_VAISSEAU = 500;

    /****************************** ALIENS ***********************************/
    // Dimension alien
    public static final int LARGEUR_ALIEN = 65;
    public static final int HAUTEUR_ALIEN = 65;

    // Position initiale
    public static final int ALIEN_INIT_POS = 50;
    public static final int X_POS_INIT_ALIEN = 29 + MARGE_FENETRE;
    public static final int ECART_LIGNES_ALIEN = 60;
    public static final int ECART_COLONNES_ALIEN = 20;



    // Deplacement alien
    public static final int DX_ALIEN = 5;
    public static final int DY_ALIEN = 25;

}
