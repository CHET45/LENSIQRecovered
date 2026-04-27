package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kr6 extends q42 {
    /* JADX INFO: renamed from: a */
    public abstract q42 m14937a();

    @Override // p000.q42
    public void createPendingStream() {
        m14937a().createPendingStream();
    }

    @Override // p000.q42
    public void inboundHeaders() {
        m14937a().inboundHeaders();
    }

    @Override // p000.g6g
    public void inboundMessage(int i) {
        m14937a().inboundMessage(i);
    }

    @Override // p000.g6g
    public void inboundMessageRead(int i, long j, long j2) {
        m14937a().inboundMessageRead(i, j, j2);
    }

    @Override // p000.q42
    public void inboundTrailers(fta ftaVar) {
        m14937a().inboundTrailers(ftaVar);
    }

    @Override // p000.g6g
    public void inboundUncompressedSize(long j) {
        m14937a().inboundUncompressedSize(j);
    }

    @Override // p000.g6g
    public void inboundWireSize(long j) {
        m14937a().inboundWireSize(j);
    }

    @Override // p000.q42
    public void outboundHeaders() {
        m14937a().outboundHeaders();
    }

    @Override // p000.g6g
    public void outboundMessage(int i) {
        m14937a().outboundMessage(i);
    }

    @Override // p000.g6g
    public void outboundMessageSent(int i, long j, long j2) {
        m14937a().outboundMessageSent(i, j, j2);
    }

    @Override // p000.g6g
    public void outboundUncompressedSize(long j) {
        m14937a().outboundUncompressedSize(j);
    }

    @Override // p000.g6g
    public void outboundWireSize(long j) {
        m14937a().outboundWireSize(j);
    }

    @Override // p000.g6g
    public void streamClosed(n4g n4gVar) {
        m14937a().streamClosed(n4gVar);
    }

    @Override // p000.q42
    public void streamCreated(sc0 sc0Var, fta ftaVar) {
        m14937a().streamCreated(sc0Var, ftaVar);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", m14937a()).toString();
    }
}
