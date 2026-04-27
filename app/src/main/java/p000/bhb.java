package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.media.C1202R;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class bhb {

    /* JADX INFO: renamed from: bhb$a */
    @c5e(15)
    public static class C1899a {
        private C1899a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m3170a(RemoteViews remoteViews, int i, CharSequence charSequence) {
            remoteViews.setContentDescription(i, charSequence);
        }
    }

    /* JADX INFO: renamed from: bhb$b */
    @c5e(21)
    public static class C1900b {
        private C1900b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Notification.MediaStyle m3171a() {
            return new Notification.MediaStyle();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Notification.MediaStyle m3172b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                m3175e(mediaStyle, iArr);
            }
            if (token != null) {
                m3173c(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m3173c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m3174d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m3175e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    /* JADX INFO: renamed from: bhb$c */
    @c5e(24)
    public static class C1901c {
        private C1901c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Notification.DecoratedMediaCustomViewStyle m3176a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    /* JADX INFO: renamed from: bhb$d */
    public static class C1902d extends C1903e {
        private void setBackgroundColor(RemoteViews remoteViews) {
            remoteViews.setInt(C1202R.id.status_bar_latest_event_content, "setBackgroundColor", this.mBuilder.getColor() != 0 ? this.mBuilder.getColor() : this.mBuilder.mContext.getResources().getColor(C1202R.color.notification_material_background_media_default_color));
        }

        @Override // p000.bhb.C1903e, androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            C1900b.m3174d(notificationBuilderWithBuilderAccessor.getBuilder(), C1900b.m3172b(C1901c.m3176a(), this.f13754a, this.f13755b));
        }

        @Override // p000.bhb.C1903e
        /* JADX INFO: renamed from: c */
        public int mo3177c(int i) {
            return i <= 3 ? C1202R.layout.notification_template_big_media_narrow_custom : C1202R.layout.notification_template_big_media_custom;
        }

        @Override // p000.bhb.C1903e
        /* JADX INFO: renamed from: d */
        public int mo3178d() {
            return this.mBuilder.getContentView() != null ? C1202R.layout.notification_template_media_custom : super.mo3178d();
        }

        @Override // p000.bhb.C1903e, androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // p000.bhb.C1903e, androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    private bhb() {
    }

    /* JADX INFO: renamed from: bhb$e */
    public static class C1903e extends NotificationCompat.Style {

        /* JADX INFO: renamed from: e */
        public static final int f13752e = 3;

        /* JADX INFO: renamed from: f */
        public static final int f13753f = 5;

        /* JADX INFO: renamed from: a */
        public int[] f13754a = null;

        /* JADX INFO: renamed from: b */
        public MediaSessionCompat.Token f13755b;

        /* JADX INFO: renamed from: c */
        public boolean f13756c;

        /* JADX INFO: renamed from: d */
        public PendingIntent f13757d;

        public C1903e() {
        }

        private RemoteViews generateMediaActionButton(NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), C1202R.layout.notification_media_action);
            remoteViews.setImageViewResource(C1202R.id.action0, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(C1202R.id.action0, action.getActionIntent());
            }
            C1899a.m3170a(remoteViews, C1202R.id.action0, action.getTitle());
            return remoteViews;
        }

        public static MediaSessionCompat.Token getMediaSession(Notification notification) {
            Parcelable parcelable;
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null || (parcelable = extras.getParcelable(NotificationCompat.EXTRA_MEDIA_SESSION)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        /* JADX INFO: renamed from: a */
        public RemoteViews m3179a() {
            int iMin = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, mo3177c(iMin), false);
            remoteViewsApplyStandardTemplate.removeAllViews(C1202R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    remoteViewsApplyStandardTemplate.addView(C1202R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.f13756c) {
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setInt(C1202R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C1202R.integer.cancel_button_image_alpha));
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(C1202R.id.cancel_action, this.f13757d);
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            C1900b.m3174d(notificationBuilderWithBuilderAccessor.getBuilder(), C1900b.m3172b(C1900b.m3171a(), this.f13754a, this.f13755b));
        }

        /* JADX INFO: renamed from: b */
        public RemoteViews m3180b() {
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, mo3178d(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.f13754a;
            int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
            remoteViewsApplyStandardTemplate.removeAllViews(C1202R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    if (i >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                    }
                    remoteViewsApplyStandardTemplate.addView(C1202R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.f13754a[i])));
                }
            }
            if (this.f13756c) {
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.end_padder, 8);
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(C1202R.id.cancel_action, this.f13757d);
                remoteViewsApplyStandardTemplate.setInt(C1202R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(C1202R.integer.cancel_button_image_alpha));
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.end_padder, 0);
                remoteViewsApplyStandardTemplate.setViewVisibility(C1202R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        /* JADX INFO: renamed from: c */
        public int mo3177c(int i) {
            return i <= 3 ? C1202R.layout.notification_template_big_media_narrow : C1202R.layout.notification_template_big_media;
        }

        /* JADX INFO: renamed from: d */
        public int mo3178d() {
            return C1202R.layout.notification_template_media;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @p7e({p7e.EnumC10826a.f69934a})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public C1903e setCancelButtonIntent(PendingIntent pendingIntent) {
            this.f13757d = pendingIntent;
            return this;
        }

        public C1903e setMediaSession(MediaSessionCompat.Token token) {
            this.f13755b = token;
            return this;
        }

        public C1903e setShowActionsInCompactView(int... iArr) {
            this.f13754a = iArr;
            return this;
        }

        public C1903e setShowCancelButton(boolean z) {
            return this;
        }

        public C1903e(NotificationCompat.Builder builder) {
            setBuilder(builder);
        }
    }
}
