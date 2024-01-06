package com.advanceJava;


/**  Runnable interface contains only one abstract method.
 *    So, we can use it as functional interface. */


public class MethodRefrence2 {
    //  public static void ThreadStatus(){      // for t2 as no obj creation required
        public   void ThreadStatus(){           //// for t3 as no obj creation  for non static
            System.out.println("Thread is running...");  
        }  
        
         public static void main(String[] args) {

        //     Thread t2=new Thread(MethodRefrence2::ThreadStatus);  
        //     t2.start();       

     //  for non static ThreadStatus
     //  create object by anonymous function
      Thread t3  = new Thread(new MethodRefrence2()::ThreadStatus);
      t3.start();
      
      

        }  
    }  



