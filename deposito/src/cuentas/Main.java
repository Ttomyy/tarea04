package cuentas;

public class Main {

	public static void main(String[] args) {
		operativa_cuenta(new Cuenta());
	}

	private static void operativa_cuenta(Cuenta cuenta) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 3000, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(200);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(6950);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
		System.out.println("Fin de programa ");//vamos a probar un commit con este comentario
		System.out.println("2 comit ");//vamos a probar un segundo commit con este comentario

	}
}
