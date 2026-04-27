package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class fv4 {

    /* JADX INFO: renamed from: a */
    public final bde f37807a;

    /* JADX INFO: renamed from: b */
    public final j74 f37808b;

    public fv4(bde bdeVar, j74 j74Var) {
        this.f37807a = bdeVar;
        this.f37808b = j74Var;
    }

    private void addMultipleFailureException(b4b b4bVar) {
        Iterator<Throwable> it = b4bVar.getFailures().iterator();
        while (it.hasNext()) {
            addFailure(it.next());
        }
    }

    public void addFailedAssumption(g90 g90Var) {
        this.f37807a.fireTestAssumptionFailed(new fp5(this.f37808b, g90Var));
    }

    public void addFailure(Throwable th) {
        if (th instanceof b4b) {
            addMultipleFailureException((b4b) th);
        } else {
            this.f37807a.fireTestFailure(new fp5(this.f37808b, th));
        }
    }

    public void fireTestFinished() {
        this.f37807a.fireTestFinished(this.f37808b);
    }

    public void fireTestIgnored() {
        this.f37807a.fireTestIgnored(this.f37808b);
    }

    public void fireTestStarted() {
        this.f37807a.fireTestStarted(this.f37808b);
    }
}
