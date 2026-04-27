package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@c5e(api = 28)
public final class w31 implements b6e<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final String f93145b = "BitmapImageDecoder";

    /* JADX INFO: renamed from: a */
    public final e41 f93146a = new f41();

    @Override // p000.b6e
    public /* bridge */ /* synthetic */ t5e<Bitmap> decode(@efb ImageDecoder.Source source, int i, int i2, @efb i7c i7cVar) throws IOException {
        return decode2(v31.m23764a(source), i, i2, i7cVar);
    }

    @Override // p000.b6e
    public /* bridge */ /* synthetic */ boolean handles(@efb ImageDecoder.Source source, @efb i7c i7cVar) throws IOException {
        return handles2(v31.m23764a(source), i7cVar);
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public t5e<Bitmap> decode2(@efb ImageDecoder.Source source, int i, int i2, @efb i7c i7cVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new ux3(i, i2, i7cVar));
        if (Log.isLoggable(f93145b, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(bitmapDecodeBitmap.getWidth());
            sb.append("x");
            sb.append(bitmapDecodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new i41(bitmapDecodeBitmap, this.f93146a);
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@efb ImageDecoder.Source source, @efb i7c i7cVar) throws IOException {
        return true;
    }
}
