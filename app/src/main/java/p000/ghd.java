package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p000.fta;
import p000.rua;

/* JADX INFO: loaded from: classes7.dex */
@lg5("Will remain experimental as protobuf lite API is not stable")
public final class ghd {

    /* JADX INFO: renamed from: a */
    public static volatile zi5 f39838a = zi5.getEmptyRegistry();

    /* JADX INFO: renamed from: b */
    public static final int f39839b = 8192;

    /* JADX INFO: renamed from: c */
    @gdi
    public static final int f39840c = 4194304;

    /* JADX INFO: renamed from: ghd$a */
    public static final class C6315a<T extends qsa> implements rua.InterfaceC12304e<T> {

        /* JADX INFO: renamed from: d */
        public static final ThreadLocal<Reference<byte[]>> f39841d = new ThreadLocal<>();

        /* JADX INFO: renamed from: a */
        public final uhc<T> f39842a;

        /* JADX INFO: renamed from: b */
        public final T f39843b;

        /* JADX INFO: renamed from: c */
        public final int f39844c;

        public C6315a(T t, int i) {
            this.f39843b = (T) v7d.checkNotNull(t, "defaultInstance cannot be null");
            this.f39842a = (uhc<T>) t.getParserForType();
            this.f39844c = i;
        }

        private T parseFrom(f72 f72Var) throws ce8 {
            T from = this.f39842a.parseFrom(f72Var, ghd.f39838a);
            try {
                f72Var.checkLastTagWas(0);
                return from;
            } catch (ce8 e) {
                e.setUnfinishedMessage(from);
                throw e;
            }
        }

        @Override // p000.rua.InterfaceC12305f
        public Class<T> getMessageClass() {
            return (Class<T>) this.f39843b.getClass();
        }

        @Override // p000.rua.InterfaceC12304e
        public T getMessagePrototype() {
            return this.f39843b;
        }

        @Override // p000.rua.InterfaceC12302c
        public T parse(InputStream inputStream) {
            f72 f72VarNewInstance;
            byte[] bArr;
            if ((inputStream instanceof fhd) && ((fhd) inputStream).m10906b() == this.f39842a) {
                try {
                    return (T) ((fhd) inputStream).m10905a();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof ss8) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f39843b;
                        }
                        f72VarNewInstance = null;
                    } else {
                        ThreadLocal<Reference<byte[]>> threadLocal = f39841d;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = iAvailable;
                        while (i > 0) {
                            int i2 = inputStream.read(bArr, iAvailable - i, i);
                            if (i2 == -1) {
                                break;
                            }
                            i -= i2;
                        }
                        if (i != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                        }
                        f72VarNewInstance = f72.newInstance(bArr, 0, iAvailable);
                    }
                } else {
                    f72VarNewInstance = null;
                }
                if (f72VarNewInstance == null) {
                    f72VarNewInstance = f72.newInstance(inputStream);
                }
                f72VarNewInstance.setSizeLimit(Integer.MAX_VALUE);
                int i3 = this.f39844c;
                if (i3 >= 0) {
                    f72VarNewInstance.setRecursionLimit(i3);
                }
                try {
                    return (T) parseFrom(f72VarNewInstance);
                } catch (ce8 e) {
                    throw n4g.f63272s.withDescription("Invalid protobuf byte sequence").withCause(e).asRuntimeException();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // p000.rua.InterfaceC12302c
        public InputStream stream(T t) {
            return new fhd(t, this.f39842a);
        }
    }

    /* JADX INFO: renamed from: ghd$b */
    public static final class C6316b<T extends qsa> implements fta.InterfaceC5969g<T> {

        /* JADX INFO: renamed from: a */
        public final T f39845a;

        public C6316b(T t) {
            this.f39845a = t;
        }

        @Override // p000.fta.InterfaceC5969g
        public T parseBytes(byte[] bArr) {
            try {
                return (T) this.f39845a.getParserForType().parseFrom(bArr, ghd.f39838a);
            } catch (ce8 e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // p000.fta.InterfaceC5969g
        public byte[] toBytes(T t) {
            return t.toByteArray();
        }
    }

    private ghd() {
    }

    /* JADX INFO: renamed from: a */
    public static long m11687a(InputStream inputStream, OutputStream outputStream) throws IOException {
        v7d.checkNotNull(inputStream, "inputStream cannot be null!");
        v7d.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static <T extends qsa> rua.InterfaceC12302c<T> marshaller(T t) {
        return new C6315a(t, -1);
    }

    @lg5("https://github.com/grpc/grpc-java/issues/10108")
    public static <T extends qsa> rua.InterfaceC12302c<T> marshallerWithRecursionLimit(T t, int i) {
        return new C6315a(t, i);
    }

    public static <T extends qsa> fta.InterfaceC5969g<T> metadataMarshaller(T t) {
        return new C6316b(t);
    }

    public static void setExtensionRegistry(zi5 zi5Var) {
        f39838a = (zi5) v7d.checkNotNull(zi5Var, "newRegistry");
    }
}
