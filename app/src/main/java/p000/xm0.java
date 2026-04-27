package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xm0 implements tm0 {

    /* JADX INFO: renamed from: e */
    public static final int f98485e = 16;

    /* JADX INFO: renamed from: a */
    public final int f98486a;

    /* JADX INFO: renamed from: b */
    public final int f98487b;

    /* JADX INFO: renamed from: c */
    public final int f98488c;

    /* JADX INFO: renamed from: d */
    public final int f98489d;

    private xm0(int i, int i2, int i3, int i4) {
        this.f98486a = i;
        this.f98487b = i2;
        this.f98488c = i3;
        this.f98489d = i4;
    }

    public static xm0 parseFrom(ihc ihcVar) {
        int littleEndianInt = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(8);
        int littleEndianInt2 = ihcVar.readLittleEndianInt();
        int littleEndianInt3 = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(4);
        int littleEndianInt4 = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(12);
        return new xm0(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4);
    }

    @Override // p000.tm0
    public int getType() {
        return 1751742049;
    }

    public boolean hasIndex() {
        return (this.f98487b & 16) == 16;
    }
}
