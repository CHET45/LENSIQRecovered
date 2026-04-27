package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class zbe implements z8f, nr0.InterfaceC10013b {

    /* JADX INFO: renamed from: e */
    public static final float f104727e = 0.5519f;

    /* JADX INFO: renamed from: a */
    public final go9 f104728a;

    /* JADX INFO: renamed from: b */
    public final String f104729b;

    /* JADX INFO: renamed from: c */
    public final nr0<Float, Float> f104730c;

    /* JADX INFO: renamed from: d */
    @hib
    public r8f f104731d;

    public zbe(go9 go9Var, pr0 pr0Var, ybe ybeVar) {
        this.f104728a = go9Var;
        this.f104729b = ybeVar.getName();
        nr0<Float, Float> nr0VarCreateAnimation = ybeVar.getCornerRadius().createAnimation();
        this.f104730c = nr0VarCreateAnimation;
        pr0Var.addAnimation(nr0VarCreateAnimation);
        nr0VarCreateAnimation.addUpdateListener(this);
    }

    private static int floorDiv(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private static int floorMod(int i, int i2) {
        return i - (floorDiv(i, i2) * i2);
    }

    @efb
    private r8f getShapeData(r8f r8fVar) {
        List<l93> curves = r8fVar.getCurves();
        boolean zIsClosed = r8fVar.isClosed();
        int size = curves.size() - 1;
        int i = 0;
        while (size >= 0) {
            l93 l93Var = curves.get(size);
            l93 l93Var2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || zIsClosed) ? l93Var2.getVertex() : r8fVar.getInitialPoint();
            i = (((size != 0 || zIsClosed) ? l93Var2.getControlPoint2() : vertex).equals(vertex) && l93Var.getControlPoint1().equals(vertex) && !(!r8fVar.isClosed() && size == 0 && size == curves.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        r8f r8fVar2 = this.f104731d;
        if (r8fVar2 == null || r8fVar2.getCurves().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new l93());
            }
            this.f104731d = new r8f(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f104731d.setClosed(zIsClosed);
        return this.f104731d;
    }

    @Override // p000.gv2
    public String getName() {
        return this.f104729b;
    }

    public nr0<Float, Float> getRoundedCorners() {
        return this.f104730c;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    @Override // p000.z8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.r8f modifyShape(p000.r8f r19) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zbe.modifyShape(r8f):r8f");
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f104728a.invalidateSelf();
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
    }
}
