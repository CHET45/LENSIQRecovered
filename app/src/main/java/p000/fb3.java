package p000;

/* JADX INFO: loaded from: classes.dex */
public class fb3 {

    /* JADX INFO: renamed from: i */
    public static final String f35983i = "TransitionLayout";

    /* JADX INFO: renamed from: a */
    public boolean f35984a;

    /* JADX INFO: renamed from: b */
    public String f35985b;

    /* JADX INFO: renamed from: c */
    public EnumC5711b f35986c;

    /* JADX INFO: renamed from: d */
    public int f35987d;

    /* JADX INFO: renamed from: e */
    public float f35988e;

    /* JADX INFO: renamed from: f */
    public String f35989f;

    /* JADX INFO: renamed from: g */
    public boolean f35990g;

    /* JADX INFO: renamed from: h */
    public int f35991h;

    /* JADX INFO: renamed from: fb3$a */
    public static /* synthetic */ class C5710a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35992a;

        static {
            int[] iArr = new int[EnumC5711b.values().length];
            f35992a = iArr;
            try {
                iArr[EnumC5711b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35992a[EnumC5711b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35992a[EnumC5711b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35992a[EnumC5711b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35992a[EnumC5711b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35992a[EnumC5711b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35992a[EnumC5711b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35992a[EnumC5711b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: fb3$b */
    public enum EnumC5711b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public fb3(String str, EnumC5711b enumC5711b) {
        this.f35984a = false;
        this.f35985b = str;
        this.f35986c = enumC5711b;
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | (-16777216);
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | (-16777216);
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | (-16777216);
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | (-16777216);
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | (-16777216);
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | (-16777216);
    }

    public boolean diff(fb3 fb3Var) {
        EnumC5711b enumC5711b;
        if (fb3Var == null || (enumC5711b = this.f35986c) != fb3Var.f35986c) {
            return false;
        }
        switch (C5710a.f35992a[enumC5711b.ordinal()]) {
            case 1:
            case 6:
                return this.f35987d == fb3Var.f35987d;
            case 2:
                return this.f35990g == fb3Var.f35990g;
            case 3:
                return this.f35987d == fb3Var.f35987d;
            case 4:
            case 5:
                return this.f35991h == fb3Var.f35991h;
            case 7:
                return this.f35988e == fb3Var.f35988e;
            case 8:
                return this.f35988e == fb3Var.f35988e;
            default:
                return false;
        }
    }

    public EnumC5711b getType() {
        return this.f35986c;
    }

    public float getValueToInterpolate() {
        switch (C5710a.f35992a[this.f35986c.ordinal()]) {
            case 2:
                return this.f35990g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f35987d;
            case 7:
                return this.f35988e;
            case 8:
                return this.f35988e;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (C5710a.f35992a[this.f35986c.ordinal()]) {
            case 2:
                fArr[0] = this.f35990g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = (this.f35991h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 6:
                fArr[0] = this.f35987d;
                return;
            case 7:
                fArr[0] = this.f35988e;
                return;
            case 8:
                fArr[0] = this.f35988e;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i = C5710a.f35992a[this.f35986c.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int i = C5710a.f35992a[this.f35986c.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public void setColorValue(int i) {
        this.f35991h = i;
    }

    public void setFloatValue(float f) {
        this.f35988e = f;
    }

    public void setIntValue(int i) {
        this.f35987d = i;
    }

    public void setStringValue(String str) {
        this.f35989f = str;
    }

    public void setValue(float[] fArr) {
        switch (C5710a.f35992a[this.f35986c.ordinal()]) {
            case 1:
            case 6:
                this.f35987d = (int) fArr[0];
                return;
            case 2:
                this.f35990g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.f35991h = iHsvToRgb;
                this.f35991h = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHsvToRgb & 16777215);
                return;
            case 7:
                this.f35988e = fArr[0];
                return;
            case 8:
                this.f35988e = fArr[0];
                return;
            default:
                return;
        }
    }

    public fb3(String str, EnumC5711b enumC5711b, Object obj, boolean z) {
        this.f35985b = str;
        this.f35986c = enumC5711b;
        this.f35984a = z;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (C5710a.f35992a[this.f35986c.ordinal()]) {
            case 1:
            case 6:
                this.f35987d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f35990g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f35989f = (String) obj;
                break;
            case 4:
            case 5:
                this.f35991h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f35988e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f35988e = ((Float) obj).floatValue();
                break;
        }
    }

    public fb3(fb3 fb3Var, Object obj) {
        this.f35984a = false;
        this.f35985b = fb3Var.f35985b;
        this.f35986c = fb3Var.f35986c;
        setValue(obj);
    }
}
