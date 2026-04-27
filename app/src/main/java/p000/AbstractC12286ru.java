package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.ip6;

/* JADX INFO: renamed from: ru */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class AbstractC12286ru extends AbstractC11083ps {

    /* JADX INFO: renamed from: k */
    public static final int f79567k = 0;

    /* JADX INFO: renamed from: g */
    @yfb
    public final jp6 f79568g;

    /* JADX INFO: renamed from: h */
    public final int f79569h;

    /* JADX INFO: renamed from: i */
    public boolean f79570i;

    /* JADX INFO: renamed from: j */
    @gib
    public Typeface f79571j;

    public /* synthetic */ AbstractC12286ru(jp6 jp6Var, int i, ip6.C7556e c7556e, jt3 jt3Var) {
        this(jp6Var, i, c7556e);
    }

    @gib
    public abstract Typeface doLoad$ui_text_release(@gib Context context);

    @gib
    public abstract String getCacheKey();

    @Override // p000.xn6
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public final int mo30175getStyle_LCdwA() {
        return this.f79569h;
    }

    @gib
    public final Typeface getTypeface$ui_text_release() {
        return this.f79571j;
    }

    @Override // p000.xn6
    @yfb
    public final jp6 getWeight() {
        return this.f79568g;
    }

    @gib
    public final Typeface loadCached$ui_text_release(@yfb Context context) {
        if (!this.f79570i && this.f79571j == null) {
            this.f79571j = doLoad$ui_text_release(context);
        }
        this.f79570i = true;
        return this.f79571j;
    }

    public final void setTypeface$ui_text_release(@gib Typeface typeface) {
        this.f79571j = typeface;
    }

    private AbstractC12286ru(jp6 jp6Var, int i, ip6.C7556e c7556e) {
        super(oo6.f68233b.m31524getBlockingPKNRLFQ(), C12781su.f82854a, c7556e, null);
        this.f79568g = jp6Var;
        this.f79569h = i;
    }
}
