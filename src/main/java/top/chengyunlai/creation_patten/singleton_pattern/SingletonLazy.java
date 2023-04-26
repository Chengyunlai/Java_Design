package top.chengyunlai.creation_patten.singleton_pattern;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    // 构造方法私有化
    private SingletonLazy(){

    }

    synchronized private static SingletonLazy getSingletonLazy(){
        if (singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
