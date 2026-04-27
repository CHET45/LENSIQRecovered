package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class p18 extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f69391a;

    public p18(List<Throwable> list) {
        this.f69391a = list;
    }

    public List<Throwable> getCauses() {
        return this.f69391a;
    }

    public p18(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public p18(String str) {
        this(new Exception(str));
    }
}
