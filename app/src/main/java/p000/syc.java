package p000;

import p000.InterfaceC2409co;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface syc {

    /* JADX INFO: renamed from: syc$a */
    public interface InterfaceC12829a {
        void onAdPlaybackStarted(InterfaceC2409co.b bVar, String str, String str2);

        void onSessionActive(InterfaceC2409co.b bVar, String str);

        void onSessionCreated(InterfaceC2409co.b bVar, String str);

        void onSessionFinished(InterfaceC2409co.b bVar, String str, boolean z);
    }

    boolean belongsToSession(InterfaceC2409co.b bVar, String str);

    void finishAllSessions(InterfaceC2409co.b bVar);

    @hib
    String getActiveSessionId();

    String getSessionForMediaPeriodId(q1h q1hVar, una.C13612b c13612b);

    void setListener(InterfaceC12829a interfaceC12829a);

    void updateSessions(InterfaceC2409co.b bVar);

    void updateSessionsWithDiscontinuity(InterfaceC2409co.b bVar, int i);

    void updateSessionsWithTimelineChange(InterfaceC2409co.b bVar);
}
