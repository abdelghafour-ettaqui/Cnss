package Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"Controllers","Dao"})
public class CnssConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/view/");
        vr.setSuffix(".jsp");

        return vr;
    }

}
