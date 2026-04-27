package p000;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public final class u4i extends m7b {
    public u4i(ci4 ci4Var, n7d n7dVar) {
        super(ci4Var, n7dVar);
    }

    @Override // p000.m7b
    public or5 applyToLocalView(t4b t4bVar, @hib or5 or5Var, Timestamp timestamp) {
        throw r80.fail("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // p000.m7b
    public void applyToRemoteDocument(t4b t4bVar, u7b u7bVar) {
        throw r80.fail("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u4i.class != obj.getClass()) {
            return false;
        }
        return m17102a((u4i) obj);
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
        return "VerifyMutation{" + m17104c() + "}";
    }
}
