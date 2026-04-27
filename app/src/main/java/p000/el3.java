package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
@xg5
public final class el3 extends InputStream {

    /* JADX INFO: renamed from: C */
    public int f33313C;

    /* JADX INFO: renamed from: F */
    public int f33314F;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InputStream f33315a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final bq0 f33316b;

    /* JADX INFO: renamed from: c */
    public boolean f33317c;

    /* JADX INFO: renamed from: d */
    public boolean f33318d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final byte[] f33319e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final byte[] f33320f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final byte[] f33321m;

    public el3(@yfb InputStream inputStream, @yfb bq0 bq0Var) {
        md8.checkNotNullParameter(inputStream, "input");
        md8.checkNotNullParameter(bq0Var, "base64");
        this.f33315a = inputStream;
        this.f33316b = bq0Var;
        this.f33319e = new byte[1];
        this.f33320f = new byte[1024];
        this.f33321m = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f33321m;
        int i3 = this.f33313C;
        u70.copyInto(bArr2, bArr, i, i3, i3 + i2);
        this.f33313C += i2;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f33314F;
        this.f33314F = i4 + this.f33316b.decodeIntoByteArray(this.f33320f, this.f33321m, i4, 0, i3);
        int iMin = Math.min(getByteBufferLength(), i2 - i);
        copyByteBufferInto(bArr, i, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final int getByteBufferLength() {
        return this.f33314F - this.f33313C;
    }

    private final int handlePaddingSymbol(int i) throws IOException {
        this.f33320f[i] = 61;
        if ((i & 3) != 2) {
            return i + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.f33320f[i + 1] = (byte) nextSymbol;
        }
        return i + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i;
        if (!this.f33316b.isMimeScheme$kotlin_stdlib()) {
            return this.f33315a.read();
        }
        do {
            i = this.f33315a.read();
            if (i == -1) {
                break;
            }
        } while (!eq0.isInMimeAlphabet(i));
        return i;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.f33313C == this.f33314F) {
            this.f33313C = 0;
            this.f33314F = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.f33321m;
        int length = bArr.length;
        int i = this.f33314F;
        if ((this.f33320f.length / 4) * 3 > length - i) {
            u70.copyInto(bArr, bArr, 0, this.f33313C, i);
            this.f33314F -= this.f33313C;
            this.f33313C = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f33317c) {
            return;
        }
        this.f33317c = true;
        this.f33315a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f33313C;
        if (i < this.f33314F) {
            int i2 = this.f33321m[i] & 255;
            this.f33313C = i + 1;
            resetByteBufferIfEmpty();
            return i2;
        }
        int i3 = read(this.f33319e, 0, 1);
        if (i3 == -1) {
            return -1;
        }
        if (i3 == 1) {
            return this.f33319e[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r3 != r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
    
        return r3 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(@p000.yfb byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "destination"
            p000.md8.checkNotNullParameter(r10, r0)
            if (r11 < 0) goto L87
            if (r12 < 0) goto L87
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L87
            boolean r1 = r9.f33317c
            if (r1 != 0) goto L7f
            boolean r1 = r9.f33318d
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.getByteBufferLength()
            if (r3 < r12) goto L26
            r9.copyByteBufferInto(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.getByteBufferLength()
            int r12 = r12 - r3
            int r12 = r12 + 2
            int r12 = r12 / 3
            int r12 = r12 * 4
            r3 = r11
        L32:
            boolean r4 = r9.f33318d
            if (r4 != 0) goto L77
            if (r12 <= 0) goto L77
            byte[] r4 = r9.f33320f
            int r4 = r4.length
            int r4 = java.lang.Math.min(r4, r12)
            r5 = r1
        L40:
            boolean r6 = r9.f33318d
            if (r6 != 0) goto L63
            if (r5 >= r4) goto L63
            int r6 = r9.readNextSymbol()
            r7 = 1
            if (r6 == r2) goto L60
            r8 = 61
            if (r6 == r8) goto L59
            byte[] r7 = r9.f33320f
            byte r6 = (byte) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L40
        L59:
            int r5 = r9.handlePaddingSymbol(r5)
            r9.f33318d = r7
            goto L40
        L60:
            r9.f33318d = r7
            goto L40
        L63:
            if (r6 != 0) goto L70
            if (r5 != r4) goto L68
            goto L70
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        L70:
            int r12 = r12 - r5
            int r4 = r9.decodeSymbolBufferInto(r10, r3, r0, r5)
            int r3 = r3 + r4
            goto L32
        L77:
            if (r3 != r11) goto L7c
            if (r4 == 0) goto L7c
            goto L7e
        L7c:
            int r2 = r3 - r11
        L7e:
            return r2
        L7f:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L87:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ", length: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ", buffer size: "
            r1.append(r11)
            int r10 = r10.length
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el3.read(byte[], int, int):int");
    }
}
