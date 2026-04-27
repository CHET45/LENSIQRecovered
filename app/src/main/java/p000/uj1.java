package p000;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "ByteStreamsKt")
public final class uj1 {

    /* JADX INFO: renamed from: uj1$a */
    public static final class C13549a extends lj1 {

        /* JADX INFO: renamed from: a */
        public int f88087a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f88088b;

        /* JADX INFO: renamed from: c */
        public boolean f88089c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BufferedInputStream f88090d;

        public C13549a(BufferedInputStream bufferedInputStream) {
            this.f88090d = bufferedInputStream;
        }

        private final void prepareNext() throws IOException {
            if (this.f88088b || this.f88089c) {
                return;
            }
            int i = this.f88090d.read();
            this.f88087a = i;
            this.f88088b = true;
            this.f88089c = i == -1;
        }

        public final boolean getFinished() {
            return this.f88089c;
        }

        public final int getNextByte() {
            return this.f88087a;
        }

        public final boolean getNextPrepared() {
            return this.f88088b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            prepareNext();
            return !this.f88089c;
        }

        @Override // p000.lj1
        public byte nextByte() throws IOException {
            prepareNext();
            if (this.f88089c) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b = (byte) this.f88087a;
            this.f88088b = false;
            return b;
        }

        public final void setFinished(boolean z) {
            this.f88089c = z;
        }

        public final void setNextByte(int i) {
            this.f88087a = i;
        }

        public final void setNextPrepared(boolean z) {
            this.f88088b = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BufferedInputStream m23371a(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BufferedOutputStream m23372b(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @t28
    private static final BufferedInputStream buffered(InputStream inputStream, int i) {
        md8.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @t28
    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @t28
    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @t28
    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        byte[] bytes = str.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BufferedReader m23373c(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static final long copyTo(@yfb InputStream inputStream, @yfb OutputStream outputStream, int i) throws IOException {
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(outputStream, "out");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(inputStream, outputStream, i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BufferedWriter m23374d(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ByteArrayInputStream m23375e(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        byte[] bytes = str.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InputStreamReader m23376f(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new InputStreamReader(inputStream, charset);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ OutputStreamWriter m23377g(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new OutputStreamWriter(outputStream, charset);
    }

    @t28
    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @yfb
    public static final lj1 iterator(@yfb BufferedInputStream bufferedInputStream) {
        md8.checkNotNullParameter(bufferedInputStream, "<this>");
        return new C13549a(bufferedInputStream);
    }

    @t64(errorSince = "1.5", warningSince = "1.3")
    @yfb
    @q64(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @i2e(expression = "readBytes()", imports = {}))
    public static final byte[] readBytes(@yfb InputStream inputStream, int i) {
        md8.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        md8.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return readBytes(inputStream, i);
    }

    @t28
    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new InputStreamReader(inputStream, charset);
    }

    @t28
    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new OutputStreamWriter(outputStream, charset);
    }

    @t28
    private static final BufferedOutputStream buffered(OutputStream outputStream, int i) {
        md8.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @t28
    private static final ByteArrayInputStream inputStream(byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @jjf(version = "1.3")
    @yfb
    public static final byte[] readBytes(@yfb InputStream inputStream) {
        md8.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        md8.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
