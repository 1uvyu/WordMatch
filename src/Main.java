import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
    }

    public static int read() throws FileNotFoundException
    {
        int score = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        While
    }
}
