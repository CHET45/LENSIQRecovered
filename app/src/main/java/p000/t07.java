package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public final class t07 {

    /* JADX INFO: renamed from: t07$a */
    public enum EnumC12834a implements s07<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // p000.s07
        public void funnel(byte[] from, obd into) {
            into.putBytes(from);
        }
    }

    /* JADX INFO: renamed from: t07$b */
    public enum EnumC12835b implements s07<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // p000.s07
        public void funnel(Integer from, obd into) {
            into.putInt(from.intValue());
        }
    }

    /* JADX INFO: renamed from: t07$c */
    public enum EnumC12836c implements s07<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // p000.s07
        public void funnel(Long from, obd into) {
            into.putLong(from.longValue());
        }
    }

    /* JADX INFO: renamed from: t07$d */
    public static class C12837d<E> implements s07<Iterable<? extends E>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final s07<E> f83305a;

        public C12837d(s07<E> elementFunnel) {
            this.f83305a = (s07) v7d.checkNotNull(elementFunnel);
        }

        public boolean equals(@wx1 Object o) {
            if (o instanceof C12837d) {
                return this.f83305a.equals(((C12837d) o).f83305a);
            }
            return false;
        }

        public int hashCode() {
            return C12837d.class.hashCode() ^ this.f83305a.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f83305a + c0b.f15434d;
        }

        @Override // p000.s07
        public void funnel(Iterable<? extends E> from, obd into) {
            Iterator<? extends E> it = from.iterator();
            while (it.hasNext()) {
                this.f83305a.funnel(it.next(), into);
            }
        }
    }

    /* JADX INFO: renamed from: t07$e */
    public static class C12838e extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final obd f83306a;

        public C12838e(obd sink) {
            this.f83306a = (obd) v7d.checkNotNull(sink);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f83306a + c0b.f15434d;
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            this.f83306a.putByte((byte) b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes) {
            this.f83306a.putBytes(bytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            this.f83306a.putBytes(bytes, off, len);
        }
    }

    /* JADX INFO: renamed from: t07$f */
    public static class C12839f implements s07<CharSequence>, Serializable {

        /* JADX INFO: renamed from: a */
        public final Charset f83307a;

        /* JADX INFO: renamed from: t07$f$a */
        public static class a implements Serializable {
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: a */
            public final String f83308a;

            public a(Charset charset) {
                this.f83308a = charset.name();
            }

            private Object readResolve() {
                return t07.stringFunnel(Charset.forName(this.f83308a));
            }
        }

        public C12839f(Charset charset) {
            this.f83307a = (Charset) v7d.checkNotNull(charset);
        }

        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        public boolean equals(@wx1 Object o) {
            if (o instanceof C12839f) {
                return this.f83307a.equals(((C12839f) o).f83307a);
            }
            return false;
        }

        public int hashCode() {
            return C12839f.class.hashCode() ^ this.f83307a.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f83307a.name() + c0b.f15434d;
        }

        public Object writeReplace() {
            return new a(this.f83307a);
        }

        @Override // p000.s07
        public void funnel(CharSequence from, obd into) {
            into.putString(from, this.f83307a);
        }
    }

    /* JADX INFO: renamed from: t07$g */
    public enum EnumC12840g implements s07<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // p000.s07
        public void funnel(CharSequence from, obd into) {
            into.putUnencodedChars(from);
        }
    }

    private t07() {
    }

    public static OutputStream asOutputStream(obd sink) {
        return new C12838e(sink);
    }

    public static s07<byte[]> byteArrayFunnel() {
        return EnumC12834a.INSTANCE;
    }

    public static s07<Integer> integerFunnel() {
        return EnumC12835b.INSTANCE;
    }

    public static s07<Long> longFunnel() {
        return EnumC12836c.INSTANCE;
    }

    public static <E> s07<Iterable<? extends E>> sequentialFunnel(s07<E> elementFunnel) {
        return new C12837d(elementFunnel);
    }

    public static s07<CharSequence> stringFunnel(Charset charset) {
        return new C12839f(charset);
    }

    public static s07<CharSequence> unencodedCharsFunnel() {
        return EnumC12840g.INSTANCE;
    }
}
