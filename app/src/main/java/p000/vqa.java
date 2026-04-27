package p000;

import java.util.HashMap;
import java.util.Map;
import p000.wp9;

/* JADX INFO: loaded from: classes5.dex */
public final class vqa extends jqc {

    /* JADX INFO: renamed from: j */
    public nvd f91994j;

    /* JADX INFO: renamed from: k */
    public boolean f91995k;

    /* JADX INFO: renamed from: c */
    public final pqa f91987c = new pqa();

    /* JADX INFO: renamed from: d */
    public final Map<syh, tqa> f91988d = new HashMap();

    /* JADX INFO: renamed from: f */
    public final qqa f91990f = new qqa();

    /* JADX INFO: renamed from: g */
    public final yqa f91991g = new yqa(this);

    /* JADX INFO: renamed from: h */
    public final fqa f91992h = new fqa();

    /* JADX INFO: renamed from: i */
    public final wqa f91993i = new wqa();

    /* JADX INFO: renamed from: e */
    public final Map<syh, mqa> f91989e = new HashMap();

    private vqa() {
    }

    public static vqa createEagerGcMemoryPersistence() {
        vqa vqaVar = new vqa();
        vqaVar.setReferenceDelegate(new nqa(vqaVar));
        return vqaVar;
    }

    public static vqa createLruGcMemoryPersistence(wp9.C14736b c14736b, ud9 ud9Var) {
        vqa vqaVar = new vqa();
        vqaVar.setReferenceDelegate(new sqa(vqaVar, c14736b, ud9Var));
        return vqaVar;
    }

    private void setReferenceDelegate(nvd nvdVar) {
        this.f91994j = nvdVar;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: a */
    public mg1 mo14241a() {
        return this.f91992h;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: b */
    public gi4 mo14242b(syh syhVar) {
        mqa mqaVar = this.f91989e.get(syhVar);
        if (mqaVar != null) {
            return mqaVar;
        }
        mqa mqaVar2 = new mqa();
        this.f91989e.put(syhVar, mqaVar2);
        return mqaVar2;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: c */
    public v77 mo14243c() {
        return this.f91987c;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: e */
    public s7b mo14245e(syh syhVar, f08 f08Var) {
        tqa tqaVar = this.f91988d.get(syhVar);
        if (tqaVar != null) {
            return tqaVar;
        }
        tqa tqaVar2 = new tqa(this, syhVar);
        this.f91988d.put(syhVar, tqaVar2);
        return tqaVar2;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: f */
    public o9c mo14246f() {
        return new uqa();
    }

    @Override // p000.jqc
    public nvd getReferenceDelegate() {
        return this.f91994j;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: i */
    public <T> T mo14249i(String str, mfg<T> mfgVar) {
        this.f91994j.onTransactionStarted();
        try {
            return mfgVar.get();
        } finally {
            this.f91994j.onTransactionCommitted();
        }
    }

    @Override // p000.jqc
    public boolean isStarted() {
        return this.f91995k;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: j */
    public void mo14250j(String str, Runnable runnable) {
        this.f91994j.onTransactionStarted();
        try {
            runnable.run();
        } finally {
            this.f91994j.onTransactionCommitted();
        }
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public qqa mo14244d(syh syhVar) {
        return this.f91990f;
    }

    /* JADX INFO: renamed from: l */
    public Iterable<tqa> m24120l() {
        return this.f91988d.values();
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public wqa mo14247g() {
        return this.f91993i;
    }

    @Override // p000.jqc
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public yqa mo14248h() {
        return this.f91991g;
    }

    @Override // p000.jqc
    public void shutdown() {
        r80.hardAssert(this.f91995k, "MemoryPersistence shutdown without start", new Object[0]);
        this.f91995k = false;
    }

    @Override // p000.jqc
    public void start() {
        r80.hardAssert(!this.f91995k, "MemoryPersistence double-started!", new Object[0]);
        this.f91995k = true;
    }
}
