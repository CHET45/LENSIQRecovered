package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.u55;

/* JADX INFO: loaded from: classes4.dex */
public final class qk0 extends u55 {

    /* JADX INFO: renamed from: a */
    public final String f74724a;

    /* JADX INFO: renamed from: b */
    public final byte[] f74725b;

    /* JADX INFO: renamed from: c */
    public final byte[] f74726c;

    /* JADX INFO: renamed from: qk0$b */
    public static final class C11519b extends u55.AbstractC13366a {

        /* JADX INFO: renamed from: a */
        public String f74727a;

        /* JADX INFO: renamed from: b */
        public byte[] f74728b;

        /* JADX INFO: renamed from: c */
        public byte[] f74729c;

        @Override // p000.u55.AbstractC13366a
        public u55 build() {
            return new qk0(this.f74727a, this.f74728b, this.f74729c);
        }

        @Override // p000.u55.AbstractC13366a
        public u55.AbstractC13366a setExperimentIdsClear(byte[] bArr) {
            this.f74728b = bArr;
            return this;
        }

        @Override // p000.u55.AbstractC13366a
        public u55.AbstractC13366a setExperimentIdsEncrypted(byte[] bArr) {
            this.f74729c = bArr;
            return this;
        }

        @Override // p000.u55.AbstractC13366a
        public u55.AbstractC13366a setPseudonymousId(String str) {
            this.f74727a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u55)) {
            return false;
        }
        u55 u55Var = (u55) obj;
        String str = this.f74724a;
        if (str != null ? str.equals(u55Var.getPseudonymousId()) : u55Var.getPseudonymousId() == null) {
            boolean z = u55Var instanceof qk0;
            if (Arrays.equals(this.f74725b, z ? ((qk0) u55Var).f74725b : u55Var.getExperimentIdsClear())) {
                if (Arrays.equals(this.f74726c, z ? ((qk0) u55Var).f74726c : u55Var.getExperimentIdsEncrypted())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.u55
    @hib
    public byte[] getExperimentIdsClear() {
        return this.f74725b;
    }

    @Override // p000.u55
    @hib
    public byte[] getExperimentIdsEncrypted() {
        return this.f74726c;
    }

    @Override // p000.u55
    @hib
    public String getPseudonymousId() {
        return this.f74724a;
    }

    public int hashCode() {
        String str = this.f74724a;
        return (((((str == null ? 0 : str.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f74725b)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f74726c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f74724a + ", experimentIdsClear=" + Arrays.toString(this.f74725b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f74726c) + "}";
    }

    private qk0(@hib String str, @hib byte[] bArr, @hib byte[] bArr2) {
        this.f74724a = str;
        this.f74725b = bArr;
        this.f74726c = bArr2;
    }
}
