package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface f19 {
    @gib
    default s9d getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(@yfb fab fabVar, int i);

    void onScroll(@yfb e19 e19Var, float f, @yfb y09 y09Var);

    void onVisibleItemsUpdated(@yfb e19 e19Var, @yfb y09 y09Var);
}
