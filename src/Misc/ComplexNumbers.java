package Misc;

public class ComplexNumbers {
    int real;
    int imaginary;
    ComplexNumbers(int real, int imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public void plus(ComplexNumbers c){
        this.real=this.real+c.real;
        this.imaginary=this.imaginary+c.imaginary;
    }

    public void multiply(ComplexNumbers c){
        int r = this.real*c.real-this.imaginary*c.imaginary;
        this.imaginary=this.real*c.imaginary+this.imaginary*c.real;
        this.real =r;
    }

    public void print(){
        System.out.println(this.real+" + i"+this.imaginary);
    }
}
