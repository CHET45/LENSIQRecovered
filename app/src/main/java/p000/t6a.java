package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t6a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final Throwable f83806a;

    public t6a(Throwable error) {
        this.f83806a = error;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        observer.onSubscribe(lf4.disposed());
        observer.onError(this.f83806a);
    }
}
