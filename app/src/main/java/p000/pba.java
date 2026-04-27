package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pba implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: e */
    public static final String f70217e = "com.android.capture.fps";

    /* JADX INFO: renamed from: f */
    public static final String f70218f = "auxiliary.tracks.offset";

    /* JADX INFO: renamed from: g */
    public static final String f70219g = "auxiliary.tracks.length";

    /* JADX INFO: renamed from: h */
    public static final String f70220h = "auxiliary.tracks.map";

    /* JADX INFO: renamed from: i */
    public static final String f70221i = "auxiliary.tracks.interleaved";

    /* JADX INFO: renamed from: j */
    public static final byte f70222j = 0;

    /* JADX INFO: renamed from: k */
    public static final byte f70223k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f70224l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f70225m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f70226n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f70227o = 23;

    /* JADX INFO: renamed from: p */
    public static final int f70228p = 67;

    /* JADX INFO: renamed from: q */
    public static final int f70229q = 75;

    /* JADX INFO: renamed from: r */
    public static final int f70230r = 78;

    /* JADX INFO: renamed from: a */
    public final String f70231a;

    /* JADX INFO: renamed from: b */
    public final byte[] f70232b;

    /* JADX INFO: renamed from: c */
    public final int f70233c;

    /* JADX INFO: renamed from: d */
    public final int f70234d;

    public pba(String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("track types = ");
        xj8.m25234on(C4584d2.f28238g).appendTo(sb, (Iterable<? extends Object>) list);
        return sb.toString();
    }

    private static void validateData(String str, byte[] bArr, int i) {
        boolean z;
        byte b;
        str.hashCode();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                v80.checkArgument(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                v80.checkArgument(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                v80.checkArgument(z);
                break;
            case "auxiliary.tracks.map":
                v80.checkArgument(i == 0);
                break;
        }
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pba.class != obj.getClass()) {
            return false;
        }
        pba pbaVar = (pba) obj;
        return this.f70231a.equals(pbaVar.f70231a) && Arrays.equals(this.f70232b, pbaVar.f70232b) && this.f70233c == pbaVar.f70233c && this.f70234d == pbaVar.f70234d;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        v80.checkState(this.f70231a.equals(f70220h), "Metadata is not an auxiliary tracks map");
        byte b = this.f70232b[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(this.f70232b[i + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((((((527 + this.f70231a.hashCode()) * 31) + Arrays.hashCode(this.f70232b)) * 31) + this.f70233c) * 31) + this.f70234d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f70234d
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            jhc r0 = new jhc
            byte[] r1 = r3.f70232b
            r0.<init>(r1)
            long r0 = r0.readUnsignedLongToLong()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f70232b
            r1 = 0
            r0 = r0[r1]
            int r0 = java.lang.Byte.toUnsignedInt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f70232b
            int r0 = p000.rd8.fromByteArray(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f70232b
            int r0 = p000.rd8.fromByteArray(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f70232b
            java.lang.String r0 = p000.t0i.fromUtf8Bytes(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f70231a
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.getAuxiliaryTrackTypesFromMap()
            java.lang.String r0 = getFormattedValueForAuxiliaryTracksMap(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f70232b
            java.lang.String r0 = p000.t0i.toHexString(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r2 = r3.f70231a
            r1.append(r2)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pba.toString():java.lang.String");
    }

    public pba(String str, byte[] bArr, int i, int i2) {
        validateData(str, bArr, i2);
        this.f70231a = str;
        this.f70232b = bArr;
        this.f70233c = i;
        this.f70234d = i2;
    }
}
