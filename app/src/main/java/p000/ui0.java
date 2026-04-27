package p000;

import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public final class ui0 implements xfg.InterfaceC15048c {

    /* JADX INFO: renamed from: a */
    @yfb
    public final xfg.InterfaceC15048c f88033a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final si0 f88034b;

    public ui0(@yfb xfg.InterfaceC15048c interfaceC15048c, @yfb si0 si0Var) {
        md8.checkNotNullParameter(interfaceC15048c, "delegate");
        md8.checkNotNullParameter(si0Var, "autoCloser");
        this.f88033a = interfaceC15048c;
        this.f88034b = si0Var;
    }

    @Override // p000.xfg.InterfaceC15048c
    @yfb
    public ti0 create(@yfb xfg.C15047b c15047b) {
        md8.checkNotNullParameter(c15047b, "configuration");
        return new ti0(this.f88033a.create(c15047b), this.f88034b);
    }
}
