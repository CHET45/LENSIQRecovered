package p000;

import com.google.firebase.Timestamp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n7b {

    /* JADX INFO: renamed from: e */
    public static final int f63451e = -1;

    /* JADX INFO: renamed from: a */
    public final int f63452a;

    /* JADX INFO: renamed from: b */
    public final Timestamp f63453b;

    /* JADX INFO: renamed from: c */
    public final List<m7b> f63454c;

    /* JADX INFO: renamed from: d */
    public final List<m7b> f63455d;

    public n7b(int i, Timestamp timestamp, List<m7b> list, List<m7b> list2) {
        r80.hardAssert(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f63452a = i;
        this.f63453b = timestamp;
        this.f63454c = list;
        this.f63455d = list2;
    }

    public Map<ci4, m7b> applyToLocalDocumentSet(Map<ci4, q9c> map, Set<ci4> set) {
        HashMap map2 = new HashMap();
        for (ci4 ci4Var : getKeys()) {
            t4b t4bVar = (t4b) map.get(ci4Var).getDocument();
            or5 or5VarApplyToLocalView = applyToLocalView(t4bVar, map.get(ci4Var).getMutatedFields());
            if (set.contains(ci4Var)) {
                or5VarApplyToLocalView = null;
            }
            m7b m7bVarCalculateOverlayMutation = m7b.calculateOverlayMutation(t4bVar, or5VarApplyToLocalView);
            if (m7bVarCalculateOverlayMutation != null) {
                map2.put(ci4Var, m7bVarCalculateOverlayMutation);
            }
            if (!t4bVar.isValidDocument()) {
                t4bVar.convertToNoDocument(euf.f34067b);
            }
        }
        return map2;
    }

    public or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var) {
        for (int i = 0; i < this.f63454c.size(); i++) {
            m7b m7bVar = this.f63454c.get(i);
            if (m7bVar.getKey().equals(t4bVar.getKey())) {
                or5Var = m7bVar.applyToLocalView(t4bVar, or5Var, this.f63453b);
            }
        }
        for (int i2 = 0; i2 < this.f63455d.size(); i2++) {
            m7b m7bVar2 = this.f63455d.get(i2);
            if (m7bVar2.getKey().equals(t4bVar.getKey())) {
                or5Var = m7bVar2.applyToLocalView(t4bVar, or5Var, this.f63453b);
            }
        }
        return or5Var;
    }

    public void applyToRemoteDocument(t4b t4bVar, o7b o7bVar) {
        int size = this.f63455d.size();
        List<u7b> mutationResults = o7bVar.getMutationResults();
        r80.hardAssert(mutationResults.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(mutationResults.size()));
        for (int i = 0; i < size; i++) {
            m7b m7bVar = this.f63455d.get(i);
            if (m7bVar.getKey().equals(t4bVar.getKey())) {
                m7bVar.applyToRemoteDocument(t4bVar, mutationResults.get(i));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7b.class != obj.getClass()) {
            return false;
        }
        n7b n7bVar = (n7b) obj;
        return this.f63452a == n7bVar.f63452a && this.f63453b.equals(n7bVar.f63453b) && this.f63454c.equals(n7bVar.f63454c) && this.f63455d.equals(n7bVar.f63455d);
    }

    public List<m7b> getBaseMutations() {
        return this.f63454c;
    }

    public int getBatchId() {
        return this.f63452a;
    }

    public Set<ci4> getKeys() {
        HashSet hashSet = new HashSet();
        Iterator<m7b> it = this.f63455d.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return hashSet;
    }

    public Timestamp getLocalWriteTime() {
        return this.f63453b;
    }

    public List<m7b> getMutations() {
        return this.f63455d;
    }

    public int hashCode() {
        return (((((this.f63452a * 31) + this.f63453b.hashCode()) * 31) + this.f63454c.hashCode()) * 31) + this.f63455d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f63452a + ", localWriteTime=" + this.f63453b + ", baseMutations=" + this.f63454c + ", mutations=" + this.f63455d + ')';
    }
}
