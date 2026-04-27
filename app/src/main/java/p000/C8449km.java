package p000;

import java.util.Iterator;
import p000.f2g;

/* JADX INFO: renamed from: km */
/* JADX INFO: loaded from: classes.dex */
public class C8449km extends oj7 {

    /* JADX INFO: renamed from: n0 */
    public float f54672n0;

    public C8449km(f2g f2gVar) {
        super(f2gVar, f2g.EnumC5565e.ALIGN_VERTICALLY);
        this.f54672n0 = 0.5f;
    }

    @Override // p000.oj7, p000.gu2, p000.lvd, p000.eo5
    public void apply() {
        Iterator<Object> it = this.f67811l0.iterator();
        while (it.hasNext()) {
            gu2 gu2VarConstraints = this.f67809j0.constraints(it.next());
            gu2VarConstraints.clearHorizontal();
            Object obj = this.f41142O;
            if (obj != null) {
                gu2VarConstraints.startToStart(obj);
            } else {
                Object obj2 = this.f41143P;
                if (obj2 != null) {
                    gu2VarConstraints.startToEnd(obj2);
                } else {
                    gu2VarConstraints.startToStart(f2g.f34895j);
                }
            }
            Object obj3 = this.f41144Q;
            if (obj3 != null) {
                gu2VarConstraints.endToStart(obj3);
            } else {
                Object obj4 = this.f41145R;
                if (obj4 != null) {
                    gu2VarConstraints.endToEnd(obj4);
                } else {
                    gu2VarConstraints.endToEnd(f2g.f34895j);
                }
            }
            float f = this.f54672n0;
            if (f != 0.5f) {
                gu2VarConstraints.horizontalBias(f);
            }
        }
    }
}
