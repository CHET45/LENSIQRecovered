package p000;

import android.app.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class cq6 {

    /* JADX INFO: renamed from: a */
    public final int f26779a;

    /* JADX INFO: renamed from: b */
    public final int f26780b;

    /* JADX INFO: renamed from: c */
    public final Notification f26781c;

    public cq6(int notificationId, @efb Notification notification) {
        this(notificationId, notification, 0);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || cq6.class != o.getClass()) {
            return false;
        }
        cq6 cq6Var = (cq6) o;
        if (this.f26779a == cq6Var.f26779a && this.f26780b == cq6Var.f26780b) {
            return this.f26781c.equals(cq6Var.f26781c);
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.f26780b;
    }

    @efb
    public Notification getNotification() {
        return this.f26781c;
    }

    public int getNotificationId() {
        return this.f26779a;
    }

    public int hashCode() {
        return (((this.f26779a * 31) + this.f26780b) * 31) + this.f26781c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f26779a + ", mForegroundServiceType=" + this.f26780b + ", mNotification=" + this.f26781c + '}';
    }

    public cq6(int notificationId, @efb Notification notification, int foregroundServiceType) {
        this.f26779a = notificationId;
        this.f26781c = notification;
        this.f26780b = foregroundServiceType;
    }
}
