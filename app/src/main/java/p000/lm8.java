package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lm8 {

    /* JADX INFO: renamed from: a */
    public static final int f58233a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f58234b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f58235c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f58236d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f58237e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f58238f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f58239g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f58240h = 8;

    private lm8() {
    }

    /* JADX INFO: renamed from: a */
    public static String m16229a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(xnh.f98712c);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(C4584d2.f28242k);
                sb.append(iArr2[i2]);
                sb.append(C4584d2.f28243l);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(a18.f100c);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
