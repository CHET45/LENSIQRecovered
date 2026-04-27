package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class lzh {

    /* JADX INFO: renamed from: a */
    public static final AbstractC9058b f59471a;

    /* JADX INFO: renamed from: b */
    public static final long f59472b = -9187201950435737472L;

    /* JADX INFO: renamed from: c */
    public static final int f59473c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f59474d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f59475e = -1;

    /* JADX INFO: renamed from: f */
    public static final int f59476f = 16;

    /* JADX INFO: renamed from: lzh$a */
    public static class C9057a {
        private C9057a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws be8 {
            if (isNotTrailingByte(byte2) || (((byte1 << 28) + (byte2 + BuiltinOptions.ReadVariableOptions)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw be8.m3077d();
            }
            int iTrailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(iTrailingByteValue);
            resultArr[resultPos + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws be8 {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw be8.m3077d();
            }
            resultArr[resultPos] = (char) (((byte1 & 15) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws be8 {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw be8.m3077d();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: renamed from: lzh$b */
    public static abstract class AbstractC9058b {
        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int iEstimateConsecutiveAscii = index + lzh.estimateConsecutiveAscii(buffer, index, limit);
            while (iEstimateConsecutiveAscii < limit) {
                int i = iEstimateConsecutiveAscii + 1;
                byte b = buffer.get(iEstimateConsecutiveAscii);
                if (b >= 0) {
                    iEstimateConsecutiveAscii = i;
                } else if (b < -32) {
                    if (i >= limit) {
                        return b;
                    }
                    if (b < -62 || buffer.get(i) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b >= -16) {
                        if (i >= limit - 2) {
                            return lzh.incompleteStateFor(buffer, b, i, limit - i);
                        }
                        int i2 = iEstimateConsecutiveAscii + 2;
                        byte b2 = buffer.get(i);
                        if (b2 <= -65 && (((b << 28) + (b2 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                            int i3 = iEstimateConsecutiveAscii + 3;
                            if (buffer.get(i2) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (buffer.get(i3) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i >= limit - 1) {
                        return lzh.incompleteStateFor(buffer, b, i, limit - i);
                    }
                    int i4 = iEstimateConsecutiveAscii + 2;
                    byte b3 = buffer.get(i);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || buffer.get(i4) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public final String m16506a(ByteBuffer buffer, int index, int size) throws be8 {
            if (buffer.hasArray()) {
                return mo16507b(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? mo16509d(buffer, index, size) : m16508c(buffer, index, size);
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo16507b(byte[] bytes, int index, int size) throws be8;

        /* JADX INFO: renamed from: c */
        public final String m16508c(ByteBuffer buffer, int index, int size) throws be8 {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i = index + size;
            char[] cArr = new char[size];
            int i2 = 0;
            while (index < i) {
                byte b = buffer.get(index);
                if (!C9057a.isOneByte(b)) {
                    break;
                }
                index++;
                C9057a.handleOneByte(b, cArr, i2);
                i2++;
            }
            int i3 = i2;
            while (index < i) {
                int i4 = index + 1;
                byte b2 = buffer.get(index);
                if (C9057a.isOneByte(b2)) {
                    int i5 = i3 + 1;
                    C9057a.handleOneByte(b2, cArr, i3);
                    while (i4 < i) {
                        byte b3 = buffer.get(i4);
                        if (!C9057a.isOneByte(b3)) {
                            break;
                        }
                        i4++;
                        C9057a.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                    i3 = i5;
                    index = i4;
                } else if (C9057a.isTwoBytes(b2)) {
                    if (i4 >= i) {
                        throw be8.m3077d();
                    }
                    index += 2;
                    C9057a.handleTwoBytes(b2, buffer.get(i4), cArr, i3);
                    i3++;
                } else if (C9057a.isThreeBytes(b2)) {
                    if (i4 >= i - 1) {
                        throw be8.m3077d();
                    }
                    int i6 = index + 2;
                    index += 3;
                    C9057a.handleThreeBytes(b2, buffer.get(i4), buffer.get(i6), cArr, i3);
                    i3++;
                } else {
                    if (i4 >= i - 2) {
                        throw be8.m3077d();
                    }
                    byte b4 = buffer.get(i4);
                    int i7 = index + 3;
                    byte b5 = buffer.get(index + 2);
                    index += 4;
                    C9057a.handleFourBytes(b2, b4, b5, buffer.get(i7), cArr, i3);
                    i3 += 2;
                }
            }
            return new String(cArr, 0, i3);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo16509d(ByteBuffer buffer, int index, int size) throws be8;

        /* JADX INFO: renamed from: e */
        public abstract int mo16510e(String in, byte[] out, int offset, int length);

        /* JADX INFO: renamed from: f */
        public final void m16511f(String in, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                mi8.m17327e(out, lzh.m16491i(in, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                mo16513h(in, out);
            } else {
                m16512g(in, out);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m16512g(String in, ByteBuffer out) {
            int length = in.length();
            int iPosition = out.position();
            int i = 0;
            while (i < length) {
                try {
                    char cCharAt = in.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i, (byte) cCharAt);
                    i++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i) + " at index " + (out.position() + Math.max(i, (iPosition - out.position()) + 1)));
                }
            }
            if (i == length) {
                mi8.m17327e(out, iPosition + i);
                return;
            }
            iPosition += i;
            while (i < length) {
                char cCharAt2 = in.charAt(i);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i2 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        out.put(i2, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i) + " at index " + (out.position() + Math.max(i, (iPosition - out.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i3 = i + 1;
                        if (i3 != length) {
                            try {
                                char cCharAt3 = in.charAt(i3);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i4 = iPosition + 1;
                                    try {
                                        out.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i5 = iPosition + 2;
                                        try {
                                            out.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            out.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                            out.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i = i3;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i = i3;
                                            iPosition = i5;
                                            throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i) + " at index " + (out.position() + Math.max(i, (iPosition - out.position()) + 1)));
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i4;
                                        i = i3;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i) + " at index " + (out.position() + Math.max(i, (iPosition - out.position()) + 1)));
                                    }
                                } else {
                                    i = i3;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new C9060d(i, length);
                    }
                    int i6 = iPosition + 1;
                    out.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    out.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    out.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i++;
                iPosition++;
            }
            mi8.m17327e(out, iPosition);
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo16513h(String in, ByteBuffer out);

        /* JADX INFO: renamed from: i */
        public final boolean m16514i(ByteBuffer buffer, int index, int limit) {
            return m16516k(0, buffer, index, limit) == 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m16515j(byte[] bytes, int index, int limit) {
            return mo16517l(0, bytes, index, limit) == 0;
        }

        /* JADX INFO: renamed from: k */
        public final int m16516k(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? mo16519n(state, buffer, index, limit) : m16518m(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return mo16517l(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        /* JADX INFO: renamed from: l */
        public abstract int mo16517l(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /* JADX INFO: renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m16518m(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = p000.lzh.m16483a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = p000.lzh.m16483a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = p000.lzh.m16484b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.AbstractC9058b.m16518m(int, java.nio.ByteBuffer, int, int):int");
        }

        /* JADX INFO: renamed from: n */
        public abstract int mo16519n(final int state, final ByteBuffer buffer, int index, final int limit);
    }

    /* JADX INFO: renamed from: lzh$c */
    public static final class C9059c extends AbstractC9058b {
        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i = index + 1;
                byte b = bytes[index];
                if (b < 0) {
                    if (b < -32) {
                        if (i >= limit) {
                            return b;
                        }
                        if (b >= -62) {
                            index += 2;
                            if (bytes[i] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i >= limit - 2) {
                            return lzh.incompleteStateFor(bytes, i, limit);
                        }
                        int i2 = index + 2;
                        byte b2 = bytes[i];
                        if (b2 <= -65 && (((b << 28) + (b2 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                            int i3 = index + 3;
                            if (bytes[i2] <= -65) {
                                index += 4;
                                if (bytes[i3] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i >= limit - 1) {
                        return lzh.incompleteStateFor(bytes, i, limit);
                    }
                    int i4 = index + 2;
                    byte b3 = bytes[i];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        index += 3;
                        if (bytes[i4] > -65) {
                        }
                    }
                    return -1;
                }
                index = i;
            }
            return 0;
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: b */
        public String mo16507b(byte[] bytes, int index, int size) throws be8 {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i = index + size;
            char[] cArr = new char[size];
            int i2 = 0;
            while (index < i) {
                byte b = bytes[index];
                if (!C9057a.isOneByte(b)) {
                    break;
                }
                index++;
                C9057a.handleOneByte(b, cArr, i2);
                i2++;
            }
            int i3 = i2;
            while (index < i) {
                int i4 = index + 1;
                byte b2 = bytes[index];
                if (C9057a.isOneByte(b2)) {
                    int i5 = i3 + 1;
                    C9057a.handleOneByte(b2, cArr, i3);
                    while (i4 < i) {
                        byte b3 = bytes[i4];
                        if (!C9057a.isOneByte(b3)) {
                            break;
                        }
                        i4++;
                        C9057a.handleOneByte(b3, cArr, i5);
                        i5++;
                    }
                    i3 = i5;
                    index = i4;
                } else if (C9057a.isTwoBytes(b2)) {
                    if (i4 >= i) {
                        throw be8.m3077d();
                    }
                    index += 2;
                    C9057a.handleTwoBytes(b2, bytes[i4], cArr, i3);
                    i3++;
                } else if (C9057a.isThreeBytes(b2)) {
                    if (i4 >= i - 1) {
                        throw be8.m3077d();
                    }
                    int i6 = index + 2;
                    index += 3;
                    C9057a.handleThreeBytes(b2, bytes[i4], bytes[i6], cArr, i3);
                    i3++;
                } else {
                    if (i4 >= i - 2) {
                        throw be8.m3077d();
                    }
                    byte b4 = bytes[i4];
                    int i7 = index + 3;
                    byte b5 = bytes[index + 2];
                    index += 4;
                    C9057a.handleFourBytes(b2, b4, b5, bytes[i7], cArr, i3);
                    i3 += 2;
                }
            }
            return new String(cArr, 0, i3);
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: d */
        public String mo16509d(ByteBuffer buffer, int index, int size) throws be8 {
            return m16508c(buffer, index, size);
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: e */
        public int mo16510e(String in, byte[] out, int offset, int length) {
            int i;
            int i2;
            char cCharAt;
            int length2 = in.length();
            int i3 = length + offset;
            int i4 = 0;
            while (i4 < length2 && (i2 = i4 + offset) < i3 && (cCharAt = in.charAt(i4)) < 128) {
                out[i2] = (byte) cCharAt;
                i4++;
            }
            if (i4 == length2) {
                return offset + length2;
            }
            int i5 = offset + i4;
            while (i4 < length2) {
                char cCharAt2 = in.charAt(i4);
                if (cCharAt2 < 128 && i5 < i3) {
                    out[i5] = (byte) cCharAt2;
                    i5++;
                } else if (cCharAt2 < 2048 && i5 <= i3 - 2) {
                    int i6 = i5 + 1;
                    out[i5] = (byte) ((cCharAt2 >>> 6) | 960);
                    i5 += 2;
                    out[i6] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i5 > i3 - 3) {
                        if (i5 > i3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i4 + 1) == in.length() || !Character.isSurrogatePair(cCharAt2, in.charAt(i)))) {
                                throw new C9060d(i4, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i5);
                        }
                        int i7 = i4 + 1;
                        if (i7 != in.length()) {
                            char cCharAt3 = in.charAt(i7);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                out[i5] = (byte) ((codePoint >>> 18) | 240);
                                out[i5 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i8 = i5 + 3;
                                out[i5 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i5 += 4;
                                out[i8] = (byte) ((codePoint & 63) | 128);
                                i4 = i7;
                            } else {
                                i4 = i7;
                            }
                        }
                        throw new C9060d(i4 - 1, length2);
                    }
                    out[i5] = (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01);
                    int i9 = i5 + 2;
                    out[i5 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i5 += 3;
                    out[i9] = (byte) ((cCharAt2 & '?') | 128);
                }
                i4++;
            }
            return i5;
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: h */
        public void mo16513h(String in, ByteBuffer out) {
            m16512g(in, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo16517l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = p000.lzh.m16483a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = p000.lzh.m16483a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = p000.lzh.m16484b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.C9059c.mo16517l(int, byte[], int, int):int");
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: n */
        public int mo16519n(int state, ByteBuffer buffer, int index, int limit) {
            return m16518m(state, buffer, index, limit);
        }
    }

    /* JADX INFO: renamed from: lzh$d */
    public static class C9060d extends IllegalArgumentException {
        public C9060d(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static {
        f59471a = (!C9061e.m16520o() || C9958no.m18046b()) ? new C9059c() : new C9061e();
    }

    private lzh() {
    }

    private static int encodedLengthGeneral(String string, int start) {
        int length = string.length();
        int i = 0;
        while (start < length) {
            char cCharAt = string.charAt(start);
            if (cCharAt < 2048) {
                i += (127 - cCharAt) >>> 31;
            } else {
                i += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(string, start) < 65536) {
                        throw new C9060d(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i = limit - 7;
        int i2 = index;
        while (i2 < i && (buffer.getLong(i2) & (-9187201950435737472L)) == 0) {
            i2 += 8;
        }
        return i2 - index;
    }

    /* JADX INFO: renamed from: g */
    public static String m16489g(ByteBuffer buffer, int index, int size) throws be8 {
        return f59471a.m16506a(buffer, index, size);
    }

    /* JADX INFO: renamed from: h */
    public static String m16490h(byte[] bytes, int index, int size) throws be8 {
        return f59471a.mo16507b(bytes, index, size);
    }

    /* JADX INFO: renamed from: i */
    public static int m16491i(String in, byte[] out, int offset, int length) {
        return f59471a.mo16510e(in, out, offset, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    /* JADX INFO: renamed from: j */
    public static void m16492j(String in, ByteBuffer out) {
        f59471a.m16511f(in, out);
    }

    /* JADX INFO: renamed from: k */
    public static int m16493k(String string) {
        int length = string.length();
        int i = 0;
        while (i < length && string.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = string.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(string, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16494l(ByteBuffer buffer) {
        return f59471a.m16514i(buffer, buffer.position(), buffer.remaining());
    }

    /* JADX INFO: renamed from: m */
    public static boolean m16495m(byte[] bytes) {
        return f59471a.m16515j(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m16496n(byte[] bytes, int index, int limit) {
        return f59471a.m16515j(bytes, index, limit);
    }

    /* JADX INFO: renamed from: o */
    public static int m16497o(int state, ByteBuffer buffer, int index, int limit) {
        return f59471a.m16516k(state, buffer, index, limit);
    }

    /* JADX INFO: renamed from: p */
    public static int m16498p(int state, byte[] bytes, int index, int limit) {
        return f59471a.mo16517l(state, bytes, index, limit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    /* JADX INFO: renamed from: lzh$e */
    public static final class C9061e extends AbstractC9058b {
        /* JADX INFO: renamed from: o */
        public static boolean m16520o() {
            return evh.m10256J() && evh.m10257K();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(final byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = p000.evh.m10298u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = p000.evh.m10298u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = p000.evh.m10298u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = p000.evh.m10298u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = p000.evh.m10298u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = p000.evh.m10298u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = p000.evh.m10298u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.C9061e.partialIsValidUtf8(byte[], long, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i2 = 8 - (((int) offset) & 7);
            while (i < i2) {
                long j = 1 + offset;
                if (evh.m10298u(bytes, offset) < 0) {
                    return i;
                }
                i++;
                offset = j;
            }
            while (true) {
                int i3 = i + 8;
                if (i3 > maxChars || (evh.m10250D(bytes, evh.f34198h + offset) & (-9187201950435737472L)) != 0) {
                    break;
                }
                offset += 8;
                i = i3;
            }
            while (i < maxChars) {
                long j2 = offset + 1;
                if (evh.m10298u(bytes, offset) < 0) {
                    return i;
                }
                i++;
                offset = j2;
            }
            return maxChars;
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return lzh.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return lzh.incompleteStateFor(byte1, evh.m10298u(bytes, offset));
            }
            if (remaining == 2) {
                return lzh.incompleteStateFor(byte1, evh.m10298u(bytes, offset), evh.m10298u(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: b */
        public String mo16507b(byte[] bytes, int index, int size) throws be8 {
            Charset charset = v98.f90380b;
            String str = new String(bytes, index, size, charset);
            if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw be8.m3077d();
            }
            return str;
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: d */
        public String mo16509d(ByteBuffer buffer, int index, int size) throws be8 {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jM10288k = evh.m10288k(buffer) + ((long) index);
            long j = ((long) size) + jM10288k;
            char[] cArr = new char[size];
            int i = 0;
            while (jM10288k < j) {
                byte bM10296s = evh.m10296s(jM10288k);
                if (!C9057a.isOneByte(bM10296s)) {
                    break;
                }
                jM10288k++;
                C9057a.handleOneByte(bM10296s, cArr, i);
                i++;
            }
            int i2 = i;
            while (jM10288k < j) {
                long j2 = jM10288k + 1;
                byte bM10296s2 = evh.m10296s(jM10288k);
                if (C9057a.isOneByte(bM10296s2)) {
                    int i3 = i2 + 1;
                    C9057a.handleOneByte(bM10296s2, cArr, i2);
                    while (j2 < j) {
                        byte bM10296s3 = evh.m10296s(j2);
                        if (!C9057a.isOneByte(bM10296s3)) {
                            break;
                        }
                        j2++;
                        C9057a.handleOneByte(bM10296s3, cArr, i3);
                        i3++;
                    }
                    i2 = i3;
                    jM10288k = j2;
                } else if (C9057a.isTwoBytes(bM10296s2)) {
                    if (j2 >= j) {
                        throw be8.m3077d();
                    }
                    jM10288k += 2;
                    C9057a.handleTwoBytes(bM10296s2, evh.m10296s(j2), cArr, i2);
                    i2++;
                } else if (C9057a.isThreeBytes(bM10296s2)) {
                    if (j2 >= j - 1) {
                        throw be8.m3077d();
                    }
                    long j3 = 2 + jM10288k;
                    jM10288k += 3;
                    C9057a.handleThreeBytes(bM10296s2, evh.m10296s(j2), evh.m10296s(j3), cArr, i2);
                    i2++;
                } else {
                    if (j2 >= j - 2) {
                        throw be8.m3077d();
                    }
                    byte bM10296s4 = evh.m10296s(j2);
                    long j4 = 3 + jM10288k;
                    byte bM10296s5 = evh.m10296s(2 + jM10288k);
                    jM10288k += 4;
                    C9057a.handleFourBytes(bM10296s2, bM10296s4, bM10296s5, evh.m10296s(j4), cArr, i2);
                    i2 += 2;
                }
            }
            return new String(cArr, 0, i2);
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: e */
        public int mo16510e(final String in, final byte[] out, final int offset, final int length) {
            long j;
            String str;
            String str2;
            int i;
            long j2;
            long j3;
            char cCharAt;
            long j4 = offset;
            long j5 = ((long) length) + j4;
            int length2 = in.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i2 = 0;
            while (true) {
                j = 1;
                if (i2 >= length2 || (cCharAt = in.charAt(i2)) >= 128) {
                    break;
                }
                evh.m10265S(out, j4, (byte) cCharAt);
                i2++;
                j4 = 1 + j4;
            }
            if (i2 == length2) {
                return (int) j4;
            }
            while (i2 < length2) {
                char cCharAt2 = in.charAt(i2);
                if (cCharAt2 >= 128 || j4 >= j5) {
                    if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                            if (j4 > j5 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length2 || !Character.isSurrogatePair(cCharAt2, in.charAt(i)))) {
                                    throw new C9060d(i2, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j4);
                            }
                            int i3 = i2 + 1;
                            if (i3 != length2) {
                                char cCharAt3 = in.charAt(i3);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j2 = 1;
                                    evh.m10265S(out, j4, (byte) ((codePoint >>> 18) | 240));
                                    j3 = j5;
                                    evh.m10265S(out, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = j4 + 3;
                                    evh.m10265S(out, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    evh.m10265S(out, j6, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new C9060d(i2 - 1, length2);
                        }
                        evh.m10265S(out, j4, (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                        long j7 = j4 + 2;
                        evh.m10265S(out, j4 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j4 += 3;
                        evh.m10265S(out, j7, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j8 = j4 + j;
                        evh.m10265S(out, j4, (byte) ((cCharAt2 >>> 6) | 960));
                        j4 += 2;
                        evh.m10265S(out, j8, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j3 = j5;
                    j2 = 1;
                } else {
                    evh.m10265S(out, j4, (byte) cCharAt2);
                    j3 = j5;
                    str2 = str4;
                    j2 = j;
                    j4 += j;
                    str = str3;
                }
                i2++;
                str3 = str;
                str4 = str2;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: h */
        public void mo16513h(String in, ByteBuffer out) {
            long j;
            char c;
            long j2;
            int i;
            int i2;
            char c2;
            char cCharAt;
            long jM10288k = evh.m10288k(out);
            long jPosition = ((long) out.position()) + jM10288k;
            long jLimit = ((long) out.limit()) + jM10288k;
            int length = in.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i3 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i3 >= length || (cCharAt = in.charAt(i3)) >= 128) {
                    break;
                }
                evh.m10263Q(jPosition, (byte) cCharAt);
                i3++;
                jPosition = 1 + jPosition;
            }
            if (i3 == length) {
                mi8.m17327e(out, (int) (jPosition - jM10288k));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = in.charAt(i3);
                if (cCharAt2 >= c || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j2 = jM10288k;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i3 + 1) == length || !Character.isSurrogatePair(cCharAt2, in.charAt(i)))) {
                                    throw new C9060d(i3, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i2 = i3 + 1;
                            if (i2 != length) {
                                char cCharAt3 = in.charAt(i2);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    evh.m10263Q(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c2 = 128;
                                    evh.m10263Q(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j3 = jPosition + 3;
                                    evh.m10263Q(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    evh.m10263Q(j3, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i3 = i2;
                                }
                            }
                            throw new C9060d(i3 - 1, length);
                        }
                        long j4 = jPosition + j;
                        evh.m10263Q(jPosition, (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                        long j5 = jPosition + 2;
                        evh.m10263Q(j4, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        evh.m10263Q(j5, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j2 = jM10288k;
                        long j6 = jPosition + j;
                        evh.m10263Q(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        evh.m10263Q(j6, (byte) ((cCharAt2 & '?') | 128));
                    }
                    i2 = i3;
                    c2 = 128;
                } else {
                    evh.m10263Q(jPosition, (byte) cCharAt2);
                    j2 = jM10288k;
                    i2 = i3;
                    c2 = c;
                    jPosition += j;
                }
                c = c2;
                jM10288k = j2;
                j = 1;
                i3 = i2 + 1;
            }
            mi8.m17327e(out, (int) (jPosition - jM10288k));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (p000.evh.m10298u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (p000.evh.m10298u(r12, r0) > (-65)) goto L59;
         */
        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo16517l(int r11, byte[] r12, final int r13, final int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = p000.evh.m10298u(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = p000.evh.m10298u(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = p000.lzh.m16483a(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = p000.evh.m10298u(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = p000.evh.m10298u(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = p000.lzh.m16483a(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = p000.evh.m10298u(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = p000.lzh.m16484b(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = p000.evh.m10298u(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.C9061e.mo16517l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (p000.evh.m10296s(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (p000.evh.m10296s(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (p000.evh.m10296s(r0) > (-65)) goto L57;
         */
        @Override // p000.lzh.AbstractC9058b
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo16519n(final int r10, java.nio.ByteBuffer r11, final int r12, final int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.C9061e.mo16519n(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i = (int) ((-address) & 7);
            int i2 = i;
            while (i2 > 0) {
                long j = 1 + address;
                if (evh.m10296s(address) < 0) {
                    return i - i2;
                }
                i2--;
                address = j;
            }
            int i3 = maxChars - i;
            while (i3 >= 8 && (evh.m10249C(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i3 -= 8;
            }
            return maxChars - i3;
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return lzh.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return lzh.incompleteStateFor(byte1, evh.m10296s(address));
            }
            if (remaining == 2) {
                return lzh.incompleteStateFor(byte1, evh.m10296s(address), evh.m10296s(address + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = p000.evh.m10296s(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = p000.evh.m10296s(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = p000.evh.m10296s(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = p000.evh.m10296s(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = p000.evh.m10296s(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = p000.evh.m10296s(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = p000.evh.m10296s(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lzh.C9061e.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b = bytes[index - 1];
        int i = limit - index;
        if (i == 0) {
            return incompleteStateFor(b);
        }
        if (i == 1) {
            return incompleteStateFor(b, bytes[index]);
        }
        if (i == 2) {
            return incompleteStateFor(b, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }
}
