package com.example.calculadora;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.regex.*;

public class Calculos {

    public String multiplicacao() {
        return "*";
    }

    public String calculateFatorialInExpression(String input) {
        Pattern pattern = Pattern.compile("(\\d+)!");
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        int lastIndex = 0;

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group(1));
            double fatorial = calculateFatorial(number);

            int start = matcher.start();
            int end = matcher.end();

            sb.append(input, lastIndex, start); // Append text before the factorial
            sb.append(fatorial); // Append the factorial result
            lastIndex = end;
        }

        sb.append(input.substring(lastIndex)); // Append any remaining text after the last factorial

        return sb.toString();
    }

    private double calculateFatorial(int number) {
        double result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }
    public String porcentagem(){
        return "/100";
    }
    public String resultado(String expressao){
        Object result;
        double valor=0;
        ScriptEngineManager manager= new ScriptEngineManager();
          ScriptEngine engine= manager.getEngineByName("javascript");


          try {
         result= engine.eval(expressao);
          valor = Double.parseDouble(result.toString());
          } catch (ScriptException e) {
              System.out.println(e.getMessage());
          }
        return String.format("%.6f",valor);
    }

    public String pi(){
        return "Math.PI";
    }

   public String pow(String str){
        return "Math.pow("+str+",2)";
   }
   public String sqrt(String num){
        return "Math.sqrt("+num+")";
   }


}
