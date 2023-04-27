package top.chengyunlai.uml.dependency;

import top.chengyunlai.common.resp.R;
import top.chengyunlai.uml.class_.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PersonController {
    public R save(Person person){
        // 保存
        return R.success();
    }
}
