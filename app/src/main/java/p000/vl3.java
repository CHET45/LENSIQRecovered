package p000;

import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vl3 {

    /* JADX INFO: renamed from: f */
    public static final int f91557f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f91558g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f91559h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f91560i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f91561j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f91562k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f91563l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f91564m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f91565n = 16;

    /* JADX INFO: renamed from: o */
    public static final int f91566o = 32;

    /* JADX INFO: renamed from: p */
    public static final int f91567p = 64;

    /* JADX INFO: renamed from: q */
    public static final int f91568q = 128;

    /* JADX INFO: renamed from: r */
    public static final int f91569r = 256;

    /* JADX INFO: renamed from: s */
    public static final int f91570s = 512;

    /* JADX INFO: renamed from: t */
    public static final int f91571t = 1024;

    /* JADX INFO: renamed from: u */
    public static final int f91572u = 2048;

    /* JADX INFO: renamed from: v */
    public static final int f91573v = 4096;

    /* JADX INFO: renamed from: w */
    public static final int f91574w = 8192;

    /* JADX INFO: renamed from: x */
    public static final int f91575x = 16384;

    /* JADX INFO: renamed from: y */
    public static final int f91576y = 32768;

    /* JADX INFO: renamed from: a */
    public final String f91577a;

    /* JADX INFO: renamed from: b */
    public final C1213a f91578b;

    /* JADX INFO: renamed from: c */
    public final C1213a f91579c;

    /* JADX INFO: renamed from: d */
    public final int f91580d;

    /* JADX INFO: renamed from: e */
    public final int f91581e;

    /* JADX INFO: renamed from: vl3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14148a {
    }

    /* JADX INFO: renamed from: vl3$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14149b {
    }

    public vl3(String str, C1213a c1213a, C1213a c1213a2, int i, int i2) {
        v80.checkArgument(i == 0 || i2 == 0);
        this.f91577a = v80.checkNotEmpty(str);
        this.f91578b = (C1213a) v80.checkNotNull(c1213a);
        this.f91579c = (C1213a) v80.checkNotNull(c1213a2);
        this.f91580d = i;
        this.f91581e = i2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vl3.class != obj.getClass()) {
            return false;
        }
        vl3 vl3Var = (vl3) obj;
        return this.f91580d == vl3Var.f91580d && this.f91581e == vl3Var.f91581e && this.f91577a.equals(vl3Var.f91577a) && this.f91578b.equals(vl3Var.f91578b) && this.f91579c.equals(vl3Var.f91579c);
    }

    public int hashCode() {
        return ((((((((527 + this.f91580d) * 31) + this.f91581e) * 31) + this.f91577a.hashCode()) * 31) + this.f91578b.hashCode()) * 31) + this.f91579c.hashCode();
    }
}
