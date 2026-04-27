package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class a8i {

    /* JADX INFO: renamed from: e */
    public static final int f640e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f641f = 0;

    /* JADX INFO: renamed from: g */
    public static final float f642g = 1.0f;

    /* JADX INFO: renamed from: h */
    public static final a8i f643h = new a8i(0, 0);

    /* JADX INFO: renamed from: i */
    public static final String f644i = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: j */
    public static final String f645j = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: k */
    public static final String f646k = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: a */
    @h78(from = 0)
    public final int f647a;

    /* JADX INFO: renamed from: b */
    @h78(from = 0)
    public final int f648b;

    /* JADX INFO: renamed from: c */
    @h78(from = 0, m12174to = 359)
    @Deprecated
    public final int f649c;

    /* JADX INFO: renamed from: d */
    @y46(from = 0.0d, fromInclusive = false)
    public final float f650d;

    @ovh
    public a8i(@h78(from = 0) int i, @h78(from = 0) int i2) {
        this(i, i2, 1.0f);
    }

    @ovh
    public static a8i fromBundle(Bundle bundle) {
        return new a8i(bundle.getInt(f644i, 0), bundle.getInt(f645j, 0), bundle.getFloat(f646k, 1.0f));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8i)) {
            return false;
        }
        a8i a8iVar = (a8i) obj;
        return this.f647a == a8iVar.f647a && this.f648b == a8iVar.f648b && this.f650d == a8iVar.f650d;
    }

    public int hashCode() {
        return ((((217 + this.f647a) * 31) + this.f648b) * 31) + Float.floatToRawIntBits(this.f650d);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f647a;
        if (i != 0) {
            bundle.putInt(f644i, i);
        }
        int i2 = this.f648b;
        if (i2 != 0) {
            bundle.putInt(f645j, i2);
        }
        float f = this.f650d;
        if (f != 1.0f) {
            bundle.putFloat(f646k, f);
        }
        return bundle;
    }

    @ovh
    public a8i(@h78(from = 0) int i, @h78(from = 0) int i2, @y46(from = 0.0d, fromInclusive = false) float f) {
        this.f647a = i;
        this.f648b = i2;
        this.f649c = 0;
        this.f650d = f;
    }

    @ovh
    @Deprecated
    public a8i(@h78(from = 0) int i, @h78(from = 0) int i2, @h78(from = 0, m12174to = 359) int i3, @y46(from = 0.0d, fromInclusive = false) float f) {
        this(i, i2, f);
    }
}
