package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class rif implements wta {
    @hib
    /* JADX INFO: renamed from: a */
    public abstract eta mo2551a(aua auaVar, ByteBuffer byteBuffer);

    @Override // p000.wta
    @hib
    public final eta decode(aua auaVar) {
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(auaVar.f78608d);
        v80.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo2551a(auaVar, byteBuffer);
    }
}
