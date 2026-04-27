package p000;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
@c5e(28)
@e0g(parameters = 1)
public final class kxc implements jxc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final kxc f55586b = new kxc();

    /* JADX INFO: renamed from: c */
    public static final boolean f55587c = false;

    /* JADX INFO: renamed from: d */
    public static final int f55588d = 0;

    /* JADX INFO: renamed from: kxc$a */
    @c5e(28)
    @e0g(parameters = 0)
    public static class C8549a implements ixc {

        /* JADX INFO: renamed from: b */
        public static final int f55589b = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final Magnifier f55590a;

        public C8549a(@yfb Magnifier magnifier) {
            this.f55590a = magnifier;
        }

        @Override // p000.ixc
        public void dismiss() {
            this.f55590a.dismiss();
        }

        @yfb
        public final Magnifier getMagnifier() {
            return this.f55590a;
        }

        @Override // p000.ixc
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo30412getSizeYbymL2g() {
            return s78.IntSize(this.f55590a.getWidth(), this.f55590a.getHeight());
        }

        @Override // p000.ixc
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo30413updateWko1d7g(long j, long j2, float f) {
            this.f55590a.show(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
        }

        @Override // p000.ixc
        public void updateContent() {
            this.f55590a.update();
        }
    }

    private kxc() {
    }

    @Override // p000.jxc
    public boolean getCanUpdateZoom() {
        return f55587c;
    }

    @Override // p000.jxc
    @yfb
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public C8549a mo30625createnHHXs2Y(@yfb View view, boolean z, long j, float f, float f2, boolean z2, @yfb c64 c64Var, float f3) {
        return new C8549a(new Magnifier(view));
    }
}
