package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y34<T> implements jo5<T> {

    /* JADX INFO: renamed from: a */
    public hid<T> f100207a;

    public static <T> void setDelegate(hid<T> hidVar, hid<T> hidVar2) {
        s7d.checkNotNull(hidVar2);
        y34 y34Var = (y34) hidVar;
        if (y34Var.f100207a != null) {
            throw new IllegalStateException();
        }
        y34Var.f100207a = hidVar2;
    }

    /* JADX INFO: renamed from: a */
    public hid<T> m25636a() {
        return (hid) s7d.checkNotNull(this.f100207a);
    }

    @Override // p000.hid
    public T get() {
        hid<T> hidVar = this.f100207a;
        if (hidVar != null) {
            return hidVar.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public void setDelegatedProvider(hid<T> hidVar) {
        setDelegate(this, hidVar);
    }
}
