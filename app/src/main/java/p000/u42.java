package p000;

import android.content.ClipData;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class u42 {

    /* JADX INFO: renamed from: b */
    public static final int f86753b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ClipData f86754a;

    public u42(@yfb ClipData clipData) {
        this.f86754a = clipData;
    }

    @yfb
    public final ClipData getClipData() {
        return this.f86754a;
    }

    @yfb
    public final w42 getClipMetadata() {
        return C7562iq.toClipMetadata(this.f86754a.getDescription());
    }
}
