package chap01;

public class C {
    // public static void main(String[] args){
    //     System.out.println("Hello Java 17");
    // }
    public final static void main(final String... names){
        System.out.println("This looks different");
    }
}
/*
    ->  A java program begins execution with Main method.
    ->  The main() method is often called entry point into the program, because it is the starting point that the JVM looks for
        when it begins running a new program.

    ->  To compile java code with the javac command, the file must have extension .java.
    ->  The name of the file must match name of the public class
    ->  The result is the file of bytecode with the same name but with .class filename extension.
    -> Bytecode consists of instructions that the JVM knows how to execute.

    **** Main Method diagnosis ****
    public static void main(String[] args)

    *   keyword public is an access modifier, it declares the methods level of exposure to potential callers in the program.
        Naturally, public means full access from anywhere in the program.
    *   keyword static binds a method to its class so it ca be called by just the class name, Java does not need an object to
        call the static method.
    *   keyword void represents return type. A method that returns no data returns control to the caller silently.
        In general it's a good practice to use void for methods that change an objects state.
        In that sence, te main() changes the programs state from started to finished.
    *   main() parameter lists, reprsents as an array of java.lang.String objects.
        We can use any variable name along with any of these three formats:
        String[] args
        String option[]
        String... friends (varargs, variable arguments)

    ** While most modifiers, such as public and static are required for main(), there are some optional modifiers allowed:
            public final static void main(final String names[])
        In this example both final modifiers are optional, and the main() is valid entry point with or without  them.
 */