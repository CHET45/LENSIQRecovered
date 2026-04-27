package p000;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface z31 {
    ja9<Bitmap> decodeBitmap(byte[] bArr);

    ja9<Bitmap> loadBitmap(Uri uri);

    @hib
    default ja9<Bitmap> loadBitmapFromMetadata(iga igaVar) {
        byte[] bArr = igaVar.f46898H;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = igaVar.f46900M;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
