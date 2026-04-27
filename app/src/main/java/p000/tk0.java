package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.cg5;

/* JADX INFO: loaded from: classes4.dex */
public final class tk0 extends cg5 {

    /* JADX INFO: renamed from: a */
    public final byte[] f85090a;

    /* JADX INFO: renamed from: b */
    public final byte[] f85091b;

    /* JADX INFO: renamed from: tk0$b */
    public static final class C13079b extends cg5.AbstractC2303a {

        /* JADX INFO: renamed from: a */
        public byte[] f85092a;

        /* JADX INFO: renamed from: b */
        public byte[] f85093b;

        @Override // p000.cg5.AbstractC2303a
        public cg5 build() {
            return new tk0(this.f85092a, this.f85093b);
        }

        @Override // p000.cg5.AbstractC2303a
        public cg5.AbstractC2303a setClearBlob(@hib byte[] bArr) {
            this.f85092a = bArr;
            return this;
        }

        @Override // p000.cg5.AbstractC2303a
        public cg5.AbstractC2303a setEncryptedBlob(@hib byte[] bArr) {
            this.f85093b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cg5)) {
            return false;
        }
        cg5 cg5Var = (cg5) obj;
        boolean z = cg5Var instanceof tk0;
        if (Arrays.equals(this.f85090a, z ? ((tk0) cg5Var).f85090a : cg5Var.getClearBlob())) {
            if (Arrays.equals(this.f85091b, z ? ((tk0) cg5Var).f85091b : cg5Var.getEncryptedBlob())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.cg5
    @hib
    public byte[] getClearBlob() {
        return this.f85090a;
    }

    @Override // p000.cg5
    @hib
    public byte[] getEncryptedBlob() {
        return this.f85091b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f85090a) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f85091b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f85090a) + ", encryptedBlob=" + Arrays.toString(this.f85091b) + "}";
    }

    private tk0(@hib byte[] bArr, @hib byte[] bArr2) {
        this.f85090a = bArr;
        this.f85091b = bArr2;
    }
}
