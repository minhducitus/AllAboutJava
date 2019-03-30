package com.java.excercises.Composition;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        System.out.println("Default Constructor was called");
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int [] getXY(){
        return new int[] {this.x, this.y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(int x, int y){
        double res;
        res = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return res;
    }

    public double distance(MyPoint myPoint){
        double res;
        res = Math.sqrt(Math.pow(this.x - myPoint.getX(),2) + Math.pow(this.y - myPoint.getY(),2));
        return res;
    }

    public double distance(){
        double res;
        res = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return res;
    }


}
