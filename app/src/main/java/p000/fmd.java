package p000;

import java.util.concurrent.Executor;
import p000.uae;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public final class fmd implements xfg.InterfaceC15048c {

    /* JADX INFO: renamed from: a */
    @yfb
    public final xfg.InterfaceC15048c f37136a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Executor f37137b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uae.InterfaceC13438g f37138c;

    public fmd(@yfb xfg.InterfaceC15048c interfaceC15048c, @yfb Executor executor, @yfb uae.InterfaceC13438g interfaceC13438g) {
        md8.checkNotNullParameter(interfaceC15048c, "delegate");
        md8.checkNotNullParameter(executor, "queryCallbackExecutor");
        md8.checkNotNullParameter(interfaceC13438g, "queryCallback");
        this.f37136a = interfaceC15048c;
        this.f37137b = executor;
        this.f37138c = interfaceC13438g;
    }

    @Override // p000.xfg.InterfaceC15048c
    @yfb
    public xfg create(@yfb xfg.C15047b c15047b) {
        md8.checkNotNullParameter(c15047b, "configuration");
        return new emd(this.f37136a.create(c15047b), this.f37137b, this.f37138c);
    }
}
