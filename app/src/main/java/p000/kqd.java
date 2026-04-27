package p000;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class kqd {

    /* JADX INFO: renamed from: a */
    public final String f55063a = kqd.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final ByteArrayOutputStream f55064b = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: c */
    public final byte[] f55065c = {-2, -36, -70};

    /* JADX INFO: renamed from: a */
    private byte[] m14933a(byte[] bArr) {
        int length = bArr.length;
        byte[] byteArray = this.f55064b.toByteArray();
        int length2 = byteArray.length;
        if (length2 <= 0) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[length2 + length];
        System.arraycopy(byteArray, 0, bArr2, 0, length2);
        System.arraycopy(bArr, 0, bArr2, length2, length);
        this.f55064b.reset();
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private xs0 m14934b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 4;
        if (bArr.length < 4) {
            return null;
        }
        byte[] booleanArrayBig = pk1.getBooleanArrayBig(bArr[0]);
        int iByteToInt = pk1.byteToInt(bArr[1]);
        int iBytesToInt = pk1.bytesToInt(bArr, 2, 2);
        xs0 xs0Var = new xs0();
        int iByteToInt2 = pk1.byteToInt(booleanArrayBig[7]);
        int iByteToInt3 = pk1.byteToInt(booleanArrayBig[6]);
        xs0Var.setType(iByteToInt2);
        xs0Var.setHasResponse(iByteToInt3);
        xs0Var.setOpCode(iByteToInt);
        xs0Var.setParamLen(iBytesToInt);
        if (iBytesToInt > 0) {
            if (iByteToInt2 == 0) {
                xs0Var.setStatus(pk1.byteToInt(bArr[4]));
                i = 5;
            }
            xs0Var.setOpCodeSn(pk1.byteToInt(bArr[i]));
            int i2 = i + 1;
            if (iByteToInt == 1) {
                xs0Var.setXmOpCode(pk1.byteToInt(bArr[i2]));
                i2 = i + 2;
            }
            int i3 = iBytesToInt - (i2 - 4);
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            xs0Var.setParamData(bArr2);
            dh8.m9151d(this.f55063a, kc2.formatString("-parsePacketData- packet type : %d, opCode : %d, sn :%d", Integer.valueOf(xs0Var.getType()), Integer.valueOf(xs0Var.getOpCode()), Integer.valueOf(xs0Var.getOpCodeSn())));
        }
        return xs0Var;
    }

    public ArrayList<xs0> findPacketData(int i, byte[] bArr) {
        if (i == 0 || bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList<xs0> arrayList = new ArrayList<>();
        byte[] bArrM14933a = m14933a(bArr);
        int length = bArrM14933a.length;
        dh8.m9156i(this.f55063a, "-findPacketData- mtu = " + i);
        int i2 = 0;
        while (i2 < length) {
            int iM14932a = m14932a(bArrM14933a, i2, i);
            if (iM14932a < this.f55065c.length) {
                dh8.m9160w(this.f55063a, "-findPacketData- not find head data : ");
                return arrayList;
            }
            int iBytesToInt = pk1.bytesToInt(bArrM14933a, iM14932a + 2, 2);
            dh8.m9156i(this.f55063a, "-findPacketData- prefixIndex = " + iM14932a + ", paramLen = " + iBytesToInt);
            int i3 = iBytesToInt + 4;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrM14933a, iM14932a, bArr2, 0, i3);
            xs0 xs0VarM14934b = m14934b(bArr2);
            if (xs0VarM14934b != null) {
                arrayList.add(xs0VarM14934b);
            }
            i2 = iM14932a + 4 + iBytesToInt + 1;
        }
        return arrayList;
    }

    public void release() {
        this.f55064b.reset();
    }

    /* JADX INFO: renamed from: a */
    private int m14932a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == -2) {
                int i3 = length - i;
                byte[] bArr2 = this.f55065c;
                if (i3 < bArr2.length) {
                    m14935b(bArr, i, i3);
                    return -1;
                }
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, i, bArr3, 0, length2);
                if (Arrays.equals(bArr3, this.f55065c)) {
                    byte[] bArr4 = this.f55065c;
                    if (i3 <= bArr4.length + 4) {
                        m14935b(bArr, i, i3);
                        return -1;
                    }
                    int length3 = bArr4.length + i;
                    byte[] bArr5 = new byte[2];
                    System.arraycopy(bArr, length3 + 2, bArr5, 0, 2);
                    int iBytesToInt = pk1.bytesToInt(bArr5[0], bArr5[1]);
                    if (iBytesToInt > i2 - 8) {
                        dh8.m9154e(this.f55063a, kc2.formatString("findPacketData :: data length[%d] over MAX_RECEIVE_MTU[%d], cast away", Integer.valueOf(iBytesToInt), Integer.valueOf(i2)));
                    } else {
                        if (i3 <= this.f55065c.length + 4 + iBytesToInt) {
                            m14935b(bArr, i, i3);
                            return -1;
                        }
                        if (bArr[length3 + 4 + iBytesToInt] == -17) {
                            return length3;
                        }
                    }
                    i = length3 - 1;
                } else {
                    continue;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private void m14935b(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || bArr.length <= 0 || i < 0 || i2 <= 0 || (i3 = i2 + i) > bArr.length) {
            return;
        }
        try {
            this.f55064b.write(Arrays.copyOfRange(bArr, i, i3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
