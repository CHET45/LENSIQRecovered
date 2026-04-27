package p000;

import java.util.concurrent.ExecutionException;
import p000.ht6;
import p000.it6;
import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/2189")
public final class wgh implements j3f {

    /* JADX INFO: Add missing generic type declarations: [ReqT] */
    /* JADX INFO: renamed from: wgh$a */
    public class C14596a<ReqT> extends it6.AbstractC7594a<ReqT> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w2f f94216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14596a(w2f.AbstractC14368a abstractC14368a, w2f w2fVar) {
            super(abstractC14368a);
            this.f94216b = w2fVar;
        }

        private void closeWithException(v4g v4gVar) {
            fta trailers = v4gVar.getTrailers();
            if (trailers == null) {
                trailers = new fta();
            }
            this.f94216b.close(v4gVar.getStatus(), trailers);
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onCancel() {
            try {
                super.onCancel();
            } catch (v4g e) {
                closeWithException(e);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onComplete() {
            try {
                super.onComplete();
            } catch (v4g e) {
                closeWithException(e);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onHalfClose() {
            try {
                super.onHalfClose();
            } catch (v4g e) {
                closeWithException(e);
            }
        }

        @Override // p000.it6, p000.w2f.AbstractC14368a
        public void onMessage(ReqT reqt) {
            try {
                super.onMessage(reqt);
            } catch (v4g e) {
                closeWithException(e);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onReady() {
            try {
                super.onReady();
            } catch (v4g e) {
                closeWithException(e);
            }
        }
    }

    /* JADX INFO: renamed from: wgh$b */
    public static class C14597b<ReqT, RespT> extends ht6.AbstractC7011a<ReqT, RespT> {

        /* JADX INFO: renamed from: d */
        public static final String f94218d = "Encountered error during serialized access";

        /* JADX INFO: renamed from: b */
        public final t2f f94219b;

        /* JADX INFO: renamed from: c */
        public boolean f94220c;

        /* JADX INFO: renamed from: wgh$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y6f f94221a;

            public a(y6f y6fVar) {
                this.f94221a = y6fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f94221a.set(C14597b.super.getAuthority());
            }
        }

        /* JADX INFO: renamed from: wgh$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f94223a;

            public b(Object obj) {
                this.f94223a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14597b.super.sendMessage(this.f94223a);
            }
        }

        /* JADX INFO: renamed from: wgh$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f94225a;

            public c(int i) {
                this.f94225a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14597b.super.request(this.f94225a);
            }
        }

        /* JADX INFO: renamed from: wgh$b$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fta f94227a;

            public d(fta ftaVar) {
                this.f94227a = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14597b.super.sendHeaders(this.f94227a);
            }
        }

        /* JADX INFO: renamed from: wgh$b$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f94229a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fta f94230b;

            public e(n4g n4gVar, fta ftaVar) {
                this.f94229a = n4gVar;
                this.f94230b = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C14597b.this.f94220c) {
                    return;
                }
                C14597b.this.f94220c = true;
                C14597b.super.close(this.f94229a, this.f94230b);
            }
        }

        /* JADX INFO: renamed from: wgh$b$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y6f f94232a;

            public f(y6f y6fVar) {
                this.f94232a = y6fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f94232a.set(Boolean.valueOf(C14597b.super.isReady()));
            }
        }

        /* JADX INFO: renamed from: wgh$b$g */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y6f f94234a;

            public g(y6f y6fVar) {
                this.f94234a = y6fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f94234a.set(Boolean.valueOf(C14597b.super.isCancelled()));
            }
        }

        /* JADX INFO: renamed from: wgh$b$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f94236a;

            public h(boolean z) {
                this.f94236a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14597b.super.setMessageCompression(this.f94236a);
            }
        }

        /* JADX INFO: renamed from: wgh$b$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f94238a;

            public i(String str) {
                this.f94238a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14597b.super.setCompression(this.f94238a);
            }
        }

        /* JADX INFO: renamed from: wgh$b$j */
        public class j implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y6f f94240a;

            public j(y6f y6fVar) {
                this.f94240a = y6fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f94240a.set(C14597b.super.getAttributes());
            }
        }

        public C14597b(w2f<ReqT, RespT> w2fVar) {
            super(w2fVar);
            this.f94219b = new t2f(xya.directExecutor());
            this.f94220c = false;
        }

        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public void close(n4g n4gVar, fta ftaVar) {
            this.f94219b.execute(new e(n4gVar, ftaVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public sc0 getAttributes() {
            y6f y6fVarCreate = y6f.create();
            this.f94219b.execute(new j(y6fVarCreate));
            try {
                return (sc0) y6fVarCreate.get();
            } catch (InterruptedException e2) {
                throw new RuntimeException(f94218d, e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException(f94218d, e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        @eib
        public String getAuthority() {
            y6f y6fVarCreate = y6f.create();
            this.f94219b.execute(new a(y6fVarCreate));
            try {
                return (String) y6fVarCreate.get();
            } catch (InterruptedException e2) {
                throw new RuntimeException(f94218d, e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException(f94218d, e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public boolean isCancelled() {
            y6f y6fVarCreate = y6f.create();
            this.f94219b.execute(new g(y6fVarCreate));
            try {
                return ((Boolean) y6fVarCreate.get()).booleanValue();
            } catch (InterruptedException e2) {
                throw new RuntimeException(f94218d, e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException(f94218d, e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public boolean isReady() {
            y6f y6fVarCreate = y6f.create();
            this.f94219b.execute(new f(y6fVarCreate));
            try {
                return ((Boolean) y6fVarCreate.get()).booleanValue();
            } catch (InterruptedException e2) {
                throw new RuntimeException(f94218d, e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException(f94218d, e3);
            }
        }

        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public void request(int i2) {
            this.f94219b.execute(new c(i2));
        }

        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public void sendHeaders(fta ftaVar) {
            this.f94219b.execute(new d(ftaVar));
        }

        @Override // p000.ht6, p000.w2f
        public void sendMessage(RespT respt) {
            this.f94219b.execute(new b(respt));
        }

        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public void setCompression(String str) {
            this.f94219b.execute(new i(str));
        }

        @Override // p000.ht6.AbstractC7011a, p000.ht6, p000.gic, p000.w2f
        public void setMessageCompression(boolean z) {
            this.f94219b.execute(new h(z));
        }
    }

    private wgh() {
    }

    public static j3f instance() {
        return new wgh();
    }

    @Override // p000.j3f
    public <ReqT, RespT> w2f.AbstractC14368a<ReqT> interceptCall(w2f<ReqT, RespT> w2fVar, fta ftaVar, y2f<ReqT, RespT> y2fVar) {
        C14597b c14597b = new C14597b(w2fVar);
        return new C14596a(y2fVar.startCall(c14597b, ftaVar), c14597b);
    }
}
