package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p000.ga0;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public class a08 {

    /* JADX INFO: renamed from: f */
    public static final String f5f = "IndexBackfiller";

    /* JADX INFO: renamed from: g */
    public static final long f6g = TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: h */
    public static final long f7h = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: i */
    public static final int f8i = 50;

    /* JADX INFO: renamed from: a */
    public final C0002a f9a;

    /* JADX INFO: renamed from: b */
    public final jqc f10b;

    /* JADX INFO: renamed from: c */
    public final lfg<f08> f11c;

    /* JADX INFO: renamed from: d */
    public final lfg<ld9> f12d;

    /* JADX INFO: renamed from: e */
    public int f13e;

    /* JADX INFO: renamed from: a08$a */
    public class C0002a implements uoe {

        /* JADX INFO: renamed from: a */
        @hib
        public ga0.C6179b f14a;

        /* JADX INFO: renamed from: b */
        public final ga0 f15b;

        public C0002a(ga0 ga0Var) {
            this.f15b = ga0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleBackfill$0() {
            fj9.debug(a08.f5f, "Documents written: %s", Integer.valueOf(a08.this.backfill()));
            scheduleBackfill(a08.f7h);
        }

        private void scheduleBackfill(long j) {
            this.f14a = this.f15b.enqueueAfterDelay(ga0.EnumC6181d.INDEX_BACKFILL, j, new Runnable() { // from class: zz7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106574a.lambda$scheduleBackfill$0();
                }
            });
        }

        @Override // p000.uoe
        public void start() {
            scheduleBackfill(a08.f6g);
        }

        @Override // p000.uoe
        public void stop() {
            ga0.C6179b c6179b = this.f14a;
            if (c6179b != null) {
                c6179b.cancel();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a08(jqc jqcVar, ga0 ga0Var, final qe9 qe9Var) {
        this(jqcVar, ga0Var, new lfg() { // from class: wz7
            @Override // p000.lfg
            public final Object get() {
                return qe9Var.getIndexManagerForCurrentUser();
            }
        }, new lfg() { // from class: xz7
            @Override // p000.lfg
            public final Object get() {
                return qe9Var.getLocalDocumentsForCurrentUser();
            }
        });
        Objects.requireNonNull(qe9Var);
    }

    private ir5.AbstractC7571a getNewOffset(ir5.AbstractC7571a abstractC7571a, kd9 kd9Var) {
        Iterator<Map.Entry<ci4, ph4>> it = kd9Var.getDocuments().iterator();
        ir5.AbstractC7571a abstractC7571a2 = abstractC7571a;
        while (it.hasNext()) {
            ir5.AbstractC7571a abstractC7571aFromDocument = ir5.AbstractC7571a.fromDocument(it.next().getValue());
            if (abstractC7571aFromDocument.compareTo(abstractC7571a2) > 0) {
                abstractC7571a2 = abstractC7571aFromDocument;
            }
        }
        return ir5.AbstractC7571a.create(abstractC7571a2.getReadTime(), abstractC7571a2.getDocumentKey(), Math.max(kd9Var.getBatchId(), abstractC7571a.getLargestBatchId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$backfill$0() {
        return Integer.valueOf(writeIndexEntries());
    }

    private int writeEntriesForCollectionGroup(String str, int i) {
        f08 f08Var = this.f11c.get();
        ld9 ld9Var = this.f12d.get();
        ir5.AbstractC7571a minOffset = f08Var.getMinOffset(str);
        kd9 kd9VarM16102h = ld9Var.m16102h(str, minOffset, i);
        f08Var.updateIndexEntries(kd9VarM16102h.getDocuments());
        ir5.AbstractC7571a newOffset = getNewOffset(minOffset, kd9VarM16102h);
        fj9.debug(f5f, "Updating offset: %s", newOffset);
        f08Var.updateCollectionGroup(str, newOffset);
        return kd9VarM16102h.getDocuments().size();
    }

    private int writeIndexEntries() {
        f08 f08Var = this.f11c.get();
        HashSet hashSet = new HashSet();
        int iWriteEntriesForCollectionGroup = this.f13e;
        while (iWriteEntriesForCollectionGroup > 0) {
            String nextCollectionGroupToUpdate = f08Var.getNextCollectionGroupToUpdate();
            if (nextCollectionGroupToUpdate == null || hashSet.contains(nextCollectionGroupToUpdate)) {
                break;
            }
            fj9.debug(f5f, "Processing collection: %s", nextCollectionGroupToUpdate);
            iWriteEntriesForCollectionGroup -= writeEntriesForCollectionGroup(nextCollectionGroupToUpdate, iWriteEntriesForCollectionGroup);
            hashSet.add(nextCollectionGroupToUpdate);
        }
        return this.f13e - iWriteEntriesForCollectionGroup;
    }

    public int backfill() {
        return ((Integer) this.f10b.mo14249i("Backfill Indexes", new mfg() { // from class: yz7
            @Override // p000.mfg
            public final Object get() {
                return this.f103502a.lambda$backfill$0();
            }
        })).intValue();
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public void m11d(int i) {
        this.f13e = i;
    }

    public C0002a getScheduler() {
        return this.f9a;
    }

    public a08(jqc jqcVar, ga0 ga0Var, lfg<f08> lfgVar, lfg<ld9> lfgVar2) {
        this.f13e = 50;
        this.f10b = jqcVar;
        this.f9a = new C0002a(ga0Var);
        this.f11c = lfgVar;
        this.f12d = lfgVar2;
    }
}
