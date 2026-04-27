package p000;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public final class krb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f55164a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, Optional<? extends R>> f55165b;

    /* JADX INFO: renamed from: krb$a */
    public static final class C8507a<T, R> extends lv0<T, R> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, Optional<? extends R>> f55166f;

        public C8507a(pxb<? super R> downstream, sy6<? super T, Optional<? extends R>> mapper) {
            super(downstream);
            this.f55166f = mapper;
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f58861d) {
                return;
            }
            if (this.f58862e != 0) {
                this.f58858a.onNext(null);
                return;
            }
            try {
                Optional<? extends R> optionalApply = this.f55166f.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    this.f58858a.onNext(optional.get());
                }
            } catch (Throwable th) {
                m16392c(th);
            }
        }

        @Override // p000.zif
        public R poll() throws Throwable {
            Optional<? extends R> optional;
            do {
                T tPoll = this.f58860c.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f55166f.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                optional = optionalApply;
            } while (!optional.isPresent());
            return optional.get();
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public krb(vkb<T> source, sy6<? super T, Optional<? extends R>> mapper) {
        this.f55164a = source;
        this.f55165b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f55164a.subscribe(new C8507a(observer, this.f55165b));
    }
}
