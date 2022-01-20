package ressource;

import jeu.Main;

public class Chrono implements Runnable {

    /**** VARIABLES ****/
    private final int PAUSE = 10;
    public static int compteur = 0;

    /**** METHODES ****/
    @Override
    public void run() {
        while(true){
            Main.scene.repaint();
            try {
                Thread.sleep(PAUSE);
            }
            catch(InterruptedException e) {
                System.out.println("Something went wrong !");
            }
        }
    }
}
