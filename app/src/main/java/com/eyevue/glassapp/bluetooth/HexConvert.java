package com.eyevue.glassapp.bluetooth;

import android.text.TextUtils;
import android.util.SparseArray;
import com.blankj.utilcode.util.C2473f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class HexConvert {
    private static final char[] mChars = "0123456789ABCDEF".toCharArray();
    private static final String mHexStr = "0123456789ABCDEF";

    public static String byte2HexStr(byte[] b) {
        return b == null ? "" : byte2HexStr(b, b.length);
    }

    public static String byte2String(byte[] b, int len) {
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(String.valueOf((int) b[i]));
        }
        return sb.toString();
    }

    public static String byteToBit(byte b) {
        return "" + ((int) ((byte) ((b >> 7) & 1))) + ((int) ((byte) ((b >> 6) & 1))) + ((int) ((byte) ((b >> 5) & 1))) + ((int) ((byte) ((b >> 4) & 1))) + ((int) ((byte) ((b >> 3) & 1))) + ((int) ((byte) ((b >> 2) & 1))) + ((int) ((byte) ((b >> 1) & 1))) + ((int) ((byte) (b & 1)));
    }

    public static String byteToHexString(byte b) {
        return intToHexString(b & 255);
    }

    public static int byteToInt(byte b) {
        return b & 255;
    }

    public static int bytesToInt(byte h, byte l) {
        return ((h & 255) << 8) + (l & 255);
    }

    public static long bytesToLong(byte[] data, int start, int len) {
        long j = 0;
        int i = 0;
        int i2 = start;
        while (i2 < start + len) {
            j |= (((long) data[i2]) & 255) << (((len - 1) - i) * 8);
            i2++;
            i++;
        }
        return j;
    }

    public static short bytesToShort(byte h, byte l) {
        return (short) bytesToInt(h, l);
    }

    public static String bytesToStr(byte[] data) {
        return data == null ? "" : hexStr2Str(byte2HexStr(data, data.length));
    }

    public static boolean checkBitValue(byte value, int bit) {
        return ((value >> bit) & 1) == 1;
    }

    public static boolean checkHexStr(String sHex) {
        String upperCase;
        int length;
        if (sHex == null || (length = (upperCase = sHex.trim().replace(C2473f.f17566z, "").toUpperCase(Locale.US)).length()) <= 1 || length % 2 != 0) {
            return false;
        }
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!"0123456789ABCDEF".contains(upperCase.substring(i, i2))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static List<Integer> convertArray2List(byte[] bytes) {
        ArrayList arrayList = new ArrayList();
        for (byte b : bytes) {
            arrayList.add(Integer.valueOf(b & 255));
        }
        return arrayList;
    }

    public static byte[] convertList2Array(List<Integer> list) {
        if (list.isEmpty()) {
            return new byte[0];
        }
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get(i).byteValue();
        }
        return bArr;
    }

    public static byte decodeBinaryString(String byteStr) {
        if (byteStr == null) {
            return (byte) 0;
        }
        int length = byteStr.length();
        if (length != 4 && length != 8) {
            return (byte) 0;
        }
        int i = (length != 8 || byteStr.charAt(0) == '0') ? Integer.parseInt(byteStr, 2) : Integer.parseInt(byteStr, 2) - 256;
        return (byte) i;
    }

    public static byte decodeHexChar(char hChar, char lChar) {
        String strHexChar2BinaryString = hexChar2BinaryString(hChar);
        String strHexChar2BinaryString2 = hexChar2BinaryString(lChar);
        if (TextUtils.isEmpty(strHexChar2BinaryString)) {
            strHexChar2BinaryString = "";
        }
        if (!TextUtils.isEmpty(strHexChar2BinaryString2)) {
            strHexChar2BinaryString = strHexChar2BinaryString + strHexChar2BinaryString2;
        }
        if (TextUtils.isEmpty(strHexChar2BinaryString)) {
            return (byte) 0;
        }
        return decodeBinaryString(strHexChar2BinaryString);
    }

    public static int getBitByPosition(int src, int pos) {
        if (pos < 0 || pos >= 32) {
            return 0;
        }
        return (src >> pos) & 1;
    }

    public static byte[] getBooleanArray(byte b) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return bArr;
    }

    public static byte[] getBooleanArrayBig(byte b) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return bArr;
    }

    private static String hexChar2BinaryString(char src) {
        return src == '0' ? "0000" : src == '1' ? "0001" : src == '2' ? "0010" : src == '3' ? "0011" : src == '4' ? "0100" : src == '5' ? "0101" : src == '6' ? "0110" : src == '7' ? "0111" : src == '8' ? "1000" : src == '9' ? "1001" : (src == 'A' || src == 'a') ? "1010" : (src == 'B' || src == 'b') ? "1011" : (src == 'C' || src == 'c') ? "1100" : (src == 'D' || src == 'd') ? "1101" : (src == 'E' || src == 'e') ? "1110" : (src == 'F' || src == 'f') ? "1111" : "";
    }

    public static byte[] hexStr2Bytes(String src) {
        if (src == null) {
            return null;
        }
        String upperCase = src.trim().replace(C2473f.f17566z, "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) (Integer.decode("0x" + upperCase.substring(i2, i3) + upperCase.substring(i3, i2 + 2)).intValue() & 255);
        }
        return bArr;
    }

    public static String hexStr2Str(String hexStr) {
        if (hexStr == null) {
            return null;
        }
        String upperCase = hexStr.trim().replace(C2473f.f17566z, "").toUpperCase(Locale.US);
        char[] charArray = upperCase.toCharArray();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (("0123456789ABCDEF".indexOf(charArray[i2 + 1]) | ("0123456789ABCDEF".indexOf(charArray[i2]) << 4)) & 255);
        }
        try {
            return new String(bArr, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String int2HexStr(int[] b, int iLen) {
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iLen; i++) {
            char[] cArr = mChars;
            sb.append(cArr[(((byte) b[i]) & 255) >> 4]);
            sb.append(cArr[((byte) b[i]) & 15]);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static byte[] int2byte2(int res) {
        return new byte[]{(byte) ((res >> 8) & 255), (byte) (res & 255)};
    }

    public static byte[] intToBigBytes(int n) {
        return new byte[]{(byte) ((n >> 24) & 255), (byte) ((n >> 16) & 255), (byte) ((n >> 8) & 255), (byte) (n & 255)};
    }

    public static byte intToByte(int num) {
        return (byte) num;
    }

    public static byte[] intToBytes(int n) {
        return new byte[]{(byte) (n & 255), (byte) ((n >> 8) & 255), (byte) ((n >> 16) & 255), (byte) ((n >> 24) & 255)};
    }

    public static String intToHexString(int num) {
        return String.format(Locale.ENGLISH, "%02x", Integer.valueOf(num));
    }

    public static boolean readBitValue(int value, int bit) {
        return ((value >> bit) & 1) == 1;
    }

    public static byte setBitValue(byte value, int bit, boolean result) {
        int i = 1 << bit;
        return (byte) (result ? value | i : value & (~i));
    }

    public static byte[] shortToBigBytes(short n) {
        return new byte[]{(byte) ((n >> 8) & 255), (byte) (n & 255)};
    }

    public static byte[] shortToBytes(short n) {
        return new byte[]{(byte) (n & 255), (byte) ((n >> 8) & 255)};
    }

    public static byte[] sparseArrayToBytes(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            return null;
        }
        int length = 0;
        for (int i = 0; i < sparseArray.size(); i++) {
            byte[] bArrValueAt = sparseArray.valueAt(i);
            if (bArrValueAt != null) {
                length += bArrValueAt.length;
            }
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            byte[] bArrValueAt2 = sparseArray.valueAt(i2);
            if (bArrValueAt2 != null) {
                System.arraycopy(bArrValueAt2, 0, bArr, length2, bArrValueAt2.length);
                length2 += bArrValueAt2.length;
            }
        }
        return bArr;
    }

    public static String str2HexStr(String str) {
        byte[] bytes = null;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            bytes = str.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (bytes == null) {
            return "";
        }
        for (byte b : bytes) {
            char[] cArr = mChars;
            sb.append(cArr[(b & 255) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString().trim();
    }

    public static String strToUnicode(String strText) {
        if (strText == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strText.length(); i++) {
            char cCharAt = strText.charAt(i);
            String hexString = Integer.toHexString(cCharAt);
            if (cCharAt > 128) {
                sb.append("\\u");
            } else {
                sb.append("\\u00");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String unicodeToString(String hex) {
        if (hex == null) {
            return null;
        }
        int length = hex.length() / 6;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i * 6;
            i++;
            String strSubstring = hex.substring(i2, i * 6);
            sb.append(new String(Character.toChars(Integer.valueOf(strSubstring.substring(4), 16).intValue() | (Integer.valueOf(strSubstring.substring(2, 4), 16).intValue() << 8))));
        }
        return sb.toString();
    }

    public static int writeBitValue(int value, int bit, boolean result) {
        int i = 1 << bit;
        return result ? value | i : value & (~i);
    }

    public static String byte2HexStr(byte[] b, int iLen) {
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iLen; i++) {
            char[] cArr = mChars;
            sb.append(cArr[(b[i] & 255) >> 4]);
            sb.append(cArr[b[i] & 15]);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static int bytesToInt(byte[] data, int start, int len) {
        if (len == 4) {
            byte[] bArr = new byte[4];
            System.arraycopy(data, start, bArr, 0, len);
            return bytesToInt(bArr);
        }
        if (len == 2) {
            return bytesToInt(data[start], data[start + 1]);
        }
        return 0;
    }

    public static short bytesToShort(byte[] data, int start) {
        return (short) bytesToInt(data, start, 2);
    }

    public static int bytesToInt(byte[] value) {
        if (value == null || value.length < 4) {
            return 0;
        }
        return ((value[0] & 255) << 24) | ((value[1] & 255) << 16) | ((value[2] & 255) << 8) | (value[3] & 255);
    }
}
