import net.jcip.annotations.*;

@NotThreadSafe
public class NonThread {
    private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}
