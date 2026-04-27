package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g19 {
    @ah5
    @yfb
    public static final f19 LazyListPrefetchStrategy(int i) {
        return new jw3(i);
    }

    public static /* synthetic */ f19 LazyListPrefetchStrategy$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return LazyListPrefetchStrategy(i);
    }
}
