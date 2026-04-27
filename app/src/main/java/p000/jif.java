package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.ul3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class jif extends ul3 {

    /* JADX INFO: renamed from: d */
    public final ul3.InterfaceC13578a<jif> f50682d;

    /* JADX INFO: renamed from: e */
    @hib
    public ByteBuffer f50683e;

    public jif(ul3.InterfaceC13578a<jif> interfaceC13578a) {
        this.f50682d = interfaceC13578a;
    }

    @Override // p000.bf1
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f50683e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.f88311b = j;
        ByteBuffer byteBuffer = this.f50683e;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f50683e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f50683e.position(0);
        this.f50683e.limit(i);
        return this.f50683e;
    }

    @Override // p000.ul3
    public void release() {
        this.f50682d.releaseOutputBuffer(this);
    }
}
