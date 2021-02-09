package homework3.calcs.additional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpression {
    public static void main(String[] args) {


        String str = "((4.1 + 15) * 7) + (28 / 5) ^ 2";

        String strClear = str.replaceAll(" ", "");
        //System.out.println(strClear);
        String[] strArr = new String[str.length()];
        Pattern pattern = Pattern.compile("[(]{1}[^()]*[)]");
        Matcher matcher = pattern.matcher(strClear);
        int i = 0;
        while (matcher.find()){

            String strTemp = strClear.substring(matcher.start(), matcher.end());

            if(strTemp.contains("+") ){
                double oper1 = Double.parseDouble(strTemp.substring(strTemp.indexOf('(')+1,strTemp.indexOf('+')));
                double oper2 = Double.parseDouble(strTemp.substring(strTemp.indexOf('+')+1,strTemp.indexOf(')')));
               // menod plus
                double res = oper1 + oper2;

                String strRes = Double.toString(res);
                
                //strClear = str.substring(0, matcher.start()) + strRes + strClear.substring(matcher.end());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, matcher.start())).append(strRes).append(strClear.substring(matcher.end()));
                System.out.println(stringBuilder);
            }

        }



    }
    public static StringBuilder countBasket(String s){

        return null;

    }


}
