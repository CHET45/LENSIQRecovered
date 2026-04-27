package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j31 extends do1<Bitmap> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.do1
    public Bitmap parseNetworkResponse(Response response, int i) throws Exception {
        return BitmapFactory.decodeStream(response.body().byteStream());
    }
}
