package Model;

public class Gasolina {
	
	public float CalcularLitro(float preco, float pagamento) {
		float litro = pagamento / preco;
		return litro;
	}


}
