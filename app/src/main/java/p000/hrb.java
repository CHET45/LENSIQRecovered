package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class hrb<T, U> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends U> f44640b;

    /* JADX INFO: renamed from: hrb$a */
    public static final class C6983a<T, U> extends lv0<T, U> {

        /* JADX INFO: renamed from: f */
        public final sy6<? super T, ? extends U> f44641f;

        public C6983a(pxb<? super U> actual, sy6<? super T, ? extends U> mapper) {
            super(actual);
            this.f44641f = mapper;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
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
                U uApply = this.f44641f.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f58858a.onNext((Object) uApply);
            } catch (Throwable th) {
                m16392c(th);
            }
        }

        @Override // p000.zif
        @dib
        public U poll() throws Throwable {
            T tPoll = this.f58860c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f44641f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public hrb(wub<T> source, sy6<? super T, ? extends U> function) {
        super(source);
        this.f44640b = function;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        this.f63101a.subscribe(new C6983a(t, this.f44640b));
    }
}
