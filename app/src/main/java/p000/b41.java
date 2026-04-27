package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class b41 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f12649a;

    /* JADX INFO: renamed from: b */
    public int f12650b;

    /* JADX INFO: renamed from: c */
    public Rect f12651c;

    public b41(@efb Context context, @efb Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @efb
    public owa build() {
        return new owa(new d8j(this.f12649a), this.f12650b, this.f12651c, 0L, this.f12649a.getWidth(), this.f12649a.getHeight());
    }

    @efb
    public b41 setRotation(int i) {
        owa.m19068c(i);
        this.f12650b = i;
        return this;
    }

    public b41(@efb Bitmap bitmap) {
        this.f12649a = bitmap;
        this.f12650b = 0;
        this.f12651c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
