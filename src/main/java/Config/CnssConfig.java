package Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"Controllers"})
public class CnssConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/webapp/");
        vr.setSuffix(".jsp");

        return vr;
    }

}
