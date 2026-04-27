package p000;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pkh {

    /* JADX INFO: renamed from: A */
    public static final int f71186A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f71187B = 3;

    /* JADX INFO: renamed from: C */
    public static final int f71188C = 0;

    /* JADX INFO: renamed from: D */
    public static final int f71189D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f71190E = 1;

    /* JADX INFO: renamed from: F */
    public static final int f71191F = 2;

    /* JADX INFO: renamed from: G */
    public static final int f71192G = 3;

    /* JADX INFO: renamed from: H */
    public static final int f71193H = 4;

    /* JADX INFO: renamed from: t */
    public static final int f71194t = -1;

    /* JADX INFO: renamed from: u */
    public static final float f71195u = Float.MAX_VALUE;

    /* JADX INFO: renamed from: v */
    public static final int f71196v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f71197w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f71198x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f71199y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f71200z = 1;

    /* JADX INFO: renamed from: a */
    @hib
    public String f71201a;

    /* JADX INFO: renamed from: b */
    public int f71202b;

    /* JADX INFO: renamed from: c */
    public boolean f71203c;

    /* JADX INFO: renamed from: d */
    public int f71204d;

    /* JADX INFO: renamed from: e */
    public boolean f71205e;

    /* JADX INFO: renamed from: k */
    public float f71211k;

    /* JADX INFO: renamed from: l */
    @hib
    public String f71212l;

    /* JADX INFO: renamed from: o */
    @hib
    public Layout.Alignment f71215o;

    /* JADX INFO: renamed from: p */
    @hib
    public Layout.Alignment f71216p;

    /* JADX INFO: renamed from: r */
    @hib
    public erg f71218r;

    /* JADX INFO: renamed from: f */
    public int f71206f = -1;

    /* JADX INFO: renamed from: g */
    public int f71207g = -1;

    /* JADX INFO: renamed from: h */
    public int f71208h = -1;

    /* JADX INFO: renamed from: i */
    public int f71209i = -1;

    /* JADX INFO: renamed from: j */
    public int f71210j = -1;

    /* JADX INFO: renamed from: m */
    public int f71213m = -1;

    /* JADX INFO: renamed from: n */
    public int f71214n = -1;

    /* JADX INFO: renamed from: q */
    public int f71217q = -1;

    /* JADX INFO: renamed from: s */
    public float f71219s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: pkh$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10994a {
    }

    /* JADX INFO: renamed from: pkh$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10995b {
    }

    /* JADX INFO: renamed from: pkh$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10996c {
    }

    @op1
    public pkh chain(@hib pkh pkhVar) {
        return inherit(pkhVar, true);
    }

    public int getBackgroundColor() {
        if (this.f71205e) {
            return this.f71204d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int getFontColor() {
        if (this.f71203c) {
            return this.f71202b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @hib
    public String getFontFamily() {
        return this.f71201a;
    }

    public float getFontSize() {
        return this.f71211k;
    }

    public int getFontSizeUnit() {
        return this.f71210j;
    }

    @hib
    public String getId() {
        return this.f71212l;
    }

    @hib
    public Layout.Alignment getMultiRowAlign() {
        return this.f71216p;
    }

    public int getRubyPosition() {
        return this.f71214n;
    }

    public int getRubyType() {
        return this.f71213m;
    }

    public float getShearPercentage() {
        return this.f71219s;
    }

    public int getStyle() {
        int i = this.f71208h;
        if (i == -1 && this.f71209i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f71209i == 1 ? 2 : 0);
    }

    @hib
    public Layout.Alignment getTextAlign() {
        return this.f71215o;
    }

    public boolean getTextCombine() {
        return this.f71217q == 1;
    }

    @hib
    public erg getTextEmphasis() {
        return this.f71218r;
    }

    public boolean hasBackgroundColor() {
        return this.f71205e;
    }

    public boolean hasFontColor() {
        return this.f71203c;
    }

    @op1
    public pkh inherit(@hib pkh pkhVar) {
        return inherit(pkhVar, false);
    }

    public boolean isLinethrough() {
        return this.f71206f == 1;
    }

    public boolean isUnderline() {
        return this.f71207g == 1;
    }

    @op1
    public pkh setBackgroundColor(int i) {
        this.f71204d = i;
        this.f71205e = true;
        return this;
    }

    @op1
    public pkh setBold(boolean z) {
        this.f71208h = z ? 1 : 0;
        return this;
    }

    @op1
    public pkh setFontColor(int i) {
        this.f71202b = i;
        this.f71203c = true;
        return this;
    }

    @op1
    public pkh setFontFamily(@hib String str) {
        this.f71201a = str;
        return this;
    }

    @op1
    public pkh setFontSize(float f) {
        this.f71211k = f;
        return this;
    }

    @op1
    public pkh setFontSizeUnit(int i) {
        this.f71210j = i;
        return this;
    }

    @op1
    public pkh setId(@hib String str) {
        this.f71212l = str;
        return this;
    }

    @op1
    public pkh setItalic(boolean z) {
        this.f71209i = z ? 1 : 0;
        return this;
    }

    @op1
    public pkh setLinethrough(boolean z) {
        this.f71206f = z ? 1 : 0;
        return this;
    }

    @op1
    public pkh setMultiRowAlign(@hib Layout.Alignment alignment) {
        this.f71216p = alignment;
        return this;
    }

    @op1
    public pkh setRubyPosition(int i) {
        this.f71214n = i;
        return this;
    }

    @op1
    public pkh setRubyType(int i) {
        this.f71213m = i;
        return this;
    }

    @op1
    public pkh setShearPercentage(float f) {
        this.f71219s = f;
        return this;
    }

    @op1
    public pkh setTextAlign(@hib Layout.Alignment alignment) {
        this.f71215o = alignment;
        return this;
    }

    @op1
    public pkh setTextCombine(boolean z) {
        this.f71217q = z ? 1 : 0;
        return this;
    }

    @op1
    public pkh setTextEmphasis(@hib erg ergVar) {
        this.f71218r = ergVar;
        return this;
    }

    @op1
    public pkh setUnderline(boolean z) {
        this.f71207g = z ? 1 : 0;
        return this;
    }

    @op1
    private pkh inherit(@hib pkh pkhVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (pkhVar != null) {
            if (!this.f71203c && pkhVar.f71203c) {
                setFontColor(pkhVar.f71202b);
            }
            if (this.f71208h == -1) {
                this.f71208h = pkhVar.f71208h;
            }
            if (this.f71209i == -1) {
                this.f71209i = pkhVar.f71209i;
            }
            if (this.f71201a == null && (str = pkhVar.f71201a) != null) {
                this.f71201a = str;
            }
            if (this.f71206f == -1) {
                this.f71206f = pkhVar.f71206f;
            }
            if (this.f71207g == -1) {
                this.f71207g = pkhVar.f71207g;
            }
            if (this.f71214n == -1) {
                this.f71214n = pkhVar.f71214n;
            }
            if (this.f71215o == null && (alignment2 = pkhVar.f71215o) != null) {
                this.f71215o = alignment2;
            }
            if (this.f71216p == null && (alignment = pkhVar.f71216p) != null) {
                this.f71216p = alignment;
            }
            if (this.f71217q == -1) {
                this.f71217q = pkhVar.f71217q;
            }
            if (this.f71210j == -1) {
                this.f71210j = pkhVar.f71210j;
                this.f71211k = pkhVar.f71211k;
            }
            if (this.f71218r == null) {
                this.f71218r = pkhVar.f71218r;
            }
            if (this.f71219s == Float.MAX_VALUE) {
                this.f71219s = pkhVar.f71219s;
            }
            if (z && !this.f71205e && pkhVar.f71205e) {
                setBackgroundColor(pkhVar.f71204d);
            }
            if (z && this.f71213m == -1 && (i = pkhVar.f71213m) != -1) {
                this.f71213m = i;
            }
        }
        return this;
    }
}
