package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
@yjd
public final class xj3 {

    @gib
    @un8
    public volatile WeakReference<a23> _lastObservedFrame;

    @un8
    @yfb
    public volatile String _state = yj3.f101782a;

    /* JADX INFO: renamed from: a */
    @gib
    public final k0g f98172a;

    /* JADX INFO: renamed from: b */
    @un8
    public final long f98173b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final WeakReference<e13> f98174c;

    /* JADX INFO: renamed from: d */
    public int f98175d;

    @gib
    @un8
    public volatile Thread lastObservedThread;

    /* JADX INFO: renamed from: xj3$a */
    @ck3(m4009c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m4010f = "DebugCoroutineInfoImpl.kt", m4011i = {}, m4012l = {164}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15149a extends t7e implements gz6<xye<? super StackTraceElement>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f98176a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f98177b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ k0g f98179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15149a(k0g k0gVar, zy2<? super C15149a> zy2Var) {
            super(2, zy2Var);
            this.f98179d = k0gVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C15149a c15149a = xj3.this.new C15149a(this.f98179d, zy2Var);
            c15149a.f98177b = obj;
            return c15149a;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super StackTraceElement> xyeVar, zy2<? super bth> zy2Var) {
            return ((C15149a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f98176a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xye xyeVar = (xye) this.f98177b;
                xj3 xj3Var = xj3.this;
                a23 callerFrame = this.f98179d.getCallerFrame();
                this.f98176a = 1;
                if (xj3Var.yieldFrames(xyeVar, callerFrame, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: xj3$b */
    @ck3(m4009c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m4010f = "DebugCoroutineInfoImpl.kt", m4011i = {0, 0}, m4012l = {169}, m4013m = "yieldFrames", m4014n = {"$this$yieldFrames", ymh.InterfaceC15722a.f102093L}, m4015s = {"L$0", "L$1"})
    public static final class C15150b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f98180a;

        /* JADX INFO: renamed from: b */
        public Object f98181b;

        /* JADX INFO: renamed from: c */
        public Object f98182c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f98183d;

        /* JADX INFO: renamed from: f */
        public int f98185f;

        public C15150b(zy2<? super C15150b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f98183d = obj;
            this.f98185f |= Integer.MIN_VALUE;
            return xj3.this.yieldFrames(null, null, this);
        }
    }

    public xj3(@gib e13 e13Var, @gib k0g k0gVar, long j) {
        this.f98172a = k0gVar;
        this.f98173b = j;
        this.f98174c = new WeakReference<>(e13Var);
    }

    private final List<StackTraceElement> creationStackTrace() {
        k0g k0gVar = this.f98172a;
        return k0gVar == null ? l82.emptyList() : vze.toList(bze.sequence(new C15149a(k0gVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004b -> B:25:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:24:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yieldFrames(p000.xye<? super java.lang.StackTraceElement> r5, p000.a23 r6, p000.zy2<? super p000.bth> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000.xj3.C15150b
            if (r0 == 0) goto L13
            r0 = r7
            xj3$b r0 = (p000.xj3.C15150b) r0
            int r1 = r0.f98185f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98185f = r1
            goto L18
        L13:
            xj3$b r0 = new xj3$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f98183d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f98185f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f98182c
            xj3 r5 = (p000.xj3) r5
            java.lang.Object r6 = r0.f98181b
            a23 r6 = (p000.a23) r6
            java.lang.Object r2 = r0.f98180a
            xye r2 = (p000.xye) r2
            p000.y7e.throwOnFailure(r7)
            goto L5f
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            p000.y7e.throwOnFailure(r7)
            r7 = r6
            r6 = r4
        L42:
            if (r7 != 0) goto L47
            bth r5 = p000.bth.f14751a
            return r5
        L47:
            java.lang.StackTraceElement r2 = r7.getStackTraceElement()
            if (r2 == 0) goto L62
            r0.f98180a = r5
            r0.f98181b = r7
            r0.f98182c = r6
            r0.f98185f = r3
            java.lang.Object r2 = r5.yield(r2, r0)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r2 = r5
            r5 = r6
            r6 = r7
        L5f:
            r7 = r6
            r6 = r5
            r5 = r2
        L62:
            a23 r7 = r7.getCallerFrame()
            if (r7 == 0) goto L69
            goto L42
        L69:
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xj3.yieldFrames(xye, a23, zy2):java.lang.Object");
    }

    @gib
    public final e13 getContext() {
        return this.f98174c.get();
    }

    @gib
    public final k0g getCreationStackBottom$kotlinx_coroutines_core() {
        return this.f98172a;
    }

    @yfb
    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    @gib
    public final a23 getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<a23> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @yfb
    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    @yfb
    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        a23 lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(@gib a23 a23Var) {
        this._lastObservedFrame = a23Var != null ? new WeakReference<>(a23Var) : null;
    }

    @yfb
    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }

    public final synchronized void updateState$kotlinx_coroutines_core(@yfb String str, @yfb zy2<?> zy2Var, boolean z) {
        try {
            if (md8.areEqual(this._state, yj3.f101783b) && md8.areEqual(str, yj3.f101783b) && z) {
                this.f98175d++;
            } else if (this.f98175d > 0 && md8.areEqual(str, yj3.f101784c)) {
                this.f98175d--;
                return;
            }
            if (md8.areEqual(this._state, str) && md8.areEqual(str, yj3.f101784c) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
                return;
            }
            this._state = str;
            setLastObservedFrame$kotlinx_coroutines_core(zy2Var instanceof a23 ? (a23) zy2Var : null);
            this.lastObservedThread = md8.areEqual(str, yj3.f101783b) ? Thread.currentThread() : null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
