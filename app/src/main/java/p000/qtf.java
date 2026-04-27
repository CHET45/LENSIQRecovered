package p000;

/* JADX INFO: loaded from: classes.dex */
public interface qtf<T> {

    /* JADX INFO: renamed from: qtf$a */
    public static final class C11694a {
        @gib
        @Deprecated
        public static <T> T merge(@yfb qtf<T> qtfVar, T t, T t2, T t3) {
            return (T) qtf.super.merge(t, t2, t3);
        }
    }

    boolean equivalent(T t, T t2);

    @gib
    default T merge(T t, T t2, T t3) {
        return null;
    }
}
