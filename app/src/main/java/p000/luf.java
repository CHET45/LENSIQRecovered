package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class luf {

    /* JADX INFO: renamed from: c */
    public static final int f58835c = 1024;

    /* JADX INFO: renamed from: d */
    public static final int f58836d = 440786851;

    /* JADX INFO: renamed from: a */
    public final jhc f58837a = new jhc(8);

    /* JADX INFO: renamed from: b */
    public int f58838b;

    private long readUint(ak5 ak5Var) throws IOException {
        int i = 0;
        ak5Var.peekFully(this.f58837a.getData(), 0, 1);
        int i2 = this.f58837a.getData()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ak5Var.peekFully(this.f58837a.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f58837a.getData()[i] & 255) + (i5 << 8);
        }
        this.f58838b += i4 + 1;
        return i5;
    }

    public boolean sniff(ak5 ak5Var) throws IOException {
        long length = ak5Var.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        ak5Var.peekFully(this.f58837a.getData(), 0, 4);
        long unsignedInt = this.f58837a.readUnsignedInt();
        this.f58838b = 4;
        while (unsignedInt != 440786851) {
            int i2 = this.f58838b + 1;
            this.f58838b = i2;
            if (i2 == i) {
                return false;
            }
            ak5Var.peekFully(this.f58837a.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.f58837a.getData()[0] & 255));
        }
        long uint = readUint(ak5Var);
        long j2 = this.f58838b;
        if (uint == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + uint >= length) {
            return false;
        }
        while (true) {
            int i3 = this.f58838b;
            long j3 = j2 + uint;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (readUint(ak5Var) == Long.MIN_VALUE) {
                return false;
            }
            long uint2 = readUint(ak5Var);
            if (uint2 < 0 || uint2 > 2147483647L) {
                break;
            }
            if (uint2 != 0) {
                int i4 = (int) uint2;
                ak5Var.advancePeekPosition(i4);
                this.f58838b += i4;
            }
        }
        return false;
    }
}
