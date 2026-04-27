package p000;

import android.graphics.Rect;
import android.media.Image;

/* JADX INFO: loaded from: classes5.dex */
@c5e(19)
public class ria {

    /* JADX INFO: renamed from: a */
    public final Image f78393a;

    /* JADX INFO: renamed from: b */
    public int f78394b = 0;

    /* JADX INFO: renamed from: c */
    public Rect f78395c;

    public ria(@efb Image image) {
        this.f78393a = image;
        this.f78395c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @efb
    public owa build() {
        return new owa(new v8j(this.f78393a), this.f78394b, this.f78395c, 0L, this.f78393a.getWidth(), this.f78393a.getHeight());
    }

    @efb
    public ria setRotation(int i) {
        owa.m19068c(i);
        this.f78394b = i;
        return this;
    }
}
