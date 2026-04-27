package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class bi8 implements pog, zu5, jvf, g74 {

    /* JADX INFO: renamed from: a */
    public final Class<?> f13797a;

    /* JADX INFO: renamed from: b */
    public final tde f13798b;

    /* JADX INFO: renamed from: c */
    public final ci8 f13799c;

    public bi8(Class<?> cls) {
        this(cls, ci8.getDefault());
    }

    private boolean isIgnored(j74 j74Var) {
        return j74Var.getAnnotation(rr7.class) != null;
    }

    private j74 removeIgnored(j74 j74Var) {
        if (isIgnored(j74Var)) {
            return j74.f49692m;
        }
        j74 j74VarChildlessCopy = j74Var.childlessCopy();
        Iterator<j74> it = j74Var.getChildren().iterator();
        while (it.hasNext()) {
            j74 j74VarRemoveIgnored = removeIgnored(it.next());
            if (!j74VarRemoveIgnored.isEmpty()) {
                j74VarChildlessCopy.addChild(j74VarRemoveIgnored);
            }
        }
        return j74VarChildlessCopy;
    }

    @Override // p000.pog
    public int countTestCases() {
        return this.f13798b.testCount();
    }

    @Override // p000.zu5
    public void filter(ru5 ru5Var) throws aeb {
        ru5Var.apply(this.f13798b);
    }

    @Override // p000.g74
    public j74 getDescription() {
        return removeIgnored(this.f13798b.getDescription());
    }

    public Class<?> getTestClass() {
        return this.f13797a;
    }

    public List<pog> getTests() {
        return this.f13799c.asTestList(getDescription());
    }

    @Override // p000.pog
    public void run(epg epgVar) {
        this.f13798b.run(this.f13799c.getNotifier(epgVar, this));
    }

    @Override // p000.jvf
    public void sort(svf svfVar) {
        svfVar.apply(this.f13798b);
    }

    public String toString() {
        return this.f13797a.getName();
    }

    public bi8(Class<?> cls, ci8 ci8Var) {
        this.f13799c = ci8Var;
        this.f13797a = cls;
        this.f13798b = o3e.classWithoutSuiteMethod(cls).getRunner();
    }
}
