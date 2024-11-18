//A-1 Ques23(a)

public class NumberPattern {
    public static void main(String[] args) {
        int num = 1; 
        int rows = 3; 

        for (int i = 1; i <= rows; i++) {
            int elementsInRow = 2 * i - 1;
            
            for (int j = 1; j <= elementsInRow; j++) {
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }
}