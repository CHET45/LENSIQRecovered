package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.mj5;

/* JADX INFO: loaded from: classes4.dex */
public final class vk0 extends mj5 {

    /* JADX INFO: renamed from: a */
    public final kj5 f91480a;

    /* JADX INFO: renamed from: vk0$b */
    public static final class C14133b extends mj5.AbstractC9366a {

        /* JADX INFO: renamed from: a */
        public kj5 f91481a;

        @Override // p000.mj5.AbstractC9366a
        public mj5 build() {
            return new vk0(this.f91481a);
        }

        @Override // p000.mj5.AbstractC9366a
        public mj5.AbstractC9366a setPrequest(@hib kj5 kj5Var) {
            this.f91481a = kj5Var;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mj5)) {
            return false;
        }
        kj5 kj5Var = this.f91480a;
        kj5 prequest = ((mj5) obj).getPrequest();
        return kj5Var == null ? prequest == null : kj5Var.equals(prequest);
    }

    @Override // p000.mj5
    @hib
    public kj5 getPrequest() {
        return this.f91480a;
    }

    public int hashCode() {
        kj5 kj5Var = this.f91480a;
        return (kj5Var == null ? 0 : kj5Var.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f91480a + "}";
    }

    private vk0(@hib kj5 kj5Var) {
        this.f91480a = kj5Var;
    }
}
