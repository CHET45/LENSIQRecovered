package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,505:1\n31#2,6:506\n31#2,6:512\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n177#1:506,6\n193#1:512,6\n*E\n"})
@e0g(parameters = 0)
public final class p9d {

    /* JADX INFO: renamed from: e */
    public static final int f70108e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final g6b<Object> f70109a = fkb.mutableObjectLongMapOf();

    /* JADX INFO: renamed from: b */
    @yfb
    public final g6b<Object> f70110b = fkb.mutableObjectLongMapOf();

    /* JADX INFO: renamed from: c */
    public long f70111c;

    /* JADX INFO: renamed from: d */
    public long f70112d;

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateAverageTime(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = 4;
        return (j / j3) + ((j2 / j3) * ((long) 3));
    }

    public final long getAverageCompositionTimeNanos() {
        return this.f70111c;
    }

    @yfb
    public final g6b<Object> getAverageCompositionTimeNanosByContentType() {
        return this.f70109a;
    }

    public final long getAverageMeasureTimeNanos() {
        return this.f70112d;
    }

    @yfb
    public final g6b<Object> getAverageMeasureTimeNanosByContentType() {
        return this.f70110b;
    }

    public final void recordCompositionTiming$foundation_release(@gib Object obj, @yfb ny6<bth> ny6Var) {
        long jNanoTime = System.nanoTime();
        ny6Var.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            getAverageCompositionTimeNanosByContentType().set(obj, calculateAverageTime(jNanoTime2, getAverageCompositionTimeNanosByContentType().getOrDefault(obj, 0L)));
        }
        this.f70111c = calculateAverageTime(jNanoTime2, getAverageCompositionTimeNanos());
    }

    public final void recordMeasureTiming$foundation_release(@gib Object obj, @yfb ny6<bth> ny6Var) {
        long jNanoTime = System.nanoTime();
        ny6Var.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            getAverageMeasureTimeNanosByContentType().set(obj, calculateAverageTime(jNanoTime2, getAverageMeasureTimeNanosByContentType().getOrDefault(obj, 0L)));
        }
        this.f70112d = calculateAverageTime(jNanoTime2, getAverageMeasureTimeNanos());
    }
}
