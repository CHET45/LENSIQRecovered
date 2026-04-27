package p000;

import java.util.Arrays;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class eti implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final byte[] f34021a;

    public eti(byte[] bArr) {
        this.f34021a = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eti.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f34021a, ((eti) obj).f34021a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f34021a);
    }

    public String toString() {
        return "XMP: " + t0i.toHexString(this.f34021a);
    }
}
