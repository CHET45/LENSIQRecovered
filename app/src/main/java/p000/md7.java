package p000;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes7.dex */
@fgb
public class md7 implements Closeable {

    /* JADX INFO: renamed from: M1 */
    public static final int f60667M1 = 35615;

    /* JADX INFO: renamed from: V1 */
    public static final int f60668V1 = 10;

    /* JADX INFO: renamed from: Y */
    public static final int f60669Y = 512;

    /* JADX INFO: renamed from: Z */
    public static final int f60670Z = 2;

    /* JADX INFO: renamed from: Z1 */
    public static final int f60671Z1 = 8;

    /* JADX INFO: renamed from: a2 */
    public static final int f60672a2 = 2;

    /* JADX INFO: renamed from: b2 */
    public static final int f60673b2 = 4;

    /* JADX INFO: renamed from: c2 */
    public static final int f60674c2 = 8;

    /* JADX INFO: renamed from: d2 */
    public static final int f60675d2 = 16;

    /* JADX INFO: renamed from: H */
    public int f60678H;

    /* JADX INFO: renamed from: L */
    public int f60679L;

    /* JADX INFO: renamed from: M */
    public long f60680M;

    /* JADX INFO: renamed from: e */
    public int f60688e;

    /* JADX INFO: renamed from: f */
    public int f60689f;

    /* JADX INFO: renamed from: m */
    public Inflater f60690m;

    /* JADX INFO: renamed from: a */
    public final wm2 f60684a = new wm2();

    /* JADX INFO: renamed from: b */
    public final CRC32 f60685b = new CRC32();

    /* JADX INFO: renamed from: c */
    public final C9316b f60686c = new C9316b(this, null);

    /* JADX INFO: renamed from: d */
    public final byte[] f60687d = new byte[512];

    /* JADX INFO: renamed from: C */
    public EnumC9317c f60676C = EnumC9317c.HEADER;

    /* JADX INFO: renamed from: F */
    public boolean f60677F = false;

    /* JADX INFO: renamed from: N */
    public int f60681N = 0;

    /* JADX INFO: renamed from: Q */
    public int f60682Q = 0;

    /* JADX INFO: renamed from: X */
    public boolean f60683X = true;

    /* JADX INFO: renamed from: md7$a */
    public static /* synthetic */ class C9315a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60691a;

        static {
            int[] iArr = new int[EnumC9317c.values().length];
            f60691a = iArr;
            try {
                iArr[EnumC9317c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60691a[EnumC9317c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60691a[EnumC9317c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60691a[EnumC9317c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60691a[EnumC9317c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60691a[EnumC9317c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60691a[EnumC9317c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60691a[EnumC9317c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60691a[EnumC9317c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60691a[EnumC9317c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: md7$b */
    public class C9316b {
        private C9316b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean readBytesUntilZero() {
            while (readableBytes() > 0) {
                if (readUnsignedByte() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int readUnsignedByte() {
            int unsignedByte;
            if (md7.this.f60689f - md7.this.f60688e > 0) {
                unsignedByte = md7.this.f60687d[md7.this.f60688e] & 255;
                md7.m17246c(md7.this, 1);
            } else {
                unsignedByte = md7.this.f60684a.readUnsignedByte();
            }
            md7.this.f60685b.update(unsignedByte);
            md7.m17250g(md7.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long readUnsignedInt() {
            return ((long) readUnsignedShort()) | (((long) readUnsignedShort()) << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int readUnsignedShort() {
            return readUnsignedByte() | (readUnsignedByte() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int readableBytes() {
            return (md7.this.f60689f - md7.this.f60688e) + md7.this.f60684a.readableBytes();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void skipBytes(int i) {
            int i2;
            int i3 = md7.this.f60689f - md7.this.f60688e;
            if (i3 > 0) {
                int iMin = Math.min(i3, i);
                md7.this.f60685b.update(md7.this.f60687d, md7.this.f60688e, iMin);
                md7.m17246c(md7.this, iMin);
                i2 = i - iMin;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[512];
                int i4 = 0;
                while (i4 < i2) {
                    int iMin2 = Math.min(i2 - i4, 512);
                    md7.this.f60684a.readBytes(bArr, 0, iMin2);
                    md7.this.f60685b.update(bArr, 0, iMin2);
                    i4 += iMin2;
                }
            }
            md7.m17250g(md7.this, i);
        }

        public /* synthetic */ C9316b(md7 md7Var, C9315a c9315a) {
            this();
        }
    }

    /* JADX INFO: renamed from: md7$c */
    public enum EnumC9317c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m17246c(md7 md7Var, int i) {
        int i2 = md7Var.f60688e + i;
        md7Var.f60688e = i2;
        return i2;
    }

    private boolean fill() {
        v7d.checkState(this.f60690m != null, "inflater is null");
        v7d.checkState(this.f60688e == this.f60689f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f60684a.readableBytes(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f60688e = 0;
        this.f60689f = iMin;
        this.f60684a.readBytes(this.f60687d, 0, iMin);
        this.f60690m.setInput(this.f60687d, this.f60688e, iMin);
        this.f60676C = EnumC9317c.INFLATING;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m17250g(md7 md7Var, int i) {
        int i2 = md7Var.f60681N + i;
        md7Var.f60681N = i2;
        return i2;
    }

    private int inflate(byte[] bArr, int i, int i2) throws ZipException, DataFormatException {
        v7d.checkState(this.f60690m != null, "inflater is null");
        try {
            int totalIn = this.f60690m.getTotalIn();
            int iInflate = this.f60690m.inflate(bArr, i, i2);
            int totalIn2 = this.f60690m.getTotalIn() - totalIn;
            this.f60681N += totalIn2;
            this.f60682Q += totalIn2;
            this.f60688e += totalIn2;
            this.f60685b.update(bArr, i, iInflate);
            if (this.f60690m.finished()) {
                this.f60680M = this.f60690m.getBytesWritten() & 4294967295L;
                this.f60676C = EnumC9317c.TRAILER;
            } else if (this.f60690m.needsInput()) {
                this.f60676C = EnumC9317c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    private boolean initializeInflater() {
        Inflater inflater = this.f60690m;
        if (inflater == null) {
            this.f60690m = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f60685b.reset();
        int i = this.f60689f;
        int i2 = this.f60688e;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f60690m.setInput(this.f60687d, i2, i3);
            this.f60676C = EnumC9317c.INFLATING;
        } else {
            this.f60676C = EnumC9317c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean processHeader() throws ZipException {
        if (this.f60686c.readableBytes() < 10) {
            return false;
        }
        if (this.f60686c.readUnsignedShort() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f60686c.readUnsignedByte() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f60678H = this.f60686c.readUnsignedByte();
        this.f60686c.skipBytes(6);
        this.f60676C = EnumC9317c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean processHeaderComment() {
        if ((this.f60678H & 16) != 16) {
            this.f60676C = EnumC9317c.HEADER_CRC;
            return true;
        }
        if (!this.f60686c.readBytesUntilZero()) {
            return false;
        }
        this.f60676C = EnumC9317c.HEADER_CRC;
        return true;
    }

    private boolean processHeaderCrc() throws ZipException {
        if ((this.f60678H & 2) != 2) {
            this.f60676C = EnumC9317c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f60686c.readableBytes() < 2) {
            return false;
        }
        if ((((int) this.f60685b.getValue()) & 65535) != this.f60686c.readUnsignedShort()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f60676C = EnumC9317c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean processHeaderExtra() {
        int i = this.f60686c.readableBytes();
        int i2 = this.f60679L;
        if (i < i2) {
            return false;
        }
        this.f60686c.skipBytes(i2);
        this.f60676C = EnumC9317c.HEADER_NAME;
        return true;
    }

    private boolean processHeaderExtraLen() {
        if ((this.f60678H & 4) != 4) {
            this.f60676C = EnumC9317c.HEADER_NAME;
            return true;
        }
        if (this.f60686c.readableBytes() < 2) {
            return false;
        }
        this.f60679L = this.f60686c.readUnsignedShort();
        this.f60676C = EnumC9317c.HEADER_EXTRA;
        return true;
    }

    private boolean processHeaderName() {
        if ((this.f60678H & 8) != 8) {
            this.f60676C = EnumC9317c.HEADER_COMMENT;
            return true;
        }
        if (!this.f60686c.readBytesUntilZero()) {
            return false;
        }
        this.f60676C = EnumC9317c.HEADER_COMMENT;
        return true;
    }

    private boolean processTrailer() throws ZipException {
        if (this.f60690m != null && this.f60686c.readableBytes() <= 18) {
            this.f60690m.end();
            this.f60690m = null;
        }
        if (this.f60686c.readableBytes() < 8) {
            return false;
        }
        if (this.f60685b.getValue() != this.f60686c.readUnsignedInt() || this.f60680M != this.f60686c.readUnsignedInt()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f60685b.reset();
        this.f60676C = EnumC9317c.HEADER;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f60677F) {
            return;
        }
        this.f60677F = true;
        this.f60684a.close();
        Inflater inflater = this.f60690m;
        if (inflater != null) {
            inflater.end();
            this.f60690m = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m17251h(frd frdVar) {
        v7d.checkState(!this.f60677F, "GzipInflatingBuffer is closed");
        this.f60684a.addBuffer(frdVar);
        this.f60683X = false;
    }

    /* JADX INFO: renamed from: i */
    public int m17252i() {
        int i = this.f60681N;
        this.f60681N = 0;
        return i;
    }

    /* JADX INFO: renamed from: j */
    public int m17253j() {
        int i = this.f60682Q;
        this.f60682Q = 0;
        return i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m17254k() {
        v7d.checkState(!this.f60677F, "GzipInflatingBuffer is closed");
        return (this.f60686c.readableBytes() == 0 && this.f60676C == EnumC9317c.HEADER) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.f60676C != p000.md7.EnumC9317c.f60697a) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r6.f60686c.readableBytes() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r6.f60683X = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        return r3;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m17255l(byte[] r7, int r8, int r9) throws java.util.zip.ZipException, java.util.zip.DataFormatException {
        /*
            r6 = this;
            boolean r0 = r6.f60677F
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            p000.v7d.checkState(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L77
            int r4 = r9 - r3
            if (r4 <= 0) goto L77
            int[] r2 = p000.md7.C9315a.f60691a
            md7$c r5 = r6.f60676C
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L72;
                case 2: goto L6d;
                case 3: goto L68;
                case 4: goto L63;
                case 5: goto L5e;
                case 6: goto L59;
                case 7: goto L54;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            md7$c r9 = r6.f60676C
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.processTrailer()
            goto Lc
        L3d:
            boolean r2 = r6.fill()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.inflate(r7, r2, r4)
            int r3 = r3 + r2
            md7$c r2 = r6.f60676C
            md7$c r4 = p000.md7.EnumC9317c.TRAILER
            if (r2 != r4) goto Lb
            boolean r2 = r6.processTrailer()
            goto Lc
        L54:
            boolean r2 = r6.initializeInflater()
            goto Lc
        L59:
            boolean r2 = r6.processHeaderCrc()
            goto Lc
        L5e:
            boolean r2 = r6.processHeaderComment()
            goto Lc
        L63:
            boolean r2 = r6.processHeaderName()
            goto Lc
        L68:
            boolean r2 = r6.processHeaderExtra()
            goto Lc
        L6d:
            boolean r2 = r6.processHeaderExtraLen()
            goto Lc
        L72:
            boolean r2 = r6.processHeader()
            goto Lc
        L77:
            if (r2 == 0) goto L8b
            md7$c r7 = r6.f60676C
            md7$c r8 = p000.md7.EnumC9317c.HEADER
            if (r7 != r8) goto L8a
            md7$b r7 = r6.f60686c
            int r7 = p000.md7.C9316b.m17260d(r7)
            r8 = 10
            if (r7 >= r8) goto L8a
            goto L8b
        L8a:
            r1 = r0
        L8b:
            r6.f60683X = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.md7.m17255l(byte[], int, int):int");
    }

    /* JADX INFO: renamed from: m */
    public boolean m17256m() {
        v7d.checkState(!this.f60677F, "GzipInflatingBuffer is closed");
        return this.f60683X;
    }
}
