package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public class vvf extends o3e {

    /* JADX INFO: renamed from: a */
    public final o3e f92397a;

    /* JADX INFO: renamed from: b */
    public final Comparator<j74> f92398b;

    public vvf(o3e o3eVar, Comparator<j74> comparator) {
        this.f92397a = o3eVar;
        this.f92398b = comparator;
    }

    @Override // p000.o3e
    public tde getRunner() {
        tde runner = this.f92397a.getRunner();
        new svf(this.f92398b).apply(runner);
        return runner;
    }
}
