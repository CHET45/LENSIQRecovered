package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes3.dex */
public class C2094bx implements InterfaceC9576mx<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final List<hs8<PointF>> f15120a;

    public C2094bx(List<hs8<PointF>> list) {
        this.f15120a = list;
    }

    @Override // p000.InterfaceC9576mx
    public nr0<PointF, PointF> createAnimation() {
        return this.f15120a.get(0).isStatic() ? new n1d(this.f15120a) : new kjc(this.f15120a);
    }

    @Override // p000.InterfaceC9576mx
    public List<hs8<PointF>> getKeyframes() {
        return this.f15120a;
    }

    @Override // p000.InterfaceC9576mx
    public boolean isStatic() {
        return this.f15120a.size() == 1 && this.f15120a.get(0).isStatic();
    }
}
