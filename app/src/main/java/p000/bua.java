package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class bua extends jkg {

    /* JADX INFO: renamed from: bua$a */
    public static final class C2056a extends vu0 {
        public C2056a __assign(int i, int i2, ByteBuffer byteBuffer) {
            m24200b(i, i2, byteBuffer);
            return this;
        }

        public bua get(int i) {
            return get(new bua(), i);
        }

        public bua get(bua buaVar, int i) {
            return buaVar.__assign(jkg.m14151c(m24199a(i), this.f92266d), this.f92266d);
        }
    }

    public static void ValidateVersion() {
        zt2.FLATBUFFERS_1_12_0();
    }

    public static void addCodepoints(k36 k36Var, int i) {
        k36Var.addOffset(6, i, 0);
    }

    public static void addCompatAdded(k36 k36Var, short s) {
        k36Var.addShort(3, s, 0);
    }

    public static void addEmojiStyle(k36 k36Var, boolean z) {
        k36Var.addBoolean(1, z, false);
    }

    public static void addHeight(k36 k36Var, short s) {
        k36Var.addShort(5, s, 0);
    }

    public static void addId(k36 k36Var, int i) {
        k36Var.addInt(0, i, 0);
    }

    public static void addSdkAdded(k36 k36Var, short s) {
        k36Var.addShort(2, s, 0);
    }

    public static void addWidth(k36 k36Var, short s) {
        k36Var.addShort(4, s, 0);
    }

    public static int createCodepointsVector(k36 k36Var, int[] iArr) {
        k36Var.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            k36Var.addInt(iArr[length]);
        }
        return k36Var.endVector();
    }

    public static int createMetadataItem(k36 k36Var, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        k36Var.startTable(7);
        addCodepoints(k36Var, i2);
        addId(k36Var, i);
        addHeight(k36Var, s4);
        addWidth(k36Var, s3);
        addCompatAdded(k36Var, s2);
        addSdkAdded(k36Var, s);
        addEmojiStyle(k36Var, z);
        return endMetadataItem(k36Var);
    }

    public static int endMetadataItem(k36 k36Var) {
        return k36Var.endTable();
    }

    public static bua getRootAsMetadataItem(ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new bua());
    }

    public static void startCodepointsVector(k36 k36Var, int i) {
        k36Var.startVector(4, i, 4);
    }

    public static void startMetadataItem(k36 k36Var) {
        k36Var.startTable(7);
    }

    public bua __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        m14159f(i, byteBuffer);
    }

    public int codepoints(int i) {
        int iM14158d = m14158d(16);
        if (iM14158d != 0) {
            return this.f51044b.getInt(m14162k(iM14158d) + (i * 4));
        }
        return 0;
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return m14163l(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        return m14164m(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        int iM14158d = m14158d(16);
        if (iM14158d != 0) {
            return m14165n(iM14158d);
        }
        return 0;
    }

    public z78 codepointsVector() {
        return codepointsVector(new z78());
    }

    public short compatAdded() {
        int iM14158d = m14158d(10);
        if (iM14158d != 0) {
            return this.f51044b.getShort(iM14158d + this.f51043a);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        int iM14158d = m14158d(6);
        return (iM14158d == 0 || this.f51044b.get(iM14158d + this.f51043a) == 0) ? false : true;
    }

    public short height() {
        int iM14158d = m14158d(14);
        if (iM14158d != 0) {
            return this.f51044b.getShort(iM14158d + this.f51043a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: id */
    public int m3424id() {
        int iM14158d = m14158d(4);
        if (iM14158d != 0) {
            return this.f51044b.getInt(iM14158d + this.f51043a);
        }
        return 0;
    }

    public short sdkAdded() {
        int iM14158d = m14158d(8);
        if (iM14158d != 0) {
            return this.f51044b.getShort(iM14158d + this.f51043a);
        }
        return (short) 0;
    }

    public short width() {
        int iM14158d = m14158d(12);
        if (iM14158d != 0) {
            return this.f51044b.getShort(iM14158d + this.f51043a);
        }
        return (short) 0;
    }

    public static bua getRootAsMetadataItem(ByteBuffer byteBuffer, bua buaVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return buaVar.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public z78 codepointsVector(z78 z78Var) {
        int iM14158d = m14158d(16);
        if (iM14158d != 0) {
            return z78Var.__assign(m14162k(iM14158d), this.f51044b);
        }
        return null;
    }
}
