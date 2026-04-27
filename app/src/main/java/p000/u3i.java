package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u3i {

    /* JADX INFO: renamed from: a */
    public static final int f86742a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: u3i$a */
    @dwf({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1076:1\n1549#2:1077\n1620#2,3:1078\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n934#1:1077\n934#1:1078,3\n*E\n"})
    public static final class C13353a implements InterfaceC2106bz {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<e56> f86743a;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        public C13353a(AbstractC16313zy abstractC16313zy, float f, float f2) {
            f78 f78VarUntil = kpd.until(0, abstractC16313zy.getSize$animation_core_release());
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
            Iterator<Integer> it = f78VarUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(new e56(f, f2, abstractC16313zy.get$animation_core_release(((o68) it).nextInt())));
            }
            this.f86743a = arrayList;
        }

        @Override // p000.InterfaceC2106bz
        @yfb
        public e56 get(int i) {
            return this.f86743a.get(i);
        }
    }

    /* JADX INFO: renamed from: u3i$b */
    public static final class C13354b implements InterfaceC2106bz {

        /* JADX INFO: renamed from: a */
        @yfb
        public final e56 f86744a;

        public C13354b(float f, float f2) {
            this.f86744a = new e56(f, f2, 0.0f, 4, null);
        }

        @Override // p000.InterfaceC2106bz
        @yfb
        public e56 get(int i) {
            return this.f86744a;
        }
    }

    public static final long clampPlayTime(@yfb w3i<?> w3iVar, long j) {
        return kpd.coerceIn(j - ((long) w3iVar.getDelayMillis()), 0L, w3iVar.getDurationMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AbstractC16313zy> InterfaceC2106bz createSpringAnimations(V v, float f, float f2) {
        return v != null ? new C13353a(v, f, f2) : new C13354b(f, f2);
    }

    public static final <V extends AbstractC16313zy> long getDurationMillis(@yfb t3i<V> t3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
        return t3iVar.getDurationNanos(v, v2, v3) / 1000000;
    }

    @yfb
    public static final <V extends AbstractC16313zy> V getValueFromMillis(@yfb t3i<V> t3iVar, long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return (V) t3iVar.getValueFromNanos(j * 1000000, v, v2, v3);
    }
}
