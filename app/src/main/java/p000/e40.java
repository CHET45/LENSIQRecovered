package p000;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes4.dex */
public class e40 extends xd3<Bitmap> {

    /* JADX INFO: renamed from: C */
    public final int f31728C;

    /* JADX INFO: renamed from: d */
    public final int[] f31729d;

    /* JADX INFO: renamed from: e */
    public final ComponentName f31730e;

    /* JADX INFO: renamed from: f */
    public final RemoteViews f31731f;

    /* JADX INFO: renamed from: m */
    public final Context f31732m;

    public e40(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f31732m = (Context) t7d.checkNotNull(context, "Context can not be null!");
        this.f31731f = (RemoteViews) t7d.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f31729d = (int[]) t7d.checkNotNull(iArr, "WidgetIds can not be null!");
        this.f31728C = i3;
        this.f31730e = null;
    }

    private void setBitmap(@hib Bitmap bitmap) {
        this.f31731f.setImageViewBitmap(this.f31728C, bitmap);
        update();
    }

    private void update() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f31732m);
        ComponentName componentName = this.f31730e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f31731f);
        } else {
            appWidgetManager.updateAppWidget(this.f31729d, this.f31731f);
        }
    }

    @Override // p000.jmg
    public void onLoadCleared(@hib Drawable drawable) {
        setBitmap(null);
    }

    @Override // p000.jmg
    public /* bridge */ /* synthetic */ void onResourceReady(@efb Object obj, @hib afh afhVar) {
        onResourceReady((Bitmap) obj, (afh<? super Bitmap>) afhVar);
    }

    public void onResourceReady(@efb Bitmap bitmap, @hib afh<? super Bitmap> afhVar) {
        setBitmap(bitmap);
    }

    public e40(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public e40(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.f31732m = (Context) t7d.checkNotNull(context, "Context can not be null!");
        this.f31731f = (RemoteViews) t7d.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f31730e = (ComponentName) t7d.checkNotNull(componentName, "ComponentName can not be null!");
        this.f31728C = i3;
        this.f31729d = null;
    }

    public e40(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
