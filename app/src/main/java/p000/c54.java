package p000;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public final class c54 extends m7b {
    public c54(ci4 ci4Var, n7d n7dVar) {
        super(ci4Var, n7dVar);
    }

    @Override // p000.m7b
    @hib
    public or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var, Timestamp timestamp) {
        m17107f(t4bVar);
        if (!getPrecondition().isValidFor(t4bVar)) {
            return or5Var;
        }
        t4bVar.convertToNoDocument(t4bVar.getVersion()).setHasLocalMutations();
        return null;
    }

    @Override // p000.m7b
    public void applyToRemoteDocument(t4b t4bVar, u7b u7bVar) {
        m17107f(t4bVar);
        r80.hardAssert(u7bVar.getTransformResults().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        t4bVar.convertToNoDocument(u7bVar.getVersion()).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c54.class != obj.getClass()) {
            return false;
        }
        return m17102a((c54) obj);
    }

    @Override // p000.m7b
    @hib
    public or5 getFieldMask() {
        return null;
    }

    public int hashCode() {
        return m17103b();
    }

    public String toString() {
        return "DeleteMutation{" + m17104c() + "}";
    }
}
