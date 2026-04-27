package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: loaded from: classes8.dex */
public class ouf {
    private ouf() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean batch(mii miiVar, ByteChannel byteChannel) throws IOException {
        bri briVar;
        if (miiVar == null) {
            return false;
        }
        ByteBuffer byteBufferPeek = miiVar.f61109b.peek();
        if (byteBufferPeek == null) {
            if (byteChannel instanceof bri) {
                briVar = (bri) byteChannel;
                if (briVar.isNeedWrite()) {
                    briVar.writeMore();
                }
            }
            if (miiVar.f61109b.isEmpty() && miiVar.isFlushAndClose() && miiVar.getDraft() != null && miiVar.getDraft().getRole() != null && miiVar.getDraft().getRole() == kae.SERVER) {
                miiVar.closeConnection();
            }
            return (briVar == null && ((bri) byteChannel).isNeedWrite()) ? false : true;
        }
        do {
            byteChannel.write(byteBufferPeek);
            if (byteBufferPeek.remaining() > 0) {
                return false;
            }
            miiVar.f61109b.poll();
            byteBufferPeek = miiVar.f61109b.peek();
        } while (byteBufferPeek != null);
        briVar = null;
        if (miiVar.f61109b.isEmpty()) {
            miiVar.closeConnection();
        }
        if (briVar == null) {
        }
    }

    public static boolean read(ByteBuffer byteBuffer, mii miiVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int i = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (i != -1) {
            return i != 0;
        }
        miiVar.eot();
        return false;
    }

    public static boolean readMore(ByteBuffer byteBuffer, mii miiVar, bri briVar) throws IOException {
        byteBuffer.clear();
        int more = briVar.readMore(byteBuffer);
        byteBuffer.flip();
        if (more != -1) {
            return briVar.isNeedRead();
        }
        miiVar.eot();
        return false;
    }
}
