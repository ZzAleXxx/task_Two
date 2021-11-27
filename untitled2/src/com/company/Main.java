package com.company;

class Stack<T>  {
    private final int maxSize;
    private final T[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArr = (T[]) new Object[maxSize];
        this.top = -1;
    }
    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == maxSize - 1);
    }
    public void push(T elements) {
        if (this.isStackFull()) {
            System.out.println(("Stack is full"));
        }
        this.stackArr[++top] = elements;
    }
    public void pop() {
        if (this.isStackEmpty()) {
            System.out.println("Stack is empty");
        }
        T elements = this.stackArr[top--];
    }
    public T peek(){
        return this.stackArr[top];
    }
};

class FIGURE {
    public double calc_square() {
        return 0;
    }
    public String fig() {
        return null;
    }
///    public FIGURE(String fig) {
///        this.fig = fig;
///   }
}

class Triangle extends FIGURE {
    private double p, a, b, c, square;
    private String name_fig;
    //private String name_fig = "Треугольник";
    public Triangle(String name_fig, double a, double b, double c) {
        this.name_fig = name_fig;
        this.a = a;
        this.b = b;
        this.c = c;
///        super(fig);
   }
    public double calc_square() {
        p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
    public String fig() {
        return name_fig;
    }
}

class Circle extends FIGURE {
    private double square, r;
    private String name_fig = "круг";
    public Circle(double r){
        this.r = r;
    }
///    public Circle(String fig) {
///        super(fig);
///    }
    public double calc_square() {
        square = Math.PI * r * r;
        return square;
    }
    public String fig() {
        return name_fig;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<FIGURE> stack = new Stack<FIGURE>(2);
        Triangle f1 = new Triangle("треугольник",3, 5 ,4);
        stack.push(f1);
        Circle f2 = new Circle(4);
        stack.push(f2);
///        Stack<Integer> stack1 = new Stack<>(5);
///        stack1.push(8);
///        int m = stack1.peek();
///        System.out.println(m);

        while (!stack.isStackEmpty()){
            System.out.println();
            double sq = stack.peek().calc_square();
            String Name = stack.peek().fig();
            System.out.println("Фигура " + Name + ": площадь " + sq);
            stack.pop();
        }
    }
}

