package p000;

import io.reactivex.Observable;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC10162o3<T, U> extends Observable<U> implements ch7<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f66354a;

    public AbstractC10162o3(xub<T> xubVar) {
        this.f66354a = xubVar;
    }

    @Override // p000.ch7
    public final xub<T> source() {
        return this.f66354a;
    }
}
