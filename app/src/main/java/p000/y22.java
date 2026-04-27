package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y22<ReqT> extends tn1<ReqT> {
    public abstract void cancel(@eib String str, @eib Throwable th);

    public void disableAutoRequestWithInitial(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.tn1
    public abstract boolean isReady();

    @Override // p000.tn1
    public abstract void request(int i);

    @Override // p000.tn1
    public abstract void setMessageCompression(boolean z);

    @Override // p000.tn1
    public abstract void setOnReadyHandler(Runnable runnable);
}
