package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vb7<K, T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final K f90558a;

    public vb7(@cib K k) {
        this.f90558a = k;
    }

    @cib
    public K getKey() {
        return this.f90558a;
    }
}
