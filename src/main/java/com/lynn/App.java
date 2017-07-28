package com.lynn;

import java.util.Scanner;
//java -classpath build/libs/groovy-1.0-SNAPSHOT.jar com.lynn.App
public class App {
    public static  void main(String[] args){
    int i=0;
        Scanner sc=new Scanner(System.in);
        while (++i>0){
            System.out.print(i +" item sysmte");
            TodoItem tem=new TodoItem(sc.nextLine());
            System.out.println(tem);
        }
    }
}
