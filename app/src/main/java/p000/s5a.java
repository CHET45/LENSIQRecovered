package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class s5a<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f80722b;

    /* JADX INFO: renamed from: s5a$a */
    public static final class C12451a<T, U> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final C12452b<T> f80723a;

        /* JADX INFO: renamed from: b */
        public final zjd<U> f80724b;

        /* JADX INFO: renamed from: c */
        public mf4 f80725c;

        public C12451a(l9a<? super T> l9aVar, zjd<U> zjdVar) {
            this.f80723a = new C12452b<>(l9aVar);
            this.f80724b = zjdVar;
        }

        /* JADX INFO: renamed from: a */
        public void m21744a() {
            this.f80724b.subscribe(this.f80723a);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f80725c.dispose();
            this.f80725c = ag4.DISPOSED;
            mdg.cancel(this.f80723a);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f80723a.get() == mdg.CANCELLED;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f80725c = ag4.DISPOSED;
            m21744a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f80725c = ag4.DISPOSED;
            this.f80723a.f80728c = th;
            m21744a();
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f80725c, mf4Var)) {
                this.f80725c = mf4Var;
                this.f80723a.f80726a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f80725c = ag4.DISPOSED;
            this.f80723a.f80727b = t;
            m21744a();
        }
    }

    /* JADX INFO: renamed from: s5a$b */
    public static final class C12452b<T> extends AtomicReference<fdg> implements lj6<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f80726a;

        /* JADX INFO: renamed from: b */
        public T f80727b;

        /* JADX INFO: renamed from: c */
        public Throwable f80728c;

        public C12452b(l9a<? super T> l9aVar) {
            this.f80726a = l9aVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            Throwable th = this.f80728c;
            if (th != null) {
                this.f80726a.onError(th);
                return;
            }
            T t = this.f80727b;
            if (t != null) {
                this.f80726a.onSuccess(t);
            } else {
                this.f80726a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            Throwable th2 = this.f80728c;
            if (th2 == null) {
                this.f80726a.onError(th);
            } else {
                this.f80726a.onError(new pm2(th2, th));
            }
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            fdg fdgVar = get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                lazySet(mdgVar);
                fdgVar.cancel();
                onComplete();
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public s5a(aaa<T> aaaVar, zjd<U> zjdVar) {
        super(aaaVar);
        this.f80722b = zjdVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C12451a(l9aVar, this.f80722b));
    }
}
