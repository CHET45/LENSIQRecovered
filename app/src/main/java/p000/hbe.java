package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRotaryScrollEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.android.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
@e0g(parameters = 1)
public final class hbe {

    /* JADX INFO: renamed from: e */
    public static final int f43100e = 0;

    /* JADX INFO: renamed from: a */
    public final float f43101a;

    /* JADX INFO: renamed from: b */
    public final float f43102b;

    /* JADX INFO: renamed from: c */
    public final long f43103c;

    /* JADX INFO: renamed from: d */
    public final int f43104d;

    public hbe(float f, float f2, long j, int i) {
        this.f43101a = f;
        this.f43102b = f2;
        this.f43103c = j;
        this.f43104d = i;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof hbe) {
            hbe hbeVar = (hbe) obj;
            if (hbeVar.f43101a == this.f43101a && hbeVar.f43102b == this.f43102b && hbeVar.f43103c == this.f43103c && hbeVar.f43104d == this.f43104d) {
                return true;
            }
        }
        return false;
    }

    public final float getHorizontalScrollPixels() {
        return this.f43102b;
    }

    public final int getInputDeviceId() {
        return this.f43104d;
    }

    public final long getUptimeMillis() {
        return this.f43103c;
    }

    public final float getVerticalScrollPixels() {
        return this.f43101a;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f43101a) * 31) + Float.hashCode(this.f43102b)) * 31) + Long.hashCode(this.f43103c)) * 31) + Integer.hashCode(this.f43104d);
    }

    @yfb
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f43101a + ",horizontalScrollPixels=" + this.f43102b + ",uptimeMillis=" + this.f43103c + ",deviceId=" + this.f43104d + ')';
    }
}
