package p000;

import java.util.concurrent.Executor;
import p000.da8;
import p000.p42;
import p000.r42;

/* JADX INFO: loaded from: classes7.dex */
public class ep5 implements r42 {

    /* JADX INFO: renamed from: a */
    @gdi
    public final n4g f33795a;

    /* JADX INFO: renamed from: b */
    public final p42.EnumC10788a f33796b;

    /* JADX INFO: renamed from: ep5$a */
    public class RunnableC5429a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r42.InterfaceC11878a f33797a;

        public RunnableC5429a(r42.InterfaceC11878a interfaceC11878a) {
            this.f33797a = interfaceC11878a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33797a.onFailure(ep5.this.f33795a.asException());
        }
    }

    public ep5(n4g n4gVar, p42.EnumC10788a enumC10788a) {
        v7d.checkArgument(!n4gVar.isOk(), "error must not be OK");
        this.f33795a = n4gVar;
        this.f33796b = enumC10788a;
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // p000.xa8
    public ja9<da8.C4695l> getStats() {
        y6f y6fVarCreate = y6f.create();
        y6fVarCreate.set(null);
        return y6fVarCreate;
    }

    @Override // p000.r42
    public o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
        return new dp5(this.f33795a, this.f33796b, q42VarArr);
    }

    @Override // p000.r42
    public void ping(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
        executor.execute(new RunnableC5429a(interfaceC11878a));
    }
}
