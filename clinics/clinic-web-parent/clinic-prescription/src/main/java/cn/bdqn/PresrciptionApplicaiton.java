package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableOAuth2Sso
@EnableSwagger2
@MapperScan(basePackages = "cn.bdqn.prescription.mapper")
public class PresrciptionApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(PresrciptionApplicaiton.class,args);
    }
}
