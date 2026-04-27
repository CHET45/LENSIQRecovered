package p000;

import java.util.ArrayList;
import java.util.Collections;
import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class oj7 extends gu2 implements eo5 {

    /* JADX INFO: renamed from: j0 */
    public final f2g f67809j0;

    /* JADX INFO: renamed from: k0 */
    public final f2g.EnumC5565e f67810k0;

    /* JADX INFO: renamed from: l0 */
    public ArrayList<Object> f67811l0;

    /* JADX INFO: renamed from: m0 */
    public qj7 f67812m0;

    public oj7(f2g f2gVar, f2g.EnumC5565e enumC5565e) {
        super(f2gVar);
        this.f67811l0 = new ArrayList<>();
        this.f67809j0 = f2gVar;
        this.f67810k0 = enumC5565e;
    }

    public oj7 add(Object... objArr) {
        Collections.addAll(this.f67811l0, objArr);
        return this;
    }

    @Override // p000.gu2, p000.lvd, p000.eo5
    public void apply() {
    }

    @Override // p000.gu2, p000.lvd
    public iu2 getConstraintWidget() {
        return getHelperWidget();
    }

    public qj7 getHelperWidget() {
        return this.f67812m0;
    }

    public f2g.EnumC5565e getType() {
        return this.f67810k0;
    }

    public void setHelperWidget(qj7 qj7Var) {
        this.f67812m0 = qj7Var;
    }
}
