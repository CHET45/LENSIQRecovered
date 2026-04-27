package p000;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.k4f;
import p000.p3f;
import p000.rua;
import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
public final class k3f {

    /* JADX INFO: renamed from: k3f$a */
    public class C8185a implements rua.InterfaceC12302c<InputStream> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.rua.InterfaceC12302c
        public InputStream parse(InputStream inputStream) {
            return inputStream.markSupported() ? inputStream : inputStream instanceof ss8 ? new C8188d(inputStream) : new BufferedInputStream(inputStream);
        }

        @Override // p000.rua.InterfaceC12302c
        public InputStream stream(InputStream inputStream) {
            return inputStream;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [WRespT, WReqT] */
    /* JADX INFO: renamed from: k3f$b */
    public class C8186b<WReqT, WRespT> implements y2f<WReqT, WRespT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rua f52526a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rua f52527b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y2f f52528c;

        /* JADX INFO: Add missing generic type declarations: [OReqT, ORespT] */
        /* JADX INFO: renamed from: k3f$b$a */
        public class a<OReqT, ORespT> extends gic<OReqT, ORespT> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ w2f f52529a;

            public a(w2f w2fVar) {
                this.f52529a = w2fVar;
            }

            @Override // p000.gic
            /* JADX INFO: renamed from: a */
            public w2f<WReqT, WRespT> mo11691a() {
                return this.f52529a;
            }

            @Override // p000.w2f
            public rua<OReqT, ORespT> getMethodDescriptor() {
                return C8186b.this.f52526a;
            }

            @Override // p000.w2f
            public void sendMessage(ORespT orespt) {
                mo11691a().sendMessage(C8186b.this.f52527b.parseResponse(C8186b.this.f52526a.streamResponse(orespt)));
            }
        }

        /* JADX INFO: renamed from: k3f$b$b */
        public class b extends hic<WReqT> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ w2f.AbstractC14368a f52531a;

            public b(w2f.AbstractC14368a abstractC14368a) {
                this.f52531a = abstractC14368a;
            }

            @Override // p000.hic
            /* JADX INFO: renamed from: a */
            public w2f.AbstractC14368a<OReqT> mo12409a() {
                return this.f52531a;
            }

            @Override // p000.w2f.AbstractC14368a
            public void onMessage(WReqT wreqt) {
                mo12409a().onMessage(C8186b.this.f52526a.parseRequest(C8186b.this.f52527b.streamRequest(wreqt)));
            }
        }

        public C8186b(rua ruaVar, rua ruaVar2, y2f y2fVar) {
            this.f52526a = ruaVar;
            this.f52527b = ruaVar2;
            this.f52528c = y2fVar;
        }

        @Override // p000.y2f
        public w2f.AbstractC14368a<WReqT> startCall(w2f<WReqT, WRespT> w2fVar, fta ftaVar) {
            return new b(this.f52528c.startCall(new a(w2fVar), ftaVar));
        }
    }

    /* JADX INFO: renamed from: k3f$c */
    public static final class C8187c<ReqT, RespT> implements y2f<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final j3f f52533a;

        /* JADX INFO: renamed from: b */
        public final y2f<ReqT, RespT> f52534b;

        private C8187c(j3f j3fVar, y2f<ReqT, RespT> y2fVar) {
            this.f52533a = (j3f) v7d.checkNotNull(j3fVar, "interceptor");
            this.f52534b = y2fVar;
        }

        public static <ReqT, RespT> C8187c<ReqT, RespT> create(j3f j3fVar, y2f<ReqT, RespT> y2fVar) {
            return new C8187c<>(j3fVar, y2fVar);
        }

        @Override // p000.y2f
        public w2f.AbstractC14368a<ReqT> startCall(w2f<ReqT, RespT> w2fVar, fta ftaVar) {
            return this.f52533a.interceptCall(w2fVar, ftaVar, this.f52534b);
        }
    }

    /* JADX INFO: renamed from: k3f$d */
    public static final class C8188d extends BufferedInputStream implements ss8 {
        public C8188d(InputStream inputStream) {
            super(inputStream);
        }
    }

    private k3f() {
    }

    /* JADX INFO: renamed from: a */
    public static <OReqT, ORespT, WReqT, WRespT> m3f<WReqT, WRespT> m14484a(m3f<OReqT, ORespT> m3fVar, rua<WReqT, WRespT> ruaVar) {
        return m3f.create(ruaVar, wrapHandler(m3fVar.getServerCallHandler(), m3fVar.getMethodDescriptor(), ruaVar));
    }

    public static p3f intercept(p3f p3fVar, j3f... j3fVarArr) {
        return intercept(p3fVar, (List<? extends j3f>) Arrays.asList(j3fVarArr));
    }

    public static p3f interceptForward(p3f p3fVar, j3f... j3fVarArr) {
        return interceptForward(p3fVar, (List<? extends j3f>) Arrays.asList(j3fVarArr));
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1712")
    public static p3f useInputStreamMessages(p3f p3fVar) {
        return useMarshalledMessages(p3fVar, new C8185a());
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1712")
    public static <T> p3f useMarshalledMessages(p3f p3fVar, rua.InterfaceC12302c<T> interfaceC12302c) {
        return useMarshalledMessages(p3fVar, interfaceC12302c, interfaceC12302c);
    }

    private static <ReqT, RespT> void wrapAndAddMethod(p3f.C10785b c10785b, m3f<ReqT, RespT> m3fVar, List<? extends j3f> list) {
        y2f<ReqT, RespT> serverCallHandler = m3fVar.getServerCallHandler();
        Iterator<? extends j3f> it = list.iterator();
        while (it.hasNext()) {
            serverCallHandler = C8187c.create(it.next(), serverCallHandler);
        }
        c10785b.addMethod(m3fVar.withServerCallHandler(serverCallHandler));
    }

    private static <OReqT, ORespT, WReqT, WRespT> y2f<WReqT, WRespT> wrapHandler(y2f<OReqT, ORespT> y2fVar, rua<OReqT, ORespT> ruaVar, rua<WReqT, WRespT> ruaVar2) {
        return new C8186b(ruaVar, ruaVar2, y2fVar);
    }

    public static p3f intercept(o21 o21Var, j3f... j3fVarArr) {
        v7d.checkNotNull(o21Var, "bindableService");
        return intercept(o21Var.bindService(), (List<? extends j3f>) Arrays.asList(j3fVarArr));
    }

    public static p3f interceptForward(o21 o21Var, j3f... j3fVarArr) {
        return interceptForward(o21Var.bindService(), (List<? extends j3f>) Arrays.asList(j3fVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lg5("https://github.com/grpc/grpc-java/issues/9870")
    public static <ReqT, RespT> p3f useMarshalledMessages(p3f p3fVar, rua.InterfaceC12302c<ReqT> interfaceC12302c, rua.InterfaceC12302c<RespT> interfaceC12302c2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (m3f<?, ?> m3fVar : p3fVar.getMethods()) {
            rua ruaVarBuild = m3fVar.getMethodDescriptor().toBuilder(interfaceC12302c, interfaceC12302c2).build();
            arrayList2.add(ruaVarBuild);
            arrayList.add(m14484a(m3fVar, ruaVarBuild));
        }
        k4f.C8197b schemaDescriptor = k4f.newBuilder(p3fVar.getServiceDescriptor().getName()).setSchemaDescriptor(p3fVar.getServiceDescriptor().getSchemaDescriptor());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            schemaDescriptor.addMethod((rua) it.next());
        }
        p3f.C10785b c10785bBuilder = p3f.builder(schemaDescriptor.build());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c10785bBuilder.addMethod((m3f) it2.next());
        }
        return c10785bBuilder.build();
    }

    public static p3f interceptForward(p3f p3fVar, List<? extends j3f> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(p3fVar, arrayList);
    }

    public static p3f intercept(p3f p3fVar, List<? extends j3f> list) {
        v7d.checkNotNull(p3fVar, "serviceDef");
        if (list.isEmpty()) {
            return p3fVar;
        }
        p3f.C10785b c10785bBuilder = p3f.builder(p3fVar.getServiceDescriptor());
        Iterator<m3f<?, ?>> it = p3fVar.getMethods().iterator();
        while (it.hasNext()) {
            wrapAndAddMethod(c10785bBuilder, it.next(), list);
        }
        return c10785bBuilder.build();
    }

    public static p3f interceptForward(o21 o21Var, List<? extends j3f> list) {
        return interceptForward(o21Var.bindService(), list);
    }

    public static p3f intercept(o21 o21Var, List<? extends j3f> list) {
        v7d.checkNotNull(o21Var, "bindableService");
        return intercept(o21Var.bindService(), list);
    }
}
