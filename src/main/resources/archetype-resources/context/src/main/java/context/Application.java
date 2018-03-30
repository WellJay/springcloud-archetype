#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.context;

import com.jovezhao.nest.starter.EnableNest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableNest
@MapperScan("${package}.context.appservice.impl.domain.repository.mappers")
@ComponentScans({
        @ComponentScan("${package}.context"),
        @ComponentScan("com.zqkh.common.configuration")
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}