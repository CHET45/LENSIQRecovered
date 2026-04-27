package p000;

import java.util.Iterator;
import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1076:1\n1855#2,2:1077\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n1067#1:1077,2\n*E\n"})
@e0g(parameters = 0)
public final class y3i<V extends AbstractC16313zy> implements x3i<V> {

    /* JADX INFO: renamed from: e */
    public static final int f100308e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC2106bz f100309a;

    /* JADX INFO: renamed from: b */
    public V f100310b;

    /* JADX INFO: renamed from: c */
    public V f100311c;

    /* JADX INFO: renamed from: d */
    public V f100312d;

    /* JADX INFO: renamed from: y3i$a */
    public static final class C15482a implements InterfaceC2106bz {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x36 f100313a;

        public C15482a(x36 x36Var) {
            this.f100313a = x36Var;
        }

        @Override // p000.InterfaceC2106bz
        @yfb
        public x36 get(int i) {
            return this.f100313a;
        }
    }

    public y3i(@yfb InterfaceC2106bz interfaceC2106bz) {
        this.f100309a = interfaceC2106bz;
    }

    @Override // p000.t3i
    public long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        Iterator<Integer> it = kpd.until(0, v.getSize$animation_core_release()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((o68) it).nextInt();
            jMax = Math.max(jMax, this.f100309a.get(iNextInt).getDurationNanos(v.get$animation_core_release(iNextInt), v2.get$animation_core_release(iNextInt), v3.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }

    @Override // p000.t3i
    @yfb
    public V getEndVelocity(@yfb V v, @yfb V v2, @yfb V v3) {
        if (this.f100312d == null) {
            this.f100312d = (V) C1667az.newInstance(v3);
        }
        V v4 = this.f100312d;
        if (v4 == null) {
            md8.throwUninitializedPropertyAccessException("endVelocityVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.f100312d;
            if (v5 == null) {
                md8.throwUninitializedPropertyAccessException("endVelocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.f100309a.get(i).getEndVelocity(v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.f100312d;
        if (v6 != null) {
            return v6;
        }
        md8.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        if (this.f100310b == null) {
            this.f100310b = (V) C1667az.newInstance(v);
        }
        V v4 = this.f100310b;
        if (v4 == null) {
            md8.throwUninitializedPropertyAccessException("valueVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.f100310b;
            if (v5 == null) {
                md8.throwUninitializedPropertyAccessException("valueVector");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.f100309a.get(i).getValueFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.f100310b;
        if (v6 != null) {
            return v6;
        }
        md8.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        if (this.f100311c == null) {
            this.f100311c = (V) C1667az.newInstance(v3);
        }
        V v4 = this.f100311c;
        if (v4 == null) {
            md8.throwUninitializedPropertyAccessException("velocityVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.f100311c;
            if (v5 == null) {
                md8.throwUninitializedPropertyAccessException("velocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.f100309a.get(i).getVelocityFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.f100311c;
        if (v6 != null) {
            return v6;
        }
        md8.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    public y3i(@yfb x36 x36Var) {
        this(new C15482a(x36Var));
    }
}
