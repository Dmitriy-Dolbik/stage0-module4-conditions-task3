package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        IsEnglishSymbolDeterminer isEnglishSymbolDeterminer = new IsEnglishSymbolDeterminer();
        isEnglishSymbolDeterminer.isEnglishSymbol('k');
    }
    public void isEnglishSymbol(char symbol) {
        if ('z' > symbol && symbol > 'a'){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
