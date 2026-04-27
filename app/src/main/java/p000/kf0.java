package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface kf0 {
    ryc applyPlaybackParameters(ryc rycVar);

    boolean applySkipSilenceEnabled(boolean z);

    hf0[] getAudioProcessors();

    long getMediaDuration(long j);

    long getSkippedOutputFrameCount();
}
