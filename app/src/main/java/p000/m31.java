package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class m31<DataType> implements b6e<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final b6e<DataType, Bitmap> f59799a;

    /* JADX INFO: renamed from: b */
    public final Resources f59800b;

    public m31(Context context, b6e<DataType, Bitmap> b6eVar) {
        this(context.getResources(), b6eVar);
    }

    @Override // p000.b6e
    public t5e<BitmapDrawable> decode(@efb DataType datatype, int i, int i2, @efb i7c i7cVar) throws IOException {
        return jx8.obtain(this.f59800b, this.f59799a.decode(datatype, i, i2, i7cVar));
    }

    @Override // p000.b6e
    public boolean handles(@efb DataType datatype, @efb i7c i7cVar) throws IOException {
        return this.f59799a.handles(datatype, i7cVar);
    }

    @Deprecated
    public m31(Resources resources, e41 e41Var, b6e<DataType, Bitmap> b6eVar) {
        this(resources, b6eVar);
    }

    public m31(@efb Resources resources, @efb b6e<DataType, Bitmap> b6eVar) {
        this.f59800b = (Resources) t7d.checkNotNull(resources);
        this.f59799a = (b6e) t7d.checkNotNull(b6eVar);
    }
}
