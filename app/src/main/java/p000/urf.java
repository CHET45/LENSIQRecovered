package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p000.prc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
@e0g(parameters = 0)
public final class urf<E> extends AbstractC11854r3<E> implements jx7<E> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C13670a f88879c = new C13670a(null);

    /* JADX INFO: renamed from: d */
    public static final int f88880d = 8;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final urf f88881e = new urf(new Object[0]);

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object[] f88882b;

    /* JADX INFO: renamed from: urf$a */
    public static final class C13670a {
        public /* synthetic */ C13670a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final urf getEMPTY() {
            return urf.f88881e;
        }

        private C13670a() {
        }
    }

    public urf(@yfb Object[] objArr) {
        this.f88882b = objArr;
        ec2.m28824assert(objArr.length <= 32);
    }

    private final Object[] bufferOfSize(int i) {
        return new Object[i];
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public E get(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        return (E) this.f88882b[i];
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f88882b.length;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public int indexOf(Object obj) {
        return e80.indexOf(this.f88882b, obj);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public int lastIndexOf(Object obj) {
        return e80.lastIndexOf(this.f88882b, obj);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        e99.checkPositionIndex$runtime_release(i, size());
        return new ff1(this.f88882b, i, size());
    }

    @Override // p000.prc
    @yfb
    public prc<E> removeAt(int i) {
        e99.checkElementIndex$runtime_release(i, size());
        if (size() == 1) {
            return f88881e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f88882b, size() - 1);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        u70.copyInto(this.f88882b, objArrCopyOf, i, i + 1, size());
        return new urf(objArrCopyOf);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public prc<E> set(int i, E e) {
        e99.checkElementIndex$runtime_release(i, size());
        Object[] objArr = this.f88882b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = e;
        return new urf(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> add(E e) {
        if (size() >= 32) {
            return new msc(this.f88882b, j1i.presizedBufferWith(e), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f88882b, size() + 1);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = e;
        return new urf(objArrCopyOf);
    }

    @Override // p000.AbstractC11854r3, java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> addAll(@yfb Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            prc.InterfaceC11080a<E> interfaceC11080aBuilder = builder();
            interfaceC11080aBuilder.addAll(collection);
            return interfaceC11080aBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f88882b, size() + collection.size());
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new urf(objArrCopyOf);
    }

    @Override // p000.oqc
    @yfb
    public prc.InterfaceC11080a<E> builder() {
        return new nsc(this, null, this.f88882b, 0);
    }

    @Override // p000.oqc
    @yfb
    public prc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var) {
        Object[] objArrCopyOf = this.f88882b;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.f88882b[i];
            if (qy6Var.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.f88882b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f88881e : new urf(u70.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, p000.prc
    @yfb
    public prc<E> add(int i, E e) {
        e99.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            u70.copyInto$default(this.f88882b, objArrBufferOfSize, 0, 0, i, 6, (Object) null);
            u70.copyInto(this.f88882b, objArrBufferOfSize, i + 1, i, size());
            objArrBufferOfSize[i] = e;
            return new urf(objArrBufferOfSize);
        }
        Object[] objArr = this.f88882b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        u70.copyInto(this.f88882b, objArrCopyOf, i + 1, i, size() - 1);
        objArrCopyOf[i] = e;
        return new msc(objArrCopyOf, j1i.presizedBufferWith(this.f88882b[31]), size() + 1, 0);
    }

    @Override // p000.AbstractC11854r3, java.util.List, p000.prc
    @yfb
    public prc<E> addAll(int i, @yfb Collection<? extends E> collection) {
        e99.checkPositionIndex$runtime_release(i, size());
        if (size() + collection.size() <= 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + collection.size());
            u70.copyInto$default(this.f88882b, objArrBufferOfSize, 0, 0, i, 6, (Object) null);
            u70.copyInto(this.f88882b, objArrBufferOfSize, collection.size() + i, i, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrBufferOfSize[i] = it.next();
                i++;
            }
            return new urf(objArrBufferOfSize);
        }
        prc.InterfaceC11080a<E> interfaceC11080aBuilder = builder();
        interfaceC11080aBuilder.addAll(i, collection);
        return interfaceC11080aBuilder.build();
    }
}
