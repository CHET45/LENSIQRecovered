package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class op9<T, Y> {

    /* JADX INFO: renamed from: a */
    public final Map<T, C10492a<Y>> f68261a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f68262b;

    /* JADX INFO: renamed from: c */
    public long f68263c;

    /* JADX INFO: renamed from: d */
    public long f68264d;

    /* JADX INFO: renamed from: op9$a */
    public static final class C10492a<Y> {

        /* JADX INFO: renamed from: a */
        public final Y f68265a;

        /* JADX INFO: renamed from: b */
        public final int f68266b;

        public C10492a(Y y, int i) {
            this.f68265a = y;
            this.f68266b = i;
        }
    }

    public op9(long j) {
        this.f68262b = j;
        this.f68263c = j;
    }

    private void evict() {
        m18805d(this.f68263c);
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m18804a() {
        return this.f68261a.size();
    }

    /* JADX INFO: renamed from: b */
    public int mo2532b(@hib Y y) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo2533c(@efb T t, @hib Y y) {
    }

    public void clearMemory() {
        m18805d(0L);
    }

    public synchronized boolean contains(@efb T t) {
        return this.f68261a.containsKey(t);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m18805d(long j) {
        while (this.f68264d > j) {
            Iterator<Map.Entry<T, C10492a<Y>>> it = this.f68261a.entrySet().iterator();
            Map.Entry<T, C10492a<Y>> next = it.next();
            C10492a<Y> value = next.getValue();
            this.f68264d -= (long) value.f68266b;
            T key = next.getKey();
            it.remove();
            mo2533c(key, value.f68265a);
        }
    }

    @hib
    public synchronized Y get(@efb T t) {
        C10492a<Y> c10492a;
        c10492a = this.f68261a.get(t);
        return c10492a != null ? c10492a.f68265a : null;
    }

    public synchronized long getCurrentSize() {
        return this.f68264d;
    }

    public synchronized long getMaxSize() {
        return this.f68263c;
    }

    @hib
    public synchronized Y put(@efb T t, @hib Y y) {
        int iMo2532b = mo2532b(y);
        long j = iMo2532b;
        if (j >= this.f68263c) {
            mo2533c(t, y);
            return null;
        }
        if (y != null) {
            this.f68264d += j;
        }
        C10492a<Y> c10492aPut = this.f68261a.put(t, y == null ? null : new C10492a<>(y, iMo2532b));
        if (c10492aPut != null) {
            this.f68264d -= (long) c10492aPut.f68266b;
            if (!c10492aPut.f68265a.equals(y)) {
                mo2533c(t, c10492aPut.f68265a);
            }
        }
        evict();
        return c10492aPut != null ? c10492aPut.f68265a : null;
    }

    @hib
    public synchronized Y remove(@efb T t) {
        C10492a<Y> c10492aRemove = this.f68261a.remove(t);
        if (c10492aRemove == null) {
            return null;
        }
        this.f68264d -= (long) c10492aRemove.f68266b;
        return c10492aRemove.f68265a;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f68263c = Math.round(this.f68262b * f);
        evict();
    }
}
