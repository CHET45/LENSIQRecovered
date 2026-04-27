package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.ga0;
import p000.gsi;
import p000.m5g;

/* JADX INFO: loaded from: classes5.dex */
public class nsi extends AbstractC12427s4<gsi, isi, InterfaceC10049a> {

    /* JADX INFO: renamed from: w */
    public static final vj1 f65548w = vj1.f91344e;

    /* JADX INFO: renamed from: t */
    public final nyd f65549t;

    /* JADX INFO: renamed from: u */
    public boolean f65550u;

    /* JADX INFO: renamed from: v */
    public vj1 f65551v;

    /* JADX INFO: renamed from: nsi$a */
    public interface InterfaceC10049a extends m5g.InterfaceC9150b {
        void onHandshakeComplete();

        void onWriteResponse(euf eufVar, List<u7b> list);
    }

    public nsi(tz5 tz5Var, ga0 ga0Var, nyd nydVar, InterfaceC10049a interfaceC10049a) {
        super(tz5Var, x06.getWriteMethod(), ga0Var, ga0.EnumC6181d.WRITE_STREAM_CONNECTION_BACKOFF, ga0.EnumC6181d.WRITE_STREAM_IDLE, ga0.EnumC6181d.HEALTH_CHECK_TIMEOUT, interfaceC10049a);
        this.f65550u = false;
        this.f65551v = f65548w;
        this.f65549t = nydVar;
    }

    @Override // p000.AbstractC12427s4
    /* JADX INFO: renamed from: i */
    public void mo18120i() {
        if (this.f65550u) {
            m18125o(Collections.emptyList());
        }
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

    /* JADX INFO: renamed from: k */
    public vj1 m18121k() {
        return this.f65551v;
    }

    /* JADX INFO: renamed from: l */
    public boolean m18122l() {
        return this.f65550u;
    }

    /* JADX INFO: renamed from: m */
    public void m18123m(vj1 vj1Var) {
        this.f65551v = (vj1) x7d.checkNotNull(vj1Var);
    }

    /* JADX INFO: renamed from: n */
    public void m18124n() {
        r80.hardAssert(isOpen(), "Writing handshake requires an opened stream", new Object[0]);
        r80.hardAssert(!this.f65550u, "Handshake already completed", new Object[0]);
        m21706j(gsi.newBuilder().setDatabase(this.f65549t.databaseName()).build());
    }

    /* JADX INFO: renamed from: o */
    public void m18125o(List<m7b> list) {
        r80.hardAssert(isOpen(), "Writing mutations requires an opened stream", new Object[0]);
        r80.hardAssert(this.f65550u, "Handshake must be complete before writing mutations", new Object[0]);
        gsi.C6489b c6489bNewBuilder = gsi.newBuilder();
        Iterator<m7b> it = list.iterator();
        while (it.hasNext()) {
            c6489bNewBuilder.addWrites(this.f65549t.encodeMutation(it.next()));
        }
        c6489bNewBuilder.setStreamToken(this.f65551v);
        m21706j(c6489bNewBuilder.build());
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public void start() {
        this.f65550u = false;
        super.start();
    }

    @Override // p000.AbstractC12427s4, p000.m5g
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p000.AbstractC12427s4
    public void onFirst(isi isiVar) {
        this.f65551v = isiVar.getStreamToken();
        this.f65550u = true;
        ((InterfaceC10049a) this.f80607m).onHandshakeComplete();
    }

    @Override // p000.AbstractC12427s4
    public void onNext(isi isiVar) {
        this.f65551v = isiVar.getStreamToken();
        this.f80606l.reset();
        euf eufVarDecodeVersion = this.f65549t.decodeVersion(isiVar.getCommitTime());
        int writeResultsCount = isiVar.getWriteResultsCount();
        ArrayList arrayList = new ArrayList(writeResultsCount);
        for (int i = 0; i < writeResultsCount; i++) {
            arrayList.add(this.f65549t.decodeMutationResult(isiVar.getWriteResults(i), eufVarDecodeVersion));
        }
        ((InterfaceC10049a) this.f80607m).onWriteResponse(eufVarDecodeVersion, arrayList);
    }
}
