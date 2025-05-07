public class My6class {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println(i + " java ");
        }
    }
}

//0 java
//1 java
//2 java
//3 java
//4 java

//ეს ნიშნავს: System.out.println(i + " java"); ეს ხაზი ეშვება იმდენჯერ სანამ ლოგიკა არ დაირღვევა. (ანუ i იზრდება 1-ით სანამ i < 5)