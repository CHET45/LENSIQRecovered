package p000;

import androidx.lifecycle.AbstractC1158q;
import p000.jvd;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "Transformations")
public final class feh {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: feh$a */
    public static final class C5755a<X> extends tt8 implements qy6<X, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zpa<X> f36322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8114a f36323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5755a(zpa<X> zpaVar, jvd.C8114a c8114a) {
            super(1);
            this.f36322a = zpaVar;
            this.f36323b = c8114a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            X value = this.f36322a.getValue();
            if (this.f36323b.f52103a || ((value == null && x != null) || !(value == null || md8.areEqual(value, x)))) {
                this.f36323b.f52103a = false;
                this.f36322a.setValue(x);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: feh$b */
    public static final class C5756b<X> extends tt8 implements qy6<X, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zpa<Y> f36324a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<X, Y> f36325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5756b(zpa<Y> zpaVar, qy6<X, Y> qy6Var) {
            super(1);
            this.f36324a = zpaVar;
            this.f36325b = qy6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            this.f36324a.setValue((Y) this.f36325b.invoke(x));
        }
    }

    /* JADX INFO: renamed from: feh$c */
    public static final class C5757c extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zpa<Object> f36326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f07<Object, Object> f36327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5757c(zpa<Object> zpaVar, f07<Object, Object> f07Var) {
            super(1);
            this.f36326a = zpaVar;
            this.f36327b = f07Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.f36326a.setValue(this.f36327b.apply(obj));
        }
    }

    /* JADX INFO: renamed from: feh$d */
    public static final class C5758d implements qxb, g07 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f36328a;

        public C5758d(qy6 qy6Var) {
            md8.checkNotNullParameter(qy6Var, "function");
            this.f36328a = qy6Var;
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
            return this.f36328a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.qxb
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36328a.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: feh$e */
    public static final class C5759e<X> extends tt8 implements qy6<X, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<X, AbstractC1158q<Y>> f36329a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<AbstractC1158q<Y>> f36330b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zpa<Y> f36331c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* JADX INFO: renamed from: feh$e$a */
        public static final class a<Y> extends tt8 implements qy6<Y, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zpa<Y> f36332a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zpa<Y> zpaVar) {
                super(1);
                this.f36332a = zpaVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Object obj) {
                invoke2(obj);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Y y) {
                this.f36332a.setValue(y);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5759e(qy6<X, AbstractC1158q<Y>> qy6Var, jvd.C8121h<AbstractC1158q<Y>> c8121h, zpa<Y> zpaVar) {
            super(1);
            this.f36329a = qy6Var;
            this.f36330b = c8121h;
            this.f36331c = zpaVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.q, java.lang.Object] */
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            ?? r4 = (AbstractC1158q) this.f36329a.invoke(x);
            T t = this.f36330b.f52110a;
            if (t != r4) {
                if (t != 0) {
                    zpa<Y> zpaVar = this.f36331c;
                    md8.checkNotNull(t);
                    zpaVar.removeSource((AbstractC1158q) t);
                }
                this.f36330b.f52110a = r4;
                if (r4 != 0) {
                    zpa<Y> zpaVar2 = this.f36331c;
                    md8.checkNotNull(r4);
                    zpaVar2.addSource(r4, new C5758d(new a(this.f36331c)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: feh$f */
    public static final class C5760f implements qxb<Object> {

        /* JADX INFO: renamed from: a */
        @gib
        public AbstractC1158q<Object> f36333a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f07<Object, AbstractC1158q<Object>> f36334b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zpa<Object> f36335c;

        /* JADX INFO: renamed from: feh$f$a */
        public static final class a extends tt8 implements qy6<Object, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zpa<Object> f36336a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zpa<Object> zpaVar) {
                super(1);
                this.f36336a = zpaVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Object obj) {
                invoke2(obj);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.f36336a.setValue(obj);
            }
        }

        public C5760f(f07<Object, AbstractC1158q<Object>> f07Var, zpa<Object> zpaVar) {
            this.f36334b = f07Var;
            this.f36335c = zpaVar;
        }

        @gib
        public final AbstractC1158q<Object> getLiveData() {
            return this.f36333a;
        }

        @Override // p000.qxb
        public void onChanged(Object obj) {
            AbstractC1158q<Object> abstractC1158qApply = this.f36334b.apply(obj);
            AbstractC1158q<Object> abstractC1158q = this.f36333a;
            if (abstractC1158q == abstractC1158qApply) {
                return;
            }
            if (abstractC1158q != null) {
                zpa<Object> zpaVar = this.f36335c;
                md8.checkNotNull(abstractC1158q);
                zpaVar.removeSource(abstractC1158q);
            }
            this.f36333a = abstractC1158qApply;
            if (abstractC1158qApply != null) {
                zpa<Object> zpaVar2 = this.f36335c;
                md8.checkNotNull(abstractC1158qApply);
                zpaVar2.addSource(abstractC1158qApply, new C5758d(new a(this.f36335c)));
            }
        }

        public final void setLiveData(@gib AbstractC1158q<Object> abstractC1158q) {
            this.f36333a = abstractC1158q;
        }
    }

    @xn8(name = "distinctUntilChanged")
    @yx1
    @yfb
    @ir9
    public static final <X> AbstractC1158q<X> distinctUntilChanged(@yfb AbstractC1158q<X> abstractC1158q) {
        zpa zpaVar;
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        jvd.C8114a c8114a = new jvd.C8114a();
        c8114a.f52103a = true;
        if (abstractC1158q.isInitialized()) {
            c8114a.f52103a = false;
            zpaVar = new zpa(abstractC1158q.getValue());
        } else {
            zpaVar = new zpa();
        }
        zpaVar.addSource(abstractC1158q, new C5758d(new C5755a(zpaVar, c8114a)));
        return zpaVar;
    }

    @xn8(name = "map")
    @yx1
    @yfb
    @ir9
    public static final <X, Y> AbstractC1158q<Y> map(@yfb AbstractC1158q<X> abstractC1158q, @yfb qy6<X, Y> qy6Var) {
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        zpa zpaVar = abstractC1158q.isInitialized() ? new zpa(qy6Var.invoke(abstractC1158q.getValue())) : new zpa();
        zpaVar.addSource(abstractC1158q, new C5758d(new C5756b(zpaVar, qy6Var)));
        return zpaVar;
    }

    @xn8(name = "switchMap")
    @yx1
    @yfb
    @ir9
    public static final <X, Y> AbstractC1158q<Y> switchMap(@yfb AbstractC1158q<X> abstractC1158q, @yfb qy6<X, AbstractC1158q<Y>> qy6Var) {
        AbstractC1158q<Y> abstractC1158qInvoke;
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        jvd.C8121h c8121h = new jvd.C8121h();
        zpa zpaVar = (abstractC1158q.isInitialized() && (abstractC1158qInvoke = qy6Var.invoke(abstractC1158q.getValue())) != null && abstractC1158qInvoke.isInitialized()) ? new zpa(abstractC1158qInvoke.getValue()) : new zpa();
        zpaVar.addSource(abstractC1158q, new C5758d(new C5759e(qy6Var, c8121h, zpaVar)));
        return zpaVar;
    }

    @xn8(name = "map")
    @yx1
    @q64(level = u64.f86867c, message = "Use kotlin functions, instead of outdated arch core Functions")
    @ir9
    public static final /* synthetic */ AbstractC1158q map(AbstractC1158q abstractC1158q, f07 f07Var) {
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        md8.checkNotNullParameter(f07Var, "mapFunction");
        zpa zpaVar = new zpa();
        zpaVar.addSource(abstractC1158q, new C5758d(new C5757c(zpaVar, f07Var)));
        return zpaVar;
    }

    @xn8(name = "switchMap")
    @yx1
    @q64(level = u64.f86867c, message = "Use kotlin functions, instead of outdated arch core Functions")
    @ir9
    public static final /* synthetic */ AbstractC1158q switchMap(AbstractC1158q abstractC1158q, f07 f07Var) {
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        md8.checkNotNullParameter(f07Var, "switchMapFunction");
        zpa zpaVar = new zpa();
        zpaVar.addSource(abstractC1158q, new C5760f(f07Var, zpaVar));
        return zpaVar;
    }
}
