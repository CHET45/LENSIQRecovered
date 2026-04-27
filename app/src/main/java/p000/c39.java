package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class c39 extends AbstractC14369w3<String> implements f39, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final c39 f15686d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final f39 f15687e;

    /* JADX INFO: renamed from: c */
    public final List<Object> f15688c;

    /* JADX INFO: renamed from: c39$a */
    public static class C2182a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final c39 f15689a;

        public C2182a(c39 list) {
            this.f15689a = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f15689a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s) {
            this.f15689a.add(index, s);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.f15689a.getByteArray(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            String strRemove = this.f15689a.remove(index);
            ((AbstractList) this).modCount++;
            return c39.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s) {
            Object andReturn = this.f15689a.setAndReturn(index, s);
            ((AbstractList) this).modCount++;
            return c39.asByteArray(andReturn);
        }
    }

    /* JADX INFO: renamed from: c39$b */
    public static class C2183b extends AbstractList<wj1> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final c39 f15690a;

        public C2183b(c39 list) {
            this.f15690a = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f15690a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, wj1 s) {
            this.f15690a.add(index, s);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public wj1 get(int index) {
            return this.f15690a.getByteString(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public wj1 remove(int index) {
            String strRemove = this.f15690a.remove(index);
            ((AbstractList) this).modCount++;
            return c39.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public wj1 set(int index, wj1 s) {
            Object andReturn = this.f15690a.setAndReturn(index, s);
            ((AbstractList) this).modCount++;
            return c39.asByteString(andReturn);
        }
    }

    static {
        c39 c39Var = new c39(false);
        f15686d = c39Var;
        f15687e = c39Var;
    }

    public c39() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object o) {
        return o instanceof byte[] ? (byte[]) o : o instanceof String ? v98.toByteArray((String) o) : ((wj1) o).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wj1 asByteString(Object o) {
        return o instanceof wj1 ? (wj1) o : o instanceof String ? wj1.copyFromUtf8((String) o) : wj1.copyFrom((byte[]) o);
    }

    private static String asString(Object o) {
        return o instanceof String ? (String) o : o instanceof wj1 ? ((wj1) o).toStringUtf8() : v98.toStringUtf8((byte[]) o);
    }

    public static c39 emptyList() {
        return f15686d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, wj1 s) {
        m24324a();
        return this.f15688c.set(index, s);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c) {
        return addAll(size(), c);
    }

    @Override // p000.f39
    public boolean addAllByteArray(Collection<byte[]> c) {
        m24324a();
        boolean zAddAll = this.f15688c.addAll(c);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.f39
    public boolean addAllByteString(Collection<? extends wj1> values) {
        m24324a();
        boolean zAddAll = this.f15688c.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.f39
    public List<byte[]> asByteArrayList() {
        return new C2182a(this);
    }

    @Override // p000.whd
    public List<wj1> asByteStringList() {
        return new C2183b(this);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m24324a();
        this.f15688c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o) {
        return super.equals(o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f39
    public byte[] getByteArray(int i) {
        Object obj = this.f15688c.get(i);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.f15688c.set(i, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // p000.f39
    public wj1 getByteString(int index) {
        Object obj = this.f15688c.get(index);
        wj1 wj1VarAsByteString = asByteString(obj);
        if (wj1VarAsByteString != obj) {
            this.f15688c.set(index, wj1VarAsByteString);
        }
        return wj1VarAsByteString;
    }

    @Override // p000.f39
    public Object getRaw(int index) {
        return this.f15688c.get(index);
    }

    @Override // p000.f39
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f15688c);
    }

    @Override // p000.f39
    public f39 getUnmodifiableView() {
        return isModifiable() ? new suh(this) : this;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC14369w3, p000.v98.InterfaceC13956l
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // p000.f39
    public void mergeFrom(f39 other) {
        m24324a();
        for (Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f15688c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f15688c.add(obj);
            }
        }
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c) {
        return super.removeAll(c);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c) {
        return super.retainAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15688c.size();
    }

    private c39(boolean isMutable) {
        super(isMutable);
        this.f15688c = Collections.emptyList();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c) {
        m24324a();
        if (c instanceof f39) {
            c = ((f39) c).getUnderlyingElements();
        }
        boolean zAddAll = this.f15688c.addAll(index, c);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        Object obj = this.f15688c.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof wj1) {
            wj1 wj1Var = (wj1) obj;
            String stringUtf8 = wj1Var.toStringUtf8();
            if (wj1Var.isValidUtf8()) {
                this.f15688c.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = v98.toStringUtf8(bArr);
        if (v98.isValidUtf8(bArr)) {
            this.f15688c.set(index, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public c39 mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.f15688c);
        return new c39((ArrayList<Object>) arrayList);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o) {
        return super.remove(o);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public String set(int index, String s) {
        m24324a();
        return asString(this.f15688c.set(index, s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, byte[] s) {
        m24324a();
        return this.f15688c.set(index, s);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, String element) {
        m24324a();
        this.f15688c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public String remove(int index) {
        m24324a();
        Object objRemove = this.f15688c.remove(index);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    public c39(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public c39(f39 from) {
        this.f15688c = new ArrayList(from.size());
        addAll(from);
    }

    @Override // p000.f39
    public void set(int index, wj1 s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, wj1 element) {
        m24324a();
        this.f15688c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.f39
    public void set(int index, byte[] s) {
        setAndReturn(index, s);
    }

    public c39(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private c39(ArrayList<Object> list) {
        this.f15688c = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        m24324a();
        this.f15688c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @qp1
    public boolean add(String element) {
        m24324a();
        this.f15688c.add(element);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.f39
    public void add(wj1 element) {
        m24324a();
        this.f15688c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.f39
    public void add(byte[] element) {
        m24324a();
        this.f15688c.add(element);
        ((AbstractList) this).modCount++;
    }
}
