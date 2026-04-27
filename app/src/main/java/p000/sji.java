package p000;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class sji {

    /* JADX INFO: renamed from: A */
    public static final int f82055A = 1;

    /* JADX INFO: renamed from: r */
    public static final int f82056r = -1;

    /* JADX INFO: renamed from: s */
    public static final int f82057s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f82058t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f82059u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f82060v = 3;

    /* JADX INFO: renamed from: w */
    public static final int f82061w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f82062x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f82063y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f82064z = 0;

    /* JADX INFO: renamed from: f */
    @g92
    public int f82070f;

    /* JADX INFO: renamed from: h */
    public int f82072h;

    /* JADX INFO: renamed from: o */
    public float f82079o;

    /* JADX INFO: renamed from: a */
    public String f82065a = "";

    /* JADX INFO: renamed from: b */
    public String f82066b = "";

    /* JADX INFO: renamed from: c */
    public Set<String> f82067c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    public String f82068d = "";

    /* JADX INFO: renamed from: e */
    @hib
    public String f82069e = null;

    /* JADX INFO: renamed from: g */
    public boolean f82071g = false;

    /* JADX INFO: renamed from: i */
    public boolean f82073i = false;

    /* JADX INFO: renamed from: j */
    public int f82074j = -1;

    /* JADX INFO: renamed from: k */
    public int f82075k = -1;

    /* JADX INFO: renamed from: l */
    public int f82076l = -1;

    /* JADX INFO: renamed from: m */
    public int f82077m = -1;

    /* JADX INFO: renamed from: n */
    public int f82078n = -1;

    /* JADX INFO: renamed from: p */
    public int f82080p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f82081q = false;

    /* JADX INFO: renamed from: sji$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12630a {
    }

    /* JADX INFO: renamed from: sji$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12631b {
    }

    private static int updateScoreForMatch(int i, String str, @hib String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public int getBackgroundColor() {
        if (this.f82073i) {
            return this.f82072h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f82081q;
    }

    public int getFontColor() {
        if (this.f82071g) {
            return this.f82070f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @hib
    public String getFontFamily() {
        return this.f82069e;
    }

    public float getFontSize() {
        return this.f82079o;
    }

    public int getFontSizeUnit() {
        return this.f82078n;
    }

    public int getRubyPosition() {
        return this.f82080p;
    }

    public int getSpecificityScore(@hib String str, @hib String str2, Set<String> set, @hib String str3) {
        if (this.f82065a.isEmpty() && this.f82066b.isEmpty() && this.f82067c.isEmpty() && this.f82068d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.f82065a, str, 1073741824), this.f82066b, str2, 2), this.f82068d, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.f82067c)) {
            return 0;
        }
        return iUpdateScoreForMatch + (this.f82067c.size() * 4);
    }

    public int getStyle() {
        int i = this.f82076l;
        if (i == -1 && this.f82077m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f82077m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.f82073i;
    }

    public boolean hasFontColor() {
        return this.f82071g;
    }

    public boolean isLinethrough() {
        return this.f82074j == 1;
    }

    public boolean isUnderline() {
        return this.f82075k == 1;
    }

    @op1
    public sji setBackgroundColor(int i) {
        this.f82072h = i;
        this.f82073i = true;
        return this;
    }

    @op1
    public sji setBold(boolean z) {
        this.f82076l = z ? 1 : 0;
        return this;
    }

    @op1
    public sji setCombineUpright(boolean z) {
        this.f82081q = z;
        return this;
    }

    @op1
    public sji setFontColor(int i) {
        this.f82070f = i;
        this.f82071g = true;
        return this;
    }

    @op1
    public sji setFontFamily(@hib String str) {
        this.f82069e = str == null ? null : i80.toLowerCase(str);
        return this;
    }

    @op1
    public sji setFontSize(float f) {
        this.f82079o = f;
        return this;
    }

    @op1
    public sji setFontSizeUnit(int i) {
        this.f82078n = i;
        return this;
    }

    @op1
    public sji setItalic(boolean z) {
        this.f82077m = z ? 1 : 0;
        return this;
    }

    @op1
    public sji setLinethrough(boolean z) {
        this.f82074j = z ? 1 : 0;
        return this;
    }

    @op1
    public sji setRubyPosition(int i) {
        this.f82080p = i;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f82067c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f82065a = str;
    }

    public void setTargetTagName(String str) {
        this.f82066b = str;
    }

    public void setTargetVoice(String str) {
        this.f82068d = str;
    }

    @op1
    public sji setUnderline(boolean z) {
        this.f82075k = z ? 1 : 0;
        return this;
    }
}
