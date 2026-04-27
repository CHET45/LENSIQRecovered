package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class tce extends f3g {

    /* JADX INFO: renamed from: a */
    public final f3g f84274a;

    /* JADX INFO: renamed from: b */
    public final Object f84275b;

    /* JADX INFO: renamed from: c */
    public final List<ow6> f84276c;

    public tce(f3g f3gVar, List<ow6> list, Object obj) {
        this.f84274a = f3gVar;
        this.f84276c = list;
        this.f84275b = obj;
    }

    @Override // p000.f3g
    public void evaluate() throws Exception {
        ArrayList arrayList = new ArrayList();
        try {
            this.f84274a.evaluate();
            Iterator<ow6> it = this.f84276c.iterator();
            while (it.hasNext()) {
                try {
                    it.next().invokeExplosively(this.f84275b, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            try {
                arrayList.add(th2);
                Iterator<ow6> it2 = this.f84276c.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().invokeExplosively(this.f84275b, new Object[0]);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            } catch (Throwable th4) {
                Iterator<ow6> it3 = this.f84276c.iterator();
                while (it3.hasNext()) {
                    try {
                        it3.next().invokeExplosively(this.f84275b, new Object[0]);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
                throw th4;
            }
        }
        b4b.assertEmpty(arrayList);
    }
}
