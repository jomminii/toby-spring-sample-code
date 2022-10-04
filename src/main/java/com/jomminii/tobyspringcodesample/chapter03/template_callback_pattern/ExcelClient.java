package com.jomminii.tobyspringcodesample.chapter03.template_callback_pattern;

public class ExcelClient {

    public static void main(String[] args) {
        System.out.println("start");
        ExcelModule excelModule = new ExcelModule();

        GetDataStrategy strategyOne = (valueOne, valueTwo) -> valueOne + valueTwo + 5 + 4;
        GetDataStrategy strategyTwo = (valueOne, valueTwo) -> valueOne + valueTwo + 100 + 400;

        excelModule.makeExcel(strategyOne);
        excelModule.makeExcel(strategyTwo);
        System.out.println("end");
    }
}
