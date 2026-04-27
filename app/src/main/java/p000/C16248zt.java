package p000;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.qnh;

/* JADX INFO: renamed from: zt */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C16248zt implements fdc {

    /* JADX INFO: renamed from: m */
    public static final int f106023m = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f106024a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yvg f106025b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<C9041lz.c<swf>> f106026c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<C9041lz.c<ewc>> f106027d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final do6.InterfaceC4891b f106028e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final c64 f106029f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final C10071nv f106030g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final CharSequence f106031h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final yv8 f106032i;

    /* JADX INFO: renamed from: j */
    @gib
    public knh f106033j;

    /* JADX INFO: renamed from: k */
    public final boolean f106034k;

    /* JADX INFO: renamed from: l */
    public final int f106035l;

    /* JADX INFO: renamed from: zt$a */
    public static final class a extends tt8 implements oz6<do6, jp6, fp6, gp6, Typeface> {
        public a() {
            super(4);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ Typeface invoke(do6 do6Var, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var) {
            return m33528invokeDPcqOEQ(do6Var, jp6Var, fp6Var.m29578unboximpl(), gp6Var.m29848unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-DPcqOEQ, reason: not valid java name */
        public final Typeface m33528invokeDPcqOEQ(@gib do6 do6Var, @yfb jp6 jp6Var, int i, int i2) {
            i2g<Object> i2gVarMo28659resolveDPcqOEQ = C16248zt.this.getFontFamilyResolver().mo28659resolveDPcqOEQ(do6Var, jp6Var, i, i2);
            if (i2gVarMo28659resolveDPcqOEQ instanceof qnh.C11571b) {
                Object value = i2gVarMo28659resolveDPcqOEQ.getValue();
                md8.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            knh knhVar = new knh(i2gVarMo28659resolveDPcqOEQ, C16248zt.this.f106033j);
            C16248zt.this.f106033j = knhVar;
            return knhVar.getTypeface();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<lz$c<swf>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public C16248zt(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb c64 c64Var) {
        this.f106024a = str;
        this.f106025b = yvgVar;
        this.f106026c = list;
        this.f106027d = list2;
        this.f106028e = interfaceC4891b;
        this.f106029f = c64Var;
        C10071nv c10071nv = new C10071nv(1, c64Var.getDensity());
        this.f106030g = c10071nv;
        this.f106034k = !C1608au.getHasEmojiCompat(yvgVar) ? false : uy4.f89433a.getFontLoaded().getValue().booleanValue();
        this.f106035l = C1608au.m27881resolveTextDirectionHeuristicsHklW4sA(yvgVar.m33450getTextDirections_7Xco(), yvgVar.getLocaleList());
        a aVar = new a();
        cvg.setTextMotion(c10071nv, yvgVar.getTextMotion());
        swf swfVarApplySpanStyle = cvg.applySpanStyle(c10071nv, yvgVar.toSpanStyle(), aVar, c64Var, !((Collection) list).isEmpty());
        if (swfVarApplySpanStyle != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i = 0;
            while (i < size) {
                list.add(i == 0 ? new C9041lz.c<>(swfVarApplySpanStyle, 0, this.f106024a.length()) : this.f106026c.get(i - 1));
                i++;
            }
        }
        CharSequence charSequenceCreateCharSequence = C15801yt.createCharSequence(this.f106024a, this.f106030g.getTextSize(), this.f106025b, list, this.f106027d, this.f106029f, aVar, this.f106034k);
        this.f106031h = charSequenceCreateCharSequence;
        this.f106032i = new yv8(charSequenceCreateCharSequence, this.f106030g, this.f106035l);
    }

    @yfb
    public final CharSequence getCharSequence$ui_text_release() {
        return this.f106031h;
    }

    @yfb
    public final c64 getDensity() {
        return this.f106029f;
    }

    @yfb
    public final do6.InterfaceC4891b getFontFamilyResolver() {
        return this.f106028e;
    }

    @Override // p000.fdc
    public boolean getHasStaleResolvedFonts() {
        knh knhVar = this.f106033j;
        return (knhVar != null ? knhVar.isStaleResolvedFont() : false) || (!this.f106034k && C1608au.getHasEmojiCompat(this.f106025b) && uy4.f89433a.getFontLoaded().getValue().booleanValue());
    }

    @yfb
    public final yv8 getLayoutIntrinsics$ui_text_release() {
        return this.f106032i;
    }

    @Override // p000.fdc
    public float getMaxIntrinsicWidth() {
        return this.f106032i.getMaxIntrinsicWidth();
    }

    @Override // p000.fdc
    public float getMinIntrinsicWidth() {
        return this.f106032i.getMinIntrinsicWidth();
    }

    @yfb
    public final List<C9041lz.c<ewc>> getPlaceholders() {
        return this.f106027d;
    }

    @yfb
    public final List<C9041lz.c<swf>> getSpanStyles() {
        return this.f106026c;
    }

    @yfb
    public final yvg getStyle() {
        return this.f106025b;
    }

    @yfb
    public final String getText() {
        return this.f106024a;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.f106035l;
    }

    @yfb
    public final C10071nv getTextPaint$ui_text_release() {
        return this.f106030g;
    }
}
