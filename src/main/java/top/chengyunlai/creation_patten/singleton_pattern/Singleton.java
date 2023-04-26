package top.chengyunlai.creation_patten.singleton_pattern;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    // 构造方法私有化
    private Singleton(){

    }

    private static Singleton getSingleton(){
        return singleton;
    }

}
