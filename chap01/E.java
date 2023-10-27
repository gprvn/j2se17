package chap01;
import java.util.Random;
/*
 * understanding package declaration and imports
 */
public class E {
    public static void main(final String... names){
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

/*
   ->   If import of Random class is missing in java file, compiler helpfully gives you an error that looks like this:
        error: cannot find symbol
   ->   This error could mean you made a typo in the name of the class or omnniting a needed import statement.
   ->   A statment is an instruction, and an import statement tell Java which package to look in for classes.
    ->  Since we didn't tell java where to look for Random class, it has no clue.
    ->  Trying this again with the import allows the code to compile.
 */