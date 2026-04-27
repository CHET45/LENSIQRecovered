package p000;

import android.text.style.TtsSpan;

/* JADX INFO: loaded from: classes.dex */
public final class tkh {
    @yfb
    public static final TtsSpan toSpan(@yfb skh skhVar) {
        if (skhVar instanceof q4i) {
            return toSpan((q4i) skhVar);
        }
        throw new ceb();
    }

    @yfb
    public static final TtsSpan toSpan(@yfb q4i q4iVar) {
        return new TtsSpan.VerbatimBuilder(q4iVar.getVerbatim()).build();
    }
}
