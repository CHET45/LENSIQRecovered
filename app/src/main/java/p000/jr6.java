package p000;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/2861")
public abstract class jr6 extends q42 {
    /* JADX INFO: renamed from: a */
    public abstract q42 mo14254a();

    @Override // p000.q42
    public void createPendingStream() {
        mo14254a().createPendingStream();
    }

    @Override // p000.q42
    public void inboundHeaders() {
        mo14254a().inboundHeaders();
    }

    @Override // p000.g6g
    public void inboundMessage(int i) {
        mo14254a().inboundMessage(i);
    }

    @Override // p000.g6g
    public void inboundMessageRead(int i, long j, long j2) {
        mo14254a().inboundMessageRead(i, j, j2);
    }

    @Override // p000.q42
    public void inboundTrailers(fta ftaVar) {
        mo14254a().inboundTrailers(ftaVar);
    }

    @Override // p000.g6g
    public void inboundUncompressedSize(long j) {
        mo14254a().inboundUncompressedSize(j);
    }

    @Override // p000.g6g
    public void inboundWireSize(long j) {
        mo14254a().inboundWireSize(j);
    }

    @Override // p000.q42
    public void outboundHeaders() {
        mo14254a().outboundHeaders();
    }

    @Override // p000.g6g
    public void outboundMessage(int i) {
        mo14254a().outboundMessage(i);
    }

    @Override // p000.g6g
    public void outboundMessageSent(int i, long j, long j2) {
        mo14254a().outboundMessageSent(i, j, j2);
    }

    @Override // p000.g6g
    public void outboundUncompressedSize(long j) {
        mo14254a().outboundUncompressedSize(j);
    }

    @Override // p000.g6g
    public void outboundWireSize(long j) {
        mo14254a().outboundWireSize(j);
    }

    @Override // p000.g6g
    public void streamClosed(n4g n4gVar) {
        mo14254a().streamClosed(n4gVar);
    }

    @Override // p000.q42
    public void streamCreated(sc0 sc0Var, fta ftaVar) {
        mo14254a().streamCreated(sc0Var, ftaVar);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo14254a()).toString();
    }
}
