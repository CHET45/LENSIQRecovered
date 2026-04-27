package p000;

import android.animation.TimeInterpolator;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class j9e implements TimeInterpolator {

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator f50041a;

    public j9e(@efb TimeInterpolator timeInterpolator) {
        this.f50041a = timeInterpolator;
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static TimeInterpolator m13909of(boolean z, @efb TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new j9e(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f50041a.getInterpolation(f);
    }
}
