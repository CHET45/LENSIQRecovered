package p000;

/* JADX INFO: loaded from: classes8.dex */
public class fi8 {

    /* JADX INFO: renamed from: a */
    public final bde f36804a = new bde();

    /* JADX INFO: renamed from: a */
    public static vo2 m10929a() {
        return new vo2();
    }

    public static void main(String... strArr) {
        System.exit(!new fi8().m10930b(new srd(), strArr).wasSuccessful() ? 1 : 0);
    }

    public static w7e runClasses(Class<?>... clsArr) {
        return runClasses(m10929a(), clsArr);
    }

    public void addListener(ade adeVar) {
        this.f36804a.addListener(adeVar);
    }

    /* JADX INFO: renamed from: b */
    public w7e m10930b(hi8 hi8Var, String... strArr) {
        hi8Var.out().println("JUnit version " + v4i.m23774id());
        ei8 ei8Var = ei8.parse(strArr);
        addListener(new sug(hi8Var));
        return run(ei8Var.createRequest(m10929a()));
    }

    public String getVersion() {
        return v4i.m23774id();
    }

    public void removeListener(ade adeVar) {
        this.f36804a.removeListener(adeVar);
    }

    public w7e run(Class<?>... clsArr) {
        return run(m10929a(), clsArr);
    }

    public static w7e runClasses(vo2 vo2Var, Class<?>... clsArr) {
        return new fi8().run(vo2Var, clsArr);
    }

    public w7e run(vo2 vo2Var, Class<?>... clsArr) {
        return run(o3e.classes(vo2Var, clsArr));
    }

    public w7e run(o3e o3eVar) {
        return run(o3eVar.getRunner());
    }

    public w7e run(pog pogVar) {
        return run(new wh8(pogVar));
    }

    public w7e run(tde tdeVar) {
        w7e w7eVar = new w7e();
        ade adeVarCreateListener = w7eVar.createListener();
        this.f36804a.addFirstListener(adeVarCreateListener);
        try {
            this.f36804a.fireTestRunStarted(tdeVar.getDescription());
            tdeVar.run(this.f36804a);
            this.f36804a.fireTestRunFinished(w7eVar);
            return w7eVar;
        } finally {
            removeListener(adeVarCreateListener);
        }
    }
}
