package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String[] args) {
        AlphabeticCharacters alphabeticCharacters = new AlphabeticCharacters();
        alphabeticCharacters.vowelDeterminer('h');
    }
    public void vowelDeterminer(char character) {
        if (character < 'a' || 'z' < character) {
            System.out.println("wrong alphabet!");
            return;
        } else if (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u'){
            System.out.println("Consonant");
        } else {
            System.out.println("Vowel");
        }

    }
}
