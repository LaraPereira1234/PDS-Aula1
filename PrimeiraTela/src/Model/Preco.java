package Model;

public class Preco {
	
	public static float CalcularPreco(float PrecoQuilo, float Peso) {
		float preco = Peso * PrecoQuilo;
		return preco;
	}
}
