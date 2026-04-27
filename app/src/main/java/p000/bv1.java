package p000;

import p000.v7e;
import p000.xu1;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n529#2,2:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,2\n*E\n"})
public final /* synthetic */ class bv1 {

    /* JADX INFO: renamed from: bv1$a */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", m4010f = "Channels.kt", m4011i = {}, m4012l = {58}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2063a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f14846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ nye<Object> f14847b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f14848c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2063a(nye<Object> nyeVar, Object obj, zy2<? super C2063a> zy2Var) {
            super(2, zy2Var);
            this.f14847b = nyeVar;
            this.f14848c = obj;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C2063a(this.f14847b, this.f14848c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C2063a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f14846a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                nye<Object> nyeVar = this.f14847b;
                Object obj2 = this.f14848c;
                this.f14846a = 1;
                if (nyeVar.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: bv1$b */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m4010f = "Channels.kt", m4011i = {}, m4012l = {39}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class C2064b extends ugg implements gz6<x13, zy2<? super xu1<? extends bth>>, Object> {

        /* JADX INFO: renamed from: a */
        public int f14849a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f14850b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nye<E> f14851c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ E f14852d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2064b(nye<? super E> nyeVar, E e, zy2<? super C2064b> zy2Var) {
            super(2, zy2Var);
            this.f14851c = nyeVar;
            this.f14852d = e;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C2064b c2064b = new C2064b(this.f14851c, this.f14852d, zy2Var);
            c2064b.f14850b = obj;
            return c2064b;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(x13 x13Var, zy2<? super xu1<bth>> zy2Var) {
            return ((C2064b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
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
        public final Object invokeSuspend(Object obj) {
            Object objM32723constructorimpl;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f14849a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    nye<E> nyeVar = this.f14851c;
                    E e = this.f14852d;
                    v7e.C13927a c13927a = v7e.f90266b;
                    this.f14849a = 1;
                    if (nyeVar.send(e, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                objM32723constructorimpl = v7e.m32723constructorimpl(bth.f14751a);
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            return xu1.m33272boximpl(v7e.m32730isSuccessimpl(objM32723constructorimpl) ? xu1.f99332b.m33287successJP2dKIU(bth.f14751a) : xu1.f99332b.m33285closedJP2dKIU(v7e.m32726exceptionOrNullimpl(objM32723constructorimpl)));
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, zy2<? super xu1<? extends bth>> zy2Var) {
            return invoke2(x13Var, (zy2<? super xu1<bth>>) zy2Var);
        }
    }

    @q64(level = u64.f86867c, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @i2e(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void sendBlocking(nye nyeVar, Object obj) throws InterruptedException {
        if (xu1.m33282isSuccessimpl(nyeVar.mo28705trySendJP2dKIU(obj))) {
            return;
        }
        eg1.runBlocking$default(null, new C2063a(nyeVar, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> Object trySendBlocking(@yfb nye<? super E> nyeVar, E e) {
        Object objMo28705trySendJP2dKIU = nyeVar.mo28705trySendJP2dKIU(e);
        if (objMo28705trySendJP2dKIU instanceof xu1.C15302c) {
            return ((xu1) eg1.runBlocking$default(null, new C2064b(nyeVar, e, null), 1, null)).m33284unboximpl();
        }
        return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
    }
}
