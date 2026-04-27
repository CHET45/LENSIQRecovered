package p000;

import java.util.Map;
import p000.da9;
import p000.ga0;
import p000.m5g;

/* JADX INFO: loaded from: classes5.dex */
public class lhi extends AbstractC12427s4<da9, fa9, InterfaceC8819a> {

    /* JADX INFO: renamed from: u */
    public static final vj1 f57653u = vj1.f91344e;

    /* JADX INFO: renamed from: t */
    public final nyd f57654t;

    /* JADX INFO: renamed from: lhi$a */
    public interface InterfaceC8819a extends m5g.InterfaceC9150b {
        void onWatchChange(euf eufVar, jhi jhiVar);
    }

    public lhi(tz5 tz5Var, ga0 ga0Var, nyd nydVar, InterfaceC8819a interfaceC8819a) {
        super(tz5Var, x06.getListenMethod(), ga0Var, ga0.EnumC6181d.LISTEN_STREAM_CONNECTION_BACKOFF, ga0.EnumC6181d.LISTEN_STREAM_IDLE, ga0.EnumC6181d.HEALTH_CHECK_TIMEOUT, interfaceC8819a);
        this.f57654t = nydVar;
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public void unwatchTarget(int i) {
        r80.hardAssert(isOpen(), "Unwatching targets requires an open stream", new Object[0]);
        m21706j(da9.newBuilder().setDatabase(this.f57654t.databaseName()).setRemoveTarget(i).build());
    }

    public void watchQuery(vmg vmgVar) {
        r80.hardAssert(isOpen(), "Watching queries requires an open stream", new Object[0]);
        da9.C4700b addTarget = da9.newBuilder().setDatabase(this.f57654t.databaseName()).setAddTarget(this.f57654t.encodeTarget(vmgVar));
        Map<String, String> mapEncodeListenRequestLabels = this.f57654t.encodeListenRequestLabels(vmgVar);
        if (mapEncodeListenRequestLabels != null) {
            addTarget.putAllLabels(mapEncodeListenRequestLabels);
        }
        m21706j(addTarget.build());
    }

    @Override // p000.AbstractC12427s4
    public void onFirst(fa9 fa9Var) {
        onNext(fa9Var);
    }

    @Override // p000.AbstractC12427s4
    public void onNext(fa9 fa9Var) {
        this.f80606l.reset();
        jhi jhiVarDecodeWatchChange = this.f57654t.decodeWatchChange(fa9Var);
        ((InterfaceC8819a) this.f80607m).onWatchChange(this.f57654t.decodeVersionFromListenResponse(fa9Var), jhiVarDecodeWatchChange);
    }
}
