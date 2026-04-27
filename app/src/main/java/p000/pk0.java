package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class pk0<T> extends p55<T> {

    /* JADX INFO: renamed from: a */
    public final Integer f71149a;

    /* JADX INFO: renamed from: b */
    public final T f71150b;

    /* JADX INFO: renamed from: c */
    public final acd f71151c;

    /* JADX INFO: renamed from: d */
    public final wdd f71152d;

    /* JADX INFO: renamed from: e */
    public final u55 f71153e;

    public pk0(@hib Integer num, T t, acd acdVar, @hib wdd wddVar, @hib u55 u55Var) {
        this.f71149a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.f71150b = t;
        if (acdVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f71151c = acdVar;
        this.f71152d = wddVar;
        this.f71153e = u55Var;
    }

    public boolean equals(Object obj) {
        wdd wddVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p55)) {
            return false;
        }
        p55 p55Var = (p55) obj;
        Integer num = this.f71149a;
        if (num != null ? num.equals(p55Var.getCode()) : p55Var.getCode() == null) {
            if (this.f71150b.equals(p55Var.getPayload()) && this.f71151c.equals(p55Var.getPriority()) && ((wddVar = this.f71152d) != null ? wddVar.equals(p55Var.getProductData()) : p55Var.getProductData() == null)) {
                u55 u55Var = this.f71153e;
                if (u55Var == null) {
                    if (p55Var.getEventContext() == null) {
                        return true;
                    }
                } else if (u55Var.equals(p55Var.getEventContext())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.p55
    @hib
    public Integer getCode() {
        return this.f71149a;
    }

    @Override // p000.p55
    @hib
    public u55 getEventContext() {
        return this.f71153e;
    }

    @Override // p000.p55
    public T getPayload() {
        return this.f71150b;
    }

    @Override // p000.p55
    public acd getPriority() {
        return this.f71151c;
    }

    @Override // p000.p55
    @hib
    public wdd getProductData() {
        return this.f71152d;
    }

    public int hashCode() {
        Integer num = this.f71149a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71150b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71151c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        wdd wddVar = this.f71152d;
        int iHashCode2 = (iHashCode ^ (wddVar == null ? 0 : wddVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        u55 u55Var = this.f71153e;
        return iHashCode2 ^ (u55Var != null ? u55Var.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f71149a + ", payload=" + this.f71150b + ", priority=" + this.f71151c + ", productData=" + this.f71152d + ", eventContext=" + this.f71153e + "}";
    }
}
