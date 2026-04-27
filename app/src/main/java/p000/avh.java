package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class avh {
    private avh() {
    }

    public static vj1 unsafeWrap(byte[] buffer) {
        return vj1.m24018m(buffer);
    }

    public static void unsafeWriteTo(vj1 bytes, mj1 output) throws IOException {
        bytes.mo9056o(output);
    }

    public static vj1 unsafeWrap(byte[] buffer, int offset, int length) {
        return vj1.m24019n(buffer, offset, length);
    }

    public static vj1 unsafeWrap(ByteBuffer buffer) {
        return vj1.m24017l(buffer);
    }
}
