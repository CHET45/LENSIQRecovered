package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class bze {

    /* JADX INFO: renamed from: a */
    public static final int f15376a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f15377b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f15378c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f15379d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f15380e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f15381f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: bze$a */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,22:1\n26#2:23\n*E\n"})
    public static final class C2130a<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6 f15382a;

        public C2130a(gz6 gz6Var) {
            this.f15382a = gz6Var;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return bze.iterator(this.f15382a);
        }
    }

    @jjf(version = "1.3")
    @yfb
    public static <T> Iterator<T> iterator(@yfb @cg1 gz6<? super xye<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        wye wyeVar = new wye();
        wyeVar.setNextStep(od8.createCoroutineUnintercepted(gz6Var, wyeVar, wyeVar));
        return wyeVar;
    }

    @jjf(version = "1.3")
    @yfb
    public static <T> vye<T> sequence(@yfb @cg1 gz6<? super xye<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        return new C2130a(gz6Var);
    }
}
