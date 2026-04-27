package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tfd {

    /* JADX INFO: renamed from: e */
    public static final int f84532e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f84533f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f84534g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f84535h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f84536i = 3;

    /* JADX INFO: renamed from: a */
    public final C13014b f84537a;

    /* JADX INFO: renamed from: b */
    public final C13014b f84538b;

    /* JADX INFO: renamed from: c */
    public final int f84539c;

    /* JADX INFO: renamed from: d */
    public final boolean f84540d;

    /* JADX INFO: renamed from: tfd$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13013a {
    }

    /* JADX INFO: renamed from: tfd$b */
    public static final class C13014b {

        /* JADX INFO: renamed from: a */
        public final C13015c[] f84541a;

        public C13014b(C13015c... c13015cArr) {
            this.f84541a = c13015cArr;
        }

        public C13015c getSubMesh(int i) {
            return this.f84541a[i];
        }

        public int getSubMeshCount() {
            return this.f84541a.length;
        }
    }

    /* JADX INFO: renamed from: tfd$c */
    public static final class C13015c {

        /* JADX INFO: renamed from: e */
        public static final int f84542e = 0;

        /* JADX INFO: renamed from: a */
        public final int f84543a;

        /* JADX INFO: renamed from: b */
        public final int f84544b;

        /* JADX INFO: renamed from: c */
        public final float[] f84545c;

        /* JADX INFO: renamed from: d */
        public final float[] f84546d;

        public C13015c(int i, float[] fArr, float[] fArr2, int i2) {
            this.f84543a = i;
            u80.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f84545c = fArr;
            this.f84546d = fArr2;
            this.f84544b = i2;
        }

        public int getVertexCount() {
            return this.f84545c.length / 3;
        }
    }

    public tfd(C13014b c13014b, int i) {
        this(c13014b, c13014b, i);
    }

    public static tfd createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public tfd(C13014b c13014b, C13014b c13014b2, int i) {
        this.f84537a = c13014b;
        this.f84538b = c13014b2;
        this.f84539c = i;
        this.f84540d = c13014b == c13014b2;
    }

    public static tfd createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        u80.checkArgument(f > 0.0f);
        u80.checkArgument(i9 >= 1);
        u80.checkArgument(i10 >= 1);
        u80.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        u80.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                float f10 = f8;
                int i18 = i16;
                int i19 = 2;
                int i20 = 0;
                while (i20 < i19) {
                    if (i20 == 0) {
                        f4 = f10;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f11 = i17 * f6;
                    float f12 = f6;
                    int i21 = i17;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    int i22 = i20;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    float f15 = radians;
                    float f16 = radians2;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i23 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i15] = f11 / f16;
                    int i24 = i15 + 2;
                    fArr4[i15 + 1] = ((i13 + i22) * f13) / f15;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                    } else {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i8 = 2;
                            i15 = i24;
                            i14 = i23;
                        }
                        i20 = i7 + 1;
                        i10 = i5;
                        i17 = i6;
                        fArr3 = fArr;
                        radians = f15;
                        i11 = i4;
                        f6 = f12;
                        radians2 = f16;
                        f9 = f14;
                        i19 = i8;
                        f5 = f13;
                    }
                    System.arraycopy(fArr2, i14, fArr2, i23, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i8 = 2;
                    System.arraycopy(fArr, i15, fArr, i24, 2);
                    i15 += 4;
                    i20 = i7 + 1;
                    i10 = i5;
                    i17 = i6;
                    fArr3 = fArr;
                    radians = f15;
                    i11 = i4;
                    f6 = f12;
                    radians2 = f16;
                    f9 = f14;
                    i19 = i8;
                    f5 = f13;
                }
                float f17 = radians2;
                int i25 = i17;
                int i26 = i10;
                int i27 = i25 + 1;
                i16 = i18;
                f5 = f5;
                radians2 = f17;
                f9 = f9;
                f8 = f10;
                i10 = i26;
                i17 = i27;
            }
            i9 = i;
            i13 = i16;
        }
        return new tfd(new C13014b(new C13015c(0, fArr2, fArr3, 1)), i3);
    }
}
