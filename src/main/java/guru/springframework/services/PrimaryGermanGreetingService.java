package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
