package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class bvh {
    private bvh() {
    }

    public static wj1 unsafeWrap(byte[] buffer) {
        return wj1.m24595n(buffer);
    }

    public static void unsafeWriteTo(wj1 bytes, nj1 output) throws IOException {
        bytes.mo9868p(output);
    }

    public static wj1 unsafeWrap(byte[] buffer, int offset, int length) {
        return wj1.m24596o(buffer, offset, length);
    }

    public static wj1 unsafeWrap(ByteBuffer buffer) {
        return wj1.m24594m(buffer);
    }
}
