package p000;

import p000.InterfaceC5415eo;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface tyc {

    /* JADX INFO: renamed from: tyc$a */
    public interface InterfaceC13289a {
        void onAdPlaybackStarted(InterfaceC5415eo.b bVar, String str, String str2);

        void onSessionActive(InterfaceC5415eo.b bVar, String str);

        void onSessionCreated(InterfaceC5415eo.b bVar, String str);

        void onSessionFinished(InterfaceC5415eo.b bVar, String str, boolean z);
    }

    boolean belongsToSession(InterfaceC5415eo.b bVar, String str);

    void finishAllSessions(InterfaceC5415eo.b bVar);

    @hib
    String getActiveSessionId();

    String getSessionForMediaPeriodId(t1h t1hVar, vna.C14175b c14175b);

    void setListener(InterfaceC13289a interfaceC13289a);

    void updateSessions(InterfaceC5415eo.b bVar);

    void updateSessionsWithDiscontinuity(InterfaceC5415eo.b bVar, int i);

    void updateSessionsWithTimelineChange(InterfaceC5415eo.b bVar);
}
