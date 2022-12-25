package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String[] args) {
        AlphabeticCharacters alphabeticCharacters = new AlphabeticCharacters();
        alphabeticCharacters.vowelDeterminer('y');
    }
    public void vowelDeterminer(char character) {
        char characterToLowerCase = Character.toLowerCase(character);
        if (characterToLowerCase < 'a' || 'z' < characterToLowerCase) {
            System.out.println("wrong alphabet!");
            return;
        } else if (characterToLowerCase != 'a' && characterToLowerCase != 'e'
                && characterToLowerCase != 'i' && characterToLowerCase != 'o'
                && characterToLowerCase != 'u'){
            System.out.println("Consonant");
        } else {
            System.out.println("Vowel");
        }

    }
}
