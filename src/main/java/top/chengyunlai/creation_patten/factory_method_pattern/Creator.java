package top.chengyunlai.creation_patten.factory_method_pattern;

public interface Creator {
    // 创建一个产品对象
    public <T extends  Product> T factory(Class<T> c);
}
