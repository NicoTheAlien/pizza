
public class Ejecutar {
	static int demanades;
	public static void main(String[] args) {
		Pizza_Nicolas_Fiorito p1 = new Pizza_Nicolas_Fiorito("mediana", "margarita");
		p1.demana();
		Pizza_Nicolas_Fiorito p2 = new Pizza_Nicolas_Fiorito("familiar", "funghi");
		p2.demana();
		p2.sirve();
		Pizza_Nicolas_Fiorito p3 = new Pizza_Nicolas_Fiorito("mitjana", "quatre formatges");
		p2.demana();
		System.out.println(p1.getTipus()+" "+p1.getMida()+", "+p1.getEstat());
		System.out.println(p2.getTipus()+" "+p2.getMida()+", "+p2.getEstat());
		System.out.println(p3.getTipus()+" "+p3.getMida()+", "+p3.getEstat());
		p2.sirve();
		System.out.println(Pizza_Nicolas_Fiorito.getDemanades());
		System.out.println(Pizza_Nicolas_Fiorito.getServides());
	}

}