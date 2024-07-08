package src;

public class Pattern2 {

     void pattern2NestedLoop(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {

                if(i + j == n+1 || i == j) {
                    System.out.print(" X ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
     }
}
