package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class si1 implements b6e<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final in4 f81909a;

    public si1(in4 in4Var) {
        this.f81909a = in4Var;
    }

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb ByteBuffer byteBuffer, int i, int i2, @efb i7c i7cVar) throws IOException {
        return this.f81909a.decode(byteBuffer, i, i2, i7cVar);
    }

    @Override // p000.b6e
    public boolean handles(@efb ByteBuffer byteBuffer, @efb i7c i7cVar) {
        return this.f81909a.handles(byteBuffer);
    }
}
