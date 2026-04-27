package p000;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.eta;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wq7 implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: g */
    public static final String f95126g = "Icy-MetaData";

    /* JADX INFO: renamed from: h */
    public static final String f95127h = "1";

    /* JADX INFO: renamed from: i */
    public static final String f95128i = "IcyHeaders";

    /* JADX INFO: renamed from: j */
    public static final String f95129j = "icy-br";

    /* JADX INFO: renamed from: k */
    public static final String f95130k = "icy-genre";

    /* JADX INFO: renamed from: l */
    public static final String f95131l = "icy-name";

    /* JADX INFO: renamed from: m */
    public static final String f95132m = "icy-url";

    /* JADX INFO: renamed from: n */
    public static final String f95133n = "icy-pub";

    /* JADX INFO: renamed from: o */
    public static final String f95134o = "icy-metaint";

    /* JADX INFO: renamed from: a */
    public final int f95135a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f95136b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f95137c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f95138d;

    /* JADX INFO: renamed from: e */
    public final boolean f95139e;

    /* JADX INFO: renamed from: f */
    public final int f95140f;

    public wq7(int i, @hib String str, @hib String str2, @hib String str3, boolean z, int i2) {
        v80.checkArgument(i2 == -1 || i2 > 0);
        this.f95135a = i;
        this.f95136b = str;
        this.f95137c = str2;
        this.f95138d = str3;
        this.f95139e = z;
        this.f95140f = i2;
    }

    @hib
    public static wq7 parse(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List<String> list = map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        xh9.m25148w("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        xh9.m25148w("IcyHeaders", "Invalid bitrate header: " + str4);
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        xh9.m25148w("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        xh9.m25148w("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new wq7(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wq7.class != obj.getClass()) {
            return false;
        }
        wq7 wq7Var = (wq7) obj;
        return this.f95135a == wq7Var.f95135a && Objects.equals(this.f95136b, wq7Var.f95136b) && Objects.equals(this.f95137c, wq7Var.f95137c) && Objects.equals(this.f95138d, wq7Var.f95138d) && this.f95139e == wq7Var.f95139e && this.f95140f == wq7Var.f95140f;
    }

    public int hashCode() {
        int i = (527 + this.f95135a) * 31;
        String str = this.f95136b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95137c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95138d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f95139e ? 1 : 0)) * 31) + this.f95140f;
    }

    @Override // p000.eta.InterfaceC5464a
    public void populateMediaMetadata(hga.C6845b c6845b) {
        String str = this.f95137c;
        if (str != null) {
            c6845b.setStation(str);
        }
        String str2 = this.f95136b;
        if (str2 != null) {
            c6845b.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f95137c + "\", genre=\"" + this.f95136b + "\", bitrate=" + this.f95135a + ", metadataInterval=" + this.f95140f;
    }
}
