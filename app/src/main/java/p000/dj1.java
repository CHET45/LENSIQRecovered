package p000;

import com.bumptech.glide.load.data.InterfaceC2493a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class dj1 implements InterfaceC2493a<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f29775a;

    /* JADX INFO: renamed from: dj1$a */
    public static class C4801a implements InterfaceC2493a.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC2493a.a
        @efb
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2493a.a
        @efb
        public InterfaceC2493a<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new dj1(byteBuffer);
        }
    }

    public dj1(ByteBuffer byteBuffer) {
        this.f29775a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2493a
    public void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2493a
    @efb
    public ByteBuffer rewindAndGet() {
        this.f29775a.position(0);
        return this.f29775a;
    }
}
