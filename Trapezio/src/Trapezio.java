/**
 * <u> Classe </u>
 * @author cristian colona
 *
 */

public class Trapezio {
private float baseMin, baseMax,alt;
/**
 * 
 * @param baseMin base minore
 * @param baseMax base maggiore
 * @param alt altezza 
 */
	
	public Trapezio(float baseMin, float baseMax, float alt) {
	super();
	this.baseMin = baseMin;
	this.baseMax = baseMax;
	this.alt = alt;
}
	
	public float CalcolaArea() {
		return (((baseMin * baseMax)*alt)/2);
	}
	/**
	 * 
	 * @return area
	 */

	public static void main(String[] args) {
		

	}

}
