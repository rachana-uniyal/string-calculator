package Code;

import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator cal_test = new StringCalculator();
    @Test
    void InputIsEmptyString(){
        assertTrue(cal_test.add("")==0);
    }

    @Test
    void InputIsOneDigit(){
        assertTrue(cal_test.add("1")==1);
    }

}
