package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.ei9;
import p000.p7e;
import p000.vhg;
import p000.xn0;

/* JADX INFO: loaded from: classes4.dex */
public class nxh {

    /* JADX INFO: renamed from: j */
    public static final String f65981j = "Uploader";

    /* JADX INFO: renamed from: k */
    public static final String f65982k = "GDT_CLIENT_METRICS";

    /* JADX INFO: renamed from: a */
    public final Context f65983a;

    /* JADX INFO: renamed from: b */
    public final un0 f65984b;

    /* JADX INFO: renamed from: c */
    public final t65 f65985c;

    /* JADX INFO: renamed from: d */
    public final nqi f65986d;

    /* JADX INFO: renamed from: e */
    public final Executor f65987e;

    /* JADX INFO: renamed from: f */
    public final vhg f65988f;

    /* JADX INFO: renamed from: g */
    public final g52 f65989g;

    /* JADX INFO: renamed from: h */
    public final g52 f65990h;

    /* JADX INFO: renamed from: i */
    public final b42 f65991i;

    @a28
    public nxh(Context context, un0 un0Var, t65 t65Var, nqi nqiVar, Executor executor, vhg vhgVar, @ehi g52 g52Var, @pya g52 g52Var2, b42 b42Var) {
        this.f65983a = context;
        this.f65984b = un0Var;
        this.f65985c = t65Var;
        this.f65986d = nqiVar;
        this.f65987e = executor;
        this.f65988f = vhgVar;
        this.f65989g = g52Var;
        this.f65990h = g52Var2;
        this.f65991i = b42Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$logAndUpdateState$2(chh chhVar) {
        return Boolean.valueOf(this.f65985c.hasPendingEventsFor(chhVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable lambda$logAndUpdateState$3(chh chhVar) {
        return this.f65985c.loadBatch(chhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$4(Iterable iterable, chh chhVar, long j) {
        this.f65985c.recordFailure(iterable);
        this.f65985c.recordNextCallTime(chhVar, this.f65989g.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$5(Iterable iterable) {
        this.f65985c.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$6() {
        this.f65991i.resetClientMetrics();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$7(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f65991i.recordLogEventDropped(((Integer) r0.getValue()).intValue(), ei9.EnumC5322b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$8(chh chhVar, long j) {
        this.f65985c.recordNextCallTime(chhVar, this.f65989g.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$upload$0(chh chhVar, int i) {
        this.f65986d.schedule(chhVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$upload$1(final chh chhVar, final int i, Runnable runnable) {
        try {
            try {
                vhg vhgVar = this.f65988f;
                final t65 t65Var = this.f65985c;
                Objects.requireNonNull(t65Var);
                vhgVar.runCriticalSection(new vhg.InterfaceC14075a() { // from class: cxh
                    @Override // p000.vhg.InterfaceC14075a
                    public final Object execute() {
                        return Integer.valueOf(t65Var.cleanUp());
                    }
                });
                if (m18201j()) {
                    logAndUpdateState(chhVar, i);
                } else {
                    this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: exh
                        @Override // p000.vhg.InterfaceC14075a
                        public final Object execute() {
                            return this.f34422a.lambda$upload$0(chhVar, i);
                        }
                    });
                }
            } catch (uhg unused) {
                this.f65986d.schedule(chhVar, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    @fdi
    public a65 createMetricsEvent(bhh bhhVar) {
        vhg vhgVar = this.f65988f;
        final b42 b42Var = this.f65991i;
        Objects.requireNonNull(b42Var);
        return bhhVar.decorate(a65.builder().setEventMillis(this.f65989g.getTime()).setUptimeMillis(this.f65990h.getTime()).setTransportName(f65982k).setEncodedPayload(new k15(q15.m19986of("proto"), ((f42) vhgVar.runCriticalSection(new vhg.InterfaceC14075a() { // from class: gxh
            @Override // p000.vhg.InterfaceC14075a
            public final Object execute() {
                return b42Var.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    /* JADX INFO: renamed from: j */
    public boolean m18201j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f65983a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @op1
    @p7e({p7e.EnumC10826a.f69935b})
    public xn0 logAndUpdateState(final chh chhVar, int i) {
        xn0 xn0VarSend;
        bhh bhhVar = this.f65984b.get(chhVar.getBackendName());
        long jMax = 0;
        xn0 xn0VarM25330ok = xn0.m25330ok(0L);
        while (true) {
            final long j = jMax;
            while (((Boolean) this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: hxh
                @Override // p000.vhg.InterfaceC14075a
                public final Object execute() {
                    return this.f45204a.lambda$logAndUpdateState$2(chhVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: ixh
                    @Override // p000.vhg.InterfaceC14075a
                    public final Object execute() {
                        return this.f48846a.lambda$logAndUpdateState$3(chhVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return xn0VarM25330ok;
                }
                if (bhhVar == null) {
                    tj9.m22693d(f65981j, "Unknown backend for %s, deleting event batch for it...", chhVar);
                    xn0VarSend = xn0.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((gqc) it.next()).getEvent());
                    }
                    if (chhVar.shouldUploadClientHealthMetrics()) {
                        arrayList.add(createMetricsEvent(bhhVar));
                    }
                    xn0VarSend = bhhVar.send(wn0.builder().setEvents(arrayList).setExtras(chhVar.getExtras()).build());
                }
                xn0VarM25330ok = xn0VarSend;
                if (xn0VarM25330ok.getStatus() == xn0.EnumC15205a.TRANSIENT_ERROR) {
                    this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: jxh
                        @Override // p000.vhg.InterfaceC14075a
                        public final Object execute() {
                            return this.f52203a.lambda$logAndUpdateState$4(iterable, chhVar, j);
                        }
                    });
                    this.f65986d.schedule(chhVar, i + 1, true);
                    return xn0VarM25330ok;
                }
                this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: kxh
                    @Override // p000.vhg.InterfaceC14075a
                    public final Object execute() {
                        return this.f55610a.lambda$logAndUpdateState$5(iterable);
                    }
                });
                if (xn0VarM25330ok.getStatus() == xn0.EnumC15205a.OK) {
                    jMax = Math.max(j, xn0VarM25330ok.getNextRequestWaitMillis());
                    if (chhVar.shouldUploadClientHealthMetrics()) {
                        this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: lxh
                            @Override // p000.vhg.InterfaceC14075a
                            public final Object execute() {
                                return this.f59190a.lambda$logAndUpdateState$6();
                            }
                        });
                    }
                } else if (xn0VarM25330ok.getStatus() == xn0.EnumC15205a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String transportName = ((gqc) it2.next()).getEvent().getTransportName();
                        if (map.containsKey(transportName)) {
                            map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                        } else {
                            map.put(transportName, 1);
                        }
                    }
                    this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: mxh
                        @Override // p000.vhg.InterfaceC14075a
                        public final Object execute() {
                            return this.f62768a.lambda$logAndUpdateState$7(map);
                        }
                    });
                }
            }
            this.f65988f.runCriticalSection(new vhg.InterfaceC14075a() { // from class: dxh
                @Override // p000.vhg.InterfaceC14075a
                public final Object execute() {
                    return this.f31264a.lambda$logAndUpdateState$8(chhVar, j);
                }
            });
            return xn0VarM25330ok;
        }
    }

    public void upload(final chh chhVar, final int i, final Runnable runnable) {
        this.f65987e.execute(new Runnable() { // from class: fxh
            @Override // java.lang.Runnable
            public final void run() {
                this.f38009a.lambda$upload$1(chhVar, i, runnable);
            }
        });
    }
}
