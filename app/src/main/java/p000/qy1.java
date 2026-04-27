package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@l42
public class qy1 {

    /* JADX INFO: renamed from: a */
    public final oy1 f76291a;

    /* JADX INFO: renamed from: b */
    public final String[][] f76292b;

    @b28
    public qy1(oy1 oy1Var, @w8b(a32.C0035h.f255e) String[][] strArr) {
        this.f76291a = oy1Var;
        this.f76292b = strArr;
    }

    public String[] getRecommendedScanRuntimePermissions() {
        int length = 0;
        for (String[] strArr : this.f76292b) {
            length += strArr.length;
        }
        String[] strArr2 = new String[length];
        int i = 0;
        for (String[] strArr3 : this.f76292b) {
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

    public boolean isScanRuntimePermissionGranted() {
        boolean zM19092a = true;
        for (String[] strArr : this.f76292b) {
            zM19092a &= this.f76291a.m19092a(strArr);
        }
        return zM19092a;
    }
}
