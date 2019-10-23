package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${ds.user}")
    private String user;
    @Value("${ds.password}")
    private String password;
    @Value("${ds.url}")
    private String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        return FakeDataSource.builder()
                .user(env.getProperty("USER"))
                .password(password)
                .url(url)
                .build();
    }
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
//                new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
