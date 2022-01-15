import java.util.Scanner; //HABILITAMOS LA ENTRADA DEL TECLADO
public class PUD02EJ08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in); //DECLARAMOS EL TECLADO
			double multa; //VALOR QUE DEVUELVE EL OPERADOR TERNARIO 
			System.out.println("Teclee una velocidad :");
			int vel=teclado.nextInt(); //VALOR DE ENTRADA 
				multa=(vel>=0 && vel<60)?300:(vel>=61 && vel<=120)?0:(vel>=121 && vel<=140)?300:(vel>=141 && vel<=180)?600:(vel>180)?1000:0;
				//DECLARAMOS EN MULTA Y HACEMOS LAS OPERACIONES TERNARIAS PARA COMPROBAR QUE VELOCIDAD ES LA ADECUADA
				System.out.println("Multa : "+multa+" €");
				System.out.println("AÃ±ado linea pruebas");
		teclado.close();
	}

}
