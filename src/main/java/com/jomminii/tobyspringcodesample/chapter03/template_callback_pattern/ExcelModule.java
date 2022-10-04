package com.jomminii.tobyspringcodesample.chapter03.template_callback_pattern;

public class ExcelModule {
    void makeExcel(GetDataStrategy strategy) {

        Integer valueOne = 3;
        Integer valueTwo = 4;

        System.out.println("엑셀 만들기 시작");
        System.out.println("데이터 가져오기");
        Integer data = strategy.getData(valueOne, valueTwo);
        System.out.println("data = " + data);
        System.out.println("가져온 데이터로 엑셀로 만들기");
        System.out.println("결과 출력");
    }
}
