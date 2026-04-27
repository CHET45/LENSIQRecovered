package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1223#3,6:276\n1223#3,6:282\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:275\n84#1:276,6\n94#1:282,6\n*E\n"})
public final class gyd {

    /* JADX INFO: renamed from: a */
    public static final int f41830a = 36;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: gyd$a */
    public static final class C6658a<T> extends tt8 implements gz6<fme, z6b<T>, z6b<Object>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dme<T, Object> f41831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6658a(dme<T, Object> dmeVar) {
            super(2);
            this.f41831a = dmeVar;
        }

        @Override // p000.gz6
        @gib
        public final z6b<Object> invoke(@yfb fme fmeVar, @yfb z6b<T> z6bVar) {
            if (!(z6bVar instanceof ptf)) {
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            }
            Object objSave = this.f41831a.save(fmeVar, z6bVar.getValue());
            if (objSave == null) {
                return null;
            }
            qtf<T> policy = ((ptf) z6bVar).getPolicy();
            md8.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return stf.mutableStateOf(objSave, policy);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: gyd$b */
    public static final class C6659b<T> extends tt8 implements qy6<z6b<Object>, z6b<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dme<T, Object> f41832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6659b(dme<T, Object> dmeVar) {
            super(1);
            this.f41832a = dmeVar;
        }

        @Override // p000.qy6
        @gib
        public final z6b<T> invoke(@yfb z6b<Object> z6bVar) {
            T tRestore;
            if (!(z6bVar instanceof ptf)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (z6bVar.getValue() != null) {
                dme<T, Object> dmeVar = this.f41832a;
                Object value = z6bVar.getValue();
                md8.checkNotNull(value);
                tRestore = dmeVar.restore(value);
            } else {
                tRestore = null;
            }
            qtf<T> policy = ((ptf) z6bVar).getPolicy();
            md8.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
            z6b<T> z6bVarMutableStateOf = stf.mutableStateOf(tRestore, policy);
            md8.checkNotNull(z6bVarMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
            return z6bVarMutableStateOf;
        }
    }

    /* JADX INFO: renamed from: gyd$c */
    public static final class C6660c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ole<T> f41833a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dme<T, ? extends Object> f41834b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ sle f41835c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f41836d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ T f41837e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object[] f41838f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6660c(ole<T> oleVar, dme<T, ? extends Object> dmeVar, sle sleVar, String str, T t, Object[] objArr) {
            super(0);
            this.f41833a = oleVar;
            this.f41834b = dmeVar;
            this.f41835c = sleVar;
            this.f41836d = str;
            this.f41837e = t;
            this.f41838f = objArr;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f41833a.update(this.f41834b, this.f41835c, this.f41836d, this.f41837e, this.f41838f);
        }
    }

    @yfb
    public static final String generateCannotBeSavedErrorMessage(@yfb Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> dme<z6b<T>, z6b<Object>> mutableStateSaver(dme<T, ? extends Object> dmeVar) {
        md8.checkNotNull(dmeVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return eme.Saver(new C6658a(dmeVar), new C6659b(dmeVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:zl2), (r14v9 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:24)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @p000.yfb
    @p000.hk2
    public static final <T> T rememberSaveable(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:zl2), (r14v9 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:24)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(sle sleVar, Object obj) {
        String strGenerateCannotBeSavedErrorMessage;
        if (obj == null || sleVar.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof ptf) {
            ptf ptfVar = (ptf) obj;
            if (ptfVar.getPolicy() == stf.neverEqualPolicy() || ptfVar.getPolicy() == stf.structuralEqualityPolicy() || ptfVar.getPolicy() == stf.referentialEqualityPolicy()) {
                strGenerateCannotBeSavedErrorMessage = "MutableState containing " + ptfVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strGenerateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strGenerateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(strGenerateCannotBeSavedErrorMessage);
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> z6b<T> m29877rememberSaveable(@yfb Object[] objArr, @yfb dme<T, ? extends Object> dmeVar, @gib String str, @yfb ny6<? extends z6b<T>> ny6Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        z6b<T> z6bVar = (z6b) rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(dmeVar), str2, (ny6) ny6Var, zl2Var, i & 8064, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }
}
