package p000;

import android.app.PendingIntent;
import android.net.Uri;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ce1 {

    /* JADX INFO: renamed from: a */
    public final String f16333a;

    /* JADX INFO: renamed from: b */
    @hib
    public final PendingIntent f16334b;

    /* JADX INFO: renamed from: c */
    @gq4
    public int f16335c;

    /* JADX INFO: renamed from: d */
    @hib
    public Uri f16336d;

    /* JADX INFO: renamed from: e */
    @hib
    public Runnable f16337e;

    public ce1(@efb String str, @efb PendingIntent pendingIntent, @gq4 int i) {
        this.f16333a = str;
        this.f16334b = pendingIntent;
        this.f16335c = i;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: a */
    public Runnable m3914a() {
        return this.f16337e;
    }

    @efb
    public PendingIntent getAction() {
        PendingIntent pendingIntent = this.f16334b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int getIconId() {
        return this.f16335c;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public Uri getIconUri() {
        return this.f16336d;
    }

    @efb
    public String getTitle() {
        return this.f16333a;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public ce1(@efb String str, @efb PendingIntent pendingIntent, @efb Uri uri) {
        this.f16333a = str;
        this.f16334b = pendingIntent;
        this.f16336d = uri;
    }

    public ce1(@efb String str, @efb Runnable runnable) {
        this.f16333a = str;
        this.f16334b = null;
        this.f16337e = runnable;
    }

    public ce1(@efb String str, @efb PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
