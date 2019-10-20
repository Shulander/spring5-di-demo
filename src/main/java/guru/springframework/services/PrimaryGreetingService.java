package guru.springframework.services;

//@Primary
//@Service
//@Profile({"default", "en"})
public class PrimaryGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
