package p000;

import androidx.lifecycle.AbstractC1158q;

/* JADX INFO: loaded from: classes3.dex */
public final class py4 implements yf4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC1158q<?> f72486a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zpa<?> f72487b;

    /* JADX INFO: renamed from: c */
    public boolean f72488c;

    /* JADX INFO: renamed from: py4$a */
    @ck3(m4009c = "androidx.lifecycle.EmittedSource$dispose$1", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11181a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f72489a;

        public C11181a(zy2<? super C11181a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return py4.this.new C11181a(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11181a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f72489a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            py4.this.removeSource();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: py4$b */
    @ck3(m4009c = "androidx.lifecycle.EmittedSource$disposeNow$2", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11182b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f72491a;

        public C11182b(zy2<? super C11182b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return py4.this.new C11182b(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11182b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f72491a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            py4.this.removeSource();
            return bth.f14751a;
        }
    }

    public py4(@yfb AbstractC1158q<?> abstractC1158q, @yfb zpa<?> zpaVar) {
        md8.checkNotNullParameter(abstractC1158q, "source");
        md8.checkNotNullParameter(zpaVar, "mediator");
        this.f72486a = abstractC1158q;
        this.f72487b = zpaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ir9
    public final void removeSource() {
        if (this.f72488c) {
            return;
        }
        this.f72487b.removeSource(this.f72486a);
        this.f72488c = true;
    }

    @Override // p000.yf4
    public void dispose() {
        fg1.launch$default(y13.CoroutineScope(df4.getMain().getImmediate()), null, null, new C11181a(null), 3, null);
    }

    @gib
    public final Object disposeNow(@yfb zy2<? super bth> zy2Var) {
        Object objWithContext = dg1.withContext(df4.getMain().getImmediate(), new C11182b(null), zy2Var);
        return objWithContext == pd8.getCOROUTINE_SUSPENDED() ? objWithContext : bth.f14751a;
    }
}
