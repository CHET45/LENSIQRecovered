package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class s2h extends m7e {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f80451b;

    public s2h(@efb Context context, @efb Resources resources) {
        super(resources);
        this.f80451b = new WeakReference<>(context);
    }

    @Override // p000.m7e, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableM17115a = m17115a(i);
        Context context = this.f80451b.get();
        if (drawableM17115a != null && context != null) {
            n6e.get().m17797f(context, i, drawableM17115a);
        }
        return drawableM17115a;
    }
}
