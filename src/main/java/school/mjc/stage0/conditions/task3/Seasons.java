package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.tellTheSeasonByMonthNumber(-1);
    }
    public void tellTheSeasonByMonthNumber(int month) {
        switch (month){
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("wrong number!");
        }

    }
}
