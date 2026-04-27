package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jm8 implements Closeable {

    /* JADX INFO: renamed from: m */
    public static final String[] f51173m = new String[128];

    /* JADX INFO: renamed from: a */
    public int f51174a;

    /* JADX INFO: renamed from: b */
    public int[] f51175b = new int[32];

    /* JADX INFO: renamed from: c */
    public String[] f51176c = new String[32];

    /* JADX INFO: renamed from: d */
    public int[] f51177d = new int[32];

    /* JADX INFO: renamed from: e */
    public boolean f51178e;

    /* JADX INFO: renamed from: f */
    public boolean f51179f;

    /* JADX INFO: renamed from: jm8$a */
    public static final class C7981a {

        /* JADX INFO: renamed from: a */
        public final String[] f51180a;

        /* JADX INFO: renamed from: b */
        public final Options f51181b;

        private C7981a(String[] strArr, Options options) {
            this.f51180a = strArr;
            this.f51181b = options;
        }

        /* JADX INFO: renamed from: of */
        public static C7981a m14177of(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    jm8.string(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new C7981a((String[]) strArr.clone(), Options.m18747of(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: jm8$b */
    public enum EnumC7982b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f51173m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f51173m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: of */
    public static jm8 m14174of(BufferedSource bufferedSource) {
        return new xm8(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void string(okio.BufferedSink r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = p000.jm8.f51173m
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jm8.string(okio.BufferedSink, java.lang.String):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m14175b(int i) {
        int i2 = this.f51174a;
        int[] iArr = this.f51175b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new nk8("Nesting too deep at " + getPath());
            }
            this.f51175b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f51176c;
            this.f51176c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f51177d;
            this.f51177d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f51175b;
        int i3 = this.f51174a;
        this.f51174a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    /* JADX INFO: renamed from: c */
    public final gl8 m14176c(String str) throws gl8 {
        throw new gl8(str + " at path " + getPath());
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        return lm8.m16229a(this.f51174a, this.f51175b, this.f51176c, this.f51177d);
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract EnumC7982b peek() throws IOException;

    public abstract int selectName(C7981a c7981a) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;
}
