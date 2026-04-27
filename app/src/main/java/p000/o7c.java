package p000;

import java.math.RoundingMode;
import java.util.Arrays;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes5.dex */
public class o7c {

    /* JADX INFO: renamed from: c */
    public static final byte f66611c = 0;

    /* JADX INFO: renamed from: d */
    public static final byte f66612d = -1;

    /* JADX INFO: renamed from: e */
    public static final byte f66613e = 1;

    /* JADX INFO: renamed from: f */
    public static final byte f66614f = -1;

    /* JADX INFO: renamed from: g */
    public static final byte f66615g = -1;

    /* JADX INFO: renamed from: h */
    public static final byte f66616h = 0;

    /* JADX INFO: renamed from: i */
    public static final long f66617i = Long.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public static final long f66618j = -1;

    /* JADX INFO: renamed from: k */
    public static final int f66619k = 1024;

    /* JADX INFO: renamed from: l */
    public static final byte[][] f66620l = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{k95.f53214o7, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, k95.f53214o7}};

    /* JADX INFO: renamed from: b */
    public int f66622b = 0;

    /* JADX INFO: renamed from: a */
    public byte[] f66621a = new byte[1024];

    private void ensureAvailable(int i) {
        int i2 = i + this.f66622b;
        byte[] bArr = this.f66621a;
        if (i2 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i2) {
            i2 = length;
        }
        this.f66621a = Arrays.copyOf(bArr, i2);
    }

    private int signedNumLength(long j) {
        if (j < 0) {
            j = ~j;
        }
        return x68.divide(65 - Long.numberOfLeadingZeros(j), 7, RoundingMode.UP);
    }

    private int unsignedNumLength(long j) {
        return x68.divide(64 - Long.numberOfLeadingZeros(j), 8, RoundingMode.UP);
    }

    private void writeByteAscending(byte b) {
        if (b == 0) {
            writeEscapedByteAscending((byte) 0);
            writeEscapedByteAscending((byte) -1);
        } else if (b != -1) {
            writeEscapedByteAscending(b);
        } else {
            writeEscapedByteAscending((byte) -1);
            writeEscapedByteAscending((byte) 0);
        }
    }

    private void writeByteDescending(byte b) {
        if (b == 0) {
            writeEscapedByteDescending((byte) 0);
            writeEscapedByteDescending((byte) -1);
        } else if (b != -1) {
            writeEscapedByteDescending(b);
        } else {
            writeEscapedByteDescending((byte) -1);
            writeEscapedByteDescending((byte) 0);
        }
    }

    private void writeEscapedByteAscending(byte b) {
        ensureAvailable(1);
        byte[] bArr = this.f66621a;
        int i = this.f66622b;
        this.f66622b = i + 1;
        bArr[i] = b;
    }

    private void writeEscapedByteDescending(byte b) {
        ensureAvailable(1);
        byte[] bArr = this.f66621a;
        int i = this.f66622b;
        this.f66622b = i + 1;
        bArr[i] = (byte) (~b);
    }

    private void writeSeparatorAscending() {
        writeEscapedByteAscending((byte) 0);
        writeEscapedByteAscending((byte) 1);
    }

    private void writeSeparatorDescending() {
        writeEscapedByteDescending((byte) 0);
        writeEscapedByteDescending((byte) 1);
    }

    public byte[] encodedBytes() {
        return Arrays.copyOf(this.f66621a, this.f66622b);
    }

    public void reset() {
        this.f66622b = 0;
    }

    public void seed(byte[] bArr) {
        ensureAvailable(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = this.f66621a;
            int i = this.f66622b;
            this.f66622b = i + 1;
            bArr2[i] = b;
        }
    }

    public void writeBytesAscending(vj1 vj1Var) {
        for (int i = 0; i < vj1Var.size(); i++) {
            writeByteAscending(vj1Var.byteAt(i));
        }
        writeSeparatorAscending();
    }

    public void writeBytesDescending(vj1 vj1Var) {
        for (int i = 0; i < vj1Var.size(); i++) {
            writeByteDescending(vj1Var.byteAt(i));
        }
        writeSeparatorDescending();
    }

    public void writeDoubleAscending(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        writeUnsignedLongAscending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeDoubleDescending(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        writeUnsignedLongDescending(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void writeInfinityAscending() {
        writeEscapedByteAscending((byte) -1);
        writeEscapedByteAscending((byte) -1);
    }

    public void writeInfinityDescending() {
        writeEscapedByteDescending((byte) -1);
        writeEscapedByteDescending((byte) -1);
    }

    public void writeSignedLongAscending(long j) {
        int i;
        long j2 = j < 0 ? ~j : j;
        if (j2 < 64) {
            ensureAvailable(1);
            byte[] bArr = this.f66621a;
            int i2 = this.f66622b;
            this.f66622b = i2 + 1;
            bArr[i2] = (byte) (j ^ ((long) f66620l[1][0]));
            return;
        }
        int iSignedNumLength = signedNumLength(j2);
        ensureAvailable(iSignedNumLength);
        if (iSignedNumLength < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iSignedNumLength)));
        }
        byte b = j < 0 ? (byte) -1 : (byte) 0;
        int i3 = this.f66622b;
        if (iSignedNumLength == 10) {
            i = i3 + 2;
            byte[] bArr2 = this.f66621a;
            bArr2[i3] = b;
            bArr2[i3 + 1] = b;
        } else if (iSignedNumLength == 9) {
            i = i3 + 1;
            this.f66621a[i3] = b;
        } else {
            i = i3;
        }
        for (int i4 = (iSignedNumLength - 1) + i3; i4 >= i; i4--) {
            this.f66621a[i4] = (byte) (255 & j);
            j >>= 8;
        }
        byte[] bArr3 = this.f66621a;
        int i5 = this.f66622b;
        byte b2 = bArr3[i5];
        byte[] bArr4 = f66620l[iSignedNumLength];
        bArr3[i5] = (byte) (b2 ^ bArr4[0]);
        int i6 = i5 + 1;
        bArr3[i6] = (byte) (bArr4[1] ^ bArr3[i6]);
        this.f66622b = i5 + iSignedNumLength;
    }

    public void writeSignedLongDescending(long j) {
        writeSignedLongAscending(~j);
    }

    public void writeUnsignedLongAscending(long j) {
        int iUnsignedNumLength = unsignedNumLength(j);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.f66621a;
        int i = this.f66622b;
        int i2 = i + 1;
        this.f66622b = i2;
        bArr[i] = (byte) iUnsignedNumLength;
        int i3 = i2 + iUnsignedNumLength;
        while (true) {
            i3--;
            int i4 = this.f66622b;
            if (i3 < i4) {
                this.f66622b = i4 + iUnsignedNumLength;
                return;
            } else {
                this.f66621a[i3] = (byte) (255 & j);
                j >>>= 8;
            }
        }
    }

    public void writeUnsignedLongDescending(long j) {
        int iUnsignedNumLength = unsignedNumLength(j);
        ensureAvailable(iUnsignedNumLength + 1);
        byte[] bArr = this.f66621a;
        int i = this.f66622b;
        int i2 = i + 1;
        this.f66622b = i2;
        bArr[i] = (byte) (~iUnsignedNumLength);
        int i3 = i2 + iUnsignedNumLength;
        while (true) {
            i3--;
            int i4 = this.f66622b;
            if (i3 < i4) {
                this.f66622b = i4 + iUnsignedNumLength;
                return;
            } else {
                this.f66621a[i3] = (byte) (~(255 & j));
                j >>>= 8;
            }
        }
    }

    public void writeUtf8Ascending(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                writeByteAscending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteAscending((byte) ((cCharAt >>> 6) | 960));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteAscending((byte) ((cCharAt >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                writeByteAscending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                i++;
                writeByteAscending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteAscending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteAscending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteAscending((byte) ((iCodePointAt & 63) | 128));
            }
            i++;
        }
        writeSeparatorAscending();
    }

    public void writeUtf8Descending(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                writeByteDescending((byte) cCharAt);
            } else if (cCharAt < 2048) {
                writeByteDescending((byte) ((cCharAt >>> 6) | 960));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                writeByteDescending((byte) ((cCharAt >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                writeByteDescending((byte) (((cCharAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                i++;
                writeByteDescending((byte) ((iCodePointAt >>> 18) | 240));
                writeByteDescending((byte) (((iCodePointAt >>> 12) & 63) | 128));
                writeByteDescending((byte) (((iCodePointAt >>> 6) & 63) | 128));
                writeByteDescending((byte) ((iCodePointAt & 63) | 128));
            }
            i++;
        }
        writeSeparatorDescending();
    }
}
