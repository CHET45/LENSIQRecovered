package p000;

import java.nio.ByteBuffer;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ozh {

    /* JADX INFO: renamed from: a */
    public static ozh f69297a;

    /* JADX INFO: renamed from: ozh$a */
    public static class C10725a {
        /* JADX INFO: renamed from: a */
        public static void m19119a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b2) || (((b << 28) + (b2 + BuiltinOptions.ReadVariableOptions)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(iTrailingByteValue);
            cArr[i + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: renamed from: b */
        public static void m19120b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: renamed from: c */
        public static void m19121c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: renamed from: d */
        public static void m19122d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
        }

        /* JADX INFO: renamed from: e */
        public static boolean m19123e(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m19124f(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: g */
        public static boolean m19125g(byte b) {
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

    /* JADX INFO: renamed from: ozh$b */
    public static class C10726b extends IllegalArgumentException {
        public C10726b(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static ozh getDefault() {
        if (f69297a == null) {
            f69297a = new vzh();
        }
        return f69297a;
    }

    public static void setDefault(ozh ozhVar) {
        f69297a = ozhVar;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
