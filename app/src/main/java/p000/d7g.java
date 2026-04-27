package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "StreamsKt")
public final class d7g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d7g$a */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n31#2:23\n*E\n"})
    public static final class C4659a<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Stream f28713a;

        public C4659a(Stream stream) {
            this.f28713a = stream;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            Iterator<T> it = this.f28713a.iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: d7g$b */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n39#2:23\n*E\n"})
    public static final class C4660b implements vye<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IntStream f28714a;

        public C4660b(IntStream intStream) {
            this.f28714a = intStream;
        }

        @Override // p000.vye
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f28714a.iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: d7g$c */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n47#2:23\n*E\n"})
    public static final class C4661c implements vye<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LongStream f28715a;

        public C4661c(LongStream longStream) {
            this.f28715a = longStream;
        }

        @Override // p000.vye
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f28715a.iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: d7g$d */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n55#2:23\n*E\n"})
    public static final class C4662d implements vye<Double> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DoubleStream f28716a;

        public C4662d(DoubleStream doubleStream) {
            this.f28716a = doubleStream;
        }

        @Override // p000.vye
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f28716a.iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            return it;
        }
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> vye<T> asSequence(@yfb Stream<T> stream) {
        md8.checkNotNullParameter(stream, "<this>");
        return new C4659a(stream);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> Stream<T> asStream(@yfb final vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: c7g
            @Override // java.util.function.Supplier
            public final Object get() {
                return d7g.asStream$lambda$4(vyeVar);
            }
        }, 16, false);
        md8.checkNotNullExpressionValue(stream, "stream(...)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator asStream$lambda$4(vye vyeVar) {
        return Spliterators.spliteratorUnknownSize(vyeVar.iterator(), 16);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> List<T> toList(@yfb Stream<T> stream) {
        md8.checkNotNullParameter(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        md8.checkNotNullExpressionValue(objCollect, "collect(...)");
        return (List) objCollect;
    }

    @jjf(version = "1.2")
    @yfb
    public static final vye<Integer> asSequence(@yfb IntStream intStream) {
        md8.checkNotNullParameter(intStream, "<this>");
        return new C4660b(intStream);
    }

    @jjf(version = "1.2")
    @yfb
    public static final List<Integer> toList(@yfb IntStream intStream) {
        md8.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        md8.checkNotNullExpressionValue(array, "toArray(...)");
        return u70.asList(array);
    }

    @jjf(version = "1.2")
    @yfb
    public static final vye<Long> asSequence(@yfb LongStream longStream) {
        md8.checkNotNullParameter(longStream, "<this>");
        return new C4661c(longStream);
    }

    @jjf(version = "1.2")
    @yfb
    public static final List<Long> toList(@yfb LongStream longStream) {
        md8.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        md8.checkNotNullExpressionValue(array, "toArray(...)");
        return u70.asList(array);
    }

    @jjf(version = "1.2")
    @yfb
    public static final vye<Double> asSequence(@yfb DoubleStream doubleStream) {
        md8.checkNotNullParameter(doubleStream, "<this>");
        return new C4662d(doubleStream);
    }

    @jjf(version = "1.2")
    @yfb
    public static final List<Double> toList(@yfb DoubleStream doubleStream) {
        md8.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        md8.checkNotNullExpressionValue(array, "toArray(...)");
        return u70.asList(array);
    }
}
