package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z5h {

    /* JADX INFO: renamed from: l */
    public static final int f104261l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f104262m = 1;

    /* JADX INFO: renamed from: a */
    public final int f104263a;

    /* JADX INFO: renamed from: b */
    public final int f104264b;

    /* JADX INFO: renamed from: c */
    public final long f104265c;

    /* JADX INFO: renamed from: d */
    public final long f104266d;

    /* JADX INFO: renamed from: e */
    public final long f104267e;

    /* JADX INFO: renamed from: f */
    public final kq6 f104268f;

    /* JADX INFO: renamed from: g */
    public final int f104269g;

    /* JADX INFO: renamed from: h */
    @hib
    public final long[] f104270h;

    /* JADX INFO: renamed from: i */
    @hib
    public final long[] f104271i;

    /* JADX INFO: renamed from: j */
    public final int f104272j;

    /* JADX INFO: renamed from: k */
    @hib
    public final a6h[] f104273k;

    /* JADX INFO: renamed from: z5h$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC16013a {
    }

    public z5h(int i, int i2, long j, long j2, long j3, kq6 kq6Var, int i3, @hib a6h[] a6hVarArr, int i4, @hib long[] jArr, @hib long[] jArr2) {
        this.f104263a = i;
        this.f104264b = i2;
        this.f104265c = j;
        this.f104266d = j2;
        this.f104267e = j3;
        this.f104268f = kq6Var;
        this.f104269g = i3;
        this.f104273k = a6hVarArr;
        this.f104272j = i4;
        this.f104270h = jArr;
        this.f104271i = jArr2;
    }

    public z5h copyWithFormat(kq6 kq6Var) {
        return new z5h(this.f104263a, this.f104264b, this.f104265c, this.f104266d, this.f104267e, kq6Var, this.f104269g, this.f104273k, this.f104272j, this.f104270h, this.f104271i);
    }

    @hib
    public a6h getSampleDescriptionEncryptionBox(int i) {
        a6h[] a6hVarArr = this.f104273k;
        if (a6hVarArr == null) {
            return null;
        }
        return a6hVarArr[i];
    }
}
