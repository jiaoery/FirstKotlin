package cn.cloudwalk.myapplication;

/**
 * ClassName: SingletonJava<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/7 15:04<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class SingletonJava {
    private static final SingletonJava ourInstance = new SingletonJava();

    public static SingletonJava getInstance() {
        return ourInstance;
    }

    private SingletonJava() {
    }

    public void singletonTest(){
        System.out.println("singletonTest is called(Java)");
    }
}
