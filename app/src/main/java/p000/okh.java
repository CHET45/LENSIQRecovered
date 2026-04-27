package p000;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class okh {

    /* JADX INFO: renamed from: A */
    public static final int f67930A = 3;

    /* JADX INFO: renamed from: B */
    public static final int f67931B = 1;

    /* JADX INFO: renamed from: C */
    public static final int f67932C = 2;

    /* JADX INFO: renamed from: D */
    public static final int f67933D = 3;

    /* JADX INFO: renamed from: E */
    public static final int f67934E = 0;

    /* JADX INFO: renamed from: F */
    public static final int f67935F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f67936G = 1;

    /* JADX INFO: renamed from: H */
    public static final int f67937H = 2;

    /* JADX INFO: renamed from: I */
    public static final int f67938I = 3;

    /* JADX INFO: renamed from: J */
    public static final int f67939J = 4;

    /* JADX INFO: renamed from: v */
    public static final int f67940v = -1;

    /* JADX INFO: renamed from: w */
    public static final float f67941w = Float.MAX_VALUE;

    /* JADX INFO: renamed from: x */
    public static final int f67942x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f67943y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f67944z = 2;

    /* JADX INFO: renamed from: a */
    @hib
    public String f67945a;

    /* JADX INFO: renamed from: b */
    public int f67946b;

    /* JADX INFO: renamed from: c */
    public boolean f67947c;

    /* JADX INFO: renamed from: d */
    public int f67948d;

    /* JADX INFO: renamed from: e */
    public boolean f67949e;

    /* JADX INFO: renamed from: k */
    public float f67955k;

    /* JADX INFO: renamed from: l */
    @hib
    public String f67956l;

    /* JADX INFO: renamed from: o */
    @hib
    public Layout.Alignment f67959o;

    /* JADX INFO: renamed from: p */
    @hib
    public Layout.Alignment f67960p;

    /* JADX INFO: renamed from: r */
    @hib
    public drg f67962r;

    /* JADX INFO: renamed from: t */
    @hib
    public String f67964t;

    /* JADX INFO: renamed from: u */
    @hib
    public String f67965u;

    /* JADX INFO: renamed from: f */
    public int f67950f = -1;

    /* JADX INFO: renamed from: g */
    public int f67951g = -1;

    /* JADX INFO: renamed from: h */
    public int f67952h = -1;

    /* JADX INFO: renamed from: i */
    public int f67953i = -1;

    /* JADX INFO: renamed from: j */
    public int f67954j = -1;

    /* JADX INFO: renamed from: m */
    public int f67957m = -1;

    /* JADX INFO: renamed from: n */
    public int f67958n = -1;

    /* JADX INFO: renamed from: q */
    public int f67961q = -1;

    /* JADX INFO: renamed from: s */
    public float f67963s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: okh$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10405a {
    }

    /* JADX INFO: renamed from: okh$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10406b {
    }

    /* JADX INFO: renamed from: okh$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10407c {
    }

    @op1
    public okh chain(@hib okh okhVar) {
        return inherit(okhVar, true);
    }

    public int getBackgroundColor() {
        if (this.f67949e) {
            return this.f67948d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    @hib
    public String getExtent() {
        return this.f67965u;
    }

    public int getFontColor() {
        if (this.f67947c) {
            return this.f67946b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @hib
    public String getFontFamily() {
        return this.f67945a;
    }

    public float getFontSize() {
        return this.f67955k;
    }

    public int getFontSizeUnit() {
        return this.f67954j;
    }

    @hib
    public String getId() {
        return this.f67956l;
    }

    @hib
    public Layout.Alignment getMultiRowAlign() {
        return this.f67960p;
    }

    @hib
    public String getOrigin() {
        return this.f67964t;
    }

    public int getRubyPosition() {
        return this.f67958n;
    }

    public int getRubyType() {
        return this.f67957m;
    }

    public float getShearPercentage() {
        return this.f67963s;
    }

    public int getStyle() {
        int i = this.f67952h;
        if (i == -1 && this.f67953i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f67953i == 1 ? 2 : 0);
    }

    @hib
    public Layout.Alignment getTextAlign() {
        return this.f67959o;
    }

    public boolean getTextCombine() {
        return this.f67961q == 1;
    }

    @hib
    public drg getTextEmphasis() {
        return this.f67962r;
    }

    public boolean hasBackgroundColor() {
        return this.f67949e;
    }

    public boolean hasFontColor() {
        return this.f67947c;
    }

    @op1
    public okh inherit(@hib okh okhVar) {
        return inherit(okhVar, false);
    }

    public boolean isLinethrough() {
        return this.f67950f == 1;
    }

    public boolean isUnderline() {
        return this.f67951g == 1;
    }

    @op1
    public okh setBackgroundColor(int i) {
        this.f67948d = i;
        this.f67949e = true;
        return this;
    }

    @op1
    public okh setBold(boolean z) {
        this.f67952h = z ? 1 : 0;
        return this;
    }

    @op1
    public okh setExtent(@hib String str) {
        this.f67965u = str;
        return this;
    }

    @op1
    public okh setFontColor(int i) {
        this.f67946b = i;
        this.f67947c = true;
        return this;
    }

    @op1
    public okh setFontFamily(@hib String str) {
        this.f67945a = str;
        return this;
    }

    @op1
    public okh setFontSize(float f) {
        this.f67955k = f;
        return this;
    }

    @op1
    public okh setFontSizeUnit(int i) {
        this.f67954j = i;
        return this;
    }

    @op1
    public okh setId(@hib String str) {
        this.f67956l = str;
        return this;
    }

    @op1
    public okh setItalic(boolean z) {
        this.f67953i = z ? 1 : 0;
        return this;
    }

    @op1
    public okh setLinethrough(boolean z) {
        this.f67950f = z ? 1 : 0;
        return this;
    }

    @op1
    public okh setMultiRowAlign(@hib Layout.Alignment alignment) {
        this.f67960p = alignment;
        return this;
    }

    @op1
    public okh setOrigin(@hib String str) {
        this.f67964t = str;
        return this;
    }

    @op1
    public okh setRubyPosition(int i) {
        this.f67958n = i;
        return this;
    }

    @op1
    public okh setRubyType(int i) {
        this.f67957m = i;
        return this;
    }

    @op1
    public okh setShearPercentage(float f) {
        this.f67963s = f;
        return this;
    }

    @op1
    public okh setTextAlign(@hib Layout.Alignment alignment) {
        this.f67959o = alignment;
        return this;
    }

    @op1
    public okh setTextCombine(boolean z) {
        this.f67961q = z ? 1 : 0;
        return this;
    }

    @op1
    public okh setTextEmphasis(@hib drg drgVar) {
        this.f67962r = drgVar;
        return this;
    }

    @op1
    public okh setUnderline(boolean z) {
        this.f67951g = z ? 1 : 0;
        return this;
    }

    @op1
    private okh inherit(@hib okh okhVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (okhVar != null) {
            if (!this.f67947c && okhVar.f67947c) {
                setFontColor(okhVar.f67946b);
            }
            if (this.f67952h == -1) {
                this.f67952h = okhVar.f67952h;
            }
            if (this.f67953i == -1) {
                this.f67953i = okhVar.f67953i;
            }
            if (this.f67945a == null && (str = okhVar.f67945a) != null) {
                this.f67945a = str;
            }
            if (this.f67950f == -1) {
                this.f67950f = okhVar.f67950f;
            }
            if (this.f67951g == -1) {
                this.f67951g = okhVar.f67951g;
            }
            if (this.f67958n == -1) {
                this.f67958n = okhVar.f67958n;
            }
            if (this.f67959o == null && (alignment2 = okhVar.f67959o) != null) {
                this.f67959o = alignment2;
            }
            if (this.f67960p == null && (alignment = okhVar.f67960p) != null) {
                this.f67960p = alignment;
            }
            if (this.f67961q == -1) {
                this.f67961q = okhVar.f67961q;
            }
            if (this.f67954j == -1) {
                this.f67954j = okhVar.f67954j;
                this.f67955k = okhVar.f67955k;
            }
            if (this.f67962r == null) {
                this.f67962r = okhVar.f67962r;
            }
            if (this.f67963s == Float.MAX_VALUE) {
                this.f67963s = okhVar.f67963s;
            }
            if (this.f67964t == null) {
                this.f67964t = okhVar.f67964t;
            }
            if (this.f67965u == null) {
                this.f67965u = okhVar.f67965u;
            }
            if (z && !this.f67949e && okhVar.f67949e) {
                setBackgroundColor(okhVar.f67948d);
            }
            if (z && this.f67957m == -1 && (i = okhVar.f67957m) != -1) {
                this.f67957m = i;
            }
        }
        return this;
    }
}
