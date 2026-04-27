package p000;

import java.util.Arrays;
import p000.eta;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xq7 implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final byte[] f98972a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f98973b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f98974c;

    public xq7(byte[] bArr, @hib String str, @hib String str2) {
        this.f98972a = bArr;
        this.f98973b = str;
        this.f98974c = str2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xq7.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f98972a, ((xq7) obj).f98972a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f98972a);
    }

    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        String str = this.f98973b;
        if (str != null) {
            c6845b.setTitle(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f98973b, this.f98974c, Integer.valueOf(this.f98972a.length));
    }
}
