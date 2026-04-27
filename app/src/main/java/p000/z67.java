package p000;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class z67 implements nv7 {
    @Override // p000.nv7
    public void loadImage(Context context, ImageView imageView, String str) {
        ComponentCallbacks2C2485a.with(context).load(str).apply(new RequestOptions().priority(Priority.HIGH).fitCenter()).into(imageView);
    }
}
