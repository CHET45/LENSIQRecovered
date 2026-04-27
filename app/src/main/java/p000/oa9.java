package p000;

import android.util.SparseArray;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p000.na9;
import p000.sa9;

/* JADX INFO: loaded from: classes6.dex */
@SuppressFBWarnings({"BC"})
public class oa9 implements na9.InterfaceC9763a, sa9.InterfaceC12498b<C10279b> {

    /* JADX INFO: renamed from: a */
    public InterfaceC10278a f66979a;

    /* JADX INFO: renamed from: oa9$a */
    public interface InterfaceC10278a {
        void blockEnd(@efb cn4 cn4Var, int i, h61 h61Var, @efb yxf yxfVar);

        void infoReady(@efb cn4 cn4Var, @efb bd1 bd1Var, boolean z, @efb C10279b c10279b);

        void progress(@efb cn4 cn4Var, long j, @efb yxf yxfVar);

        void progressBlock(@efb cn4 cn4Var, int i, long j, @efb yxf yxfVar);

        void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc, @efb yxf yxfVar);
    }

    /* JADX INFO: renamed from: oa9$b */
    public static class C10279b extends na9.C9765c {

        /* JADX INFO: renamed from: e */
        public yxf f66980e;

        /* JADX INFO: renamed from: f */
        public SparseArray<yxf> f66981f;

        public C10279b(int i) {
            super(i);
        }

        public yxf getBlockSpeed(int i) {
            return this.f66981f.get(i);
        }

        public yxf getTaskSpeed() {
            return this.f66980e;
        }

        @Override // p000.na9.C9765c, p000.sa9.InterfaceC12497a
        public void onInfoValid(@efb bd1 bd1Var) {
            super.onInfoValid(bd1Var);
            this.f66980e = new yxf();
            this.f66981f = new SparseArray<>();
            int blockCount = bd1Var.getBlockCount();
            for (int i = 0; i < blockCount; i++) {
                this.f66981f.put(i, new yxf());
            }
        }
    }

    @Override // p000.na9.InterfaceC9763a
    public boolean dispatchBlockEnd(cn4 cn4Var, int i, na9.C9765c c9765c) {
        C10279b c10279b = (C10279b) c9765c;
        c10279b.f66981f.get(i).endTask();
        InterfaceC10278a interfaceC10278a = this.f66979a;
        if (interfaceC10278a == null) {
            return true;
        }
        interfaceC10278a.blockEnd(cn4Var, i, c9765c.f63797b.getBlock(i), c10279b.getBlockSpeed(i));
        return true;
    }

    @Override // p000.na9.InterfaceC9763a
    public boolean dispatchFetchProgress(@efb cn4 cn4Var, int i, long j, @efb na9.C9765c c9765c) {
        C10279b c10279b = (C10279b) c9765c;
        c10279b.f66981f.get(i).downloading(j);
        c10279b.f66980e.downloading(j);
        InterfaceC10278a interfaceC10278a = this.f66979a;
        if (interfaceC10278a == null) {
            return true;
        }
        interfaceC10278a.progressBlock(cn4Var, i, c9765c.f63799d.get(i).longValue(), c10279b.getBlockSpeed(i));
        this.f66979a.progress(cn4Var, c9765c.f63798c, c10279b.f66980e);
        return true;
    }

    @Override // p000.na9.InterfaceC9763a
    public boolean dispatchInfoReady(cn4 cn4Var, @efb bd1 bd1Var, boolean z, @efb na9.C9765c c9765c) {
        InterfaceC10278a interfaceC10278a = this.f66979a;
        if (interfaceC10278a == null) {
            return true;
        }
        interfaceC10278a.infoReady(cn4Var, bd1Var, z, (C10279b) c9765c);
        return true;
    }

    @Override // p000.na9.InterfaceC9763a
    public boolean dispatchTaskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc, @efb na9.C9765c c9765c) {
        yxf yxfVar = ((C10279b) c9765c).f66980e;
        if (yxfVar != null) {
            yxfVar.endTask();
        } else {
            yxfVar = new yxf();
        }
        InterfaceC10278a interfaceC10278a = this.f66979a;
        if (interfaceC10278a == null) {
            return true;
        }
        interfaceC10278a.taskEnd(cn4Var, x15Var, exc, yxfVar);
        return true;
    }

    public void setCallback(InterfaceC10278a interfaceC10278a) {
        this.f66979a = interfaceC10278a;
    }

    @Override // p000.sa9.InterfaceC12498b
    public C10279b create(int i) {
        return new C10279b(i);
    }
}
