package Application.Config;



import Application.interceptor.JwtInyerceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//需要细讲
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //jwt拦截器
    @Bean
    public JwtInyerceptor jwtInyerceptor(){
        return new JwtInyerceptor();
    }
    //添加jwt拦截器
    @Override
    public  void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(jwtInyerceptor()).addPathPatterns("/v1/txt/pages/**");
        //列子:v1/txt/pages/**
        //这里是控制路径可以多加
    }


}
