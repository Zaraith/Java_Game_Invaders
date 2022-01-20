package jeu;
import ressource.Constantes;
import javax.swing.JFrame;


public class Main {

    /**** VARIABLES ****/
    public static Scene scene;

    /**** METHODES ****/
    public static void main(String[] args){

        // Fenetre de l'application
        JFrame fenetre = new JFrame("NovInders");
        fenetre.setSize(Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setAlwaysOnTop(true);

        // Rajout de la scene à la fenetre
        scene = new Scene();
        fenetre.setContentPane(scene);

        fenetre.setVisible(true);

    }
}
