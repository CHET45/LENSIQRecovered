package p000;

import android.media.Image;

/* JADX INFO: loaded from: classes5.dex */
@c5e(19)
public class lfa {
    private lfa() {
    }

    @efb
    public static Image extract(@efb owa owaVar) {
        q8j q8jVarM19069a = owaVar.m19069a();
        if (q8jVarM19069a.zzb().getStorageType() == 3) {
            return ((v8j) q8jVarM19069a).zza();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
