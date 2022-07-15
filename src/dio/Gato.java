package dio;
import dio.Animal;

public class Gato {
	public static void main(String[] args) {
		Animal felino = new Animal("Gato", 4);
		
		felino.setPatas(10);
		System.out.println(felino.nome);
	}
}