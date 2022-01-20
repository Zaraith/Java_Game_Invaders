package jeu;
import ressource.Constantes;
import javax.swing.JPanel;
import java.awt.*;


public class Scene extends JPanel {

    /**** VARIABLES ****/


    /**** CONSTRUCTEURS ****/
    public Scene(){
        super();
    }

    /**** METHODES ****/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;

        //Fond d'écran
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);

        // Ligne de mort
        g2.setColor(Color.RED);
        g2.fillRect(30, 530, 535, 1);
    }

}
