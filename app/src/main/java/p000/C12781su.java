package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.AbstractC11083ps;

/* JADX INFO: renamed from: su */
/* JADX INFO: loaded from: classes.dex */
public final class C12781su implements AbstractC11083ps.a {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C12781su f82854a = new C12781su();

    private C12781su() {
    }

    @Override // p000.AbstractC11083ps.a
    @gib
    public Object awaitLoad(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps, @yfb zy2<?> zy2Var) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // p000.AbstractC11083ps.a
    @gib
    public Typeface loadBlocking(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps) {
        AbstractC12286ru abstractC12286ru = abstractC11083ps instanceof AbstractC12286ru ? (AbstractC12286ru) abstractC11083ps : null;
        if (abstractC12286ru != null) {
            return abstractC12286ru.loadCached$ui_text_release(context);
        }
        return null;
    }
}
