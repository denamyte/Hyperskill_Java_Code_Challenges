import java.util.List;

public class Test {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        List<Thread> threads = List.of(
                new Thread(someClass::method3),
                new Thread(someClass::method1)
        );
        threads.forEach(Thread::start);
    }
}

class SomeClass {

    public synchronized void method1() {
        System.out.println("a thread entered method1");
        method2();
        System.out.println("a thread left method1");
    }

    public synchronized void method2() {
        System.out.println("a thread entered method2");
        System.out.println("a thread left method2");
    }

    public synchronized void method3() {
        System.out.println("a thread entered method3");
        System.out.println("a thread left method3");
    }
}
