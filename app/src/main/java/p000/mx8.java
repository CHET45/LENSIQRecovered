package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n143#1,12:434\n179#1,12:446\n215#1,12:458\n251#1,12:470\n148#2:482\n148#2:483\n148#2:484\n148#2:485\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n161#1:434,12\n197#1:446,12\n233#1:458,12\n269#1:470,12\n303#1:482\n359#1:483\n387#1:484\n413#1:485\n*E\n"})
public final class mx8 {

    /* JADX INFO: renamed from: mx8$a */
    public static final class C9582a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f62629C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ qy6<h19, bth> f62630F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f62631H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f62632L;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f62633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f62634b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f62635c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f62636d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0625c.m f62637e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.b f62638f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f62639m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9582a(InterfaceC0701e interfaceC0701e, m19 m19Var, vac vacVar, boolean z, C0625c.m mVar, InterfaceC9407mm.b bVar, s36 s36Var, boolean z2, qy6<? super h19, bth> qy6Var, int i, int i2) {
            super(2);
            this.f62633a = interfaceC0701e;
            this.f62634b = m19Var;
            this.f62635c = vacVar;
            this.f62636d = z;
            this.f62637e = mVar;
            this.f62638f = bVar;
            this.f62639m = s36Var;
            this.f62629C = z2;
            this.f62630F = qy6Var;
            this.f62631H = i;
            this.f62632L = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            mx8.LazyColumn(this.f62633a, this.f62634b, this.f62635c, this.f62636d, this.f62637e, this.f62638f, this.f62639m, this.f62629C, this.f62630F, zl2Var, tsd.updateChangedFlags(this.f62631H | 1), this.f62632L);
        }
    }

    /* JADX INFO: renamed from: mx8$b */
    public static final class C9583b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<h19, bth> f62640C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f62641F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f62642H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f62643a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f62644b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f62645c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f62646d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0625c.m f62647e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.b f62648f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f62649m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9583b(InterfaceC0701e interfaceC0701e, m19 m19Var, vac vacVar, boolean z, C0625c.m mVar, InterfaceC9407mm.b bVar, s36 s36Var, qy6<? super h19, bth> qy6Var, int i, int i2) {
            super(2);
            this.f62643a = interfaceC0701e;
            this.f62644b = m19Var;
            this.f62645c = vacVar;
            this.f62646d = z;
            this.f62647e = mVar;
            this.f62648f = bVar;
            this.f62649m = s36Var;
            this.f62640C = qy6Var;
            this.f62641F = i;
            this.f62642H = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            mx8.LazyColumn(this.f62643a, this.f62644b, this.f62645c, this.f62646d, this.f62647e, this.f62648f, this.f62649m, this.f62640C, zl2Var, tsd.updateChangedFlags(this.f62641F | 1), this.f62642H);
        }
    }

    /* JADX INFO: renamed from: mx8$c */
    public static final class C9584c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f62650C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ qy6<h19, bth> f62651F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f62652H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f62653L;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f62654a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f62655b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f62656c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f62657d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0625c.e f62658e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.c f62659f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f62660m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9584c(InterfaceC0701e interfaceC0701e, m19 m19Var, vac vacVar, boolean z, C0625c.e eVar, InterfaceC9407mm.c cVar, s36 s36Var, boolean z2, qy6<? super h19, bth> qy6Var, int i, int i2) {
            super(2);
            this.f62654a = interfaceC0701e;
            this.f62655b = m19Var;
            this.f62656c = vacVar;
            this.f62657d = z;
            this.f62658e = eVar;
            this.f62659f = cVar;
            this.f62660m = s36Var;
            this.f62650C = z2;
            this.f62651F = qy6Var;
            this.f62652H = i;
            this.f62653L = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            mx8.LazyRow(this.f62654a, this.f62655b, this.f62656c, this.f62657d, this.f62658e, this.f62659f, this.f62660m, this.f62650C, this.f62651F, zl2Var, tsd.updateChangedFlags(this.f62652H | 1), this.f62653L);
        }
    }

    /* JADX INFO: renamed from: mx8$d */
    public static final class C9585d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<h19, bth> f62661C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f62662F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f62663H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f62664a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f62665b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f62666c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f62667d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0625c.e f62668e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.c f62669f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f62670m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9585d(InterfaceC0701e interfaceC0701e, m19 m19Var, vac vacVar, boolean z, C0625c.e eVar, InterfaceC9407mm.c cVar, s36 s36Var, qy6<? super h19, bth> qy6Var, int i, int i2) {
            super(2);
            this.f62664a = interfaceC0701e;
            this.f62665b = m19Var;
            this.f62666c = vacVar;
            this.f62667d = z;
            this.f62668e = eVar;
            this.f62669f = cVar;
            this.f62670m = s36Var;
            this.f62661C = qy6Var;
            this.f62662F = i;
            this.f62663H = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            mx8.LazyRow(this.f62664a, this.f62665b, this.f62666c, this.f62667d, this.f62668e, this.f62669f, this.f62670m, this.f62661C, zl2Var, tsd.updateChangedFlags(this.f62662F | 1), this.f62663H);
        }
    }

    /* JADX INFO: renamed from: mx8$e */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,433:1\n*E\n"})
    public static final class C9586e extends tt8 implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C9586e f62671a = new C9586e();

        public C9586e() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$f */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,433:1\n*E\n"})
    public static final class C9587f extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Object> f62672a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9587f(qy6<? super T, ? extends Object> qy6Var, List<? extends T> list) {
            super(1);
            this.f62672a = qy6Var;
            this.f62673b = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @yfb
        public final Object invoke(int i) {
            return this.f62672a.invoke((T) this.f62673b.get(i));
        }
    }

    /* JADX INFO: renamed from: mx8$g */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,433:1\n*E\n"})
    public static final class C9588g extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Object> f62674a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9588g(qy6<? super T, ? extends Object> qy6Var, List<? extends T> list) {
            super(1);
            this.f62674a = qy6Var;
            this.f62675b = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @gib
        public final Object invoke(int i) {
            return this.f62674a.invoke((T) this.f62675b.get(i));
        }
    }

    /* JADX INFO: renamed from: mx8$h */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n*L\n1#1,433:1\n*E\n"})
    public static final class C9589h extends tt8 implements oz6<fz8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oz6<fz8, T, zl2, Integer, bth> f62676a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9589h(oz6<? super fz8, ? super T, ? super zl2, ? super Integer, bth> oz6Var, List<? extends T> list) {
            super(4);
            this.f62676a = oz6Var;
            this.f62677b = list;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(fz8 fz8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(fz8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @hk2
        public final void invoke(@yfb fz8 fz8Var, int i, @gib zl2 zl2Var, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (zl2Var.changed(fz8Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= zl2Var.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            this.f62676a.invoke(fz8Var, (T) this.f62677b.get(i), zl2Var, Integer.valueOf(i3 & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: mx8$i */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,433:1\n*E\n"})
    public static final class C9590i extends tt8 implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C9590i f62678a = new C9590i();

        public C9590i() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$j */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$6\n*L\n1#1,433:1\n*E\n"})
    public static final class C9591j extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Object> f62679a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9591j(qy6<? super T, ? extends Object> qy6Var, T[] tArr) {
            super(1);
            this.f62679a = qy6Var;
            this.f62680b = tArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @yfb
        public final Object invoke(int i) {
            return this.f62679a.invoke(this.f62680b[i]);
        }
    }

    /* JADX INFO: renamed from: mx8$k */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,433:1\n*E\n"})
    public static final class C9592k extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, Object> f62681a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9592k(qy6<? super T, ? extends Object> qy6Var, T[] tArr) {
            super(1);
            this.f62681a = qy6Var;
            this.f62682b = tArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @gib
        public final Object invoke(int i) {
            return this.f62681a.invoke(this.f62682b[i]);
        }
    }

    /* JADX INFO: renamed from: mx8$l */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$8\n*L\n1#1,433:1\n*E\n"})
    public static final class C9593l extends tt8 implements oz6<fz8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oz6<fz8, T, zl2, Integer, bth> f62683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9593l(oz6<? super fz8, ? super T, ? super zl2, ? super Integer, bth> oz6Var, T[] tArr) {
            super(4);
            this.f62683a = oz6Var;
            this.f62684b = tArr;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(fz8 fz8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(fz8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
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
        @hk2
        public final void invoke(@yfb fz8 fz8Var, int i, @gib zl2 zl2Var, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (zl2Var.changed(fz8Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= zl2Var.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1043393750, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:224)");
            }
            this.f62683a.invoke(fz8Var, this.f62684b[i], zl2Var, Integer.valueOf(i3 & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: mx8$m */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,433:1\n182#2:434\n*E\n"})
    public static final class C9594m extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f62685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9594m(List list) {
            super(1);
            this.f62685a = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @gib
        public final Object invoke(int i) {
            this.f62685a.get(i);
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$n */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,433:1\n254#2:434\n*E\n"})
    public static final class C9595n extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f62686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9595n(Object[] objArr) {
            super(1);
            this.f62686a = objArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @gib
        public final Object invoke(int i) {
            Object obj = this.f62686a[i];
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$o */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,433:1\n*E\n"})
    public static final class C9596o extends tt8 implements gz6 {

        /* JADX INFO: renamed from: a */
        public static final C9596o f62687a = new C9596o();

        public C9596o() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }

        @gib
        public final Void invoke(int i, Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$p */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,433:1\n*E\n"})
    public static final class C9597p extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<Integer, T, Object> f62688a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9597p(gz6<? super Integer, ? super T, ? extends Object> gz6Var, List<? extends T> list) {
            super(1);
            this.f62688a = gz6Var;
            this.f62689b = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @yfb
        public final Object invoke(int i) {
            return this.f62688a.invoke(Integer.valueOf(i), (T) this.f62689b.get(i));
        }
    }

    /* JADX INFO: renamed from: mx8$q */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,433:1\n*E\n"})
    public static final class C9598q extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<Integer, T, Object> f62690a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9598q(gz6<? super Integer, ? super T, ? extends Object> gz6Var, List<? extends T> list) {
            super(1);
            this.f62690a = gz6Var;
            this.f62691b = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @gib
        public final Object invoke(int i) {
            return this.f62690a.invoke(Integer.valueOf(i), (T) this.f62691b.get(i));
        }
    }

    /* JADX INFO: renamed from: mx8$r */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n*L\n1#1,433:1\n*E\n"})
    public static final class C9599r extends tt8 implements oz6<fz8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rz6<fz8, Integer, T, zl2, Integer, bth> f62692a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<T> f62693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9599r(rz6<? super fz8, ? super Integer, ? super T, ? super zl2, ? super Integer, bth> rz6Var, List<? extends T> list) {
            super(4);
            this.f62692a = rz6Var;
            this.f62693b = list;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(fz8 fz8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(fz8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @hk2
        public final void invoke(@yfb fz8 fz8Var, int i, @gib zl2 zl2Var, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (zl2Var.changed(fz8Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= zl2Var.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            this.f62692a.invoke(fz8Var, Integer.valueOf(i), (T) this.f62693b.get(i), zl2Var, Integer.valueOf(i3 & 126));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: mx8$s */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,433:1\n*E\n"})
    public static final class C9600s extends tt8 implements gz6 {

        /* JADX INFO: renamed from: a */
        public static final C9600s f62694a = new C9600s();

        public C9600s() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }

        @gib
        public final Void invoke(int i, Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mx8$t */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$6\n*L\n1#1,433:1\n*E\n"})
    public static final class C9601t extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<Integer, T, Object> f62695a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9601t(gz6<? super Integer, ? super T, ? extends Object> gz6Var, T[] tArr) {
            super(1);
            this.f62695a = gz6Var;
            this.f62696b = tArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @yfb
        public final Object invoke(int i) {
            return this.f62695a.invoke(Integer.valueOf(i), this.f62696b[i]);
        }
    }

    /* JADX INFO: renamed from: mx8$u */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n*L\n1#1,433:1\n*E\n"})
    public static final class C9602u extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<Integer, T, Object> f62697a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9602u(gz6<? super Integer, ? super T, ? extends Object> gz6Var, T[] tArr) {
            super(1);
            this.f62697a = gz6Var;
            this.f62698b = tArr;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @gib
        public final Object invoke(int i) {
            return this.f62697a.invoke(Integer.valueOf(i), this.f62698b[i]);
        }
    }

    /* JADX INFO: renamed from: mx8$v */
    @dwf({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$8\n*L\n1#1,433:1\n*E\n"})
    public static final class C9603v extends tt8 implements oz6<fz8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rz6<fz8, Integer, T, zl2, Integer, bth> f62699a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f62700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9603v(rz6<? super fz8, ? super Integer, ? super T, ? super zl2, ? super Integer, bth> rz6Var, T[] tArr) {
            super(4);
            this.f62699a = rz6Var;
            this.f62700b = tArr;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(fz8 fz8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(fz8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
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
        @hk2
        public final void invoke(@yfb fz8 fz8Var, int i, @gib zl2 zl2Var, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (zl2Var.changed(fz8Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= zl2Var.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1600639390, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:260)");
            }
            this.f62699a.invoke(fz8Var, Integer.valueOf(i), this.f62700b[i], zl2Var, Integer.valueOf(i3 & 126));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyColumn(@p000.gib androidx.compose.p002ui.InterfaceC0701e r29, @p000.gib p000.m19 r30, @p000.gib p000.vac r31, boolean r32, @p000.gib androidx.compose.foundation.layout.C0625c.m r33, @p000.gib p000.InterfaceC9407mm.b r34, @p000.gib p000.s36 r35, boolean r36, @p000.yfb p000.qy6<? super p000.h19, p000.bth> r37, @p000.gib p000.zl2 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mx8.LazyColumn(androidx.compose.ui.e, m19, vac, boolean, androidx.compose.foundation.layout.c$m, mm$b, s36, boolean, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyRow(@p000.gib androidx.compose.p002ui.InterfaceC0701e r29, @p000.gib p000.m19 r30, @p000.gib p000.vac r31, boolean r32, @p000.gib androidx.compose.foundation.layout.C0625c.e r33, @p000.gib p000.InterfaceC9407mm.c r34, @p000.gib p000.s36 r35, boolean r36, @p000.yfb p000.qy6<? super p000.h19, p000.bth> r37, @p000.gib p000.zl2 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mx8.LazyRow(androidx.compose.ui.e, m19, vac, boolean, androidx.compose.foundation.layout.c$e, mm$c, s36, boolean, qy6, zl2, int, int):void");
    }

    @ik2(scheme = "[0[0]]")
    public static final <T> void items(@yfb h19 h19Var, @yfb List<? extends T> list, @gib qy6<? super T, ? extends Object> qy6Var, @yfb qy6<? super T, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super T, ? super zl2, ? super Integer, bth> oz6Var) {
        h19Var.items(list.size(), qy6Var != null ? new C9587f(qy6Var, list) : null, new C9588g(qy6Var2, list), mk2.composableLambdaInstance(-632812321, true, new C9589h(oz6Var, list)));
    }

    public static /* synthetic */ void items$default(h19 h19Var, List list, qy6 qy6Var, qy6 qy6Var2, oz6 oz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        if ((i & 4) != 0) {
            qy6Var2 = C9586e.f62671a;
        }
        h19Var.items(list.size(), qy6Var != null ? new C9587f(qy6Var, list) : null, new C9588g(qy6Var2, list), mk2.composableLambdaInstance(-632812321, true, new C9589h(oz6Var, list)));
    }

    @ik2(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@yfb h19 h19Var, @yfb List<? extends T> list, @gib gz6<? super Integer, ? super T, ? extends Object> gz6Var, @yfb gz6<? super Integer, ? super T, ? extends Object> gz6Var2, @yfb rz6<? super fz8, ? super Integer, ? super T, ? super zl2, ? super Integer, bth> rz6Var) {
        h19Var.items(list.size(), gz6Var != null ? new C9597p(gz6Var, list) : null, new C9598q(gz6Var2, list), mk2.composableLambdaInstance(-1091073711, true, new C9599r(rz6Var, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(h19 h19Var, List list, gz6 gz6Var, gz6 gz6Var2, rz6 rz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            gz6Var = null;
        }
        if ((i & 4) != 0) {
            gz6Var2 = C9596o.f62687a;
        }
        h19Var.items(list.size(), gz6Var != null ? new C9597p(gz6Var, list) : null, new C9598q(gz6Var2, list), mk2.composableLambdaInstance(-1091073711, true, new C9599r(rz6Var, list)));
    }

    @ik2(scheme = "[0[0]]")
    public static final <T> void items(@yfb h19 h19Var, @yfb T[] tArr, @gib qy6<? super T, ? extends Object> qy6Var, @yfb qy6<? super T, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super T, ? super zl2, ? super Integer, bth> oz6Var) {
        h19Var.items(tArr.length, qy6Var != null ? new C9591j(qy6Var, tArr) : null, new C9592k(qy6Var2, tArr), mk2.composableLambdaInstance(-1043393750, true, new C9593l(oz6Var, tArr)));
    }

    @ik2(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@yfb h19 h19Var, @yfb T[] tArr, @gib gz6<? super Integer, ? super T, ? extends Object> gz6Var, @yfb gz6<? super Integer, ? super T, ? extends Object> gz6Var2, @yfb rz6<? super fz8, ? super Integer, ? super T, ? super zl2, ? super Integer, bth> rz6Var) {
        h19Var.items(tArr.length, gz6Var != null ? new C9601t(gz6Var, tArr) : null, new C9602u(gz6Var2, tArr), mk2.composableLambdaInstance(1600639390, true, new C9603v(rz6Var, tArr)));
    }

    public static /* synthetic */ void items$default(h19 h19Var, Object[] objArr, qy6 qy6Var, qy6 qy6Var2, oz6 oz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        if ((i & 4) != 0) {
            qy6Var2 = C9590i.f62678a;
        }
        h19Var.items(objArr.length, qy6Var != null ? new C9591j(qy6Var, objArr) : null, new C9592k(qy6Var2, objArr), mk2.composableLambdaInstance(-1043393750, true, new C9593l(oz6Var, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(h19 h19Var, Object[] objArr, gz6 gz6Var, gz6 gz6Var2, rz6 rz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            gz6Var = null;
        }
        if ((i & 4) != 0) {
            gz6Var2 = C9600s.f62694a;
        }
        h19Var.items(objArr.length, gz6Var != null ? new C9601t(gz6Var, objArr) : null, new C9602u(gz6Var2, objArr), mk2.composableLambdaInstance(1600639390, true, new C9603v(rz6Var, objArr)));
    }

    public static /* synthetic */ void items$default(h19 h19Var, List list, qy6 qy6Var, oz6 oz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        h19Var.items(list.size(), qy6Var != null ? new C9587f(qy6Var, list) : null, new C9588g(C9586e.f62671a, list), mk2.composableLambdaInstance(-632812321, true, new C9589h(oz6Var, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(h19 h19Var, List list, gz6 gz6Var, rz6 rz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            gz6Var = null;
        }
        h19Var.items(list.size(), gz6Var != null ? new C9597p(gz6Var, list) : null, new C9594m(list), mk2.composableLambdaInstance(-1091073711, true, new C9599r(rz6Var, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(h19 h19Var, Object[] objArr, gz6 gz6Var, rz6 rz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            gz6Var = null;
        }
        h19Var.items(objArr.length, gz6Var != null ? new C9601t(gz6Var, objArr) : null, new C9595n(objArr), mk2.composableLambdaInstance(1600639390, true, new C9603v(rz6Var, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p002ui.InterfaceC0701e r23, p000.m19 r24, p000.vac r25, boolean r26, androidx.compose.foundation.layout.C0625c.m r27, p000.InterfaceC9407mm.b r28, p000.s36 r29, p000.qy6 r30, p000.zl2 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mx8.LazyColumn(androidx.compose.ui.e, m19, vac, boolean, androidx.compose.foundation.layout.c$m, mm$b, s36, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    @p000.q64(level = p000.u64.f86867c, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.p002ui.InterfaceC0701e r23, p000.m19 r24, p000.vac r25, boolean r26, androidx.compose.foundation.layout.C0625c.e r27, p000.InterfaceC9407mm.c r28, p000.s36 r29, p000.qy6 r30, p000.zl2 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mx8.LazyRow(androidx.compose.ui.e, m19, vac, boolean, androidx.compose.foundation.layout.c$e, mm$c, s36, qy6, zl2, int, int):void");
    }

    public static /* synthetic */ void items$default(h19 h19Var, Object[] objArr, qy6 qy6Var, oz6 oz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        h19Var.items(objArr.length, qy6Var != null ? new C9591j(qy6Var, objArr) : null, new C9592k(C9590i.f62678a, objArr), mk2.composableLambdaInstance(-1043393750, true, new C9593l(oz6Var, objArr)));
    }
}
