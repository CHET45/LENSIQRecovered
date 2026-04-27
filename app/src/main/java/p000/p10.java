package p000;

import java.util.Arrays;
import java.util.Objects;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class p10 extends cr7 {

    /* JADX INFO: renamed from: f */
    public static final String f69351f = "APIC";

    /* JADX INFO: renamed from: b */
    public final String f69352b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f69353c;

    /* JADX INFO: renamed from: d */
    public final int f69354d;

    /* JADX INFO: renamed from: e */
    public final byte[] f69355e;

    public p10(String str, @hib String str2, int i, byte[] bArr) {
        super("APIC");
        this.f69352b = str;
        this.f69353c = str2;
        this.f69354d = i;
        this.f69355e = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p10.class != obj.getClass()) {
            return false;
        }
        p10 p10Var = (p10) obj;
        return this.f69354d == p10Var.f69354d && Objects.equals(this.f69352b, p10Var.f69352b) && Objects.equals(this.f69353c, p10Var.f69353c) && Arrays.equals(this.f69355e, p10Var.f69355e);
    }

    public int hashCode() {
        int i = (527 + this.f69354d) * 31;
        String str = this.f69352b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f69353c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f69355e);
    }

    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        c6845b.maybeSetArtworkData(this.f69355e, this.f69354d);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": mimeType=" + this.f69352b + ", description=" + this.f69353c;
    }
}
