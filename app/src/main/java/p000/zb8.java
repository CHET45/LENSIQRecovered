package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class zb8 {

    /* JADX INFO: renamed from: a */
    @hib
    public String f104682a;

    @KeepForSdk
    public zb8(@hib String str) {
        this.f104682a = str;
    }

    public boolean equals(@hib Object obj) {
        if (obj instanceof zb8) {
            return Objects.equal(this.f104682a, ((zb8) obj).f104682a);
        }
        return false;
    }

    @hib
    @KeepForSdk
    public String getToken() {
        return this.f104682a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f104682a);
    }

    @efb
    public String toString() {
        return Objects.toStringHelper(this).add(es7.f33959h, this.f104682a).toString();
    }
}
