package p000;

import p000.aga;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface vb9 {
    float getAdjustedPlaybackSpeed(long j, long j2);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(aga.C0239g c0239g);

    void setTargetLiveOffsetOverrideUs(long j);
}
