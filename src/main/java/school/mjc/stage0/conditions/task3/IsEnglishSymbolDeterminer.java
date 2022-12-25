package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        IsEnglishSymbolDeterminer isEnglishSymbolDeterminer = new IsEnglishSymbolDeterminer();
        isEnglishSymbolDeterminer.isEnglishSymbol('K');
    }
    public void isEnglishSymbol(char symbol) {
        char characterToLowerCase = Character.toLowerCase(symbol);
        if ('z' > characterToLowerCase && characterToLowerCase > 'a'){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
