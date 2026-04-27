package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a8j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f651a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f651a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f651a[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
