package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n36#2:192\n36#2:193\n36#2:194\n36#2:195\n36#2:196\n36#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
@e0g(parameters = 0)
public final class C15816yv extends m13 {

    /* JADX INFO: renamed from: N */
    @yfb
    public static final c f103016N = new c(null);

    /* JADX INFO: renamed from: Q */
    public static final int f103017Q = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public static final fx8<e13> f103018X = hz8.lazy(a.f103030a);

    /* JADX INFO: renamed from: Y */
    @yfb
    public static final ThreadLocal<e13> f103019Y = new b();

    /* JADX INFO: renamed from: C */
    @yfb
    public List<Choreographer.FrameCallback> f103020C;

    /* JADX INFO: renamed from: F */
    public boolean f103021F;

    /* JADX INFO: renamed from: H */
    public boolean f103022H;

    /* JADX INFO: renamed from: L */
    @yfb
    public final d f103023L;

    /* JADX INFO: renamed from: M */
    @yfb
    public final rya f103024M;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Choreographer f103025c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Handler f103026d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f103027e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final e60<Runnable> f103028f;

    /* JADX INFO: renamed from: m */
    @yfb
    public List<Choreographer.FrameCallback> f103029m;

    /* JADX INFO: renamed from: yv$a */
    public static final class a extends tt8 implements ny6<e13> {

        /* JADX INFO: renamed from: a */
        public static final a f103030a = new a();

        /* JADX INFO: renamed from: yv$a$a, reason: collision with other inner class name */
        @ck3(m4009c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", m4010f = "AndroidUiDispatcher.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class C16563a extends ugg implements gz6<x13, zy2<? super Choreographer>, Object> {

            /* JADX INFO: renamed from: a */
            public int f103031a;

            public C16563a(zy2<? super C16563a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new C16563a(zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Choreographer> zy2Var) {
                return ((C16563a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f103031a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return Choreographer.getInstance();
            }
        }

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final e13 invoke() {
            C15816yv c15816yv = new C15816yv(C16260zv.isMainThread() ? Choreographer.getInstance() : (Choreographer) dg1.runBlocking(df4.getMain(), new C16563a(null)), de7.createAsync(Looper.getMainLooper()), null);
            return c15816yv.plus(c15816yv.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: yv$b */
    @dwf({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class b extends ThreadLocal<e13> {
        @Override // java.lang.ThreadLocal
        @yfb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e13 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            C15816yv c15816yv = new C15816yv(choreographer, de7.createAsync(looperMyLooper), null);
            return c15816yv.plus(c15816yv.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: yv$c */
    public static final class c {
        public /* synthetic */ c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final e13 getCurrentThread() {
            if (C16260zv.isMainThread()) {
                return getMain();
            }
            e13 e13Var = (e13) C15816yv.f103019Y.get();
            if (e13Var != null) {
                return e13Var;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        @yfb
        public final e13 getMain() {
            return (e13) C15816yv.f103018X.getValue();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: yv$d */
    @dwf({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n36#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C15816yv.this.f103026d.removeCallbacks(this);
            C15816yv.this.performTrampolineDispatch();
            C15816yv.this.performFrameDispatch(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            C15816yv.this.performTrampolineDispatch();
            Object obj = C15816yv.this.f103027e;
            C15816yv c15816yv = C15816yv.this;
            synchronized (obj) {
                try {
                    if (c15816yv.f103029m.isEmpty()) {
                        c15816yv.getChoreographer().removeFrameCallback(this);
                        c15816yv.f103022H = false;
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ C15816yv(Choreographer choreographer, Handler handler, jt3 jt3Var) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable runnableRemoveFirstOrNull;
        synchronized (this.f103027e) {
            runnableRemoveFirstOrNull = this.f103028f.removeFirstOrNull();
        }
        return runnableRemoveFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j) {
        synchronized (this.f103027e) {
            if (this.f103022H) {
                this.f103022H = false;
                List<Choreographer.FrameCallback> list = this.f103029m;
                this.f103029m = this.f103020C;
                this.f103020C = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(j);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.f103027e) {
                if (this.f103028f.isEmpty()) {
                    z = false;
                    this.f103021F = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        synchronized (this.f103027e) {
            try {
                this.f103028f.addLast(runnable);
                if (!this.f103021F) {
                    this.f103021F = true;
                    this.f103026d.post(this.f103023L);
                    if (!this.f103022H) {
                        this.f103022H = true;
                        this.f103025c.postFrameCallback(this.f103023L);
                    }
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @yfb
    public final Choreographer getChoreographer() {
        return this.f103025c;
    }

    @yfb
    public final rya getFrameClock() {
        return this.f103024M;
    }

    public final void postFrameCallback$ui_release(@yfb Choreographer.FrameCallback frameCallback) {
        synchronized (this.f103027e) {
            try {
                this.f103029m.add(frameCallback);
                if (!this.f103022H) {
                    this.f103022H = true;
                    this.f103025c.postFrameCallback(this.f103023L);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeFrameCallback$ui_release(@yfb Choreographer.FrameCallback frameCallback) {
        synchronized (this.f103027e) {
            this.f103029m.remove(frameCallback);
        }
    }

    private C15816yv(Choreographer choreographer, Handler handler) {
        this.f103025c = choreographer;
        this.f103026d = handler;
        this.f103027e = new Object();
        this.f103028f = new e60<>();
        this.f103029m = new ArrayList();
        this.f103020C = new ArrayList();
        this.f103023L = new d();
        this.f103024M = new C1621aw(choreographer, this);
    }
}
