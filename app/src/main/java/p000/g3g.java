package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class g3g {

    /* JADX INFO: renamed from: o */
    public static final int f38335o = 1;

    /* JADX INFO: renamed from: p */
    public static final float f38336p = 0.0f;

    /* JADX INFO: renamed from: q */
    public static final float f38337q = 1.0f;

    /* JADX INFO: renamed from: r */
    public static final String f38338r = "android.text.TextDirectionHeuristic";

    /* JADX INFO: renamed from: s */
    public static final String f38339s = "android.text.TextDirectionHeuristics";

    /* JADX INFO: renamed from: t */
    public static final String f38340t = "LTR";

    /* JADX INFO: renamed from: u */
    public static final String f38341u = "RTL";

    /* JADX INFO: renamed from: v */
    public static boolean f38342v;

    /* JADX INFO: renamed from: w */
    @hib
    public static Constructor<StaticLayout> f38343w;

    /* JADX INFO: renamed from: x */
    @hib
    public static Object f38344x;

    /* JADX INFO: renamed from: a */
    public CharSequence f38345a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f38346b;

    /* JADX INFO: renamed from: c */
    public final int f38347c;

    /* JADX INFO: renamed from: e */
    public int f38349e;

    /* JADX INFO: renamed from: l */
    public boolean f38356l;

    /* JADX INFO: renamed from: n */
    @hib
    public h3g f38358n;

    /* JADX INFO: renamed from: d */
    public int f38348d = 0;

    /* JADX INFO: renamed from: f */
    public Layout.Alignment f38350f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g */
    public int f38351g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    public float f38352h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f38353i = 1.0f;

    /* JADX INFO: renamed from: j */
    public int f38354j = f38335o;

    /* JADX INFO: renamed from: k */
    public boolean f38355k = true;

    /* JADX INFO: renamed from: m */
    @hib
    public TextUtils.TruncateAt f38357m = null;

    /* JADX INFO: renamed from: g3g$a */
    public static class C6095a extends Exception {
        public C6095a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private g3g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f38345a = charSequence;
        this.f38346b = textPaint;
        this.f38347c = i;
        this.f38349e = charSequence.length();
    }

    private void createConstructorWithReflection() throws C6095a {
        if (f38342v) {
            return;
        }
        try {
            f38344x = this.f38356l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f38343w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f38342v = true;
        } catch (Exception e) {
            throw new C6095a(e);
        }
    }

    @efb
    public static g3g obtain(@efb CharSequence charSequence, @efb TextPaint textPaint, @h78(from = 0) int i) {
        return new g3g(charSequence, textPaint, i);
    }

    public StaticLayout build() throws C6095a {
        if (this.f38345a == null) {
            this.f38345a = "";
        }
        int iMax = Math.max(0, this.f38347c);
        CharSequence charSequenceEllipsize = this.f38345a;
        if (this.f38351g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f38346b, iMax, this.f38357m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f38349e);
        this.f38349e = iMin;
        if (this.f38356l && this.f38351g == 1) {
            this.f38350f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f38348d, iMin, this.f38346b, iMax);
        builderObtain.setAlignment(this.f38350f);
        builderObtain.setIncludePad(this.f38355k);
        builderObtain.setTextDirection(this.f38356l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f38357m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f38351g);
        float f = this.f38352h;
        if (f != 0.0f || this.f38353i != 1.0f) {
            builderObtain.setLineSpacing(f, this.f38353i);
        }
        if (this.f38351g > 1) {
            builderObtain.setHyphenationFrequency(this.f38354j);
        }
        h3g h3gVar = this.f38358n;
        if (h3gVar != null) {
            h3gVar.configure(builderObtain);
        }
        return builderObtain.build();
    }

    @efb
    @op1
    public g3g setAlignment(@efb Layout.Alignment alignment) {
        this.f38350f = alignment;
        return this;
    }

    @efb
    @op1
    public g3g setEllipsize(@hib TextUtils.TruncateAt truncateAt) {
        this.f38357m = truncateAt;
        return this;
    }

    @efb
    @op1
    public g3g setEnd(@h78(from = 0) int i) {
        this.f38349e = i;
        return this;
    }

    @efb
    @op1
    public g3g setHyphenationFrequency(int i) {
        this.f38354j = i;
        return this;
    }

    @efb
    @op1
    public g3g setIncludePad(boolean z) {
        this.f38355k = z;
        return this;
    }

    public g3g setIsRtl(boolean z) {
        this.f38356l = z;
        return this;
    }

    @efb
    @op1
    public g3g setLineSpacing(float f, float f2) {
        this.f38352h = f;
        this.f38353i = f2;
        return this;
    }

    @efb
    @op1
    public g3g setMaxLines(@h78(from = 0) int i) {
        this.f38351g = i;
        return this;
    }

    @efb
    @op1
    public g3g setStart(@h78(from = 0) int i) {
        this.f38348d = i;
        return this;
    }

    @efb
    @op1
    public g3g setStaticLayoutBuilderConfigurer(@hib h3g h3gVar) {
        this.f38358n = h3gVar;
        return this;
    }
}
