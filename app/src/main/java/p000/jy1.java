package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@l42
public class jy1 {

    /* JADX INFO: renamed from: a */
    public final oy1 f52224a;

    /* JADX INFO: renamed from: b */
    public final String[][] f52225b;

    @b28
    public jy1(oy1 oy1Var, @w8b(a32.C0035h.f256f) String[][] strArr) {
        this.f52224a = oy1Var;
        this.f52225b = strArr;
    }

    public String[] getRecommendedConnectRuntimePermissions() {
        int length = 0;
        for (String[] strArr : this.f52225b) {
            length += strArr.length;
        }
        String[] strArr2 = new String[length];
        int i = 0;
        for (String[] strArr3 : this.f52225b) {
            int length2 = strArr3.length;
            int i2 = 0;
            while (i2 < length2) {
                strArr2[i] = strArr3[i2];
                i2++;
                i++;
            }
        }
        return strArr2;
    }

    public boolean isConnectRuntimePermissionGranted() {
        boolean zM19092a = true;
        for (String[] strArr : this.f52225b) {
            zM19092a &= this.f52224a.m19092a(strArr);
        }
        return zM19092a;
    }
}
