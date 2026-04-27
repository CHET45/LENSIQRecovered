package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class wi1 {
    private wi1() {
    }

    @efb
    public static ByteBuffer extract(@efb owa owaVar) {
        q8j q8jVarM19069a = owaVar.m19069a();
        if (q8jVarM19069a.zzb().getStorageType() == 2) {
            return ((m8j) q8jVarM19069a).zza().asReadOnlyBuffer();
        }
        throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }
}
