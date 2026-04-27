package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class o18 extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f66206a;

    public o18(List<Throwable> list) {
        this.f66206a = list;
    }

    public List<Throwable> getCauses() {
        return this.f66206a;
    }

    public o18(Throwable th) {
        this((List<Throwable>) Arrays.asList(th));
    }

    public o18(String str) {
        this(new Exception(str));
    }
}
