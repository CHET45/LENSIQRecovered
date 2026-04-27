package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n9#2:364\n9#2:365\n9#2:369\n9#2:372\n9#2:378\n9#2:379\n9#2:385\n9#2:388\n9#2:389\n9#2:390\n774#3:366\n865#3,2:367\n1863#3,2:370\n1755#3,3:373\n1863#3,2:376\n1863#3,2:380\n774#3:382\n865#3,2:383\n1863#3,2:386\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n115#1:364\n137#1:365\n162#1:369\n186#1:372\n228#1:378\n280#1:379\n292#1:385\n304#1:388\n331#1:389\n343#1:390\n138#1:366\n138#1:367,2\n175#1:370,2\n191#1:373,3\n200#1:376,2\n282#1:380,2\n287#1:382\n287#1:383,2\n295#1:386,2\n*E\n"})
public final class vd1<E> extends kf1<E> implements ud1<E> {

    /* JADX INFO: renamed from: N */
    public final int f90708N;

    /* JADX INFO: renamed from: Q */
    @yfb
    public final ReentrantLock f90709Q;

    /* JADX INFO: renamed from: X */
    @yfb
    public List<? extends kf1<E>> f90710X;

    /* JADX INFO: renamed from: Y */
    @gib
    public Object f90711Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public final HashMap<pve<?>, Object> f90712Z;

    /* JADX INFO: renamed from: vd1$a */
    @dwf({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,363:1\n9#2:364\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n311#1:364\n*E\n"})
    public final class C14004a extends kf1<E> {
        public C14004a() {
            super(vd1.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // p000.kf1
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(@gib Throwable th) {
            ReentrantLock reentrantLock = vd1.this.f90709Q;
            vd1<E> vd1Var = vd1.this;
            reentrantLock.lock();
            try {
                vd1Var.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: vd1$b */
    public final class C14005b extends vq2<E> {
        public C14005b() {
            super(1, gf1.f39658b, null, 4, null);
        }

        @Override // p000.kf1
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(@gib Throwable th) {
            vd1.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(th);
        }
    }

    /* JADX INFO: renamed from: vd1$c */
    @ck3(m4009c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", m4010f = "BroadcastChannel.kt", m4011i = {}, m4012l = {240}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n9#2:364\n1#3:365\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n253#1:364\n*E\n"})
    public static final class C14006c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f90715a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vd1<E> f90716b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f90717c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ pve<?> f90718d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14006c(vd1<E> vd1Var, Object obj, pve<?> pveVar, zy2<? super C14006c> zy2Var) {
            super(2, zy2Var);
            this.f90716b = vd1Var;
            this.f90717c = obj;
            this.f90718d = pveVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C14006c(this.f90716b, this.f90717c, this.f90718d, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C14006c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to vd1$c for r5v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f90715a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> Lf
                goto L3e
            Lf:
                r6 = move-exception
                goto L29
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                p000.y7e.throwOnFailure(r6)
                vd1<E> r6 = r5.f90716b     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r1 = r5.f90717c     // Catch: java.lang.Throwable -> Lf
                r5.f90715a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r6 = r6.send(r1, r5)     // Catch: java.lang.Throwable -> Lf
                if (r6 != r0) goto L3e
                return r0
            L29:
                vd1<E> r0 = r5.f90716b
                boolean r0 = r0.isClosedForSend()
                if (r0 == 0) goto L81
                boolean r0 = r6 instanceof p000.c62
                if (r0 != 0) goto L3d
                vd1<E> r0 = r5.f90716b
                java.lang.Throwable r0 = r0.m14699g()
                if (r0 != r6) goto L81
            L3d:
                r2 = 0
            L3e:
                vd1<E> r6 = r5.f90716b
                java.util.concurrent.locks.ReentrantLock r6 = p000.vd1.access$getLock$p(r6)
                vd1<E> r0 = r5.f90716b
                pve<?> r1 = r5.f90718d
                r6.lock()
                java.util.HashMap r3 = p000.vd1.access$getOnSendInternalResult$p(r0)     // Catch: java.lang.Throwable -> L54
                if (r2 == 0) goto L56
                bth r2 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L54
                goto L5a
            L54:
                r0 = move-exception
                goto L7d
            L56:
                qhg r2 = p000.lf1.getCHANNEL_CLOSED()     // Catch: java.lang.Throwable -> L54
            L5a:
                r3.put(r1, r2)     // Catch: java.lang.Throwable -> L54
                java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
                p000.md8.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L54
                r2 = r1
                ove r2 = (p000.ove) r2     // Catch: java.lang.Throwable -> L54
                r2 = r1
                ove r2 = (p000.ove) r2     // Catch: java.lang.Throwable -> L54
                bth r3 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L54
                sjh r2 = r2.trySelectDetailed(r0, r3)     // Catch: java.lang.Throwable -> L54
                sjh r4 = p000.sjh.f82050b     // Catch: java.lang.Throwable -> L54
                if (r2 == r4) goto L79
                java.util.HashMap r0 = p000.vd1.access$getOnSendInternalResult$p(r0)     // Catch: java.lang.Throwable -> L54
                r0.remove(r1)     // Catch: java.lang.Throwable -> L54
            L79:
                r6.unlock()
                return r3
            L7d:
                r6.unlock()
                throw r0
            L81:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vd1.C14006c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vd1$d */
    @ck3(m4009c = "kotlinx.coroutines.channels.BroadcastChannelImpl", m4010f = "BroadcastChannel.kt", m4011i = {0, 0}, m4012l = {179}, m4013m = "send", m4014n = {"this", "element"}, m4015s = {"L$0", "L$1"})
    public static final class C14007d extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f90719a;

        /* JADX INFO: renamed from: b */
        public Object f90720b;

        /* JADX INFO: renamed from: c */
        public Object f90721c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f90722d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vd1<E> f90723e;

        /* JADX INFO: renamed from: f */
        public int f90724f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14007d(vd1<E> vd1Var, zy2<? super C14007d> zy2Var) {
            super(zy2Var);
            this.f90723e = vd1Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f90722d = obj;
            this.f90724f |= Integer.MIN_VALUE;
            return this.f90723e.send(null, this);
        }
    }

    public vd1(int i) {
        super(0, null);
        this.f90708N = i;
        if (i >= 1 || i == -1) {
            this.f90709Q = new ReentrantLock();
            this.f90710X = l82.emptyList();
            this.f90711Y = wd1.f93969a;
            this.f90712Z = new HashMap<>();
            return;
        }
        throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeSubscriber(hsd<? extends E> hsdVar) {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            List<? extends kf1<E>> list = this.f90710X;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((kf1) obj) != hsdVar) {
                    arrayList.add(obj);
                }
            }
            this.f90710X = arrayList;
            bth bthVar = bth.f14751a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.kf1
    public boolean cancelImpl$kotlinx_coroutines_core(@gib Throwable th) {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f90710X.iterator();
            while (it.hasNext()) {
                ((kf1) it.next()).cancelImpl$kotlinx_coroutines_core(th);
            }
            this.f90711Y = wd1.f93969a;
            boolean zCancelImpl$kotlinx_coroutines_core = super.cancelImpl$kotlinx_coroutines_core(th);
            reentrantLock.unlock();
            return zCancelImpl$kotlinx_coroutines_core;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kf1, p000.nye
    public boolean close(@gib Throwable th) {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f90710X.iterator();
            while (it.hasNext()) {
                ((kf1) it.next()).close(th);
            }
            List<? extends kf1<E>> list = this.f90710X;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((kf1) obj).hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(obj);
                }
            }
            this.f90710X = arrayList;
            boolean zClose = super.close(th);
            reentrantLock.unlock();
            return zClose;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int getCapacity() {
        return this.f90708N;
    }

    public final E getValue() {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                Throwable thM14698f = m14698f();
                if (thM14698f == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw thM14698f;
            }
            if (this.f90711Y == wd1.f93969a) {
                throw new IllegalStateException("No value");
            }
            E e = (E) this.f90711Y;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @gib
    public final E getValueOrNull() {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            E e = null;
            if (!isClosedForReceive() && this.f90711Y != wd1.f93969a) {
                e = (E) this.f90711Y;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.kf1, p000.nye
    public boolean isClosedForSend() {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.ud1
    @yfb
    public hsd<E> openSubscription() {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            C14004a c14005b = this.f90708N == -1 ? new C14005b() : new C14004a();
            if (isClosedForSend() && this.f90711Y == wd1.f93969a) {
                ((kf1) c14005b).close(m14698f());
                reentrantLock.unlock();
                return c14005b;
            }
            if (this.f90711Y != wd1.f93969a) {
                ((kf1) c14005b).mo28705trySendJP2dKIU(getValue());
            }
            this.f90710X = v82.plus((Collection<? extends hsd<E>>) this.f90710X, c14005b);
            reentrantLock.unlock();
            return c14005b;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: p */
    public void mo14704p(@yfb pve<?> pveVar, @gib Object obj) {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            Object objRemove = this.f90712Z.remove(pveVar);
            if (objRemove != null) {
                pveVar.selectInRegistrationPhase(objRemove);
                return;
            }
            bth bthVar = bth.f14751a;
            reentrantLock.unlock();
            fg1.launch$default(y13.CoroutineScope(pveVar.getContext()), null, b23.f12444d, new C14006c(this, obj, pveVar, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:30:0x0080). Please report as a decompilation issue!!! */
    @Override // p000.kf1, p000.nye
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object send(E r7, @p000.yfb p000.zy2<? super p000.bth> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.vd1.C14007d
            if (r0 == 0) goto L13
            r0 = r8
            vd1$d r0 = (p000.vd1.C14007d) r0
            int r1 = r0.f90724f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90724f = r1
            goto L18
        L13:
            vd1$d r0 = new vd1$d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f90722d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f90724f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f90721c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f90720b
            java.lang.Object r4 = r0.f90719a
            vd1 r4 = (p000.vd1) r4
            p000.y7e.throwOnFailure(r8)
            goto L80
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            p000.y7e.throwOnFailure(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f90709Q
            r8.lock()
            boolean r2 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto L99
            int r2 = r6.f90708N     // Catch: java.lang.Throwable -> L51
            r4 = -1
            if (r2 != r4) goto L53
            r6.f90711Y = r7     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r7 = move-exception
            goto L9e
        L53:
            java.util.List<? extends kf1<E>> r2 = r6.f90710X     // Catch: java.lang.Throwable -> L51
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            kf1 r2 = (p000.kf1) r2
            r0.f90719a = r4
            r0.f90720b = r8
            r0.f90721c = r7
            r0.f90724f = r3
            java.lang.Object r2 = r2.sendBroadcast$kotlinx_coroutines_core(r8, r0)
            if (r2 != r1) goto L7d
            return r1
        L7d:
            r5 = r2
            r2 = r8
            r8 = r5
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L94
            boolean r8 = r4.isClosedForSend()
            if (r8 != 0) goto L8f
            goto L94
        L8f:
            java.lang.Throwable r7 = r4.m14699g()
            throw r7
        L94:
            r8 = r2
            goto L62
        L96:
            bth r7 = p000.bth.f14751a
            return r7
        L99:
            java.lang.Throwable r7 = r6.m14699g()     // Catch: java.lang.Throwable -> L51
            throw r7     // Catch: java.lang.Throwable -> L51
        L9e:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vd1.send(java.lang.Object, zy2):java.lang.Object");
    }

    @Override // p000.kf1
    @yfb
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f90711Y != wd1.f93969a) {
            str = "CONFLATED_ELEMENT=" + this.f90711Y + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(v82.joinToString$default(this.f90710X, ";", "<", ">", 0, null, null, 56, null));
        return sb.toString();
    }

    @Override // p000.kf1, p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28705trySendJP2dKIU(E e) {
        ReentrantLock reentrantLock = this.f90709Q;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                return super.mo28705trySendJP2dKIU(e);
            }
            List<? extends kf1<E>> list = this.f90710X;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kf1) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        return xu1.f99332b.m33286failurePtdJZtk();
                    }
                }
            }
            if (this.f90708N == -1) {
                this.f90711Y = e;
            }
            Iterator<T> it2 = this.f90710X.iterator();
            while (it2.hasNext()) {
                ((kf1) it2.next()).mo28705trySendJP2dKIU(e);
            }
            return xu1.f99332b.m33287successJP2dKIU(bth.f14751a);
        } finally {
            reentrantLock.unlock();
        }
    }
}
