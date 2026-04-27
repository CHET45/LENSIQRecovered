package p000;

import p000.p7e;
import p000.rr2;

/* JADX INFO: loaded from: classes6.dex */
@is2
@p7e({p7e.EnumC10826a.f69935b})
public class v1b implements hlc {

    /* JADX INFO: renamed from: a */
    public final uee f89692a;

    /* JADX INFO: renamed from: b */
    public final int f89693b;

    @b28
    public v1b(uee ueeVar, @w8b(rr2.C12213c.f79064a) int i) {
        this.f89692a = ueeVar;
        this.f89693b = i;
    }

    @Override // p000.hlc
    public int getPayloadSizeLimit() {
        return this.f89692a.getMtu() - this.f89693b;
    }
}
