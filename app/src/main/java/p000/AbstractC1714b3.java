package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.AbstractC1714b3;
import p000.AbstractC1714b3.a;
import p000.qsa;
import p000.vj1;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1714b3<MessageType extends AbstractC1714b3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements qsa {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: b3$b */
    public interface b {
        int getNumber();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static <T> void m2855a(final Iterable<T> values, final Collection<? super T> list) {
        a.m2863b(values, (List) list);
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m2856b(final Iterable<T> values, final List<? super T> list) {
        a.m2863b(values, list);
    }

    /* JADX INFO: renamed from: c */
    public static void m2857c(vj1 byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: d */
    public int mo2858d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public int mo2859e(tpe schema) {
        int iMo2858d = mo2858d();
        if (iMo2858d != -1) {
            return iMo2858d;
        }
        int serializedSize = schema.getSerializedSize(this);
        mo2861g(serializedSize);
        return serializedSize;
    }

    /* JADX INFO: renamed from: f */
    public ssh m2860f() {
        return new ssh(this);
    }

    /* JADX INFO: renamed from: g */
    public void mo2861g(int size) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.qsa
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            j72 j72VarNewInstance = j72.newInstance(bArr);
            writeTo(j72VarNewInstance);
            j72VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // p000.qsa
    public vj1 toByteString() {
        try {
            vj1.C14110h c14110hM24016g = vj1.m24016g(getSerializedSize());
            writeTo(c14110hM24016g.getCodedOutput());
            return c14110hM24016g.build();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // p000.qsa
    public void writeDelimitedTo(final OutputStream output) throws IOException {
        int serializedSize = getSerializedSize();
        j72 j72VarNewInstance = j72.newInstance(output, j72.m13761g(j72.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        j72VarNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(j72VarNewInstance);
        j72VarNewInstance.flush();
    }

    @Override // p000.qsa
    public void writeTo(final OutputStream output) throws IOException {
        j72 j72VarNewInstance = j72.newInstance(output, j72.m13761g(getSerializedSize()));
        writeTo(j72VarNewInstance);
        j72VarNewInstance.flush();
    }

    /* JADX INFO: renamed from: b3$a */
    public static abstract class a<MessageType extends AbstractC1714b3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements qsa.InterfaceC11668a {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public static <T> void m2862a(final Iterable<T> values, final Collection<? super T> list) {
            m2863b(values, (List) list);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> values, List<? super T> list) {
            if ((list instanceof ArrayList) && (values instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) values).size());
            }
            int size = list.size();
            for (T t : values) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> void m2863b(final Iterable<T> values, final List<? super T> list) {
            w98.m24432a(values);
            if (!(values instanceof e39)) {
                if (values instanceof kbd) {
                    list.addAll((Collection) values);
                    return;
                } else {
                    addAllCheckingNulls(values, list);
                    return;
                }
            }
            List<?> underlyingElements = ((e39) values).getUnderlyingElements();
            e39 e39Var = (e39) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (e39Var.size() - size) + " is null.";
                    for (int size2 = e39Var.size() - 1; size2 >= size; size2--) {
                        e39Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof vj1) {
                    e39Var.add((vj1) obj);
                } else {
                    e39Var.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static ssh m2864d(qsa message) {
            return new ssh(message);
        }

        private String getReadingExceptionMessage(String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        /* JADX INFO: renamed from: c */
        public abstract BuilderType mo2865c(MessageType message);

        @Override // p000.qsa.InterfaceC11668a
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo27946clone();

        @Override // p000.qsa.InterfaceC11668a
        public boolean mergeDelimitedFrom(final InputStream input, final zi5 extensionRegistry) throws IOException {
            int i = input.read();
            if (i == -1) {
                return false;
            }
            mergeFrom((InputStream) new C16409a(input, f72.readRawVarint32(i, input)), extensionRegistry);
            return true;
        }

        @Override // p000.qsa.InterfaceC11668a
        public abstract BuilderType mergeFrom(final f72 input, final zi5 extensionRegistry) throws IOException;

        /* JADX INFO: renamed from: b3$a$a, reason: collision with other inner class name */
        public static final class C16409a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f12514a;

            public C16409a(InputStream in, int limit) {
                super(in);
                this.f12514a = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f12514a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f12514a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f12514a--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n) throws IOException {
                int iSkip = (int) super.skip(Math.min(n, this.f12514a));
                if (iSkip >= 0) {
                    this.f12514a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b, final int off, int len) throws IOException {
                int i = this.f12514a;
                if (i <= 0) {
                    return -1;
                }
                int i2 = super.read(b, off, Math.min(len, i));
                if (i2 >= 0) {
                    this.f12514a -= i2;
                }
                return i2;
            }
        }

        @Override // p000.qsa.InterfaceC11668a
        public boolean mergeDelimitedFrom(final InputStream input) throws IOException {
            return mergeDelimitedFrom(input, zi5.getEmptyRegistry());
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(f72 f72Var) throws IOException {
            return (BuilderType) mergeFrom(f72Var, zi5.getEmptyRegistry());
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final vj1 data) throws ce8 {
            try {
                f72 f72VarNewCodedInput = data.newCodedInput();
                mergeFrom(f72VarNewCodedInput);
                f72VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (ce8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final vj1 data, final zi5 extensionRegistry) throws ce8 {
            try {
                f72 f72VarNewCodedInput = data.newCodedInput();
                mergeFrom(f72VarNewCodedInput, extensionRegistry);
                f72VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (ce8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(byte[] bArr) throws ce8 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final byte[] data, final int off, final int len) throws ce8 {
            try {
                f72 f72VarNewInstance = f72.newInstance(data, off, len);
                mergeFrom(f72VarNewInstance);
                f72VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (ce8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, zi5Var);
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final byte[] data, final int off, final int len, final zi5 extensionRegistry) throws ce8 {
            try {
                f72 f72VarNewInstance = f72.newInstance(data, off, len);
                mergeFrom(f72VarNewInstance, extensionRegistry);
                f72VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (ce8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final InputStream input) throws IOException {
            f72 f72VarNewInstance = f72.newInstance(input);
            mergeFrom(f72VarNewInstance);
            f72VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(final InputStream input, final zi5 extensionRegistry) throws IOException {
            f72 f72VarNewInstance = f72.newInstance(input);
            mergeFrom(f72VarNewInstance, extensionRegistry);
            f72VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(qsa qsaVar) {
            if (getDefaultInstanceForType().getClass().isInstance(qsaVar)) {
                return (BuilderType) mo2865c((AbstractC1714b3) qsaVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}
