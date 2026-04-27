package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gj7 extends npd {

    /* JADX INFO: renamed from: L */
    public static final int f39933L = 0;

    /* JADX INFO: renamed from: M */
    public static final String f39934M = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: N */
    public static final String f39935N = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: Q */
    public static final gh1.InterfaceC6311a<gj7> f39936Q = new gh1.InterfaceC6311a() { // from class: fj7
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return gj7.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: F */
    public final boolean f39937F;

    /* JADX INFO: renamed from: H */
    public final boolean f39938H;

    public gj7() {
        this.f39937F = false;
        this.f39938H = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gj7 fromBundle(Bundle bundle) {
        u80.checkArgument(bundle.getInt(npd.f65212m, -1) == 0);
        return bundle.getBoolean(f39934M, false) ? new gj7(bundle.getBoolean(f39935N, false)) : new gj7();
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof gj7)) {
            return false;
        }
        gj7 gj7Var = (gj7) obj;
        return this.f39938H == gj7Var.f39938H && this.f39937F == gj7Var.f39937F;
    }

    public int hashCode() {
        return okb.hashCode(Boolean.valueOf(this.f39937F), Boolean.valueOf(this.f39938H));
    }

    public boolean isHeart() {
        return this.f39938H;
    }

    @Override // p000.npd
    public boolean isRated() {
        return this.f39937F;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(npd.f65212m, 0);
        bundle.putBoolean(f39934M, this.f39937F);
        bundle.putBoolean(f39935N, this.f39938H);
        return bundle;
    }

    public gj7(boolean z) {
        this.f39937F = true;
        this.f39938H = z;
    }
}
