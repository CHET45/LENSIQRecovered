package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class nt8 {

    /* JADX INFO: renamed from: c */
    public static final String f65645c = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: d */
    public static final String f65646d = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    @hib
    public final String f65647a;

    /* JADX INFO: renamed from: b */
    public final String f65648b;

    public nt8(@hib String str, String str2) {
        this.f65647a = t0i.normalizeLanguageCode(str);
        this.f65648b = str2;
    }

    public static nt8 fromBundle(Bundle bundle) {
        return new nt8(bundle.getString(f65645c), (String) v80.checkNotNull(bundle.getString(f65646d)));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nt8 nt8Var = (nt8) obj;
        return Objects.equals(this.f65647a, nt8Var.f65647a) && Objects.equals(this.f65648b, nt8Var.f65648b);
    }

    public int hashCode() {
        int iHashCode = this.f65648b.hashCode() * 31;
        String str = this.f65647a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f65647a;
        if (str != null) {
            bundle.putString(f65645c, str);
        }
        bundle.putString(f65646d, this.f65648b);
        return bundle;
    }
}
