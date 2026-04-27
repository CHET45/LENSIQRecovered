package p000;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p000.wp9;

/* JADX INFO: loaded from: classes5.dex */
public class eie implements nvd, sp9 {

    /* JADX INFO: renamed from: f */
    public static final int f33094f = 100;

    /* JADX INFO: renamed from: a */
    public final yie f33095a;

    /* JADX INFO: renamed from: b */
    public ha9 f33096b;

    /* JADX INFO: renamed from: c */
    public long f33097c = -1;

    /* JADX INFO: renamed from: d */
    public final wp9 f33098d;

    /* JADX INFO: renamed from: e */
    public rvd f33099e;

    public eie(yie yieVar, wp9.C14736b c14736b) {
        this.f33095a = yieVar;
        this.f33098d = new wp9(this, c14736b);
    }

    private boolean isPinned(ci4 ci4Var) {
        if (this.f33099e.containsKey(ci4Var)) {
            return true;
        }
        return mutationQueuesContainKey(ci4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$forEachOrphanedDocumentSequenceNumber$1(su2 su2Var, Cursor cursor) {
        su2Var.accept(Long.valueOf(cursor.getLong(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getSequenceNumberCount$0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeOrphanedDocuments$2(int[] iArr, List list, s6e[] s6eVarArr, Cursor cursor) {
        s6e s6eVarM13677b = j15.m13677b(cursor.getString(0));
        ci4 ci4VarFromPath = ci4.fromPath(s6eVarM13677b);
        if (!isPinned(ci4VarFromPath)) {
            iArr[0] = iArr[0] + 1;
            list.add(ci4VarFromPath);
            removeSentinel(ci4VarFromPath);
        }
        s6eVarArr[0] = s6eVarM13677b;
    }

    private boolean mutationQueuesContainKey(ci4 ci4Var) {
        return !this.f33095a.m26113t("SELECT 1 FROM document_mutations WHERE path = ?").m26119b(j15.m13678c(ci4Var.getPath())).m26123f();
    }

    private void removeSentinel(ci4 ci4Var) {
        this.f33095a.m26109p("DELETE FROM target_documents WHERE path = ? AND target_id = 0", j15.m13678c(ci4Var.getPath()));
    }

    private void writeSentinel(ci4 ci4Var) {
        this.f33095a.m26109p("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", j15.m13678c(ci4Var.getPath()), Long.valueOf(getCurrentSequenceNumber()));
    }

    @Override // p000.nvd
    public void addReference(ci4 ci4Var) {
        writeSentinel(ci4Var);
    }

    /* JADX INFO: renamed from: d */
    public void m9996d(long j) {
        this.f33096b = new ha9(j);
    }

    @Override // p000.sp9
    public void forEachOrphanedDocumentSequenceNumber(final su2<Long> su2Var) {
        this.f33095a.m26113t("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").m26122e(new su2() { // from class: bie
            @Override // p000.su2
            public final void accept(Object obj) {
                eie.lambda$forEachOrphanedDocumentSequenceNumber$1(su2Var, (Cursor) obj);
            }
        });
    }

    @Override // p000.sp9
    public void forEachTarget(su2<vmg> su2Var) {
        this.f33095a.mo14248h().forEachTarget(su2Var);
    }

    @Override // p000.sp9
    public long getByteSize() {
        return this.f33095a.m26110q();
    }

    @Override // p000.nvd
    public long getCurrentSequenceNumber() {
        r80.hardAssert(this.f33097c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f33097c;
    }

    @Override // p000.sp9
    public wp9 getGarbageCollector() {
        return this.f33098d;
    }

    @Override // p000.sp9
    public long getSequenceNumberCount() {
        return this.f33095a.mo14248h().getTargetCount() + ((Long) this.f33095a.m26113t("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").m26121d(new pz6() { // from class: die
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return eie.lambda$getSequenceNumberCount$0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p000.nvd
    public void onTransactionCommitted() {
        r80.hardAssert(this.f33097c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f33097c = -1L;
    }

    @Override // p000.nvd
    public void onTransactionStarted() {
        r80.hardAssert(this.f33097c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f33097c = this.f33096b.next();
    }

    @Override // p000.nvd
    public void removeMutationReference(ci4 ci4Var) {
        writeSentinel(ci4Var);
    }

    @Override // p000.sp9
    public int removeOrphanedDocuments(long j) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final s6e[] s6eVarArr = {s6e.f80844b};
        while (this.f33095a.m26113t("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?").m26119b(Long.valueOf(j), j15.m13678c(s6eVarArr[0]), 100).m26122e(new su2() { // from class: cie
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f16643a.lambda$removeOrphanedDocuments$2(iArr, arrayList, s6eVarArr, (Cursor) obj);
            }
        }) == 100) {
        }
        this.f33095a.mo14247g().removeAll(arrayList);
        return iArr[0];
    }

    @Override // p000.nvd
    public void removeReference(ci4 ci4Var) {
        writeSentinel(ci4Var);
    }

    @Override // p000.nvd
    public void removeTarget(vmg vmgVar) {
        this.f33095a.mo14248h().updateTargetData(vmgVar.withSequenceNumber(getCurrentSequenceNumber()));
    }

    @Override // p000.sp9
    public int removeTargets(long j, SparseArray<?> sparseArray) {
        return this.f33095a.mo14248h().m10098f(j, sparseArray);
    }

    @Override // p000.nvd
    public void setInMemoryPins(rvd rvdVar) {
        this.f33099e = rvdVar;
    }

    @Override // p000.nvd
    public void updateLimboDocument(ci4 ci4Var) {
        writeSentinel(ci4Var);
    }
}
