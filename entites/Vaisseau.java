package entites;

import ressources.Constantes;

import javax.swing.ImageIcon;
import java.io.File;


public class Vaisseau extends Entite {

    /**** VARIABLES ****/

    /**** CONSTRUCTEURS ****/

    public Vaisseau(){

        super.xPos = Constantes.X_POS_INIT_VAISSEAU;
        super.yPos = Constantes.Y_POS_VAISSEAU;
        super.largeur = Constantes.LARGEUR_VAISSEAU;
        super.hauteur = Constantes.HAUTEUR_VAISSEAU;
        super.dx = 0;
        super.dy = 0;

        //Images du vaisseau
        super.strImg1 = "/images/vaisseau_s.png";
        super.strImg2 = "/images/vaisseauDetruit1.png";
        super.strImg3 = "/images/vaisseauDetruit2.png";
        //Récupération image vaisseau
        super.ico = new ImageIcon(getClass().getResource(super.strImg1));
        super.img = this.ico.getImage();

    }

    /**** METHODES ****/
    public int mouvementVaisseau(){
        // Va donner la nouvelle position du vaisseau après un déplacement de ce dernier
        if(this.dx < 0){
            if(this.xPos > Constantes.LIMITE_GAUCHE_VAISSEAU){
                this.xPos = this.xPos + this.dx;
            }
        }
        else if(this.dx > 0){
            if(this.xPos + this.dx < Constantes.LIMITE_DROITE_VAISSEAU){
                this.xPos = this.xPos + this.dx;

            }
        }
        return this.xPos;
    }
}
