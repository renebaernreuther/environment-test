package de.vemaeg.envtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    @Test
    public void test() {
        var service = new TestService();
        int result = service.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

}