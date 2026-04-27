package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class tna {

    /* JADX INFO: renamed from: b */
    public static final String f85370b = "timestamp";

    /* JADX INFO: renamed from: c */
    public static final String f85371c = "sessionState";

    /* JADX INFO: renamed from: d */
    public static final String f85372d = "queuePaused";

    /* JADX INFO: renamed from: e */
    public static final String f85373e = "extras";

    /* JADX INFO: renamed from: f */
    public static final int f85374f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f85375g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f85376h = 2;

    /* JADX INFO: renamed from: a */
    public final Bundle f85377a;

    public tna(Bundle bundle) {
        this.f85377a = bundle;
    }

    public static tna fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new tna(bundle);
        }
        return null;
    }

    private static String sessionStateToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Integer.toString(i) : ke8.f53741u : "ended" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
    }

    public Bundle asBundle() {
        return this.f85377a;
    }

    public Bundle getExtras() {
        return this.f85377a.getBundle("extras");
    }

    public int getSessionState() {
        return this.f85377a.getInt(f85371c, 2);
    }

    public long getTimestamp() {
        return this.f85377a.getLong("timestamp");
    }

    public boolean isQueuePaused() {
        return this.f85377a.getBoolean(f85372d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaSessionStatus{ ");
        sb.append("timestamp=");
        e1h.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb);
        sb.append(" ms ago");
        sb.append(", sessionState=");
        sb.append(sessionStateToString(getSessionState()));
        sb.append(", queuePaused=");
        sb.append(isQueuePaused());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: tna$a */
    public static final class C13112a {

        /* JADX INFO: renamed from: a */
        public final Bundle f85378a;

        public C13112a(int i) {
            this.f85378a = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setSessionState(i);
        }

        public tna build() {
            return new tna(this.f85378a);
        }

        public C13112a setExtras(Bundle bundle) {
            this.f85378a.putBundle("extras", bundle);
            return this;
        }

        public C13112a setQueuePaused(boolean z) {
            this.f85378a.putBoolean(tna.f85372d, z);
            return this;
        }

        public C13112a setSessionState(int i) {
            this.f85378a.putInt(tna.f85371c, i);
            return this;
        }

        public C13112a setTimestamp(long j) {
            this.f85378a.putLong("timestamp", j);
            return this;
        }

        public C13112a(tna tnaVar) {
            if (tnaVar != null) {
                this.f85378a = new Bundle(tnaVar.f85377a);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
