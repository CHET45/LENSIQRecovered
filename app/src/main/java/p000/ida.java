package p000;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ida extends pl3 {

    /* JADX INFO: renamed from: a */
    @hib
    public final kda f46551a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f46552b;

    public ida(Throwable th, @hib kda kdaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(kdaVar == null ? null : kdaVar.f53649a);
        super(sb.toString(), th);
        this.f46551a = kdaVar;
        this.f46552b = x0i.f95978a >= 21 ? getDiagnosticInfoV21(th) : null;
    }

    @c5e(21)
    @hib
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
