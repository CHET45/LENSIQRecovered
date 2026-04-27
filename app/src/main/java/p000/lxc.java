package p000;

import android.view.View;
import android.widget.Magnifier;
import p000.kxc;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@dwf({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,202:1\n198#2:203\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n163#1:203\n*E\n"})
@e0g(parameters = 1)
public final class lxc implements jxc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final lxc f59160b = new lxc();

    /* JADX INFO: renamed from: c */
    public static final boolean f59161c = true;

    /* JADX INFO: renamed from: d */
    public static final int f59162d = 0;

    /* JADX INFO: renamed from: lxc$a */
    @c5e(29)
    @e0g(parameters = 1)
    public static final class C9030a extends kxc.C8549a {

        /* JADX INFO: renamed from: c */
        public static final int f59163c = 0;

        public C9030a(@yfb Magnifier magnifier) {
            super(magnifier);
        }

        @Override // p000.kxc.C8549a, p000.ixc
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo30413updateWko1d7g(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                getMagnifier().setZoom(f);
            }
            if (mzb.m31100isSpecifiedk4lQ0M(j2)) {
                getMagnifier().show(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j2), izb.m30430getYimpl(j2));
            } else {
                getMagnifier().show(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            }
        }
    }

    private lxc() {
    }

    @Override // p000.jxc
    public boolean getCanUpdateZoom() {
        return f59161c;
    }

    @Override // p000.jxc
    @yfb
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public C9030a mo30625createnHHXs2Y(@yfb View view, boolean z, long j, float f, float f2, boolean z2, @yfb c64 c64Var, float f3) {
        if (z) {
            return new C9030a(new Magnifier(view));
        }
        long jMo27174toSizeXkaWNTQ = c64Var.mo27174toSizeXkaWNTQ(j);
        float fMo27173toPx0680j_4 = c64Var.mo27173toPx0680j_4(f);
        float fMo27173toPx0680j_42 = c64Var.mo27173toPx0680j_4(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo27174toSizeXkaWNTQ != j28.f49422d) {
            builder.setSize(p3a.roundToInt(wpf.m33069getWidthimpl(jMo27174toSizeXkaWNTQ)), p3a.roundToInt(wpf.m33066getHeightimpl(jMo27174toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo27173toPx0680j_4)) {
            builder.setCornerRadius(fMo27173toPx0680j_4);
        }
        if (!Float.isNaN(fMo27173toPx0680j_42)) {
            builder.setElevation(fMo27173toPx0680j_42);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new C9030a(builder.build());
    }
}
