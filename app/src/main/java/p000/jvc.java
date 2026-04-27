package p000;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes6.dex */
public final class jvc implements nv7 {
    @Override // p000.nv7
    public void loadImage(Context context, ImageView imageView, String str) {
        Picasso.with(context).load(str).priority(Picasso.Priority.HIGH).centerInside().into(imageView);
    }
}
