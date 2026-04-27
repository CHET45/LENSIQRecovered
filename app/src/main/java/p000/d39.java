package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class d39 extends AbstractC13839v3<String> implements e39, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final d39 f28332d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final e39 f28333e;

    /* JADX INFO: renamed from: c */
    public final List<Object> f28334c;

    /* JADX INFO: renamed from: d39$a */
    public static class C4595a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final d39 f28335a;

        public C4595a(d39 list) {
            this.f28335a = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28335a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s) {
            this.f28335a.add(index, s);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.f28335a.getByteArray(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            String strRemove = this.f28335a.remove(index);
            ((AbstractList) this).modCount++;
            return d39.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s) {
            Object andReturn = this.f28335a.setAndReturn(index, s);
            ((AbstractList) this).modCount++;
            return d39.asByteArray(andReturn);
        }
    }

    /* JADX INFO: renamed from: d39$b */
    public static class C4596b extends AbstractList<vj1> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final d39 f28336a;

        public C4596b(d39 list) {
            this.f28336a = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28336a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, vj1 s) {
            this.f28336a.add(index, s);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public vj1 get(int index) {
            return this.f28336a.getByteString(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public vj1 remove(int index) {
            String strRemove = this.f28336a.remove(index);
            ((AbstractList) this).modCount++;
            return d39.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public vj1 set(int index, vj1 s) {
            Object andReturn = this.f28336a.setAndReturn(index, s);
            ((AbstractList) this).modCount++;
            return d39.asByteString(andReturn);
        }
    }

    static {
        d39 d39Var = new d39(false);
        f28332d = d39Var;
        f28333e = d39Var;
    }

    public d39() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object o) {
        return o instanceof byte[] ? (byte[]) o : o instanceof String ? w98.toByteArray((String) o) : ((vj1) o).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vj1 asByteString(Object o) {
        return o instanceof vj1 ? (vj1) o : o instanceof String ? vj1.copyFromUtf8((String) o) : vj1.copyFrom((byte[]) o);
    }

    private static String asString(Object o) {
        return o instanceof String ? (String) o : o instanceof vj1 ? ((vj1) o).toStringUtf8() : w98.toStringUtf8((byte[]) o);
    }

    public static d39 emptyList() {
        return f28332d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, vj1 s) {
        m23762a();
        return this.f28334c.set(index, s);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c) {
        return addAll(size(), c);
    }

    @Override // p000.e39
    public boolean addAllByteArray(Collection<byte[]> c) {
        m23762a();
        boolean zAddAll = this.f28334c.addAll(c);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.e39
    public boolean addAllByteString(Collection<? extends vj1> values) {
        m23762a();
        boolean zAddAll = this.f28334c.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.e39
    public List<byte[]> asByteArrayList() {
        return new C4595a(this);
    }

    @Override // p000.vhd
    public List<vj1> asByteStringList() {
        return new C4596b(this);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m23762a();
        this.f28334c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o) {
        return super.equals(o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.e39
    public byte[] getByteArray(int i) {
        Object obj = this.f28334c.get(i);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.f28334c.set(i, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // p000.e39
    public vj1 getByteString(int index) {
        Object obj = this.f28334c.get(index);
        vj1 vj1VarAsByteString = asByteString(obj);
        if (vj1VarAsByteString != obj) {
            this.f28334c.set(index, vj1VarAsByteString);
        }
        return vj1VarAsByteString;
    }

    @Override // p000.e39
    public Object getRaw(int index) {
        return this.f28334c.get(index);
    }

    @Override // p000.e39
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f28334c);
    }

    @Override // p000.e39
    public e39 getUnmodifiableView() {
        return isModifiable() ? new ruh(this) : this;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC13839v3, p000.w98.InterfaceC14504k
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // p000.e39
    public void mergeFrom(e39 other) {
        m23762a();
        for (Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f28334c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f28334c.add(obj);
            }
        }
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c) {
        return super.removeAll(c);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c) {
        return super.retainAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28334c.size();
    }

    private d39(boolean isMutable) {
        super(isMutable);
        this.f28334c = Collections.emptyList();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object e) {
        return super.add(e);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c) {
        m23762a();
        if (c instanceof e39) {
            c = ((e39) c).getUnderlyingElements();
        }
        boolean zAddAll = this.f28334c.addAll(index, c);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        Object obj = this.f28334c.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof vj1) {
            vj1 vj1Var = (vj1) obj;
            String stringUtf8 = vj1Var.toStringUtf8();
            if (vj1Var.isValidUtf8()) {
                this.f28334c.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = w98.toStringUtf8(bArr);
        if (w98.isValidUtf8(bArr)) {
            this.f28334c.set(index, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public d39 mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.f28334c);
        return new d39((ArrayList<Object>) arrayList);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o) {
        return super.remove(o);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public String set(int index, String s) {
        m23762a();
        return asString(this.f28334c.set(index, s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, byte[] s) {
        m23762a();
        return this.f28334c.set(index, s);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, String element) {
        m23762a();
        this.f28334c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public String remove(int index) {
        m23762a();
        Object objRemove = this.f28334c.remove(index);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    public d39(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public d39(e39 from) {
        this.f28334c = new ArrayList(from.size());
        addAll(from);
    }

    @Override // p000.e39
    public void set(int index, vj1 s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, vj1 element) {
        m23762a();
        this.f28334c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.e39
    public void set(int index, byte[] s) {
        setAndReturn(index, s);
    }

    public d39(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private d39(ArrayList<Object> list) {
        this.f28334c = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        m23762a();
        this.f28334c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.e39
    public void add(vj1 element) {
        m23762a();
        this.f28334c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.e39
    public void add(byte[] element) {
        m23762a();
        this.f28334c.add(element);
        ((AbstractList) this).modCount++;
    }
}
