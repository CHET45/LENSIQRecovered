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

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rji {

    /* JADX INFO: renamed from: A */
    public static final int f78487A = 1;

    /* JADX INFO: renamed from: r */
    public static final int f78488r = -1;

    /* JADX INFO: renamed from: s */
    public static final int f78489s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f78490t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f78491u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f78492v = 3;

    /* JADX INFO: renamed from: w */
    public static final int f78493w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f78494x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f78495y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f78496z = 0;

    /* JADX INFO: renamed from: f */
    @g92
    public int f78502f;

    /* JADX INFO: renamed from: h */
    public int f78504h;

    /* JADX INFO: renamed from: o */
    public float f78511o;

    /* JADX INFO: renamed from: a */
    public String f78497a = "";

    /* JADX INFO: renamed from: b */
    public String f78498b = "";

    /* JADX INFO: renamed from: c */
    public Set<String> f78499c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    public String f78500d = "";

    /* JADX INFO: renamed from: e */
    @hib
    public String f78501e = null;

    /* JADX INFO: renamed from: g */
    public boolean f78503g = false;

    /* JADX INFO: renamed from: i */
    public boolean f78505i = false;

    /* JADX INFO: renamed from: j */
    public int f78506j = -1;

    /* JADX INFO: renamed from: k */
    public int f78507k = -1;

    /* JADX INFO: renamed from: l */
    public int f78508l = -1;

    /* JADX INFO: renamed from: m */
    public int f78509m = -1;

    /* JADX INFO: renamed from: n */
    public int f78510n = -1;

    /* JADX INFO: renamed from: p */
    public int f78512p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f78513q = false;

    /* JADX INFO: renamed from: rji$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12122a {
    }

    /* JADX INFO: renamed from: rji$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12123b {
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
        if (this.f78505i) {
            return this.f78504h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f78513q;
    }

    public int getFontColor() {
        if (this.f78503g) {
            return this.f78502f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @hib
    public String getFontFamily() {
        return this.f78501e;
    }

    public float getFontSize() {
        return this.f78511o;
    }

    public int getFontSizeUnit() {
        return this.f78510n;
    }

    public int getRubyPosition() {
        return this.f78512p;
    }

    public int getSpecificityScore(@hib String str, @hib String str2, Set<String> set, @hib String str3) {
        if (this.f78497a.isEmpty() && this.f78498b.isEmpty() && this.f78499c.isEmpty() && this.f78500d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.f78497a, str, 1073741824), this.f78498b, str2, 2), this.f78500d, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.f78499c)) {
            return 0;
        }
        return iUpdateScoreForMatch + (this.f78499c.size() * 4);
    }

    public int getStyle() {
        int i = this.f78508l;
        if (i == -1 && this.f78509m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f78509m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.f78505i;
    }

    public boolean hasFontColor() {
        return this.f78503g;
    }

    public boolean isLinethrough() {
        return this.f78506j == 1;
    }

    public boolean isUnderline() {
        return this.f78507k == 1;
    }

    @op1
    public rji setBackgroundColor(int i) {
        this.f78504h = i;
        this.f78505i = true;
        return this;
    }

    @op1
    public rji setBold(boolean z) {
        this.f78508l = z ? 1 : 0;
        return this;
    }

    @op1
    public rji setCombineUpright(boolean z) {
        this.f78513q = z;
        return this;
    }

    @op1
    public rji setFontColor(int i) {
        this.f78502f = i;
        this.f78503g = true;
        return this;
    }

    @op1
    public rji setFontFamily(@hib String str) {
        this.f78501e = str == null ? null : i80.toLowerCase(str);
        return this;
    }

    @op1
    public rji setFontSize(float f) {
        this.f78511o = f;
        return this;
    }

    @op1
    public rji setFontSizeUnit(int i) {
        this.f78510n = i;
        return this;
    }

    @op1
    public rji setItalic(boolean z) {
        this.f78509m = z ? 1 : 0;
        return this;
    }

    @op1
    public rji setLinethrough(boolean z) {
        this.f78506j = z ? 1 : 0;
        return this;
    }

    @op1
    public rji setRubyPosition(int i) {
        this.f78512p = i;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f78499c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f78497a = str;
    }

    public void setTargetTagName(String str) {
        this.f78498b = str;
    }

    public void setTargetVoice(String str) {
        this.f78500d = str;
    }

    @op1
    public rji setUnderline(boolean z) {
        this.f78507k = z ? 1 : 0;
        return this;
    }
}
