package p000;

import java.util.Arrays;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@p7e({p7e.EnumC10826a.f69935b})
public final class cp6 implements ap6 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C4445a f26713c = new C4445a(null);

    /* JADX INFO: renamed from: d */
    public static final int f26714d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f26715a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final float[] f26716b;

    /* JADX INFO: renamed from: cp6$a */
    public static final class C4445a {
        public /* synthetic */ C4445a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float fConstrainedMap;
            float fAbs = Math.abs(f);
            float fSignum = Math.signum(f);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fConstrainedMap = fArr2[iBinarySearch];
            } else {
                int i = -(iBinarySearch + 1);
                int i2 = i - 1;
                float f5 = 0.0f;
                if (i2 >= fArr.length - 1) {
                    float f6 = fArr[fArr.length - 1];
                    float f7 = fArr2[fArr.length - 1];
                    if (f6 == 0.0f) {
                        return 0.0f;
                    }
                    return f * (f7 / f6);
                }
                if (i2 == -1) {
                    float f8 = fArr[0];
                    f4 = fArr2[0];
                    f3 = f8;
                    f2 = 0.0f;
                } else {
                    float f9 = fArr[i2];
                    float f10 = fArr[i];
                    f2 = fArr2[i2];
                    f5 = f9;
                    f3 = f10;
                    f4 = fArr2[i];
                }
                fConstrainedMap = u3a.f86727a.constrainedMap(f2, f4, f5, f3, fAbs);
            }
            return fSignum * fConstrainedMap;
        }

        private C4445a() {
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public cp6(@yfb float[] fArr, @yfb float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f26715a = fArr;
        this.f26716b = fArr2;
    }

    @fdi
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @fdi
    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    @Override // p000.ap6
    public float convertDpToSp(float f) {
        return f26713c.lookupAndInterpolate(f, this.f26716b, this.f26715a);
    }

    @Override // p000.ap6
    public float convertSpToDp(float f) {
        return f26713c.lookupAndInterpolate(f, this.f26715a, this.f26716b);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cp6)) {
            return false;
        }
        cp6 cp6Var = (cp6) obj;
        return Arrays.equals(this.f26715a, cp6Var.f26715a) && Arrays.equals(this.f26716b, cp6Var.f26716b);
    }

    @yfb
    public final float[] getMFromSpValues() {
        return this.f26715a;
    }

    @yfb
    public final float[] getMToDpValues() {
        return this.f26716b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f26715a) * 31) + Arrays.hashCode(this.f26716b);
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f26715a);
        md8.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f26716b);
        md8.checkNotNullExpressionValue(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
