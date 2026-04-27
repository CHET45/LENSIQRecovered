package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes4.dex */
public class lhb extends xd3<Bitmap> {

    /* JADX INFO: renamed from: C */
    public final Notification f57622C;

    /* JADX INFO: renamed from: F */
    public final int f57623F;

    /* JADX INFO: renamed from: d */
    public final RemoteViews f57624d;

    /* JADX INFO: renamed from: e */
    public final Context f57625e;

    /* JADX INFO: renamed from: f */
    public final int f57626f;

    /* JADX INFO: renamed from: m */
    public final String f57627m;

    public lhb(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    private void setBitmap(@hib Bitmap bitmap) {
        this.f57624d.setImageViewBitmap(this.f57623F, bitmap);
        update();
    }

    private void update() {
        ((NotificationManager) t7d.checkNotNull((NotificationManager) this.f57625e.getSystemService("notification"))).notify(this.f57627m, this.f57626f, this.f57622C);
    }

    @Override // p000.jmg
    public void onLoadCleared(@hib Drawable drawable) {
        setBitmap(null);
    }

    @Override // p000.jmg
    public /* bridge */ /* synthetic */ void onResourceReady(@efb Object obj, @hib afh afhVar) {
        onResourceReady((Bitmap) obj, (afh<? super Bitmap>) afhVar);
    }

    public lhb(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public void onResourceReady(@efb Bitmap bitmap, @hib afh<? super Bitmap> afhVar) {
        setBitmap(bitmap);
    }

    public lhb(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f57625e = (Context) t7d.checkNotNull(context, "Context must not be null!");
        this.f57622C = (Notification) t7d.checkNotNull(notification, "Notification object can not be null!");
        this.f57624d = (RemoteViews) t7d.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f57623F = i3;
        this.f57626f = i4;
        this.f57627m = str;
    }
}
