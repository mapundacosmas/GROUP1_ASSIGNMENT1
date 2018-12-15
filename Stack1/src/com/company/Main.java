package com.company;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {

                // Creating a Stack
                Stack<String> grp1 = new Stack<>();

                // This pushes new items to the Stack
                grp1.push("Ramadhani");
                grp1.push("Cosmass");
                grp1.push("Moses");
                grp1.push("Said");
                grp1.push("Winstone");

                System.out.println("Stack => " + grp1);
                System.out.println();

                // This Pops items from the Stack
                String nameAtTop = grp1.pop();  // Throws EmptyStackException if the stack is empty
                System.out.println("Stack.pop() => " + nameAtTop);
                System.out.println("Current Stack => " + grp1);
                System.out.println();

                // This gets the item at the top of the stack without removing it
                nameAtTop = grp1.peek();
                System.out.println("Stack.peek() => " + nameAtTop);
                System.out.println("Current Stack => " + grp1);

            }


    }

