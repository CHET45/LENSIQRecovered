package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import p000.ip6;

/* JADX INFO: renamed from: so */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C12706so extends AbstractC12286ru {

    /* JADX INFO: renamed from: o */
    public static final int f82406o = 0;

    /* JADX INFO: renamed from: l */
    @yfb
    public final AssetManager f82407l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final String f82408m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final String f82409n;

    public /* synthetic */ C12706so(AssetManager assetManager, String str, jp6 jp6Var, int i, ip6.C7556e c7556e, jt3 jt3Var) {
        this(assetManager, str, jp6Var, i, c7556e);
    }

    @Override // p000.AbstractC12286ru
    @gib
    public Typeface doLoad$ui_text_release(@gib Context context) {
        return anh.f11422a.createFromAssets(this.f82407l, this.f82408m, context, getVariationSettings());
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12706so)) {
            return false;
        }
        C12706so c12706so = (C12706so) obj;
        return md8.areEqual(this.f82408m, c12706so.f82408m) && md8.areEqual(getVariationSettings(), c12706so.getVariationSettings());
    }

    @yfb
    public final AssetManager getAssetManager() {
        return this.f82407l;
    }

    @Override // p000.AbstractC12286ru
    @yfb
    public String getCacheKey() {
        return this.f82409n;
    }

    @yfb
    public final String getPath() {
        return this.f82408m;
    }

    public int hashCode() {
        return (this.f82408m.hashCode() * 31) + getVariationSettings().hashCode();
    }

    @yfb
    public String toString() {
        return "Font(assetManager, path=" + this.f82408m + ", weight=" + getWeight() + ", style=" + ((Object) fp6.m29577toStringimpl(mo30175getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ C12706so(AssetManager assetManager, String str, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, jt3 jt3Var) {
        this(assetManager, str, (i2 & 4) != 0 ? jp6.f51403b.getNormal() : jp6Var, (i2 & 8) != 0 ? fp6.f37355b.m29582getNormal_LCdwA() : i, c7556e, null);
    }

    private C12706so(AssetManager assetManager, String str, jp6 jp6Var, int i, ip6.C7556e c7556e) {
        super(jp6Var, i, c7556e, null);
        this.f82407l = assetManager;
        this.f82408m = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.f82409n = "asset:" + str;
    }
}
