package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b3f<RespT> extends tn1<RespT> {
    public void disableAutoRequest() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isCancelled();

    @Override // p000.tn1
    public abstract boolean isReady();

    @Override // p000.tn1
    public abstract void request(int i);

    public abstract void setCompression(String str);

    @Override // p000.tn1
    public abstract void setMessageCompression(boolean z);

    public abstract void setOnCancelHandler(Runnable runnable);

    @lg5("https://github.com/grpc/grpc-java/issues/8467")
    public void setOnCloseHandler(Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.tn1
    public abstract void setOnReadyHandler(Runnable runnable);
}
