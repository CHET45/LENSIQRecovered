package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface gc9 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final pja f39355a = new pja(new Object());

    InterfaceC6430gn getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    default void onTracksSelected(t1h t1hVar, pja pjaVar, n1e[] n1eVarArr, m6h m6hVar, pf5[] pf5VarArr) {
        onTracksSelected(n1eVarArr, m6hVar, pf5VarArr);
    }

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j, long j2, float f);

    default boolean shouldStartPlayback(t1h t1hVar, pja pjaVar, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    @Deprecated
    default void onTracksSelected(n1e[] n1eVarArr, m6h m6hVar, pf5[] pf5VarArr) {
        onTracksSelected(t1h.f83385a, f39355a, n1eVarArr, m6hVar, pf5VarArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        return shouldStartPlayback(t1h.f83385a, f39355a, j, f, z, j2);
    }
}
