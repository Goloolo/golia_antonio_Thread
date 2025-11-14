/**
 * Thread che simula il raffreddamento delle bottiglie
 * @version 1.0
 * @author Golia Antonio
 */
public class raffreddamentoBottiglie extends Thread{
    /**
     * Esegue il raffreddamento delle bottiglie
     */
    @Override
    public void run() {
        try{
            System.out.println("(RAFFREDDAMENTO DELLE BOTTIGLIE) Vengono raffreddate le bottiglie");
            sleep(500);
            System.out.println("(RAFFREDDAMENTO DELLE BOTTIGLIE) Bottiglie raffreddate");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
