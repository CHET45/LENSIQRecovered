package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class k4g {

    /* JADX INFO: renamed from: c */
    public static final k4g f52587c = new k4g(new g6g[0]);

    /* JADX INFO: renamed from: a */
    public final g6g[] f52588a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f52589b = new AtomicBoolean(false);

    @gdi
    public k4g(g6g[] g6gVarArr) {
        this.f52588a = g6gVarArr;
    }

    public static k4g newClientContext(q42[] q42VarArr, sc0 sc0Var, fta ftaVar) {
        k4g k4gVar = new k4g(q42VarArr);
        for (q42 q42Var : q42VarArr) {
            q42Var.streamCreated(sc0Var, ftaVar);
        }
        return k4gVar;
    }

    public static k4g newServerContext(List<? extends y3f.AbstractC15412a> list, String str, fta ftaVar) {
        if (list.isEmpty()) {
            return f52587c;
        }
        int size = list.size();
        g6g[] g6gVarArr = new g6g[size];
        for (int i = 0; i < size; i++) {
            g6gVarArr[i] = list.get(i).newServerStreamTracer(str, ftaVar);
        }
        return new k4g(g6gVarArr);
    }

    public void clientInboundHeaders() {
        for (g6g g6gVar : this.f52588a) {
            ((q42) g6gVar).inboundHeaders();
        }
    }

    public void clientInboundTrailers(fta ftaVar) {
        for (g6g g6gVar : this.f52588a) {
            ((q42) g6gVar).inboundTrailers(ftaVar);
        }
    }

    public void clientOutboundHeaders() {
        for (g6g g6gVar : this.f52588a) {
            ((q42) g6gVar).outboundHeaders();
        }
    }

    @gdi
    public List<g6g> getTracersForTest() {
        return new ArrayList(Arrays.asList(this.f52588a));
    }

    public void inboundMessage(int i) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.inboundMessage(i);
        }
    }

    public void inboundMessageRead(int i, long j, long j2) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.inboundMessageRead(i, j, j2);
        }
    }

    public void inboundUncompressedSize(long j) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.inboundUncompressedSize(j);
        }
    }

    public void inboundWireSize(long j) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.inboundWireSize(j);
        }
    }

    public void outboundMessage(int i) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.outboundMessage(i);
        }
    }

    public void outboundMessageSent(int i, long j, long j2) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.outboundMessageSent(i, j, j2);
        }
    }

    public void outboundUncompressedSize(long j) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.outboundUncompressedSize(j);
        }
    }

    public void outboundWireSize(long j) {
        for (g6g g6gVar : this.f52588a) {
            g6gVar.outboundWireSize(j);
        }
    }

    public void serverCallStarted(y3f.AbstractC15414c<?, ?> abstractC15414c) {
        for (g6g g6gVar : this.f52588a) {
            ((y3f) g6gVar).serverCallStarted(abstractC15414c);
        }
    }

    public <ReqT, RespT> fx2 serverFilterContext(fx2 fx2Var) {
        fx2 fx2VarFilterContext = (fx2) v7d.checkNotNull(fx2Var, "context");
        for (g6g g6gVar : this.f52588a) {
            fx2VarFilterContext = ((y3f) g6gVar).filterContext(fx2VarFilterContext);
            v7d.checkNotNull(fx2VarFilterContext, "%s returns null context", g6gVar);
        }
        return fx2VarFilterContext;
    }

    public void streamClosed(n4g n4gVar) {
        if (this.f52589b.compareAndSet(false, true)) {
            for (g6g g6gVar : this.f52588a) {
                g6gVar.streamClosed(n4gVar);
            }
        }
    }
}
