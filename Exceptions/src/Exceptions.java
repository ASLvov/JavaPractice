import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.*;

public class Exceptions {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int i=0;
        Throwable[] exceptions = new Throwable[]{new ArithmeticException(), new ArrayIndexOutOfBoundsException(),
                new ArrayStoreException(), new ClassCastException(), new ConcurrentModificationException(), new EmptyStackException(),
                new IllegalArgumentException(), new IllegalStateException(), new IllegalThreadStateException(),
                new IndexOutOfBoundsException(), new NegativeArraySizeException(), new NoSuchElementException(),
                new NullPointerException(), new NumberFormatException(), new SecurityException(), new StringIndexOutOfBoundsException(),
                new UnsupportedOperationException() };
        for (Throwable t : exceptions) {
            try {
                throw t;
            } catch (Throwable e) {
                System.out.println(++i + ". Поймано исключение " + e);
            }
            finally {
                System.out.println("--------------------------");
            }
        }
    }
}
