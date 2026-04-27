package p000;

import p000.jbi;

/* JADX INFO: loaded from: classes4.dex */
public class cbi<R> implements efh<R> {

    /* JADX INFO: renamed from: a */
    public final jbi.InterfaceC7853a f16201a;

    /* JADX INFO: renamed from: b */
    public jbi<R> f16202b;

    public cbi(jbi.InterfaceC7853a interfaceC7853a) {
        this.f16201a = interfaceC7853a;
    }

    @Override // p000.efh
    public afh<R> build(hh3 hh3Var, boolean z) {
        if (hh3Var == hh3.MEMORY_CACHE || !z) {
            return beb.get();
        }
        if (this.f16202b == null) {
            this.f16202b = new jbi<>(this.f16201a);
        }
        return this.f16202b;
    }
}
