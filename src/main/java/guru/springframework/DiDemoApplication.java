package guru.springframework;

import guru.springframework.controllers.MyController;
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

        MyController controller = (MyController) ctx.getBean("myController");


        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        FakeJmsBroker fakeJmsSource = ctx.getBean(FakeJmsBroker.class);

        log.info("DS User: {}", fakeDataSource.getUser());
        log.info("Jms User: {}", fakeJmsSource.getUser());
    }
}
