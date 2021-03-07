package Enum;

public class DiasMain {
	
	// en lugar de clase usamos enum
	public enum dias{
		
		/*La unica diferencia de una clase enumerada a una clase normal
		 * es que su constructor debe ser privado para que no se puedan
		 * crear objetos nuevos
		 * */
		
		LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
		
		String clima, climap;
		
		private dias() {
			this.clima = "Soleado";
		}
		
		private void pronostico(String clima) {
			this.clima = clima;
		}
		
		public String getClima() {
			return clima;
		}
		
		public void setClima(String clima) {
			this.clima = clima;
		}
		
	
	}
	
	public static void main(String[] args) {
		
		/* A diferencia de una clase, instanciar con dia = new dias() ya no sucede */
		
		dias dia = dias.LUNES;
		dias dia2 = dias.MARTES;
		
		System.out.println(dia.name());
		System.out.println(dia.toString());
		System.out.println(dia.ordinal());
		System.out.println(dia.compareTo(dia2));
		System.out.println(dias.values());
		
		
		
	}
	
}
