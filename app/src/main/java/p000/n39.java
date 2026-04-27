package p000;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class n39 implements yl1 {

    /* JADX INFO: renamed from: a */
    public final long f63185a;

    /* JADX INFO: renamed from: b */
    public final TreeSet<nm1> f63186b = new TreeSet<>(new Comparator() { // from class: l39
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n39.compare((nm1) obj, (nm1) obj2);
        }
    });

    /* JADX INFO: renamed from: c */
    public long f63187c;

    public n39(long j) {
        this.f63185a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(nm1 nm1Var, nm1 nm1Var2) {
        long j = nm1Var.f64974f;
        long j2 = nm1Var2.f64974f;
        return j - j2 == 0 ? nm1Var.compareTo(nm1Var2) : j < j2 ? -1 : 1;
    }

    private void evictCache(cl1 cl1Var, long j) {
        while (this.f63187c + j > this.f63185a && !this.f63186b.isEmpty()) {
            cl1Var.removeSpan(this.f63186b.first());
        }
    }

    @Override // p000.yl1
    public void onCacheInitialized() {
    }

    @Override // p000.cl1.InterfaceC2375b
    public void onSpanAdded(cl1 cl1Var, nm1 nm1Var) {
        this.f63186b.add(nm1Var);
        this.f63187c += nm1Var.f64971c;
        evictCache(cl1Var, 0L);
    }

    @Override // p000.cl1.InterfaceC2375b
    public void onSpanRemoved(cl1 cl1Var, nm1 nm1Var) {
        this.f63186b.remove(nm1Var);
        this.f63187c -= nm1Var.f64971c;
    }

    @Override // p000.cl1.InterfaceC2375b
    public void onSpanTouched(cl1 cl1Var, nm1 nm1Var, nm1 nm1Var2) {
        onSpanRemoved(cl1Var, nm1Var);
        onSpanAdded(cl1Var, nm1Var2);
    }

    @Override // p000.yl1
    public void onStartFile(cl1 cl1Var, String str, long j, long j2) {
        if (j2 != -1) {
            evictCache(cl1Var, j2);
        }
    }

    @Override // p000.yl1
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
