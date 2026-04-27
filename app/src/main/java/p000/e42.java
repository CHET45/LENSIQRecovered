package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.rua;
import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public class e42 {

    /* JADX INFO: renamed from: a */
    public static final w22<Object, Object> f31733a = new C5096b();

    /* JADX INFO: renamed from: e42$a */
    public class C5095a implements d42 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rua.InterfaceC12302c f31734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rua.InterfaceC12302c f31735b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d42 f31736c;

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* JADX INFO: renamed from: e42$a$a */
        public class a<ReqT, RespT> extends eic<ReqT, RespT> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ w22 f31737a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rua f31738b;

            /* JADX INFO: Add missing generic type declarations: [WRespT] */
            /* JADX INFO: renamed from: e42$a$a$a, reason: collision with other inner class name */
            public class C16433a<WRespT> extends fic<WRespT> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ w22.AbstractC14364a f31740a;

                public C16433a(w22.AbstractC14364a abstractC14364a) {
                    this.f31740a = abstractC14364a;
                }

                @Override // p000.fic
                /* JADX INFO: renamed from: a */
                public w22.AbstractC14364a<?> mo9655a() {
                    return this.f31740a;
                }

                @Override // p000.w22.AbstractC14364a
                public void onMessage(WRespT wrespt) {
                    this.f31740a.onMessage(a.this.f31738b.getResponseMarshaller().parse(C5095a.this.f31735b.stream(wrespt)));
                }
            }

            public a(w22 w22Var, rua ruaVar) {
                this.f31737a = w22Var;
                this.f31738b = ruaVar;
            }

            @Override // p000.eic
            /* JADX INFO: renamed from: a */
            public w22<?, ?> mo9654a() {
                return this.f31737a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.w22
            public void sendMessage(ReqT reqt) {
                this.f31737a.sendMessage(C5095a.this.f31734a.parse(this.f31738b.getRequestMarshaller().stream(reqt)));
            }

            @Override // p000.w22
            public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
                this.f31737a.start(new C16433a(abstractC14364a), ftaVar);
            }
        }

        public C5095a(rua.InterfaceC12302c interfaceC12302c, rua.InterfaceC12302c interfaceC12302c2, d42 d42Var) {
            this.f31734a = interfaceC12302c;
            this.f31735b = interfaceC12302c2;
            this.f31736c = d42Var;
        }

        @Override // p000.d42
        public <ReqT, RespT> w22<ReqT, RespT> interceptCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var, bu1 bu1Var) {
            return new a(this.f31736c.interceptCall(ruaVar.toBuilder(this.f31734a, this.f31735b).build(), rn1Var, bu1Var), ruaVar);
        }
    }

    /* JADX INFO: renamed from: e42$b */
    public class C5096b extends w22<Object, Object> {
        @Override // p000.w22
        public void cancel(String str, Throwable th) {
        }

        @Override // p000.w22
        public void halfClose() {
        }

        @Override // p000.w22
        public boolean isReady() {
            return false;
        }

        @Override // p000.w22
        public void request(int i) {
        }

        @Override // p000.w22
        public void sendMessage(Object obj) {
        }

        @Override // p000.w22
        public void start(w22.AbstractC14364a<Object> abstractC14364a, fta ftaVar) {
        }
    }

    /* JADX INFO: renamed from: e42$c */
    public static abstract class AbstractC5097c<ReqT, RespT> extends fr6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public w22<ReqT, RespT> f31742a;

        public AbstractC5097c(w22<ReqT, RespT> w22Var) {
            this.f31742a = w22Var;
        }

        @Override // p000.fr6, p000.eic
        /* JADX INFO: renamed from: a */
        public final w22<ReqT, RespT> mo9654a() {
            return this.f31742a;
        }

        /* JADX INFO: renamed from: b */
        public abstract void m9656b(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) throws Exception;

        @Override // p000.fr6, p000.w22
        public final void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
            try {
                m9656b(abstractC14364a, ftaVar);
            } catch (Exception e) {
                this.f31742a = e42.f31733a;
                fta ftaVarTrailersFromThrowable = n4g.trailersFromThrowable(e);
                n4g n4gVarFromThrowable = n4g.fromThrowable(e);
                if (ftaVarTrailersFromThrowable == null) {
                    ftaVarTrailersFromThrowable = new fta();
                }
                abstractC14364a.onClose(n4gVarFromThrowable, ftaVarTrailersFromThrowable);
            }
        }
    }

    /* JADX INFO: renamed from: e42$d */
    public static class C5098d extends bu1 {

        /* JADX INFO: renamed from: a */
        public final bu1 f31743a;

        /* JADX INFO: renamed from: b */
        public final d42 f31744b;

        public /* synthetic */ C5098d(bu1 bu1Var, d42 d42Var, C5095a c5095a) {
            this(bu1Var, d42Var);
        }

        @Override // p000.bu1
        public String authority() {
            return this.f31743a.authority();
        }

        @Override // p000.bu1
        public <ReqT, RespT> w22<ReqT, RespT> newCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
            return this.f31744b.interceptCall(ruaVar, rn1Var, this.f31743a);
        }

        private C5098d(bu1 bu1Var, d42 d42Var) {
            this.f31743a = bu1Var;
            this.f31744b = (d42) v7d.checkNotNull(d42Var, "interceptor");
        }
    }

    private e42() {
    }

    /* JADX INFO: renamed from: b */
    public static <WReqT, WRespT> d42 m9653b(d42 d42Var, rua.InterfaceC12302c<WReqT> interfaceC12302c, rua.InterfaceC12302c<WRespT> interfaceC12302c2) {
        return new C5095a(interfaceC12302c, interfaceC12302c2, d42Var);
    }

    public static bu1 intercept(bu1 bu1Var, d42... d42VarArr) {
        return intercept(bu1Var, (List<? extends d42>) Arrays.asList(d42VarArr));
    }

    public static bu1 interceptForward(bu1 bu1Var, d42... d42VarArr) {
        return interceptForward(bu1Var, (List<? extends d42>) Arrays.asList(d42VarArr));
    }

    public static bu1 intercept(bu1 bu1Var, List<? extends d42> list) {
        v7d.checkNotNull(bu1Var, "channel");
        Iterator<? extends d42> it = list.iterator();
        while (it.hasNext()) {
            bu1Var = new C5098d(bu1Var, it.next(), null);
        }
        return bu1Var;
    }

    public static bu1 interceptForward(bu1 bu1Var, List<? extends d42> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(bu1Var, arrayList);
    }
}
