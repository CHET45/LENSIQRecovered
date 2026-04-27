package p000;

import java.util.Arrays;
import p000.e36;
import p000.e6g;

/* JADX INFO: loaded from: classes3.dex */
public final class a36 extends e6g {

    /* JADX INFO: renamed from: t */
    public static final byte f259t = -1;

    /* JADX INFO: renamed from: u */
    public static final int f260u = 4;

    /* JADX INFO: renamed from: r */
    @hib
    public e36 f261r;

    /* JADX INFO: renamed from: s */
    @hib
    public C0038a f262s;

    /* JADX INFO: renamed from: a36$a */
    public static final class C0038a implements d0c {

        /* JADX INFO: renamed from: a */
        public e36 f263a;

        /* JADX INFO: renamed from: b */
        public e36.C5065a f264b;

        /* JADX INFO: renamed from: c */
        public long f265c = -1;

        /* JADX INFO: renamed from: d */
        public long f266d = -1;

        public C0038a(e36 e36Var, e36.C5065a c5065a) {
            this.f263a = e36Var;
            this.f264b = c5065a;
        }

        @Override // p000.d0c
        public gue createSeekMap() {
            v80.checkState(this.f265c != -1);
            return new d36(this.f263a, this.f265c);
        }

        @Override // p000.d0c
        public long read(ak5 ak5Var) {
            long j = this.f266d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f266d = -1L;
            return j2;
        }

        public void setFirstFrameOffset(long j) {
            this.f265c = j;
        }

        @Override // p000.d0c
        public void startSeek(long j) {
            long[] jArr = this.f264b.f31653a;
            this.f266d = jArr[t0i.binarySearchFloor(jArr, j, true, true)];
        }
    }

    private int getFlacFrameBlockSize(jhc jhcVar) {
        int i = (jhcVar.getData()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            jhcVar.skipBytes(4);
            jhcVar.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = w26.readFrameBlockSizeSamplesFromKey(jhcVar, i);
        jhcVar.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(jhc jhcVar) {
        return jhcVar.bytesLeft() >= 5 && jhcVar.readUnsignedByte() == 127 && jhcVar.readUnsignedInt() == 1179402563;
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: e */
    public long mo121e(jhc jhcVar) {
        if (isAudioPacket(jhcVar.getData())) {
            return getFlacFrameBlockSize(jhcVar);
        }
        return -1L;
    }

    @Override // p000.e6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo122g(jhc jhcVar, long j, e6g.C5148b c5148b) {
        byte[] data = jhcVar.getData();
        e36 e36Var = this.f261r;
        if (e36Var == null) {
            e36 e36Var2 = new e36(data, 17);
            this.f261r = e36Var2;
            c5148b.f31967a = e36Var2.getFormat(Arrays.copyOfRange(data, 9, jhcVar.limit()), null).buildUpon().setContainerMimeType("audio/ogg").build();
            return true;
        }
        if ((data[0] & 127) == 3) {
            e36.C5065a seekTableMetadataBlock = y26.readSeekTableMetadataBlock(jhcVar);
            e36 e36VarCopyWithSeekTable = e36Var.copyWithSeekTable(seekTableMetadataBlock);
            this.f261r = e36VarCopyWithSeekTable;
            this.f262s = new C0038a(e36VarCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!isAudioPacket(data)) {
            return true;
        }
        C0038a c0038a = this.f262s;
        if (c0038a != null) {
            c0038a.setFirstFrameOffset(j);
            c5148b.f31968b = this.f262s;
        }
        v80.checkNotNull(c5148b.f31967a);
        return false;
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: h */
    public void mo123h(boolean z) {
        super.mo123h(z);
        if (z) {
            this.f261r = null;
            this.f262s = null;
        }
    }
}
