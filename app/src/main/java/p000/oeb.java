package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,647:1\n1208#2:648\n1187#2,2:649\n460#3,11:651\n460#3,11:662\n460#3,11:673\n460#3,11:684\n460#3,11:695\n523#3:706\n48#3:707\n523#3:708\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n189#1:648\n189#1:649,2\n198#1:651,11\n228#1:662,11\n247#1:673,11\n258#1:684,11\n272#1:695,11\n283#1:706\n296#1:707\n297#1:708\n*E\n"})
@e0g(parameters = 0)
public class oeb {

    /* JADX INFO: renamed from: b */
    public static final int f67423b = f7b.f35631d;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<eeb> f67424a = new f7b<>(new eeb[16], 0);

    public boolean buildCache(@yfb zl9<h2d> zl9Var, @yfb mv8 mv8Var, @yfb kb8 kb8Var, boolean z) {
        f7b<eeb> f7bVar = this.f67424a;
        int size = f7bVar.getSize();
        if (size <= 0) {
            return false;
        }
        eeb[] content = f7bVar.getContent();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = content[i].buildCache(zl9Var, mv8Var, kb8Var, z) || z2;
            i++;
        } while (i < size);
        return z2;
    }

    public void cleanUpHits(@yfb kb8 kb8Var) {
        int size = this.f67424a.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.f67424a.getContent()[size].getPointerIds().isEmpty()) {
                this.f67424a.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.f67424a.clear();
    }

    public void dispatchCancel() {
        f7b<eeb> f7bVar = this.f67424a;
        int size = f7bVar.getSize();
        if (size > 0) {
            eeb[] content = f7bVar.getContent();
            int i = 0;
            do {
                content[i].dispatchCancel();
                i++;
            } while (i < size);
        }
    }

    public boolean dispatchFinalEventPass(@yfb kb8 kb8Var) {
        f7b<eeb> f7bVar = this.f67424a;
        int size = f7bVar.getSize();
        boolean z = false;
        if (size > 0) {
            eeb[] content = f7bVar.getContent();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = content[i].dispatchFinalEventPass(kb8Var) || z2;
                i++;
            } while (i < size);
            z = z2;
        }
        cleanUpHits(kb8Var);
        return z;
    }

    public boolean dispatchMainEventPass(@yfb zl9<h2d> zl9Var, @yfb mv8 mv8Var, @yfb kb8 kb8Var, boolean z) {
        f7b<eeb> f7bVar = this.f67424a;
        int size = f7bVar.getSize();
        if (size <= 0) {
            return false;
        }
        eeb[] content = f7bVar.getContent();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = content[i].dispatchMainEventPass(zl9Var, mv8Var, kb8Var, z) || z2;
            i++;
        } while (i < size);
        return z2;
    }

    @yfb
    public final f7b<eeb> getChildren() {
        return this.f67424a;
    }

    public final void removeDetachedPointerInputModifierNodes() {
        int i = 0;
        while (i < this.f67424a.getSize()) {
            eeb eebVar = this.f67424a.getContent()[i];
            if (eebVar.getModifierNode().isAttached()) {
                i++;
                eebVar.removeDetachedPointerInputModifierNodes();
            } else {
                eebVar.dispatchCancel();
                this.f67424a.removeAt(i);
            }
        }
    }

    public void removeInvalidPointerIdsAndChanges(long j, @yfb f6b<eeb> f6bVar) {
        f7b<eeb> f7bVar = this.f67424a;
        int size = f7bVar.getSize();
        if (size > 0) {
            eeb[] content = f7bVar.getContent();
            int i = 0;
            do {
                content[i].removeInvalidPointerIdsAndChanges(j, f6bVar);
                i++;
            } while (i < size);
        }
    }
}
