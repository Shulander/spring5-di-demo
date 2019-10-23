package guru.springframework.examplebeans;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@RequiredArgsConstructor
public class FakeJmsBroker {
    private final String user;
    private final String password;
    private final String url;
}
