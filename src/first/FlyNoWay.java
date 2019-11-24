package first;

//对飞行行为接口的实现，这里是不会飞。
public class FlyNoWay implements FlyBehavior
{

	@Override
	public void fly()
	{
		// TODO Auto-generated method stub
		System.out.println("I can't fly");

	}

}
