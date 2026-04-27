package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface aa3 {
    boolean addCues(ba3 ba3Var, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    kx7<n93> getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
