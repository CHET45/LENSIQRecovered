package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1790#2,6:213\n12511#2,2:221\n1682#2,6:223\n12511#2,2:229\n1682#2,6:232\n37#3,2:219\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:213,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:219,2\n*E\n"})
public final class l0g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f55888a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f55889b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final StackTraceElement f55890c = new h80().coroutineBoundary();

    /* JADX INFO: renamed from: d */
    public static final String f55891d;

    /* JADX INFO: renamed from: e */
    public static final String f55892e;

    static {
        Object objM32723constructorimpl;
        Object objM32723constructorimpl2;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(tq0.class.getCanonicalName());
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        if (v7e.m32726exceptionOrNullimpl(objM32723constructorimpl) != null) {
            objM32723constructorimpl = f55888a;
        }
        f55891d = (String) objM32723constructorimpl;
        try {
            v7e.C13927a c13927a3 = v7e.f90266b;
            objM32723constructorimpl2 = v7e.m32723constructorimpl(l0g.class.getCanonicalName());
        } catch (Throwable th2) {
            v7e.C13927a c13927a4 = v7e.f90266b;
            objM32723constructorimpl2 = v7e.m32723constructorimpl(y7e.createFailure(th2));
        }
        if (v7e.m32726exceptionOrNullimpl(objM32723constructorimpl2) != null) {
            objM32723constructorimpl2 = f55889b;
        }
        f55892e = (String) objM32723constructorimpl2;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    private static final <E extends Throwable> scc<E, StackTraceElement[]> causeAndStacktrace(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !md8.areEqual(cause.getClass(), e.getClass())) {
            return vkh.m24050to(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return vkh.m24050to(cause, stackTrace);
            }
        }
        return vkh.m24050to(e, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f55890c);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, f55891d);
        int i = 0;
        if (iFirstFrameIndex == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i2 = 0; i2 < iFirstFrameIndex; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iFirstFrameIndex] = (StackTraceElement) it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(a23 a23Var) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = a23Var.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            a23Var = a23Var.getCallerFrame();
            if (a23Var == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = a23Var.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && md8.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && md8.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && md8.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (md8.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void initCause(@yfb Throwable th, @yfb Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(@yfb StackTraceElement stackTraceElement) {
        return h9g.startsWith$default(stackTraceElement.getClassName(), k13.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    @gib
    public static final Object recoverAndThrow(@yfb Throwable th, @yfb zy2<?> zy2Var) throws Throwable {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, zy2<?> zy2Var) throws Throwable {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e, a23 a23Var) {
        scc sccVarCauseAndStacktrace = causeAndStacktrace(e);
        Throwable th = (Throwable) sccVarCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sccVarCauseAndStacktrace.component2();
        Throwable thTryCopyException = w75.tryCopyException(th);
        if (thTryCopyException == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(a23Var);
        if (arrayDequeCreateStackTrace.isEmpty()) {
            return e;
        }
        if (th != e) {
            mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
        }
        return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
    }

    @yfb
    public static final <E extends Throwable> E recoverStackTrace(@yfb E e) {
        return e;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (md8.areEqual(f55892e, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i2 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, f55891d);
        int i3 = 0;
        int i4 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? f55890c : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    @yfb
    @yjd
    public static final <E extends Throwable> E unwrap(@yfb E e) {
        return e;
    }

    @yfb
    @yjd
    public static final <E extends Throwable> E unwrapImpl(@yfb E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && md8.areEqual(e2.getClass(), e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    @yfb
    public static final <E extends Throwable> E recoverStackTrace(@yfb E e, @yfb zy2<?> zy2Var) {
        return e;
    }
}
