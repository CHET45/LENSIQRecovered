package p000;

import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class i67 extends hq4<GifDrawable> implements l18 {
    public i67(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // p000.t5e
    @efb
    public Class<GifDrawable> getResourceClass() {
        return GifDrawable.class;
    }

    @Override // p000.t5e
    public int getSize() {
        return ((GifDrawable) this.f44522a).getSize();
    }

    @Override // p000.hq4, p000.l18
    public void initialize() {
        ((GifDrawable) this.f44522a).getFirstFrame().prepareToDraw();
    }

    @Override // p000.t5e
    public void recycle() {
        ((GifDrawable) this.f44522a).stop();
        ((GifDrawable) this.f44522a).recycle();
    }
}
