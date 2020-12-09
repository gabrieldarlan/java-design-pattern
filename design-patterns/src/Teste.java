
public class Teste {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);

		ICCC iccc = new ICCC();
		System.out.println(iccc.calcula(orcamento));
	}
}
