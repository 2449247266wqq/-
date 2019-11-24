package first;

//通过这个类我们来显示结果
public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		//如果想改变鸭子的飞行或者叫声行为，只需要修改set这个方法就行。
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
