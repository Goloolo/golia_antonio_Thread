# Progetto Bottiglie di Vetro

## Descrizione
Questo progetto Java simula, il processo di produzione di bottiglie di vetro.  

## Struttura
- **ProcessoBottiglieDiVetro**: classe padre che coordina le fasi.
- **FusioneVetroThread**: thread che simula la fusione del vetro.
- **FormaturaBottiglieThread**: thread che simula la formatura delle bottiglie.
- **RaffreddamentoThread**: thread che simula il raffreddamento finale.



## Funzionamento
1. Il processo padre avvia i thread.
2. Ogni thread stampa messaggi descrittivi e usa `Thread.sleep()` per simulare il tempo di lavoro.
3. Il processo padre usa `join()` per attendere la fine di ogni fase.
4. Alla fine viene stampato un messaggio di completamento.

## Tecnologie utilizzate
- Linguaggio: **Java 17+**
- IDE: **IntelliJ IDEA**
- Commenti: **Javadoc**
- Uml: **Virtual Studio Padardigm** 

## Contatti
#### Golia Antonio **5CINF**
