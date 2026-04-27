package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class epg {

    /* JADX INFO: renamed from: a */
    public List<wog> f33819a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<wog> f33820b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<xog> f33821c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f33822d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f33823e = false;

    /* JADX INFO: renamed from: epg$a */
    public class C5436a implements ugd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qog f33824a;

        public C5436a(qog qogVar) throws Throwable {
            this.f33824a = qogVar;
        }

        @Override // p000.ugd
        public void protect() throws Throwable {
            this.f33824a.runBare();
        }
    }

    private synchronized List<xog> cloneListeners() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f33821c);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m10185a(qog qogVar) {
        startTest(qogVar);
        runProtected(qogVar, new C5436a(qogVar));
        endTest(qogVar);
    }

    public synchronized void addError(pog pogVar, Throwable th) {
        this.f33820b.add(new wog(pogVar, th));
        Iterator<xog> it = cloneListeners().iterator();
        while (it.hasNext()) {
            it.next().addError(pogVar, th);
        }
    }

    public synchronized void addFailure(pog pogVar, t80 t80Var) {
        this.f33819a.add(new wog(pogVar, t80Var));
        Iterator<xog> it = cloneListeners().iterator();
        while (it.hasNext()) {
            it.next().addFailure(pogVar, t80Var);
        }
    }

    public synchronized void addListener(xog xogVar) {
        this.f33821c.add(xogVar);
    }

    public void endTest(pog pogVar) {
        Iterator<xog> it = cloneListeners().iterator();
        while (it.hasNext()) {
            it.next().endTest(pogVar);
        }
    }

    public synchronized int errorCount() {
        return this.f33820b.size();
    }

    public synchronized Enumeration<wog> errors() {
        return Collections.enumeration(this.f33820b);
    }

    public synchronized int failureCount() {
        return this.f33819a.size();
    }

    public synchronized Enumeration<wog> failures() {
        return Collections.enumeration(this.f33819a);
    }

    public synchronized void removeListener(xog xogVar) {
        this.f33821c.remove(xogVar);
    }

    public synchronized int runCount() {
        return this.f33822d;
    }

    public void runProtected(pog pogVar, ugd ugdVar) {
        try {
            ugdVar.protect();
        } catch (ThreadDeath e) {
            throw e;
        } catch (t80 e2) {
            addFailure(pogVar, e2);
        } catch (Throwable th) {
            addError(pogVar, th);
        }
    }

    public synchronized boolean shouldStop() {
        return this.f33823e;
    }

    public void startTest(pog pogVar) {
        int iCountTestCases = pogVar.countTestCases();
        synchronized (this) {
            this.f33822d += iCountTestCases;
        }
        Iterator<xog> it = cloneListeners().iterator();
        while (it.hasNext()) {
            it.next().startTest(pogVar);
        }
    }

    public synchronized void stop() {
        this.f33823e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean wasSuccessful() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.failureCount()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            int r0 = r1.errorCount()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.epg.wasSuccessful():boolean");
    }
}
