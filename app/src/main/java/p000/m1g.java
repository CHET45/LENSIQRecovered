package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m1g extends npd {

    /* JADX INFO: renamed from: L */
    public static final int f59652L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f59653M = 5;

    /* JADX INFO: renamed from: N */
    public static final String f59654N = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: Q */
    public static final String f59655Q = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: X */
    public static final gh1.InterfaceC6311a<m1g> f59656X = new gh1.InterfaceC6311a() { // from class: l1g
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return m1g.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: F */
    @h78(from = 1)
    public final int f59657F;

    /* JADX INFO: renamed from: H */
    public final float f59658H;

    public m1g(@h78(from = 1) int i) {
        u80.checkArgument(i > 0, "maxStars must be a positive integer");
        this.f59657F = i;
        this.f59658H = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m1g fromBundle(Bundle bundle) {
        u80.checkArgument(bundle.getInt(npd.f65212m, -1) == 2);
        int i = bundle.getInt(f59654N, 5);
        float f = bundle.getFloat(f59655Q, -1.0f);
        return f == -1.0f ? new m1g(i) : new m1g(i, f);
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof m1g)) {
            return false;
        }
        m1g m1gVar = (m1g) obj;
        return this.f59657F == m1gVar.f59657F && this.f59658H == m1gVar.f59658H;
    }

    @h78(from = 1)
    public int getMaxStars() {
        return this.f59657F;
    }

    public float getStarRating() {
        return this.f59658H;
    }

    public int hashCode() {
        return okb.hashCode(Integer.valueOf(this.f59657F), Float.valueOf(this.f59658H));
    }

    @Override // p000.npd
    public boolean isRated() {
        return this.f59658H != -1.0f;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(npd.f65212m, 2);
        bundle.putInt(f59654N, this.f59657F);
        bundle.putFloat(f59655Q, this.f59658H);
        return bundle;
    }

    public m1g(@h78(from = 1) int i, @y46(from = 0.0d) float f) {
        boolean z = false;
        u80.checkArgument(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        u80.checkArgument(z, "starRating is out of range [0, maxStars]");
        this.f59657F = i;
        this.f59658H = f;
    }
}
