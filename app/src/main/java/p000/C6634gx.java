package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: gx */
/* JADX INFO: loaded from: classes3.dex */
public class C6634gx implements InterfaceC9576mx<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final C15326xw f41752a;

    /* JADX INFO: renamed from: b */
    public final C15326xw f41753b;

    public C6634gx(C15326xw c15326xw, C15326xw c15326xw2) {
        this.f41752a = c15326xw;
        this.f41753b = c15326xw2;
    }

    @Override // p000.InterfaceC9576mx
    public nr0<PointF, PointF> createAnimation() {
        return new xyf(this.f41752a.createAnimation(), this.f41753b.createAnimation());
    }

    @Override // p000.InterfaceC9576mx
    public List<hs8<PointF>> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.InterfaceC9576mx
    public boolean isStatic() {
        return this.f41752a.isStatic() && this.f41753b.isStatic();
    }
}
