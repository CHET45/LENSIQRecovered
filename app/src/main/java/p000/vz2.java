package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.blankj.utilcode.util.C2481n;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vz2 {

    /* JADX INFO: renamed from: a */
    public static final int f92861a = 8192;

    /* JADX INFO: renamed from: b */
    public static final char[] f92862b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82030t, 'B', sjc.f82022l, 'D', 'E', 'F'};

    /* JADX INFO: renamed from: c */
    public static final char[] f92863c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82029s, 'b', sjc.f82021k, 'd', 'e', 'f'};

    private vz2() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return C2481n.m4294e(bitmap);
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        return C2481n.m4300g(bitmap);
    }

    public static byte[] bits2Bytes(String str) {
        int length = str.length() % 8;
        int length2 = str.length() / 8;
        if (length != 0) {
            while (length < 8) {
                str = a43.f347l + str;
                length++;
            }
            length2++;
        }
        byte[] bArr = new byte[length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                byte b = (byte) (bArr[i] << 1);
                bArr[i] = b;
                bArr[i] = (byte) (b | (str.charAt((i * 8) + i2) - '0'));
            }
        }
        return bArr;
    }

    @igg({"DefaultLocale"})
    public static String byte2FitMemorySize(long j) {
        return byte2FitMemorySize(j, 3);
    }

    public static double byte2MemorySize(long j, int i) {
        if (j < 0) {
            return -1.0d;
        }
        return j / ((double) i);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        return C2481n.m4305i(bArr);
    }

    public static String bytes2Bits(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            for (int i = 7; i >= 0; i--) {
                sb.append(((b >> i) & 1) == 0 ? '0' : '1');
            }
        }
        return sb.toString();
    }

    public static char[] bytes2Chars(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return C2481n.m4307j(bArr);
    }

    public static String bytes2HexString(byte[] bArr) {
        return bytes2HexString(bArr, true);
    }

    public static InputStream bytes2InputStream(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    public static JSONArray bytes2JSONArray(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONArray(new String(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject bytes2JSONObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONObject(new String(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bytes2Object(byte[] r3) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r3 = r1.readObject()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r1.close()     // Catch: java.io.IOException -> L16
            goto L1a
        L16:
            r0 = move-exception
            r0.printStackTrace()
        L1a:
            return r3
        L1b:
            r3 = move-exception
            r0 = r1
            goto L32
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r3 = move-exception
            goto L32
        L22:
            r3 = move-exception
            r1 = r0
        L24:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r3 = move-exception
            r3.printStackTrace()
        L31:
            return r0
        L32:
            if (r0 == 0) goto L3c
            r0.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r0 = move-exception
            r0.printStackTrace()
        L3c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vz2.bytes2Object(byte[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    public static OutputStream bytes2OutputStream(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r0 = 0;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length > 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException e) {
                        e = e;
                        byteArrayOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r0 != 0) {
                            try {
                                r0.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    try {
                        byteArrayOutputStream.write(bArr);
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return byteArrayOutputStream;
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = length;
            }
        }
        return null;
    }

    public static <T> T bytes2Parcelable(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static String bytes2String(byte[] bArr) {
        return bytes2String(bArr, "");
    }

    public static byte[] chars2Bytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return null;
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static int dp2px(float f) {
        return C2481n.m4331v(f);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        return C2481n.m4333w(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable) {
        return C2481n.m4335x(drawable);
    }

    private static String getSafeCharset(String str) {
        return (C2481n.m4235C0(str) || !Charset.isSupported(str)) ? "UTF-8" : str;
    }

    private static int hex2Dec(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c < 'A' || c > 'F') {
            throw new IllegalArgumentException();
        }
        return c - '7';
    }

    public static byte[] hexString2Bytes(String str) {
        if (C2481n.m4235C0(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = a43.f347l + str;
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            bArr[i >> 1] = (byte) ((hex2Dec(charArray[i]) << 4) | hex2Dec(charArray[i + 1]));
        }
        return bArr;
    }

    public static int hexString2Int(String str) {
        return Integer.parseInt(str, 16);
    }

    public static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                }
                return byteArrayOutputStream;
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    public static byte[] inputStream2Bytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return input2OutputStream(inputStream).toByteArray();
    }

    public static List<String> inputStream2Lines(InputStream inputStream) {
        return inputStream2Lines(inputStream, "");
    }

    public static String inputStream2String(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStreamInput2OutputStream = input2OutputStream(inputStream);
            return byteArrayOutputStreamInput2OutputStream == null ? "" : byteArrayOutputStreamInput2OutputStream.toString(getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String int2HexString(int i) {
        return Integer.toHexString(i);
    }

    public static byte[] jsonArray2Bytes(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toString().getBytes();
    }

    public static byte[] jsonObject2Bytes(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString().getBytes();
    }

    public static long memorySize2Byte(long j, int i) {
        if (j < 0) {
            return -1L;
        }
        return j * ((long) i);
    }

    public static String millis2FitTimeSpan(long j, int i) {
        return C2481n.m4245H0(j, i);
    }

    public static long millis2TimeSpan(long j, int i) {
        return j / ((long) i);
    }

    public static ByteArrayInputStream output2InputStream(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
    }

    public static byte[] outputStream2Bytes(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return ((ByteArrayOutputStream) outputStream).toByteArray();
    }

    public static String outputStream2String(OutputStream outputStream, String str) {
        if (outputStream == null) {
            return "";
        }
        try {
            return new String(outputStream2Bytes(outputStream), getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] parcelable2Bytes(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int px2dp(float f) {
        return C2481n.m4253L0(f);
    }

    public static int px2sp(float f) {
        return C2481n.m4255M0(f);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:13:0x001f */
    public static byte[] serializable2Bytes(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream3 = null;
        try {
            if (serializable == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Exception e) {
                e = e;
                objectOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream3 != null) {
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                objectOutputStream2.writeObject(serializable);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    objectOutputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return byteArray;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream3 = objectOutputStream;
        }
    }

    public static int sp2px(float f) {
        return C2481n.m4273V0(f);
    }

    public static byte[] string2Bytes(String str) {
        return string2Bytes(str, "");
    }

    public static InputStream string2InputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new ByteArrayInputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static OutputStream string2OutputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return bytes2OutputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long timeSpan2Millis(long j, int i) {
        return j * ((long) i);
    }

    public static Bitmap view2Bitmap(View view) {
        return C2481n.m4293d1(view);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        return C2481n.m4297f(bitmap, compressFormat, i);
    }

    @igg({"DefaultLocale"})
    public static String byte2FitMemorySize(long j, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("precision shouldn't be less than zero!");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j < 1024) {
            return String.format("%." + i + "fB", Double.valueOf(j));
        }
        if (j < 1048576) {
            return String.format("%." + i + "fKB", Double.valueOf(j / 1024.0d));
        }
        if (j < 1073741824) {
            return String.format("%." + i + "fMB", Double.valueOf(j / 1048576.0d));
        }
        return String.format("%." + i + "fGB", Double.valueOf(j / 1.073741824E9d));
    }

    public static String bytes2HexString(byte[] bArr, boolean z) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z ? f92862b : f92863c;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static String bytes2String(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new String(bArr);
        }
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i) {
        return C2481n.m4337y(drawable, compressFormat, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> inputStream2Lines(java.io.InputStream r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.lang.String r5 = getSafeCharset(r5)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
        L14:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            if (r4 == 0) goto L23
            r1.add(r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            goto L14
        L1e:
            r4 = move-exception
            r0 = r2
            goto L3e
        L21:
            r4 = move-exception
            goto L30
        L23:
            r2.close()     // Catch: java.io.IOException -> L27
            goto L2b
        L27:
            r4 = move-exception
            r4.printStackTrace()
        L2b:
            return r1
        L2c:
            r4 = move-exception
            goto L3e
        L2e:
            r4 = move-exception
            r2 = r0
        L30:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r4 = move-exception
            r4.printStackTrace()
        L3d:
            return r0
        L3e:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r5 = move-exception
            r5.printStackTrace()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vz2.inputStream2Lines(java.io.InputStream, java.lang.String):java.util.List");
    }

    public static byte[] string2Bytes(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(getSafeCharset(str2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str.getBytes();
        }
    }
}
