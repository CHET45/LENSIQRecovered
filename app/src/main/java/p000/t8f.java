package p000;

import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public class t8f implements sw2 {

    /* JADX INFO: renamed from: a */
    public final boolean f83988a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f83989b;

    /* JADX INFO: renamed from: c */
    public final String f83990c;

    /* JADX INFO: renamed from: d */
    @hib
    public final C14811ww f83991d;

    /* JADX INFO: renamed from: e */
    @hib
    public final C16264zw f83992e;

    /* JADX INFO: renamed from: f */
    public final boolean f83993f;

    public t8f(String str, boolean z, Path.FillType fillType, @hib C14811ww c14811ww, @hib C16264zw c16264zw, boolean z2) {
        this.f83990c = str;
        this.f83988a = z;
        this.f83989b = fillType;
        this.f83991d = c14811ww;
        this.f83992e = c16264zw;
        this.f83993f = z2;
    }

    @hib
    public C14811ww getColor() {
        return this.f83991d;
    }

    public Path.FillType getFillType() {
        return this.f83989b;
    }

    public String getName() {
        return this.f83990c;
    }

    @hib
    public C16264zw getOpacity() {
        return this.f83992e;
    }

    public boolean isHidden() {
        return this.f83993f;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new ou5(go9Var, pr0Var, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f83988a + '}';
    }
}
