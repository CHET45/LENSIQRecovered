package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hj7 extends opd {

    /* JADX INFO: renamed from: j */
    public static final int f43805j = 0;

    /* JADX INFO: renamed from: k */
    public static final String f43806k = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: l */
    public static final String f43807l = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: h */
    public final boolean f43808h;

    /* JADX INFO: renamed from: i */
    public final boolean f43809i;

    public hj7() {
        this.f43808h = false;
        this.f43809i = false;
    }

    @ovh
    public static hj7 fromBundle(Bundle bundle) {
        v80.checkArgument(bundle.getInt(opd.f68277g, -1) == 0);
        return bundle.getBoolean(f43806k, false) ? new hj7(bundle.getBoolean(f43807l, false)) : new hj7();
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof hj7)) {
            return false;
        }
        hj7 hj7Var = (hj7) obj;
        return this.f43809i == hj7Var.f43809i && this.f43808h == hj7Var.f43808h;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f43808h), Boolean.valueOf(this.f43809i));
    }

    public boolean isHeart() {
        return this.f43809i;
    }

    @Override // p000.opd
    public boolean isRated() {
        return this.f43808h;
    }

    @Override // p000.opd
    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(opd.f68277g, 0);
        bundle.putBoolean(f43806k, this.f43808h);
        bundle.putBoolean(f43807l, this.f43809i);
        return bundle;
    }

    public hj7(boolean z) {
        this.f43808h = true;
        this.f43809i = z;
    }
}
