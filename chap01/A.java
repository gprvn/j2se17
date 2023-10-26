package chap01;
class A {
    String name;
}

class B {}

/**
 * if we have a public type, it needs to be matched with the file name;
 * public class B would not compile if file name is A.java
 * if we have a public class, then it should be declared in its own file,
 * if we have declared multiple classes in a single file, then only one class is allowed to be declared public
 */