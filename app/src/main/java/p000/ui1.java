package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@c5e(api = 28)
public final class ui1 implements b6e<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final w31 f88035a = new w31();

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb ByteBuffer byteBuffer, int i, int i2, @efb i7c i7cVar) throws IOException {
        return this.f88035a.decode2(ImageDecoder.createSource(byteBuffer), i, i2, i7cVar);
    }

    @Override // p000.b6e
    public boolean handles(@efb ByteBuffer byteBuffer, @efb i7c i7cVar) throws IOException {
        return true;
    }
}
