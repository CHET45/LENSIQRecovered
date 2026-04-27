package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class vh4 {

    /* JADX INFO: renamed from: a */
    public String f91177a;

    /* JADX INFO: renamed from: b */
    public String f91178b;

    /* JADX INFO: renamed from: c */
    public float f91179c;

    /* JADX INFO: renamed from: d */
    public EnumC14073a f91180d;

    /* JADX INFO: renamed from: e */
    public int f91181e;

    /* JADX INFO: renamed from: f */
    public float f91182f;

    /* JADX INFO: renamed from: g */
    public float f91183g;

    /* JADX INFO: renamed from: h */
    @g92
    public int f91184h;

    /* JADX INFO: renamed from: i */
    @g92
    public int f91185i;

    /* JADX INFO: renamed from: j */
    public float f91186j;

    /* JADX INFO: renamed from: k */
    public boolean f91187k;

    /* JADX INFO: renamed from: vh4$a */
    public enum EnumC14073a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public vh4(String str, String str2, float f, EnumC14073a enumC14073a, int i, float f2, float f3, @g92 int i2, @g92 int i3, float f4, boolean z) {
        set(str, str2, f, enumC14073a, i, f2, f3, i2, i3, f4, z);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f91177a.hashCode() * 31) + this.f91178b.hashCode()) * 31) + this.f91179c)) * 31) + this.f91180d.ordinal()) * 31) + this.f91181e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f91182f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f91184h;
    }

    public void set(String str, String str2, float f, EnumC14073a enumC14073a, int i, float f2, float f3, @g92 int i2, @g92 int i3, float f4, boolean z) {
        this.f91177a = str;
        this.f91178b = str2;
        this.f91179c = f;
        this.f91180d = enumC14073a;
        this.f91181e = i;
        this.f91182f = f2;
        this.f91183g = f3;
        this.f91184h = i2;
        this.f91185i = i3;
        this.f91186j = f4;
        this.f91187k = z;
    }

    public vh4() {
    }
}
