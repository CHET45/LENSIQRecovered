package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class z4i {

    /* JADX INFO: renamed from: d */
    public static final String f104160d = "VersionedParcel";

    /* JADX INFO: renamed from: e */
    public static final int f104161e = -1;

    /* JADX INFO: renamed from: f */
    public static final int f104162f = -2;

    /* JADX INFO: renamed from: g */
    public static final int f104163g = -3;

    /* JADX INFO: renamed from: h */
    public static final int f104164h = -4;

    /* JADX INFO: renamed from: i */
    public static final int f104165i = -5;

    /* JADX INFO: renamed from: j */
    public static final int f104166j = -6;

    /* JADX INFO: renamed from: k */
    public static final int f104167k = -7;

    /* JADX INFO: renamed from: l */
    public static final int f104168l = -9;

    /* JADX INFO: renamed from: m */
    public static final int f104169m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f104170n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f104171o = 3;

    /* JADX INFO: renamed from: p */
    public static final int f104172p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f104173q = 5;

    /* JADX INFO: renamed from: r */
    public static final int f104174r = 7;

    /* JADX INFO: renamed from: s */
    public static final int f104175s = 8;

    /* JADX INFO: renamed from: a */
    public final x60<String, Method> f104176a;

    /* JADX INFO: renamed from: b */
    public final x60<String, Method> f104177b;

    /* JADX INFO: renamed from: c */
    public final x60<String, Class> f104178c;

    /* JADX INFO: renamed from: z4i$a */
    public class C16004a extends ObjectInputStream {
        public C16004a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: renamed from: z4i$b */
    public static class C16005b extends RuntimeException {
        public C16005b(Throwable th) {
            super(th);
        }
    }

    public z4i(x60<String, Method> x60Var, x60<String, Method> x60Var2, x60<String, Class> x60Var3) {
        this.f104176a = x60Var;
        this.f104177b = x60Var2;
        this.f104178c = x60Var3;
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static Throwable m26566b(@efb Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private Exception createException(int i, String str) {
        switch (i) {
            case -9:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class findParcelClass(Class<? extends c5i> cls) throws ClassNotFoundException {
        Class cls2 = this.f104178c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f104178c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f104176a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, z4i.class.getClassLoader()).getDeclaredMethod("read", z4i.class);
        this.f104176a.put(str, declaredMethod);
        return declaredMethod;
    }

    private <T> int getType(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof c5i) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f104177b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsFindParcelClass = findParcelClass(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsFindParcelClass.getDeclaredMethod("write", cls, z4i.class);
        this.f104177b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T, S extends Collection<T>> S readCollection(S s) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        if (i != 0) {
            int i2 = readInt();
            if (i < 0) {
                return null;
            }
            if (i2 == 1) {
                while (i > 0) {
                    s.add(m26575l());
                    i--;
                }
            } else if (i2 == 2) {
                while (i > 0) {
                    s.add(readParcelable());
                    i--;
                }
            } else if (i2 == 3) {
                while (i > 0) {
                    s.add(m26574k());
                    i--;
                }
            } else if (i2 == 4) {
                while (i > 0) {
                    s.add(readString());
                    i--;
                }
            } else if (i2 == 5) {
                while (i > 0) {
                    s.add(readStrongBinder());
                    i--;
                }
            }
        }
        return s;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i) {
        setOutputField(i);
        writeCollection(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(c5i c5iVar) {
        try {
            writeString(findParcelClass(c5iVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(c5iVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract z4i mo160a();

    /* JADX INFO: renamed from: c */
    public <T> T[] m26567c(T[] tArr) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        if (i != 0) {
            int i2 = readInt();
            if (i < 0) {
                return null;
            }
            if (i2 == 1) {
                while (i > 0) {
                    arrayList.add(m26575l());
                    i--;
                }
            } else if (i2 == 2) {
                while (i > 0) {
                    arrayList.add(readParcelable());
                    i--;
                }
            } else if (i2 == 3) {
                while (i > 0) {
                    arrayList.add(m26574k());
                    i--;
                }
            } else if (i2 == 4) {
                while (i > 0) {
                    arrayList.add(readString());
                    i--;
                }
            } else if (i2 == 5) {
                while (i > 0) {
                    arrayList.add(readStrongBinder());
                    i--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public abstract void closeField();

    /* JADX INFO: renamed from: d */
    public boolean[] m26568d() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = readInt() != 0;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: e */
    public abstract CharSequence mo161e();

    /* JADX INFO: renamed from: f */
    public double[] m26569f() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: g */
    public float[] m26570g() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: h */
    public <T extends c5i> T m26571h(String str, z4i z4iVar) {
        try {
            return (T) getReadMethod(str).invoke(null, z4iVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: i */
    public int[] m26572i() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public boolean isStream() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public long[] m26573j() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k */
    public Serializable m26574k() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new C16004a(new ByteArrayInputStream(readByteArray())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + string + c0b.f15434d, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + c0b.f15434d, e2);
        }
    }

    /* JADX INFO: renamed from: l */
    public <T extends c5i> T m26575l() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return (T) m26571h(string, mo160a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public <T> void m26576m(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i < length) {
                    m26584v((c5i) tArr[i]);
                    i++;
                }
                return;
            }
            if (type == 2) {
                while (i < length) {
                    writeParcelable((Parcelable) tArr[i]);
                    i++;
                }
                return;
            }
            if (type == 3) {
                while (i < length) {
                    writeSerializable((Serializable) tArr[i]);
                    i++;
                }
            } else if (type == 4) {
                while (i < length) {
                    writeString((String) tArr[i]);
                    i++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i < length) {
                    writeStrongBinder((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m26577n(boolean[] zArr) {
        if (zArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(zArr.length);
        for (boolean z : zArr) {
            writeInt(z ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo162o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public void m26578p(double[] dArr) {
        if (dArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(dArr.length);
        for (double d : dArr) {
            writeDouble(d);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m26579q(float[] fArr) {
        if (fArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(fArr.length);
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m26580r(int[] iArr) {
        if (iArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    public <T> T[] readArray(T[] tArr, int i) {
        return !readField(i) ? tArr : (T[]) m26567c(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z, int i) {
        return !readField(i) ? z : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i) {
        return !readField(i) ? zArr : m26568d();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i) {
        return !readField(i) ? bundle : readBundle();
    }

    public byte readByte(byte b, int i) {
        return !readField(i) ? b : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i) {
        return !readField(i) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i) {
        if (!readField(i)) {
            return cArr;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        char[] cArr2 = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr2[i3] = (char) readInt();
        }
        return cArr2;
    }

    public CharSequence readCharSequence(CharSequence charSequence, int i) {
        return !readField(i) ? charSequence : mo161e();
    }

    public abstract double readDouble();

    public double readDouble(double d, int i) {
        return !readField(i) ? d : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i) {
        return !readField(i) ? dArr : m26569f();
    }

    public Exception readException(Exception exc, int i) {
        int exceptionCode;
        return (readField(i) && (exceptionCode = readExceptionCode()) != 0) ? readException(exceptionCode, readString()) : exc;
    }

    public abstract boolean readField(int i);

    public abstract float readFloat();

    public float readFloat(float f, int i) {
        return !readField(i) ? f : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i) {
        return !readField(i) ? fArr : m26570g();
    }

    public abstract int readInt();

    public int readInt(int i, int i2) {
        return !readField(i2) ? i : readInt();
    }

    public int[] readIntArray(int[] iArr, int i) {
        return !readField(i) ? iArr : m26572i();
    }

    public <T> List<T> readList(List<T> list, int i) {
        return !readField(i) ? list : (List) readCollection(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j, int i) {
        return !readField(i) ? j : readLong();
    }

    public long[] readLongArray(long[] jArr, int i) {
        return !readField(i) ? jArr : m26573j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i) {
        if (!readField(i)) {
            return map;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        x60 x60Var = new x60();
        if (i2 == 0) {
            return x60Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        readCollection(arrayList);
        readCollection(arrayList2);
        for (int i3 = 0; i3 < i2; i3++) {
            x60Var.put(arrayList.get(i3), arrayList2.get(i3));
        }
        return x60Var;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t, int i) {
        return !readField(i) ? t : (T) readParcelable();
    }

    public <T> Set<T> readSet(Set<T> set, int i) {
        return !readField(i) ? set : (Set) readCollection(new g70());
    }

    @c5e(api = 21)
    public Size readSize(Size size, int i) {
        if (!readField(i)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @c5e(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i) {
        if (!readField(i)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i) {
        if (!readField(i)) {
            return sparseBooleanArray;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i) {
        return !readField(i) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i) {
        return !readField(i) ? iBinder : readStrongBinder();
    }

    public <T extends c5i> T readVersionedParcelable(T t, int i) {
        return !readField(i) ? t : (T) m26575l();
    }

    /* JADX INFO: renamed from: s */
    public void m26581s(long[] jArr) {
        if (jArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(jArr.length);
        for (long j : jArr) {
            writeLong(j);
        }
    }

    public abstract void setOutputField(int i);

    public void setSerializationFlags(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: t */
    public void m26582t() {
        writeInt(0);
    }

    /* JADX INFO: renamed from: u */
    public <T extends c5i> void m26583u(T t, z4i z4iVar) {
        try {
            getWriteMethod(t.getClass()).invoke(null, t, z4iVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m26584v(c5i c5iVar) {
        if (c5iVar == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(c5iVar);
        z4i z4iVarMo160a = mo160a();
        m26583u(c5iVar, z4iVarMo160a);
        z4iVarMo160a.closeField();
    }

    public <T> void writeArray(T[] tArr, int i) {
        setOutputField(i);
        m26576m(tArr);
    }

    public abstract void writeBoolean(boolean z);

    public void writeBoolean(boolean z, int i) {
        setOutputField(i);
        writeBoolean(z);
    }

    public void writeBooleanArray(boolean[] zArr, int i) {
        setOutputField(i);
        m26577n(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i) {
        setOutputField(i);
        writeBundle(bundle);
    }

    public void writeByte(byte b, int i) {
        setOutputField(i);
        writeInt(b);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i) {
        setOutputField(i);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i, int i2);

    public void writeCharArray(char[] cArr, int i) {
        setOutputField(i);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c : cArr) {
            writeInt(c);
        }
    }

    public void writeCharSequence(CharSequence charSequence, int i) {
        setOutputField(i);
        mo162o(charSequence);
    }

    public abstract void writeDouble(double d);

    public void writeDouble(double d, int i) {
        setOutputField(i);
        writeDouble(d);
    }

    public void writeDoubleArray(double[] dArr, int i) {
        setOutputField(i);
        m26578p(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i) {
        setOutputField(i);
        if (exc == 0) {
            m26582t();
            return;
        }
        int i2 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        writeInt(i2);
        if (i2 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i2 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f);

    public void writeFloat(float f, int i) {
        setOutputField(i);
        writeFloat(f);
    }

    public void writeFloatArray(float[] fArr, int i) {
        setOutputField(i);
        m26579q(fArr);
    }

    public abstract void writeInt(int i);

    public void writeInt(int i, int i2) {
        setOutputField(i2);
        writeInt(i);
    }

    public void writeIntArray(int[] iArr, int i) {
        setOutputField(i);
        m26580r(iArr);
    }

    public <T> void writeList(List<T> list, int i) {
        writeCollection(list, i);
    }

    public abstract void writeLong(long j);

    public void writeLong(long j, int i) {
        setOutputField(i);
        writeLong(j);
    }

    public void writeLongArray(long[] jArr, int i) {
        setOutputField(i);
        m26581s(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i) {
        setOutputField(i);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i) {
        setOutputField(i);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i) {
        setOutputField(i);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i) {
        writeCollection(set, i);
    }

    @c5e(api = 21)
    public void writeSize(Size size, int i) {
        setOutputField(i);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @c5e(api = 21)
    public void writeSizeF(SizeF sizeF, int i) {
        setOutputField(i);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i) {
        setOutputField(i);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            writeInt(sparseBooleanArray.keyAt(i2));
            writeBoolean(sparseBooleanArray.valueAt(i2));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i) {
        setOutputField(i);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i) {
        setOutputField(i);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i) {
        setOutputField(i);
        writeStrongInterface(iInterface);
    }

    public void writeVersionedParcelable(c5i c5iVar, int i) {
        setOutputField(i);
        m26584v(c5iVar);
    }

    private <T> void writeCollection(Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        m26584v((c5i) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void writeSerializable(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + c0b.f15434d, e);
        }
    }

    public void writeByteArray(byte[] bArr, int i, int i2, int i3) {
        setOutputField(i3);
        writeByteArray(bArr, i, i2);
    }

    private Exception readException(int i, String str) {
        return createException(i, str);
    }
}
