package Test;

import Code.StringCalculator;
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
    void InputIsLengthOne(){
        assertTrue(cal_test.add("1")==1);
    }

    @Test
    void InputIsLengthTwo(){
        assertTrue(cal_test.add("1,2")==3);
    }

}
