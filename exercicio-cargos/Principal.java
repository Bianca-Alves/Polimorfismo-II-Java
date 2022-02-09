import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");

		Funcionario f1 = new Funcionario();

		f1.setNome("Bianca");
		f1.setCpf("000.000.000-00");
		f1.setSalario(2500);

		System.out.println("----------- FUNCIONÁRIO -----------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Salário: R$ " + df.format(f1.getSalario()));
		System.out.println("Bonificação: R$ " + df.format(f1.getBonificacao()));
		System.out.println("");

		Gerente g1 = new Gerente();

		g1.setNome("Pedro");
		g1.setCpf("111.111.111-11");
		g1.setSalario(2500);

		System.out.println("------------- GERENTE -------------");
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: R$ " + df.format(g1.getSalario()));
		System.out.println("Bonificação: R$ " + df.format(g1.getBonificacao()));
		System.out.println("");

		Coordenador c1 = new Coordenador();

		c1.setNome("Thayani");
		c1.setCpf("222.222.222-22");
		c1.setSalario(5000);

		System.out.println("----------- COORDENADOR -----------");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Salário: R$ " + df.format(c1.getSalario()));
		System.out.println("Bonificação: R$ " + df.format(c1.getBonificacao()));
		System.out.println("");

		ControleBonificacao control = new ControleBonificacao();

		control.registra(f1);
		control.registra(g1);
		control.registra(c1);

		System.out.println("-----------------------------------");
		System.out.println("Gastos com bonificação: R$ " + df.format(control.getSoma()));
	}
}