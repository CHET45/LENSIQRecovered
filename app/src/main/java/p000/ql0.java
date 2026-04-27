package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ql0 extends qae {

    /* JADX INFO: renamed from: a */
    public final Set<nae> f74783a;

    public ql0(Set<nae> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f74783a = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qae) {
            return this.f74783a.equals(((qae) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // p000.qae
    @efb
    public Set<nae> getRolloutAssignments() {
        return this.f74783a;
    }

    public int hashCode() {
        return this.f74783a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f74783a + "}";
    }
}
