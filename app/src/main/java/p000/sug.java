package p000;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class sug extends ade {

    /* JADX INFO: renamed from: a */
    public final PrintStream f82932a;

    public sug(hi8 hi8Var) {
        this(hi8Var.out());
    }

    private PrintStream getWriter() {
        return this.f82932a;
    }

    /* JADX INFO: renamed from: a */
    public String m22250a(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    /* JADX INFO: renamed from: b */
    public void m22251b(fp5 fp5Var, String str) {
        getWriter().println(str + ") " + fp5Var.getTestHeader());
        getWriter().print(fp5Var.getTrace());
    }

    /* JADX INFO: renamed from: c */
    public void m22252c(w7e w7eVar) {
        List<fp5> failures = w7eVar.getFailures();
        if (failures.size() == 0) {
            return;
        }
        int i = 1;
        if (failures.size() == 1) {
            getWriter().println("There was " + failures.size() + " failure:");
        } else {
            getWriter().println("There were " + failures.size() + " failures:");
        }
        Iterator<fp5> it = failures.iterator();
        while (it.hasNext()) {
            m22251b(it.next(), "" + i);
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m22253d(w7e w7eVar) {
        if (w7eVar.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            PrintStream writer = getWriter();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(w7eVar.getRunCount());
            sb.append(" test");
            sb.append(w7eVar.getRunCount() == 1 ? "" : "s");
            sb.append(c0b.f15434d);
            writer.println(sb.toString());
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            getWriter().println("Tests run: " + w7eVar.getRunCount() + ",  Failures: " + w7eVar.getFailureCount());
        }
        getWriter().println();
    }

    /* JADX INFO: renamed from: e */
    public void m22254e(long j) {
        getWriter().println();
        getWriter().println("Time: " + m22250a(j));
    }

    @Override // p000.ade
    public void testFailure(fp5 fp5Var) {
        this.f82932a.append('E');
    }

    @Override // p000.ade
    public void testIgnored(j74 j74Var) {
        this.f82932a.append('I');
    }

    @Override // p000.ade
    public void testRunFinished(w7e w7eVar) {
        m22254e(w7eVar.getRunTime());
        m22252c(w7eVar);
        m22253d(w7eVar);
    }

    @Override // p000.ade
    public void testStarted(j74 j74Var) {
        this.f82932a.append(a18.f100c);
    }

    public sug(PrintStream printStream) {
        this.f82932a = printStream;
    }
}
