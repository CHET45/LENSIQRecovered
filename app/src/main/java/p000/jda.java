package p000;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class jda extends ql3 {

    /* JADX INFO: renamed from: a */
    @hib
    public final lda f50353a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f50354b;

    /* JADX INFO: renamed from: c */
    public final int f50355c;

    public jda(Throwable th, @hib lda ldaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(ldaVar == null ? null : ldaVar.f57252a);
        super(sb.toString(), th);
        this.f50353a = ldaVar;
        this.f50354b = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f50355c = getErrorCodeV23(th);
    }

    @c5e(23)
    private static int getErrorCodeV23(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
