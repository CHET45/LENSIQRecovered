package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class grg implements du8 {

    /* JADX INFO: renamed from: d */
    public static final int f40865d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f40866e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f40867f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f40868g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f40869h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f40870i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f40871j = 2;

    /* JADX INFO: renamed from: a */
    public int f40872a;

    /* JADX INFO: renamed from: b */
    public int f40873b;

    /* JADX INFO: renamed from: c */
    public final int f40874c;

    /* JADX INFO: renamed from: grg$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6478a {
    }

    /* JADX INFO: renamed from: grg$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6479b {
    }

    public grg(int i, int i2, int i3) {
        this.f40872a = i;
        this.f40873b = i2;
        this.f40874c = i3;
    }
}
