package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"})
@e0g(parameters = 0)
public final class xab<T> {

    /* JADX INFO: renamed from: d */
    public static final int f97360d = 8;

    /* JADX INFO: renamed from: a */
    public int f97361a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f97362b = new int[16];

    /* JADX INFO: renamed from: c */
    @yfb
    public f7b<T>[] f97363c = new f7b[16];

    public final boolean isNotEmpty() {
        int i = this.f97361a;
        return i > 0 && this.f97362b[i - 1] >= 0;
    }

    public final T pop() {
        int i = this.f97361a;
        if (i <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i2 = i - 1;
        int i3 = this.f97362b[i2];
        f7b<T> f7bVar = this.f97363c[i2];
        md8.checkNotNull(f7bVar);
        if (i3 > 0) {
            this.f97362b[i2] = r3[i2] - 1;
        } else if (i3 == 0) {
            this.f97363c[i2] = null;
            this.f97361a--;
        }
        return f7bVar.getContent()[i3];
    }

    public final void push(@yfb f7b<T> f7bVar) {
        if (f7bVar.isEmpty()) {
            return;
        }
        int i = this.f97361a;
        int[] iArr = this.f97362b;
        if (i >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f97362b = iArrCopyOf;
            f7b<T>[] f7bVarArr = this.f97363c;
            Object[] objArrCopyOf = Arrays.copyOf(f7bVarArr, f7bVarArr.length * 2);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f97363c = (f7b[]) objArrCopyOf;
        }
        this.f97362b[i] = f7bVar.getSize() - 1;
        this.f97363c[i] = f7bVar;
        this.f97361a++;
    }
}
