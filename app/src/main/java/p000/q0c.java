package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import p000.c1c;
import p000.da8;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public final class q0c implements ob8 {

    /* JADX INFO: renamed from: n */
    public static final Logger f72686n = Logger.getLogger(q0c.class.getName());

    /* JADX INFO: renamed from: a */
    public final SocketAddress f72687a;

    /* JADX INFO: renamed from: b */
    public final ServerSocketFactory f72688b;

    /* JADX INFO: renamed from: c */
    public final gkb<Executor> f72689c;

    /* JADX INFO: renamed from: d */
    public final gkb<ScheduledExecutorService> f72690d;

    /* JADX INFO: renamed from: e */
    public final c1c.C2152b f72691e;

    /* JADX INFO: renamed from: f */
    public final da8 f72692f;

    /* JADX INFO: renamed from: g */
    public ServerSocket f72693g;

    /* JADX INFO: renamed from: h */
    public SocketAddress f72694h;

    /* JADX INFO: renamed from: i */
    public xa8<da8.C4695l> f72695i;

    /* JADX INFO: renamed from: j */
    public Executor f72696j;

    /* JADX INFO: renamed from: k */
    public ScheduledExecutorService f72697k;

    /* JADX INFO: renamed from: l */
    public l3f f72698l;

    /* JADX INFO: renamed from: m */
    public boolean f72699m;

    /* JADX INFO: renamed from: q0c$a */
    public static final class C11240a implements xa8<da8.C4695l> {

        /* JADX INFO: renamed from: a */
        public final cb8 f72700a;

        /* JADX INFO: renamed from: b */
        public final ServerSocket f72701b;

        public C11240a(ServerSocket serverSocket) {
            this.f72701b = serverSocket;
            this.f72700a = cb8.allocate((Class<?>) C11240a.class, String.valueOf(serverSocket.getLocalSocketAddress()));
        }

        @Override // p000.ac8
        public cb8 getLogId() {
            return this.f72700a;
        }

        @Override // p000.xa8
        public ja9<da8.C4695l> getStats() {
            return w17.immediateFuture(new da8.C4695l(null, this.f72701b.getLocalSocketAddress(), null, new da8.C4694k.a().build(), null));
        }

        public String toString() {
            return yya.toStringHelper(this).add("logId", this.f72700a.getId()).add("socket", this.f72701b).toString();
        }
    }

    public q0c(s0c s0cVar, List<? extends y3f.AbstractC15412a> list, da8 da8Var) {
        this.f72687a = (SocketAddress) v7d.checkNotNull(s0cVar.f80324b, "listenAddress");
        this.f72688b = (ServerSocketFactory) v7d.checkNotNull(s0cVar.f80329g, "socketFactory");
        this.f72689c = (gkb) v7d.checkNotNull(s0cVar.f80327e, "transportExecutorPool");
        this.f72690d = (gkb) v7d.checkNotNull(s0cVar.f80328f, "scheduledExecutorServicePool");
        this.f72691e = new c1c.C2152b(s0cVar, list);
        this.f72692f = (da8) v7d.checkNotNull(da8Var, "channelz");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptConnections() {
        while (true) {
            try {
                try {
                    c1c c1cVar = new c1c(this.f72691e, this.f72693g.accept());
                    c1cVar.start(this.f72698l.transportCreated(c1cVar));
                } catch (IOException e) {
                    if (!this.f72699m) {
                        throw e;
                    }
                    this.f72698l.serverShutdown();
                    return;
                }
            } catch (Throwable th) {
                f72686n.log(Level.SEVERE, "Accept loop failed", th);
                this.f72698l.serverShutdown();
                return;
            }
        }
    }

    @Override // p000.ob8
    public SocketAddress getListenSocketAddress() {
        return this.f72694h;
    }

    @Override // p000.ob8
    public List<? extends SocketAddress> getListenSocketAddresses() {
        return Collections.singletonList(getListenSocketAddress());
    }

    @Override // p000.ob8
    public xa8<da8.C4695l> getListenSocketStats() {
        return this.f72695i;
    }

    @Override // p000.ob8
    public List<xa8<da8.C4695l>> getListenSocketStatsList() {
        return Collections.singletonList(getListenSocketStats());
    }

    @Override // p000.ob8
    public void shutdown() {
        if (this.f72699m) {
            return;
        }
        this.f72699m = true;
        if (this.f72693g == null) {
            return;
        }
        this.f72692f.removeListenSocket(this.f72695i);
        try {
            this.f72693g.close();
        } catch (IOException unused) {
            f72686n.log(Level.WARNING, "Failed closing server socket", this.f72693g);
        }
        this.f72696j = this.f72689c.returnObject(this.f72696j);
        this.f72697k = this.f72690d.returnObject(this.f72697k);
    }

    @Override // p000.ob8
    public void start(l3f l3fVar) throws IOException {
        this.f72698l = (l3f) v7d.checkNotNull(l3fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ServerSocket serverSocketCreateServerSocket = this.f72688b.createServerSocket();
        try {
            serverSocketCreateServerSocket.bind(this.f72687a);
            this.f72693g = serverSocketCreateServerSocket;
            this.f72694h = serverSocketCreateServerSocket.getLocalSocketAddress();
            this.f72695i = new C11240a(serverSocketCreateServerSocket);
            this.f72696j = this.f72689c.getObject();
            this.f72697k = this.f72690d.getObject();
            this.f72692f.addListenSocket(this.f72695i);
            this.f72696j.execute(new Runnable() { // from class: p0c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69339a.acceptConnections();
                }
            });
        } catch (IOException e) {
            serverSocketCreateServerSocket.close();
            throw e;
        }
    }
}
