package p000;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class yqa implements rmg {

    /* JADX INFO: renamed from: c */
    public int f102655c;

    /* JADX INFO: renamed from: f */
    public final vqa f102658f;

    /* JADX INFO: renamed from: a */
    public final Map<kmg, vmg> f102653a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final rvd f102654b = new rvd();

    /* JADX INFO: renamed from: d */
    public euf f102656d = euf.f34067b;

    /* JADX INFO: renamed from: e */
    public long f102657e = 0;

    public yqa(vqa vqaVar) {
        this.f102658f = vqaVar;
    }

    /* JADX INFO: renamed from: a */
    public long m26298a(ud9 ud9Var) {
        Iterator<Map.Entry<kmg, vmg>> it = this.f102653a.entrySet().iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) ud9Var.m23255f(it.next().getValue()).getSerializedSize();
        }
        return serializedSize;
    }

    @Override // p000.rmg
    public void addMatchingKeys(qy7<ci4> qy7Var, int i) {
        this.f102654b.addReferences(qy7Var, i);
        nvd referenceDelegate = this.f102658f.getReferenceDelegate();
        Iterator<ci4> it = qy7Var.iterator();
        while (it.hasNext()) {
            referenceDelegate.addReference(it.next());
        }
    }

    @Override // p000.rmg
    public void addTargetData(vmg vmgVar) {
        this.f102653a.put(vmgVar.getTarget(), vmgVar);
        int targetId = vmgVar.getTargetId();
        if (targetId > this.f102655c) {
            this.f102655c = targetId;
        }
        if (vmgVar.getSequenceNumber() > this.f102657e) {
            this.f102657e = vmgVar.getSequenceNumber();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m26299b(long j, SparseArray<?> sparseArray) {
        Iterator<Map.Entry<kmg, vmg>> it = this.f102653a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<kmg, vmg> next = it.next();
            int targetId = next.getValue().getTargetId();
            if (next.getValue().getSequenceNumber() <= j && sparseArray.get(targetId) == null) {
                it.remove();
                removeMatchingKeysForTargetId(targetId);
                i++;
            }
        }
        return i;
    }

    @Override // p000.rmg
    public boolean containsKey(ci4 ci4Var) {
        return this.f102654b.containsKey(ci4Var);
    }

    @Override // p000.rmg
    public void forEachTarget(su2<vmg> su2Var) {
        Iterator<vmg> it = this.f102653a.values().iterator();
        while (it.hasNext()) {
            su2Var.accept(it.next());
        }
    }

    @Override // p000.rmg
    public long getHighestListenSequenceNumber() {
        return this.f102657e;
    }

    @Override // p000.rmg
    public int getHighestTargetId() {
        return this.f102655c;
    }

    @Override // p000.rmg
    public euf getLastRemoteSnapshotVersion() {
        return this.f102656d;
    }

    @Override // p000.rmg
    public qy7<ci4> getMatchingKeysForTargetId(int i) {
        return this.f102654b.referencesForId(i);
    }

    @Override // p000.rmg
    public long getTargetCount() {
        return this.f102653a.size();
    }

    @Override // p000.rmg
    @hib
    public vmg getTargetData(kmg kmgVar) {
        return this.f102653a.get(kmgVar);
    }

    @Override // p000.rmg
    public void removeMatchingKeys(qy7<ci4> qy7Var, int i) {
        this.f102654b.removeReferences(qy7Var, i);
        nvd referenceDelegate = this.f102658f.getReferenceDelegate();
        Iterator<ci4> it = qy7Var.iterator();
        while (it.hasNext()) {
            referenceDelegate.removeReference(it.next());
        }
    }

    @Override // p000.rmg
    public void removeMatchingKeysForTargetId(int i) {
        this.f102654b.removeReferencesForId(i);
    }

    @Override // p000.rmg
    public void removeTargetData(vmg vmgVar) {
        this.f102653a.remove(vmgVar.getTarget());
        this.f102654b.removeReferencesForId(vmgVar.getTargetId());
    }

    @Override // p000.rmg
    public void setLastRemoteSnapshotVersion(euf eufVar) {
        this.f102656d = eufVar;
    }

    @Override // p000.rmg
    public void updateTargetData(vmg vmgVar) {
        addTargetData(vmgVar);
    }
}
