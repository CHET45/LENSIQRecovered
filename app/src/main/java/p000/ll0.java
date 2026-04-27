package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ll0 extends gqc {

    /* JADX INFO: renamed from: a */
    public final long f58031a;

    /* JADX INFO: renamed from: b */
    public final chh f58032b;

    /* JADX INFO: renamed from: c */
    public final a65 f58033c;

    public ll0(long j, chh chhVar, a65 a65Var) {
        this.f58031a = j;
        if (chhVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f58032b = chhVar;
        if (a65Var == null) {
            throw new NullPointerException("Null event");
        }
        this.f58033c = a65Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gqc)) {
            return false;
        }
        gqc gqcVar = (gqc) obj;
        return this.f58031a == gqcVar.getId() && this.f58032b.equals(gqcVar.getTransportContext()) && this.f58033c.equals(gqcVar.getEvent());
    }

    @Override // p000.gqc
    public a65 getEvent() {
        return this.f58033c;
    }

    @Override // p000.gqc
    public long getId() {
        return this.f58031a;
    }

    @Override // p000.gqc
    public chh getTransportContext() {
        return this.f58032b;
    }

    public int hashCode() {
        long j = this.f58031a;
        return ((((((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f58032b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f58033c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f58031a + ", transportContext=" + this.f58032b + ", event=" + this.f58033c + "}";
    }
}
