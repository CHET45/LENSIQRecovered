package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fo2 extends vu3 {
    @Override // p000.vu3, p000.up7
    public void isFrameValid(nv6 nv6Var) throws ud8 {
        if ((nv6Var instanceof dg3) && (nv6Var.isRSV2() || nv6Var.isRSV3())) {
            throw new xd8("bad rsv RSV1: " + nv6Var.isRSV1() + " RSV2: " + nv6Var.isRSV2() + " RSV3: " + nv6Var.isRSV3());
        }
        if (nv6Var instanceof pz2) {
            if (nv6Var.isRSV1() || nv6Var.isRSV2() || nv6Var.isRSV3()) {
                throw new xd8("bad rsv RSV1: " + nv6Var.isRSV1() + " RSV2: " + nv6Var.isRSV2() + " RSV3: " + nv6Var.isRSV3());
            }
        }
    }
}
