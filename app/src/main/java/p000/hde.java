package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class hde extends f3g {

    /* JADX INFO: renamed from: a */
    public final f3g f43198a;

    public hde(f3g f3gVar, Iterable<fpg> iterable, j74 j74Var) {
        this.f43198a = applyAll(f3gVar, iterable, j74Var);
    }

    private static f3g applyAll(f3g f3gVar, Iterable<fpg> iterable, j74 j74Var) {
        Iterator<fpg> it = iterable.iterator();
        while (it.hasNext()) {
            f3gVar = it.next().apply(f3gVar, j74Var);
        }
        return f3gVar;
    }

    @Override // p000.f3g
    public void evaluate() throws Throwable {
        this.f43198a.evaluate();
    }
}
