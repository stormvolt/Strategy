package strategy;

public class Multi implements StrategyOperation
{
	@Override
	public int operate(int a, int b)
	{
		return a * b;
	}
}
