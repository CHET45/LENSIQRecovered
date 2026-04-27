package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class fpb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f37361a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Stream<? extends R>> f37362b;

    /* JADX INFO: renamed from: fpb$a */
    public static final class C5921a<T, R> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = -5127032662980523968L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f37363a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Stream<? extends R>> f37364b;

        /* JADX INFO: renamed from: c */
        public lf4 f37365c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f37366d;

        /* JADX INFO: renamed from: e */
        public boolean f37367e;

        public C5921a(pxb<? super R> downstream, sy6<? super T, ? extends Stream<? extends R>> mapper) {
            this.f37363a = downstream;
            this.f37364b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f37366d = true;
            this.f37365c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f37366d;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f37367e) {
                return;
            }
            this.f37367e = true;
            this.f37363a.onComplete();
        }

        @Override // p000.pxb
        public void onError(@cfb Throwable e) {
            if (this.f37367e) {
                ofe.onError(e);
            } else {
                this.f37367e = true;
                this.f37363a.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(@cfb T t) {
            if (this.f37367e) {
                return;
            }
            try {
                Stream<? extends R> streamApply = this.f37364b.apply(t);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream<? extends R> stream = streamApply;
                try {
                    Iterator<? extends R> it = stream.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (this.f37366d) {
                            this.f37367e = true;
                            break;
                        }
                        R next = it.next();
                        Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                        if (this.f37366d) {
                            this.f37367e = true;
                            break;
                        }
                        this.f37363a.onNext(next);
                        if (this.f37366d) {
                            this.f37367e = true;
                            break;
                        }
                    }
                    stream.close();
                } finally {
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f37365c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f37365c, d)) {
                this.f37365c = d;
                this.f37363a.onSubscribe(this);
            }
        }
    }

    public fpb(vkb<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper) {
        this.f37361a = source;
        this.f37362b = mapper;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> pxbVar) {
        Stream<? extends R> stream;
        vkb<T> vkbVar = this.f37361a;
        if (!(vkbVar instanceof nfg)) {
            vkbVar.subscribe(new C5921a(pxbVar, this.f37362b));
            return;
        }
        try {
            Object obj = ((nfg) vkbVar).get();
            if (obj != null) {
                Stream<? extends R> streamApply = this.f37362b.apply(obj);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                stream = streamApply;
            } else {
                stream = null;
            }
            if (stream != null) {
                wpb.subscribeStream(pxbVar, stream);
            } else {
                b05.complete(pxbVar);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, pxbVar);
        }
    }
}
