package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class l52 extends pz2 {

    /* JADX INFO: renamed from: A */
    public static final int f56174A = -3;

    /* JADX INFO: renamed from: j */
    public static final int f56175j = 1000;

    /* JADX INFO: renamed from: k */
    public static final int f56176k = 1001;

    /* JADX INFO: renamed from: l */
    public static final int f56177l = 1002;

    /* JADX INFO: renamed from: m */
    public static final int f56178m = 1003;

    /* JADX INFO: renamed from: n */
    public static final int f56179n = 1005;

    /* JADX INFO: renamed from: o */
    public static final int f56180o = 1006;

    /* JADX INFO: renamed from: p */
    public static final int f56181p = 1007;

    /* JADX INFO: renamed from: q */
    public static final int f56182q = 1008;

    /* JADX INFO: renamed from: r */
    public static final int f56183r = 1009;

    /* JADX INFO: renamed from: s */
    public static final int f56184s = 1010;

    /* JADX INFO: renamed from: t */
    public static final int f56185t = 1011;

    /* JADX INFO: renamed from: u */
    public static final int f56186u = 1012;

    /* JADX INFO: renamed from: v */
    public static final int f56187v = 1013;

    /* JADX INFO: renamed from: w */
    public static final int f56188w = 1014;

    /* JADX INFO: renamed from: x */
    public static final int f56189x = 1015;

    /* JADX INFO: renamed from: y */
    public static final int f56190y = -1;

    /* JADX INFO: renamed from: z */
    public static final int f56191z = -2;

    /* JADX INFO: renamed from: h */
    public int f56192h;

    /* JADX INFO: renamed from: i */
    public String f56193i;

    public l52() {
        super(o5c.CLOSING);
        setReason("");
        setCode(1000);
    }

    private void updatePayload() {
        byte[] bArrUtf8Bytes = ww1.utf8Bytes(this.f56193i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.f56192h);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrUtf8Bytes.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrUtf8Bytes);
        byteBufferAllocate2.rewind();
        super.setPayload(byteBufferAllocate2);
    }

    private void validateUtf8(ByteBuffer byteBuffer, int i) throws ud8 {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.f56193i = ww1.stringUtf8(byteBuffer);
            } catch (IllegalArgumentException unused) {
                throw new ud8(1007);
            }
        } finally {
            byteBuffer.position(i);
        }
    }

    @Override // p000.ov6
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        l52 l52Var = (l52) obj;
        if (this.f56192h != l52Var.f56192h) {
            return false;
        }
        String str = this.f56193i;
        String str2 = l52Var.f56193i;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int getCloseCode() {
        return this.f56192h;
    }

    public String getMessage() {
        return this.f56193i;
    }

    @Override // p000.ov6, p000.nv6
    public ByteBuffer getPayloadData() {
        return this.f56192h == 1005 ? hj1.getEmptyByteBuffer() : super.getPayloadData();
    }

    @Override // p000.ov6
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.f56192h) * 31;
        String str = this.f56193i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000.pz2, p000.ov6
    public void isValid() throws ud8 {
        super.isValid();
        if (this.f56192h == 1007 && this.f56193i.isEmpty()) {
            throw new ud8(1007, "Received text is no valid utf8 string!");
        }
        if (this.f56192h == 1005 && this.f56193i.length() > 0) {
            throw new ud8(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.f56192h;
        if (i > 1015 && i < 3000) {
            throw new ud8(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new xd8("closecode must not be sent over the wire: " + this.f56192h);
        }
    }

    public void setCode(int i) {
        this.f56192h = i;
        if (i == 1015) {
            this.f56192h = 1005;
            this.f56193i = "";
        }
        updatePayload();
    }

    @Override // p000.ov6
    public void setPayload(ByteBuffer byteBuffer) {
        this.f56192h = 1005;
        this.f56193i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f56192h = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f56192h = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f56192h = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            validateUtf8(byteBuffer, byteBuffer.position());
        } catch (ud8 unused) {
            this.f56192h = 1007;
            this.f56193i = null;
        }
    }

    public void setReason(String str) {
        if (str == null) {
            str = "";
        }
        this.f56193i = str;
        updatePayload();
    }

    @Override // p000.ov6
    public String toString() {
        return super.toString() + "code: " + this.f56192h;
    }
}
