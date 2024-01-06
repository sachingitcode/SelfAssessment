package com.coreJava;

public class RefactorCodeWithEnums {

    public static void main(String[] args) {

     System.out.println(Cars.SUV.value); 
    }
 
 public enum Cars {
        SUV("Scorpio"),
        HATCHBACK("Baleno"),
        SEDAN("Verna"),
        COUPE("Q7");

       private String value;
       public String getValue() {
          return value;
         }
       private Cars(String value) {
        this.value = value;
       } 
      }
// can be used in place of if else
      public int getPrice(String item) {
        if (item == "Burger") return 200;
        if (item == "Pizza") return 400;
        if (item == "Sandwich") return 300;
        return 0;
    }
}
/*
 * public enum Environment {
    PROD("https://prod.domain.com:1088/"),
    SIT("https://sit.domain.com:2019/"),
    CIT("https://cit.domain.com:8080/"),
    DEV("https://dev.domain.com:21323/");
    private String url;
    Environment(String envUrl) {
        this.url = envUrl;}
    public String getUrl() {
        return url;}
}
String prodUrl = Environment.PROD.getUrl();
 */