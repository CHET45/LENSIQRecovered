package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class k0f {

    /* JADX INFO: renamed from: k0f$a */
    public static final class C8158a implements Iterator<f0f>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f52349a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f0f f52350b;

        public C8158a(f0f f0fVar) {
            this.f52350b = f0fVar;
            this.f52349a = f0fVar.getElementsCount();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52349a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public f0f next() {
            f0f f0fVar = this.f52350b;
            int elementsCount = f0fVar.getElementsCount();
            int i = this.f52349a;
            this.f52349a = i - 1;
            return f0fVar.getElementDescriptor(elementsCount - i);
        }
    }

    /* JADX INFO: renamed from: k0f$b */
    public static final class C8159b implements Iterator<String>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f52351a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f0f f52352b;

        public C8159b(f0f f0fVar) {
            this.f52352b = f0fVar;
            this.f52351a = f0fVar.getElementsCount();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52351a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public String next() {
            f0f f0fVar = this.f52352b;
            int elementsCount = f0fVar.getElementsCount();
            int i = this.f52351a;
            this.f52351a = i - 1;
            return f0fVar.getElementName(elementsCount - i);
        }
    }

    /* JADX INFO: renamed from: k0f$c */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n293#2,8:18\n*E\n"})
    public static final class C8160c implements Iterable<f0f>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f0f f52353a;

        public C8160c(f0f f0fVar) {
            this.f52353a = f0fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f0f> iterator() {
            return new C8158a(this.f52353a);
        }
    }

    /* JADX INFO: renamed from: k0f$d */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n309#2,8:18\n*E\n"})
    public static final class C8161d implements Iterable<String>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f0f f52354a;

        public C8161d(f0f f0fVar) {
            this.f52354a = f0fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new C8159b(this.f52354a);
        }
    }

    @yfb
    public static final Iterable<f0f> getElementDescriptors(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return new C8160c(f0fVar);
    }

    @ph5
    public static /* synthetic */ void getElementDescriptors$annotations(f0f f0fVar) {
    }

    @yfb
    public static final Iterable<String> getElementNames(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return new C8161d(f0fVar);
    }

    @ph5
    public static /* synthetic */ void getElementNames$annotations(f0f f0fVar) {
    }
}
