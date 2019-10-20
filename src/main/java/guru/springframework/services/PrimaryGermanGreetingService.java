package guru.springframework.services;

//@Primary
//@Service
//@Profile("de")
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
