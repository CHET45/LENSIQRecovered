package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes7.dex */
public class a8e implements xog {

    /* JADX INFO: renamed from: a */
    public PrintStream f622a;

    /* JADX INFO: renamed from: b */
    public int f623b = 0;

    public a8e(PrintStream printStream) {
        this.f622a = printStream;
    }

    /* JADX INFO: renamed from: a */
    public String m181a(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    @Override // p000.xog
    public void addError(pog pogVar, Throwable th) {
        getWriter().print(k95.f53029S4);
    }

    @Override // p000.xog
    public void addFailure(pog pogVar, t80 t80Var) {
        getWriter().print("F");
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m182b(epg epgVar, long j) {
        m189i(j);
        m186f(epgVar);
        m187g(epgVar);
        m188h(epgVar);
    }

    /* JADX INFO: renamed from: c */
    public void m183c(wog wogVar, int i) {
        getWriter().print(i + ") " + wogVar.failedTest());
    }

    /* JADX INFO: renamed from: d */
    public void m184d(wog wogVar) {
        getWriter().print(ku0.getFilteredTrace(wogVar.trace()));
    }

    /* JADX INFO: renamed from: e */
    public void m185e(Enumeration<wog> enumeration, int i, String str) {
        if (i == 0) {
            return;
        }
        if (i == 1) {
            getWriter().println("There was " + i + C2473f.f17566z + str + g1i.f38277c);
        } else {
            getWriter().println("There were " + i + C2473f.f17566z + str + "s:");
        }
        int i2 = 1;
        while (enumeration.hasMoreElements()) {
            printDefect(enumeration.nextElement(), i2);
            i2++;
        }
    }

    @Override // p000.xog
    public void endTest(pog pogVar) {
    }

    /* JADX INFO: renamed from: f */
    public void m186f(epg epgVar) {
        m185e(epgVar.errors(), epgVar.errorCount(), "error");
    }

    /* JADX INFO: renamed from: g */
    public void m187g(epg epgVar) {
        m185e(epgVar.failures(), epgVar.failureCount(), "failure");
    }

    public PrintStream getWriter() {
        return this.f622a;
    }

    /* JADX INFO: renamed from: h */
    public void m188h(epg epgVar) {
        if (epgVar.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            PrintStream writer = getWriter();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(epgVar.runCount());
            sb.append(" test");
            sb.append(epgVar.runCount() == 1 ? "" : "s");
            sb.append(c0b.f15434d);
            writer.println(sb.toString());
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            getWriter().println("Tests run: " + epgVar.runCount() + ",  Failures: " + epgVar.failureCount() + ",  Errors: " + epgVar.errorCount());
        }
        getWriter().println();
    }

    /* JADX INFO: renamed from: i */
    public void m189i(long j) {
        getWriter().println();
        getWriter().println("Time: " + m181a(j));
    }

    /* JADX INFO: renamed from: j */
    public void m190j() {
        getWriter().println();
        getWriter().println("<RETURN> to continue");
    }

    public void printDefect(wog wogVar, int i) {
        m183c(wogVar, i);
        m184d(wogVar);
    }

    @Override // p000.xog
    public void startTest(pog pogVar) {
        getWriter().print(".");
        int i = this.f623b;
        this.f623b = i + 1;
        if (i >= 40) {
            getWriter().println();
            this.f623b = 0;
        }
    }
}
