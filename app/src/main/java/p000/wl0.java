package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public final class wl0 extends z3g {

    /* JADX INFO: renamed from: a */
    public final z3g.AbstractC15979a f94581a;

    /* JADX INFO: renamed from: b */
    public final z3g.AbstractC15981c f94582b;

    /* JADX INFO: renamed from: c */
    public final z3g.AbstractC15980b f94583c;

    public wl0(z3g.AbstractC15979a abstractC15979a, z3g.AbstractC15981c abstractC15981c, z3g.AbstractC15980b abstractC15980b) {
        if (abstractC15979a == null) {
            throw new NullPointerException("Null appData");
        }
        this.f94581a = abstractC15979a;
        if (abstractC15981c == null) {
            throw new NullPointerException("Null osData");
        }
        this.f94582b = abstractC15981c;
        if (abstractC15980b == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f94583c = abstractC15980b;
    }

    @Override // p000.z3g
    public z3g.AbstractC15979a appData() {
        return this.f94581a;
    }

    @Override // p000.z3g
    public z3g.AbstractC15980b deviceData() {
        return this.f94583c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return this.f94581a.equals(z3gVar.appData()) && this.f94582b.equals(z3gVar.osData()) && this.f94583c.equals(z3gVar.deviceData());
    }

    public int hashCode() {
        return ((((this.f94581a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f94582b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f94583c.hashCode();
    }

    @Override // p000.z3g
    public z3g.AbstractC15981c osData() {
        return this.f94582b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f94581a + ", osData=" + this.f94582b + ", deviceData=" + this.f94583c + "}";
    }
}
