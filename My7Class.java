public class My7Class {
        public static void main(String[] args) {
            int count=0;


            for (int i = 0; i < 5; i++) {
                System.out.println(i + " java ");
                count++; /* ეს ნიშნავს count გაიზარდოს იმდენჯერ რამდენჯერაც გაეშვება System.out.println(i + " java "); ანუ ეს ლოგიკა (int i = 0; i < 5; i++) რამდენჯერ იქნება True*/
            }
            System.out.println("count: " + count);
        }
    }

    //პასუხი:
/*0 java
1 java
2 java
3 java
4 java
count: 5*/



