package p000;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,184:1\n1208#2:185\n1187#2,2:186\n36#3:188\n36#3:190\n1#4:189\n460#5,11:191\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n124#1:185\n124#1:186,2\n137#1:188\n176#1:190\n179#1:191,11\n*E\n"})
public final class y38 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final txc f100213a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<bth> f100214b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f100215c = new Object();

    /* JADX INFO: renamed from: d */
    @yfb
    public f7b<WeakReference<iib>> f100216d = new f7b<>(new WeakReference[16], 0);

    /* JADX INFO: renamed from: e */
    public boolean f100217e;

    /* JADX INFO: renamed from: y38$a */
    @dwf({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,184:1\n546#2,11:185\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1\n*L\n157#1:185,11\n*E\n"})
    public static final class C15411a extends tt8 implements qy6<iib, bth> {
        public C15411a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(iib iibVar) {
            invoke2(iibVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb iib iibVar) {
            int i;
            iibVar.disposeDelegate();
            f7b f7bVar = y38.this.f100216d;
            int size = f7bVar.getSize();
            if (size <= 0) {
                i = -1;
                break;
            }
            Object[] content = f7bVar.getContent();
            i = 0;
            while (!md8.areEqual((WeakReference) content[i], iibVar)) {
                i++;
                if (i >= size) {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                y38.this.f100216d.removeAt(i);
            }
            if (y38.this.f100216d.isEmpty()) {
                y38.this.f100214b.invoke();
            }
        }
    }

    public y38(@yfb txc txcVar, @yfb ny6<bth> ny6Var) {
        this.f100213a = txcVar;
        this.f100214b = ny6Var;
    }

    @gib
    public final InputConnection createInputConnection(@yfb EditorInfo editorInfo) {
        synchronized (this.f100215c) {
            if (this.f100217e) {
                return null;
            }
            iib iibVarNullableInputConnectionWrapper = pib.NullableInputConnectionWrapper(this.f100213a.createInputConnection(editorInfo), new C15411a());
            this.f100216d.add(new WeakReference<>(iibVarNullableInputConnectionWrapper));
            return iibVarNullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.f100215c) {
            try {
                this.f100217e = true;
                f7b<WeakReference<iib>> f7bVar = this.f100216d;
                int size = f7bVar.getSize();
                if (size > 0) {
                    WeakReference<iib>[] content = f7bVar.getContent();
                    int i = 0;
                    do {
                        iib iibVar = content[i].get();
                        if (iibVar != null) {
                            iibVar.disposeDelegate();
                        }
                        i++;
                    } while (i < size);
                }
                this.f100216d.clear();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.f100217e;
    }
}
