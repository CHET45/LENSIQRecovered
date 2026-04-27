package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import p000.cl1;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ym1 implements cl1.InterfaceC2375b {

    /* JADX INFO: renamed from: f */
    public static final String f102044f = "CachedRegionTracker";

    /* JADX INFO: renamed from: g */
    public static final int f102045g = -1;

    /* JADX INFO: renamed from: h */
    public static final int f102046h = -2;

    /* JADX INFO: renamed from: a */
    public final cl1 f102047a;

    /* JADX INFO: renamed from: b */
    public final String f102048b;

    /* JADX INFO: renamed from: c */
    public final mz1 f102049c;

    /* JADX INFO: renamed from: d */
    public final TreeSet<C15720a> f102050d = new TreeSet<>();

    /* JADX INFO: renamed from: e */
    public final C15720a f102051e = new C15720a(0, 0);

    /* JADX INFO: renamed from: ym1$a */
    public static class C15720a implements Comparable<C15720a> {

        /* JADX INFO: renamed from: a */
        public long f102052a;

        /* JADX INFO: renamed from: b */
        public long f102053b;

        /* JADX INFO: renamed from: c */
        public int f102054c;

        public C15720a(long j, long j2) {
            this.f102052a = j;
            this.f102053b = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(C15720a c15720a) {
            return Long.compare(this.f102052a, c15720a.f102052a);
        }
    }

    public ym1(cl1 cl1Var, String str, mz1 mz1Var) {
        this.f102047a = cl1Var;
        this.f102048b = str;
        this.f102049c = mz1Var;
        synchronized (this) {
            try {
                Iterator<nm1> itDescendingIterator = cl1Var.addListener(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    mergeSpan(itDescendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(nm1 nm1Var) {
        long j = nm1Var.f64970b;
        C15720a c15720a = new C15720a(j, nm1Var.f64971c + j);
        C15720a c15720aFloor = this.f102050d.floor(c15720a);
        C15720a c15720aCeiling = this.f102050d.ceiling(c15720a);
        boolean zRegionsConnect = regionsConnect(c15720aFloor, c15720a);
        if (regionsConnect(c15720a, c15720aCeiling)) {
            if (zRegionsConnect) {
                c15720aFloor.f102053b = c15720aCeiling.f102053b;
                c15720aFloor.f102054c = c15720aCeiling.f102054c;
            } else {
                c15720a.f102053b = c15720aCeiling.f102053b;
                c15720a.f102054c = c15720aCeiling.f102054c;
                this.f102050d.add(c15720a);
            }
            this.f102050d.remove(c15720aCeiling);
            return;
        }
        if (!zRegionsConnect) {
            int iBinarySearch = Arrays.binarySearch(this.f102049c.f62832f, c15720a.f102053b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c15720a.f102054c = iBinarySearch;
            this.f102050d.add(c15720a);
            return;
        }
        c15720aFloor.f102053b = c15720a.f102053b;
        int i = c15720aFloor.f102054c;
        while (true) {
            mz1 mz1Var = this.f102049c;
            if (i >= mz1Var.f62830d - 1) {
                break;
            }
            int i2 = i + 1;
            if (mz1Var.f62832f[i2] > c15720aFloor.f102053b) {
                break;
            } else {
                i = i2;
            }
        }
        c15720aFloor.f102054c = i;
    }

    private boolean regionsConnect(@hib C15720a c15720a, @hib C15720a c15720a2) {
        return (c15720a == null || c15720a2 == null || c15720a.f102053b != c15720a2.f102052a) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        C15720a c15720a = this.f102051e;
        c15720a.f102052a = j;
        C15720a c15720aFloor = this.f102050d.floor(c15720a);
        if (c15720aFloor != null) {
            long j2 = c15720aFloor.f102053b;
            if (j <= j2 && (i = c15720aFloor.f102054c) != -1) {
                mz1 mz1Var = this.f102049c;
                if (i == mz1Var.f62830d - 1) {
                    if (j2 == mz1Var.f62832f[i] + ((long) mz1Var.f62831e[i])) {
                        return -2;
                    }
                }
                return (int) ((mz1Var.f62834h[i] + ((mz1Var.f62833g[i] * (j2 - mz1Var.f62832f[i])) / ((long) mz1Var.f62831e[i]))) / 1000);
            }
        }
        return -1;
    }

    @Override // p000.cl1.InterfaceC2375b
    public synchronized void onSpanAdded(cl1 cl1Var, nm1 nm1Var) {
        mergeSpan(nm1Var);
    }

    @Override // p000.cl1.InterfaceC2375b
    public synchronized void onSpanRemoved(cl1 cl1Var, nm1 nm1Var) {
        long j = nm1Var.f64970b;
        C15720a c15720a = new C15720a(j, nm1Var.f64971c + j);
        C15720a c15720aFloor = this.f102050d.floor(c15720a);
        if (c15720aFloor == null) {
            xh9.m25144e("CachedRegionTracker", "Removed a span we were not aware of");
            return;
        }
        this.f102050d.remove(c15720aFloor);
        long j2 = c15720aFloor.f102052a;
        long j3 = c15720a.f102052a;
        if (j2 < j3) {
            C15720a c15720a2 = new C15720a(j2, j3);
            int iBinarySearch = Arrays.binarySearch(this.f102049c.f62832f, c15720a2.f102053b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c15720a2.f102054c = iBinarySearch;
            this.f102050d.add(c15720a2);
        }
        long j4 = c15720aFloor.f102053b;
        long j5 = c15720a.f102053b;
        if (j4 > j5) {
            C15720a c15720a3 = new C15720a(j5 + 1, j4);
            c15720a3.f102054c = c15720aFloor.f102054c;
            this.f102050d.add(c15720a3);
        }
    }

    @Override // p000.cl1.InterfaceC2375b
    public void onSpanTouched(cl1 cl1Var, nm1 nm1Var, nm1 nm1Var2) {
    }

    public void release() {
        this.f102047a.removeListener(this.f102048b, this);
    }
}
