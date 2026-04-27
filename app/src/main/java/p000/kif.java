package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.tl3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class kif extends tl3 {

    /* JADX INFO: renamed from: e */
    public final tl3.InterfaceC13090a<kif> f54232e;

    /* JADX INFO: renamed from: f */
    @hib
    public ByteBuffer f54233f;

    public kif(tl3.InterfaceC13090a<kif> interfaceC13090a) {
        this.f54232e = interfaceC13090a;
    }

    @Override // p000.tl3, p000.cf1
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f54233f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer grow(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(this.f54233f);
        v80.checkArgument(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        this.f54233f = byteBufferOrder;
        return byteBufferOrder;
    }

    public ByteBuffer init(long j, int i) {
        this.f85177b = j;
        ByteBuffer byteBuffer = this.f54233f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f54233f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f54233f.position(0);
        this.f54233f.limit(i);
        return this.f54233f;
    }

    @Override // p000.tl3
    public void release() {
        this.f54232e.releaseOutputBuffer(this);
    }
}
