package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.bua;

/* JADX INFO: loaded from: classes3.dex */
public final class cua extends jkg {

    /* JADX INFO: renamed from: cua$a */
    public static final class C4507a extends vu0 {
        public C4507a __assign(int i, int i2, ByteBuffer byteBuffer) {
            m24200b(i, i2, byteBuffer);
            return this;
        }

        public cua get(int i) {
            return get(new cua(), i);
        }

        public cua get(cua cuaVar, int i) {
            return cuaVar.__assign(jkg.m14151c(m24199a(i), this.f92266d), this.f92266d);
        }
    }

    public static void ValidateVersion() {
        zt2.FLATBUFFERS_1_12_0();
    }

    public static void addList(k36 k36Var, int i) {
        k36Var.addOffset(1, i, 0);
    }

    public static void addSourceSha(k36 k36Var, int i) {
        k36Var.addOffset(2, i, 0);
    }

    public static void addVersion(k36 k36Var, int i) {
        k36Var.addInt(0, i, 0);
    }

    public static int createListVector(k36 k36Var, int[] iArr) {
        k36Var.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            k36Var.addOffset(iArr[length]);
        }
        return k36Var.endVector();
    }

    public static int createMetadataList(k36 k36Var, int i, int i2, int i3) {
        k36Var.startTable(3);
        addSourceSha(k36Var, i3);
        addList(k36Var, i2);
        addVersion(k36Var, i);
        return endMetadataList(k36Var);
    }

    public static int endMetadataList(k36 k36Var) {
        return k36Var.endTable();
    }

    public static void finishMetadataListBuffer(k36 k36Var, int i) {
        k36Var.finish(i);
    }

    public static void finishSizePrefixedMetadataListBuffer(k36 k36Var, int i) {
        k36Var.finishSizePrefixed(i);
    }

    public static cua getRootAsMetadataList(ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new cua());
    }

    public static void startListVector(k36 k36Var, int i) {
        k36Var.startVector(4, i, 4);
    }

    public static void startMetadataList(k36 k36Var) {
        k36Var.startTable(3);
    }

    public cua __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        m14159f(i, byteBuffer);
    }

    public bua list(int i) {
        return list(new bua(), i);
    }

    public int listLength() {
        int iM14158d = m14158d(6);
        if (iM14158d != 0) {
            return m14165n(iM14158d);
        }
        return 0;
    }

    public bua.C2056a listVector() {
        return listVector(new bua.C2056a());
    }

    public String sourceSha() {
        int iM14158d = m14158d(8);
        if (iM14158d != 0) {
            return m14160g(iM14158d + this.f51043a);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return m14163l(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        return m14164m(byteBuffer, 8, 1);
    }

    public int version() {
        int iM14158d = m14158d(4);
        if (iM14158d != 0) {
            return this.f51044b.getInt(iM14158d + this.f51043a);
        }
        return 0;
    }

    public static cua getRootAsMetadataList(ByteBuffer byteBuffer, cua cuaVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cuaVar.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public bua list(bua buaVar, int i) {
        int iM14158d = m14158d(6);
        if (iM14158d != 0) {
            return buaVar.__assign(m14157b(m14162k(iM14158d) + (i * 4)), this.f51044b);
        }
        return null;
    }

    public bua.C2056a listVector(bua.C2056a c2056a) {
        int iM14158d = m14158d(6);
        if (iM14158d != 0) {
            return c2056a.__assign(m14162k(iM14158d), 4, this.f51044b);
        }
        return null;
    }
}
