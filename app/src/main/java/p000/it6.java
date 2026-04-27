package p000;

import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class it6<ReqT> extends hic<ReqT> {

    /* JADX INFO: renamed from: it6$a */
    public static abstract class AbstractC7594a<ReqT> extends it6<ReqT> {

        /* JADX INFO: renamed from: a */
        public final w2f.AbstractC14368a<ReqT> f48205a;

        public AbstractC7594a(w2f.AbstractC14368a<ReqT> abstractC14368a) {
            this.f48205a = abstractC14368a;
        }

        @Override // p000.it6, p000.hic
        /* JADX INFO: renamed from: a */
        public w2f.AbstractC14368a<ReqT> mo12409a() {
            return this.f48205a;
        }

        @Override // p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public /* bridge */ /* synthetic */ void onCancel() {
            super.onCancel();
        }

        @Override // p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public /* bridge */ /* synthetic */ void onComplete() {
            super.onComplete();
        }

        @Override // p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public /* bridge */ /* synthetic */ void onHalfClose() {
            super.onHalfClose();
        }

        @Override // p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // p000.it6, p000.hic
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.hic
    /* JADX INFO: renamed from: a */
    public abstract w2f.AbstractC14368a<ReqT> mo12409a();

    @Override // p000.hic, p000.w2f.AbstractC14368a
    public /* bridge */ /* synthetic */ void onCancel() {
        super.onCancel();
    }

    @Override // p000.hic, p000.w2f.AbstractC14368a
    public /* bridge */ /* synthetic */ void onComplete() {
        super.onComplete();
    }

    @Override // p000.hic, p000.w2f.AbstractC14368a
    public /* bridge */ /* synthetic */ void onHalfClose() {
        super.onHalfClose();
    }

    @Override // p000.w2f.AbstractC14368a
    public void onMessage(ReqT reqt) {
        mo12409a().onMessage(reqt);
    }

    @Override // p000.hic, p000.w2f.AbstractC14368a
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // p000.hic
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
