import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cnbjpuhui-384 on 2017/1/22.
 */
/**
 * EnableAutoConfiguration: Spring Boot会自动根据你jar包的依赖来自动配置项目,Spring Boot建议只有一个带有该注解的类。
 * RestController: 是一类特殊的@Controller，它的返回值直接作为HTTP Response的Body部分返回给浏览器。
 */
@EnableAutoConfiguration
@RestController
public class Aplication {
//    @RequestMapping注解表明该方法处理那些URL对应的HTTP请求
    @RequestMapping("/hello")
    String home(){
        return "hello world";
    }
    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Aplication.class,args);
    }
}
