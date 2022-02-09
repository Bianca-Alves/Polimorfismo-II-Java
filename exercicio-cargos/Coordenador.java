
public class Coordenador extends Funcionario {

	// Método que retorna o valor da bonificação do Coordenador

	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.15 + 1000;
	}
}