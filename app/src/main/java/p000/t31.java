package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class t31 {
    private t31() {
    }

    @efb
    public static Bitmap extract(@efb owa owaVar) {
        q8j q8jVarM19069a = owaVar.m19069a();
        if (q8jVarM19069a.zzb().getStorageType() == 1) {
            return ((d8j) q8jVarM19069a).zza();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
