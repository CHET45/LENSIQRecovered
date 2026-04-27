package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.ip6;

/* JADX INFO: renamed from: ps */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class AbstractC11083ps implements xn6 {

    /* JADX INFO: renamed from: f */
    public static final int f71778f = 0;

    /* JADX INFO: renamed from: c */
    public final int f71779c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final a f71780d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ip6.C7556e f71781e;

    /* JADX INFO: renamed from: ps$a */
    public interface a {
        @gib
        Object awaitLoad(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps, @yfb zy2<? super Typeface> zy2Var);

        @gib
        Typeface loadBlocking(@yfb Context context, @yfb AbstractC11083ps abstractC11083ps);
    }

    @q64(message = "Replaced with fontVariation constructor", replaceWith = @i2e(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ AbstractC11083ps(int i, a aVar, jt3 jt3Var) {
        this(i, aVar);
    }

    @Override // p000.xn6
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    public final int mo30174getLoadingStrategyPKNRLFQ() {
        return this.f71779c;
    }

    @yfb
    public final a getTypefaceLoader() {
        return this.f71780d;
    }

    @yfb
    public final ip6.C7556e getVariationSettings() {
        return this.f71781e;
    }

    public /* synthetic */ AbstractC11083ps(int i, a aVar, ip6.C7556e c7556e, jt3 jt3Var) {
        this(i, aVar, c7556e);
    }

    private AbstractC11083ps(int i, a aVar, ip6.C7556e c7556e) {
        this.f71779c = i;
        this.f71780d = aVar;
        this.f71781e = c7556e;
    }

    private AbstractC11083ps(int i, a aVar) {
        this(i, aVar, new ip6.C7556e(new ip6.InterfaceC7552a[0]), null);
    }
}
