package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public interface jmg<R> extends e59 {

    /* JADX INFO: renamed from: b1 */
    public static final int f51269b1 = Integer.MIN_VALUE;

    @hib
    q3e getRequest();

    void getSize(@efb gqf gqfVar);

    void onLoadCleared(@hib Drawable drawable);

    void onLoadFailed(@hib Drawable drawable);

    void onLoadStarted(@hib Drawable drawable);

    void onResourceReady(@efb R r, @hib afh<? super R> afhVar);

    void removeCallback(@efb gqf gqfVar);

    void setRequest(@hib q3e q3eVar);
}
