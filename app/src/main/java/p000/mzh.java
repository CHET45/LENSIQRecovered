package p000;

import java.nio.ByteBuffer;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mzh {

    /* JADX INFO: renamed from: a */
    public static mzh f62875a;

    /* JADX INFO: renamed from: mzh$a */
    public static class C9618a {
        /* JADX INFO: renamed from: a */
        public static void m17679a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b2) || (((b << 28) + (b2 + BuiltinOptions.ReadVariableOptions)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(iTrailingByteValue);
            cArr[i + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: renamed from: b */
        public static void m17680b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: renamed from: c */
        public static void m17681c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: renamed from: d */
        public static void m17682d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        /* JADX INFO: renamed from: e */
        public static boolean m17683e(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m17684f(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: g */
        public static boolean m17685g(byte b) {
            return b < -32;
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: renamed from: mzh$b */
    public static class C9619b extends IllegalArgumentException {
        public C9619b(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static mzh getDefault() {
        if (f62875a == null) {
            f62875a = new uzh();
        }
        return f62875a;
    }

    public static void setDefault(mzh mzhVar) {
        f62875a = mzhVar;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
