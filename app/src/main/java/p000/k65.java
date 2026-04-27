package p000;

import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.Objects;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class k65 implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: g */
    @fdi
    public static final String f52644g = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: h */
    public static final String f52645h = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: i */
    @fdi
    public static final String f52646i = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: j */
    public static final C1213a f52647j = new C1213a.b().setSampleMimeType("application/id3").build();

    /* JADX INFO: renamed from: k */
    public static final C1213a f52648k = new C1213a.b().setSampleMimeType("application/x-scte35").build();

    /* JADX INFO: renamed from: a */
    public final String f52649a;

    /* JADX INFO: renamed from: b */
    public final String f52650b;

    /* JADX INFO: renamed from: c */
    public final long f52651c;

    /* JADX INFO: renamed from: d */
    public final long f52652d;

    /* JADX INFO: renamed from: e */
    public final byte[] f52653e;

    /* JADX INFO: renamed from: f */
    public int f52654f;

    public k65(String str, String str2, long j, long j2, byte[] bArr) {
        this.f52649a = str;
        this.f52650b = str2;
        this.f52651c = j;
        this.f52652d = j2;
        this.f52653e = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k65.class != obj.getClass()) {
            return false;
        }
        k65 k65Var = (k65) obj;
        return this.f52651c == k65Var.f52651c && this.f52652d == k65Var.f52652d && Objects.equals(this.f52649a, k65Var.f52649a) && Objects.equals(this.f52650b, k65Var.f52650b) && Arrays.equals(this.f52653e, k65Var.f52653e);
    }

    @Override // p000.eta.InterfaceC5464a
    @hib
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f52653e;
        }
        return null;
    }

    @Override // p000.eta.InterfaceC5464a
    @hib
    public C1213a getWrappedMetadataFormat() {
        String str = this.f52649a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f52648k;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f52647j;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f52654f == 0) {
            String str = this.f52649a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f52650b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f52651c;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f52652d;
            this.f52654f = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f52653e);
        }
        return this.f52654f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f52649a + ", id=" + this.f52652d + ", durationMs=" + this.f52651c + ", value=" + this.f52650b;
    }
}
