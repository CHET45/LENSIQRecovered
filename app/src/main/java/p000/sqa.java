package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.wp9;

/* JADX INFO: loaded from: classes5.dex */
public class sqa implements nvd, sp9 {

    /* JADX INFO: renamed from: a */
    public final vqa f82598a;

    /* JADX INFO: renamed from: b */
    public final ud9 f82599b;

    /* JADX INFO: renamed from: d */
    public rvd f82601d;

    /* JADX INFO: renamed from: e */
    public final wp9 f82602e;

    /* JADX INFO: renamed from: f */
    public final ha9 f82603f;

    /* JADX INFO: renamed from: c */
    public final Map<ci4, Long> f82600c = new HashMap();

    /* JADX INFO: renamed from: g */
    public long f82604g = -1;

    public sqa(vqa vqaVar, wp9.C14736b c14736b, ud9 ud9Var) {
        this.f82598a = vqaVar;
        this.f82599b = ud9Var;
        this.f82603f = new ha9(vqaVar.mo14248h().getHighestListenSequenceNumber());
        this.f82602e = new wp9(this, c14736b);
    }

    private boolean isPinned(ci4 ci4Var, long j) {
        if (mutationQueuesContainsKey(ci4Var) || this.f82601d.containsKey(ci4Var) || this.f82598a.mo14248h().containsKey(ci4Var)) {
            return true;
        }
        Long l = this.f82600c.get(ci4Var);
        return l != null && l.longValue() > j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSequenceNumberCount$0(long[] jArr, Long l) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean mutationQueuesContainsKey(ci4 ci4Var) {
        Iterator<tqa> it = this.f82598a.m24120l().iterator();
        while (it.hasNext()) {
            if (it.next().m22743a(ci4Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.nvd
    public void addReference(ci4 ci4Var) {
        this.f82600c.put(ci4Var, Long.valueOf(getCurrentSequenceNumber()));
    }

    @Override // p000.sp9
    public void forEachOrphanedDocumentSequenceNumber(su2<Long> su2Var) {
        for (Map.Entry<ci4, Long> entry : this.f82600c.entrySet()) {
            if (!isPinned(entry.getKey(), entry.getValue().longValue())) {
                su2Var.accept(entry.getValue());
            }
        }
    }

    @Override // p000.sp9
    public void forEachTarget(su2<vmg> su2Var) {
        this.f82598a.mo14248h().forEachTarget(su2Var);
    }

    @Override // p000.sp9
    public long getByteSize() {
        long jM26298a = this.f82598a.mo14248h().m26298a(this.f82599b) + this.f82598a.mo14247g().m24750b(this.f82599b);
        Iterator<tqa> it = this.f82598a.m24120l().iterator();
        while (it.hasNext()) {
            jM26298a += it.next().m22744b(this.f82599b);
        }
        return jM26298a;
    }

    @Override // p000.nvd
    public long getCurrentSequenceNumber() {
        r80.hardAssert(this.f82604g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f82604g;
    }

    @Override // p000.sp9
    public wp9 getGarbageCollector() {
        return this.f82602e;
    }

    @Override // p000.sp9
    public long getSequenceNumberCount() {
        long targetCount = this.f82598a.mo14248h().getTargetCount();
        final long[] jArr = new long[1];
        forEachOrphanedDocumentSequenceNumber(new su2() { // from class: rqa
            @Override // p000.su2
            public final void accept(Object obj) {
                sqa.lambda$getSequenceNumberCount$0(jArr, (Long) obj);
            }
        });
        return targetCount + jArr[0];
    }

    @Override // p000.nvd
    public void onTransactionCommitted() {
        r80.hardAssert(this.f82604g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f82604g = -1L;
    }

    @Override // p000.nvd
    public void onTransactionStarted() {
        r80.hardAssert(this.f82604g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f82604g = this.f82603f.next();
    }

    @Override // p000.nvd
    public void removeMutationReference(ci4 ci4Var) {
        this.f82600c.put(ci4Var, Long.valueOf(getCurrentSequenceNumber()));
    }

    @Override // p000.sp9
    public int removeOrphanedDocuments(long j) {
        wqa wqaVarMo14247g = this.f82598a.mo14247g();
        ArrayList arrayList = new ArrayList();
        Iterator<ph4> it = wqaVarMo14247g.m24751c().iterator();
        while (it.hasNext()) {
            ci4 key = it.next().getKey();
            if (!isPinned(key, j)) {
                arrayList.add(key);
                this.f82600c.remove(key);
            }
        }
        wqaVarMo14247g.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // p000.nvd
    public void removeReference(ci4 ci4Var) {
        this.f82600c.put(ci4Var, Long.valueOf(getCurrentSequenceNumber()));
    }

    @Override // p000.nvd
    public void removeTarget(vmg vmgVar) {
        this.f82598a.mo14248h().updateTargetData(vmgVar.withSequenceNumber(getCurrentSequenceNumber()));
    }

    @Override // p000.sp9
    public int removeTargets(long j, SparseArray<?> sparseArray) {
        return this.f82598a.mo14248h().m26299b(j, sparseArray);
    }

    @Override // p000.nvd
    public void setInMemoryPins(rvd rvdVar) {
        this.f82601d = rvdVar;
    }

    @Override // p000.nvd
    public void updateLimboDocument(ci4 ci4Var) {
        this.f82600c.put(ci4Var, Long.valueOf(getCurrentSequenceNumber()));
    }
}
