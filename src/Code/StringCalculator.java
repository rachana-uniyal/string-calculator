package Code;

public class StringCalculator {


    public int add(String s) {
        int result=0;
        if(s.isEmpty()) {
            result = 0;
        }
        else{
            if(s.length()==1)
                result = Integer.parseInt(s);
        }
     return result;
    }
}
