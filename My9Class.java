public class My9Class {
    public static void main(String[] args) {

        int limit = 5;
        int lastI = 7;

        for (int i = 0; i < limit; i++) {
            System.out.println("i არის: " + i);
            lastI = i;
        }
        System.out.println("ბოლო i = " + lastI);
    }
}

//პასუხი:
/*i არის: 0
i არის: 1
i არის: 2
i არის: 3
i არის: 4
ბოლო i = 4*/