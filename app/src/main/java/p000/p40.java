package p000;

/* JADX INFO: loaded from: classes.dex */
public interface p40<N> {

    /* JADX INFO: renamed from: p40$a */
    public static final class C10787a {
        @Deprecated
        public static <N> void onBeginChanges(@yfb p40<N> p40Var) {
            p40.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(@yfb p40<N> p40Var) {
            p40.super.onEndChanges();
        }
    }

    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i, N n);

    void insertTopDown(int i, N n);

    void move(int i, int i2, int i3);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int i, int i2);

    /* JADX INFO: renamed from: up */
    void mo14389up();
}
