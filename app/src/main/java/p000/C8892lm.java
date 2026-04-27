package p000;

import java.util.Iterator;
import p000.f2g;

/* JADX INFO: renamed from: lm */
/* JADX INFO: loaded from: classes.dex */
public class C8892lm extends oj7 {

    /* JADX INFO: renamed from: n0 */
    public float f58195n0;

    public C8892lm(f2g f2gVar) {
        super(f2gVar, f2g.EnumC5565e.ALIGN_VERTICALLY);
        this.f58195n0 = 0.5f;
    }

    @Override // p000.oj7, p000.gu2, p000.lvd, p000.eo5
    public void apply() {
        Iterator<Object> it = this.f67811l0.iterator();
        while (it.hasNext()) {
            gu2 gu2VarConstraints = this.f67809j0.constraints(it.next());
            gu2VarConstraints.clearVertical();
            Object obj = this.f41146S;
            if (obj != null) {
                gu2VarConstraints.topToTop(obj);
            } else {
                Object obj2 = this.f41147T;
                if (obj2 != null) {
                    gu2VarConstraints.topToBottom(obj2);
                } else {
                    gu2VarConstraints.topToTop(f2g.f34895j);
                }
            }
            Object obj3 = this.f41148U;
            if (obj3 != null) {
                gu2VarConstraints.bottomToTop(obj3);
            } else {
                Object obj4 = this.f41149V;
                if (obj4 != null) {
                    gu2VarConstraints.bottomToBottom(obj4);
                } else {
                    gu2VarConstraints.bottomToBottom(f2g.f34895j);
                }
            }
            float f = this.f58195n0;
            if (f != 0.5f) {
                gu2VarConstraints.verticalBias(f);
            }
        }
    }
}
