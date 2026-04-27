package p000;

import p000.q8b;
import p000.sc0;

/* JADX INFO: loaded from: classes7.dex */
public final class x8e extends vs6 {

    /* JADX INFO: renamed from: e */
    public static final sc0.C12516c<C14989b> f97194e = sc0.C12516c.create("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b */
    public final q8b f97195b;

    /* JADX INFO: renamed from: c */
    public final v8e f97196c;

    /* JADX INFO: renamed from: d */
    public final thg f97197d;

    /* JADX INFO: renamed from: x8e$a */
    @gdi
    public class RunnableC14988a implements Runnable {
        public RunnableC14988a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x8e.this.refresh();
        }
    }

    /* JADX INFO: renamed from: x8e$b */
    public class C14989b {
        public C14989b() {
        }

        public void resolutionAttempted(n4g n4gVar) {
            if (n4gVar.isOk()) {
                x8e.this.f97196c.reset();
            } else {
                x8e.this.f97196c.schedule(x8e.this.new RunnableC14988a());
            }
        }
    }

    /* JADX INFO: renamed from: x8e$c */
    public class C14990c extends q8b.AbstractC11375e {

        /* JADX INFO: renamed from: a */
        public q8b.AbstractC11375e f97200a;

        public C14990c(q8b.AbstractC11375e abstractC11375e) {
            this.f97200a = abstractC11375e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0() {
            x8e.this.f97196c.schedule(x8e.this.new RunnableC14988a());
        }

        @Override // p000.q8b.AbstractC11375e, p000.q8b.InterfaceC11376f
        public void onError(n4g n4gVar) {
            this.f97200a.onError(n4gVar);
            x8e.this.f97197d.execute(new Runnable() { // from class: y8e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100762a.lambda$onError$0();
                }
            });
        }

        @Override // p000.q8b.AbstractC11375e
        public void onResult(q8b.C11377g c11377g) {
            sc0 attributes = c11377g.getAttributes();
            sc0.C12516c<C14989b> c12516c = x8e.f97194e;
            if (attributes.get(c12516c) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f97200a.onResult(c11377g.toBuilder().setAttributes(c11377g.getAttributes().toBuilder().set(c12516c, x8e.this.new C14989b()).build()).build());
        }
    }

    public x8e(q8b q8bVar, v8e v8eVar, thg thgVar) {
        super(q8bVar);
        this.f97195b = q8bVar;
        this.f97196c = v8eVar;
        this.f97197d = thgVar;
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public q8b m25047c() {
        return this.f97195b;
    }

    @Override // p000.vs6, p000.q8b
    public void shutdown() {
        super.shutdown();
        this.f97196c.reset();
    }

    @Override // p000.vs6, p000.q8b
    public void start(q8b.AbstractC11375e abstractC11375e) {
        super.start((q8b.AbstractC11375e) new C14990c(abstractC11375e));
    }
}
