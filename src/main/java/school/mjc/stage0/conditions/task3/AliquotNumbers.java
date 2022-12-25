package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        AliquotNumbers an = new AliquotNumbers();
        an.isFirstAliquot(12, 16);
    }
    public void isFirstAliquot(int first, int second) {
        int sumOfDivisors = 0;
        for (int i = 1; i < first; i++) {
            if (first%i==0){
                sumOfDivisors += i;
            }
        }
        System.out.println(sumOfDivisors);
        if (second==sumOfDivisors){
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
