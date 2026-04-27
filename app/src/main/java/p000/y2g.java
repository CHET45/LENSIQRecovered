package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,55:1\n47#2:56\n45#2:57\n47#2:58\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n32#1:56\n34#1:57\n39#1:58\n*E\n"})
@e0g(parameters = 1)
public abstract class y2g implements x2g {

    /* JADX INFO: renamed from: b */
    public static final int f100197b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xb0 f100198a = new xb0(0);

    /* JADX INFO: renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m33359isReadInh_f27i8$runtime_release(int i) {
        return (i & nrd.m31201constructorimpl(this.f100198a.get())) != 0;
    }

    /* JADX INFO: renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m33360recordReadInh_f27i8$runtime_release(int i) {
        int iM31201constructorimpl;
        do {
            iM31201constructorimpl = nrd.m31201constructorimpl(this.f100198a.get());
            if ((iM31201constructorimpl & i) != 0) {
                return;
            }
        } while (!this.f100198a.compareAndSet(iM31201constructorimpl, nrd.m31201constructorimpl(iM31201constructorimpl | i)));
    }
}
