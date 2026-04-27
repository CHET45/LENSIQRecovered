package p000;

import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public class a97 implements sw2 {

    /* JADX INFO: renamed from: a */
    public final g97 f715a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f716b;

    /* JADX INFO: renamed from: c */
    public final C15854yw f717c;

    /* JADX INFO: renamed from: d */
    public final C16264zw f718d;

    /* JADX INFO: renamed from: e */
    public final C4992dx f719e;

    /* JADX INFO: renamed from: f */
    public final C4992dx f720f;

    /* JADX INFO: renamed from: g */
    public final String f721g;

    /* JADX INFO: renamed from: h */
    @hib
    public final C15326xw f722h;

    /* JADX INFO: renamed from: i */
    @hib
    public final C15326xw f723i;

    /* JADX INFO: renamed from: j */
    public final boolean f724j;

    public a97(String str, g97 g97Var, Path.FillType fillType, C15854yw c15854yw, C16264zw c16264zw, C4992dx c4992dx, C4992dx c4992dx2, C15326xw c15326xw, C15326xw c15326xw2, boolean z) {
        this.f715a = g97Var;
        this.f716b = fillType;
        this.f717c = c15854yw;
        this.f718d = c16264zw;
        this.f719e = c4992dx;
        this.f720f = c4992dx2;
        this.f721g = str;
        this.f722h = c15326xw;
        this.f723i = c15326xw2;
        this.f724j = z;
    }

    public C4992dx getEndPoint() {
        return this.f720f;
    }

    public Path.FillType getFillType() {
        return this.f716b;
    }

    public C15854yw getGradientColor() {
        return this.f717c;
    }

    public g97 getGradientType() {
        return this.f715a;
    }

    public String getName() {
        return this.f721g;
    }

    public C16264zw getOpacity() {
        return this.f718d;
    }

    public C4992dx getStartPoint() {
        return this.f719e;
    }

    public boolean isHidden() {
        return this.f724j;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new b97(go9Var, pr0Var, this);
    }
}
