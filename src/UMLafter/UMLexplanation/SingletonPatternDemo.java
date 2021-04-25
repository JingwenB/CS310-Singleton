package UMLafter.UMLexplanation;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //4. 编译时错误：构造函数 SingleObject() 是不可见的
//        SingleObject object = new SingleObject();

        //5. 获取唯一可用的对象, 用 getinstance()
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}