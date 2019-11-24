package first;

//鸭子的基类
public abstract class Duck
{
		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
		public abstract void display();
		public void performFly() {
			flyBehavior.fly();
		}
		public void performQuack() {
			quackBehavior.quack();
		}
		public void swim() {
			System.out.println("We all can swim");
		}
		//可以改变鸭子的飞行行为
		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}
		//可以改变鸭子的叫声行为
		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}
}
