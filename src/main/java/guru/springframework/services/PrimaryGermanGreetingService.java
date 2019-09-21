package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo - primärer Begrüßungsdienst";
    }
}
