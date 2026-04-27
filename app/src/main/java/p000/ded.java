package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public class ded {

    /* JADX INFO: renamed from: a */
    public static final int f29530a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f29531b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f29532c = 4;

    /* JADX INFO: renamed from: d */
    public static final int f29533d = 6;

    /* JADX INFO: renamed from: e */
    public static final int f29534e = 7;

    /* JADX INFO: renamed from: f */
    public static final byte[] f29535f = {BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f29536g = {BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, 0};

    private ded() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m9111a(@efb InputStream inputStream, @efb byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, r15.m20745d(inputStream, bArr.length))) {
            return r15.m20745d(inputStream, eed.f32759b.length);
        }
        throw r15.m20744c("Invalid magic");
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static v94[] m9112b(@efb InputStream inputStream, @efb byte[] bArr, @efb byte[] bArr2, v94[] v94VarArr) throws IOException {
        if (Arrays.equals(bArr, eed.f32763f)) {
            if (Arrays.equals(eed.f32758a, bArr2)) {
                throw r15.m20744c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m9113c(inputStream, bArr, v94VarArr);
        }
        if (Arrays.equals(bArr, eed.f32764g)) {
            return m9114d(inputStream, bArr2, v94VarArr);
        }
        throw r15.m20744c("Unsupported meta version");
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static v94[] m9113c(@efb InputStream inputStream, @efb byte[] bArr, v94[] v94VarArr) throws IOException {
        if (!Arrays.equals(bArr, eed.f32763f)) {
            throw r15.m20744c("Unsupported meta version");
        }
        int iM20751j = r15.m20751j(inputStream);
        byte[] bArrM20746e = r15.m20746e(inputStream, (int) r15.m20750i(inputStream), (int) r15.m20750i(inputStream));
        if (inputStream.read() > 0) {
            throw r15.m20744c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM20746e);
        try {
            v94[] metadataForNBody = readMetadataForNBody(byteArrayInputStream, iM20751j, v94VarArr);
            byteArrayInputStream.close();
            return metadataForNBody;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static int computeMethodFlags(@efb v94 v94Var) {
        Iterator<Map.Entry<Integer, Integer>> it = v94Var.f90368i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @efb
    private static byte[] createCompressibleBody(@efb v94[] v94VarArr, @efb byte[] bArr) throws IOException {
        int i = 0;
        int iM20752k = 0;
        for (v94 v94Var : v94VarArr) {
            iM20752k += r15.m20752k(generateDexKey(v94Var.f90360a, v94Var.f90361b, bArr)) + 16 + (v94Var.f90364e * 2) + v94Var.f90365f + getMethodBitmapStorageSize(v94Var.f90366g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM20752k);
        if (Arrays.equals(bArr, eed.f32760c)) {
            int length = v94VarArr.length;
            while (i < length) {
                v94 v94Var2 = v94VarArr[i];
                writeLineHeader(byteArrayOutputStream, v94Var2, generateDexKey(v94Var2.f90360a, v94Var2.f90361b, bArr));
                writeLineData(byteArrayOutputStream, v94Var2);
                i++;
            }
        } else {
            for (v94 v94Var3 : v94VarArr) {
                writeLineHeader(byteArrayOutputStream, v94Var3, generateDexKey(v94Var3.f90360a, v94Var3.f90361b, bArr));
            }
            int length2 = v94VarArr.length;
            while (i < length2) {
                writeLineData(byteArrayOutputStream, v94VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM20752k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw r15.m20744c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM20752k);
    }

    private static xri createCompressibleClassSection(@efb v94[] v94VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < v94VarArr.length; i2++) {
            try {
                v94 v94Var = v94VarArr[i2];
                r15.m20757p(byteArrayOutputStream, i2);
                r15.m20757p(byteArrayOutputStream, v94Var.f90364e);
                i = i + 4 + (v94Var.f90364e * 2);
                writeClasses(byteArrayOutputStream, v94Var);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            xri xriVar = new xri(ft5.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return xriVar;
        }
        throw r15.m20744c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static xri createCompressibleMethodsSection(@efb v94[] v94VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < v94VarArr.length; i2++) {
            try {
                v94 v94Var = v94VarArr[i2];
                int iComputeMethodFlags = computeMethodFlags(v94Var);
                byte[] bArrCreateMethodBitmapRegion = createMethodBitmapRegion(v94Var);
                byte[] bArrCreateMethodsWithInlineCaches = createMethodsWithInlineCaches(v94Var);
                r15.m20757p(byteArrayOutputStream, i2);
                int length = bArrCreateMethodBitmapRegion.length + 2 + bArrCreateMethodsWithInlineCaches.length;
                r15.m20758q(byteArrayOutputStream, length);
                r15.m20757p(byteArrayOutputStream, iComputeMethodFlags);
                byteArrayOutputStream.write(bArrCreateMethodBitmapRegion);
                byteArrayOutputStream.write(bArrCreateMethodsWithInlineCaches);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            xri xriVar = new xri(ft5.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return xriVar;
        }
        throw r15.m20744c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static byte[] createMethodBitmapRegion(@efb v94 v94Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodBitmap(byteArrayOutputStream, v94Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] createMethodsWithInlineCaches(@efb v94 v94Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodsWithInlineCaches(byteArrayOutputStream, v94Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @efb
    /* JADX INFO: renamed from: d */
    public static v94[] m9114d(@efb InputStream inputStream, @efb byte[] bArr, v94[] v94VarArr) throws IOException {
        int iM20749h = r15.m20749h(inputStream);
        byte[] bArrM20746e = r15.m20746e(inputStream, (int) r15.m20750i(inputStream), (int) r15.m20750i(inputStream));
        if (inputStream.read() > 0) {
            throw r15.m20744c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM20746e);
        try {
            v94[] metadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr, iM20749h, v94VarArr);
            byteArrayInputStream.close();
            return metadataV002Body;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @efb
    /* JADX INFO: renamed from: e */
    public static v94[] m9115e(@efb InputStream inputStream, @efb byte[] bArr, @efb String str) throws IOException {
        if (!Arrays.equals(bArr, eed.f32759b)) {
            throw r15.m20744c("Unsupported version");
        }
        int iM20751j = r15.m20751j(inputStream);
        byte[] bArrM20746e = r15.m20746e(inputStream, (int) r15.m20750i(inputStream), (int) r15.m20750i(inputStream));
        if (inputStream.read() > 0) {
            throw r15.m20744c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM20746e);
        try {
            v94[] uncompressedBody = readUncompressedBody(byteArrayInputStream, str, iM20751j);
            byteArrayInputStream.close();
            return uncompressedBody;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @efb
    private static String enforceSeparator(@efb String str, @efb String str2) {
        return "!".equals(str2) ? str.replace(g1i.f38277c, "!") : g1i.f38277c.equals(str2) ? str.replace("!", g1i.f38277c) : str;
    }

    @efb
    private static String extractKey(@efb String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(g1i.f38277c);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9116f(@efb OutputStream outputStream, @efb byte[] bArr, @efb v94[] v94VarArr) throws IOException {
        if (Arrays.equals(bArr, eed.f32758a)) {
            writeProfileForS(outputStream, v94VarArr);
            return true;
        }
        if (Arrays.equals(bArr, eed.f32759b)) {
            writeProfileForP(outputStream, v94VarArr);
            return true;
        }
        if (Arrays.equals(bArr, eed.f32761d)) {
            writeProfileForO(outputStream, v94VarArr);
            return true;
        }
        if (Arrays.equals(bArr, eed.f32760c)) {
            writeProfileForO_MR1(outputStream, v94VarArr);
            return true;
        }
        if (!Arrays.equals(bArr, eed.f32762e)) {
            return false;
        }
        writeProfileForN(outputStream, v94VarArr);
        return true;
    }

    @hib
    private static v94 findByDexName(@efb v94[] v94VarArr, @efb String str) {
        if (v94VarArr.length <= 0) {
            return null;
        }
        String strExtractKey = extractKey(str);
        for (int i = 0; i < v94VarArr.length; i++) {
            if (v94VarArr[i].f90361b.equals(strExtractKey)) {
                return v94VarArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m9117g(@efb OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f29535f);
        outputStream.write(bArr);
    }

    @efb
    private static String generateDexKey(@efb String str, @efb String str2, @efb byte[] bArr) {
        String strM9904a = eed.m9904a(bArr);
        if (str.length() <= 0) {
            return enforceSeparator(str2, strM9904a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(g1i.f38277c)) {
            return enforceSeparator(str2, strM9904a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + eed.m9904a(bArr) + str2;
    }

    private static int getMethodBitmapStorageSize(int i) {
        return roundUpToByte(i * 2) / 8;
    }

    private static int methodFlagBitmapIndex(int i, int i2, int i3) {
        if (i == 1) {
            throw r15.m20744c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw r15.m20744c("Unexpected flag: " + i);
    }

    private static int[] readClasses(@efb InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iM20749h = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM20749h += r15.m20749h(inputStream);
            iArr[i2] = iM20749h;
        }
        return iArr;
    }

    private static int readFlagsFromBitmap(@efb BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(methodFlagBitmapIndex(2, i, i2)) ? 2 : 0;
        return bitSet.get(methodFlagBitmapIndex(4, i, i2)) ? i3 | 4 : i3;
    }

    private static void readHotMethodRegion(@efb InputStream inputStream, @efb v94 v94Var) throws IOException {
        int iAvailable = inputStream.available() - v94Var.f90365f;
        int iM20749h = 0;
        while (inputStream.available() > iAvailable) {
            iM20749h += r15.m20749h(inputStream);
            v94Var.f90368i.put(Integer.valueOf(iM20749h), 1);
            for (int iM20749h2 = r15.m20749h(inputStream); iM20749h2 > 0; iM20749h2--) {
                skipInlineCache(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw r15.m20744c("Read too much data during profile line parse");
        }
    }

    @efb
    private static v94[] readMetadataForNBody(@efb InputStream inputStream, int i, v94[] v94VarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new v94[0];
        }
        if (i != v94VarArr.length) {
            throw r15.m20744c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM20749h = r15.m20749h(inputStream);
            iArr[i2] = r15.m20749h(inputStream);
            strArr[i2] = r15.m20747f(inputStream, iM20749h);
        }
        for (int i3 = 0; i3 < i; i3++) {
            v94 v94Var = v94VarArr[i3];
            if (!v94Var.f90361b.equals(strArr[i3])) {
                throw r15.m20744c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            v94Var.f90364e = i4;
            v94Var.f90367h = readClasses(inputStream, i4);
        }
        return v94VarArr;
    }

    @efb
    private static v94[] readMetadataV002Body(@efb InputStream inputStream, @efb byte[] bArr, int i, v94[] v94VarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new v94[0];
        }
        if (i != v94VarArr.length) {
            throw r15.m20744c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            r15.m20749h(inputStream);
            String strM20747f = r15.m20747f(inputStream, r15.m20749h(inputStream));
            long jM20750i = r15.m20750i(inputStream);
            int iM20749h = r15.m20749h(inputStream);
            v94 v94VarFindByDexName = findByDexName(v94VarArr, strM20747f);
            if (v94VarFindByDexName == null) {
                throw r15.m20744c("Missing profile key: " + strM20747f);
            }
            v94VarFindByDexName.f90363d = jM20750i;
            int[] classes = readClasses(inputStream, iM20749h);
            if (Arrays.equals(bArr, eed.f32762e)) {
                v94VarFindByDexName.f90364e = iM20749h;
                v94VarFindByDexName.f90367h = classes;
            }
        }
        return v94VarArr;
    }

    private static void readMethodBitmap(@efb InputStream inputStream, @efb v94 v94Var) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(r15.m20745d(inputStream, r15.m20742a(v94Var.f90366g * 2)));
        int i = 0;
        while (true) {
            int i2 = v94Var.f90366g;
            if (i >= i2) {
                return;
            }
            int flagsFromBitmap = readFlagsFromBitmap(bitSetValueOf, i, i2);
            if (flagsFromBitmap != 0) {
                Integer num = v94Var.f90368i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                v94Var.f90368i.put(Integer.valueOf(i), Integer.valueOf(flagsFromBitmap | num.intValue()));
            }
            i++;
        }
    }

    @efb
    private static v94[] readUncompressedBody(@efb InputStream inputStream, @efb String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new v94[0];
        }
        v94[] v94VarArr = new v94[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM20749h = r15.m20749h(inputStream);
            int iM20749h2 = r15.m20749h(inputStream);
            v94VarArr[i2] = new v94(str, r15.m20747f(inputStream, iM20749h), r15.m20750i(inputStream), 0L, iM20749h2, (int) r15.m20750i(inputStream), (int) r15.m20750i(inputStream), new int[iM20749h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            v94 v94Var = v94VarArr[i3];
            readHotMethodRegion(inputStream, v94Var);
            v94Var.f90367h = readClasses(inputStream, v94Var.f90364e);
            readMethodBitmap(inputStream, v94Var);
        }
        return v94VarArr;
    }

    private static int roundUpToByte(int i) {
        return (i + 7) & (-8);
    }

    private static void setMethodBitmapBit(@efb byte[] bArr, int i, int i2, @efb v94 v94Var) {
        int iMethodFlagBitmapIndex = methodFlagBitmapIndex(i, i2, v94Var.f90366g);
        int i3 = iMethodFlagBitmapIndex / 8;
        bArr[i3] = (byte) ((1 << (iMethodFlagBitmapIndex % 8)) | bArr[i3]);
    }

    private static void skipInlineCache(@efb InputStream inputStream) throws IOException {
        r15.m20749h(inputStream);
        int iM20751j = r15.m20751j(inputStream);
        if (iM20751j == 6 || iM20751j == 7) {
            return;
        }
        while (iM20751j > 0) {
            r15.m20751j(inputStream);
            for (int iM20751j2 = r15.m20751j(inputStream); iM20751j2 > 0; iM20751j2--) {
                r15.m20749h(inputStream);
            }
            iM20751j--;
        }
    }

    private static void writeClasses(@efb OutputStream outputStream, @efb v94 v94Var) throws IOException {
        int[] iArr = v94Var.f90367h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            r15.m20757p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    private static xri writeDexFileSection(@efb v94[] v94VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            r15.m20757p(byteArrayOutputStream, v94VarArr.length);
            int i = 2;
            for (v94 v94Var : v94VarArr) {
                r15.m20758q(byteArrayOutputStream, v94Var.f90362c);
                r15.m20758q(byteArrayOutputStream, v94Var.f90363d);
                r15.m20758q(byteArrayOutputStream, v94Var.f90366g);
                String strGenerateDexKey = generateDexKey(v94Var.f90360a, v94Var.f90361b, eed.f32758a);
                int iM20752k = r15.m20752k(strGenerateDexKey);
                r15.m20757p(byteArrayOutputStream, iM20752k);
                i = i + 14 + iM20752k;
                r15.m20755n(byteArrayOutputStream, strGenerateDexKey);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                xri xriVar = new xri(ft5.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return xriVar;
            }
            throw r15.m20744c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeLineData(@efb OutputStream outputStream, @efb v94 v94Var) throws IOException {
        writeMethodsWithInlineCaches(outputStream, v94Var);
        writeClasses(outputStream, v94Var);
        writeMethodBitmap(outputStream, v94Var);
    }

    private static void writeLineHeader(@efb OutputStream outputStream, @efb v94 v94Var, @efb String str) throws IOException {
        r15.m20757p(outputStream, r15.m20752k(str));
        r15.m20757p(outputStream, v94Var.f90364e);
        r15.m20758q(outputStream, v94Var.f90365f);
        r15.m20758q(outputStream, v94Var.f90362c);
        r15.m20758q(outputStream, v94Var.f90366g);
        r15.m20755n(outputStream, str);
    }

    private static void writeMethodBitmap(@efb OutputStream outputStream, @efb v94 v94Var) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(v94Var.f90366g)];
        for (Map.Entry<Integer, Integer> entry : v94Var.f90368i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, iIntValue, v94Var);
            }
            if ((iIntValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, iIntValue, v94Var);
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(@efb OutputStream outputStream, @efb v94 v94Var) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : v94Var.f90368i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                r15.m20757p(outputStream, iIntValue - i);
                r15.m20757p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    private static void writeProfileForN(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        r15.m20757p(outputStream, v94VarArr.length);
        for (v94 v94Var : v94VarArr) {
            String strGenerateDexKey = generateDexKey(v94Var.f90360a, v94Var.f90361b, eed.f32762e);
            r15.m20757p(outputStream, r15.m20752k(strGenerateDexKey));
            r15.m20757p(outputStream, v94Var.f90368i.size());
            r15.m20757p(outputStream, v94Var.f90367h.length);
            r15.m20758q(outputStream, v94Var.f90362c);
            r15.m20755n(outputStream, strGenerateDexKey);
            Iterator<Integer> it = v94Var.f90368i.keySet().iterator();
            while (it.hasNext()) {
                r15.m20757p(outputStream, it.next().intValue());
            }
            for (int i : v94Var.f90367h) {
                r15.m20757p(outputStream, i);
            }
        }
    }

    private static void writeProfileForO(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        r15.m20759r(outputStream, v94VarArr.length);
        for (v94 v94Var : v94VarArr) {
            int size = v94Var.f90368i.size() * 4;
            String strGenerateDexKey = generateDexKey(v94Var.f90360a, v94Var.f90361b, eed.f32761d);
            r15.m20757p(outputStream, r15.m20752k(strGenerateDexKey));
            r15.m20757p(outputStream, v94Var.f90367h.length);
            r15.m20758q(outputStream, size);
            r15.m20758q(outputStream, v94Var.f90362c);
            r15.m20755n(outputStream, strGenerateDexKey);
            Iterator<Integer> it = v94Var.f90368i.keySet().iterator();
            while (it.hasNext()) {
                r15.m20757p(outputStream, it.next().intValue());
                r15.m20757p(outputStream, 0);
            }
            for (int i : v94Var.f90367h) {
                r15.m20757p(outputStream, i);
            }
        }
    }

    private static void writeProfileForO_MR1(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        byte[] bArrCreateCompressibleBody = createCompressibleBody(v94VarArr, eed.f32760c);
        r15.m20759r(outputStream, v94VarArr.length);
        r15.m20754m(outputStream, bArrCreateCompressibleBody);
    }

    private static void writeProfileForP(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        byte[] bArrCreateCompressibleBody = createCompressibleBody(v94VarArr, eed.f32759b);
        r15.m20759r(outputStream, v94VarArr.length);
        r15.m20754m(outputStream, bArrCreateCompressibleBody);
    }

    private static void writeProfileForS(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        writeProfileSections(outputStream, v94VarArr);
    }

    private static void writeProfileSections(@efb OutputStream outputStream, @efb v94[] v94VarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(writeDexFileSection(v94VarArr));
        arrayList.add(createCompressibleClassSection(v94VarArr));
        arrayList.add(createCompressibleMethodsSection(v94VarArr));
        long length2 = ((long) eed.f32758a.length) + ((long) f29535f.length) + 4 + ((long) (arrayList.size() * 16));
        r15.m20758q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            xri xriVar = (xri) arrayList.get(i);
            r15.m20758q(outputStream, xriVar.f99079a.getValue());
            r15.m20758q(outputStream, length2);
            if (xriVar.f99082d) {
                byte[] bArr = xriVar.f99081c;
                long length3 = bArr.length;
                byte[] bArrM20743b = r15.m20743b(bArr);
                arrayList2.add(bArrM20743b);
                r15.m20758q(outputStream, bArrM20743b.length);
                r15.m20758q(outputStream, length3);
                length = bArrM20743b.length;
            } else {
                arrayList2.add(xriVar.f99081c);
                r15.m20758q(outputStream, xriVar.f99081c.length);
                r15.m20758q(outputStream, 0L);
                length = xriVar.f99081c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }
}
