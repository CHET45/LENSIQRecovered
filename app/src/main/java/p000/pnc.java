package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pnc extends npd {

    /* JADX INFO: renamed from: H */
    public static final int f71498H = 1;

    /* JADX INFO: renamed from: L */
    public static final String f71499L = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: M */
    public static final gh1.InterfaceC6311a<pnc> f71500M = new gh1.InterfaceC6311a() { // from class: onc
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return pnc.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: F */
    public final float f71501F;

    public pnc() {
        this.f71501F = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static pnc fromBundle(Bundle bundle) {
        u80.checkArgument(bundle.getInt(npd.f65212m, -1) == 1);
        float f = bundle.getFloat(f71499L, -1.0f);
        return f == -1.0f ? new pnc() : new pnc(f);
    }

    public boolean equals(@hib Object obj) {
        return (obj instanceof pnc) && this.f71501F == ((pnc) obj).f71501F;
    }

    public float getPercent() {
        return this.f71501F;
    }

    public int hashCode() {
        return okb.hashCode(Float.valueOf(this.f71501F));
    }

    @Override // p000.npd
    public boolean isRated() {
        return this.f71501F != -1.0f;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(npd.f65212m, 1);
        bundle.putFloat(f71499L, this.f71501F);
        return bundle;
    }

    public pnc(@y46(from = 0.0d, m25645to = ua2.f87251b) float f) {
        u80.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f71501F = f;
    }
}
