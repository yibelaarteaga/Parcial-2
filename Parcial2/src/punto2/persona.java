package punto2;
import java.util.Scanner;
public class persona {
	
		
		private static String nombre;	
		private static String DNI;
		private static String edad;
		private static String sexo;
		private static String pesoaltura ;
		
		
		public persona(String nombre, int edad ) {
						 			
		}
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)){
				System.out.println("ingrese el nombre de la persona");
				System.out.println("ingrese la edad de la persona");
		        System.out.println("ingrese el sexo de la persona");
		        System.out.println("ingrese el peso y altura de la persona");
			}
		}
		
	public static String getnombre() {
		return nombre;
	}
		public static String setnombre(String nmbre, String nombre){
			return persona.nombre = nombre;
		}
		public static String getDNI() {
			return DNI;
		}
		public static void setDNI(String dNI) {
			DNI = dNI;
		}
		public static String getEdad() {
			return edad;
		}
		public static void setEdad(String edad) {
			persona.edad = edad;
		}
		public static String getSexo() {
			return sexo;
		}
		public static void setSexo(String sexo) {
			persona.sexo = sexo;
		}
		public static String getPesoaltura() {
			return pesoaltura;
		}
		public static void setPesoaltura(String pesoaltura) {
			persona.pesoaltura = pesoaltura;
		}
		
		
	
	

}




