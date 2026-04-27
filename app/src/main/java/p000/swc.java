package p000;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class swc {
    private swc() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> T[] m22268a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static <E extends Enum<E>> Class<E> m22269b(E e) {
        return e.getDeclaringClass();
    }

    /* JADX INFO: renamed from: c */
    public static <T> T[] m22270c(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> Map<K, V> m22271d(int expectedSize) {
        return pc2.createWithExpectedSize(expectedSize);
    }

    /* JADX INFO: renamed from: e */
    public static <E> Set<E> m22272e(int expectedSize) {
        return qc2.createWithExpectedSize(expectedSize);
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> Map<K, V> m22273f(int expectedSize) {
        return sc2.createWithExpectedSize(expectedSize);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Set<E> m22274g(int expectedSize) {
        return tc2.createWithExpectedSize(expectedSize);
    }

    /* JADX INFO: renamed from: h */
    public static <E> Set<E> m22275h() {
        return qc2.create();
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> Map<K, V> m22276i() {
        return pc2.create();
    }

    /* JADX INFO: renamed from: j */
    public static int m22277j(int exponent) {
        return exponent;
    }

    /* JADX INFO: renamed from: k */
    public static int m22278k(int iterations) {
        return iterations;
    }

    @yg8
    /* JADX INFO: renamed from: l */
    public static ft9 m22279l(ft9 mapMaker) {
        return mapMaker.weakKeys();
    }
}
