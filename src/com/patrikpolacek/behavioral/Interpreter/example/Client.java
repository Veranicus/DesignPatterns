package com.patrikpolacek.behavioral.Interpreter.example;

public class Client {

    public InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());

        System.out.println(str1 + "= " + client.interpret(str1));
        System.out.println(str2 + "= " + client.interpret(str2));

    }

    public String interpret(String str){
        Expression expression = null;

        if (str.contains("Hexadecimal")){
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else  if (str.contains("Binary")){
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else return str;

        return expression.interpret(interpreterContext);
    }
}
