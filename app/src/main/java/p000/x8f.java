package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class x8f extends nr0<r8f, Path> {

    /* JADX INFO: renamed from: i */
    public final r8f f97202i;

    /* JADX INFO: renamed from: j */
    public final Path f97203j;

    /* JADX INFO: renamed from: k */
    public List<z8f> f97204k;

    public x8f(List<hs8<r8f>> list) {
        super(list);
        this.f97202i = new r8f();
        this.f97203j = new Path();
    }

    public void setShapeModifiers(@hib List<z8f> list) {
        this.f97204k = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.nr0
    public Path getValue(hs8<r8f> hs8Var, float f) {
        this.f97202i.interpolateBetween(hs8Var.f44691b, hs8Var.f44692c, f);
        r8f r8fVarModifyShape = this.f97202i;
        List<z8f> list = this.f97204k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                r8fVarModifyShape = this.f97204k.get(size).modifyShape(r8fVarModifyShape);
            }
        }
        awa.getPathFromData(r8fVarModifyShape, this.f97203j);
        return this.f97203j;
    }
}
