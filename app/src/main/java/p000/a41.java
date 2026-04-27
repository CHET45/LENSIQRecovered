package p000;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface a41 {
    ja9<Bitmap> decodeBitmap(byte[] bArr);

    ja9<Bitmap> loadBitmap(Uri uri);

    @hib
    default ja9<Bitmap> loadBitmapFromMetadata(hga hgaVar) {
        byte[] bArr = hgaVar.f43547k;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = hgaVar.f43549m;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }

    boolean supportsMimeType(String str);
}
