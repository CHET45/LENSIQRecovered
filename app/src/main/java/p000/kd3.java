package p000;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes8.dex */
public class kd3 extends bz3 {

    /* JADX INFO: renamed from: c */
    public final String[] f53633c;

    /* JADX INFO: renamed from: d */
    public final String[] f53634d;

    public kd3(SSLContext sSLContext, String[] strArr, String[] strArr2) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), strArr, strArr2);
    }

    @Override // p000.bz3, p000.pii
    public ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f15224a.createSSLEngine();
        String[] strArr = this.f53633c;
        if (strArr != null) {
            sSLEngineCreateSSLEngine.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f53634d;
        if (strArr2 != null) {
            sSLEngineCreateSSLEngine.setEnabledCipherSuites(strArr2);
        }
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new hke(socketChannel, sSLEngineCreateSSLEngine, this.f15225b, selectionKey);
    }

    public kd3(SSLContext sSLContext, ExecutorService executorService, String[] strArr, String[] strArr2) {
        super(sSLContext, executorService);
        this.f53633c = strArr;
        this.f53634d = strArr2;
    }
}
