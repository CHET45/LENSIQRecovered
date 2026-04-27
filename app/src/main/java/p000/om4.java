package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.core.C2996R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class om4 {

    /* JADX INFO: renamed from: b */
    @g8g
    public static final int f68119b = 0;

    /* JADX INFO: renamed from: a */
    public final NotificationCompat.Builder f68120a;

    /* JADX INFO: renamed from: om4$a */
    @c5e(31)
    public static final class C10465a {
        private C10465a() {
        }

        @igg({"WrongConstant"})
        @ih4
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    public om4(Context context, String str) {
        this.f68120a = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, @gq4 int i, @hib PendingIntent pendingIntent, @hib String str, @g8g int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, @gq4 int i, @hib PendingIntent pendingIntent, @hib String str, @g8g int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.f68120a.setSmallIcon(i);
        this.f68120a.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.f68120a.setContentIntent(pendingIntent);
        this.f68120a.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.f68120a.setProgress(i3, i4, z);
        this.f68120a.setOngoing(z2);
        this.f68120a.setShowWhen(z3);
        if (x0i.f95978a >= 31) {
            C10465a.setForegroundServiceBehavior(this.f68120a);
        }
        return this.f68120a.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @gq4 int i, @hib PendingIntent pendingIntent, @hib String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C2996R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @gq4 int i, @hib PendingIntent pendingIntent, @hib String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C2996R.string.exo_download_failed);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, @gq4 int i, @hib PendingIntent pendingIntent, @hib String str, List<uk4> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification buildProgressNotification(android.content.Context r22, @p000.gq4 int r23, @p000.hib android.app.PendingIntent r24, @p000.hib java.lang.String r25, java.util.List<p000.uk4> r26, int r27) {
        /*
            r21 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r2
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            uk4 r11 = (p000.uk4) r11
            int r12 = r11.f88218b
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r7 = r2
            goto L47
        L28:
            float r4 = r11.getPercentDownloaded()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r0 = r0 + r4
            r9 = r1
        L34:
            long r11 = r11.getBytesDownloaded()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = r2
            goto L41
        L40:
            r4 = r1
        L41:
            r6 = r6 | r4
            int r8 = r8 + 1
            r4 = r2
            goto L47
        L46:
            r5 = r2
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L51
            int r3 = com.google.android.exoplayer2.core.C2996R.string.exo_download_downloading
        L4e:
            r15 = r3
        L4f:
            r3 = r2
            goto L6f
        L51:
            if (r5 == 0) goto L68
            if (r27 == 0) goto L68
            r3 = r27 & 2
            if (r3 == 0) goto L5e
            int r3 = com.google.android.exoplayer2.core.C2996R.string.exo_download_paused_for_wifi
        L5b:
            r15 = r3
            r3 = r1
            goto L6f
        L5e:
            r3 = r27 & 1
            if (r3 == 0) goto L65
            int r3 = com.google.android.exoplayer2.core.C2996R.string.exo_download_paused_for_network
            goto L5b
        L65:
            int r3 = com.google.android.exoplayer2.core.C2996R.string.exo_download_paused
            goto L5b
        L68:
            if (r7 == 0) goto L6d
            int r3 = com.google.android.exoplayer2.core.C2996R.string.exo_download_removing
            goto L4e
        L6d:
            r15 = r1
            goto L4f
        L6f:
            if (r3 == 0) goto L89
            r3 = 100
            if (r4 == 0) goto L84
            float r4 = (float) r8
            float r0 = r0 / r4
            int r0 = (int) r0
            if (r9 == 0) goto L7d
            if (r6 == 0) goto L7d
            r1 = r2
        L7d:
            r17 = r0
            r18 = r1
        L81:
            r16 = r3
            goto L8f
        L84:
            r17 = r1
            r18 = r2
            goto L81
        L89:
            r16 = r1
            r17 = r16
            r18 = r17
        L8f:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.buildNotification(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.om4.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List, int):android.app.Notification");
    }
}
