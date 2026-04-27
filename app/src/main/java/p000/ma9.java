package p000;

import java.util.concurrent.atomic.AtomicLong;
import p000.sa9;

/* JADX INFO: loaded from: classes6.dex */
public class ma9 implements qa9, sa9.InterfaceC12498b<C9237b> {

    /* JADX INFO: renamed from: a */
    public final sa9<C9237b> f60342a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9236a f60343b;

    /* JADX INFO: renamed from: ma9$a */
    public interface InterfaceC9236a {
        void connected(@efb cn4 cn4Var, @h78(from = 0) int i, @h78(from = 0) long j, @h78(from = 0) long j2);

        void progress(@efb cn4 cn4Var, @h78(from = 0) long j, @h78(from = 0) long j2);

        void retry(@efb cn4 cn4Var, @efb c8e c8eVar);

        void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc, @efb C9237b c9237b);

        void taskStart(@efb cn4 cn4Var, @efb C9237b c9237b);
    }

    /* JADX INFO: renamed from: ma9$b */
    public static class C9237b implements sa9.InterfaceC12497a {

        /* JADX INFO: renamed from: a */
        public final int f60344a;

        /* JADX INFO: renamed from: b */
        public Boolean f60345b;

        /* JADX INFO: renamed from: c */
        public Boolean f60346c;

        /* JADX INFO: renamed from: d */
        public volatile Boolean f60347d;

        /* JADX INFO: renamed from: e */
        public int f60348e;

        /* JADX INFO: renamed from: f */
        public long f60349f;

        /* JADX INFO: renamed from: g */
        public final AtomicLong f60350g = new AtomicLong();

        public C9237b(int i) {
            this.f60344a = i;
        }

        @Override // p000.sa9.InterfaceC12497a
        public int getId() {
            return this.f60344a;
        }

        public long getTotalLength() {
            return this.f60349f;
        }

        @Override // p000.sa9.InterfaceC12497a
        public void onInfoValid(@efb bd1 bd1Var) {
            this.f60348e = bd1Var.getBlockCount();
            this.f60349f = bd1Var.getTotalLength();
            this.f60350g.set(bd1Var.getTotalOffset());
            if (this.f60345b == null) {
                this.f60345b = Boolean.FALSE;
            }
            if (this.f60346c == null) {
                this.f60346c = Boolean.valueOf(this.f60350g.get() > 0);
            }
            if (this.f60347d == null) {
                this.f60347d = Boolean.TRUE;
            }
        }
    }

    public ma9() {
        this.f60342a = new sa9<>(this);
    }

    public void connectEnd(cn4 cn4Var) {
        C9237b c9237b = (C9237b) this.f60342a.m21794b(cn4Var, cn4Var.getInfo());
        if (c9237b == null) {
            return;
        }
        if (c9237b.f60346c.booleanValue() && c9237b.f60347d.booleanValue()) {
            c9237b.f60347d = Boolean.FALSE;
        }
        InterfaceC9236a interfaceC9236a = this.f60343b;
        if (interfaceC9236a != null) {
            interfaceC9236a.connected(cn4Var, c9237b.f60348e, c9237b.f60350g.get(), c9237b.f60349f);
        }
    }

    public void downloadFromBeginning(cn4 cn4Var, @efb bd1 bd1Var, c8e c8eVar) {
        InterfaceC9236a interfaceC9236a;
        C9237b c9237b = (C9237b) this.f60342a.m21794b(cn4Var, bd1Var);
        if (c9237b == null) {
            return;
        }
        c9237b.onInfoValid(bd1Var);
        if (c9237b.f60345b.booleanValue() && (interfaceC9236a = this.f60343b) != null) {
            interfaceC9236a.retry(cn4Var, c8eVar);
        }
        Boolean bool = Boolean.TRUE;
        c9237b.f60345b = bool;
        c9237b.f60346c = Boolean.FALSE;
        c9237b.f60347d = bool;
    }

    public void downloadFromBreakpoint(cn4 cn4Var, @efb bd1 bd1Var) {
        C9237b c9237b = (C9237b) this.f60342a.m21794b(cn4Var, bd1Var);
        if (c9237b == null) {
            return;
        }
        c9237b.onInfoValid(bd1Var);
        Boolean bool = Boolean.TRUE;
        c9237b.f60345b = bool;
        c9237b.f60346c = bool;
        c9237b.f60347d = bool;
    }

    public void fetchProgress(cn4 cn4Var, long j) {
        C9237b c9237b = (C9237b) this.f60342a.m21794b(cn4Var, cn4Var.getInfo());
        if (c9237b == null) {
            return;
        }
        c9237b.f60350g.addAndGet(j);
        InterfaceC9236a interfaceC9236a = this.f60343b;
        if (interfaceC9236a != null) {
            interfaceC9236a.progress(cn4Var, c9237b.f60350g.get(), c9237b.f60349f);
        }
    }

    @Override // p000.qa9
    public boolean isAlwaysRecoverAssistModel() {
        return this.f60342a.isAlwaysRecoverAssistModel();
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.f60342a.setAlwaysRecoverAssistModel(z);
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.f60342a.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    public void setCallback(@efb InterfaceC9236a interfaceC9236a) {
        this.f60343b = interfaceC9236a;
    }

    public void taskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc) {
        C9237b c9237b = (C9237b) this.f60342a.m21795c(cn4Var, cn4Var.getInfo());
        InterfaceC9236a interfaceC9236a = this.f60343b;
        if (interfaceC9236a != null) {
            interfaceC9236a.taskEnd(cn4Var, x15Var, exc, c9237b);
        }
    }

    public void taskStart(cn4 cn4Var) {
        C9237b c9237b = (C9237b) this.f60342a.m21793a(cn4Var, null);
        InterfaceC9236a interfaceC9236a = this.f60343b;
        if (interfaceC9236a != null) {
            interfaceC9236a.taskStart(cn4Var, c9237b);
        }
    }

    @Override // p000.sa9.InterfaceC12498b
    public C9237b create(int i) {
        return new C9237b(i);
    }

    public ma9(sa9<C9237b> sa9Var) {
        this.f60342a = sa9Var;
    }
}
