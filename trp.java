
        package vn.viettuts.bienvadulieu;

public class trp {

    public void sayHello() {
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        vn.viettuts.bienvadulieu.trp bienLocal = new vn.viettuts.bienvadulieu.trp();
        bienLocal.sayHello();
    }
}