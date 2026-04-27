package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class yce extends f3g {

    /* JADX INFO: renamed from: a */
    public final f3g f101126a;

    /* JADX INFO: renamed from: b */
    public final Object f101127b;

    /* JADX INFO: renamed from: c */
    public final List<ow6> f101128c;

    public yce(f3g f3gVar, List<ow6> list, Object obj) {
        this.f101126a = f3gVar;
        this.f101128c = list;
        this.f101127b = obj;
    }

    @Override // p000.f3g
    public void evaluate() throws Throwable {
        Iterator<ow6> it = this.f101128c.iterator();
        while (it.hasNext()) {
            it.next().invokeExplosively(this.f101127b, new Object[0]);
        }
        this.f101126a.evaluate();
    }
}
