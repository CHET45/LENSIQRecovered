package p000;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class vq9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dye<ny6<izb>> f91986a = new dye<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f, float f2) {
        return (Float.isNaN(f) && Float.isNaN(f2)) || f == f2;
    }

    @yfb
    public static final dye<ny6<izb>> getMagnifierPositionInRoot() {
        return f91986a;
    }

    @sy1(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }

    @yfb
    /* JADX INFO: renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final InterfaceC0701e m32791magnifierUpNRX3w(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super c64, izb> qy6Var, @gib qy6<? super c64, izb> qy6Var2, @gib qy6<? super pn4, bth> qy6Var3, float f, long j, float f2, float f3, boolean z) {
        return m32794magnifierjPUL71Q$default(interfaceC0701e, qy6Var, qy6Var2, qy6Var3, f, false, j, f2, f3, z, null, 512, null);
    }

    @yfb
    /* JADX INFO: renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final InterfaceC0701e m32793magnifierjPUL71Q(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super c64, izb> qy6Var, @gib qy6<? super c64, izb> qy6Var2, @gib qy6<? super pn4, bth> qy6Var3, float f, boolean z, long j, float f2, float f3, boolean z2, @gib jxc jxcVar) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return interfaceC0701e.then(new MagnifierElement(qy6Var, qy6Var2, qy6Var3, f, z, j, f2, f3, z2, jxcVar == null ? jxc.f52195a.getForCurrentPlatform() : jxcVar, null));
        }
        return interfaceC0701e;
    }

    /* JADX INFO: renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC0701e m32794magnifierjPUL71Q$default(InterfaceC0701e interfaceC0701e, qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, float f, boolean z, long j, float f2, float f3, boolean z2, jxc jxcVar, int i, Object obj) {
        return m32793magnifierjPUL71Q(interfaceC0701e, qy6Var, (i & 2) != 0 ? null : qy6Var2, (i & 4) != 0 ? null : qy6Var3, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? pn4.f71480b.m31824getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) == 0 ? jxcVar : null);
    }
}
