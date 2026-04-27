package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class ge3 {

    /* JADX INFO: renamed from: g */
    public static final String f39602g = "TransitionLayout";

    /* JADX INFO: renamed from: a */
    public String f39603a;

    /* JADX INFO: renamed from: b */
    public int f39604b;

    /* JADX INFO: renamed from: c */
    public int f39605c;

    /* JADX INFO: renamed from: d */
    public float f39606d;

    /* JADX INFO: renamed from: e */
    public String f39607e;

    /* JADX INFO: renamed from: f */
    public boolean f39608f;

    public ge3(ge3 ge3Var) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = ge3Var.f39603a;
        this.f39604b = ge3Var.f39604b;
        this.f39605c = ge3Var.f39605c;
        this.f39606d = ge3Var.f39606d;
        this.f39607e = ge3Var.f39607e;
        this.f39608f = ge3Var.f39608f;
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String colorString(int i) {
        return "#" + ("00000000" + Integer.toHexString(i)).substring(r2.length() - 8);
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

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f2 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public void applyToWidget(d0b d0bVar) {
        int i = this.f39604b;
        switch (i) {
            case 900:
            case 902:
            case ymh.InterfaceC15723b.f102138p /* 906 */:
                d0bVar.setCustomAttribute(this.f39603a, i, this.f39605c);
                break;
            case 901:
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                d0bVar.setCustomAttribute(this.f39603a, i, this.f39606d);
                break;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                d0bVar.setCustomAttribute(this.f39603a, i, this.f39607e);
                break;
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                d0bVar.setCustomAttribute(this.f39603a, i, this.f39608f);
                break;
        }
    }

    public ge3 copy() {
        return new ge3(this);
    }

    public boolean diff(ge3 ge3Var) {
        int i;
        if (ge3Var == null || (i = this.f39604b) != ge3Var.f39604b) {
            return false;
        }
        switch (i) {
            case 900:
            case ymh.InterfaceC15723b.f102138p /* 906 */:
                return this.f39605c == ge3Var.f39605c;
            case 901:
                return this.f39606d == ge3Var.f39606d;
            case 902:
                return this.f39605c == ge3Var.f39605c;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                return this.f39605c == ge3Var.f39605c;
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                return this.f39608f == ge3Var.f39608f;
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                return this.f39606d == ge3Var.f39606d;
            default:
                return false;
        }
    }

    public boolean getBooleanValue() {
        return this.f39608f;
    }

    public int getColorValue() {
        return this.f39605c;
    }

    public float getFloatValue() {
        return this.f39606d;
    }

    public int getIntegerValue() {
        return this.f39605c;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.f39603a;
    }

    public String getStringValue() {
        return this.f39607e;
    }

    public int getType() {
        return this.f39604b;
    }

    public float getValueToInterpolate() {
        switch (this.f39604b) {
            case 900:
                return this.f39605c;
            case 901:
                return this.f39606d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                return this.f39608f ? 1.0f : 0.0f;
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                return this.f39606d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f39604b) {
            case 900:
                fArr[0] = this.f39605c;
                return;
            case 901:
                fArr[0] = this.f39606d;
                return;
            case 902:
                int i = (this.f39605c >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                fArr[0] = this.f39608f ? 1.0f : 0.0f;
                return;
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                fArr[0] = this.f39606d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i = this.f39604b;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        return this.f39604b != 902 ? 1 : 4;
    }

    public void setBooleanValue(boolean z) {
        this.f39608f = z;
    }

    public void setFloatValue(float f) {
        this.f39606d = f;
    }

    public void setIntValue(int i) {
        this.f39605c = i;
    }

    public void setInterpolatedValue(d0b d0bVar, float[] fArr) {
        int i = this.f39604b;
        switch (i) {
            case 900:
                d0bVar.setCustomAttribute(this.f39603a, i, (int) fArr[0]);
                return;
            case 901:
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                d0bVar.setCustomAttribute(this.f39603a, i, fArr[0]);
                return;
            case 902:
                d0bVar.setCustomAttribute(this.f39603a, this.f39604b, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
            case ymh.InterfaceC15723b.f102138p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f39603a);
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                d0bVar.setCustomAttribute(this.f39603a, i, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.f39607e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f39604b) {
            case 900:
            case ymh.InterfaceC15723b.f102138p /* 906 */:
                this.f39605c = (int) fArr[0];
                return;
            case 901:
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                this.f39606d = fArr[0];
                return;
            case 902:
                this.f39605c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                this.f39608f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f39603a + ':';
        switch (this.f39604b) {
            case 900:
                return str + this.f39605c;
            case 901:
                return str + this.f39606d;
            case 902:
                return str + colorString(this.f39605c);
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                return str + this.f39607e;
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                return str + Boolean.valueOf(this.f39608f);
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                return str + this.f39606d;
            default:
                return str + "????";
        }
    }

    public ge3(String str, int i, String str2) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39603a = str;
        this.f39604b = i;
        this.f39607e = str2;
    }

    public void setValue(Object obj) {
        switch (this.f39604b) {
            case 900:
            case ymh.InterfaceC15723b.f102138p /* 906 */:
                this.f39605c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f39606d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f39605c = ((Integer) obj).intValue();
                break;
            case ymh.InterfaceC15723b.f102135m /* 903 */:
                this.f39607e = (String) obj;
                break;
            case ymh.InterfaceC15723b.f102136n /* 904 */:
                this.f39608f = ((Boolean) obj).booleanValue();
                break;
            case ymh.InterfaceC15723b.f102137o /* 905 */:
                this.f39606d = ((Float) obj).floatValue();
                break;
        }
    }

    public ge3(String str, int i, int i2) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = str;
        this.f39604b = i;
        if (i == 901) {
            this.f39606d = i2;
        } else {
            this.f39605c = i2;
        }
    }

    public ge3(String str, int i, float f) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39607e = null;
        this.f39603a = str;
        this.f39604b = i;
        this.f39606d = f;
    }

    public ge3(String str, int i, boolean z) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = str;
        this.f39604b = i;
        this.f39608f = z;
    }

    public ge3(String str, int i) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = str;
        this.f39604b = i;
    }

    public ge3(String str, int i, Object obj) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = str;
        this.f39604b = i;
        setValue(obj);
    }

    public ge3(ge3 ge3Var, Object obj) {
        this.f39605c = Integer.MIN_VALUE;
        this.f39606d = Float.NaN;
        this.f39607e = null;
        this.f39603a = ge3Var.f39603a;
        this.f39604b = ge3Var.f39604b;
        setValue(obj);
    }
}
