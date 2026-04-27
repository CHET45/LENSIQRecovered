package p000;

import androidx.lifecycle.AbstractC1158q;
import java.time.Duration;
import p000.a32;

/* JADX INFO: loaded from: classes3.dex */
public final class t13 {

    /* JADX INFO: renamed from: a */
    public static final long f83341a = 5000;

    /* JADX INFO: renamed from: t13$a */
    @ck3(m4009c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", m4010f = "CoroutineLiveData.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12845a extends ugg implements gz6<x13, zy2<? super py4>, Object> {

        /* JADX INFO: renamed from: a */
        public int f83342a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpa<T> f83343b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1158q<T> f83344c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: t13$a$a */
        public static final class a<T> extends tt8 implements qy6<T, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zpa<T> f83345a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zpa<T> zpaVar) {
                super(1);
                this.f83345a = zpaVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Object obj) {
                invoke2(obj);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                this.f83345a.setValue(t);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12845a(zpa<T> zpaVar, AbstractC1158q<T> abstractC1158q, zy2<? super C12845a> zy2Var) {
            super(2, zy2Var);
            this.f83343b = zpaVar;
            this.f83344c = abstractC1158q;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12845a(this.f83343b, this.f83344c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super py4> zy2Var) {
            return ((C12845a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
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
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f83342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            zpa<T> zpaVar = this.f83343b;
            zpaVar.addSource(this.f83344c, new C12846b(new a(zpaVar)));
            return new py4(this.f83344c, this.f83343b);
        }
    }

    /* JADX INFO: renamed from: t13$b */
    public static final class C12846b implements qxb, g07 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f83346a;

        public C12846b(qy6 qy6Var) {
            md8.checkNotNullParameter(qy6Var, "function");
            this.f83346a = qy6Var;
        }

        public final boolean equals(@gib Object obj) {
            if ((obj instanceof qxb) && (obj instanceof g07)) {
                return md8.areEqual(getFunctionDelegate(), ((g07) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p000.g07
        @yfb
        public final uy6<?> getFunctionDelegate() {
            return this.f83346a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.qxb
        public final /* synthetic */ void onChanged(Object obj) {
            this.f83346a.invoke(obj);
        }
    }

    @gib
    public static final <T> Object addDisposableSource(@yfb zpa<T> zpaVar, @yfb AbstractC1158q<T> abstractC1158q, @yfb zy2<? super py4> zy2Var) {
        return dg1.withContext(df4.getMain().getImmediate(), new C12845a(zpaVar, abstractC1158q, null), zy2Var);
    }

    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> liveData(@yfb e13 e13Var, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(gz6Var, "block");
        return liveData$default(e13Var, 0L, gz6Var, 2, (Object) null);
    }

    public static /* synthetic */ AbstractC1158q liveData$default(e13 e13Var, long j, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return liveData(e13Var, j, gz6Var);
    }

    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> liveData(@yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        return liveData$default((e13) null, 0L, gz6Var, 3, (Object) null);
    }

    @c5e(26)
    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> liveData(@yfb Duration duration, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(duration, a32.C0034g.f248b);
        md8.checkNotNullParameter(gz6Var, "block");
        return liveData$default(duration, (e13) null, gz6Var, 2, (Object) null);
    }

    public static /* synthetic */ AbstractC1158q liveData$default(Duration duration, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            e13Var = a05.f2a;
        }
        return liveData(duration, e13Var, gz6Var);
    }

    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> liveData(@yfb e13 e13Var, long j, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(gz6Var, "block");
        return new s13(e13Var, j, gz6Var);
    }

    @c5e(26)
    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> liveData(@yfb Duration duration, @yfb e13 e13Var, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(duration, a32.C0034g.f248b);
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(gz6Var, "block");
        return new s13(e13Var, n00.f62879a.toMillis(duration), gz6Var);
    }
}
