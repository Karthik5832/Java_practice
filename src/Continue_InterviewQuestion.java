package src;

public class Continue_InterviewQuestion {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("*");
            if (i % 2 == 0) {
//                break;
               continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
