package p000;

import android.os.DeadObjectException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bne<SCAN_RESULT_TYPE, SCAN_CALLBACK_TYPE> extends xnd<SCAN_RESULT_TYPE> {

    /* JADX INFO: renamed from: a */
    public final hee f14223a;

    /* JADX INFO: renamed from: bne$a */
    public class C1959a implements bq1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f14224a;

        public C1959a(Object obj) {
            this.f14224a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.bq1
        public void cancel() {
            kfe.m14726i("Scan operation is requested to stop.", new Object[0]);
            bne bneVar = bne.this;
            bneVar.mo3264e(bneVar.f14223a, this.f14224a);
        }
    }

    public bne(hee heeVar) {
        this.f14223a = heeVar;
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: a */
    public final void mo3260a(lob<SCAN_RESULT_TYPE> lobVar, ynd yndVar) {
        SCAN_CALLBACK_TYPE scan_callback_typeMo3262c = mo3262c(lobVar);
        try {
            lobVar.setCancellable(new C1959a(scan_callback_typeMo3262c));
            kfe.m14726i("Scan operation is requested to start.", new Object[0]);
            if (!mo3263d(this.f14223a, scan_callback_typeMo3262c)) {
                lobVar.tryOnError(new m51(0));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: b */
    public c51 mo3261b(DeadObjectException deadObjectException) {
        return new m51(1, deadObjectException);
    }

    /* JADX INFO: renamed from: c */
    public abstract SCAN_CALLBACK_TYPE mo3262c(lob<SCAN_RESULT_TYPE> lobVar);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo3263d(hee heeVar, SCAN_CALLBACK_TYPE scan_callback_type);

    /* JADX INFO: renamed from: e */
    public abstract void mo3264e(hee heeVar, SCAN_CALLBACK_TYPE scan_callback_type);
}
