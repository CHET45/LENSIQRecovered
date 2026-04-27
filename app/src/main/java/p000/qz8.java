package p000;

import androidx.compose.foundation.lazy.layout.C0663e;
import p000.qz8.InterfaceC11771a;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,85:1\n60#1,3:86\n60#1,3:89\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n40#1:86,3\n48#1:89,3\n*E\n"})
@ah5
@e0g(parameters = 2)
public abstract class qz8<Interval extends InterfaceC11771a> {

    /* JADX INFO: renamed from: a */
    public static final int f76365a = 0;

    /* JADX INFO: renamed from: qz8$a */
    @ah5
    public interface InterfaceC11771a {

        /* JADX INFO: renamed from: qz8$a$a */
        public static final class a extends tt8 implements qy6 {

            /* JADX INFO: renamed from: a */
            public static final a f76366a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            @gib
            public final Void invoke(int i) {
                return null;
            }
        }

        @gib
        default qy6<Integer, Object> getKey() {
            return null;
        }

        @yfb
        default qy6<Integer, Object> getType() {
            return a.f76366a;
        }
    }

    @gib
    public final Object getContentType(int i) {
        wc8.C14548a<Interval> c14548a = getIntervals().get(i);
        return c14548a.getValue().getType().invoke(Integer.valueOf(i - c14548a.getStartIndex()));
    }

    @yfb
    public abstract wc8<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    @yfb
    public final Object getKey(int i) {
        Object objInvoke;
        wc8.C14548a<Interval> c14548a = getIntervals().get(i);
        int startIndex = i - c14548a.getStartIndex();
        qy6<Integer, Object> key = c14548a.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? C0663e.getDefaultLazyLayoutKey(i) : objInvoke;
    }

    public final <T> T withInterval(int i, @yfb gz6<? super Integer, ? super Interval, ? extends T> gz6Var) {
        wc8.C14548a<Interval> c14548a = getIntervals().get(i);
        return gz6Var.invoke(Integer.valueOf(i - c14548a.getStartIndex()), c14548a.getValue());
    }
}
