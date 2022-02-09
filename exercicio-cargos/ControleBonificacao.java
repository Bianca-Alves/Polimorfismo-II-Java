
public class ControleBonificacao {

	private double soma;

	public double getSoma() {
		return this.soma;
	}

	public void registra(Funcionario f1) {
		double boni = f1.getBonificacao();
		this.soma = this.soma + boni;
	}
}