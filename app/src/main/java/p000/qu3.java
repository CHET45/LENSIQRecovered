package p000;

import android.net.Uri;
import java.util.Map;
import p000.gh3;
import p000.ju3;
import p000.nfa;
import p000.vv3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qu3 implements sr4 {

    /* JADX INFO: renamed from: a */
    public final Object f75763a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("lock")
    public nfa.C9854f f75764b;

    /* JADX INFO: renamed from: c */
    @xc7("lock")
    public or4 f75765c;

    /* JADX INFO: renamed from: d */
    @hib
    public gh3.InterfaceC6313a f75766d;

    /* JADX INFO: renamed from: e */
    @hib
    public String f75767e;

    /* JADX INFO: renamed from: f */
    @hib
    public hc9 f75768f;

    private or4 createManager(nfa.C9854f c9854f) {
        gh3.InterfaceC6313a userAgent = this.f75766d;
        if (userAgent == null) {
            userAgent = new vv3.C14271b().setUserAgent(this.f75767e);
        }
        Uri uri = c9854f.f64365c;
        ho7 ho7Var = new ho7(uri == null ? null : uri.toString(), c9854f.f64370h, userAgent);
        quh<Map.Entry<String, String>> it = c9854f.f64367e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            ho7Var.setKeyRequestProperty(next.getKey(), next.getValue());
        }
        ju3.C8086b useDrmSessionsForClearContent = new ju3.C8086b().setUuidAndExoMediaDrmProvider(c9854f.f64363a, mw6.f62544k).setMultiSession(c9854f.f64368f).setPlayClearSamplesWithoutKeys(c9854f.f64369g).setUseDrmSessionsForClearContent(rd8.toArray(c9854f.f64372j));
        hc9 hc9Var = this.f75768f;
        if (hc9Var != null) {
            useDrmSessionsForClearContent.setLoadErrorHandlingPolicy(hc9Var);
        }
        ju3 ju3VarBuild = useDrmSessionsForClearContent.build(ho7Var);
        ju3VarBuild.setMode(0, c9854f.getKeySetId());
        return ju3VarBuild;
    }

    @Override // p000.sr4
    public or4 get(nfa nfaVar) {
        or4 or4Var;
        v80.checkNotNull(nfaVar.f64305b);
        nfa.C9854f c9854f = nfaVar.f64305b.f64408c;
        if (c9854f == null) {
            return or4.f68367a;
        }
        synchronized (this.f75763a) {
            try {
                if (!c9854f.equals(this.f75764b)) {
                    this.f75764b = c9854f;
                    this.f75765c = createManager(c9854f);
                }
                or4Var = (or4) v80.checkNotNull(this.f75765c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return or4Var;
    }

    public void setDrmHttpDataSourceFactory(@hib gh3.InterfaceC6313a interfaceC6313a) {
        this.f75766d = interfaceC6313a;
    }

    public void setDrmLoadErrorHandlingPolicy(hc9 hc9Var) {
        this.f75768f = hc9Var;
    }

    @Deprecated
    public void setDrmUserAgent(@hib String str) {
        this.f75767e = str;
    }
}
