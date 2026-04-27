package p000;

/* JADX INFO: loaded from: classes.dex */
public interface f3i {

    /* JADX INFO: renamed from: f3i$a */
    public static final class C5585a {
        @Deprecated
        public static <T> T getOrDefault(@yfb f3i f3iVar, @yfb q3i<T> q3iVar, T t) {
            return (T) f3i.super.getOrDefault(q3iVar, t);
        }
    }

    default <T> T getOrDefault(@yfb q3i<T> q3iVar, T t) {
        return t;
    }
}
