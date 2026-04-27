package p000;

import android.util.SparseArray;
import p000.na9.C9765c;
import p000.sa9;

/* JADX INFO: loaded from: classes6.dex */
public class na9<T extends C9765c> implements qa9 {

    /* JADX INFO: renamed from: a */
    public InterfaceC9764b f63793a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9763a f63794b;

    /* JADX INFO: renamed from: c */
    public final sa9<T> f63795c;

    /* JADX INFO: renamed from: na9$a */
    public interface InterfaceC9763a {
        boolean dispatchBlockEnd(cn4 cn4Var, int i, C9765c c9765c);

        boolean dispatchFetchProgress(@efb cn4 cn4Var, int i, long j, @efb C9765c c9765c);

        boolean dispatchInfoReady(cn4 cn4Var, @efb bd1 bd1Var, boolean z, @efb C9765c c9765c);

        boolean dispatchTaskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc, @efb C9765c c9765c);
    }

    /* JADX INFO: renamed from: na9$b */
    public interface InterfaceC9764b {
        void blockEnd(cn4 cn4Var, int i, h61 h61Var);

        void infoReady(cn4 cn4Var, @efb bd1 bd1Var, boolean z, @efb C9765c c9765c);

        void progress(cn4 cn4Var, long j);

        void progressBlock(cn4 cn4Var, int i, long j);

        void taskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc, @efb C9765c c9765c);
    }

    /* JADX INFO: renamed from: na9$c */
    public static class C9765c implements sa9.InterfaceC12497a {

        /* JADX INFO: renamed from: a */
        public final int f63796a;

        /* JADX INFO: renamed from: b */
        public bd1 f63797b;

        /* JADX INFO: renamed from: c */
        public long f63798c;

        /* JADX INFO: renamed from: d */
        public SparseArray<Long> f63799d;

        public C9765c(int i) {
            this.f63796a = i;
        }

        /* JADX INFO: renamed from: a */
        public SparseArray<Long> m17829a() {
            return this.f63799d;
        }

        public SparseArray<Long> cloneBlockCurrentOffsetMap() {
            return this.f63799d.clone();
        }

        public long getBlockCurrentOffset(int i) {
            return this.f63799d.get(i).longValue();
        }

        public long getCurrentOffset() {
            return this.f63798c;
        }

        @Override // p000.sa9.InterfaceC12497a
        public int getId() {
            return this.f63796a;
        }

        public bd1 getInfo() {
            return this.f63797b;
        }

        @Override // p000.sa9.InterfaceC12497a
        public void onInfoValid(@efb bd1 bd1Var) {
            this.f63797b = bd1Var;
            this.f63798c = bd1Var.getTotalOffset();
            SparseArray<Long> sparseArray = new SparseArray<>();
            int blockCount = bd1Var.getBlockCount();
            for (int i = 0; i < blockCount; i++) {
                sparseArray.put(i, Long.valueOf(bd1Var.getBlock(i).getCurrentOffset()));
            }
            this.f63799d = sparseArray;
        }
    }

    public na9(sa9<T> sa9Var) {
        this.f63795c = sa9Var;
    }

    public void fetchEnd(cn4 cn4Var, int i) {
        InterfaceC9764b interfaceC9764b;
        C9765c c9765c = (C9765c) this.f63795c.m21794b(cn4Var, cn4Var.getInfo());
        if (c9765c == null) {
            return;
        }
        InterfaceC9763a interfaceC9763a = this.f63794b;
        if ((interfaceC9763a == null || !interfaceC9763a.dispatchBlockEnd(cn4Var, i, c9765c)) && (interfaceC9764b = this.f63793a) != null) {
            interfaceC9764b.blockEnd(cn4Var, i, c9765c.f63797b.getBlock(i));
        }
    }

    public void fetchProgress(cn4 cn4Var, int i, long j) {
        InterfaceC9764b interfaceC9764b;
        C9765c c9765c = (C9765c) this.f63795c.m21794b(cn4Var, cn4Var.getInfo());
        if (c9765c == null) {
            return;
        }
        long jLongValue = c9765c.f63799d.get(i).longValue() + j;
        c9765c.f63799d.put(i, Long.valueOf(jLongValue));
        c9765c.f63798c += j;
        InterfaceC9763a interfaceC9763a = this.f63794b;
        if ((interfaceC9763a == null || !interfaceC9763a.dispatchFetchProgress(cn4Var, i, j, c9765c)) && (interfaceC9764b = this.f63793a) != null) {
            interfaceC9764b.progressBlock(cn4Var, i, jLongValue);
            this.f63793a.progress(cn4Var, c9765c.f63798c);
        }
    }

    public InterfaceC9763a getAssistExtend() {
        return this.f63794b;
    }

    public void infoReady(cn4 cn4Var, bd1 bd1Var, boolean z) {
        InterfaceC9764b interfaceC9764b;
        C9765c c9765c = (C9765c) this.f63795c.m21793a(cn4Var, bd1Var);
        InterfaceC9763a interfaceC9763a = this.f63794b;
        if ((interfaceC9763a == null || !interfaceC9763a.dispatchInfoReady(cn4Var, bd1Var, z, c9765c)) && (interfaceC9764b = this.f63793a) != null) {
            interfaceC9764b.infoReady(cn4Var, bd1Var, z, c9765c);
        }
    }

    @Override // p000.qa9
    public boolean isAlwaysRecoverAssistModel() {
        return this.f63795c.isAlwaysRecoverAssistModel();
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.f63795c.setAlwaysRecoverAssistModel(z);
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.f63795c.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    public void setAssistExtend(@efb InterfaceC9763a interfaceC9763a) {
        this.f63794b = interfaceC9763a;
    }

    public void setCallback(@efb InterfaceC9764b interfaceC9764b) {
        this.f63793a = interfaceC9764b;
    }

    public synchronized void taskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc) {
        C9765c c9765c = (C9765c) this.f63795c.m21795c(cn4Var, cn4Var.getInfo());
        InterfaceC9763a interfaceC9763a = this.f63794b;
        if (interfaceC9763a == null || !interfaceC9763a.dispatchTaskEnd(cn4Var, x15Var, exc, c9765c)) {
            InterfaceC9764b interfaceC9764b = this.f63793a;
            if (interfaceC9764b != null) {
                interfaceC9764b.taskEnd(cn4Var, x15Var, exc, c9765c);
            }
        }
    }

    public na9(sa9.InterfaceC12498b<T> interfaceC12498b) {
        this.f63795c = new sa9<>(interfaceC12498b);
    }
}
