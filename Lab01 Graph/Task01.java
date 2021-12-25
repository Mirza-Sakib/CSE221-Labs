        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        package lab.pkg01;
        import java.util.Stack;


        
        public class Task01 {

            
            public static void main(String[] args) {
                // TODO code application logic herepublic class Task01 {
                Stack <Integer> stck = new Stack();
                System.out.println("Pushing 10....");
                stck.push(10);
                System.out.println("Printing top:");
                System.out.println(stck.peek());
                System.out.println("Pushing 5...");
                stck.push(5);
                System.out.println("Printing top:");
                System.out.println(stck.peek());
                System.out.println("Popping...");
                stck.pop();
                System.out.println("Printing top:");
                System.out.println(stck.peek());
            }

        }



