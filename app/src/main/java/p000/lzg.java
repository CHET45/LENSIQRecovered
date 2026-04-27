package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lzg extends opd {

    /* JADX INFO: renamed from: j */
    public static final int f59466j = 3;

    /* JADX INFO: renamed from: k */
    public static final String f59467k = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: l */
    public static final String f59468l = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: h */
    public final boolean f59469h;

    /* JADX INFO: renamed from: i */
    public final boolean f59470i;

    public lzg() {
        this.f59469h = false;
        this.f59470i = false;
    }

    @ovh
    public static lzg fromBundle(Bundle bundle) {
        v80.checkArgument(bundle.getInt(opd.f68277g, -1) == 3);
        return bundle.getBoolean(f59467k, false) ? new lzg(bundle.getBoolean(f59468l, false)) : new lzg();
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof lzg)) {
            return false;
        }
        lzg lzgVar = (lzg) obj;
        return this.f59470i == lzgVar.f59470i && this.f59469h == lzgVar.f59469h;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f59469h), Boolean.valueOf(this.f59470i));
    }

    @Override // p000.opd
    public boolean isRated() {
        return this.f59469h;
    }

    public boolean isThumbsUp() {
        return this.f59470i;
    }

    @Override // p000.opd
    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(opd.f68277g, 3);
        bundle.putBoolean(f59467k, this.f59469h);
        bundle.putBoolean(f59468l, this.f59470i);
        return bundle;
    }

    public lzg(boolean z) {
        this.f59469h = true;
        this.f59470i = z;
    }
}
