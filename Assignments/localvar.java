class localvar{
     String str = "Hello";
      static String str1 = "Welcome";
      String str2 ="Haii";
          void userMath(){
             String str = "Java";
             System.out.println(str);
             }
             void userDisp(){
             System.out.println(str);
             }
             static void task(){
             int a =100;
             System.out.println(a);
             
} 
            public static void main(String args[]){
           localvar lv= new localvar();
           lv.userMath();         
lv.userDisp();
localvar.task();
task();
System.out.println(lv.str2);
System.out.println(str1);

}
}