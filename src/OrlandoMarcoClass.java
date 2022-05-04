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
	public int orlandoMet(int f) {
		int r=1;
		for(int i=f; i<0; i++) {
			r=r*i;
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
