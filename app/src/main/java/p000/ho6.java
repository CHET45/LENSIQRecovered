package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.do6;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class ho6 {
    @yfb
    public static final do6.InterfaceC4891b createFontFamilyResolver(@yfb Context context) {
        return new fo6(new C12761ss(context), C14240vs.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @vb8
    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public static final do6.InterfaceC4891b emptyCacheFontFamilyResolver(@yfb Context context) {
        return new fo6(new C12761ss(context), null, new pnh(), new mo6(new ra0(), null, 2, null), null, 18, null);
    }

    @yfb
    /* JADX INFO: renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final i2g<Typeface> m30079resolveAsTypefaceWqqsr6A(@yfb do6.InterfaceC4891b interfaceC4891b, @gib do6 do6Var, @yfb jp6 jp6Var, int i, int i2) {
        i2g i2gVarMo28659resolveDPcqOEQ = interfaceC4891b.mo28659resolveDPcqOEQ(do6Var, jp6Var, i, i2);
        md8.checkNotNull(i2gVarMo28659resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return i2gVarMo28659resolveDPcqOEQ;
    }

    /* JADX INFO: renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ i2g m30080resolveAsTypefaceWqqsr6A$default(do6.InterfaceC4891b interfaceC4891b, do6 do6Var, jp6 jp6Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            do6Var = null;
        }
        if ((i3 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = gp6.f40694b.m29849getAllGVVA2EU();
        }
        return m30079resolveAsTypefaceWqqsr6A(interfaceC4891b, do6Var, jp6Var, i, i2);
    }

    @yfb
    public static final do6.InterfaceC4891b createFontFamilyResolver(@yfb Context context, @yfb e13 e13Var) {
        return new fo6(new C12761ss(context), C14240vs.AndroidFontResolveInterceptor(context), go6.getGlobalTypefaceRequestCache(), new mo6(go6.getGlobalAsyncTypefaceCache(), e13Var), null, 16, null);
    }
}
