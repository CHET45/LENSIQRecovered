package p000;

import androidx.media3.exoplayer.C1233k;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface yye {

    /* JADX INFO: renamed from: yye$a */
    public interface InterfaceC15893a<T extends yye> {
        void onContinueLoadingRequested(T t);
    }

    boolean continueLoading(C1233k c1233k);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
