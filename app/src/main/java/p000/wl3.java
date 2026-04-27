package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wl3 {

    /* JADX INFO: renamed from: f */
    public static final int f94589f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f94590g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f94591h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f94592i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f94593j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f94594k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f94595l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f94596m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f94597n = 16;

    /* JADX INFO: renamed from: o */
    public static final int f94598o = 32;

    /* JADX INFO: renamed from: p */
    public static final int f94599p = 64;

    /* JADX INFO: renamed from: q */
    public static final int f94600q = 128;

    /* JADX INFO: renamed from: r */
    public static final int f94601r = 256;

    /* JADX INFO: renamed from: s */
    public static final int f94602s = 512;

    /* JADX INFO: renamed from: t */
    public static final int f94603t = 1024;

    /* JADX INFO: renamed from: u */
    public static final int f94604u = 2048;

    /* JADX INFO: renamed from: v */
    public static final int f94605v = 4096;

    /* JADX INFO: renamed from: w */
    public static final int f94606w = 8192;

    /* JADX INFO: renamed from: x */
    public static final int f94607x = 16384;

    /* JADX INFO: renamed from: y */
    public static final int f94608y = 32768;

    /* JADX INFO: renamed from: a */
    public final String f94609a;

    /* JADX INFO: renamed from: b */
    public final kq6 f94610b;

    /* JADX INFO: renamed from: c */
    public final kq6 f94611c;

    /* JADX INFO: renamed from: d */
    public final int f94612d;

    /* JADX INFO: renamed from: e */
    public final int f94613e;

    /* JADX INFO: renamed from: wl3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14667a {
    }

    /* JADX INFO: renamed from: wl3$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14668b {
    }

    public wl3(String str, kq6 kq6Var, kq6 kq6Var2, int i, int i2) {
        u80.checkArgument(i == 0 || i2 == 0);
        this.f94609a = u80.checkNotEmpty(str);
        this.f94610b = (kq6) u80.checkNotNull(kq6Var);
        this.f94611c = (kq6) u80.checkNotNull(kq6Var2);
        this.f94612d = i;
        this.f94613e = i2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wl3.class != obj.getClass()) {
            return false;
        }
        wl3 wl3Var = (wl3) obj;
        return this.f94612d == wl3Var.f94612d && this.f94613e == wl3Var.f94613e && this.f94609a.equals(wl3Var.f94609a) && this.f94610b.equals(wl3Var.f94610b) && this.f94611c.equals(wl3Var.f94611c);
    }

    public int hashCode() {
        return ((((((((527 + this.f94612d) * 31) + this.f94613e) * 31) + this.f94609a.hashCode()) * 31) + this.f94610b.hashCode()) * 31) + this.f94611c.hashCode();
    }
}
