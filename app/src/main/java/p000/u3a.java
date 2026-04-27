package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
@p7e({p7e.EnumC10826a.f69934a})
public final class u3a {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final u3a f86727a = new u3a();

    /* JADX INFO: renamed from: b */
    public static final int f86728b = 0;

    private u3a() {
    }

    public final float constrainedMap(float f, float f2, float f3, float f4, float f5) {
        return lerp(f, f2, Math.max(0.0f, Math.min(1.0f, lerpInv(f3, f4, f5))));
    }

    public final float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public final float lerpInv(float f, float f2, float f3) {
        if (f == f2) {
            return 0.0f;
        }
        return (f3 - f) / (f2 - f);
    }
}
