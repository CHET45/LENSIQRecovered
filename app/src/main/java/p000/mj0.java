package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.wi2;

/* JADX INFO: loaded from: classes4.dex */
public final class mj0 extends wi2 {

    /* JADX INFO: renamed from: a */
    public final mj5 f61121a;

    /* JADX INFO: renamed from: b */
    public final wi2.EnumC14614b f61122b;

    /* JADX INFO: renamed from: mj0$b */
    public static final class C9365b extends wi2.AbstractC14613a {

        /* JADX INFO: renamed from: a */
        public mj5 f61123a;

        /* JADX INFO: renamed from: b */
        public wi2.EnumC14614b f61124b;

        @Override // p000.wi2.AbstractC14613a
        public wi2 build() {
            return new mj0(this.f61123a, this.f61124b);
        }

        @Override // p000.wi2.AbstractC14613a
        public wi2.AbstractC14613a setPrivacyContext(@hib mj5 mj5Var) {
            this.f61123a = mj5Var;
            return this;
        }

        @Override // p000.wi2.AbstractC14613a
        public wi2.AbstractC14613a setProductIdOrigin(@hib wi2.EnumC14614b enumC14614b) {
            this.f61124b = enumC14614b;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wi2)) {
            return false;
        }
        wi2 wi2Var = (wi2) obj;
        mj5 mj5Var = this.f61121a;
        if (mj5Var != null ? mj5Var.equals(wi2Var.getPrivacyContext()) : wi2Var.getPrivacyContext() == null) {
            wi2.EnumC14614b enumC14614b = this.f61122b;
            if (enumC14614b == null) {
                if (wi2Var.getProductIdOrigin() == null) {
                    return true;
                }
            } else if (enumC14614b.equals(wi2Var.getProductIdOrigin())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.wi2
    @hib
    public mj5 getPrivacyContext() {
        return this.f61121a;
    }

    @Override // p000.wi2
    @hib
    public wi2.EnumC14614b getProductIdOrigin() {
        return this.f61122b;
    }

    public int hashCode() {
        mj5 mj5Var = this.f61121a;
        int iHashCode = ((mj5Var == null ? 0 : mj5Var.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        wi2.EnumC14614b enumC14614b = this.f61122b;
        return iHashCode ^ (enumC14614b != null ? enumC14614b.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f61121a + ", productIdOrigin=" + this.f61122b + "}";
    }

    private mj0(@hib mj5 mj5Var, @hib wi2.EnumC14614b enumC14614b) {
        this.f61121a = mj5Var;
        this.f61122b = enumC14614b;
    }
}
