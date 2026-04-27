package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class e67 implements GifDecoder.BitmapProvider {

    /* JADX INFO: renamed from: a */
    public final e41 f31899a;

    /* JADX INFO: renamed from: b */
    @hib
    public final z60 f31900b;

    public e67(e41 e41Var) {
        this(e41Var, null);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @efb
    public Bitmap obtain(int i, int i2, @efb Bitmap.Config config) {
        return this.f31899a.getDirty(i, i2, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @efb
    public byte[] obtainByteArray(int i) {
        z60 z60Var = this.f31900b;
        return z60Var == null ? new byte[i] : (byte[]) z60Var.get(i, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @efb
    public int[] obtainIntArray(int i) {
        z60 z60Var = this.f31900b;
        return z60Var == null ? new int[i] : (int[]) z60Var.get(i, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@efb Bitmap bitmap) {
        this.f31899a.put(bitmap);
    }

    public e67(e41 e41Var, @hib z60 z60Var) {
        this.f31899a = e41Var;
        this.f31900b = z60Var;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@efb byte[] bArr) {
        z60 z60Var = this.f31900b;
        if (z60Var == null) {
            return;
        }
        z60Var.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@efb int[] iArr) {
        z60 z60Var = this.f31900b;
        if (z60Var == null) {
            return;
        }
        z60Var.put(iArr);
    }
}
