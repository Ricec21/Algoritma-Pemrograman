/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori_komputasi_1;

import java.util.Scanner;

/**
 *
 * @author Ricec
 */
public class Teori_komputasi_1 {

    private int maxSize;
    private String[] stackarray;
    private int top;
    
    public Teori_komputasi_1 (int s) {
    maxSize = s;
    stackarray = new String[maxSize];
    top = 0;
}
    
    public void push (String j) {
        stackarray[top] = j;
    }
    
    public String pop() {
        return stackarray [top--];
    }
    
    public String peek() {
        return stackarray [top];
    }
    
    public boolean isEmpty() {
        return (top == 0);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    // kemal lagi sakit :( Q_Q
    
    public static void main(String[] args) {
       Teori_komputasi_1 theStack = new Teori_komputasi_1(10);
       String st;
       char kon;
       String state = "Gen";
//     theStack.push(10);
       Scanner sc = new Scanner (System.in);
        System.out.println("Masukan Inputan ");
        st = sc.next();
        int p = st.length();
        kon = st.charAt(0);
       
        switch(kon){
        case '1' :
        theStack.push("Gan");
        theStack.peek();
        break;
        
        case '0' :
        theStack.push("Gen");
        theStack.peek();
        break;
        
        
    }
        
        if(theStack.peek().equalsIgnoreCase("Gan")) {
            System.out.println(" ");
            System.out.println("Accepted");
        } else {
            System.out.println(" ");
            System.out.println("Failed");
        }
        System.out.println(" ");
        
    }
    
}
