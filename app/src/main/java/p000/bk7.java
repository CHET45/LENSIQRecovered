package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,647:1\n366#2,12:648\n728#3:660\n728#3:663\n1580#4:661\n1580#4:664\n1#5:662\n1#5:665\n382#6,4:666\n354#6,6:670\n364#6,3:677\n367#6,2:681\n387#6,2:683\n370#6,6:685\n389#6:691\n1810#7:676\n1672#7:680\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n77#1:648,12\n86#1:660\n101#1:663\n86#1:661\n101#1:664\n86#1:662\n101#1:665\n110#1:666,4\n110#1:670,6\n110#1:677,3\n110#1:681,2\n110#1:683,2\n110#1:685,6\n110#1:691\n110#1:676\n110#1:680\n*E\n"})
@e0g(parameters = 0)
public final class bk7 {

    /* JADX INFO: renamed from: d */
    public static final int f13938d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final mv8 f13939a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final oeb f13940b = new oeb();

    /* JADX INFO: renamed from: c */
    @yfb
    public final u5b<f6b<eeb>> f13941c = new u5b<>(10);

    public bk7(@yfb mv8 mv8Var) {
        this.f13939a = mv8Var;
    }

    /* JADX INFO: renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m28007addHitPathQJqDSyo$default(bk7 bk7Var, long j, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        bk7Var.m28008addHitPathQJqDSyo(j, list, z);
    }

    public static /* synthetic */ boolean dispatchChanges$default(bk7 bk7Var, kb8 kb8Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return bk7Var.dispatchChanges(kb8Var, z);
    }

    private final void removeInvalidPointerIdsAndChanges(long j, f6b<eeb> f6bVar) {
        this.f13940b.removeInvalidPointerIdsAndChanges(j, f6bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX INFO: renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m28008addHitPathQJqDSyo(long r18, @p000.yfb java.util.List<? extends androidx.compose.p002ui.InterfaceC0701e.d> r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bk7.m28008addHitPathQJqDSyo(long, java.util.List, boolean):void");
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        this.f13940b.clear();
    }

    public final boolean dispatchChanges(@yfb kb8 kb8Var, boolean z) {
        if (this.f13940b.buildCache(kb8Var.getChanges(), this.f13939a, kb8Var, z)) {
            return this.f13940b.dispatchFinalEventPass(kb8Var) || this.f13940b.dispatchMainEventPass(kb8Var.getChanges(), this.f13939a, kb8Var, z);
        }
        return false;
    }

    @yfb
    public final oeb getRoot$ui_release() {
        return this.f13940b;
    }

    public final void processCancel() {
        this.f13940b.dispatchCancel();
        clearPreviouslyHitModifierNodeCache();
    }

    public final void removeDetachedPointerInputNodes() {
        this.f13940b.removeDetachedPointerInputModifierNodes();
    }
}
