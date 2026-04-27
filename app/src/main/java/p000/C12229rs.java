package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: rs */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n235#2,3:175\n33#2,4:178\n238#2,2:182\n38#2:184\n240#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n461#2,4:197\n33#2,4:201\n465#2,3:205\n38#2:208\n468#2:209\n33#2,6:211\n1#3:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,4\n66#1:182,2\n66#1:184\n66#1:185\n69#1:186,3\n69#1:189,4\n69#1:193,2\n69#1:195\n69#1:196\n71#1:197,4\n71#1:201,4\n71#1:205,3\n71#1:208\n71#1:209\n76#1:211,6\n*E\n"})
@q64(message = "This is not supported after downloadable fonts.")
@e0g(parameters = 0)
public final class C12229rs implements InterfaceC13724uv {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final a f79176d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f79177e = 8;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final po6 f79178f = new po6();

    /* JADX INFO: renamed from: a */
    @yfb
    public final po6 f79179a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<xn6, Typeface> f79180b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final do6 f79181c;

    /* JADX INFO: renamed from: rs$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final po6 getFontMatcher() {
            return C12229rs.f79178f;
        }

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C12229rs(@p000.yfb p000.lo6 r8, @p000.yfb android.content.Context r9, @p000.gib java.util.List<p000.scc<p000.jp6, p000.fp6>> r10, @p000.yfb p000.po6 r11) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12229rs.<init>(lo6, android.content.Context, java.util.List, po6):void");
    }

    @Override // p000.zmh
    @yfb
    public do6 getFontFamily() {
        return this.f79181c;
    }

    @yfb
    public final po6 getFontMatcher() {
        return this.f79179a;
    }

    @Override // p000.InterfaceC13724uv
    @yfb
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo27877getNativeTypefacePYhJU0U(@yfb jp6 jp6Var, int i, int i2) {
        xn6 xn6Var = (xn6) v82.firstOrNull((List) this.f79179a.m31832matchFontRetOiIg(new ArrayList(this.f79180b.keySet()), jp6Var, i));
        if (xn6Var == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface = this.f79180b.get(xn6Var);
        if (typeface == null) {
            throw new IllegalStateException("Could not load typeface");
        }
        Object objM30099synthesizeTypefaceFxwP2eA = hp6.m30099synthesizeTypefaceFxwP2eA(i2, typeface, xn6Var, jp6Var, i);
        md8.checkNotNull(objM30099synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM30099synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ C12229rs(lo6 lo6Var, Context context, List list, po6 po6Var, int i, jt3 jt3Var) {
        this(lo6Var, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? f79178f : po6Var);
    }
}
