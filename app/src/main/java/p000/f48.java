package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@c5e(api = 28)
public final class f48 implements b6e<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final w31 f35031a = new w31();

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb InputStream inputStream, int i, int i2, @efb i7c i7cVar) throws IOException {
        return this.f35031a.decode2(ImageDecoder.createSource(ej1.fromStream(inputStream)), i, i2, i7cVar);
    }

    @Override // p000.b6e
    public boolean handles(@efb InputStream inputStream, @efb i7c i7cVar) throws IOException {
        return true;
    }
}
