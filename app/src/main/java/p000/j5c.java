package p000;

import java.util.Locale;
import p000.ga0;

/* JADX INFO: loaded from: classes5.dex */
public class j5c {

    /* JADX INFO: renamed from: g */
    public static final int f49548g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f49549h = 10000;

    /* JADX INFO: renamed from: i */
    public static final String f49550i = "OnlineStateTracker";

    /* JADX INFO: renamed from: b */
    public int f49552b;

    /* JADX INFO: renamed from: c */
    public ga0.C6179b f49553c;

    /* JADX INFO: renamed from: e */
    public final ga0 f49555e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7742a f49556f;

    /* JADX INFO: renamed from: a */
    public h5c f49551a = h5c.UNKNOWN;

    /* JADX INFO: renamed from: d */
    public boolean f49554d = true;

    /* JADX INFO: renamed from: j5c$a */
    public interface InterfaceC7742a {
        void handleOnlineStateChange(h5c h5cVar);
    }

    public j5c(ga0 ga0Var, InterfaceC7742a interfaceC7742a) {
        this.f49555e = ga0Var;
        this.f49556f = interfaceC7742a;
    }

    private void clearOnlineStateTimer() {
        ga0.C6179b c6179b = this.f49553c;
        if (c6179b != null) {
            c6179b.cancel();
            this.f49553c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleWatchStreamStart$0() {
        this.f49553c = null;
        r80.hardAssert(this.f49551a == h5c.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        logClientOfflineWarningIfNecessary(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        setAndBroadcastState(h5c.OFFLINE);
    }

    private void logClientOfflineWarningIfNecessary(String str) {
        String str2 = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.f49554d) {
            fj9.debug(f49550i, "%s", str2);
        } else {
            fj9.warn(f49550i, "%s", str2);
            this.f49554d = false;
        }
    }

    private void setAndBroadcastState(h5c h5cVar) {
        if (h5cVar != this.f49551a) {
            this.f49551a = h5cVar;
            this.f49556f.handleOnlineStateChange(h5cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public h5c m13737b() {
        return this.f49551a;
    }

    /* JADX INFO: renamed from: c */
    public void m13738c(n4g n4gVar) {
        if (this.f49551a == h5c.ONLINE) {
            setAndBroadcastState(h5c.UNKNOWN);
            r80.hardAssert(this.f49552b == 0, "watchStreamFailures must be 0", new Object[0]);
            r80.hardAssert(this.f49553c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i = this.f49552b + 1;
        this.f49552b = i;
        if (i >= 1) {
            clearOnlineStateTimer();
            logClientOfflineWarningIfNecessary(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, n4gVar));
            setAndBroadcastState(h5c.OFFLINE);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13739d() {
        if (this.f49552b == 0) {
            setAndBroadcastState(h5c.UNKNOWN);
            r80.hardAssert(this.f49553c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f49553c = this.f49555e.enqueueAfterDelay(ga0.EnumC6181d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: i5c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45797a.lambda$handleWatchStreamStart$0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public void m13740e(h5c h5cVar) {
        clearOnlineStateTimer();
        this.f49552b = 0;
        if (h5cVar == h5c.ONLINE) {
            this.f49554d = false;
        }
        setAndBroadcastState(h5cVar);
    }
}
