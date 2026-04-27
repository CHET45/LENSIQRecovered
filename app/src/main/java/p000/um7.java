package p000;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p000.am7;
import p000.gv6;

/* JADX INFO: loaded from: classes7.dex */
public final class um7 implements v2i {

    /* JADX INFO: renamed from: a */
    public static final Logger f88481a = Logger.getLogger(C13600b.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ByteString f88482b = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c */
    public static final int f88483c = 16384;

    /* JADX INFO: renamed from: d */
    public static final byte f88484d = 0;

    /* JADX INFO: renamed from: e */
    public static final byte f88485e = 1;

    /* JADX INFO: renamed from: f */
    public static final byte f88486f = 2;

    /* JADX INFO: renamed from: g */
    public static final byte f88487g = 3;

    /* JADX INFO: renamed from: h */
    public static final byte f88488h = 4;

    /* JADX INFO: renamed from: i */
    public static final byte f88489i = 5;

    /* JADX INFO: renamed from: j */
    public static final byte f88490j = 6;

    /* JADX INFO: renamed from: k */
    public static final byte f88491k = 7;

    /* JADX INFO: renamed from: l */
    public static final byte f88492l = 8;

    /* JADX INFO: renamed from: m */
    public static final byte f88493m = 9;

    /* JADX INFO: renamed from: n */
    public static final byte f88494n = 0;

    /* JADX INFO: renamed from: o */
    public static final byte f88495o = 1;

    /* JADX INFO: renamed from: p */
    public static final byte f88496p = 1;

    /* JADX INFO: renamed from: q */
    public static final byte f88497q = 4;

    /* JADX INFO: renamed from: r */
    public static final byte f88498r = 4;

    /* JADX INFO: renamed from: s */
    public static final byte f88499s = 8;

    /* JADX INFO: renamed from: t */
    public static final byte f88500t = 32;

    /* JADX INFO: renamed from: u */
    public static final byte f88501u = 32;

    /* JADX INFO: renamed from: um7$a */
    public static final class C13599a implements Source {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f88502a;

        /* JADX INFO: renamed from: b */
        public int f88503b;

        /* JADX INFO: renamed from: c */
        public byte f88504c;

        /* JADX INFO: renamed from: d */
        public int f88505d;

        /* JADX INFO: renamed from: e */
        public int f88506e;

        /* JADX INFO: renamed from: f */
        public short f88507f;

        public C13599a(BufferedSource bufferedSource) {
            this.f88502a = bufferedSource;
        }

        private void readContinuationHeader() throws IOException {
            int i = this.f88505d;
            int medium = um7.readMedium(this.f88502a);
            this.f88506e = medium;
            this.f88503b = medium;
            byte b = (byte) (this.f88502a.readByte() & 255);
            this.f88504c = (byte) (this.f88502a.readByte() & 255);
            if (um7.f88481a.isLoggable(Level.FINE)) {
                um7.f88481a.fine(C13600b.m23440b(true, this.f88505d, this.f88503b, b, this.f88504c));
            }
            int i2 = this.f88502a.readInt() & Integer.MAX_VALUE;
            this.f88505d = i2;
            if (b != 9) {
                throw um7.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw um7.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.f88506e;
                if (i != 0) {
                    long j2 = this.f88502a.read(buffer, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.f88506e -= (int) j2;
                    return j2;
                }
                this.f88502a.skip(this.f88507f);
                this.f88507f = (short) 0;
                if ((this.f88504c & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f88502a.timeout();
        }
    }

    /* JADX INFO: renamed from: um7$b */
    public static final class C13600b {

        /* JADX INFO: renamed from: a */
        public static final String[] f88508a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b */
        public static final String[] f88509b = new String[64];

        /* JADX INFO: renamed from: c */
        public static final String[] f88510c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f88510c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f88509b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = f88509b;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f88509b;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = f88510c[i];
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: a */
        public static String m23439a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : f88510c[b2];
                }
                if (b != 7 && b != 8) {
                    String[] strArr = f88509b;
                    String str = b2 < strArr.length ? strArr[b2] : f88510c[b2];
                    return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f88510c[b2];
        }

        /* JADX INFO: renamed from: b */
        public static String m23440b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f88508a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b)), m23439a(b, b2));
        }
    }

    /* JADX INFO: renamed from: um7$d */
    public static final class C13602d implements kv6 {

        /* JADX INFO: renamed from: a */
        public final BufferedSink f88515a;

        /* JADX INFO: renamed from: b */
        public final boolean f88516b;

        /* JADX INFO: renamed from: c */
        public final Buffer f88517c;

        /* JADX INFO: renamed from: d */
        public final am7.C0323b f88518d;

        /* JADX INFO: renamed from: e */
        public int f88519e;

        /* JADX INFO: renamed from: f */
        public boolean f88520f;

        public C13602d(BufferedSink bufferedSink, boolean z) {
            this.f88515a = bufferedSink;
            this.f88516b = z;
            Buffer buffer = new Buffer();
            this.f88517c = buffer;
            this.f88518d = new am7.C0323b(buffer);
            this.f88519e = 16384;
        }

        private void writeContinuationFrames(int i, long j) throws IOException {
            while (j > 0) {
                int iMin = (int) Math.min(this.f88519e, j);
                long j2 = iMin;
                j -= j2;
                m23442b(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.f88515a.write(this.f88517c, j2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m23441a(int i, byte b, Buffer buffer, int i2) throws IOException {
            m23442b(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f88515a.write(buffer, i2);
            }
        }

        @Override // p000.kv6
        public synchronized void ackSettings(b7f b7fVar) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            this.f88519e = b7fVar.m2981k(this.f88519e);
            m23442b(0, 0, (byte) 4, (byte) 1);
            this.f88515a.flush();
        }

        /* JADX INFO: renamed from: b */
        public void m23442b(int i, int i2, byte b, byte b2) throws IOException {
            if (um7.f88481a.isLoggable(Level.FINE)) {
                um7.f88481a.fine(C13600b.m23440b(false, i, i2, b, b2));
            }
            int i3 = this.f88519e;
            if (i2 > i3) {
                throw um7.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                throw um7.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
            }
            um7.writeMedium(this.f88515a, i2);
            this.f88515a.writeByte(b & 255);
            this.f88515a.writeByte(b2 & 255);
            this.f88515a.writeInt(i & Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: c */
        public void m23443c(boolean z, int i, List<ei7> list) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            this.f88518d.m909d(list);
            long size = this.f88517c.size();
            int iMin = (int) Math.min(this.f88519e, size);
            long j = iMin;
            byte b = size == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m23442b(i, iMin, (byte) 1, b);
            this.f88515a.write(this.f88517c, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f88520f = true;
            this.f88515a.close();
        }

        @Override // p000.kv6
        public synchronized void connectionPreface() throws IOException {
            try {
                if (this.f88520f) {
                    throw new IOException("closed");
                }
                if (this.f88516b) {
                    if (um7.f88481a.isLoggable(Level.FINE)) {
                        um7.f88481a.fine(String.format(">> CONNECTION %s", um7.f88482b.hex()));
                    }
                    this.f88515a.write(um7.f88482b.toByteArray());
                    this.f88515a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p000.kv6
        public synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            m23441a(i, z ? (byte) 1 : (byte) 0, buffer, i2);
        }

        @Override // p000.kv6
        public synchronized void flush() throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            this.f88515a.flush();
        }

        @Override // p000.kv6
        public synchronized void goAway(int i, w45 w45Var, byte[] bArr) throws IOException {
            try {
                if (this.f88520f) {
                    throw new IOException("closed");
                }
                if (w45Var.f93214a == -1) {
                    throw um7.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
                m23442b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f88515a.writeInt(i);
                this.f88515a.writeInt(w45Var.f93214a);
                if (bArr.length > 0) {
                    this.f88515a.write(bArr);
                }
                this.f88515a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p000.kv6
        public synchronized void headers(int i, List<ei7> list) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            m23443c(false, i, list);
        }

        @Override // p000.kv6
        public int maxDataLength() {
            return this.f88519e;
        }

        @Override // p000.kv6
        public synchronized void ping(boolean z, int i, int i2) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            m23442b(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f88515a.writeInt(i);
            this.f88515a.writeInt(i2);
            this.f88515a.flush();
        }

        @Override // p000.kv6
        public synchronized void pushPromise(int i, int i2, List<ei7> list) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            this.f88518d.m909d(list);
            long size = this.f88517c.size();
            int iMin = (int) Math.min(this.f88519e - 4, size);
            long j = iMin;
            m23442b(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
            this.f88515a.writeInt(i2 & Integer.MAX_VALUE);
            this.f88515a.write(this.f88517c, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
            }
        }

        @Override // p000.kv6
        public synchronized void rstStream(int i, w45 w45Var) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            if (w45Var.f93214a == -1) {
                throw new IllegalArgumentException();
            }
            m23442b(i, 4, (byte) 3, (byte) 0);
            this.f88515a.writeInt(w45Var.f93214a);
            this.f88515a.flush();
        }

        @Override // p000.kv6
        public synchronized void settings(b7f b7fVar) throws IOException {
            try {
                if (this.f88520f) {
                    throw new IOException("closed");
                }
                int i = 0;
                m23442b(0, b7fVar.m2989s() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (b7fVar.isSet(i)) {
                        this.f88515a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f88515a.writeInt(b7fVar.get(i));
                    }
                    i++;
                }
                this.f88515a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p000.kv6
        public synchronized void synReply(boolean z, int i, List<ei7> list) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            m23443c(z, i, list);
        }

        @Override // p000.kv6
        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<ei7> list) throws IOException {
            if (z2) {
                throw new UnsupportedOperationException();
            }
            if (this.f88520f) {
                throw new IOException("closed");
            }
            m23443c(z, i, list);
        }

        @Override // p000.kv6
        public synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.f88520f) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw um7.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            }
            m23442b(i, 4, (byte) 8, (byte) 0);
            this.f88515a.writeInt((int) j);
            this.f88515a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @rq6
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @rq6
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readMedium(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    @Override // p000.v2i
    public uhd getProtocol() {
        return uhd.HTTP_2;
    }

    @Override // p000.v2i
    public gv6 newReader(BufferedSource bufferedSource, boolean z) {
        return new C13601c(bufferedSource, 4096, z);
    }

    @Override // p000.v2i
    public kv6 newWriter(BufferedSink bufferedSink, boolean z) {
        return new C13602d(bufferedSink, z);
    }

    /* JADX INFO: renamed from: um7$c */
    public static final class C13601c implements gv6 {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f88511a;

        /* JADX INFO: renamed from: b */
        public final C13599a f88512b;

        /* JADX INFO: renamed from: c */
        public final boolean f88513c;

        /* JADX INFO: renamed from: d */
        public final am7.C0322a f88514d;

        public C13601c(BufferedSource bufferedSource, int i, boolean z) {
            this.f88511a = bufferedSource;
            this.f88513c = z;
            C13599a c13599a = new C13599a(bufferedSource);
            this.f88512b = c13599a;
            this.f88514d = new am7.C0322a(i, c13599a);
        }

        private void readData(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            boolean z = (b & 1) != 0;
            if ((b & 32) != 0) {
                throw um7.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s = (b & 8) != 0 ? (short) (this.f88511a.readByte() & 255) : (short) 0;
            interfaceC6593a.data(z, i2, this.f88511a, um7.lengthWithoutPadding(i, b, s), i);
            this.f88511a.skip(s);
        }

        private void readGoAway(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw um7.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw um7.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i3 = this.f88511a.readInt();
            int i4 = this.f88511a.readInt();
            int i5 = i - 8;
            w45 w45VarFromHttp2 = w45.fromHttp2(i4);
            if (w45VarFromHttp2 == null) {
                throw um7.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            }
            ByteString byteString = ByteString.EMPTY;
            if (i5 > 0) {
                byteString = this.f88511a.readByteString(i5);
            }
            interfaceC6593a.goAway(i3, w45VarFromHttp2, byteString);
        }

        private List<ei7> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
            C13599a c13599a = this.f88512b;
            c13599a.f88506e = i;
            c13599a.f88503b = i;
            c13599a.f88507f = s;
            c13599a.f88504c = b;
            c13599a.f88505d = i2;
            this.f88514d.m904d();
            return this.f88514d.getAndResetHeaderList();
        }

        private void readHeaders(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw um7.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b & 1) != 0;
            short s = (b & 8) != 0 ? (short) (this.f88511a.readByte() & 255) : (short) 0;
            if ((b & 32) != 0) {
                readPriority(interfaceC6593a, i2);
                i -= 5;
            }
            interfaceC6593a.headers(false, z, i2, -1, readHeaderBlock(um7.lengthWithoutPadding(i, b, s), s, b, i2), li7.HTTP_20_HEADERS);
        }

        private void readPing(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i != 8) {
                throw um7.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw um7.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            interfaceC6593a.ping((b & 1) != 0, this.f88511a.readInt(), this.f88511a.readInt());
        }

        private void readPriority(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw um7.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw um7.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            readPriority(interfaceC6593a, i2);
        }

        private void readPushPromise(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw um7.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s = (b & 8) != 0 ? (short) (this.f88511a.readByte() & 255) : (short) 0;
            interfaceC6593a.pushPromise(i2, this.f88511a.readInt() & Integer.MAX_VALUE, readHeaderBlock(um7.lengthWithoutPadding(i - 4, b, s), s, b, i2));
        }

        private void readRstStream(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw um7.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw um7.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i3 = this.f88511a.readInt();
            w45 w45VarFromHttp2 = w45.fromHttp2(i3);
            if (w45VarFromHttp2 == null) {
                throw um7.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
            }
            interfaceC6593a.rstStream(i2, w45VarFromHttp2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void readSettings(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw um7.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b & 1) != 0) {
                if (i != 0) {
                    throw um7.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                interfaceC6593a.ackSettings();
                return;
            }
            if (i % 6 != 0) {
                throw um7.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
            b7f b7fVar = new b7f();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short s = this.f88511a.readShort();
                int i4 = this.f88511a.readInt();
                switch (s) {
                    case 1:
                    case 6:
                        b7fVar.set(s, 0, i4);
                        break;
                    case 2:
                        if (i4 != 0 && i4 != 1) {
                            throw um7.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        b7fVar.set(s, 0, i4);
                        break;
                    case 3:
                        s = 4;
                        b7fVar.set(s, 0, i4);
                        break;
                    case 4:
                        if (i4 < 0) {
                            throw um7.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s = 7;
                        b7fVar.set(s, 0, i4);
                        break;
                        break;
                    case 5:
                        if (i4 < 16384 || i4 > 16777215) {
                            throw um7.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                        }
                        b7fVar.set(s, 0, i4);
                        break;
                    default:
                        break;
                }
            }
            interfaceC6593a.settings(false, b7fVar);
            if (b7fVar.m2978h() >= 0) {
                this.f88514d.m901a(b7fVar.m2978h());
            }
        }

        private void readWindowUpdate(gv6.InterfaceC6593a interfaceC6593a, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw um7.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
            long j = ((long) this.f88511a.readInt()) & 2147483647L;
            if (j == 0) {
                throw um7.ioException("windowSizeIncrement was 0", new Object[0]);
            }
            interfaceC6593a.windowUpdate(i2, j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f88511a.close();
        }

        @Override // p000.gv6
        public boolean nextFrame(gv6.InterfaceC6593a interfaceC6593a) throws IOException {
            try {
                this.f88511a.require(9L);
                int medium = um7.readMedium(this.f88511a);
                if (medium < 0 || medium > 16384) {
                    throw um7.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(medium));
                }
                byte b = (byte) (this.f88511a.readByte() & 255);
                byte b2 = (byte) (this.f88511a.readByte() & 255);
                int i = this.f88511a.readInt() & Integer.MAX_VALUE;
                if (um7.f88481a.isLoggable(Level.FINE)) {
                    um7.f88481a.fine(C13600b.m23440b(true, i, medium, b, b2));
                }
                switch (b) {
                    case 0:
                        readData(interfaceC6593a, medium, b2, i);
                        return true;
                    case 1:
                        readHeaders(interfaceC6593a, medium, b2, i);
                        return true;
                    case 2:
                        readPriority(interfaceC6593a, medium, b2, i);
                        return true;
                    case 3:
                        readRstStream(interfaceC6593a, medium, b2, i);
                        return true;
                    case 4:
                        readSettings(interfaceC6593a, medium, b2, i);
                        return true;
                    case 5:
                        readPushPromise(interfaceC6593a, medium, b2, i);
                        return true;
                    case 6:
                        readPing(interfaceC6593a, medium, b2, i);
                        return true;
                    case 7:
                        readGoAway(interfaceC6593a, medium, b2, i);
                        return true;
                    case 8:
                        readWindowUpdate(interfaceC6593a, medium, b2, i);
                        return true;
                    default:
                        this.f88511a.skip(medium);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // p000.gv6
        public void readConnectionPreface() throws IOException {
            if (this.f88513c) {
                return;
            }
            ByteString byteString = this.f88511a.readByteString(um7.f88482b.size());
            if (um7.f88481a.isLoggable(Level.FINE)) {
                um7.f88481a.fine(String.format("<< CONNECTION %s", byteString.hex()));
            }
            if (!um7.f88482b.equals(byteString)) {
                throw um7.ioException("Expected a connection header but was %s", byteString.utf8());
            }
        }

        private void readPriority(gv6.InterfaceC6593a interfaceC6593a, int i) throws IOException {
            int i2 = this.f88511a.readInt();
            interfaceC6593a.priority(i, i2 & Integer.MAX_VALUE, (this.f88511a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
        }
    }
}
