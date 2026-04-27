package p000;

import p000.xu1;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n562#2,2:91\n529#2,2:93\n529#2,2:95\n562#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
public class vq2<E> extends kf1<E> {

    /* JADX INFO: renamed from: N */
    public final int f91965N;

    /* JADX INFO: renamed from: Q */
    @yfb
    public final gf1 f91966Q;

    public /* synthetic */ vq2(int i, gf1 gf1Var, qy6 qy6Var, int i2, jt3 jt3Var) {
        this(i, gf1Var, (i2 & 4) != 0 ? null : qy6Var);
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m32789trySendDropLatestMj0NB7M(E e, boolean z) {
        qy6<E, bth> qy6Var;
        vrh vrhVarCallUndeliveredElementCatchingException$default;
        Object objMo28705trySendJP2dKIU = super.mo28705trySendJP2dKIU(e);
        if (xu1.m33282isSuccessimpl(objMo28705trySendJP2dKIU) || xu1.m33280isClosedimpl(objMo28705trySendJP2dKIU)) {
            return objMo28705trySendJP2dKIU;
        }
        if (!z || (qy6Var = this.f53834b) == null || (vrhVarCallUndeliveredElementCatchingException$default = z4c.callUndeliveredElementCatchingException$default(qy6Var, e, null, 2, null)) == null) {
            return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
        }
        throw vrhVarCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m32790trySendImplMj0NB7M(E e, boolean z) {
        return this.f91966Q == gf1.f39659c ? m32789trySendDropLatestMj0NB7M(e, z) : m14705t(e);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ <E> Object m24116u(vq2<E> vq2Var, E e, zy2<? super bth> zy2Var) throws Throwable {
        vrh vrhVarCallUndeliveredElementCatchingException$default;
        Object objM32790trySendImplMj0NB7M = vq2Var.m32790trySendImplMj0NB7M(e, true);
        if (!(objM32790trySendImplMj0NB7M instanceof xu1.C15300a)) {
            return bth.f14751a;
        }
        xu1.m33276exceptionOrNullimpl(objM32790trySendImplMj0NB7M);
        qy6<E, bth> qy6Var = vq2Var.f53834b;
        if (qy6Var == null || (vrhVarCallUndeliveredElementCatchingException$default = z4c.callUndeliveredElementCatchingException$default(qy6Var, e, null, 2, null)) == null) {
            throw vq2Var.m14699g();
        }
        a85.addSuppressed(vrhVarCallUndeliveredElementCatchingException$default, vq2Var.m14699g());
        throw vrhVarCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ <E> Object m24117v(vq2<E> vq2Var, E e, zy2<? super Boolean> zy2Var) {
        Object objM32790trySendImplMj0NB7M = vq2Var.m32790trySendImplMj0NB7M(e, true);
        if (objM32790trySendImplMj0NB7M instanceof xu1.C15302c) {
            return wc1.boxBoolean(false);
        }
        return wc1.boxBoolean(true);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: i */
    public boolean mo14700i() {
        return this.f91966Q == gf1.f39658b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kf1
    /* JADX INFO: renamed from: p */
    public void mo14704p(@yfb pve<?> pveVar, @gib Object obj) {
        Object objMo28705trySendJP2dKIU = mo28705trySendJP2dKIU(obj);
        if (!(objMo28705trySendJP2dKIU instanceof xu1.C15302c)) {
            pveVar.selectInRegistrationPhase(bth.f14751a);
        } else {
            if (!(objMo28705trySendJP2dKIU instanceof xu1.C15300a)) {
                throw new IllegalStateException("unreachable");
            }
            xu1.m33276exceptionOrNullimpl(objMo28705trySendJP2dKIU);
            pveVar.selectInRegistrationPhase(lf1.getCHANNEL_CLOSED());
        }
    }

    @Override // p000.kf1, p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        return m24116u(this, e, zy2Var);
    }

    @Override // p000.kf1
    @gib
    public Object sendBroadcast$kotlinx_coroutines_core(E e, @yfb zy2<? super Boolean> zy2Var) {
        return m24117v(this, e, zy2Var);
    }

    @Override // p000.kf1
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // p000.kf1, p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28705trySendJP2dKIU(E e) {
        return m32790trySendImplMj0NB7M(e, false);
    }

    public vq2(int i, @yfb gf1 gf1Var, @gib qy6<? super E, bth> qy6Var) {
        super(i, qy6Var);
        this.f91965N = i;
        this.f91966Q = gf1Var;
        if (gf1Var == gf1.f39657a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + vvd.getOrCreateKotlinClass(kf1.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }
}
