package p000;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes7.dex */
public class hpg extends ku0 {

    /* JADX INFO: renamed from: g */
    public static final int f44457g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f44458h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f44459i = 2;

    /* JADX INFO: renamed from: f */
    public a8e f44460f;

    public hpg() {
        this(System.out);
    }

    public static void main(String[] strArr) {
        try {
            if (!new hpg().start(strArr).wasSuccessful()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    public static void run(Class<? extends qog> cls) {
        run(new npg(cls));
    }

    public static void runAndWait(pog pogVar) {
        new hpg().doRun(pogVar, true);
    }

    public epg doRun(pog pogVar) {
        return doRun(pogVar, false);
    }

    @Override // p000.ku0
    /* JADX INFO: renamed from: f */
    public void mo12532f(String str) {
        System.err.println(str);
        System.exit(1);
    }

    /* JADX INFO: renamed from: j */
    public epg m12533j() {
        return new epg();
    }

    /* JADX INFO: renamed from: k */
    public void m12534k(boolean z) {
        if (z) {
            this.f44460f.m190j();
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public epg m12535l(String str, String str2, boolean z) throws Exception {
        return doRun(npg.createTest(m14997d(str).asSubclass(qog.class), str2), z);
    }

    public void setPrinter(a8e a8eVar) {
        this.f44460f = a8eVar;
    }

    public epg start(String[] strArr) throws Exception {
        String strExtractClassName = "";
        String strSubstring = strExtractClassName;
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                strExtractClassName = extractClassName(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                String str = strArr[i];
                int iLastIndexOf = str.lastIndexOf(46);
                String strSubstring2 = str.substring(0, iLastIndexOf);
                strSubstring = str.substring(iLastIndexOf + 1);
                strExtractClassName = strSubstring2;
            } else if (strArr[i].equals("-v")) {
                System.err.println("JUnit " + v4i.m23774id() + " by Kent Beck and Erich Gamma");
            } else {
                strExtractClassName = strArr[i];
            }
            i++;
        }
        if (strExtractClassName.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !strSubstring.equals("") ? m12535l(strExtractClassName, strSubstring, z) : doRun(getTest(strExtractClassName), z);
        } catch (Exception e) {
            throw new Exception("Could not create and run test suite: " + e);
        }
    }

    @Override // p000.ku0
    public void testEnded(String str) {
    }

    @Override // p000.ku0
    public void testFailed(int i, pog pogVar, Throwable th) {
    }

    @Override // p000.ku0
    public void testStarted(String str) {
    }

    public hpg(PrintStream printStream) {
        this(new a8e(printStream));
    }

    public static epg run(pog pogVar) {
        return new hpg().doRun(pogVar);
    }

    public epg doRun(pog pogVar, boolean z) {
        epg epgVarM12533j = m12533j();
        epgVarM12533j.addListener(this.f44460f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        pogVar.run(epgVarM12533j);
        this.f44460f.m182b(epgVarM12533j, System.currentTimeMillis() - jCurrentTimeMillis);
        m12534k(z);
        return epgVarM12533j;
    }

    public hpg(a8e a8eVar) {
        this.f44460f = a8eVar;
    }
}
