package p000;

import p000.nfa;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface wb9 {
    float getAdjustedPlaybackSpeed(long j, long j2);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(nfa.C9855g c9855g);

    void setTargetLiveOffsetOverrideUs(long j);
}
