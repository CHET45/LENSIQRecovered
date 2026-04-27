package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class u5e implements b6e<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final f6e f86853a;

    /* JADX INFO: renamed from: b */
    public final e41 f86854b;

    public u5e(f6e f6eVar, e41 e41Var) {
        this.f86853a = f6eVar;
        this.f86854b = e41Var;
    }

    @Override // p000.b6e
    @hib
    public t5e<Bitmap> decode(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        t5e<Drawable> t5eVarDecode = this.f86853a.decode(uri, i, i2, i7cVar);
        if (t5eVarDecode == null) {
            return null;
        }
        return jq4.m14232a(this.f86854b, t5eVarDecode.get(), i, i2);
    }

    @Override // p000.b6e
    public boolean handles(@efb Uri uri, @efb i7c i7cVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
