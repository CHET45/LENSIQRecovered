package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class cga {

    /* JADX INFO: renamed from: b */
    public static final String f16474b = "timestamp";

    /* JADX INFO: renamed from: c */
    public static final String f16475c = "playbackState";

    /* JADX INFO: renamed from: d */
    public static final String f16476d = "contentPosition";

    /* JADX INFO: renamed from: e */
    public static final String f16477e = "contentDuration";

    /* JADX INFO: renamed from: f */
    public static final String f16478f = "extras";

    /* JADX INFO: renamed from: g */
    public static final int f16479g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f16480h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f16481i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f16482j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f16483k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f16484l = 5;

    /* JADX INFO: renamed from: m */
    public static final int f16485m = 6;

    /* JADX INFO: renamed from: n */
    public static final int f16486n = 7;

    /* JADX INFO: renamed from: o */
    public static final String f16487o = "android.media.status.extra.HTTP_STATUS_CODE";

    /* JADX INFO: renamed from: p */
    public static final String f16488p = "android.media.status.extra.HTTP_RESPONSE_HEADERS";

    /* JADX INFO: renamed from: a */
    public final Bundle f16489a;

    public cga(Bundle bundle) {
        this.f16489a = bundle;
    }

    public static cga fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new cga(bundle);
        }
        return null;
    }

    private static String playbackStateToString(int i) {
        switch (i) {
            case 0:
                return "pending";
            case 1:
                return "playing";
            case 2:
                return "paused";
            case 3:
                return "buffering";
            case 4:
                return "finished";
            case 5:
                return "canceled";
            case 6:
                return ke8.f53741u;
            case 7:
                return "error";
            default:
                return Integer.toString(i);
        }
    }

    public Bundle asBundle() {
        return this.f16489a;
    }

    public long getContentDuration() {
        return this.f16489a.getLong(f16477e, -1L);
    }

    public long getContentPosition() {
        return this.f16489a.getLong(f16476d, -1L);
    }

    public Bundle getExtras() {
        return this.f16489a.getBundle("extras");
    }

    public int getPlaybackState() {
        return this.f16489a.getInt(f16475c, 7);
    }

    public long getTimestamp() {
        return this.f16489a.getLong("timestamp");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaItemStatus{ ");
        sb.append("timestamp=");
        e1h.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb);
        sb.append(" ms ago");
        sb.append(", playbackState=");
        sb.append(playbackStateToString(getPlaybackState()));
        sb.append(", contentPosition=");
        sb.append(getContentPosition());
        sb.append(", contentDuration=");
        sb.append(getContentDuration());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: cga$a */
    public static final class C2305a {

        /* JADX INFO: renamed from: a */
        public final Bundle f16490a;

        public C2305a(int i) {
            this.f16490a = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setPlaybackState(i);
        }

        public cga build() {
            return new cga(this.f16490a);
        }

        public C2305a setContentDuration(long j) {
            this.f16490a.putLong(cga.f16477e, j);
            return this;
        }

        public C2305a setContentPosition(long j) {
            this.f16490a.putLong(cga.f16476d, j);
            return this;
        }

        public C2305a setExtras(Bundle bundle) {
            this.f16490a.putBundle("extras", bundle);
            return this;
        }

        public C2305a setPlaybackState(int i) {
            this.f16490a.putInt(cga.f16475c, i);
            return this;
        }

        public C2305a setTimestamp(long j) {
            this.f16490a.putLong("timestamp", j);
            return this;
        }

        public C2305a(cga cgaVar) {
            if (cgaVar != null) {
                this.f16490a = new Bundle(cgaVar.f16489a);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
