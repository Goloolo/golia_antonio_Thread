/**
 * Thread che simula la fusione del vetro
 * Usa gli sleep per i vari tempi
 */
public class fusioneVetro extends Thread{
    /**
     * esegue la fusione
     */
    public void run(){
        try {
            System.out.println("(FUSIONE DELLE BOTTIGLIE) Metto i materiali in forno");
            sleep(500);
            System.out.println("(FUSIONE DELLE BOTTIGLIE) il forno raggiunge la temperatura");
            sleep(500);
            System.out.println("(FUSIONE DELLE BOTTIGLIE) il prodotto è pronto");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
