
public class Coordenador extends Funcionario {

	// M�todo que retorna o valor da bonifica��o do Coordenador

	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.15 + 1000;
	}
}