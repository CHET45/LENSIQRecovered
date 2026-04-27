package p000;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "FileUtil")
@p7e({p7e.EnumC10826a.f69936c})
public final class wt5 {
    @igg({"LambdaLast"})
    public static final void copy(@yfb ReadableByteChannel readableByteChannel, @yfb FileChannel fileChannel) throws IOException {
        md8.checkNotNullParameter(readableByteChannel, "input");
        md8.checkNotNullParameter(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
