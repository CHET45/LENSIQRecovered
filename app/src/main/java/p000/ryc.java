package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ryc {

    /* JADX INFO: renamed from: d */
    public static final ryc f80104d = new ryc(1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f80105e = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: f */
    public static final String f80106f = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    public final float f80107a;

    /* JADX INFO: renamed from: b */
    public final float f80108b;

    /* JADX INFO: renamed from: c */
    public final int f80109c;

    public ryc(@y46(from = 0.0d, fromInclusive = false) float f) {
        this(f, 1.0f);
    }

    @ovh
    public static ryc fromBundle(Bundle bundle) {
        return new ryc(bundle.getFloat(f80105e, 1.0f), bundle.getFloat(f80106f, 1.0f));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ryc.class != obj.getClass()) {
            return false;
        }
        ryc rycVar = (ryc) obj;
        return this.f80107a == rycVar.f80107a && this.f80108b == rycVar.f80108b;
    }

    @ovh
    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.f80109c);
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f80107a)) * 31) + Float.floatToRawIntBits(this.f80108b);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f80105e, this.f80107a);
        bundle.putFloat(f80106f, this.f80108b);
        return bundle;
    }

    public String toString() {
        return t0i.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f80107a), Float.valueOf(this.f80108b));
    }

    @ovh
    @yx1
    public ryc withPitch(@y46(from = 0.0d, fromInclusive = false) float f) {
        return new ryc(this.f80107a, f);
    }

    @yx1
    public ryc withSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
        return new ryc(f, this.f80108b);
    }

    public ryc(@y46(from = 0.0d, fromInclusive = false) float f, @y46(from = 0.0d, fromInclusive = false) float f2) {
        v80.checkArgument(f > 0.0f);
        v80.checkArgument(f2 > 0.0f);
        this.f80107a = f;
        this.f80108b = f2;
        this.f80109c = Math.round(f * 1000.0f);
    }
}
