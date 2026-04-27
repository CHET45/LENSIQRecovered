package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.AbstractC11083ps;

/* JADX INFO: loaded from: classes.dex */
public final class z8b implements AbstractC11083ps.a {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final z8b f104379a = new z8b();

    private z8b() {
    }

    @Override // p000.AbstractC11083ps.a
    @gib
    public Object awaitLoad(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps, @yfb zy2<? super Typeface> zy2Var) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // p000.AbstractC11083ps.a
    @gib
    public Typeface loadBlocking(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps) {
        i84 i84Var = abstractC11083ps instanceof i84 ? (i84) abstractC11083ps : null;
        if (i84Var != null) {
            return i84Var.loadCached(context);
        }
        return null;
    }
}
