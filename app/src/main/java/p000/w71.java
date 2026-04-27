package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class w71<T> extends y61<T> {
    @Override // p000.pxb
    public void onError(Throwable t) {
        this.f100455a = null;
        this.f100456b = t;
        countDown();
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f100455a = t;
    }
}
