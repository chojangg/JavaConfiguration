package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
//    <bean id="java1" class="kr.hs.study.beans.TestBean1"  />

    @Bean
    public TestBean1 java1(){   // 메서드의 이름이 객체 이름
        TestBean1 t=new TestBean1();
        return t;
    }

    @Bean
    public TestBean2 java2(){
        return new TestBean2();
    }
}
