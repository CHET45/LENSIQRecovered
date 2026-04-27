package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class l67 implements b6e<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final e41 f56332a;

    public l67(e41 e41Var) {
        this.f56332a = e41Var;
    }

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb GifDecoder gifDecoder, int i, int i2, @efb i7c i7cVar) {
        return i41.obtain(gifDecoder.getNextFrame(), this.f56332a);
    }

    @Override // p000.b6e
    public boolean handles(@efb GifDecoder gifDecoder, @efb i7c i7cVar) {
        return true;
    }
}
