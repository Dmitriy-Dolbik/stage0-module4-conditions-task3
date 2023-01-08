package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        AliquotNumbers an = new AliquotNumbers();
        an.isFirstAliquot(5, 20);
    }
    public void isFirstAliquot(int first, int second) {
        if (second%first==0){
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
    /*public void isFirstAliquot(int first, int second) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= first; i++) {
            if (second%i==0){
                sumOfDivisors += i;
            }
        }
        if (first==sumOfDivisors){
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }*/
}
