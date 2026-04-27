package p000;

/* JADX INFO: loaded from: classes8.dex */
public class vu3 implements up7 {
    @Override // p000.up7
    public boolean acceptProvidedExtensionAsClient(String str) {
        return true;
    }

    @Override // p000.up7
    public boolean acceptProvidedExtensionAsServer(String str) {
        return true;
    }

    @Override // p000.up7
    public up7 copyInstance() {
        return new vu3();
    }

    @Override // p000.up7
    public void decodeFrame(nv6 nv6Var) throws ud8 {
    }

    @Override // p000.up7
    public void encodeFrame(nv6 nv6Var) {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    @Override // p000.up7
    public String getProvidedExtensionAsClient() {
        return "";
    }

    @Override // p000.up7
    public String getProvidedExtensionAsServer() {
        return "";
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // p000.up7
    public void isFrameValid(nv6 nv6Var) throws ud8 {
        if (nv6Var.isRSV1() || nv6Var.isRSV2() || nv6Var.isRSV3()) {
            throw new xd8("bad rsv RSV1: " + nv6Var.isRSV1() + " RSV2: " + nv6Var.isRSV2() + " RSV3: " + nv6Var.isRSV3());
        }
    }

    @Override // p000.up7
    public void reset() {
    }

    @Override // p000.up7
    public String toString() {
        return getClass().getSimpleName();
    }
}
