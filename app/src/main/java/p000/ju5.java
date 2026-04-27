package p000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public class ju5 extends hu5 {
    public static final void appendBytes(@yfb File file, @yfb byte[] bArr) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            bth bthVar = bth.f14751a;
            u52.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void appendText(@yfb File file, @yfb String str, @yfb Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "text");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            writeTextImpl(fileOutputStream, str, charset);
            bth bthVar = bth.f14751a;
            u52.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        appendText(file, str, charset);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BufferedReader m14331b(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = xw1.f99524b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    @t28
    private static final BufferedReader bufferedReader(File file, Charset charset, int i) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    @t28
    private static final BufferedWriter bufferedWriter(File file, Charset charset, int i) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    @yfb
    public static ByteBuffer byteBufferForEncoding(int i, @yfb CharsetEncoder charsetEncoder) {
        md8.checkNotNullParameter(charsetEncoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        md8.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BufferedWriter m14332c(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = xw1.f99524b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PrintWriter m14333d(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InputStreamReader m14334e(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ OutputStreamWriter m14335f(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void forEachBlock(@yfb File file, @yfb gz6<? super byte[], ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        forEachBlock(file, 4096, gz6Var);
    }

    public static final void forEachLine(@yfb File file, @yfb Charset charset, @yfb qy6<? super String, bth> qy6Var) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "action");
        wvg.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), qy6Var);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        forEachLine(file, charset, qy6Var);
    }

    @t28
    private static final FileInputStream inputStream(File file) {
        md8.checkNotNullParameter(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder newReplaceEncoder(@yfb Charset charset) {
        md8.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @t28
    private static final FileOutputStream outputStream(File file) {
        md8.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file);
    }

    @t28
    private static final PrintWriter printWriter(File file, Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @yfb
    public static byte[] readBytes(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyInto = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyInto, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i3);
                md8.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    oi5 oi5Var = new oi5(8193);
                    oi5Var.write(i5);
                    uj1.copyTo$default(fileInputStream, oi5Var, 0, 2, null);
                    int size = oi5Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = oi5Var.getBuffer();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = u70.copyInto(buffer, bArrCopyOf, i, 0, oi5Var.size());
                }
            }
            u52.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    @yfb
    public static final List<String> readLines(@yfb File file, @yfb Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        final ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new qy6() { // from class: iu5
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ju5.readLines$lambda$9$FilesKt__FileReadWriteKt(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        return readLines(file, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth readLines$lambda$9$FilesKt__FileReadWriteKt(ArrayList arrayList, String str) {
        md8.checkNotNullParameter(str, "it");
        arrayList.add(str);
        return bth.f14751a;
    }

    @yfb
    public static final String readText(@yfb File file, @yfb Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String text = wvg.readText(inputStreamReader);
            u52.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        return readText(file, charset);
    }

    @t28
    private static final InputStreamReader reader(File file, Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T useLines(@yfb File file, @yfb Charset charset, @yfb qy6<? super vye<String>, ? extends T> qy6Var) throws IOException {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = qy6Var.invoke(wvg.lineSequence(bufferedReader));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, qy6 qy6Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = qy6Var.invoke(wvg.lineSequence(bufferedReader));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            o28.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static void writeBytes(@yfb File file, @yfb byte[] bArr) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            bth bthVar = bth.f14751a;
            u52.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void writeText(@yfb File file, @yfb String str, @yfb Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(str, "text");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, str, charset);
            bth bthVar = bth.f14751a;
            u52.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        writeText(file, str, charset);
    }

    public static void writeTextImpl(@yfb OutputStream outputStream, @yfb String str, @yfb Charset charset) throws IOException {
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(str, "text");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        md8.checkNotNull(charsetEncoderNewReplaceEncoder);
        ByteBuffer byteBufferByteBufferForEncoding = byteBufferForEncoding(8192, charsetEncoderNewReplaceEncoder);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            md8.checkNotNullExpressionValue(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderNewReplaceEncoder.encode(charBufferAllocate, byteBufferByteBufferForEncoding, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferByteBufferForEncoding.clear();
            i = i3;
        }
    }

    @t28
    private static final OutputStreamWriter writer(File file, Charset charset) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(@yfb File file, int i, @yfb gz6<? super byte[], ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        ?? r2 = new byte[kpd.coerceAtLeast(i, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(r2);
                if (i2 <= 0) {
                    bth bthVar = bth.f14751a;
                    u52.closeFinally(fileInputStream, null);
                    return;
                }
                gz6Var.invoke(r2, Integer.valueOf(i2));
            } finally {
            }
        }
    }
}
