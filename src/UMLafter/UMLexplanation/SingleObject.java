package UMLafter.UMLexplanation;

public class SingleObject {

    //1. 创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();



    //2. 获取唯一可用的对象, implement getinstance
    public static SingleObject getInstance(){
        return instance;
    }

    //3. 让构造函数(constructor)为 private，这样该类就不会被实例化
    private SingleObject(){}

    public void showMessage(){
        System.out.println("Hello World!");
    }
}