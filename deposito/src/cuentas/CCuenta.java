
package cuentas;

/**
 * Esta clase evalua si el dinero que sacamos es inferior al saldo en cuenta 
 * @author Tomás Jesus Alvarez Torres 
 * @version 10/02/2021
 * @see <a href="https://github.com/Ttomyy/tarea04>github.com</a>
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterès;
	/**metodos constructores  
	 * */
	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	public double estado() {
		return getSaldo();
	}
/**
 * evalua que no pueda sacar una cantidad negativa
 * @param cantidad 
 *  */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterès() {
		return tipoInterès;
	}

	private void setTipoInterès(double tipoInterès) {
		this.tipoInterès = tipoInterès;
	}
}
