package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z7i implements gh1 {

    /* JADX INFO: renamed from: C */
    public static final float f104339C = 1.0f;

    /* JADX INFO: renamed from: F */
    public static final z7i f104340F = new z7i(0, 0);

    /* JADX INFO: renamed from: H */
    public static final String f104341H = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: L */
    public static final String f104342L = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: M */
    public static final String f104343M = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: N */
    public static final String f104344N = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: Q */
    public static final gh1.InterfaceC6311a<z7i> f104345Q = new gh1.InterfaceC6311a() { // from class: y7i
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return z7i.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final int f104346e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f104347f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f104348m = 0;

    /* JADX INFO: renamed from: a */
    @h78(from = 0)
    public final int f104349a;

    /* JADX INFO: renamed from: b */
    @h78(from = 0)
    public final int f104350b;

    /* JADX INFO: renamed from: c */
    @h78(from = 0, m12174to = 359)
    public final int f104351c;

    /* JADX INFO: renamed from: d */
    @y46(from = 0.0d, fromInclusive = false)
    public final float f104352d;

    public z7i(@h78(from = 0) int i, @h78(from = 0) int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z7i lambda$static$0(Bundle bundle) {
        return new z7i(bundle.getInt(f104341H, 0), bundle.getInt(f104342L, 0), bundle.getInt(f104343M, 0), bundle.getFloat(f104344N, 1.0f));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7i)) {
            return false;
        }
        z7i z7iVar = (z7i) obj;
        return this.f104349a == z7iVar.f104349a && this.f104350b == z7iVar.f104350b && this.f104351c == z7iVar.f104351c && this.f104352d == z7iVar.f104352d;
    }

    public int hashCode() {
        return ((((((217 + this.f104349a) * 31) + this.f104350b) * 31) + this.f104351c) * 31) + Float.floatToRawIntBits(this.f104352d);
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f104341H, this.f104349a);
        bundle.putInt(f104342L, this.f104350b);
        bundle.putInt(f104343M, this.f104351c);
        bundle.putFloat(f104344N, this.f104352d);
        return bundle;
    }

    public z7i(@h78(from = 0) int i, @h78(from = 0) int i2, @h78(from = 0, m12174to = 359) int i3, @y46(from = 0.0d, fromInclusive = false) float f) {
        this.f104349a = i;
        this.f104350b = i2;
        this.f104351c = i3;
        this.f104352d = f;
    }
}
