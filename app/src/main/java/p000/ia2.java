package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,802:1\n63#2,3:803\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:803,3\n*E\n"})
public abstract class ia2 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C7206a f46176d = new C7206a(null);

    /* JADX INFO: renamed from: e */
    public static final int f46177e = -1;

    /* JADX INFO: renamed from: f */
    public static final int f46178f = 63;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f46179a;

    /* JADX INFO: renamed from: b */
    public final long f46180b;

    /* JADX INFO: renamed from: c */
    public final int f46181c;

    /* JADX INFO: renamed from: ia2$a */
    public static final class C7206a {
        public /* synthetic */ C7206a(jt3 jt3Var) {
            this();
        }

        private C7206a() {
        }
    }

    public /* synthetic */ ia2(String str, long j, int i, jt3 jt3Var) {
        this(str, j, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        if (this.f46181c == ia2Var.f46181c && md8.areEqual(this.f46179a, ia2Var.f46179a)) {
            return o92.m31296equalsimpl0(this.f46180b, ia2Var.f46180b);
        }
        return false;
    }

    @yfb
    @zpf(min = 3)
    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[o92.m31297getComponentCountimpl(this.f46180b)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    @yfb
    @zpf(min = 3)
    public abstract float[] fromXyz(@yfb @zpf(min = 3) float[] fArr);

    @h78(from = 1, m12174to = 4)
    public final int getComponentCount() {
        return o92.m31297getComponentCountimpl(this.f46180b);
    }

    public final int getId$ui_graphics_release() {
        return this.f46181c;
    }

    public abstract float getMaxValue(@h78(from = 0, m12174to = 3) int i);

    public abstract float getMinValue(@h78(from = 0, m12174to = 3) int i);

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m30176getModelxdoWZVw() {
        return this.f46180b;
    }

    @yfb
    public final String getName() {
        return this.f46179a;
    }

    public int hashCode() {
        return (((this.f46179a.hashCode() * 31) + o92.m31298hashCodeimpl(this.f46180b)) * 31) + this.f46181c;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @yfb
    public String toString() {
        return this.f46179a + " (id=" + this.f46181c + ", model=" + ((Object) o92.m31299toStringimpl(this.f46180b)) + ')';
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float[] xyz = toXyz(f, f2, f3);
        float f4 = xyz[0];
        float f5 = xyz[1];
        return (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    @yfb
    @zpf(3)
    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    @yfb
    @zpf(min = 3)
    public abstract float[] toXyz(@yfb @zpf(min = 3) float[] fArr);

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return toXyz(f, f2, f3)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo28819xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @yfb ia2 ia2Var) {
        float[] fArrFromXyz = fromXyz(f, f2, f3);
        return j92.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], f4, ia2Var);
    }

    public /* synthetic */ ia2(String str, long j, jt3 jt3Var) {
        this(str, j);
    }

    private ia2(String str, long j, int i) {
        this.f46179a = str;
        this.f46180b = j;
        this.f46181c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ia2(String str, long j) {
        this(str, j, -1, null);
    }
}
