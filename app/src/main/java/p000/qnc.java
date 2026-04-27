package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qnc extends opd {

    /* JADX INFO: renamed from: i */
    public static final int f75016i = 1;

    /* JADX INFO: renamed from: j */
    public static final String f75017j = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: h */
    public final float f75018h;

    public qnc() {
        this.f75018h = -1.0f;
    }

    @ovh
    public static qnc fromBundle(Bundle bundle) {
        v80.checkArgument(bundle.getInt(opd.f68277g, -1) == 1);
        float f = bundle.getFloat(f75017j, -1.0f);
        return f == -1.0f ? new qnc() : new qnc(f);
    }

    public boolean equals(@hib Object obj) {
        return (obj instanceof qnc) && this.f75018h == ((qnc) obj).f75018h;
    }

    public float getPercent() {
        return this.f75018h;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f75018h));
    }

    @Override // p000.opd
    public boolean isRated() {
        return this.f75018h != -1.0f;
    }

    @Override // p000.opd
    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(opd.f68277g, 1);
        bundle.putFloat(f75017j, this.f75018h);
        return bundle;
    }

    public qnc(@y46(from = 0.0d, m25645to = ua2.f87251b) float f) {
        v80.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f75018h = f;
    }
}
