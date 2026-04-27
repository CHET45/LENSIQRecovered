package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface jxc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8139a f52195a = C8139a.f52196a;

    /* JADX INFO: renamed from: jxc$a */
    public static final class C8139a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C8139a f52196a = new C8139a();

        private C8139a() {
        }

        @f0g
        @yfb
        public final jxc getForCurrentPlatform() {
            if (vq9.isPlatformMagnifierSupported$default(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? kxc.f55586b : lxc.f59160b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @yfb
    /* JADX INFO: renamed from: create-nHHXs2Y, reason: not valid java name */
    ixc mo30625createnHHXs2Y(@yfb View view, boolean z, long j, float f, float f2, boolean z2, @yfb c64 c64Var, float f3);

    boolean getCanUpdateZoom();
}
