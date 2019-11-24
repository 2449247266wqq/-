package first;

//对鸭子叫行为接口的实现，这里是不会叫。
public class MuteQuack implements QuackBehavior
{

	@Override
	public void quack()
	{
		// TODO Auto-generated method stub
		System.out.println("silence");

	}

}
