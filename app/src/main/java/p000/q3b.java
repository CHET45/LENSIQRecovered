package p000;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.q3b;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n*L\n50#1:146,2\n*E\n"})
public final class q3b extends FileObserver {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11287a f73125c = new C11287a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final Object f73126d = new Object();

    /* JADX INFO: renamed from: e */
    @yfb
    public static final Map<String, q3b> f73127e = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f73128a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final CopyOnWriteArrayList<qy6<String, bth>> f73129b;

    /* JADX INFO: renamed from: q3b$a */
    @dwf({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n372#2,7:146\n1855#3,2:153\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n*L\n103#1:146,7\n137#1:153,2\n*E\n"})
    public static final class C11287a {

        /* JADX INFO: renamed from: q3b$a$a */
        @ck3(m4009c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m4010f = "MulticastFileObserver.android.kt", m4011i = {0, 0}, m4012l = {84, 85}, m4013m = "invokeSuspend", m4014n = {"$this$channelFlow", "disposeListener"}, m4015s = {"L$0", "L$1"})
        public static final class a extends ugg implements gz6<vdd<? super bth>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f73130a;

            /* JADX INFO: renamed from: b */
            public int f73131b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f73132c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ File f73133d;

            /* JADX INFO: renamed from: q3b$a$a$a, reason: collision with other inner class name */
            public static final class C16502a extends tt8 implements ny6<bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ yf4 f73134a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16502a(yf4 yf4Var) {
                    super(0);
                    this.f73134a = yf4Var;
                }

                @Override // p000.ny6
                public /* bridge */ /* synthetic */ bth invoke() {
                    invoke2();
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f73134a.dispose();
                }
            }

            /* JADX INFO: renamed from: q3b$a$a$b */
            public static final class b extends tt8 implements qy6<String, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ File f73135a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vdd<bth> f73136b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(File file, vdd<? super bth> vddVar) {
                    super(1);
                    this.f73135a = file;
                    this.f73136b = vddVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(String str) {
                    invoke2(str);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@gib String str) {
                    if (md8.areEqual(str, this.f73135a.getName())) {
                        av1.trySendBlocking(this.f73136b, bth.f14751a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(File file, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f73133d = file;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f73133d, zy2Var);
                aVar.f73132c = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb vdd<? super bth> vddVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                yf4 yf4VarObserve;
                vdd vddVar;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f73131b;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    vdd vddVar2 = (vdd) this.f73132c;
                    b bVar = new b(this.f73133d, vddVar2);
                    C11287a c11287a = q3b.f73125c;
                    File parentFile = this.f73133d.getParentFile();
                    md8.checkNotNull(parentFile);
                    yf4VarObserve = c11287a.observe(parentFile, bVar);
                    bth bthVar = bth.f14751a;
                    this.f73132c = vddVar2;
                    this.f73130a = yf4VarObserve;
                    this.f73131b = 1;
                    if (vddVar2.send(bthVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vddVar = vddVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        return bth.f14751a;
                    }
                    yf4VarObserve = (yf4) this.f73130a;
                    vddVar = (vdd) this.f73132c;
                    y7e.throwOnFailure(obj);
                }
                C16502a c16502a = new C16502a(yf4VarObserve);
                this.f73132c = null;
                this.f73130a = null;
                this.f73131b = 2;
                if (rdd.awaitClose(vddVar, c16502a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return bth.f14751a;
            }
        }

        public /* synthetic */ C11287a(jt3 jt3Var) {
            this();
        }

        @fdi
        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, qy6 qy6Var) {
            md8.checkNotNullParameter(qy6Var, "$observer");
            synchronized (q3b.f73126d) {
                try {
                    C11287a c11287a = q3b.f73125c;
                    q3b q3bVar = c11287a.getFileObservers$datastore_core_release().get(str);
                    if (q3bVar != null) {
                        q3bVar.f73129b.remove(qy6Var);
                        if (q3bVar.f73129b.isEmpty()) {
                            c11287a.getFileObservers$datastore_core_release().remove(str);
                            q3bVar.stopWatching();
                        }
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @yfb
        public final Map<String, q3b> getFileObservers$datastore_core_release() {
            return q3b.f73127e;
        }

        @yfb
        @yx1
        public final y56<bth> observe(@yfb File file) {
            md8.checkNotNullParameter(file, "file");
            return c76.channelFlow(new a(file, null));
        }

        @fdi
        public final void removeAllObservers$datastore_core_release() {
            synchronized (q3b.f73126d) {
                try {
                    Iterator<T> it = q3b.f73125c.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((q3b) it.next()).stopWatching();
                    }
                    q3b.f73125c.getFileObservers$datastore_core_release().clear();
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private C11287a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @yx1
        public final yf4 observe(File file, final qy6<? super String, bth> qy6Var) {
            final String path = file.getCanonicalFile().getPath();
            synchronized (q3b.f73126d) {
                try {
                    Map<String, q3b> fileObservers$datastore_core_release = q3b.f73125c.getFileObservers$datastore_core_release();
                    md8.checkNotNullExpressionValue(path, "key");
                    q3b q3bVar = fileObservers$datastore_core_release.get(path);
                    if (q3bVar == null) {
                        q3bVar = new q3b(path, null);
                        fileObservers$datastore_core_release.put(path, q3bVar);
                    }
                    q3b q3bVar2 = q3bVar;
                    q3bVar2.f73129b.add(qy6Var);
                    if (q3bVar2.f73129b.size() == 1) {
                        q3bVar2.startWatching();
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new yf4() { // from class: p3b
                @Override // p000.yf4
                public final void dispose() {
                    q3b.C11287a.observe$lambda$4(path, qy6Var);
                }
            };
        }
    }

    public /* synthetic */ q3b(String str, jt3 jt3Var) {
        this(str);
    }

    @yfb
    public final String getPath() {
        return this.f73128a;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, @gib String str) {
        Iterator<T> it = this.f73129b.iterator();
        while (it.hasNext()) {
            ((qy6) it.next()).invoke(str);
        }
    }

    private q3b(String str) {
        super(str, 128);
        this.f73128a = str;
        this.f73129b = new CopyOnWriteArrayList<>();
    }
}
