package p000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,346:1\n1#2:347\n1#2:349\n57#3:348\n1317#4,2:350\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n219#1:349\n219#1:348\n219#1:350,2\n*E\n"})
public class lkc {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Path m16198a(Path path, vye vyeVar, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(vyeVar, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        Path pathWrite = Files.write(path, vze.asIterable(vyeVar), charset, StandardOpenOption.APPEND);
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final void appendBytes(Path path, byte[] bArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(bArr, "array");
        Files.write(path, bArr, StandardOpenOption.APPEND);
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path appendLines(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(iterable, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        Path pathWrite = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static final void appendText(@yfb Path path, @yfb CharSequence charSequence, @yfb Charset charset) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charSequence, "text");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        writeText(path, charSequence, charset, StandardOpenOption.APPEND);
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        appendText(path, charSequence, charset);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Path m16199b(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(iterable, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        Path pathWrite = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final BufferedReader bufferedReader(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final BufferedWriter bufferedWriter(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BufferedReader m16200c(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = xw1.f99524b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BufferedWriter m16201d(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = xw1.f99524b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m16202e(Path path, Charset charset, qy6 qy6Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        md8.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = wvg.lineSequence(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            bth bthVar = bth.f14751a;
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReaderNewBufferedReader, null);
            } else {
                bufferedReaderNewBufferedReader.close();
            }
            o28.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReaderNewBufferedReader, th);
                } else {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ List m16203f(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        List<String> allLines = Files.readAllLines(path, charset);
        md8.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final void forEachLine(Path path, Charset charset, qy6<? super String, bth> qy6Var) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        md8.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = wvg.lineSequence(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            bth bthVar = bth.f14751a;
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReaderNewBufferedReader, null);
            } else {
                bufferedReaderNewBufferedReader.close();
            }
            o28.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReaderNewBufferedReader, th);
                } else {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InputStreamReader m16204g(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m16205h(Path path, Charset charset, qy6 qy6Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            md8.checkNotNull(bufferedReaderNewBufferedReader);
            Object objInvoke = qy6Var.invoke(wvg.lineSequence(bufferedReaderNewBufferedReader));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            o28.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Path m16206i(Path path, vye vyeVar, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(vyeVar, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        Path pathWrite = Files.write(path, vze.asIterable(vyeVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final InputStream inputStream(Path path, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(openOptionArr, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return inputStreamNewInputStream;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Path m16207j(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(iterable, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        Path pathWrite = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ OutputStreamWriter m16208k(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final OutputStream outputStream(Path path, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return outputStreamNewOutputStream;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final byte[] readBytes(Path path) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        md8.checkNotNullExpressionValue(allBytes, "readAllBytes(...)");
        return allBytes;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final List<String> readLines(Path path, Charset charset) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        List<String> allLines = Files.readAllLines(path, charset);
        md8.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final String readText(@yfb Path path, @yfb Charset charset) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String text = wvg.readText(inputStreamReader);
            u52.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        return readText(path, charset);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final InputStreamReader reader(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final <T> T useLines(Path path, Charset charset, qy6<? super vye<String>, ? extends T> qy6Var) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(qy6Var, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            md8.checkNotNull(bufferedReaderNewBufferedReader);
            T tInvoke = qy6Var.invoke(wvg.lineSequence(bufferedReaderNewBufferedReader));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final void writeBytes(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(bArr, "array");
        md8.checkNotNullParameter(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path writeLines(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(iterable, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        Path pathWrite = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    public static final void writeText(@yfb Path path, @yfb CharSequence charSequence, @yfb Charset charset, @yfb OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charSequence, "text");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        try {
            if (charSequence instanceof String) {
                md8.checkNotNull(outputStreamNewOutputStream);
                ju5.writeTextImpl(outputStreamNewOutputStream, (String) charSequence, charset);
            } else {
                CharsetEncoder charsetEncoderNewReplaceEncoder = ju5.newReplaceEncoder(charset);
                CharBuffer charBufferAsReadOnlyBuffer = charSequence instanceof CharBuffer ? ((CharBuffer) charSequence).asReadOnlyBuffer() : CharBuffer.wrap(charSequence);
                int iMin = Math.min(charSequence.length(), 8192);
                md8.checkNotNull(charsetEncoderNewReplaceEncoder);
                ByteBuffer byteBufferByteBufferForEncoding = ju5.byteBufferForEncoding(iMin, charsetEncoderNewReplaceEncoder);
                while (charBufferAsReadOnlyBuffer.hasRemaining()) {
                    if (charsetEncoderNewReplaceEncoder.encode(charBufferAsReadOnlyBuffer, byteBufferByteBufferForEncoding, true).isError()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    outputStreamNewOutputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
                    byteBufferByteBufferForEncoding.clear();
                }
            }
            bth bthVar = bth.f14751a;
            u52.closeFinally(outputStreamNewOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(outputStreamNewOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        writeText(path, charSequence, charset, openOptionArr);
    }

    @ihi(markerClass = {mh5.class})
    @jjf(version = "1.5")
    @t28
    private static final OutputStreamWriter writer(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path appendLines(Path path, vye<? extends CharSequence> vyeVar, Charset charset) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(vyeVar, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        Path pathWrite = Files.write(path, vze.asIterable(vyeVar), charset, StandardOpenOption.APPEND);
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @jjf(version = "1.5")
    @t28
    @ihi(markerClass = {mh5.class})
    private static final Path writeLines(Path path, vye<? extends CharSequence> vyeVar, Charset charset, OpenOption... openOptionArr) throws IOException {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(vyeVar, "lines");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        md8.checkNotNullParameter(openOptionArr, "options");
        Path pathWrite = Files.write(path, vze.asIterable(vyeVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        md8.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }
}
