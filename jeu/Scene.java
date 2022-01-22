package jeu;

import entites.Vaisseau;
import ressources.Chrono;
import ressources.Clavier;
import ressources.Constantes;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;


public class Scene extends JPanel {

    /**** VARIABLES ****/
    public Vaisseau vaisseau = new Vaisseau();

    /**** CONSTRUCTEURS ****/
    public Scene(){

        super();

        // Instanciation de la classe clavier
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Clavier());

        // Instanciation de la classe Chrono
        Thread chronoEcran = new Thread(new Chrono());
        chronoEcran.start();

    }

    /**** METHODES ****/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;

        // Fond d'écran
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);

        // Ligne de mort
        g2.setColor(Color.RED);
        g2.fillRect(30, 700, 535, 1);

        // Dessin du Vaisseau
        g2.drawImage(this.vaisseau.getImg(), this.vaisseau.mouvementVaisseau(), this.vaisseau.getyPos(), null);

    }

}
