package p000;

import p000.aaf;

/* JADX INFO: loaded from: classes7.dex */
public final class baf<T> implements gkb<T> {

    /* JADX INFO: renamed from: a */
    public final aaf.InterfaceC0124d<T> f13187a;

    private baf(aaf.InterfaceC0124d<T> interfaceC0124d) {
        this.f13187a = interfaceC0124d;
    }

    public static <T> baf<T> forResource(aaf.InterfaceC0124d<T> interfaceC0124d) {
        return new baf<>(interfaceC0124d);
    }

    @Override // p000.gkb
    public T getObject() {
        return (T) aaf.get(this.f13187a);
    }

    @Override // p000.gkb
    public T returnObject(Object obj) {
        aaf.release(this.f13187a, obj);
        return null;
    }
}
