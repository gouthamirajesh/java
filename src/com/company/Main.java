package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main
{
     void meth1()
     {
          System.out.println("hi");
     }
     void meth2()
     {
          int x=10;
          int y=20;
          System.out.println("addition: "+(x+y));
     }
     void meth3()
     {
          TreeSet<Integer> ts= new TreeSet<>();
          ts.add(10);
          ts.add(50);
          ts.add(30);
          ts.add(20);
          ts.add(40);
          System.out.println(ts);

          Iterator<Integer> i= ts.descendingIterator();
          while (i.hasNext())
          {
               System.out.println(i.next());
          }
     }
}

