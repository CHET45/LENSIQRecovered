package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class yjb {

    /* JADX INFO: renamed from: a */
    public static final l11<Object, Object> f101801a = new C15693a();

    /* JADX INFO: renamed from: yjb$a */
    public static final class C15693a implements l11<Object, Object> {
        @Override // p000.l11
        public boolean test(Object o1, Object o2) {
            return Objects.equals(o1, o2);
        }
    }

    private yjb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> l11<T, T> equalsPredicate() {
        return (l11<T, T>) f101801a;
    }

    public static int verifyPositive(int value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }

    public static long verifyPositive(long value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }
}
