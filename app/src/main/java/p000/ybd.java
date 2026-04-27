package p000;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ybd {

    /* JADX INFO: renamed from: a */
    public w7e f101047a;

    public ybd(List<fp5> list) {
        this(new gp5(list).result());
    }

    public static ybd testResult(Class<?> cls) {
        return testResult(o3e.aClass(cls));
    }

    public int failureCount() {
        return this.f101047a.getFailures().size();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new sug(new PrintStream(byteArrayOutputStream)).testRunFinished(this.f101047a);
        return byteArrayOutputStream.toString();
    }

    private ybd(w7e w7eVar) {
        this.f101047a = w7eVar;
    }

    public static ybd testResult(o3e o3eVar) {
        return new ybd(new fi8().run(o3eVar));
    }
}
