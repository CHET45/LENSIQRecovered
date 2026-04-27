package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;
import p000.ip6;

/* JADX INFO: renamed from: ms */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C9493ms extends AbstractC12286ru {

    /* JADX INFO: renamed from: n */
    public static final int f61894n = 0;

    /* JADX INFO: renamed from: l */
    @yfb
    public final File f61895l;

    /* JADX INFO: renamed from: m */
    @gib
    public final String f61896m;

    public /* synthetic */ C9493ms(File file, jp6 jp6Var, int i, ip6.C7556e c7556e, jt3 jt3Var) {
        this(file, jp6Var, i, c7556e);
    }

    @Override // p000.AbstractC12286ru
    @gib
    public Typeface doLoad$ui_text_release(@gib Context context) {
        return anh.f11422a.createFromFile(this.f61895l, context, getVariationSettings());
    }

    @Override // p000.AbstractC12286ru
    @gib
    public String getCacheKey() {
        return this.f61896m;
    }

    @yfb
    public final File getFile() {
        return this.f61895l;
    }

    @yfb
    public String toString() {
        return "Font(file=" + this.f61895l + ", weight=" + getWeight() + ", style=" + ((Object) fp6.m29577toStringimpl(mo30175getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ C9493ms(File file, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, jt3 jt3Var) {
        this(file, (i2 & 2) != 0 ? jp6.f51403b.getNormal() : jp6Var, (i2 & 4) != 0 ? fp6.f37355b.m29582getNormal_LCdwA() : i, c7556e, null);
    }

    private C9493ms(File file, jp6 jp6Var, int i, ip6.C7556e c7556e) {
        super(jp6Var, i, c7556e, null);
        this.f61895l = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
