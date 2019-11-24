package first;

//对鸭子叫行为接口的实现，这里是嘎嘎叫。
public class Quack implements QuackBehavior
{

	@Override
	public void quack()
	{
		// TODO Auto-generated method stub
		System.out.println("Quack");

	}

}
