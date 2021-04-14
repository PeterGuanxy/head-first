package headfirst.chapter1_strategy.duck_test;

/**
 * ** Created by peter.guan on 2019/8/9.
 *
 * @author peter.guan
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }


//  public static void main(String[] args) {
//    Enhancer enhancer = new Enhancer(); //设置被代理类
//    enhancer.setSuperclass(Car.class); //设置回调函数
//    enhancer.setCallback(new MethodInterceptor() {
//      @Override
//      public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
//          throws Throwable { //增强处理... //增强处理...
//        Object o = proxy.invokeSuper(obj,
//            args);//代理类调用父类的方法 //增强处理... return o; } }); //创建代理类并使用回调 Car car = (Car) enhancer.create(); //执行目标方法 System.out.println(car.move());}
//      }
//
//    }
//  }
}
