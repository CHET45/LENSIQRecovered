package p000;

import java.util.concurrent.atomic.AtomicInteger;
import p000.ki6;

/* JADX INFO: loaded from: classes7.dex */
public final class mi6<T> extends ljf<Boolean> implements v07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f61062a;

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f61063b;

    /* JADX INFO: renamed from: c */
    public final m11<? super T, ? super T> f61064c;

    /* JADX INFO: renamed from: d */
    public final int f61065d;

    /* JADX INFO: renamed from: mi6$a */
    public static final class C9358a<T> extends AtomicInteger implements mf4, ki6.InterfaceC8377b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f61066a;

        /* JADX INFO: renamed from: b */
        public final m11<? super T, ? super T> f61067b;

        /* JADX INFO: renamed from: c */
        public final ki6.C8378c<T> f61068c;

        /* JADX INFO: renamed from: d */
        public final ki6.C8378c<T> f61069d;

        /* JADX INFO: renamed from: e */
        public final cc0 f61070e = new cc0();

        /* JADX INFO: renamed from: f */
        public T f61071f;

        /* JADX INFO: renamed from: m */
        public T f61072m;

        public C9358a(inf<? super Boolean> infVar, int i, m11<? super T, ? super T> m11Var) {
            this.f61066a = infVar;
            this.f61067b = m11Var;
            this.f61068c = new ki6.C8378c<>(this, i);
            this.f61069d = new ki6.C8378c<>(this, i);
        }

        /* JADX INFO: renamed from: a */
        public void m17321a() {
            this.f61068c.cancel();
            this.f61068c.m14754a();
            this.f61069d.cancel();
            this.f61069d.m14754a();
        }

        /* JADX INFO: renamed from: b */
        public void m17322b(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
            zjdVar.subscribe(this.f61068c);
            zjdVar2.subscribe(this.f61069d);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f61068c.cancel();
            this.f61069d.cancel();
            if (getAndIncrement() == 0) {
                this.f61068c.m14754a();
                this.f61069d.m14754a();
            }
        }

        @Override // p000.ki6.InterfaceC8377b
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                ajf<T> ajfVar = this.f61068c.f54209e;
                ajf<T> ajfVar2 = this.f61069d.f54209e;
                if (ajfVar != null && ajfVar2 != null) {
                    while (!isDisposed()) {
                        if (this.f61070e.get() != null) {
                            m17321a();
                            this.f61066a.onError(this.f61070e.terminate());
                            return;
                        }
                        boolean z = this.f61068c.f54210f;
                        T tPoll = this.f61071f;
                        if (tPoll == null) {
                            try {
                                tPoll = ajfVar.poll();
                                this.f61071f = tPoll;
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                m17321a();
                                this.f61070e.addThrowable(th);
                                this.f61066a.onError(this.f61070e.terminate());
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.f61069d.f54210f;
                        T tPoll2 = this.f61072m;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = ajfVar2.poll();
                                this.f61072m = tPoll2;
                            } catch (Throwable th2) {
                                n75.throwIfFatal(th2);
                                m17321a();
                                this.f61070e.addThrowable(th2);
                                this.f61066a.onError(this.f61070e.terminate());
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            this.f61066a.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m17321a();
                            this.f61066a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f61067b.test(tPoll, tPoll2)) {
                                    m17321a();
                                    this.f61066a.onSuccess(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f61071f = null;
                                    this.f61072m = null;
                                    this.f61068c.request();
                                    this.f61069d.request();
                                }
                            } catch (Throwable th3) {
                                n75.throwIfFatal(th3);
                                m17321a();
                                this.f61070e.addThrowable(th3);
                                this.f61066a.onError(this.f61070e.terminate());
                                return;
                            }
                        }
                    }
                    this.f61068c.m14754a();
                    this.f61069d.m14754a();
                    return;
                }
                if (isDisposed()) {
                    this.f61068c.m14754a();
                    this.f61069d.m14754a();
                    return;
                } else if (this.f61070e.get() != null) {
                    m17321a();
                    this.f61066a.onError(this.f61070e.terminate());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.ki6.InterfaceC8377b
        public void innerError(Throwable th) {
            if (this.f61070e.addThrowable(th)) {
                drain();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f61068c.get() == mdg.CANCELLED;
        }
    }

    public mi6(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, m11<? super T, ? super T> m11Var, int i) {
        this.f61062a = zjdVar;
        this.f61063b = zjdVar2;
        this.f61064c = m11Var;
        this.f61065d = i;
    }

    @Override // p000.v07
    public m86<Boolean> fuseToFlowable() {
        return pfe.onAssembly(new ki6(this.f61062a, this.f61063b, this.f61064c, this.f61065d));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        C9358a c9358a = new C9358a(infVar, this.f61065d, this.f61064c);
        infVar.onSubscribe(c9358a);
        c9358a.m17322b(this.f61062a, this.f61063b);
    }
}
