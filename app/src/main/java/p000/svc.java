package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p000.eta;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class svc implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final int f83091a;

    /* JADX INFO: renamed from: b */
    public final String f83092b;

    /* JADX INFO: renamed from: c */
    public final String f83093c;

    /* JADX INFO: renamed from: d */
    public final int f83094d;

    /* JADX INFO: renamed from: e */
    public final int f83095e;

    /* JADX INFO: renamed from: f */
    public final int f83096f;

    /* JADX INFO: renamed from: g */
    public final int f83097g;

    /* JADX INFO: renamed from: h */
    public final byte[] f83098h;

    public svc(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f83091a = i;
        this.f83092b = str;
        this.f83093c = str2;
        this.f83094d = i2;
        this.f83095e = i3;
        this.f83096f = i4;
        this.f83097g = i5;
        this.f83098h = bArr;
    }

    public static svc fromPictureBlock(jhc jhcVar) {
        int i = jhcVar.readInt();
        String strNormalizeMimeType = rva.normalizeMimeType(jhcVar.readString(jhcVar.readInt(), StandardCharsets.US_ASCII));
        String string = jhcVar.readString(jhcVar.readInt());
        int i2 = jhcVar.readInt();
        int i3 = jhcVar.readInt();
        int i4 = jhcVar.readInt();
        int i5 = jhcVar.readInt();
        int i6 = jhcVar.readInt();
        byte[] bArr = new byte[i6];
        jhcVar.readBytes(bArr, 0, i6);
        return new svc(i, strNormalizeMimeType, string, i2, i3, i4, i5, bArr);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || svc.class != obj.getClass()) {
            return false;
        }
        svc svcVar = (svc) obj;
        return this.f83091a == svcVar.f83091a && this.f83092b.equals(svcVar.f83092b) && this.f83093c.equals(svcVar.f83093c) && this.f83094d == svcVar.f83094d && this.f83095e == svcVar.f83095e && this.f83096f == svcVar.f83096f && this.f83097g == svcVar.f83097g && Arrays.equals(this.f83098h, svcVar.f83098h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f83091a) * 31) + this.f83092b.hashCode()) * 31) + this.f83093c.hashCode()) * 31) + this.f83094d) * 31) + this.f83095e) * 31) + this.f83096f) * 31) + this.f83097g) * 31) + Arrays.hashCode(this.f83098h);
    }

    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        c6845b.maybeSetArtworkData(this.f83098h, this.f83091a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f83092b + ", description=" + this.f83093c;
    }
}
