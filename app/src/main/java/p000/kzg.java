package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kzg extends npd {

    /* JADX INFO: renamed from: L */
    public static final int f55731L = 3;

    /* JADX INFO: renamed from: M */
    public static final String f55732M = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: N */
    public static final String f55733N = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: Q */
    public static final gh1.InterfaceC6311a<kzg> f55734Q = new gh1.InterfaceC6311a() { // from class: jzg
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return kzg.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: F */
    public final boolean f55735F;

    /* JADX INFO: renamed from: H */
    public final boolean f55736H;

    public kzg() {
        this.f55735F = false;
        this.f55736H = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kzg fromBundle(Bundle bundle) {
        u80.checkArgument(bundle.getInt(npd.f65212m, -1) == 3);
        return bundle.getBoolean(f55732M, false) ? new kzg(bundle.getBoolean(f55733N, false)) : new kzg();
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof kzg)) {
            return false;
        }
        kzg kzgVar = (kzg) obj;
        return this.f55736H == kzgVar.f55736H && this.f55735F == kzgVar.f55735F;
    }

    public int hashCode() {
        return okb.hashCode(Boolean.valueOf(this.f55735F), Boolean.valueOf(this.f55736H));
    }

    @Override // p000.npd
    public boolean isRated() {
        return this.f55735F;
    }

    public boolean isThumbsUp() {
        return this.f55736H;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(npd.f65212m, 3);
        bundle.putBoolean(f55732M, this.f55735F);
        bundle.putBoolean(f55733N, this.f55736H);
        return bundle;
    }

    public kzg(boolean z) {
        this.f55735F = true;
        this.f55736H = z;
    }
}
