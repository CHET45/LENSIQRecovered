package p000;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tqa implements s7b {

    /* JADX INFO: renamed from: a */
    public final List<n7b> f85583a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public qy7<ui4> f85584b = new qy7<>(Collections.emptyList(), ui4.f88039c);

    /* JADX INFO: renamed from: c */
    public int f85585c = 1;

    /* JADX INFO: renamed from: d */
    public vj1 f85586d = nsi.f65548w;

    /* JADX INFO: renamed from: e */
    public final vqa f85587e;

    /* JADX INFO: renamed from: f */
    public final qqa f85588f;

    public tqa(vqa vqaVar, syh syhVar) {
        this.f85587e = vqaVar;
        this.f85588f = vqaVar.mo14244d(syhVar);
    }

    private int indexOfBatchId(int i) {
        if (this.f85583a.isEmpty()) {
            return 0;
        }
        return i - this.f85583a.get(0).getBatchId();
    }

    private int indexOfExistingBatchId(int i, String str) {
        int iIndexOfBatchId = indexOfBatchId(i);
        r80.hardAssert(iIndexOfBatchId >= 0 && iIndexOfBatchId < this.f85583a.size(), "Batches must exist to be %s", str);
        return iIndexOfBatchId;
    }

    private List<n7b> lookupMutationBatches(qy7<Integer> qy7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = qy7Var.iterator();
        while (it.hasNext()) {
            n7b n7bVarLookupMutationBatch = lookupMutationBatch(it.next().intValue());
            if (n7bVarLookupMutationBatch != null) {
                arrayList.add(n7bVarLookupMutationBatch);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22743a(ci4 ci4Var) {
        Iterator<ui4> itIteratorFrom = this.f85584b.iteratorFrom(new ui4(ci4Var, 0));
        if (itIteratorFrom.hasNext()) {
            return itIteratorFrom.next().m23368d().equals(ci4Var);
        }
        return false;
    }

    @Override // p000.s7b
    public void acknowledgeBatch(n7b n7bVar, vj1 vj1Var) {
        int batchId = n7bVar.getBatchId();
        int iIndexOfExistingBatchId = indexOfExistingBatchId(batchId, "acknowledged");
        r80.hardAssert(iIndexOfExistingBatchId == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        n7b n7bVar2 = this.f85583a.get(iIndexOfExistingBatchId);
        r80.hardAssert(batchId == n7bVar2.getBatchId(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(batchId), Integer.valueOf(n7bVar2.getBatchId()));
        this.f85586d = (vj1) x7d.checkNotNull(vj1Var);
    }

    @Override // p000.s7b
    public n7b addMutationBatch(Timestamp timestamp, List<m7b> list, List<m7b> list2) {
        r80.hardAssert(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i = this.f85585c;
        this.f85585c = i + 1;
        int size = this.f85583a.size();
        if (size > 0) {
            r80.hardAssert(this.f85583a.get(size - 1).getBatchId() < i, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        n7b n7bVar = new n7b(i, timestamp, list, list2);
        this.f85583a.add(n7bVar);
        for (m7b m7bVar : list2) {
            this.f85584b = this.f85584b.insert(new ui4(m7bVar.getKey(), i));
            this.f85588f.addToCollectionParentIndex(m7bVar.getKey().getCollectionPath());
        }
        return n7bVar;
    }

    /* JADX INFO: renamed from: b */
    public long m22744b(ud9 ud9Var) {
        Iterator<n7b> it = this.f85583a.iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) ud9Var.m23254e(it.next()).getSerializedSize();
        }
        return serializedSize;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatches() {
        return Collections.unmodifiableList(this.f85583a);
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingDocumentKey(ci4 ci4Var) {
        ui4 ui4Var = new ui4(ci4Var, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<ui4> itIteratorFrom = this.f85584b.iteratorFrom(ui4Var);
        while (itIteratorFrom.hasNext()) {
            ui4 next = itIteratorFrom.next();
            if (!ci4Var.equals(next.m23368d())) {
                break;
            }
            n7b n7bVarLookupMutationBatch = lookupMutationBatch(next.m23367c());
            r80.hardAssert(n7bVarLookupMutationBatch != null, "Batches in the index must exist in the main table", new Object[0]);
            arrayList.add(n7bVarLookupMutationBatch);
        }
        return arrayList;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingDocumentKeys(Iterable<ci4> iterable) {
        qy7<Integer> qy7Var = new qy7<>(Collections.emptyList(), r0i.comparator());
        for (ci4 ci4Var : iterable) {
            Iterator<ui4> itIteratorFrom = this.f85584b.iteratorFrom(new ui4(ci4Var, 0));
            while (itIteratorFrom.hasNext()) {
                ui4 next = itIteratorFrom.next();
                if (!ci4Var.equals(next.m23368d())) {
                    break;
                }
                qy7Var = qy7Var.insert(Integer.valueOf(next.m23367c()));
            }
        }
        return lookupMutationBatches(qy7Var);
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingQuery(nld nldVar) {
        r80.hardAssert(!nldVar.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        s6e path = nldVar.getPath();
        int length = path.length() + 1;
        ui4 ui4Var = new ui4(ci4.fromPath(!ci4.isDocumentKey(path) ? path.append("") : path), 0);
        qy7<Integer> qy7Var = new qy7<>(Collections.emptyList(), r0i.comparator());
        Iterator<ui4> itIteratorFrom = this.f85584b.iteratorFrom(ui4Var);
        while (itIteratorFrom.hasNext()) {
            ui4 next = itIteratorFrom.next();
            s6e path2 = next.m23368d().getPath();
            if (!path.isPrefixOf(path2)) {
                break;
            }
            if (path2.length() == length) {
                qy7Var = qy7Var.insert(Integer.valueOf(next.m23367c()));
            }
        }
        return lookupMutationBatches(qy7Var);
    }

    @Override // p000.s7b
    public int getHighestUnacknowledgedBatchId() {
        if (this.f85583a.isEmpty()) {
            return -1;
        }
        return this.f85585c - 1;
    }

    @Override // p000.s7b
    public vj1 getLastStreamToken() {
        return this.f85586d;
    }

    @Override // p000.s7b
    @hib
    public n7b getNextMutationBatchAfterBatchId(int i) {
        int iIndexOfBatchId = indexOfBatchId(i + 1);
        if (iIndexOfBatchId < 0) {
            iIndexOfBatchId = 0;
        }
        if (this.f85583a.size() > iIndexOfBatchId) {
            return this.f85583a.get(iIndexOfBatchId);
        }
        return null;
    }

    @Override // p000.s7b
    public boolean isEmpty() {
        return this.f85583a.isEmpty();
    }

    @Override // p000.s7b
    @hib
    public n7b lookupMutationBatch(int i) {
        int iIndexOfBatchId = indexOfBatchId(i);
        if (iIndexOfBatchId < 0 || iIndexOfBatchId >= this.f85583a.size()) {
            return null;
        }
        n7b n7bVar = this.f85583a.get(iIndexOfBatchId);
        r80.hardAssert(n7bVar.getBatchId() == i, "If found batch must match", new Object[0]);
        return n7bVar;
    }

    @Override // p000.s7b
    public void performConsistencyCheck() {
        if (this.f85583a.isEmpty()) {
            r80.hardAssert(this.f85584b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // p000.s7b
    public void removeMutationBatch(n7b n7bVar) {
        r80.hardAssert(indexOfExistingBatchId(n7bVar.getBatchId(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f85583a.remove(0);
        qy7<ui4> qy7VarRemove = this.f85584b;
        Iterator<m7b> it = n7bVar.getMutations().iterator();
        while (it.hasNext()) {
            ci4 key = it.next().getKey();
            this.f85587e.getReferenceDelegate().removeMutationReference(key);
            qy7VarRemove = qy7VarRemove.remove(new ui4(key, n7bVar.getBatchId()));
        }
        this.f85584b = qy7VarRemove;
    }

    @Override // p000.s7b
    public void setLastStreamToken(vj1 vj1Var) {
        this.f85586d = (vj1) x7d.checkNotNull(vj1Var);
    }

    @Override // p000.s7b
    public void start() {
        if (isEmpty()) {
            this.f85585c = 1;
        }
    }
}
