package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class oh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f67628a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends ph2> f67629b;

    /* JADX INFO: renamed from: oh2$a */
    public static final class C10376a extends AtomicReference<lf4> implements ch2, lf4 {
        private static final long serialVersionUID = 5018523762564524046L;

        /* JADX INFO: renamed from: a */
        public final ch2 f67630a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends ph2> f67631b;

        /* JADX INFO: renamed from: c */
        public boolean f67632c;

        public C10376a(ch2 observer, sy6<? super Throwable, ? extends ph2> errorMapper) {
            this.f67630a = observer;
            this.f67631b = errorMapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f67630a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (this.f67632c) {
                this.f67630a.onError(e);
                return;
            }
            this.f67632c = true;
            try {
                ph2 ph2VarApply = this.f67631b.apply(e);
                Objects.requireNonNull(ph2VarApply, "The errorMapper returned a null CompletableSource");
                ph2VarApply.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f67630a.onError(new qm2(e, th));
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }
    }

    public oh2(ph2 source, sy6<? super Throwable, ? extends ph2> errorMapper) {
        this.f67628a = source;
        this.f67629b = errorMapper;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        C10376a c10376a = new C10376a(observer, this.f67629b);
        observer.onSubscribe(c10376a);
        this.f67628a.subscribe(c10376a);
    }
}
