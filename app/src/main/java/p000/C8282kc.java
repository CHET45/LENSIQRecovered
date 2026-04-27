package p000;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: renamed from: kc */
/* JADX INFO: loaded from: classes.dex */
public final class C8282kc<I, O> extends AbstractC11416qc<bth> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC11416qc<I> f53560a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final AbstractC8767lc<I, O> f53561b;

    /* JADX INFO: renamed from: c */
    public final I f53562c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final fx8 f53563d = hz8.lazy(new a(this));

    /* JADX INFO: renamed from: kc$a */
    public static final class a extends tt8 implements ny6<C16457a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8282kc<I, O> f53564a;

        /* JADX INFO: renamed from: kc$a$a, reason: collision with other inner class name */
        public static final class C16457a extends AbstractC8767lc<bth, O> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C8282kc<I, O> f53565a;

            public C16457a(C8282kc<I, O> c8282kc) {
                this.f53565a = c8282kc;
            }

            @Override // p000.AbstractC8767lc
            public O parseResult(int i, @gib Intent intent) {
                return this.f53565a.getCallerContract().parseResult(i, intent);
            }

            @Override // p000.AbstractC8767lc
            @yfb
            public Intent createIntent(@yfb Context context, @yfb bth bthVar) {
                return this.f53565a.getCallerContract().createIntent(context, this.f53565a.getCallerInput());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8282kc<I, O> c8282kc) {
            super(0);
            this.f53564a = c8282kc;
        }

        @Override // p000.ny6
        @yfb
        public final C16457a invoke() {
            return new C16457a(this.f53564a);
        }
    }

    public C8282kc(@yfb AbstractC11416qc<I> abstractC11416qc, @yfb AbstractC8767lc<I, O> abstractC8767lc, I i) {
        this.f53560a = abstractC11416qc;
        this.f53561b = abstractC8767lc;
        this.f53562c = i;
    }

    @yfb
    public final AbstractC8767lc<I, O> getCallerContract() {
        return this.f53561b;
    }

    public final I getCallerInput() {
        return this.f53562c;
    }

    @Override // p000.AbstractC11416qc
    @yfb
    public AbstractC8767lc<bth, ?> getContract() {
        return getResultContract();
    }

    @yfb
    public final AbstractC11416qc<I> getLauncher() {
        return this.f53560a;
    }

    @yfb
    public final AbstractC8767lc<bth, O> getResultContract() {
        return (AbstractC8767lc) this.f53563d.getValue();
    }

    @Override // p000.AbstractC11416qc
    public void unregister() {
        this.f53560a.unregister();
    }

    @Override // p000.AbstractC11416qc
    public void launch(@yfb bth bthVar, @gib ActivityOptionsCompat activityOptionsCompat) {
        this.f53560a.launch(this.f53562c, activityOptionsCompat);
    }
}
