package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class qif implements vta {
    @hib
    /* JADX INFO: renamed from: a */
    public abstract Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer);

    @Override // p000.vta
    @hib
    public final Metadata decode(zta ztaVar) {
        ByteBuffer byteBuffer = (ByteBuffer) u80.checkNotNull(ztaVar.f82162d);
        u80.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (ztaVar.isDecodeOnly()) {
            return null;
        }
        return mo3372a(ztaVar, byteBuffer);
    }
}
