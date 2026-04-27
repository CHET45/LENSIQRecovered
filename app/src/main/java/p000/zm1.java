package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import p000.dl1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zm1 implements dl1.InterfaceC4843b {

    /* JADX INFO: renamed from: f */
    public static final String f105452f = "CachedRegionTracker";

    /* JADX INFO: renamed from: g */
    public static final int f105453g = -1;

    /* JADX INFO: renamed from: h */
    public static final int f105454h = -2;

    /* JADX INFO: renamed from: a */
    public final dl1 f105455a;

    /* JADX INFO: renamed from: b */
    public final String f105456b;

    /* JADX INFO: renamed from: c */
    public final lz1 f105457c;

    /* JADX INFO: renamed from: d */
    public final TreeSet<C16184a> f105458d = new TreeSet<>();

    /* JADX INFO: renamed from: e */
    public final C16184a f105459e = new C16184a(0, 0);

    /* JADX INFO: renamed from: zm1$a */
    public static class C16184a implements Comparable<C16184a> {

        /* JADX INFO: renamed from: a */
        public long f105460a;

        /* JADX INFO: renamed from: b */
        public long f105461b;

        /* JADX INFO: renamed from: c */
        public int f105462c;

        public C16184a(long j, long j2) {
            this.f105460a = j;
            this.f105461b = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(C16184a c16184a) {
            return x0i.compareLong(this.f105460a, c16184a.f105460a);
        }
    }

    public zm1(dl1 dl1Var, String str, lz1 lz1Var) {
        this.f105455a = dl1Var;
        this.f105456b = str;
        this.f105457c = lz1Var;
        synchronized (this) {
            try {
                Iterator<mm1> itDescendingIterator = dl1Var.addListener(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    mergeSpan(itDescendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(mm1 mm1Var) {
        long j = mm1Var.f61457b;
        C16184a c16184a = new C16184a(j, mm1Var.f61458c + j);
        C16184a c16184aFloor = this.f105458d.floor(c16184a);
        C16184a c16184aCeiling = this.f105458d.ceiling(c16184a);
        boolean zRegionsConnect = regionsConnect(c16184aFloor, c16184a);
        if (regionsConnect(c16184a, c16184aCeiling)) {
            if (zRegionsConnect) {
                c16184aFloor.f105461b = c16184aCeiling.f105461b;
                c16184aFloor.f105462c = c16184aCeiling.f105462c;
            } else {
                c16184a.f105461b = c16184aCeiling.f105461b;
                c16184a.f105462c = c16184aCeiling.f105462c;
                this.f105458d.add(c16184a);
            }
            this.f105458d.remove(c16184aCeiling);
            return;
        }
        if (!zRegionsConnect) {
            int iBinarySearch = Arrays.binarySearch(this.f105457c.f59301f, c16184a.f105461b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c16184a.f105462c = iBinarySearch;
            this.f105458d.add(c16184a);
            return;
        }
        c16184aFloor.f105461b = c16184a.f105461b;
        int i = c16184aFloor.f105462c;
        while (true) {
            lz1 lz1Var = this.f105457c;
            if (i >= lz1Var.f59299d - 1) {
                break;
            }
            int i2 = i + 1;
            if (lz1Var.f59301f[i2] > c16184aFloor.f105461b) {
                break;
            } else {
                i = i2;
            }
        }
        c16184aFloor.f105462c = i;
    }

    private boolean regionsConnect(@hib C16184a c16184a, @hib C16184a c16184a2) {
        return (c16184a == null || c16184a2 == null || c16184a.f105461b != c16184a2.f105460a) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        C16184a c16184a = this.f105459e;
        c16184a.f105460a = j;
        C16184a c16184aFloor = this.f105458d.floor(c16184a);
        if (c16184aFloor != null) {
            long j2 = c16184aFloor.f105461b;
            if (j <= j2 && (i = c16184aFloor.f105462c) != -1) {
                lz1 lz1Var = this.f105457c;
                if (i == lz1Var.f59299d - 1) {
                    if (j2 == lz1Var.f59301f[i] + ((long) lz1Var.f59300e[i])) {
                        return -2;
                    }
                }
                return (int) ((lz1Var.f59303h[i] + ((lz1Var.f59302g[i] * (j2 - lz1Var.f59301f[i])) / ((long) lz1Var.f59300e[i]))) / 1000);
            }
        }
        return -1;
    }

    @Override // p000.dl1.InterfaceC4843b
    public synchronized void onSpanAdded(dl1 dl1Var, mm1 mm1Var) {
        mergeSpan(mm1Var);
    }

    @Override // p000.dl1.InterfaceC4843b
    public synchronized void onSpanRemoved(dl1 dl1Var, mm1 mm1Var) {
        long j = mm1Var.f61457b;
        C16184a c16184a = new C16184a(j, mm1Var.f61458c + j);
        C16184a c16184aFloor = this.f105458d.floor(c16184a);
        if (c16184aFloor == null) {
            yh9.m25915e("CachedRegionTracker", "Removed a span we were not aware of");
            return;
        }
        this.f105458d.remove(c16184aFloor);
        long j2 = c16184aFloor.f105460a;
        long j3 = c16184a.f105460a;
        if (j2 < j3) {
            C16184a c16184a2 = new C16184a(j2, j3);
            int iBinarySearch = Arrays.binarySearch(this.f105457c.f59301f, c16184a2.f105461b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c16184a2.f105462c = iBinarySearch;
            this.f105458d.add(c16184a2);
        }
        long j4 = c16184aFloor.f105461b;
        long j5 = c16184a.f105461b;
        if (j4 > j5) {
            C16184a c16184a3 = new C16184a(j5 + 1, j4);
            c16184a3.f105462c = c16184aFloor.f105462c;
            this.f105458d.add(c16184a3);
        }
    }

    @Override // p000.dl1.InterfaceC4843b
    public void onSpanTouched(dl1 dl1Var, mm1 mm1Var, mm1 mm1Var2) {
    }

    public void release() {
        this.f105455a.removeListener(this.f105456b, this);
    }
}
