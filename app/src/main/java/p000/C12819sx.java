package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: sx */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,885:1\n151#2,3:886\n33#2,4:889\n154#2,2:893\n38#2:895\n156#2:896\n171#2,13:897\n171#2,13:910\n317#2,8:923\n317#2,8:931\n317#2,8:939\n317#2,8:947\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n812#1:886,3\n812#1:889,4\n812#1:893,2\n812#1:895\n812#1:896\n813#1:897,13\n814#1:910,13\n833#1:923,8\n838#1:931,8\n843#1:939,8\n848#1:947,8\n*E\n"})
public final class C12819sx implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C15339xx f83190a;

    /* JADX INFO: renamed from: b */
    public boolean f83191b;

    /* JADX INFO: renamed from: sx$a */
    @dwf({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,885:1\n33#2,6:886\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n824#1:886,6\n*E\n"})
    public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<AbstractC0767t> f83192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends AbstractC0767t> list) {
            super(1);
            this.f83192a = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<AbstractC0767t> list = this.f83192a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC0767t.a.place$default(aVar, list.get(i), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public C12819sx(@yfb C15339xx c15339xx) {
        this.f83190a = c15339xx;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.f83191b;
    }

    @yfb
    public final C15339xx getScope() {
        return this.f83190a;
    }

    @Override // p000.uba
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int lastIndex = l82.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.uba
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int lastIndex = l82.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).mo27949measureBRTryo0(j));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((AbstractC0767t) obj).getWidth();
            int lastIndex = l82.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i2 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i2);
                    int width2 = ((AbstractC0767t) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        AbstractC0767t abstractC0767t = (AbstractC0767t) obj;
        int width3 = abstractC0767t != null ? abstractC0767t.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int height = ((AbstractC0767t) obj4).getHeight();
            int lastIndex2 = l82.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                int i3 = 1;
                while (true) {
                    Object obj5 = arrayList.get(i3);
                    int height2 = ((AbstractC0767t) obj5).getHeight();
                    if (height < height2) {
                        obj4 = obj5;
                        height = height2;
                    }
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
            obj2 = obj4;
        }
        AbstractC0767t abstractC0767t2 = (AbstractC0767t) obj2;
        int height3 = abstractC0767t2 != null ? abstractC0767t2.getHeight() : 0;
        if (interfaceC0761n.isLookingAhead()) {
            this.f83191b = true;
            this.f83190a.getTargetSize$animation_release().setValue(r78.m32079boximpl(s78.IntSize(width3, height3)));
        } else if (!this.f83191b) {
            this.f83190a.getTargetSize$animation_release().setValue(r78.m32079boximpl(s78.IntSize(width3, height3)));
        }
        return InterfaceC0761n.layout$default(interfaceC0761n, width3, height3, null, new a(arrayList), 4, null);
    }

    @Override // p000.uba
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int lastIndex = l82.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.uba
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int lastIndex = l82.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final void setHasLookaheadOccurred(boolean z) {
        this.f83191b = z;
    }
}
