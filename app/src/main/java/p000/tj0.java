package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class tj0 extends z33.AbstractC15964e.b {

    /* JADX INFO: renamed from: a */
    public final String f85008a;

    /* JADX INFO: renamed from: b */
    public final byte[] f85009b;

    /* JADX INFO: renamed from: tj0$b */
    public static final class C13068b extends z33.AbstractC15964e.b.a {

        /* JADX INFO: renamed from: a */
        public String f85010a;

        /* JADX INFO: renamed from: b */
        public byte[] f85011b;

        @Override // p000.z33.AbstractC15964e.b.a
        public z33.AbstractC15964e.b build() {
            byte[] bArr;
            String str = this.f85010a;
            if (str != null && (bArr = this.f85011b) != null) {
                return new tj0(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f85010a == null) {
                sb.append(" filename");
            }
            if (this.f85011b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15964e.b.a
        public z33.AbstractC15964e.b.a setContents(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f85011b = bArr;
            return this;
        }

        @Override // p000.z33.AbstractC15964e.b.a
        public z33.AbstractC15964e.b.a setFilename(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f85010a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15964e.b)) {
            return false;
        }
        z33.AbstractC15964e.b bVar = (z33.AbstractC15964e.b) obj;
        if (this.f85008a.equals(bVar.getFilename())) {
            if (Arrays.equals(this.f85009b, bVar instanceof tj0 ? ((tj0) bVar).f85009b : bVar.getContents())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15964e.b
    @efb
    public byte[] getContents() {
        return this.f85009b;
    }

    @Override // p000.z33.AbstractC15964e.b
    @efb
    public String getFilename() {
        return this.f85008a;
    }

    public int hashCode() {
        return ((this.f85008a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f85009b);
    }

    public String toString() {
        return "File{filename=" + this.f85008a + ", contents=" + Arrays.toString(this.f85009b) + "}";
    }

    private tj0(String str, byte[] bArr) {
        this.f85008a = str;
        this.f85009b = bArr;
    }
}
