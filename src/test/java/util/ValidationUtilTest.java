package util;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidationUtilTest {

    @Test
    void inputTest() {
        assertThat(ValidationUtil.getCars("pobi,crong,honux")).containsExactly("pobi", "crong", "honux");
    }
}