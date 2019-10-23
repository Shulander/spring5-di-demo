package guru.springframework;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        FakeJmsBroker fakeJmsSource = ctx.getBean(FakeJmsBroker.class);

        log.info("DS Info: {}", fakeDataSource);
        log.info("Jms Info: {}", fakeJmsSource);
    }
}
