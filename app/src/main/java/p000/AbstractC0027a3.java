package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.AbstractC0027a3;
import p000.AbstractC0027a3.a;
import p000.psa;
import p000.wj1;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0027a3<MessageType extends AbstractC0027a3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements psa {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: a3$b */
    public interface b {
        int getNumber();
    }

    /* JADX INFO: renamed from: a */
    public static <T> void m80a(final Iterable<T> values, final List<? super T> list) {
        a.m87b(values, list);
    }

    /* JADX INFO: renamed from: b */
    public static void m81b(wj1 byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: c */
    public int mo82c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public int mo83d(upe schema) {
        int iMo82c = mo82c();
        if (iMo82c != -1) {
            return iMo82c;
        }
        int serializedSize = schema.getSerializedSize(this);
        mo85f(serializedSize);
        return serializedSize;
    }

    /* JADX INFO: renamed from: e */
    public tsh m84e() {
        return new tsh(this);
    }

    /* JADX INFO: renamed from: f */
    public void mo85f(int size) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.psa
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            i72 i72VarNewInstance = i72.newInstance(bArr);
            writeTo(i72VarNewInstance);
            i72VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // p000.psa
    public wj1 toByteString() {
        try {
            wj1.C14640h c14640hM24592g = wj1.m24592g(getSerializedSize());
            writeTo(c14640hM24592g.getCodedOutput());
            return c14640hM24592g.build();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // p000.psa
    public void writeDelimitedTo(final OutputStream output) throws IOException {
        int serializedSize = getSerializedSize();
        i72 i72VarNewInstance = i72.newInstance(output, i72.m12829g(i72.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        i72VarNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(i72VarNewInstance);
        i72VarNewInstance.flush();
    }

    @Override // p000.psa
    public void writeTo(final OutputStream output) throws IOException {
        i72 i72VarNewInstance = i72.newInstance(output, i72.m12829g(getSerializedSize()));
        writeTo(i72VarNewInstance);
        i72VarNewInstance.flush();
    }

    /* JADX INFO: renamed from: a3$a */
    public static abstract class a<MessageType extends AbstractC0027a3<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements psa.InterfaceC11106a {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public static <T> void m86a(final Iterable<T> values, final Collection<? super T> list) {
            m87b(values, (List) list);
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
        public static <T> void m87b(final Iterable<T> values, final List<? super T> list) {
            v98.m23881a(values);
            if (!(values instanceof f39)) {
                if (values instanceof lbd) {
                    list.addAll((Collection) values);
                    return;
                } else {
                    addAllCheckingNulls(values, list);
                    return;
                }
            }
            List<?> underlyingElements = ((f39) values).getUnderlyingElements();
            f39 f39Var = (f39) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (f39Var.size() - size) + " is null.";
                    for (int size2 = f39Var.size() - 1; size2 >= size; size2--) {
                        f39Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof wj1) {
                    f39Var.add((wj1) obj);
                } else if (obj instanceof byte[]) {
                    f39Var.add(wj1.copyFrom((byte[]) obj));
                } else {
                    f39Var.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public static tsh m88d(psa message) {
            return new tsh(message);
        }

        private String getReadingExceptionMessage(String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        /* JADX INFO: renamed from: c */
        public abstract BuilderType mo89c(MessageType message);

        @Override // p000.psa.InterfaceC11106a
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo27182clone();

        @Override // p000.psa.InterfaceC11106a
        public boolean mergeDelimitedFrom(final InputStream input, final yi5 extensionRegistry) throws IOException {
            int i = input.read();
            if (i == -1) {
                return false;
            }
            mergeFrom((InputStream) new C16336a(input, e72.readRawVarint32(i, input)), extensionRegistry);
            return true;
        }

        @Override // p000.psa.InterfaceC11106a
        public abstract BuilderType mergeFrom(final e72 input, final yi5 extensionRegistry) throws IOException;

        /* JADX INFO: renamed from: a3$a$a, reason: collision with other inner class name */
        public static final class C16336a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f237a;

            public C16336a(InputStream in, int limit) {
                super(in);
                this.f237a = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f237a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f237a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f237a--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n) throws IOException {
                int iSkip = (int) super.skip(Math.min(n, this.f237a));
                if (iSkip >= 0) {
                    this.f237a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b, final int off, int len) throws IOException {
                int i = this.f237a;
                if (i <= 0) {
                    return -1;
                }
                int i2 = super.read(b, off, Math.min(len, i));
                if (i2 >= 0) {
                    this.f237a -= i2;
                }
                return i2;
            }
        }

        @Override // p000.psa.InterfaceC11106a
        public boolean mergeDelimitedFrom(final InputStream input) throws IOException {
            return mergeDelimitedFrom(input, yi5.getEmptyRegistry());
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(e72 e72Var) throws IOException {
            return (BuilderType) mergeFrom(e72Var, yi5.getEmptyRegistry());
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final wj1 data) throws be8 {
            try {
                e72 e72VarNewCodedInput = data.newCodedInput();
                mergeFrom(e72VarNewCodedInput);
                e72VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (be8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final wj1 data, final yi5 extensionRegistry) throws be8 {
            try {
                e72 e72VarNewCodedInput = data.newCodedInput();
                mergeFrom(e72VarNewCodedInput, extensionRegistry);
                e72VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (be8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(byte[] bArr) throws be8 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final byte[] data, final int off, final int len) throws be8 {
            try {
                e72 e72VarNewInstance = e72.newInstance(data, off, len);
                mergeFrom(e72VarNewInstance);
                e72VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (be8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(byte[] bArr, yi5 yi5Var) throws be8 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, yi5Var);
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final byte[] data, final int off, final int len, final yi5 extensionRegistry) throws be8 {
            try {
                e72 e72VarNewInstance = e72.newInstance(data, off, len);
                mergeFrom(e72VarNewInstance, extensionRegistry);
                e72VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (be8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final InputStream input) throws IOException {
            e72 e72VarNewInstance = e72.newInstance(input);
            mergeFrom(e72VarNewInstance);
            e72VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(final InputStream input, final yi5 extensionRegistry) throws IOException {
            e72 e72VarNewInstance = e72.newInstance(input);
            mergeFrom(e72VarNewInstance, extensionRegistry);
            e72VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(psa psaVar) {
            if (getDefaultInstanceForType().getClass().isInstance(psaVar)) {
                return (BuilderType) mo89c((AbstractC0027a3) psaVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}
