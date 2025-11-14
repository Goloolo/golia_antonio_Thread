/**
 * thread che simula come si formano le varie bottiglie
 * lavora dopo la fusione
 * @version 1.0
 * @author Golia Antonio
 */

public class formazioneBottiglie extends Thread{
    /**
     * Esegue la formazione delle bottiglie
     */
    @Override
    public void run() {
        try {
            System.out.println("(FORMAZIONE DELLE BOTTIGLIE) Preparazione stampo");
            sleep(500);
            System.out.println("(FORMAZIONE DELLE BOTTIGLIE) Versamento del prodotto nello stampo");
            sleep(500);
            System.out.println("(FORMAZIONE DELLE BOTTIGLIE) Viene data la forma");
            sleep(500);
            System.out.println("(FORMAZIONE DELLE BOTTIGLIE) Bottiglie formate");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
