/**
 * Classe OrlandoMarcoClass (che fa il calcolo della sommatoria)
 * 
 * Data: <i>04/05/2022</i>
 * 
 * @author <b>Marco Orlando</b> <u>4CI</u>
 *
 */
public class OrlandoMarcoClass {

	/**
	 * Metodo costruttore senza parametri
	 */
	public OrlandoMarcoClass() {}
	
	/**
	 * Metodo usato per il calcolo della sommatoria
	 * 
	 * @param f-> numero da inserire per calcolarne la sommatoria
	 * @return il valore della sommatoria
	 */
	/*
	 * Innanzitutto l'errore risiede nell'operazione di moltiplicazione invece che l'addizione, ed inoltre
	 * è sbagliata anche la condizione del ciclo for
	 */
	public int orlandoMet(int f) {
		int r=0;
		for(int i=0; i<=f; i++) {
			r=r+i;
		}
		return r;
	}
	
	/**
	 * Metodo principale (main)
	 * 
	 * @param args-> array di stringhe
	 */
	public static void main(String[] args) {
		OrlandoMarcoClass a=new OrlandoMarcoClass();
		System.out.println("Sommatoria di 5: "+a.orlandoMet(5));
		System.out.println("Sommatoria di 3: "+a.orlandoMet(3));
	}

}
