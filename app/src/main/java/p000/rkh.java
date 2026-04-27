package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rkh implements ydg {

    /* JADX INFO: renamed from: a */
    public final ikh f78592a;

    /* JADX INFO: renamed from: b */
    public final long[] f78593b;

    /* JADX INFO: renamed from: c */
    public final Map<String, okh> f78594c;

    /* JADX INFO: renamed from: d */
    public final Map<String, lkh> f78595d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f78596e;

    public rkh(ikh ikhVar, Map<String, okh> map, Map<String, lkh> map2, Map<String, String> map3) {
        this.f78592a = ikhVar;
        this.f78595d = map2;
        this.f78596e = map3;
        this.f78594c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f78593b = ikhVar.getEventTimesUs();
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public Map<String, okh> m21414a() {
        return this.f78594c;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public ikh m21415b() {
        return this.f78592a;
    }

    @Override // p000.ydg
    public List<n93> getCues(long j) {
        return this.f78592a.getCues(j, this.f78594c, this.f78595d, this.f78596e);
    }

    @Override // p000.ydg
    public long getEventTime(int i) {
        return this.f78593b[i];
    }

    @Override // p000.ydg
    public int getEventTimeCount() {
        return this.f78593b.length;
    }

    @Override // p000.ydg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = t0i.binarySearchCeil(this.f78593b, j, false, false);
        if (iBinarySearchCeil < this.f78593b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
