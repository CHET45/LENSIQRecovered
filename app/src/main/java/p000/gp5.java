package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gp5 {

    /* JADX INFO: renamed from: a */
    public final List<fp5> f40693a;

    public gp5(List<fp5> list) {
        this.f40693a = list;
    }

    public w7e result() {
        w7e w7eVar = new w7e();
        ade adeVarCreateListener = w7eVar.createListener();
        Iterator<fp5> it = this.f40693a.iterator();
        while (it.hasNext()) {
            try {
                adeVarCreateListener.testFailure(it.next());
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return w7eVar;
    }
}
