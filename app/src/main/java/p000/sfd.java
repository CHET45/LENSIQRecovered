package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class sfd {

    /* JADX INFO: renamed from: e */
    public static final int f81660e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f81661f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f81662g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f81663h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f81664i = 3;

    /* JADX INFO: renamed from: a */
    public final C12557b f81665a;

    /* JADX INFO: renamed from: b */
    public final C12557b f81666b;

    /* JADX INFO: renamed from: c */
    public final int f81667c;

    /* JADX INFO: renamed from: d */
    public final boolean f81668d;

    /* JADX INFO: renamed from: sfd$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12556a {
    }

    /* JADX INFO: renamed from: sfd$b */
    public static final class C12557b {

        /* JADX INFO: renamed from: a */
        public final C12558c[] f81669a;

        public C12557b(C12558c... c12558cArr) {
            this.f81669a = c12558cArr;
        }

        public C12558c getSubMesh(int i) {
            return this.f81669a[i];
        }

        public int getSubMeshCount() {
            return this.f81669a.length;
        }
    }

    /* JADX INFO: renamed from: sfd$c */
    public static final class C12558c {

        /* JADX INFO: renamed from: e */
        public static final int f81670e = 0;

        /* JADX INFO: renamed from: a */
        public final int f81671a;

        /* JADX INFO: renamed from: b */
        public final int f81672b;

        /* JADX INFO: renamed from: c */
        public final float[] f81673c;

        /* JADX INFO: renamed from: d */
        public final float[] f81674d;

        public C12558c(int i, float[] fArr, float[] fArr2, int i2) {
            this.f81671a = i;
            v80.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f81673c = fArr;
            this.f81674d = fArr2;
            this.f81672b = i2;
        }

        public int getVertexCount() {
            return this.f81673c.length / 3;
        }
    }

    public sfd(C12557b c12557b, int i) {
        this(c12557b, c12557b, i);
    }

    public static sfd createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public sfd(C12557b c12557b, C12557b c12557b2, int i) {
        this.f81665a = c12557b;
        this.f81666b = c12557b2;
        this.f81667c = i;
        this.f81668d = c12557b == c12557b2;
    }

    public static sfd createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9 = i;
        int i10 = i2;
        v80.checkArgument(f > 0.0f);
        v80.checkArgument(i9 >= 1);
        v80.checkArgument(i10 >= 1);
        v80.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        v80.checkArgument(f3 > 0.0f && f3 <= 360.0f);
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
        return new sfd(new C12557b(new C12558c(0, fArr2, fArr3, 1)), i3);
    }
}
