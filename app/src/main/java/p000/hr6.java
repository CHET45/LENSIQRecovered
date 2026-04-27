package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hr6 implements o42 {
    /* JADX INFO: renamed from: a */
    public abstract o42 mo12579a();

    @Override // p000.o42
    public void appendTimeoutInsight(y48 y48Var) {
        mo12579a().appendTimeoutInsight(y48Var);
    }

    @Override // p000.o42
    public void cancel(n4g n4gVar) {
        mo12579a().cancel(n4gVar);
    }

    @Override // p000.n5g
    public void flush() {
        mo12579a().flush();
    }

    @Override // p000.o42
    public sc0 getAttributes() {
        return mo12579a().getAttributes();
    }

    @Override // p000.o42
    public void halfClose() {
        mo12579a().halfClose();
    }

    @Override // p000.n5g
    public boolean isReady() {
        return mo12579a().isReady();
    }

    @Override // p000.n5g
    public void optimizeForDirectExecutor() {
        mo12579a().optimizeForDirectExecutor();
    }

    @Override // p000.n5g
    public void request(int i) {
        mo12579a().request(i);
    }

    @Override // p000.o42
    public void setAuthority(String str) {
        mo12579a().setAuthority(str);
    }

    @Override // p000.n5g
    public void setCompressor(go2 go2Var) {
        mo12579a().setCompressor(go2Var);
    }

    @Override // p000.o42
    public void setDeadline(sj3 sj3Var) {
        mo12579a().setDeadline(sj3Var);
    }

    @Override // p000.o42
    public void setDecompressorRegistry(bm3 bm3Var) {
        mo12579a().setDecompressorRegistry(bm3Var);
    }

    @Override // p000.o42
    public void setFullStreamDecompression(boolean z) {
        mo12579a().setFullStreamDecompression(z);
    }

    @Override // p000.o42
    public void setMaxInboundMessageSize(int i) {
        mo12579a().setMaxInboundMessageSize(i);
    }

    @Override // p000.o42
    public void setMaxOutboundMessageSize(int i) {
        mo12579a().setMaxOutboundMessageSize(i);
    }

    @Override // p000.n5g
    public void setMessageCompression(boolean z) {
        mo12579a().setMessageCompression(z);
    }

    @Override // p000.o42
    public void start(p42 p42Var) {
        mo12579a().start(p42Var);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo12579a()).toString();
    }

    @Override // p000.n5g
    public void writeMessage(InputStream inputStream) {
        mo12579a().writeMessage(inputStream);
    }
}
