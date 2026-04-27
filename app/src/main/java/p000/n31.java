package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class n31 implements g6e<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final e41 f63107a;

    /* JADX INFO: renamed from: b */
    public final g6e<Bitmap> f63108b;

    public n31(e41 e41Var, g6e<Bitmap> g6eVar) {
        this.f63107a = e41Var;
        this.f63108b = g6eVar;
    }

    @Override // p000.g6e
    @efb
    public g15 getEncodeStrategy(@efb i7c i7cVar) {
        return this.f63108b.getEncodeStrategy(i7cVar);
    }

    @Override // p000.n15
    public boolean encode(@efb t5e<BitmapDrawable> t5eVar, @efb File file, @efb i7c i7cVar) {
        return this.f63108b.encode((Bitmap) new i41(t5eVar.get().getBitmap(), this.f63107a), file, i7cVar);
    }
}
