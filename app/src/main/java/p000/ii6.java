package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ii6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f47079c;

    /* JADX INFO: renamed from: d */
    public final Callable<R> f47080d;

    /* JADX INFO: renamed from: ii6$a */
    public static final class C7299a<T, R> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -1776795561228106469L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f47081C;

        /* JADX INFO: renamed from: F */
        public Throwable f47082F;

        /* JADX INFO: renamed from: H */
        public fdg f47083H;

        /* JADX INFO: renamed from: L */
        public R f47084L;

        /* JADX INFO: renamed from: M */
        public int f47085M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f47086a;

        /* JADX INFO: renamed from: b */
        public final j11<R, ? super T, R> f47087b;

        /* JADX INFO: renamed from: c */
        public final uif<R> f47088c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f47089d;

        /* JADX INFO: renamed from: e */
        public final int f47090e;

        /* JADX INFO: renamed from: f */
        public final int f47091f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f47092m;

        public C7299a(ycg<? super R> ycgVar, j11<R, ? super T, R> j11Var, R r, int i) {
            this.f47086a = ycgVar;
            this.f47087b = j11Var;
            this.f47084L = r;
            this.f47090e = i;
            this.f47091f = i - (i >> 2);
            pzf pzfVar = new pzf(i);
            this.f47088c = pzfVar;
            pzfVar.offer(r);
            this.f47089d = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public void m13117a() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f47086a;
            uif<R> uifVar = this.f47088c;
            int i = this.f47091f;
            int i2 = this.f47085M;
            int iAddAndGet = 1;
            do {
                long j = this.f47089d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f47092m) {
                        uifVar.clear();
                        return;
                    }
                    boolean z = this.f47081C;
                    if (z && (th = this.f47082F) != null) {
                        uifVar.clear();
                        ycgVar.onError(th);
                        return;
                    }
                    R rPoll = uifVar.poll();
                    boolean z2 = rPoll == null;
                    if (z && z2) {
                        ycgVar.onComplete();
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(rPoll);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.f47083H.request(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.f47081C) {
                    Throwable th2 = this.f47082F;
                    if (th2 != null) {
                        uifVar.clear();
                        ycgVar.onError(th2);
                        return;
                    } else if (uifVar.isEmpty()) {
                        ycgVar.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    so0.produced(this.f47089d, j2);
                }
                this.f47085M = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f47092m = true;
            this.f47083H.cancel();
            if (getAndIncrement() == 0) {
                this.f47088c.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f47081C) {
                return;
            }
            this.f47081C = true;
            m13117a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f47081C) {
                pfe.onError(th);
                return;
            }
            this.f47082F = th;
            this.f47081C = true;
            m13117a();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f47081C) {
                return;
            }
            try {
                R r = (R) xjb.requireNonNull(this.f47087b.apply(this.f47084L, t), "The accumulator returned a null value");
                this.f47084L = r;
                this.f47088c.offer(r);
                m13117a();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f47083H.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f47083H, fdgVar)) {
                this.f47083H = fdgVar;
                this.f47086a.onSubscribe(this);
                fdgVar.request(this.f47090e - 1);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f47089d, j);
                m13117a();
            }
        }
    }

    public ii6(m86<T> m86Var, Callable<R> callable, j11<R, ? super T, R> j11Var) {
        super(m86Var);
        this.f47079c = j11Var;
        this.f47080d = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        try {
            this.f52360b.subscribe((lj6) new C7299a(ycgVar, this.f47079c, xjb.requireNonNull(this.f47080d.call(), "The seed supplied is null"), m86.bufferSize()));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
