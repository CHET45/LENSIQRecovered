package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface oy8 {
    @gib
    default s9d getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(@yfb fab fabVar, int i);

    void onScroll(@yfb ny8 ny8Var, float f, @yfb fy8 fy8Var);

    void onVisibleItemsUpdated(@yfb ny8 ny8Var, @yfb fy8 fy8Var);
}
