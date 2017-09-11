package strategy;

public class Operacion implements StrategyOperation
{
	@Override
	public int operate(int a, int b)
	{
		int resultado = 0;
		Suma sum = new Suma();
		Resta res = new Resta();
		Multi mul = new Multi();
		Division div = new Division();
		resultado = mul.operate(2,a);
		resultado = res.operate(resultado,b);
		resultado = div.operate(resultado,sum.operate(3,a));
		return resultado;
	}
}