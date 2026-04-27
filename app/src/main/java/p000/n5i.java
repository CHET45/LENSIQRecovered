package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import p000.f6i;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class n5i extends f6i<ParcelFileDescriptor> {
    public n5i(Context context) {
        this(ComponentCallbacks2C2485a.get(context).getBitmapPool());
    }

    public n5i(e41 e41Var) {
        super(e41Var, new f6i.C5650g());
    }
}
