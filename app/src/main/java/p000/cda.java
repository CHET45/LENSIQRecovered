package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface cda {
    ryc getPlaybackParameters();

    long getPositionUs();

    default boolean hasSkippedSilenceSinceLastCall() {
        return false;
    }

    void setPlaybackParameters(ryc rycVar);
}
