package chap01;
/*
 * passing parameters to a java program
 */
public class D {
    public static void main(String... args){
        System.out.println("first-args "+args[0]);
        System.out.println("second-arg "+args[1]);
    }
}
