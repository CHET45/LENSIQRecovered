package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class v7d {
    private v7d() {
    }

    private static String badElementIndex(int index, int size, String desc) {
        if (index < 0) {
            return u8g.lenientFormat("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return u8g.lenientFormat("%s (%s) must be less than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndex(int index, int size, String desc) {
        if (index < 0) {
            return u8g.lenientFormat("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return u8g.lenientFormat("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndexes(int start, int end, int size) {
        return (start < 0 || start > size) ? badPositionIndex(start, size, "start index") : (end < 0 || end > size) ? badPositionIndex(end, size, "end index") : u8g.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    @op1
    public static int checkElementIndex(int index, int size) {
        return checkElementIndex(index, size, "index");
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference) {
        reference.getClass();
        return reference;
    }

    @op1
    public static int checkPositionIndex(int index, int size) {
        return checkPositionIndex(index, size, "index");
    }

    public static void checkPositionIndexes(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new IndexOutOfBoundsException(badPositionIndexes(start, end, size));
        }
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean expression, @wx1 Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    @op1
    public static int checkElementIndex(int index, int size, String desc) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(badElementIndex(index, size, desc));
        }
        return index;
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, @wx1 Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    @op1
    public static int checkPositionIndex(int index, int size, String desc) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(badPositionIndex(index, size, desc));
        }
        return index;
    }

    public static void checkState(boolean expression, @wx1 Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, errorMessageArgs));
    }

    public static void checkState(boolean expression, @wx1 String errorMessageTemplate, @wx1 Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, char p1) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p1) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, int p1) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p1) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, long p1) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Character.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, char p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Character.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p1, char p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, char p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Integer.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p1, int p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Long.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, char p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Long.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p1, long p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), p2));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, char p1, @wx1 Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), p2));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Character.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Character.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, int p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Character.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p1, char p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, int p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Integer.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Long.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, int p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Long.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p1, long p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), p2));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, int p1, @wx1 Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), p2));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Integer.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Character.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, long p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Character.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1, char p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, long p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Integer.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1, int p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Long.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, long p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Long.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1, long p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), p2));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, long p1, @wx1 Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), p2));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, Long.valueOf(p1), p2));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, char p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, Character.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, char p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, Character.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, char p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, Character.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, int p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, Integer.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, int p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, Integer.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, int p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, Integer.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, long p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, Long.valueOf(p2)));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, long p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, Long.valueOf(p2)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, long p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, Long.valueOf(p2)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, p2));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, p2));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3, @wx1 Object p4) {
        if (!expression) {
            throw new IllegalArgumentException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }

    @op1
    public static <T> T checkNotNull(@wx1 T reference, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3, @wx1 Object p4) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @wx1 Object p1, @wx1 Object p2, @wx1 Object p3, @wx1 Object p4) {
        if (!expression) {
            throw new IllegalStateException(u8g.lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
        }
    }
}
