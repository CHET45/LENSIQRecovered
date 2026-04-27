package p000;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class tu8 {

    /* JADX INFO: renamed from: a */
    public final List<sw2> f85962a;

    /* JADX INFO: renamed from: b */
    public final bn9 f85963b;

    /* JADX INFO: renamed from: c */
    public final String f85964c;

    /* JADX INFO: renamed from: d */
    public final long f85965d;

    /* JADX INFO: renamed from: e */
    public final EnumC13243a f85966e;

    /* JADX INFO: renamed from: f */
    public final long f85967f;

    /* JADX INFO: renamed from: g */
    @hib
    public final String f85968g;

    /* JADX INFO: renamed from: h */
    public final List<ev9> f85969h;

    /* JADX INFO: renamed from: i */
    public final C8540kx f85970i;

    /* JADX INFO: renamed from: j */
    public final int f85971j;

    /* JADX INFO: renamed from: k */
    public final int f85972k;

    /* JADX INFO: renamed from: l */
    public final int f85973l;

    /* JADX INFO: renamed from: m */
    public final float f85974m;

    /* JADX INFO: renamed from: n */
    public final float f85975n;

    /* JADX INFO: renamed from: o */
    public final int f85976o;

    /* JADX INFO: renamed from: p */
    public final int f85977p;

    /* JADX INFO: renamed from: q */
    @hib
    public final C7073hx f85978q;

    /* JADX INFO: renamed from: r */
    @hib
    public final C7646ix f85979r;

    /* JADX INFO: renamed from: s */
    @hib
    public final C15326xw f85980s;

    /* JADX INFO: renamed from: t */
    public final List<hs8<Float>> f85981t;

    /* JADX INFO: renamed from: u */
    public final EnumC13244b f85982u;

    /* JADX INFO: renamed from: v */
    public final boolean f85983v;

    /* JADX INFO: renamed from: w */
    @hib
    public final w91 f85984w;

    /* JADX INFO: renamed from: x */
    @hib
    public final wr4 f85985x;

    /* JADX INFO: renamed from: tu8$a */
    public enum EnumC13243a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX INFO: renamed from: tu8$b */
    public enum EnumC13244b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public tu8(List<sw2> list, bn9 bn9Var, String str, long j, EnumC13243a enumC13243a, long j2, @hib String str2, List<ev9> list2, C8540kx c8540kx, int i, int i2, int i3, float f, float f2, int i4, int i5, @hib C7073hx c7073hx, @hib C7646ix c7646ix, List<hs8<Float>> list3, EnumC13244b enumC13244b, @hib C15326xw c15326xw, boolean z, @hib w91 w91Var, @hib wr4 wr4Var) {
        this.f85962a = list;
        this.f85963b = bn9Var;
        this.f85964c = str;
        this.f85965d = j;
        this.f85966e = enumC13243a;
        this.f85967f = j2;
        this.f85968g = str2;
        this.f85969h = list2;
        this.f85970i = c8540kx;
        this.f85971j = i;
        this.f85972k = i2;
        this.f85973l = i3;
        this.f85974m = f;
        this.f85975n = f2;
        this.f85976o = i4;
        this.f85977p = i5;
        this.f85978q = c7073hx;
        this.f85979r = c7646ix;
        this.f85981t = list3;
        this.f85982u = enumC13244b;
        this.f85980s = c15326xw;
        this.f85983v = z;
        this.f85984w = w91Var;
        this.f85985x = wr4Var;
    }

    /* JADX INFO: renamed from: a */
    public bn9 m22852a() {
        return this.f85963b;
    }

    /* JADX INFO: renamed from: b */
    public List<hs8<Float>> m22853b() {
        return this.f85981t;
    }

    /* JADX INFO: renamed from: c */
    public List<ev9> m22854c() {
        return this.f85969h;
    }

    /* JADX INFO: renamed from: d */
    public EnumC13244b m22855d() {
        return this.f85982u;
    }

    /* JADX INFO: renamed from: e */
    public String m22856e() {
        return this.f85964c;
    }

    /* JADX INFO: renamed from: f */
    public long m22857f() {
        return this.f85967f;
    }

    /* JADX INFO: renamed from: g */
    public int m22858g() {
        return this.f85977p;
    }

    @hib
    public w91 getBlurEffect() {
        return this.f85984w;
    }

    @hib
    public wr4 getDropShadowEffect() {
        return this.f85985x;
    }

    public long getId() {
        return this.f85965d;
    }

    public EnumC13243a getLayerType() {
        return this.f85966e;
    }

    /* JADX INFO: renamed from: h */
    public int m22859h() {
        return this.f85976o;
    }

    @hib
    /* JADX INFO: renamed from: i */
    public String m22860i() {
        return this.f85968g;
    }

    public boolean isHidden() {
        return this.f85983v;
    }

    /* JADX INFO: renamed from: j */
    public List<sw2> m22861j() {
        return this.f85962a;
    }

    /* JADX INFO: renamed from: k */
    public int m22862k() {
        return this.f85973l;
    }

    /* JADX INFO: renamed from: l */
    public int m22863l() {
        return this.f85972k;
    }

    /* JADX INFO: renamed from: m */
    public int m22864m() {
        return this.f85971j;
    }

    /* JADX INFO: renamed from: n */
    public float m22865n() {
        return this.f85975n / this.f85963b.getDurationFrames();
    }

    @hib
    /* JADX INFO: renamed from: o */
    public C7073hx m22866o() {
        return this.f85978q;
    }

    @hib
    /* JADX INFO: renamed from: p */
    public C7646ix m22867p() {
        return this.f85979r;
    }

    @hib
    /* JADX INFO: renamed from: q */
    public C15326xw m22868q() {
        return this.f85980s;
    }

    /* JADX INFO: renamed from: r */
    public float m22869r() {
        return this.f85974m;
    }

    /* JADX INFO: renamed from: s */
    public C8540kx m22870s() {
        return this.f85970i;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m22856e());
        sb.append("\n");
        tu8 tu8VarLayerModelForId = this.f85963b.layerModelForId(m22857f());
        if (tu8VarLayerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(tu8VarLayerModelForId.m22856e());
            tu8 tu8VarLayerModelForId2 = this.f85963b.layerModelForId(tu8VarLayerModelForId.m22857f());
            while (tu8VarLayerModelForId2 != null) {
                sb.append("->");
                sb.append(tu8VarLayerModelForId2.m22856e());
                tu8VarLayerModelForId2 = this.f85963b.layerModelForId(tu8VarLayerModelForId2.m22857f());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m22854c().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m22854c().size());
            sb.append("\n");
        }
        if (m22864m() != 0 && m22863l() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m22864m()), Integer.valueOf(m22863l()), Integer.valueOf(m22862k())));
        }
        if (!this.f85962a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (sw2 sw2Var : this.f85962a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(sw2Var);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
