
 /**
 * Avvia l'applicazione
 * Crea il processo e lo esegue
 * @version 1.0
 * @author Golia Antonio
 */

public class processoBottiglie extends Thread{
    public void avviaProduzione(){
        System.out.println("AVVIO PRODUZIONE");
        fusioneVetro fusione = new fusioneVetro();
        formazioneBottiglie formazione = new formazioneBottiglie();
        raffreddamentoBottiglie raffreddamento = new raffreddamentoBottiglie();
        try{
            fusione.start();
            fusione.join();

            formazione.start();
            formazione.join();

            raffreddamento.start();
            raffreddamento.join();

        } catch (InterruptedException e) {
            System.err.println("Processo Interrotto");
        }
        System.out.println("Produzione terminata.");
    }
}
