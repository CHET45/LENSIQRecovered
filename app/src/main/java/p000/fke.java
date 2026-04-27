package p000;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

/* JADX INFO: loaded from: classes8.dex */
public class fke extends bz3 {

    /* JADX INFO: renamed from: c */
    public final SSLParameters f36970c;

    public fke(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    @Override // p000.bz3, p000.pii
    public ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f15224a.createSSLEngine();
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        sSLEngineCreateSSLEngine.setSSLParameters(this.f36970c);
        return new hke(socketChannel, sSLEngineCreateSSLEngine, this.f15225b, selectionKey);
    }

    public fke(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.f36970c = sSLParameters;
    }
}
