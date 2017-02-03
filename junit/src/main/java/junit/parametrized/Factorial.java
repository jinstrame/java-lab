package junit.parametrized;

@SuppressWarnings("WeakerAccess")
public class Factorial {
    public static int fact(int x) {
        if (x < 0)
            throw new IndexOutOfBoundsException();

        if (x == 0) return 1;

        if (x == 1) return 1;

        return x * fact(x - 1);
    }
}
