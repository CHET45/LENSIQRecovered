package p000;

import java.util.List;
import p000.e9f;

/* JADX INFO: loaded from: classes3.dex */
public class d97 implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f28819a;

    /* JADX INFO: renamed from: b */
    public final g97 f28820b;

    /* JADX INFO: renamed from: c */
    public final C15854yw f28821c;

    /* JADX INFO: renamed from: d */
    public final C16264zw f28822d;

    /* JADX INFO: renamed from: e */
    public final C4992dx f28823e;

    /* JADX INFO: renamed from: f */
    public final C4992dx f28824f;

    /* JADX INFO: renamed from: g */
    public final C15326xw f28825g;

    /* JADX INFO: renamed from: h */
    public final e9f.EnumC5208b f28826h;

    /* JADX INFO: renamed from: i */
    public final e9f.EnumC5209c f28827i;

    /* JADX INFO: renamed from: j */
    public final float f28828j;

    /* JADX INFO: renamed from: k */
    public final List<C15326xw> f28829k;

    /* JADX INFO: renamed from: l */
    @hib
    public final C15326xw f28830l;

    /* JADX INFO: renamed from: m */
    public final boolean f28831m;

    public d97(String str, g97 g97Var, C15854yw c15854yw, C16264zw c16264zw, C4992dx c4992dx, C4992dx c4992dx2, C15326xw c15326xw, e9f.EnumC5208b enumC5208b, e9f.EnumC5209c enumC5209c, float f, List<C15326xw> list, @hib C15326xw c15326xw2, boolean z) {
        this.f28819a = str;
        this.f28820b = g97Var;
        this.f28821c = c15854yw;
        this.f28822d = c16264zw;
        this.f28823e = c4992dx;
        this.f28824f = c4992dx2;
        this.f28825g = c15326xw;
        this.f28826h = enumC5208b;
        this.f28827i = enumC5209c;
        this.f28828j = f;
        this.f28829k = list;
        this.f28830l = c15326xw2;
        this.f28831m = z;
    }

    public e9f.EnumC5208b getCapType() {
        return this.f28826h;
    }

    @hib
    public C15326xw getDashOffset() {
        return this.f28830l;
    }

    public C4992dx getEndPoint() {
        return this.f28824f;
    }

    public C15854yw getGradientColor() {
        return this.f28821c;
    }

    public g97 getGradientType() {
        return this.f28820b;
    }

    public e9f.EnumC5209c getJoinType() {
        return this.f28827i;
    }

    public List<C15326xw> getLineDashPattern() {
        return this.f28829k;
    }

    public float getMiterLimit() {
        return this.f28828j;
    }

    public String getName() {
        return this.f28819a;
    }

    public C16264zw getOpacity() {
        return this.f28822d;
    }

    public C4992dx getStartPoint() {
        return this.f28823e;
    }

    public C15326xw getWidth() {
        return this.f28825g;
    }

    public boolean isHidden() {
        return this.f28831m;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new e97(go9Var, pr0Var, this);
    }
}
