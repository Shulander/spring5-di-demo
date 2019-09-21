package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
