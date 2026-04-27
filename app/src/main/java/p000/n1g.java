package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n1g extends opd {

    /* JADX INFO: renamed from: j */
    public static final int f63022j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f63023k = 5;

    /* JADX INFO: renamed from: l */
    public static final String f63024l = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: m */
    public static final String f63025m = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: h */
    @h78(from = 1)
    public final int f63026h;

    /* JADX INFO: renamed from: i */
    public final float f63027i;

    public n1g(@h78(from = 1) int i) {
        v80.checkArgument(i > 0, "maxStars must be a positive integer");
        this.f63026h = i;
        this.f63027i = -1.0f;
    }

    @ovh
    public static n1g fromBundle(Bundle bundle) {
        v80.checkArgument(bundle.getInt(opd.f68277g, -1) == 2);
        int i = bundle.getInt(f63024l, 5);
        float f = bundle.getFloat(f63025m, -1.0f);
        return f == -1.0f ? new n1g(i) : new n1g(i, f);
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof n1g)) {
            return false;
        }
        n1g n1gVar = (n1g) obj;
        return this.f63026h == n1gVar.f63026h && this.f63027i == n1gVar.f63027i;
    }

    @h78(from = 1)
    public int getMaxStars() {
        return this.f63026h;
    }

    public float getStarRating() {
        return this.f63027i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f63026h), Float.valueOf(this.f63027i));
    }

    @Override // p000.opd
    public boolean isRated() {
        return this.f63027i != -1.0f;
    }

    @Override // p000.opd
    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(opd.f68277g, 2);
        bundle.putInt(f63024l, this.f63026h);
        bundle.putFloat(f63025m, this.f63027i);
        return bundle;
    }

    public n1g(@h78(from = 1) int i, @y46(from = 0.0d) float f) {
        boolean z = false;
        v80.checkArgument(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        v80.checkArgument(z, "starRating is out of range [0, maxStars]");
        this.f63026h = i;
        this.f63027i = f;
    }
}
