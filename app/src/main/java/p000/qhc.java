package p000;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qhc {

    /* JADX INFO: renamed from: a */
    public static final String f74462a = "ParseHelper";

    /* JADX INFO: renamed from: b */
    public static final byte f74463b = -2;

    /* JADX INFO: renamed from: c */
    public static final byte f74464c = -36;

    /* JADX INFO: renamed from: d */
    public static final byte f74465d = -70;

    /* JADX INFO: renamed from: e */
    public static final byte f74466e = -17;

    /* JADX INFO: renamed from: g */
    public static byte[] f74468g;

    /* JADX INFO: renamed from: f */
    public static final byte[] f74467f = {-2, -36, -70};

    /* JADX INFO: renamed from: h */
    public static int f74469h = 0;

    /* JADX INFO: renamed from: i */
    public static final char[] f74470i = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    private static int m20368a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == -2) {
                int i3 = length - i;
                byte[] bArr2 = f74467f;
                if (i3 < bArr2.length) {
                    m20370b(bArr, i, i3);
                    return -1;
                }
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, i, bArr3, 0, length2);
                if (!Arrays.equals(bArr3, bArr2)) {
                    continue;
                } else {
                    if (i3 <= bArr2.length + 4) {
                        m20370b(bArr, i, i3);
                        return -1;
                    }
                    int length3 = bArr2.length + i;
                    byte[] bArr4 = new byte[2];
                    System.arraycopy(bArr, length3 + 2, bArr4, 0, 2);
                    int iBytesToInt = pk1.bytesToInt(bArr4[0], bArr4[1]);
                    if (iBytesToInt > i2 - 8) {
                        dh8.m9155e(f74462a, "findPacketData", kc2.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", Integer.valueOf(iBytesToInt), Integer.valueOf(i2)));
                    } else {
                        if (i3 <= bArr2.length + 4 + iBytesToInt) {
                            int i4 = length - length3;
                            byte[] bArr5 = new byte[i4];
                            System.arraycopy(bArr, length3, bArr5, 0, i4);
                            int iM20368a = m20368a(bArr5, 0, i2);
                            String str = f74462a;
                            dh8.m9157i(str, "findPacketData", "check left data, index = " + iM20368a);
                            if (iM20368a < bArr2.length) {
                                m20370b(bArr, i, i3);
                                return -1;
                            }
                            int i5 = length3 + iM20368a;
                            dh8.m9161w(str, "findPacketData", "found headIndex = " + i5);
                            return i5;
                        }
                        if (bArr[length3 + 4 + iBytesToInt] == -17) {
                            return length3;
                        }
                    }
                    i = length3 - 1;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m20371b(byte[] bArr) {
        int length = bArr.length;
        int i = f74469h;
        if (i <= 0) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[i + length];
        System.arraycopy(f74468g, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr2, f74469h, length);
        f74469h = 0;
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    private static xs0 m20372c(byte[] bArr) {
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
            dh8.m9152d(f74462a, "parsePacketData", kc2.formatString("packet type : %d, opCode : %d, sn :%d", Integer.valueOf(xs0Var.getType()), Integer.valueOf(xs0Var.getOpCode()), Integer.valueOf(xs0Var.getOpCodeSn())));
        }
        return xs0Var;
    }

    public static xs0 convert2BasePacket(ob2 ob2Var, int i) {
        if (ob2Var == null) {
            return null;
        }
        int i2 = 0;
        boolean z = i == 1;
        int type = ob2Var.getType();
        if (z && (type == 2 || type == 3)) {
            i2 = 1;
        }
        xs0 status = new xs0().setType(i).setHasResponse(i2).setOpCode(ob2Var.getId()).setOpCodeSn(ob2Var.getOpCodeSn()).setStatus(ob2Var.getStatus());
        int length = z ? 1 : 2;
        if (ob2Var.getParam() != null) {
            if (status.getOpCode() == 1) {
                status.setXmOpCode(ob2Var.getParam().getXmOpCode());
                length++;
            }
            byte[] paramData = ob2Var.getParam().getParamData();
            if (paramData != null && paramData.length > 0) {
                status.setParamData(paramData);
                length += paramData.length;
            }
        }
        status.setParamLen(length);
        return status;
    }

    public static ob2 convert2Command(xs0 xs0Var, ob2 ob2Var) {
        if (xs0Var == null) {
            return null;
        }
        ob2 ob2VarM20369a = m20369a(xs0Var, ob2Var);
        return ob2VarM20369a != null ? ob2VarM20369a : new iqd().parseDataToCmd(xs0Var, ob2Var);
    }

    public static int convertVersionByString(String str) {
        if (!TextUtils.isEmpty(str)) {
            dh8.m9157i(f74462a, "convertVersionByString", "version = " + str);
            String[] strArrSplit = str.replace(k95.f53074X4, "").replace("v", "").split("\\.");
            int length = strArrSplit.length;
            int[] iArr = new int[length];
            for (int i = 0; i < strArrSplit.length; i++) {
                String str2 = strArrSplit[i];
                if (TextUtils.isDigitsOnly(str2)) {
                    iArr[i] = Integer.parseInt(str2);
                }
            }
            if (length == 4) {
                byte[] booleanArray = pk1.getBooleanArray((byte) iArr[0]);
                byte[] booleanArray2 = pk1.getBooleanArray((byte) iArr[1]);
                byte[] bArr = new byte[8];
                System.arraycopy(booleanArray, 4, bArr, 0, 4);
                System.arraycopy(booleanArray2, 4, bArr, 4, 4);
                byte bM20367a = (byte) m20367a(bArr);
                byte[] booleanArray3 = pk1.getBooleanArray((byte) iArr[2]);
                byte[] booleanArray4 = pk1.getBooleanArray((byte) iArr[3]);
                byte[] bArr2 = new byte[8];
                System.arraycopy(booleanArray3, 4, bArr2, 0, 4);
                System.arraycopy(booleanArray4, 4, bArr2, 4, 4);
                byte bM20367a2 = (byte) m20367a(bArr2);
                dh8.m9157i(f74462a, "convertVersionByString", "versionCode : 0, heightValue : " + pk1.byte2HexStr(bArr) + ", lowValue : " + pk1.byte2HexStr(bArr2));
                return pk1.bytesToInt(bM20367a, bM20367a2);
            }
        }
        return 0;
    }

    public static ArrayList<xs0> findPacketData(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        return findPacketData(i, bArr);
    }

    public static String hexDataCovetToAddress(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length == 6) {
            for (int i = 0; i < bArr.length; i++) {
                char[] cArr = f74470i;
                sb.append(cArr[(bArr[i] & 255) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
                if (i != bArr.length - 1) {
                    sb.append(g1i.f38277c);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] packSendBasePacket(xs0 xs0Var) {
        int i;
        int i2;
        if (xs0Var == null) {
            return null;
        }
        int paramLen = xs0Var.getParamLen();
        int i3 = paramLen + 4;
        byte[] bArr = new byte[paramLen + 8];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[2];
        if (xs0Var.getType() == 1) {
            bArr3[0] = (byte) (bArr3[0] | 128);
        }
        if (xs0Var.getHasResponse() == 1) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        bArr3[1] = (byte) xs0Var.getOpCode();
        byte[] bArrInt2byte2 = pk1.int2byte2(paramLen);
        byte[] bArr4 = new byte[paramLen];
        byte[] bArr5 = {(byte) xs0Var.getStatus()};
        byte[] bArr6 = {(byte) xs0Var.getOpCodeSn()};
        if (xs0Var.getType() == 1) {
            System.arraycopy(bArr6, 0, bArr4, 0, 1);
            if (xs0Var.getOpCode() == 1) {
                System.arraycopy(new byte[]{(byte) xs0Var.getXmOpCode()}, 0, bArr4, 1, 1);
                i = 2;
            } else {
                i = 1;
            }
            if (xs0Var.getParamData() != null && xs0Var.getParamData().length >= (i2 = paramLen - i)) {
                System.arraycopy(xs0Var.getParamData(), 0, bArr4, i, i2);
                i += i2;
            }
        } else {
            System.arraycopy(bArr5, 0, bArr4, 0, 1);
            System.arraycopy(bArr6, 0, bArr4, 1, 1);
            if (xs0Var.getOpCode() == 1) {
                System.arraycopy(new byte[]{(byte) xs0Var.getXmOpCode()}, 0, bArr4, 2, 1);
                i = 3;
            } else {
                i = 2;
            }
            if (xs0Var.getParamData() != null) {
                i2 = paramLen - i;
                System.arraycopy(xs0Var.getParamData(), 0, bArr4, i, i2);
                i += i2;
            }
        }
        if (i != paramLen) {
            dh8.m9155e(f74462a, "packSendBasePacket", "param data is error. index : " + i + ", paramLen : " + paramLen);
            return null;
        }
        System.arraycopy(bArr3, 0, bArr2, 0, 2);
        System.arraycopy(bArrInt2byte2, 0, bArr2, 2, 2);
        System.arraycopy(bArr4, 0, bArr2, 4, paramLen);
        System.arraycopy(new byte[]{-2, -36, -70}, 0, bArr, 0, 3);
        System.arraycopy(bArr2, 0, bArr, 3, i3);
        System.arraycopy(new byte[]{-17}, 0, bArr, paramLen + 7, 1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return byteBufferWrap.array();
    }

    public static void parseNotifyADVInfo(phb phbVar, xs0 xs0Var) {
        byte[] paramData;
        if (xs0Var == null || (paramData = xs0Var.getParamData()) == null || paramData.length < 18) {
            return;
        }
        byte[] bArr = new byte[2];
        System.arraycopy(paramData, 0, bArr, 0, 2);
        int iBytesToInt = pk1.bytesToInt(bArr[0], bArr[1]);
        System.arraycopy(paramData, 2, bArr, 0, 2);
        int iBytesToInt2 = pk1.bytesToInt(bArr[0], bArr[1]);
        System.arraycopy(paramData, 4, bArr, 0, 2);
        int iBytesToInt3 = pk1.bytesToInt(bArr[0], bArr[1]);
        byte b = paramData[6];
        byte[] bArr2 = new byte[6];
        System.arraycopy(paramData, 7, bArr2, 0, 6);
        String strHexDataCovetToAddress = hexDataCovetToAddress(bArr2);
        int iByteToInt = pk1.byteToInt(paramData[13]);
        byte b2 = paramData[14];
        int i = (b2 >> 7) & 1;
        int i2 = b2 & 127;
        byte b3 = paramData[15];
        int i3 = (b3 >> 7) & 1;
        int i4 = b3 & 127;
        byte b4 = paramData[16];
        int i5 = (b4 >> 7) & 1;
        phbVar.setVid(iBytesToInt).setUid(iBytesToInt2).setPid(iBytesToInt3).setDeviceType((b >> 4) & 255).setVersion(b & 15).setEdrAddr(strHexDataCovetToAddress).setAction(iByteToInt).setLeftCharging(i == 1).setLeftDeviceQuantity(i2).setRightCharging(i3 == 1).setRightDeviceQuantity(i4).setDeviceCharging(i5 == 1).setChargingBinQuantity(b4 & 127).setSeq(pk1.byteToInt(paramData[17]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0315, code lost:
    
        p000.dh8.m9155e(p000.qhc.f74462a, "parseTargetInfo", p000.kc2.formatString("data length[%d] over paramDataLen[%d], cast away", java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x032c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseTargetInfo(p000.cng r17, p000.xs0 r18) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qhc.parseTargetInfo(cng, xs0):void");
    }

    public static ArrayList<xs0> findPacketData(int i, byte[] bArr) {
        if (i == 0 || bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList<xs0> arrayList = new ArrayList<>();
        byte[] bArrM20371b = m20371b(bArr);
        int length = bArrM20371b.length;
        dh8.m9152d(f74462a, "findPacketData", "data : " + pk1.byte2HexStr(bArrM20371b));
        int i2 = 0;
        while (i2 < length) {
            int iM20368a = m20368a(bArrM20371b, i2, i);
            if (iM20368a < f74467f.length) {
                dh8.m9161w(f74462a, "findPacketData", "not find head data : ");
                return arrayList;
            }
            dh8.m9157i(f74462a, "findPacketData", "prefixIndex = " + iM20368a);
            int iBytesToInt = pk1.bytesToInt(bArrM20371b, iM20368a + 2, 2);
            int i3 = iBytesToInt + 4;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrM20371b, iM20368a, bArr2, 0, i3);
            xs0 xs0VarM20372c = m20372c(bArr2);
            if (xs0VarM20372c != null) {
                arrayList.add(xs0VarM20372c);
            }
            i2 = iM20368a + 4 + iBytesToInt + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static void m20370b(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= 0 || i < 0 || i2 <= 0 || i + i2 > bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[i2];
        f74468g = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        f74469h = i2;
    }

    /* JADX INFO: renamed from: a */
    private static ob2 m20369a(xs0 xs0Var, ob2 ob2Var) {
        Map<Integer, rp7> validCommandList;
        rp7 rp7Var;
        if (xs0Var == null || (validCommandList = nb2.getValidCommandList()) == null || (rp7Var = validCommandList.get(Integer.valueOf(xs0Var.getOpCode()))) == null) {
            return null;
        }
        return rp7Var.parseDataToCmd(xs0Var, ob2Var);
    }

    /* JADX INFO: renamed from: a */
    private static int m20367a(byte[] bArr) {
        if (bArr != null && bArr.length == 8) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(b & 255);
            }
            try {
                return Integer.valueOf(sb.toString(), 2).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
