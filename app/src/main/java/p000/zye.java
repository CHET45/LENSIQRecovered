package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface zye {

    /* JADX INFO: renamed from: zye$a */
    public interface InterfaceC16321a<T extends zye> {
        void onContinueLoadingRequested(T t);
    }

    boolean continueLoading(long j);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
