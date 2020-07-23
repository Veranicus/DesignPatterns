package com.patrikpolacek.behavioral.Interpreter.example;

public class InterpreterContext {
//    <Number> in Binary
//    <Number> in Hexadecimal
//    Example of how would user input look like

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }

}
