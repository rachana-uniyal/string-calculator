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
            else{
                String s1 = s.replaceAll("\n",",");
                String[] text = s1.split(",");
                Integer x=0;
                for (int i = 0; i<text.length ; i++){
                     x = Integer.valueOf(text[i]);
                     result+=x;
                }
            }
        }
     return result;
    }
}
