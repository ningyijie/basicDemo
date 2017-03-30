import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cnbjpuhui-384 on 2017/1/24.
 * lambda 表达式 学习
 */
public class LambdaTest {

    @Test
    public void testBasicLambda(){
        //遍历
        Arrays.asList("a","b","c").forEach(e-> System.out.print(e+"\t"));
        //排序
        Arrays.asList("a","b","c").sort((e1,e2)->e1.compareTo(e2));

    }
}
