
public class CalculadorDeImposto {

	public void realizaCalculoICMS(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}

}
