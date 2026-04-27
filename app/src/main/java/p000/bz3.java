package p000;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes8.dex */
public class bz3 implements pii {

    /* JADX INFO: renamed from: a */
    public SSLContext f15224a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f15225b;

    public bz3(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    @Override // p000.pii
    public void close() {
        this.f15225b.shutdown();
    }

    @Override // p000.pii
    public ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngineCreateSSLEngine = this.f15224a.createSSLEngine();
        ArrayList arrayList = new ArrayList(Arrays.asList(sSLEngineCreateSSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sSLEngineCreateSSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        sSLEngineCreateSSLEngine.setUseClientMode(false);
        return new hke(socketChannel, sSLEngineCreateSSLEngine, this.f15225b, selectionKey);
    }

    public bz3(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f15224a = sSLContext;
        this.f15225b = executorService;
    }

    @Override // p000.lii
    public /* bridge */ /* synthetic */ iii createWebSocket(jii jiiVar, List list) {
        return createWebSocket(jiiVar, (List<qn4>) list);
    }

    @Override // p000.lii
    public mii createWebSocket(jii jiiVar, qn4 qn4Var) {
        return new mii(jiiVar, qn4Var);
    }

    @Override // p000.pii, p000.lii
    public mii createWebSocket(jii jiiVar, List<qn4> list) {
        return new mii(jiiVar, list);
    }
}
