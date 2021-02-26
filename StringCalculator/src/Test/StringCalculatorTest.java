package Test;

import Code.StringCalculator;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator cal_test = new StringCalculator();
    @Test
    void inputIsEmptyString(){
        assertTrue(cal_test.add("")==0);
    }

    @Test
    void inputIsLengthOne(){
        assertTrue(cal_test.add("1")==1);
    }

    @Test
    void inputIsLengthTwo(){
        assertTrue(cal_test.add("1,2")==3);
    }

    @Test
    void unknownAmountInput() {
        assertTrue(cal_test.add("1,2,3,4,5")==15);}

    @Test
    void newLineBetweenNumber() {
        assertTrue(cal_test.add("1\n2,3\n4,5")==15);}
        
}
