package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ym0 implements um0 {

    /* JADX INFO: renamed from: e */
    public static final int f102039e = 16;

    /* JADX INFO: renamed from: a */
    public final int f102040a;

    /* JADX INFO: renamed from: b */
    public final int f102041b;

    /* JADX INFO: renamed from: c */
    public final int f102042c;

    /* JADX INFO: renamed from: d */
    public final int f102043d;

    private ym0(int i, int i2, int i3, int i4) {
        this.f102040a = i;
        this.f102041b = i2;
        this.f102042c = i3;
        this.f102043d = i4;
    }

    public static ym0 parseFrom(jhc jhcVar) {
        int littleEndianInt = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(8);
        int littleEndianInt2 = jhcVar.readLittleEndianInt();
        int littleEndianInt3 = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(4);
        int littleEndianInt4 = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(12);
        return new ym0(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4);
    }

    @Override // p000.um0
    public int getType() {
        return 1751742049;
    }

    public boolean hasIndex() {
        return (this.f102041b & 16) == 16;
    }
}
