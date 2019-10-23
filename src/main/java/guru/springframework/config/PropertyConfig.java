package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${ds.username}")
    private String user;
    @Value("${ds.password}")
    private String password;
    @Value("${ds.url}")
    private String url;


    @Value("${jms.username}")
    private String jmsUser;
    @Value("${jms.password}")
    private String jmsPassword;
    @Value("${jms.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return FakeDataSource.builder()
                .user(user)
                .password(password)
                .url(url)
                .build();
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return FakeJmsBroker.builder()
                .user(jmsUser)
                .password(jmsPassword)
                .url(jmsUrl)
                .build();
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
//                new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
