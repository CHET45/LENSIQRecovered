package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class h55 extends tde {

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f42400a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f42401b;

    public h55(Class<?> cls, Throwable th) {
        if (cls == null) {
            throw new NullPointerException("Test class cannot be null");
        }
        this.f42401b = cls;
        this.f42400a = getCauses(th);
    }

    private j74 describeCause(Throwable th) {
        return j74.createTestDescription(this.f42401b, "initializationError");
    }

    private List<Throwable> getCauses(Throwable th) {
        return th instanceof InvocationTargetException ? getCauses(th.getCause()) : th instanceof o18 ? ((o18) th).getCauses() : th instanceof p18 ? ((p18) th).getCauses() : Arrays.asList(th);
    }

    private void runCause(Throwable th, bde bdeVar) {
        j74 j74VarDescribeCause = describeCause(th);
        bdeVar.fireTestStarted(j74VarDescribeCause);
        bdeVar.fireTestFailure(new fp5(j74VarDescribeCause, th));
        bdeVar.fireTestFinished(j74VarDescribeCause);
    }

    @Override // p000.tde, p000.g74
    public j74 getDescription() {
        j74 j74VarCreateSuiteDescription = j74.createSuiteDescription(this.f42401b);
        Iterator<Throwable> it = this.f42400a.iterator();
        while (it.hasNext()) {
            j74VarCreateSuiteDescription.addChild(describeCause(it.next()));
        }
        return j74VarCreateSuiteDescription;
    }

    @Override // p000.tde
    public void run(bde bdeVar) {
        Iterator<Throwable> it = this.f42400a.iterator();
        while (it.hasNext()) {
            runCause(it.next(), bdeVar);
        }
    }
}
