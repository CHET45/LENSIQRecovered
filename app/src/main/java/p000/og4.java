package p000;

/* JADX INFO: loaded from: classes6.dex */
public class og4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: og4$a */
    public class C10366a<T> extends kg4<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ilf f67577b;

        public C10366a(ilf ilfVar) {
            this.f67577b = ilfVar;
        }

        @Override // p000.hnf
        public void onError(Throwable th) {
            this.f67577b.tryOnError(th);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f67577b.onSuccess(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: og4$b */
    public class C10367b<T> extends fg4<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lob f67578b;

        public C10367b(lob lobVar) {
            this.f67578b = lobVar;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f67578b.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable th) {
            this.f67578b.tryOnError(th);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f67578b.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: og4$c */
    public class C10368c<T> extends kg4<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lob f67579b;

        public C10368c(lob lobVar) {
            this.f67579b = lobVar;
        }

        @Override // p000.hnf
        public void onError(Throwable th) {
            this.f67579b.tryOnError(th);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f67579b.onNext(t);
            this.f67579b.onComplete();
        }
    }

    private og4() {
    }

    public static <T> fg4<T> disposableObserverFromEmitter(lob<T> lobVar) {
        return new C10367b(lobVar);
    }

    public static <T> kg4<T> disposableSingleObserverFromEmitter(ilf<T> ilfVar) {
        return new C10366a(ilfVar);
    }

    public static <T> kg4<T> disposableSingleObserverFromEmitter(lob<T> lobVar) {
        return new C10368c(lobVar);
    }
}
