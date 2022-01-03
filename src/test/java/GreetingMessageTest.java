import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingMessageTest {

    @Test
    void greet() {

        GreetingMessage greetingMessage = new GreetingMessage();

        assertThat(greetingMessage.greet("guillaume"))
                .isEqualTo("Hello guillaume 's world");

    }
}