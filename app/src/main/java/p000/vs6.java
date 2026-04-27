package p000;

import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vs6 extends q8b {

    /* JADX INFO: renamed from: a */
    public final q8b f92142a;

    public vs6(q8b q8bVar) {
        v7d.checkNotNull(q8bVar, "delegate can not be null");
        this.f92142a = q8bVar;
    }

    @Override // p000.q8b
    public String getServiceAuthority() {
        return this.f92142a.getServiceAuthority();
    }

    @Override // p000.q8b
    public void refresh() {
        this.f92142a.refresh();
    }

    @Override // p000.q8b
    public void shutdown() {
        this.f92142a.shutdown();
    }

    @Override // p000.q8b
    @Deprecated
    public void start(q8b.InterfaceC11376f interfaceC11376f) {
        this.f92142a.start(interfaceC11376f);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", this.f92142a).toString();
    }

    @Override // p000.q8b
    public void start(q8b.AbstractC11375e abstractC11375e) {
        this.f92142a.start(abstractC11375e);
    }
}
