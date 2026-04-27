package p000;

/* JADX INFO: loaded from: classes6.dex */
public class xs0 {

    /* JADX INFO: renamed from: j */
    public static final int f99084j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f99085k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f99086l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f99087m = 1;

    /* JADX INFO: renamed from: a */
    public int f99088a;

    /* JADX INFO: renamed from: b */
    public int f99089b;

    /* JADX INFO: renamed from: c */
    public int f99090c;

    /* JADX INFO: renamed from: d */
    public int f99091d;

    /* JADX INFO: renamed from: e */
    public int f99092e;

    /* JADX INFO: renamed from: f */
    public int f99093f;

    /* JADX INFO: renamed from: g */
    public int f99094g = -1;

    /* JADX INFO: renamed from: h */
    public int f99095h;

    /* JADX INFO: renamed from: i */
    public byte[] f99096i;

    public int getHasResponse() {
        return this.f99089b;
    }

    public int getOpCode() {
        return this.f99091d;
    }

    public int getOpCodeSn() {
        return this.f99094g;
    }

    public byte[] getParamData() {
        return this.f99096i;
    }

    public int getParamLen() {
        return this.f99092e;
    }

    public int getStatus() {
        return this.f99093f;
    }

    public int getType() {
        return this.f99088a;
    }

    public int getUnused() {
        return this.f99090c;
    }

    public int getXmOpCode() {
        return this.f99095h;
    }

    public xs0 setHasResponse(int i) {
        this.f99089b = i;
        return this;
    }

    public xs0 setOpCode(int i) {
        this.f99091d = i;
        return this;
    }

    public xs0 setOpCodeSn(int i) {
        this.f99094g = i;
        return this;
    }

    public xs0 setParamData(byte[] bArr) {
        this.f99096i = bArr;
        return this;
    }

    public xs0 setParamLen(int i) {
        this.f99092e = i;
        return this;
    }

    public xs0 setStatus(int i) {
        this.f99093f = i;
        return this;
    }

    public xs0 setType(int i) {
        this.f99088a = i;
        return this;
    }

    public xs0 setXmOpCode(int i) {
        this.f99095h = i;
        return this;
    }

    public String toString() {
        return "BasePacket{type=" + this.f99088a + ", hasResponse=" + this.f99089b + ", unused=" + this.f99090c + ", opCode=" + this.f99091d + ", paramLen=" + this.f99092e + ", status=" + this.f99093f + ", opCodeSn=" + this.f99094g + ", xmOpCode=" + this.f99095h + ", paramData=" + pk1.byte2HexStr(this.f99096i) + '}';
    }
}
