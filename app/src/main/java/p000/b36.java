package p000;

import java.util.Arrays;
import p000.f36;
import p000.f6g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b36 extends f6g {

    /* JADX INFO: renamed from: t */
    public static final byte f12516t = -1;

    /* JADX INFO: renamed from: u */
    public static final int f12517u = 4;

    /* JADX INFO: renamed from: r */
    @hib
    public f36 f12518r;

    /* JADX INFO: renamed from: s */
    @hib
    public C1717a f12519s;

    /* JADX INFO: renamed from: b36$a */
    public static final class C1717a implements c0c {

        /* JADX INFO: renamed from: a */
        public f36 f12520a;

        /* JADX INFO: renamed from: b */
        public f36.C5581a f12521b;

        /* JADX INFO: renamed from: c */
        public long f12522c = -1;

        /* JADX INFO: renamed from: d */
        public long f12523d = -1;

        public C1717a(f36 f36Var, f36.C5581a c5581a) {
            this.f12520a = f36Var;
            this.f12521b = c5581a;
        }

        @Override // p000.c0c
        public hue createSeekMap() {
            u80.checkState(this.f12522c != -1);
            return new c36(this.f12520a, this.f12522c);
        }

        @Override // p000.c0c
        public long read(zj5 zj5Var) {
            long j = this.f12523d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f12523d = -1L;
            return j2;
        }

        public void setFirstFrameOffset(long j) {
            this.f12522c = j;
        }

        @Override // p000.c0c
        public void startSeek(long j) {
            long[] jArr = this.f12521b.f34992a;
            this.f12523d = jArr[x0i.binarySearchFloor(jArr, j, true, true)];
        }
    }

    private int getFlacFrameBlockSize(ihc ihcVar) {
        int i = (ihcVar.getData()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ihcVar.skipBytes(4);
            ihcVar.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = x26.readFrameBlockSizeSamplesFromKey(ihcVar, i);
        ihcVar.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(ihc ihcVar) {
        return ihcVar.bytesLeft() >= 5 && ihcVar.readUnsignedByte() == 127 && ihcVar.readUnsignedInt() == 1179402563;
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: e */
    public long mo2868e(ihc ihcVar) {
        if (isAudioPacket(ihcVar.getData())) {
            return getFlacFrameBlockSize(ihcVar);
        }
        return -1L;
    }

    @Override // p000.f6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo2869g(ihc ihcVar, long j, f6g.C5642b c5642b) {
        byte[] data = ihcVar.getData();
        f36 f36Var = this.f12518r;
        if (f36Var == null) {
            f36 f36Var2 = new f36(data, 17);
            this.f12518r = f36Var2;
            c5642b.f35532a = f36Var2.getFormat(Arrays.copyOfRange(data, 9, ihcVar.limit()), null);
            return true;
        }
        if ((data[0] & 127) == 3) {
            f36.C5581a seekTableMetadataBlock = z26.readSeekTableMetadataBlock(ihcVar);
            f36 f36VarCopyWithSeekTable = f36Var.copyWithSeekTable(seekTableMetadataBlock);
            this.f12518r = f36VarCopyWithSeekTable;
            this.f12519s = new C1717a(f36VarCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!isAudioPacket(data)) {
            return true;
        }
        C1717a c1717a = this.f12519s;
        if (c1717a != null) {
            c1717a.setFirstFrameOffset(j);
            c5642b.f35533b = this.f12519s;
        }
        u80.checkNotNull(c5642b.f35532a);
        return false;
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: h */
    public void mo2870h(boolean z) {
        super.mo2870h(z);
        if (z) {
            this.f12518r = null;
            this.f12519s = null;
        }
    }
}
