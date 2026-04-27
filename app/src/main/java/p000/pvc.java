package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class pvc extends zb9.AbstractC16071h {

    /* JADX INFO: renamed from: a */
    public final rn1 f72226a;

    /* JADX INFO: renamed from: b */
    public final fta f72227b;

    /* JADX INFO: renamed from: c */
    public final rua<?, ?> f72228c;

    public pvc(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var) {
        this.f72228c = (rua) v7d.checkNotNull(ruaVar, FirebaseAnalytics.C3552d.f23230v);
        this.f72227b = (fta) v7d.checkNotNull(ftaVar, "headers");
        this.f72226a = (rn1) v7d.checkNotNull(rn1Var, "callOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pvc.class != obj.getClass()) {
            return false;
        }
        pvc pvcVar = (pvc) obj;
        return okb.equal(this.f72226a, pvcVar.f72226a) && okb.equal(this.f72227b, pvcVar.f72227b) && okb.equal(this.f72228c, pvcVar.f72228c);
    }

    @Override // p000.zb9.AbstractC16071h
    public rn1 getCallOptions() {
        return this.f72226a;
    }

    @Override // p000.zb9.AbstractC16071h
    public fta getHeaders() {
        return this.f72227b;
    }

    @Override // p000.zb9.AbstractC16071h
    public rua<?, ?> getMethodDescriptor() {
        return this.f72228c;
    }

    public int hashCode() {
        return okb.hashCode(this.f72226a, this.f72227b, this.f72228c);
    }

    public final String toString() {
        return "[method=" + this.f72228c + " headers=" + this.f72227b + " callOptions=" + this.f72226a + "]";
    }
}
