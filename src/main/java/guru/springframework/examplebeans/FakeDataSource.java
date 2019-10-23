package guru.springframework.examplebeans;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class FakeDataSource {
    private final String user;
    private final String password;
    private final String url;
}
