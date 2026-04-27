package p000;

import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p000.ga0;
import p000.wp9;

/* JADX INFO: loaded from: classes5.dex */
public class wp9 {

    /* JADX INFO: renamed from: c */
    public static final long f95013c;

    /* JADX INFO: renamed from: d */
    public static final long f95014d;

    /* JADX INFO: renamed from: a */
    public final sp9 f95015a;

    /* JADX INFO: renamed from: b */
    public final C14736b f95016b;

    /* JADX INFO: renamed from: wp9$a */
    public class C14735a implements uoe {

        /* JADX INFO: renamed from: a */
        public final ga0 f95017a;

        /* JADX INFO: renamed from: b */
        public final qe9 f95018b;

        /* JADX INFO: renamed from: c */
        public boolean f95019c = false;

        /* JADX INFO: renamed from: d */
        @hib
        public ga0.C6179b f95020d;

        public C14735a(ga0 ga0Var, qe9 qe9Var) {
            this.f95017a = ga0Var;
            this.f95018b = qe9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleGC$0() {
            this.f95018b.collectGarbage(wp9.this);
            this.f95019c = true;
            scheduleGC();
        }

        private void scheduleGC() {
            this.f95020d = this.f95017a.enqueueAfterDelay(ga0.EnumC6181d.GARBAGE_COLLECTION, this.f95019c ? wp9.f95014d : wp9.f95013c, new Runnable() { // from class: vp9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91932a.lambda$scheduleGC$0();
                }
            });
        }

        @Override // p000.uoe
        public void start() {
            if (wp9.this.f95016b.f95026a != -1) {
                scheduleGC();
            }
        }

        @Override // p000.uoe
        public void stop() {
            ga0.C6179b c6179b = this.f95020d;
            if (c6179b != null) {
                c6179b.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: wp9$b */
    public static class C14736b {

        /* JADX INFO: renamed from: d */
        public static final long f95022d = -1;

        /* JADX INFO: renamed from: e */
        public static final long f95023e = 104857600;

        /* JADX INFO: renamed from: f */
        public static final int f95024f = 10;

        /* JADX INFO: renamed from: g */
        public static final int f95025g = 1000;

        /* JADX INFO: renamed from: a */
        public long f95026a;

        /* JADX INFO: renamed from: b */
        public int f95027b;

        /* JADX INFO: renamed from: c */
        public final int f95028c;

        public C14736b(long j, int i, int i2) {
            this.f95026a = j;
            this.f95027b = i;
            this.f95028c = i2;
        }

        public static C14736b Default() {
            return new C14736b(104857600L, 10, 1000);
        }

        public static C14736b Disabled() {
            return new C14736b(-1L, 0, 0);
        }

        public static C14736b WithCacheSizeBytes(long j) {
            return new C14736b(j, 10, 1000);
        }
    }

    /* JADX INFO: renamed from: wp9$c */
    public static class C14737c {

        /* JADX INFO: renamed from: a */
        public final boolean f95029a;

        /* JADX INFO: renamed from: b */
        public final int f95030b;

        /* JADX INFO: renamed from: c */
        public final int f95031c;

        /* JADX INFO: renamed from: d */
        public final int f95032d;

        public C14737c(boolean z, int i, int i2, int i3) {
            this.f95029a = z;
            this.f95030b = i;
            this.f95031c = i2;
            this.f95032d = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C14737c m24707a() {
            return new C14737c(false, 0, 0, 0);
        }

        public int getDocumentsRemoved() {
            return this.f95032d;
        }

        public int getSequenceNumbersCollected() {
            return this.f95030b;
        }

        public int getTargetsRemoved() {
            return this.f95031c;
        }

        public boolean hasRun() {
            return this.f95029a;
        }
    }

    /* JADX INFO: renamed from: wp9$d */
    public static class C14738d {

        /* JADX INFO: renamed from: c */
        public static final Comparator<Long> f95033c = new Comparator() { // from class: xp9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wp9.C14738d.lambda$static$0((Long) obj, (Long) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final PriorityQueue<Long> f95034a;

        /* JADX INFO: renamed from: b */
        public final int f95035b;

        public C14738d(int i) {
            this.f95035b = i;
            this.f95034a = new PriorityQueue<>(i, f95033c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Long l, Long l2) {
            return l2.compareTo(l);
        }

        /* JADX INFO: renamed from: b */
        public void m24709b(Long l) {
            if (this.f95034a.size() < this.f95035b) {
                this.f95034a.add(l);
                return;
            }
            if (l.longValue() < this.f95034a.peek().longValue()) {
                this.f95034a.poll();
                this.f95034a.add(l);
            }
        }

        /* JADX INFO: renamed from: c */
        public long m24710c() {
            return this.f95034a.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f95013c = timeUnit.toMillis(1L);
        f95014d = timeUnit.toMillis(5L);
    }

    public wp9(sp9 sp9Var, C14736b c14736b) {
        this.f95015a = sp9Var;
        this.f95016b = c14736b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getNthSequenceNumber$0(C14738d c14738d, vmg vmgVar) {
        c14738d.m24709b(Long.valueOf(vmgVar.getSequenceNumber()));
    }

    private C14737c runGarbageCollection(SparseArray<?> sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM24700e = m24700e(this.f95016b.f95027b);
        if (iM24700e > this.f95016b.f95028c) {
            fj9.debug("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f95016b.f95028c + " from " + iM24700e, new Object[0]);
            iM24700e = this.f95016b.f95028c;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jM24703h = m24703h(iM24700e);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iM24705j = m24705j(jM24703h, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iM24704i = m24704i(jM24703h);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (fj9.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iM24700e), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            fj9.debug("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iM24705j), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iM24704i), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        }
        return new C14737c(true, iM24700e, iM24705j, iM24704i);
    }

    /* JADX INFO: renamed from: e */
    public int m24700e(int i) {
        return (int) ((i / 100.0f) * this.f95015a.getSequenceNumberCount());
    }

    /* JADX INFO: renamed from: f */
    public C14737c m24701f(SparseArray<?> sparseArray) {
        if (this.f95016b.f95026a == -1) {
            fj9.debug("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return C14737c.m24707a();
        }
        long jM24702g = m24702g();
        if (jM24702g >= this.f95016b.f95026a) {
            return runGarbageCollection(sparseArray);
        }
        fj9.debug("LruGarbageCollector", "Garbage collection skipped; Cache size " + jM24702g + " is lower than threshold " + this.f95016b.f95026a, new Object[0]);
        return C14737c.m24707a();
    }

    /* JADX INFO: renamed from: g */
    public long m24702g() {
        return this.f95015a.getByteSize();
    }

    /* JADX INFO: renamed from: h */
    public long m24703h(int i) {
        if (i == 0) {
            return -1L;
        }
        final C14738d c14738d = new C14738d(i);
        this.f95015a.forEachTarget(new su2() { // from class: tp9
            @Override // p000.su2
            public final void accept(Object obj) {
                wp9.lambda$getNthSequenceNumber$0(c14738d, (vmg) obj);
            }
        });
        this.f95015a.forEachOrphanedDocumentSequenceNumber(new su2() { // from class: up9
            @Override // p000.su2
            public final void accept(Object obj) {
                c14738d.m24709b((Long) obj);
            }
        });
        return c14738d.m24710c();
    }

    /* JADX INFO: renamed from: i */
    public int m24704i(long j) {
        return this.f95015a.removeOrphanedDocuments(j);
    }

    /* JADX INFO: renamed from: j */
    public int m24705j(long j, SparseArray<?> sparseArray) {
        return this.f95015a.removeTargets(j, sparseArray);
    }

    public C14735a newScheduler(ga0 ga0Var, qe9 qe9Var) {
        return new C14735a(ga0Var, qe9Var);
    }

    public wp9 withNewThreshold(long j) {
        C14736b c14736b = this.f95016b;
        c14736b.f95026a = j;
        c14736b.f95027b = 100;
        return this;
    }
}
