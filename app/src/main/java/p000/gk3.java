package p000;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p000.gk3;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:634\n147#1,4:636\n152#1,5:641\n146#1:646\n147#1,4:648\n152#1,5:653\n1#2:617\n1#2:635\n1#2:647\n774#3:618\n865#3,2:619\n1216#3,2:621\n1246#3,4:623\n1863#3,2:661\n360#3,7:669\n1827#3,8:676\n607#4:627\n607#4:640\n607#4:652\n607#4:658\n1317#4,2:659\n37#5,2:628\n37#5,2:630\n37#5,2:632\n1682#6,6:663\n1790#6,6:684\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:634\n241#1:636,4\n241#1:641,5\n248#1:646\n248#1:648,4\n248#1:653,5\n241#1:635\n248#1:647\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:661,2\n412#1:669,7\n502#1:676,8\n150#1:627\n241#1:640\n248#1:652\n283#1:658\n284#1:659,2\n207#1:628,2\n208#1:630,2\n209#1:632,2\n351#1:663,6\n554#1:684,6\n*E\n"})
@yjd
public final class gk3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final gk3 f39982a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final StackTraceElement f39983b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final SimpleDateFormat f39984c;

    /* JADX INFO: renamed from: d */
    @gib
    public static Thread f39985d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final sp2<C6350a<?>, Boolean> f39986e;

    /* JADX INFO: renamed from: f */
    public static boolean f39987f;

    /* JADX INFO: renamed from: g */
    public static boolean f39988g;

    /* JADX INFO: renamed from: h */
    public static boolean f39989h;

    /* JADX INFO: renamed from: i */
    @gib
    public static final qy6<Boolean, bth> f39990i;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final sp2<a23, xj3> f39991j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ C6351b f39992k;

    /* JADX INFO: renamed from: gk3$a */
    public static final class C6350a<T> implements zy2<T>, a23 {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final zy2<T> f39993a;

        /* JADX INFO: renamed from: b */
        @un8
        @yfb
        public final xj3 f39994b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6350a(@yfb zy2<? super T> zy2Var, @yfb xj3 xj3Var) {
            this.f39993a = zy2Var;
            this.f39994b = xj3Var;
        }

        private final k0g getFrame() {
            return this.f39994b.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // p000.a23
        @gib
        public a23 getCallerFrame() {
            k0g frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // p000.zy2
        @yfb
        public e13 getContext() {
            return this.f39993a.getContext();
        }

        @Override // p000.a23
        @gib
        public StackTraceElement getStackTraceElement() {
            k0g frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // p000.zy2
        public void resumeWith(@yfb Object obj) {
            gk3.f39982a.probeCoroutineCompleted(this);
            this.f39993a.resumeWith(obj);
        }

        @yfb
        public String toString() {
            return this.f39993a.toString();
        }
    }

    /* JADX INFO: renamed from: gk3$b */
    public /* synthetic */ class C6351b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f39995a = AtomicIntegerFieldUpdater.newUpdater(C6351b.class, "installations$volatile");

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicLongFieldUpdater f39996b = AtomicLongFieldUpdater.newUpdater(C6351b.class, "sequenceNumber$volatile");
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        private C6351b() {
        }

        private final /* synthetic */ int getInstallations$volatile() {
            return this.installations$volatile;
        }

        private final /* synthetic */ long getSequenceNumber$volatile() {
            return this.sequenceNumber$volatile;
        }

        private final /* synthetic */ void setInstallations$volatile(int i) {
            this.installations$volatile = i;
        }

        private final /* synthetic */ void setSequenceNumber$volatile(long j) {
            this.sequenceNumber$volatile = j;
        }

        public /* synthetic */ C6351b(jt3 jt3Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: gk3$c */
    @dwf({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n241#3:618\n*E\n"})
    public static final class C6352c implements qy6<C6350a<?>, wj3> {
        @Override // p000.qy6
        public final wj3 invoke(C6350a<?> c6350a) {
            e13 context;
            if (gk3.f39982a.isFinished(c6350a) || (context = c6350a.f39994b.getContext()) == null) {
                return null;
            }
            return new wj3(c6350a.f39994b, context);
        }
    }

    /* JADX INFO: renamed from: gk3$d */
    @dwf({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n150#2:103\n*E\n"})
    public static final class C6353d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return md2.compareValues(Long.valueOf(((C6350a) t).f39994b.f98173b), Long.valueOf(((C6350a) t2).f39994b.f98173b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: gk3$e */
    @dwf({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
    public static final class C6354e<R> implements qy6<C6350a<?>, R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<C6350a<?>, e13, R> f39997a;

        /* JADX WARN: Multi-variable type inference failed */
        public C6354e(gz6<? super C6350a<?>, ? super e13, ? extends R> gz6Var) {
            this.f39997a = gz6Var;
        }

        @Override // p000.qy6
        public final R invoke(C6350a<?> c6350a) {
            e13 context;
            if (gk3.f39982a.isFinished(c6350a) || (context = c6350a.f39994b.getContext()) == null) {
                return null;
            }
            return this.f39997a.invoke(c6350a, context);
        }
    }

    /* JADX INFO: renamed from: gk3$f */
    @dwf({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n283#2:103\n*E\n"})
    public static final class C6355f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return md2.compareValues(Long.valueOf(((C6350a) t).f39994b.f98173b), Long.valueOf(((C6350a) t2).f39994b.f98173b));
        }
    }

    /* JADX INFO: renamed from: gk3$g */
    @dwf({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n248#3:618\n*E\n"})
    public static final class C6356g implements qy6<C6350a<?>, tk3> {
        @Override // p000.qy6
        public final tk3 invoke(C6350a<?> c6350a) {
            e13 context;
            if (gk3.f39982a.isFinished(c6350a) || (context = c6350a.f39994b.getContext()) == null) {
                return null;
            }
            return new tk3(c6350a.f39994b, context);
        }
    }

    static {
        gk3 gk3Var = new gk3();
        f39982a = gk3Var;
        f39983b = new h80().coroutineCreation();
        f39984c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        jt3 jt3Var = null;
        f39986e = new sp2<>(false, 1, jt3Var);
        f39987f = true;
        f39989h = true;
        f39990i = gk3Var.getDynamicAttach();
        f39991j = new sp2<>(true);
        f39992k = new C6351b(jt3Var);
    }

    private gk3() {
    }

    private final void build(jj8 jj8Var, Map<jj8, xj3> map, StringBuilder sb, String str) {
        xj3 xj3Var = map.get(jj8Var);
        if (xj3Var != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) v82.firstOrNull((List) xj3Var.lastObservedStackTrace$kotlinx_coroutines_core());
            sb.append(str + getDebugString(jj8Var) + ", continuation is " + xj3Var.getState$kotlinx_coroutines_core() + " at line " + stackTraceElement + '\n');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('\t');
            str = sb2.toString();
        } else if (!(jj8Var instanceof uqe)) {
            sb.append(str + getDebugString(jj8Var) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator<jj8> it = jj8Var.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> zy2<T> createOwner(zy2<? super T> zy2Var, k0g k0gVar) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return zy2Var;
        }
        C6350a<?> c6350a = new C6350a<>(zy2Var, new xj3(zy2Var.getContext(), k0gVar, C6351b.f39996b.incrementAndGet(f39992k)));
        sp2<C6350a<?>, Boolean> sp2Var = f39986e;
        sp2Var.put(c6350a, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            sp2Var.clear();
        }
        return c6350a;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(gz6<? super C6350a<?>, ? super e13, ? extends R> gz6Var) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return vze.toList(vze.mapNotNull(vze.sortedWith(v82.asSequence(getCapturedCoroutines()), new C6353d()), new C6354e(gz6Var)));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + f39984c.format(Long.valueOf(System.currentTimeMillis())));
        for (C6350a c6350a : vze.sortedWith(vze.filter(v82.asSequence(getCapturedCoroutines()), new qy6() { // from class: ek3
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(gk3.dumpCoroutinesSynchronized$lambda$14((gk3.C6350a) obj));
            }
        }), new C6355f())) {
            xj3 xj3Var = c6350a.f39994b;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = xj3Var.lastObservedStackTrace$kotlinx_coroutines_core();
            gk3 gk3Var = f39982a;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = gk3Var.enhanceStackTraceWithThreadDumpImpl(xj3Var.getState$kotlinx_coroutines_core(), xj3Var.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            printStream.print("\n\nCoroutine " + c6350a.f39993a + ", state: " + ((md8.areEqual(xj3Var.getState$kotlinx_coroutines_core(), yj3.f101783b) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? xj3Var.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)" : xj3Var.getState$kotlinx_coroutines_core()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                printStream.print("\n\tat " + f39983b);
                gk3Var.printStackTrace(printStream, xj3Var.getCreationStackTrace());
            } else {
                gk3Var.printStackTrace(printStream, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(C6350a c6350a) {
        return !f39982a.isFinished(c6350a);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String str, Thread thread, List<StackTraceElement> list) {
        Object objM32723constructorimpl;
        if (!md8.areEqual(str, yj3.f101783b) || thread == null) {
            return list;
        }
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        if (v7e.m32729isFailureimpl(objM32723constructorimpl)) {
            objM32723constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM32723constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (md8.areEqual(stackTraceElement.getClassName(), l0g.f55888a) && md8.areEqual(stackTraceElement.getMethodName(), "resumeWith") && md8.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        scc<Integer, Integer> sccVarFindContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, list);
        int iIntValue = sccVarFindContinuationStartIndex.component1().intValue();
        int iIntValue2 = sccVarFindContinuationStartIndex.component2().intValue();
        if (iIntValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i) - iIntValue) - 1) - iIntValue2);
        int i2 = i - iIntValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = list.size();
        for (int i4 = iIntValue + 1; i4 < size; i4++) {
            arrayList.add(list.get(i4));
        }
        return arrayList;
    }

    private final scc<Integer, Integer> findContinuationStartIndex(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int iFindIndexOfFrame = f39982a.findIndexOfFrame((i - 1) - i2, stackTraceElementArr, list);
            if (iFindIndexOfFrame != -1) {
                return vkh.m24050to(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i2));
            }
        }
        return vkh.m24050to(-1, 0);
    }

    private final int findIndexOfFrame(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) e80.getOrNull(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (md8.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && md8.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && md8.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final Set<C6350a<?>> getCapturedCoroutines() {
        return f39986e.keySet();
    }

    private final String getDebugString(jj8 jj8Var) {
        return jj8Var instanceof sj8 ? ((sj8) jj8Var).toDebugString() : jj8Var.toString();
    }

    private static /* synthetic */ void getDebugString$annotations(jj8 jj8Var) {
    }

    private final qy6<Boolean, bth> getDynamicAttach() {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM32723constructorimpl = v7e.m32723constructorimpl((qy6) qlh.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        return (qy6) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(C6350a<?> c6350a) {
        jj8 jj8Var;
        e13 context = c6350a.f39994b.getContext();
        if (context == null || (jj8Var = (jj8) context.get(jj8.f50715A)) == null || !jj8Var.isCompleted()) {
            return false;
        }
        f39986e.remove(c6350a);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return h9g.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final C6350a<?> owner(zy2<?> zy2Var) {
        a23 a23Var = zy2Var instanceof a23 ? (a23) zy2Var : null;
        if (a23Var != null) {
            return owner(a23Var);
        }
        return null;
    }

    private final void printStackTrace(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(C6350a<?> c6350a) {
        a23 a23VarRealCaller;
        f39986e.remove(c6350a);
        a23 lastObservedFrame$kotlinx_coroutines_core = c6350a.f39994b.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (a23VarRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        f39991j.remove(a23VarRealCaller);
    }

    private final a23 realCaller(a23 a23Var) {
        do {
            a23Var = a23Var.getCallerFrame();
            if (a23Var == null) {
                return null;
            }
        } while (a23Var.getStackTraceElement() == null);
        return a23Var;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (md8.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        int i3 = i + 1;
        if (!f39987f) {
            int i4 = length - i3;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (isInternalMethod(stackTrace[i3])) {
                arrayList2.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && isInternalMethod(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList2.add(stackTrace[i8]);
                }
                arrayList2.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        f39985d = tyg.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new ny6() { // from class: fk3
            @Override // p000.ny6
            public final Object invoke() {
                return gk3.startWeakRefCleanerThread$lambda$2();
            }
        }, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth startWeakRefCleanerThread$lambda$2() {
        f39991j.runWeakRefQueueCleaningLoopUntilInterrupted();
        return bth.f14751a;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = f39985d;
        if (thread == null) {
            return;
        }
        f39985d = null;
        thread.interrupt();
        thread.join();
    }

    private final k0g toStackTraceFrame(List<StackTraceElement> list) {
        k0g k0gVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                k0gVar = new k0g(k0gVar, listIterator.previous());
            }
        }
        return new k0g(k0gVar, f39983b);
    }

    private final String toStringRepr(Object obj) {
        return hk3.repr(obj.toString());
    }

    private final void updateRunningState(a23 a23Var, String str) {
        boolean z;
        if (isInstalled$kotlinx_coroutines_debug()) {
            sp2<a23, xj3> sp2Var = f39991j;
            xj3 xj3VarRemove = sp2Var.remove(a23Var);
            if (xj3VarRemove != null) {
                z = false;
            } else {
                C6350a<?> c6350aOwner = owner(a23Var);
                if (c6350aOwner == null || (xj3VarRemove = c6350aOwner.f39994b) == null) {
                    return;
                }
                a23 lastObservedFrame$kotlinx_coroutines_core = xj3VarRemove.getLastObservedFrame$kotlinx_coroutines_core();
                a23 a23VarRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (a23VarRealCaller != null) {
                    sp2Var.remove(a23VarRealCaller);
                }
                z = true;
            }
            md8.checkNotNull(a23Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            xj3VarRemove.updateState$kotlinx_coroutines_core(str, (zy2) a23Var, z);
            a23 a23VarRealCaller2 = realCaller(a23Var);
            if (a23VarRealCaller2 == null) {
                return;
            }
            sp2Var.put(a23VarRealCaller2, xj3VarRemove);
        }
    }

    private final void updateState(zy2<?> zy2Var, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (f39989h && zy2Var.getContext() == a05.f2a) {
                return;
            }
            if (md8.areEqual(str, yj3.f101783b)) {
                a23 a23Var = zy2Var instanceof a23 ? (a23) zy2Var : null;
                if (a23Var == null) {
                    return;
                }
                updateRunningState(a23Var, str);
                return;
            }
            C6350a<?> c6350aOwner = owner(zy2Var);
            if (c6350aOwner == null) {
                return;
            }
            updateState(c6350aOwner, zy2Var, str);
        }
    }

    @xn8(name = "dumpCoroutines")
    public final void dumpCoroutines(@yfb PrintStream printStream) {
        synchronized (printStream) {
            f39982a.dumpCoroutinesSynchronized(printStream);
            bth bthVar = bth.f14751a;
        }
    }

    @yfb
    public final List<wj3> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return vze.toList(vze.mapNotNull(vze.sortedWith(v82.asSequence(getCapturedCoroutines()), new C6353d()), new C6352c()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @yfb
    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<wj3> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (wj3 wj3Var : listDumpCoroutinesInfo) {
            e13 context = wj3Var.getContext();
            u13 u13Var = (u13) context.get(u13.f86542c);
            Long lValueOf = null;
            String stringRepr = (u13Var == null || (name = u13Var.getName()) == null) ? null : toStringRepr(name);
            m13 m13Var = (m13) context.get(m13.f59565b);
            String stringRepr2 = m13Var != null ? toStringRepr(m13Var) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(stringRepr);
            sb.append(",\n                    \"id\": ");
            r13 r13Var = (r13) context.get(r13.f76737c);
            if (r13Var != null) {
                lValueOf = Long.valueOf(r13Var.getId());
            }
            sb.append(lValueOf);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(stringRepr2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(wj3Var.getSequenceNumber());
            sb.append(",\n                    \"state\": \"");
            sb.append(wj3Var.getState());
            sb.append("\"\n                } \n                ");
            arrayList3.add(a9g.trimIndent(sb.toString()));
            arrayList2.add(wj3Var.getLastObservedFrame());
            arrayList.add(wj3Var.getLastObservedThread());
        }
        return new Object[]{C4584d2.f28242k + v82.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + C4584d2.f28243l, arrayList.toArray(new Thread[0]), arrayList2.toArray(new a23[0]), listDumpCoroutinesInfo.toArray(new wj3[0])};
    }

    @yfb
    public final List<tk3> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return vze.toList(vze.mapNotNull(vze.sortedWith(v82.asSequence(getCapturedCoroutines()), new C6353d()), new C6356g()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @yfb
    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(@yfb wj3 wj3Var, @yfb List<StackTraceElement> list) {
        return enhanceStackTraceWithThreadDumpImpl(wj3Var.getState(), wj3Var.getLastObservedThread(), list);
    }

    @yfb
    public final String enhanceStackTraceWithThreadDumpAsJson(@yfb wj3 wj3Var) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(wj3Var, wj3Var.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? toStringRepr(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(a9g.trimIndent(sb.toString()));
        }
        return C4584d2.f28242k + v82.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + C4584d2.f28243l;
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return f39988g;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return f39989h;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return f39987f;
    }

    @yfb
    public final String hierarchyToString$kotlinx_coroutines_core(@yfb jj8 jj8Var) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<C6350a<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<C6350a> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((C6350a) obj).f39993a.getContext().get(jj8.f50715A) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(arrayList, 10)), 16));
        for (C6350a c6350a : arrayList) {
            linkedHashMap.put(oj8.getJob(c6350a.f39993a.getContext()), c6350a.f39994b);
        }
        StringBuilder sb = new StringBuilder();
        f39982a.build(jj8Var, linkedHashMap, sb, "");
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void install$kotlinx_coroutines_core() {
        qy6<Boolean, bth> qy6Var;
        if (C6351b.f39995a.incrementAndGet(f39992k) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (C6333gj.f39919a.isInstalledStatically$kotlinx_coroutines_core() || (qy6Var = f39990i) == null) {
            return;
        }
        qy6Var.invoke(Boolean.TRUE);
    }

    @xn8(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return C6351b.f39995a.get(f39992k) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final <T> zy2<T> probeCoroutineCreated$kotlinx_coroutines_core(@yfb zy2<? super T> zy2Var) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return zy2Var;
        }
        if (!(f39989h && zy2Var.getContext() == a05.f2a) && owner(zy2Var) == null) {
            return createOwner(zy2Var, f39988g ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return zy2Var;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@yfb zy2<?> zy2Var) {
        updateState(zy2Var, yj3.f101783b);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@yfb zy2<?> zy2Var) {
        updateState(zy2Var, yj3.f101784c);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        f39988g = z;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        f39989h = z;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        f39987f = z;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        qy6<Boolean, bth> qy6Var;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (C6351b.f39995a.decrementAndGet(f39992k) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        f39986e.clear();
        f39991j.clear();
        if (C6333gj.f39919a.isInstalledStatically$kotlinx_coroutines_core() || (qy6Var = f39990i) == null) {
            return;
        }
        qy6Var.invoke(Boolean.FALSE);
    }

    private final C6350a<?> owner(a23 a23Var) {
        while (!(a23Var instanceof C6350a)) {
            a23Var = a23Var.getCallerFrame();
            if (a23Var == null) {
                return null;
            }
        }
        return (C6350a) a23Var;
    }

    private final void updateState(C6350a<?> c6350a, zy2<?> zy2Var, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            c6350a.f39994b.updateState$kotlinx_coroutines_core(str, zy2Var, true);
        }
    }
}
