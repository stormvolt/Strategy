package strategy;

public class Resta implements StrategyOperation
{
	@Override
	public int operate(int a, int b)
	{
		return a - b;
	}
}