package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hq4<T extends Drawable> implements t5e<T>, l18 {

    /* JADX INFO: renamed from: a */
    public final T f44522a;

    public hq4(T t) {
        this.f44522a = (T) t7d.checkNotNull(t);
    }

    @Override // p000.l18
    public void initialize() {
        T t = this.f44522a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).getFirstFrame().prepareToDraw();
        }
    }

    @Override // p000.t5e
    @efb
    public final T get() {
        Drawable.ConstantState constantState = this.f44522a.getConstantState();
        return constantState == null ? this.f44522a : (T) constantState.newDrawable();
    }
}
