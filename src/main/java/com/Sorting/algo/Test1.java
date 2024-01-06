package com.Sorting.algo;


public class Test1 {
    public String countryCode = "IND";

    public static void main1(String... args) {

        String[] a = { "A", "B", "C", "D", "E" };
        int n = a.length - 1;

        String tmp;
        for (int i = 0; i <= n / 2; i++) {
            tmp = a[i];
            a[i] = a[n - i];
            a[n - i] = tmp;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(a[i] + new Test1().countryCode);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Integer ii = null;
     //   System.out.println("Integer value " + ii);
      //  Test1.main1(args);
      oracleToSql();
    }

    static void oracleToSql() {
        String str = " Insert into REPORT_DB (REPORTNAME_ID,CREATED_ON,INSERT_QUERY,KEY_COLUMN,MODIFIED_ON,MYSQL_INPUT_QUERY,ORACLE_INPUT_QUERY,OUTPUT_TABLE,REPORT_DATA_QUERY,REPORT_NAME,REPORT_ORDER,STATUS,TXN_ID_FIELD,VIEWFLAG,INPUT_QUERY,REPORT_CATEGORY,ORDER_COLUMN_NAME,ORDER_BY,MONTHLY_INPUT_QUERY) values (1,  to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM'),null,null,to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM'),null,null,'device_status_report',null,'IMEI Status Report - InActive',1,1,null,1,null,4,null,null,null);";
       System.out.println( "to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM')".length());
        System.out.println(    str.indexOf("to_timestamp" ));
        System.out.println(  str.substring( str.indexOf("to_timestamp" ), str.indexOf("to_timestamp" ) + 74)   ); 
  
    }



    static void traverseString() {
        String str = " Insert into REPORT_DB (REPORTNAME_ID,CREATED_ON,INSERT_QUERY,KEY_COLUMN,MODIFIED_ON,MYSQL_INPUT_QUERY,ORACLE_INPUT_QUERY,OUTPUT_TABLE,REPORT_DATA_QUERY,REPORT_NAME,REPORT_ORDER,STATUS,TXN_ID_FIELD,VIEWFLAG,INPUT_QUERY,REPORT_CATEGORY,ORDER_COLUMN_NAME,ORDER_BY,MONTHLY_INPUT_QUERY) values (1,  to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM'),null,null,to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM'),null,null,'device_status_report',null,'IMEI Status Report - InActive',1,1,null,1,null,4,null,null,null);";
       // System.out.println(    str.indexOf("to_timestamp" ));
 //     System.out.println(  str.substring( str.indexOf("to_timestamp" ), str.indexOf("to_timestamp" ) + 10)   ); 

       // to_timestamp('07-JUN-20 04.22.55.229757000 PM','DD-MON-RR HH.MI.SSXFF AM')

       
       String regex = "\\"; // the regular expression is not valid.

       // invoking the replaceAll() method raises the PatternSyntaxException
       str = str.replaceAll(regex, "JavaTpoint ");



    //   str = str.substring(0, index) + ch
    //   + str.substring(index + 1);

        System.out.println(str);

        char[] strArray = str.toCharArray();
     //   String withoutWhitespace = StringUtils.deleteWhitespace("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }
}