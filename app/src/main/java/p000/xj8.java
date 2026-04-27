package p000;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public class xj8 {

    /* JADX INFO: renamed from: a */
    public final String f98209a;

    /* JADX INFO: renamed from: xj8$a */
    public class C15153a extends xj8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f98210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15153a(xj8 prototype, final String val$nullText) {
            super(prototype, null);
            this.f98210b = val$nullText;
        }

        @Override // p000.xj8
        /* JADX INFO: renamed from: b */
        public CharSequence mo25236b(@wx1 Object part) {
            return part == null ? this.f98210b : xj8.this.mo25236b(part);
        }

        @Override // p000.xj8
        public xj8 skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // p000.xj8
        public xj8 useForNull(String nullText) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: renamed from: xj8$b */
    public class C15154b extends xj8 {
        public C15154b(xj8 prototype) {
            super(prototype, null);
        }

        @Override // p000.xj8
        public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Object> parts) throws IOException {
            v7d.checkNotNull(appendable, "appendable");
            v7d.checkNotNull(parts, "parts");
            while (true) {
                if (!parts.hasNext()) {
                    break;
                }
                Object next = parts.next();
                if (next != null) {
                    appendable.append(xj8.this.mo25236b(next));
                    break;
                }
            }
            while (parts.hasNext()) {
                Object next2 = parts.next();
                if (next2 != null) {
                    appendable.append(xj8.this.f98209a);
                    appendable.append(xj8.this.mo25236b(next2));
                }
            }
            return appendable;
        }

        @Override // p000.xj8
        public xj8 useForNull(String nullText) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // p000.xj8
        public C15156d withKeyValueSeparator(String kvs) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* JADX INFO: renamed from: xj8$c */
    public class C15155c extends AbstractList<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f98213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f98214b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f98215c;

        public C15155c(final Object[] val$rest, final Object val$first, final Object val$second) {
            this.f98213a = val$rest;
            this.f98214b = val$first;
            this.f98215c = val$second;
        }

        @Override // java.util.AbstractList, java.util.List
        @wx1
        public Object get(int index) {
            return index != 0 ? index != 1 ? this.f98213a[index - 2] : this.f98215c : this.f98214b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f98213a.length + 2;
        }
    }

    /* JADX INFO: renamed from: xj8$d */
    public static final class C15156d {

        /* JADX INFO: renamed from: a */
        public final xj8 f98216a;

        /* JADX INFO: renamed from: b */
        public final String f98217b;

        public /* synthetic */ C15156d(xj8 xj8Var, String str, C15153a c15153a) {
            this(xj8Var, str);
        }

        @op1
        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            return (A) appendTo(a, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public C15156d useForNull(String nullText) {
            return new C15156d(this.f98216a.useForNull(nullText), this.f98217b);
        }

        private C15156d(xj8 joiner, String keyValueSeparator) {
            this.f98216a = joiner;
            this.f98217b = (String) v7d.checkNotNull(keyValueSeparator);
        }

        @op1
        public StringBuilder appendTo(StringBuilder builder, Map<?, ?> map) {
            return appendTo(builder, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> entries) {
            return join(entries.iterator());
        }

        @op1
        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> entries) {
            return appendTo(new StringBuilder(), entries).toString();
        }

        @op1
        public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Map.Entry<?, ?>> parts) throws IOException {
            v7d.checkNotNull(appendable);
            if (parts.hasNext()) {
                Map.Entry<?, ?> next = parts.next();
                appendable.append(this.f98216a.mo25236b(next.getKey()));
                appendable.append(this.f98217b);
                appendable.append(this.f98216a.mo25236b(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.f98216a.f98209a);
                    Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.f98216a.mo25236b(next2.getKey()));
                    appendable.append(this.f98217b);
                    appendable.append(this.f98216a.mo25236b(next2.getValue()));
                }
            }
            return appendable;
        }

        @op1
        public StringBuilder appendTo(StringBuilder builder, Iterable<? extends Map.Entry<?, ?>> entries) {
            return appendTo(builder, entries.iterator());
        }

        @op1
        public StringBuilder appendTo(StringBuilder builder, Iterator<? extends Map.Entry<?, ?>> entries) {
            try {
                appendTo(builder, entries);
                return builder;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public /* synthetic */ xj8(xj8 xj8Var, C15153a c15153a) {
        this(xj8Var);
    }

    private static Iterable<Object> iterable(@wx1 Object first, @wx1 Object second, Object[] rest) {
        v7d.checkNotNull(rest);
        return new C15155c(rest, first, second);
    }

    /* JADX INFO: renamed from: on */
    public static xj8 m25235on(String separator) {
        return new xj8(separator);
    }

    @op1
    public <A extends Appendable> A appendTo(A a, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo(a, iterable.iterator());
    }

    /* JADX INFO: renamed from: b */
    public CharSequence mo25236b(@wx1 Object part) {
        Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }

    public final String join(Iterable<? extends Object> parts) {
        return join(parts.iterator());
    }

    public xj8 skipNulls() {
        return new C15154b(this);
    }

    public xj8 useForNull(String nullText) {
        v7d.checkNotNull(nullText);
        return new C15153a(this, nullText);
    }

    public C15156d withKeyValueSeparator(char keyValueSeparator) {
        return withKeyValueSeparator(String.valueOf(keyValueSeparator));
    }

    private xj8(String separator) {
        this.f98209a = (String) v7d.checkNotNull(separator);
    }

    /* JADX INFO: renamed from: on */
    public static xj8 m25234on(char separator) {
        return new xj8(String.valueOf(separator));
    }

    @op1
    public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Object> parts) throws IOException {
        v7d.checkNotNull(appendable);
        if (parts.hasNext()) {
            appendable.append(mo25236b(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.f98209a);
                appendable.append(mo25236b(parts.next()));
            }
        }
        return appendable;
    }

    public final String join(Iterator<? extends Object> parts) {
        return appendTo(new StringBuilder(), parts).toString();
    }

    public C15156d withKeyValueSeparator(String keyValueSeparator) {
        return new C15156d(this, keyValueSeparator, null);
    }

    public final String join(Object[] parts) {
        return join(Arrays.asList(parts));
    }

    private xj8(xj8 prototype) {
        this.f98209a = prototype.f98209a;
    }

    public final String join(@wx1 Object first, @wx1 Object second, Object... rest) {
        return join(iterable(first, second, rest));
    }

    @op1
    public final <A extends Appendable> A appendTo(A a, Object[] objArr) throws IOException {
        return (A) appendTo(a, Arrays.asList(objArr));
    }

    @op1
    public final <A extends Appendable> A appendTo(A a, @wx1 Object obj, @wx1 Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a, iterable(obj, obj2, objArr));
    }

    @op1
    public final StringBuilder appendTo(StringBuilder builder, Iterable<? extends Object> parts) {
        return appendTo(builder, parts.iterator());
    }

    @op1
    public final StringBuilder appendTo(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            appendTo(builder, parts);
            return builder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @op1
    public final StringBuilder appendTo(StringBuilder builder, Object[] parts) {
        return appendTo(builder, (Iterable<? extends Object>) Arrays.asList(parts));
    }

    @op1
    public final StringBuilder appendTo(StringBuilder builder, @wx1 Object first, @wx1 Object second, Object... rest) {
        return appendTo(builder, iterable(first, second, rest));
    }
}
