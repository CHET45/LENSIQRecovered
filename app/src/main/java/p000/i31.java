package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class i31 implements c7e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    public final Bitmap.CompressFormat f45567a;

    /* JADX INFO: renamed from: b */
    public final int f45568b;

    public i31() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p000.c7e
    @hib
    public t5e<byte[]> transcode(@efb t5e<Bitmap> t5eVar, @efb i7c i7cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        t5eVar.get().compress(this.f45567a, this.f45568b, byteArrayOutputStream);
        t5eVar.recycle();
        return new ek1(byteArrayOutputStream.toByteArray());
    }

    public i31(@efb Bitmap.CompressFormat compressFormat, int i) {
        this.f45567a = compressFormat;
        this.f45568b = i;
    }
}
