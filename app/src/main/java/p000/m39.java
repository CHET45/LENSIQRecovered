package p000;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m39 implements xl1 {

    /* JADX INFO: renamed from: a */
    public final long f59823a;

    /* JADX INFO: renamed from: b */
    public final TreeSet<mm1> f59824b = new TreeSet<>(new Comparator() { // from class: k39
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m39.compare((mm1) obj, (mm1) obj2);
        }
    });

    /* JADX INFO: renamed from: c */
    public long f59825c;

    public m39(long j) {
        this.f59823a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(mm1 mm1Var, mm1 mm1Var2) {
        long j = mm1Var.f61461f;
        long j2 = mm1Var2.f61461f;
        return j - j2 == 0 ? mm1Var.compareTo(mm1Var2) : j < j2 ? -1 : 1;
    }

    private void evictCache(dl1 dl1Var, long j) {
        while (this.f59825c + j > this.f59823a && !this.f59824b.isEmpty()) {
            dl1Var.removeSpan(this.f59824b.first());
        }
    }

    @Override // p000.xl1
    public void onCacheInitialized() {
    }

    @Override // p000.dl1.InterfaceC4843b
    public void onSpanAdded(dl1 dl1Var, mm1 mm1Var) {
        this.f59824b.add(mm1Var);
        this.f59825c += mm1Var.f61458c;
        evictCache(dl1Var, 0L);
    }

    @Override // p000.dl1.InterfaceC4843b
    public void onSpanRemoved(dl1 dl1Var, mm1 mm1Var) {
        this.f59824b.remove(mm1Var);
        this.f59825c -= mm1Var.f61458c;
    }

    @Override // p000.dl1.InterfaceC4843b
    public void onSpanTouched(dl1 dl1Var, mm1 mm1Var, mm1 mm1Var2) {
        onSpanRemoved(dl1Var, mm1Var);
        onSpanAdded(dl1Var, mm1Var2);
    }

    @Override // p000.xl1
    public void onStartFile(dl1 dl1Var, String str, long j, long j2) {
        if (j2 != -1) {
            evictCache(dl1Var, j2);
        }
    }

    @Override // p000.xl1
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
