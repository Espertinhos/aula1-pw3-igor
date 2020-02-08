
public class Nadador {

	public static void main(String[] args) {
		
		int idade = 30;
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil");
			
		} else if(idade >=8 && idade <= 10){
			System.out.println("Categoria Juvenil");

		} else if(idade >=11 && idade <= 15) {
			System.out.println("Categoria Adolescente");
			
		}else if(idade >=16 && idade <= 30) {
			System.out.println("Categoria Adulto");
			
		}else if(idade >30) {
			System.out.println("Categoria Senior");
			
		}
		
	}
	
	
}
