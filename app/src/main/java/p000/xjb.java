package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xjb {

    /* JADX INFO: renamed from: a */
    public static final m11<Object, Object> f98234a = new C15162a();

    /* JADX INFO: renamed from: xjb$a */
    public static final class C15162a implements m11<Object, Object> {
        @Override // p000.m11
        public boolean test(Object obj, Object obj2) {
            return xjb.equals(obj, obj2);
        }
    }

    private xjb() {
        throw new IllegalStateException("No instances!");
    }

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> m11<T, T> equalsPredicate() {
        return (m11<T, T>) f98234a;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j, String str) {
        throw new InternalError("Null check on a primitive: " + str);
    }

    public static long verifyPositive(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
