package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@fgb
public final class fta {

    /* JADX INFO: renamed from: d */
    public static final String f37688d = "-bin";

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f37692h = false;

    /* JADX INFO: renamed from: a */
    public Object[] f37693a;

    /* JADX INFO: renamed from: b */
    public int f37694b;

    /* JADX INFO: renamed from: c */
    public static final Logger f37687c = Logger.getLogger(fta.class.getName());

    /* JADX INFO: renamed from: e */
    public static final InterfaceC5969g<byte[]> f37689e = new C5964b();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC5967e<String> f37690f = new C5965c();

    /* JADX INFO: renamed from: g */
    public static final br0 f37691g = br0.base64().omitPadding();

    /* JADX INFO: renamed from: fta$a */
    public final class C5963a<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a */
        public final AbstractC5971i<T> f37695a;

        /* JADX INFO: renamed from: b */
        public int f37696b;

        /* JADX INFO: renamed from: fta$a$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f37698a = true;

            /* JADX INFO: renamed from: b */
            public int f37699b;

            public a() {
                this.f37699b = C5963a.this.f37696b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f37698a) {
                    return true;
                }
                while (this.f37699b < fta.this.f37694b) {
                    C5963a c5963a = C5963a.this;
                    if (fta.this.bytesEqual(c5963a.f37695a.m11177a(), fta.this.name(this.f37699b))) {
                        this.f37698a = true;
                        return true;
                    }
                    this.f37699b++;
                }
                return false;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f37698a = false;
                C5963a c5963a = C5963a.this;
                fta ftaVar = fta.this;
                int i = this.f37699b;
                this.f37699b = i + 1;
                return (T) ftaVar.valueAsT(i, c5963a.f37695a);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public /* synthetic */ C5963a(fta ftaVar, AbstractC5971i abstractC5971i, int i, C5964b c5964b) {
            this(abstractC5971i, i);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new a();
        }

        private C5963a(AbstractC5971i<T> abstractC5971i, int i) {
            this.f37695a = abstractC5971i;
            this.f37696b = i;
        }
    }

    /* JADX INFO: renamed from: fta$b */
    public class C5964b implements InterfaceC5969g<byte[]> {
        @Override // p000.fta.InterfaceC5969g
        public byte[] parseBytes(byte[] bArr) {
            return bArr;
        }

        @Override // p000.fta.InterfaceC5969g
        public byte[] toBytes(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: fta$c */
    public class C5965c implements InterfaceC5967e<String> {
        @Override // p000.fta.InterfaceC5967e
        public String parseAsciiString(String str) {
            return str;
        }

        @Override // p000.fta.InterfaceC5967e
        public String toAsciiString(String str) {
            return str;
        }
    }

    /* JADX INFO: renamed from: fta$d */
    public static class C5966d<T> extends AbstractC5971i<T> {

        /* JADX INFO: renamed from: f */
        public final InterfaceC5967e<T> f37701f;

        public /* synthetic */ C5966d(String str, boolean z, InterfaceC5967e interfaceC5967e, C5964b c5964b) {
            this(str, z, interfaceC5967e);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: e */
        public T mo11170e(byte[] bArr) {
            return this.f37701f.parseAsciiString(new String(bArr, yw1.f103174a));
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: g */
        public byte[] mo11171g(T t) {
            return ((String) v7d.checkNotNull(this.f37701f.toAsciiString(t), "null marshaller.toAsciiString()")).getBytes(yw1.f103174a);
        }

        private C5966d(String str, boolean z, InterfaceC5967e<T> interfaceC5967e) {
            super(str, z, interfaceC5967e, null);
            v7d.checkArgument(!str.endsWith(fta.f37688d), "ASCII header is named %s.  Only binary headers may end with %s", str, fta.f37688d);
            this.f37701f = (InterfaceC5967e) v7d.checkNotNull(interfaceC5967e, "marshaller");
        }
    }

    /* JADX INFO: renamed from: fta$e */
    public interface InterfaceC5967e<T> {
        T parseAsciiString(String str);

        String toAsciiString(T t);
    }

    /* JADX INFO: renamed from: fta$f */
    public static class C5968f<T> extends AbstractC5971i<T> {

        /* JADX INFO: renamed from: f */
        public final InterfaceC5969g<T> f37702f;

        public /* synthetic */ C5968f(String str, InterfaceC5969g interfaceC5969g, C5964b c5964b) {
            this(str, interfaceC5969g);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: e */
        public T mo11170e(byte[] bArr) {
            return this.f37702f.parseBytes(bArr);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: g */
        public byte[] mo11171g(T t) {
            return (byte[]) v7d.checkNotNull(this.f37702f.toBytes(t), "null marshaller.toBytes()");
        }

        private C5968f(String str, InterfaceC5969g<T> interfaceC5969g) {
            super(str, false, interfaceC5969g, null);
            v7d.checkArgument(str.endsWith(fta.f37688d), "Binary header is named %s. It must end with %s", str, fta.f37688d);
            v7d.checkArgument(str.length() > 4, "empty key name");
            this.f37702f = (InterfaceC5969g) v7d.checkNotNull(interfaceC5969g, "marshaller is null");
        }
    }

    /* JADX INFO: renamed from: fta$g */
    public interface InterfaceC5969g<T> {
        T parseBytes(byte[] bArr);

        byte[] toBytes(T t);
    }

    /* JADX INFO: renamed from: fta$h */
    @lg5("https://github.com/grpc/grpc-java/issues/6575")
    public interface InterfaceC5970h<T> {
        T parseStream(InputStream inputStream);

        InputStream toStream(T t);
    }

    /* JADX INFO: renamed from: fta$i */
    @uw7
    public static abstract class AbstractC5971i<T> {

        /* JADX INFO: renamed from: e */
        public static final BitSet f37703e = generateValidTChars();

        /* JADX INFO: renamed from: a */
        public final String f37704a;

        /* JADX INFO: renamed from: b */
        public final String f37705b;

        /* JADX INFO: renamed from: c */
        public final byte[] f37706c;

        /* JADX INFO: renamed from: d */
        public final Object f37707d;

        public /* synthetic */ AbstractC5971i(String str, boolean z, Object obj, C5964b c5964b) {
            this(str, z, obj);
        }

        /* JADX INFO: renamed from: c */
        public static <T> AbstractC5971i<T> m11172c(String str, boolean z, InterfaceC5967e<T> interfaceC5967e) {
            return new C5966d(str, z, interfaceC5967e, null);
        }

        /* JADX INFO: renamed from: d */
        public static <T> AbstractC5971i<T> m11173d(String str, boolean z, InterfaceC5975m<T> interfaceC5975m) {
            return new C5974l(str, z, interfaceC5975m, null);
        }

        private static BitSet generateValidTChars() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = sjc.f82029s; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* JADX INFO: renamed from: of */
        public static <T> AbstractC5971i<T> m11175of(String str, InterfaceC5969g<T> interfaceC5969g) {
            return new C5968f(str, interfaceC5969g, null);
        }

        private static String validateName(String str, boolean z) {
            v7d.checkNotNull(str, "name");
            v7d.checkArgument(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                fta.f37687c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!z || cCharAt != ':' || i != 0) {
                    v7d.checkArgument(f37703e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, (Object) str);
                }
            }
            return str;
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public byte[] m11177a() {
            return this.f37706c;
        }

        @eib
        /* JADX INFO: renamed from: b */
        public final <M> M m11178b(Class<M> cls) {
            if (cls.isInstance(this.f37707d)) {
                return cls.cast(this.f37707d);
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public abstract T mo11170e(byte[] bArr);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f37705b.equals(((AbstractC5971i) obj).f37705b);
        }

        /* JADX INFO: renamed from: f */
        public boolean mo11179f() {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public abstract byte[] mo11171g(T t);

        public final int hashCode() {
            return this.f37705b.hashCode();
        }

        public final String name() {
            return this.f37705b;
        }

        public final String originalName() {
            return this.f37704a;
        }

        public String toString() {
            return "Key{name='" + this.f37705b + "'}";
        }

        private AbstractC5971i(String str, boolean z, Object obj) {
            String str2 = (String) v7d.checkNotNull(str, "name");
            this.f37704a = str2;
            String strValidateName = validateName(str2.toLowerCase(Locale.ROOT), z);
            this.f37705b = strValidateName;
            this.f37706c = strValidateName.getBytes(yw1.f103174a);
            this.f37707d = obj;
        }

        @lg5("https://github.com/grpc/grpc-java/issues/6575")
        /* JADX INFO: renamed from: of */
        public static <T> AbstractC5971i<T> m11176of(String str, InterfaceC5970h<T> interfaceC5970h) {
            return new C5972j(str, interfaceC5970h, null);
        }

        /* JADX INFO: renamed from: of */
        public static <T> AbstractC5971i<T> m11174of(String str, InterfaceC5967e<T> interfaceC5967e) {
            return m11172c(str, false, interfaceC5967e);
        }
    }

    /* JADX INFO: renamed from: fta$j */
    public static class C5972j<T> extends AbstractC5971i<T> {

        /* JADX INFO: renamed from: f */
        public final InterfaceC5970h<T> f37708f;

        public /* synthetic */ C5972j(String str, InterfaceC5970h interfaceC5970h, C5964b c5964b) {
            this(str, interfaceC5970h);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: e */
        public T mo11170e(byte[] bArr) {
            return this.f37708f.parseStream(new ByteArrayInputStream(bArr));
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: f */
        public boolean mo11179f() {
            return true;
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: g */
        public byte[] mo11171g(T t) {
            return fta.streamToBytes((InputStream) v7d.checkNotNull(this.f37708f.toStream(t), "null marshaller.toStream()"));
        }

        private C5972j(String str, InterfaceC5970h<T> interfaceC5970h) {
            super(str, false, interfaceC5970h, null);
            v7d.checkArgument(str.endsWith(fta.f37688d), "Binary header is named %s. It must end with %s", str, fta.f37688d);
            v7d.checkArgument(str.length() > 4, "empty key name");
            this.f37708f = (InterfaceC5970h) v7d.checkNotNull(interfaceC5970h, "marshaller is null");
        }
    }

    /* JADX INFO: renamed from: fta$k */
    public static final class C5973k<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5970h<T> f37709a;

        /* JADX INFO: renamed from: b */
        public final T f37710b;

        /* JADX INFO: renamed from: c */
        public volatile byte[] f37711c;

        public C5973k(InterfaceC5970h<T> interfaceC5970h, T t) {
            this.f37709a = interfaceC5970h;
            this.f37710b = t;
        }

        /* JADX INFO: renamed from: a */
        public static <T> C5973k<T> m11180a(AbstractC5971i<T> abstractC5971i, T t) {
            return new C5973k<>((InterfaceC5970h) v7d.checkNotNull(getBinaryStreamMarshaller(abstractC5971i)), t);
        }

        @eib
        private static <T> InterfaceC5970h<T> getBinaryStreamMarshaller(AbstractC5971i<T> abstractC5971i) {
            return (InterfaceC5970h) abstractC5971i.m11178b(InterfaceC5970h.class);
        }

        /* JADX INFO: renamed from: b */
        public byte[] m11181b() {
            if (this.f37711c == null) {
                synchronized (this) {
                    try {
                        if (this.f37711c == null) {
                            this.f37711c = fta.streamToBytes(m11183d());
                        }
                    } finally {
                    }
                }
            }
            return this.f37711c;
        }

        /* JADX INFO: renamed from: c */
        public <T2> T2 m11182c(AbstractC5971i<T2> abstractC5971i) {
            InterfaceC5970h binaryStreamMarshaller;
            return (!abstractC5971i.mo11179f() || (binaryStreamMarshaller = getBinaryStreamMarshaller(abstractC5971i)) == null) ? abstractC5971i.mo11170e(m11181b()) : (T2) binaryStreamMarshaller.parseStream(m11183d());
        }

        /* JADX INFO: renamed from: d */
        public InputStream m11183d() {
            return (InputStream) v7d.checkNotNull(this.f37709a.toStream(this.f37710b), "null marshaller.toStream()");
        }
    }

    /* JADX INFO: renamed from: fta$l */
    public static final class C5974l<T> extends AbstractC5971i<T> {

        /* JADX INFO: renamed from: f */
        public final InterfaceC5975m<T> f37712f;

        public /* synthetic */ C5974l(String str, boolean z, InterfaceC5975m interfaceC5975m, C5964b c5964b) {
            this(str, z, interfaceC5975m);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: e */
        public T mo11170e(byte[] bArr) {
            return this.f37712f.parseAsciiString(bArr);
        }

        @Override // p000.fta.AbstractC5971i
        /* JADX INFO: renamed from: g */
        public byte[] mo11171g(T t) {
            return (byte[]) v7d.checkNotNull(this.f37712f.toAsciiString(t), "null marshaller.toAsciiString()");
        }

        private C5974l(String str, boolean z, InterfaceC5975m<T> interfaceC5975m) {
            super(str, z, interfaceC5975m, null);
            v7d.checkArgument(!str.endsWith(fta.f37688d), "ASCII header is named %s.  Only binary headers may end with %s", str, fta.f37688d);
            this.f37712f = (InterfaceC5975m) v7d.checkNotNull(interfaceC5975m, "marshaller");
        }
    }

    /* JADX INFO: renamed from: fta$m */
    @uw7
    public interface InterfaceC5975m<T> {
        T parseAsciiString(byte[] bArr);

        byte[] toAsciiString(T t);
    }

    public fta(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bytesEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int cap() {
        Object[] objArr = this.f37693a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void expand(int i) {
        Object[] objArr = new Object[i];
        if (!isEmpty()) {
            System.arraycopy(this.f37693a, 0, objArr, 0, len());
        }
        this.f37693a = objArr;
    }

    private boolean isEmpty() {
        return this.f37694b == 0;
    }

    private int len() {
        return this.f37694b * 2;
    }

    private void maybeExpand() {
        if (len() == 0 || len() == cap()) {
            expand(Math.max(len() * 2, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] name(int i) {
        return (byte[]) this.f37693a[i * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] streamToBytes(InputStream inputStream) {
        try {
            return tj1.toByteArray(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private Object value(int i) {
        return this.f37693a[(i * 2) + 1];
    }

    private byte[] valueAsBytes(int i) {
        Object objValue = value(i);
        return objValue instanceof byte[] ? (byte[]) objValue : ((C5973k) objValue).m11181b();
    }

    private Object valueAsBytesOrStream(int i) {
        Object objValue = value(i);
        return objValue instanceof byte[] ? objValue : ((C5973k) objValue).m11183d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T valueAsT(int i, AbstractC5971i<T> abstractC5971i) {
        Object objValue = value(i);
        return objValue instanceof byte[] ? abstractC5971i.mo11170e((byte[]) objValue) : (T) ((C5973k) objValue).m11182c(abstractC5971i);
    }

    public boolean containsKey(AbstractC5971i<?> abstractC5971i) {
        for (int i = 0; i < this.f37694b; i++) {
            if (bytesEqual(abstractC5971i.m11177a(), name(i))) {
                return true;
            }
        }
        return false;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4691")
    public <T> void discardAll(AbstractC5971i<T> abstractC5971i) {
        if (isEmpty()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f37694b; i2++) {
            if (!bytesEqual(abstractC5971i.m11177a(), name(i2))) {
                name(i, name(i2));
                value(i, value(i2));
                i++;
            }
        }
        Arrays.fill(this.f37693a, i * 2, len(), (Object) null);
        this.f37694b = i;
    }

    /* JADX INFO: renamed from: g */
    public int m11165g() {
        return this.f37694b;
    }

    @eib
    public <T> T get(AbstractC5971i<T> abstractC5971i) {
        for (int i = this.f37694b - 1; i >= 0; i--) {
            if (bytesEqual(abstractC5971i.m11177a(), name(i))) {
                return (T) valueAsT(i, abstractC5971i);
            }
        }
        return null;
    }

    @eib
    public <T> Iterable<T> getAll(AbstractC5971i<T> abstractC5971i) {
        int i = 0;
        while (true) {
            C5964b c5964b = null;
            if (i >= this.f37694b) {
                return null;
            }
            if (bytesEqual(abstractC5971i.m11177a(), name(i))) {
                return new C5963a(this, abstractC5971i, i, c5964b);
            }
            i++;
        }
    }

    @eib
    /* JADX INFO: renamed from: h */
    public byte[][] m11166h() {
        byte[][] bArr = new byte[len()][];
        Object[] objArr = this.f37693a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, len());
        } else {
            for (int i = 0; i < this.f37694b; i++) {
                int i2 = i * 2;
                bArr[i2] = name(i);
                bArr[i2 + 1] = valueAsBytes(i);
            }
        }
        return bArr;
    }

    @eib
    /* JADX INFO: renamed from: i */
    public Object[] m11167i() {
        Object[] objArr = new Object[len()];
        for (int i = 0; i < this.f37694b; i++) {
            int i2 = i * 2;
            objArr[i2] = name(i);
            objArr[i2 + 1] = valueAsBytesOrStream(i);
        }
        return objArr;
    }

    public Set<String> keys() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f37694b);
        for (int i = 0; i < this.f37694b; i++) {
            hashSet.add(new String(name(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void merge(fta ftaVar) {
        if (ftaVar.isEmpty()) {
            return;
        }
        int iCap = cap() - len();
        if (isEmpty() || iCap < ftaVar.len()) {
            expand(len() + ftaVar.len());
        }
        System.arraycopy(ftaVar.f37693a, 0, this.f37693a, len(), ftaVar.len());
        this.f37694b += ftaVar.f37694b;
    }

    public <T> void put(AbstractC5971i<T> abstractC5971i, T t) {
        v7d.checkNotNull(abstractC5971i, "key");
        v7d.checkNotNull(t, "value");
        maybeExpand();
        name(this.f37694b, abstractC5971i.m11177a());
        if (abstractC5971i.mo11179f()) {
            value(this.f37694b, C5973k.m11180a(abstractC5971i, t));
        } else {
            value(this.f37694b, abstractC5971i.mo11171g(t));
        }
        this.f37694b++;
    }

    public <T> boolean remove(AbstractC5971i<T> abstractC5971i, T t) {
        v7d.checkNotNull(abstractC5971i, "key");
        v7d.checkNotNull(t, "value");
        for (int i = 0; i < this.f37694b; i++) {
            if (bytesEqual(abstractC5971i.m11177a(), name(i)) && t.equals(valueAsT(i, abstractC5971i))) {
                int i2 = i * 2;
                int i3 = (i + 1) * 2;
                int iLen = len() - i3;
                Object[] objArr = this.f37693a;
                System.arraycopy(objArr, i3, objArr, i2, iLen);
                int i4 = this.f37694b - 1;
                this.f37694b = i4;
                name(i4, null);
                value(this.f37694b, (byte[]) null);
                return true;
            }
        }
        return false;
    }

    public <T> Iterable<T> removeAll(AbstractC5971i<T> abstractC5971i) {
        if (isEmpty()) {
            return null;
        }
        int i = 0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < this.f37694b; i2++) {
            if (bytesEqual(abstractC5971i.m11177a(), name(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(valueAsT(i2, abstractC5971i));
            } else {
                name(i, name(i2));
                value(i, value(i2));
                i++;
            }
        }
        Arrays.fill(this.f37693a, i * 2, len(), (Object) null);
        this.f37694b = i;
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f37694b; i++) {
            if (i != 0) {
                sb.append(C4584d2.f28238g);
            }
            byte[] bArrName = name(i);
            Charset charset = yw1.f103174a;
            String str = new String(bArrName, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith(f37688d)) {
                sb.append(f37691g.encode(valueAsBytes(i)));
            } else {
                sb.append(new String(valueAsBytes(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public fta(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    private void name(int i, byte[] bArr) {
        this.f37693a[i * 2] = bArr;
    }

    private void value(int i, byte[] bArr) {
        this.f37693a[(i * 2) + 1] = bArr;
    }

    public fta(int i, Object[] objArr) {
        this.f37694b = i;
        this.f37693a = objArr;
    }

    private void value(int i, Object obj) {
        if (this.f37693a instanceof byte[][]) {
            expand(cap());
        }
        this.f37693a[(i * 2) + 1] = obj;
    }

    public fta() {
    }

    public void merge(fta ftaVar, Set<AbstractC5971i<?>> set) {
        v7d.checkNotNull(ftaVar, "other");
        HashMap map = new HashMap(set.size());
        for (AbstractC5971i<?> abstractC5971i : set) {
            map.put(ByteBuffer.wrap(abstractC5971i.m11177a()), abstractC5971i);
        }
        for (int i = 0; i < ftaVar.f37694b; i++) {
            if (map.containsKey(ByteBuffer.wrap(ftaVar.name(i)))) {
                maybeExpand();
                name(this.f37694b, ftaVar.name(i));
                value(this.f37694b, ftaVar.value(i));
                this.f37694b++;
            }
        }
    }
}
