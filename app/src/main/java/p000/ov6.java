package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ov6 implements nv6 {

    /* JADX INFO: renamed from: b */
    public o5c f68928b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f68929c = hj1.getEmptyByteBuffer();

    /* JADX INFO: renamed from: a */
    public boolean f68927a = true;

    /* JADX INFO: renamed from: d */
    public boolean f68930d = false;

    /* JADX INFO: renamed from: e */
    public boolean f68931e = false;

    /* JADX INFO: renamed from: f */
    public boolean f68932f = false;

    /* JADX INFO: renamed from: g */
    public boolean f68933g = false;

    /* JADX INFO: renamed from: ov6$a */
    public static /* synthetic */ class C10665a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68934a;

        static {
            int[] iArr = new int[o5c.values().length];
            f68934a = iArr;
            try {
                iArr[o5c.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68934a[o5c.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68934a[o5c.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68934a[o5c.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68934a[o5c.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68934a[o5c.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ov6(o5c o5cVar) {
        this.f68928b = o5cVar;
    }

    public static ov6 get(o5c o5cVar) {
        if (o5cVar == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (C10665a.f68934a[o5cVar.ordinal()]) {
            case 1:
                return new uvc();
            case 2:
                return new j4d();
            case 3:
                return new etg();
            case 4:
                return new b21();
            case 5:
                return new l52();
            case 6:
                return new hz2();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    @Override // p000.nv6
    public void append(nv6 nv6Var) {
        ByteBuffer payloadData = nv6Var.getPayloadData();
        if (this.f68929c == null) {
            this.f68929c = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.f68929c.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.f68929c;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f68929c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.f68929c.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(payloadData.remaining() + this.f68929c.capacity());
                this.f68929c.flip();
                byteBufferAllocate.put(this.f68929c);
                byteBufferAllocate.put(payloadData);
                this.f68929c = byteBufferAllocate;
            } else {
                this.f68929c.put(payloadData);
            }
            this.f68929c.rewind();
            payloadData.reset();
        }
        this.f68927a = nv6Var.isFin();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ov6 ov6Var = (ov6) obj;
        if (this.f68927a != ov6Var.f68927a || this.f68930d != ov6Var.f68930d || this.f68931e != ov6Var.f68931e || this.f68932f != ov6Var.f68932f || this.f68933g != ov6Var.f68933g || this.f68928b != ov6Var.f68928b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f68929c;
        ByteBuffer byteBuffer2 = ov6Var.f68929c;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    @Override // p000.nv6
    public o5c getOpcode() {
        return this.f68928b;
    }

    @Override // p000.nv6
    public ByteBuffer getPayloadData() {
        return this.f68929c;
    }

    @Override // p000.nv6
    public boolean getTransfereMasked() {
        return this.f68930d;
    }

    public int hashCode() {
        int iHashCode = (((this.f68927a ? 1 : 0) * 31) + this.f68928b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f68929c;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f68930d ? 1 : 0)) * 31) + (this.f68931e ? 1 : 0)) * 31) + (this.f68932f ? 1 : 0)) * 31) + (this.f68933g ? 1 : 0);
    }

    @Override // p000.nv6
    public boolean isFin() {
        return this.f68927a;
    }

    @Override // p000.nv6
    public boolean isRSV1() {
        return this.f68931e;
    }

    @Override // p000.nv6
    public boolean isRSV2() {
        return this.f68932f;
    }

    @Override // p000.nv6
    public boolean isRSV3() {
        return this.f68933g;
    }

    public abstract void isValid() throws ud8;

    public void setFin(boolean z) {
        this.f68927a = z;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.f68929c = byteBuffer;
    }

    public void setRSV1(boolean z) {
        this.f68931e = z;
    }

    public void setRSV2(boolean z) {
        this.f68932f = z;
    }

    public void setRSV3(boolean z) {
        this.f68933g = z;
    }

    public void setTransferemasked(boolean z) {
        this.f68930d = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(getOpcode());
        sb.append(", fin:");
        sb.append(isFin());
        sb.append(", rsv1:");
        sb.append(isRSV1());
        sb.append(", rsv2:");
        sb.append(isRSV2());
        sb.append(", rsv3:");
        sb.append(isRSV3());
        sb.append(", payloadlength:[pos:");
        sb.append(this.f68929c.position());
        sb.append(", len:");
        sb.append(this.f68929c.remaining());
        sb.append("], payload:");
        sb.append(this.f68929c.remaining() > 1000 ? "(too big to display)" : new String(this.f68929c.array()));
        sb.append('}');
        return sb.toString();
    }
}
