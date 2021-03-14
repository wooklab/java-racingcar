package step3.study.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"a,b,c"})
    void splitTest(String str) {
        String[] strArray = {"a", "b", "c"};
        assertThat(StringUtils.split(str, ",")).isEqualTo(strArray);
    }
}
