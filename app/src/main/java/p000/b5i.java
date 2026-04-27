package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import org.apache.commons.compress.utils.CharsetNames;
import p000.p7e;
import p000.z4i;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class b5i extends z4i {

    /* JADX INFO: renamed from: C */
    public static final Charset f12733C = Charset.forName(CharsetNames.UTF_16);

    /* JADX INFO: renamed from: D */
    public static final int f12734D = 0;

    /* JADX INFO: renamed from: E */
    public static final int f12735E = 1;

    /* JADX INFO: renamed from: F */
    public static final int f12736F = 2;

    /* JADX INFO: renamed from: G */
    public static final int f12737G = 3;

    /* JADX INFO: renamed from: H */
    public static final int f12738H = 4;

    /* JADX INFO: renamed from: I */
    public static final int f12739I = 5;

    /* JADX INFO: renamed from: J */
    public static final int f12740J = 6;

    /* JADX INFO: renamed from: K */
    public static final int f12741K = 7;

    /* JADX INFO: renamed from: L */
    public static final int f12742L = 8;

    /* JADX INFO: renamed from: M */
    public static final int f12743M = 9;

    /* JADX INFO: renamed from: N */
    public static final int f12744N = 10;

    /* JADX INFO: renamed from: O */
    public static final int f12745O = 11;

    /* JADX INFO: renamed from: P */
    public static final int f12746P = 12;

    /* JADX INFO: renamed from: Q */
    public static final int f12747Q = 13;

    /* JADX INFO: renamed from: R */
    public static final int f12748R = 14;

    /* JADX INFO: renamed from: A */
    public int f12749A;

    /* JADX INFO: renamed from: B */
    public int f12750B;

    /* JADX INFO: renamed from: t */
    public final DataInputStream f12751t;

    /* JADX INFO: renamed from: u */
    public final DataOutputStream f12752u;

    /* JADX INFO: renamed from: v */
    public DataInputStream f12753v;

    /* JADX INFO: renamed from: w */
    public DataOutputStream f12754w;

    /* JADX INFO: renamed from: x */
    public C1748b f12755x;

    /* JADX INFO: renamed from: y */
    public boolean f12756y;

    /* JADX INFO: renamed from: z */
    public int f12757z;

    /* JADX INFO: renamed from: b5i$b */
    public static class C1748b {

        /* JADX INFO: renamed from: a */
        public final ByteArrayOutputStream f12759a;

        /* JADX INFO: renamed from: b */
        public final DataOutputStream f12760b;

        /* JADX INFO: renamed from: c */
        public final int f12761c;

        /* JADX INFO: renamed from: d */
        public final DataOutputStream f12762d;

        public C1748b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f12759a = byteArrayOutputStream;
            this.f12760b = new DataOutputStream(byteArrayOutputStream);
            this.f12761c = i;
            this.f12762d = dataOutputStream;
        }

        /* JADX INFO: renamed from: a */
        public void m2944a() throws IOException {
            this.f12760b.flush();
            int size = this.f12759a.size();
            this.f12762d.writeInt((this.f12761c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f12762d.writeInt(size);
            }
            this.f12759a.writeTo(this.f12762d);
        }
    }

    public b5i(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new x60(), new x60(), new x60());
    }

    private void readObject(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, readBundle());
                return;
            case 2:
                bundle.putBundle(str, readBundle());
                return;
            case 3:
                bundle.putString(str, readString());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) m26567c(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, readBoolean());
                return;
            case 6:
                bundle.putBooleanArray(str, m26568d());
                return;
            case 7:
                bundle.putDouble(str, readDouble());
                return;
            case 8:
                bundle.putDoubleArray(str, m26569f());
                return;
            case 9:
                bundle.putInt(str, readInt());
                return;
            case 10:
                bundle.putIntArray(str, m26572i());
                return;
            case 11:
                bundle.putLong(str, readLong());
                return;
            case 12:
                bundle.putLongArray(str, m26573j());
                return;
            case 13:
                bundle.putFloat(str, readFloat());
                return;
            case 14:
                bundle.putFloatArray(str, m26570g());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    private void writeObject(Object obj) {
        if (obj == null) {
            writeInt(0);
            return;
        }
        if (obj instanceof Bundle) {
            writeInt(1);
            writeBundle((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            writeInt(3);
            writeString((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            writeInt(4);
            m26576m((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeInt(5);
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            writeInt(6);
            m26577n((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            writeInt(7);
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            writeInt(8);
            m26578p((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            writeInt(9);
            writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            writeInt(10);
            m26580r((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            writeInt(11);
            writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            writeInt(12);
            m26581s((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            writeInt(13);
            writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            writeInt(14);
            m26579q((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: a */
    public z4i mo160a() {
        return new b5i(this.f12753v, this.f12754w, this.f104176a, this.f104177b, this.f104178c);
    }

    @Override // p000.z4i
    public void closeField() {
        C1748b c1748b = this.f12755x;
        if (c1748b != null) {
            try {
                if (c1748b.f12759a.size() != 0) {
                    this.f12755x.m2944a();
                }
                this.f12755x = null;
            } catch (IOException e) {
                throw new z4i.C16005b(e);
            }
        }
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: e */
    public CharSequence mo161e() {
        return null;
    }

    @Override // p000.z4i
    public boolean isStream() {
        return true;
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: o */
    public void mo162o(CharSequence charSequence) {
        if (!this.f12756y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // p000.z4i
    public boolean readBoolean() {
        try {
            return this.f12753v.readBoolean();
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public Bundle readBundle() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < i; i2++) {
            readObject(readInt(), readString(), bundle);
        }
        return bundle;
    }

    @Override // p000.z4i
    public byte[] readByteArray() {
        try {
            int i = this.f12753v.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            this.f12753v.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public double readDouble() {
        try {
            return this.f12753v.readDouble();
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public boolean readField(int i) {
        while (true) {
            try {
                int i2 = this.f12749A;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                if (this.f12757z < this.f12750B) {
                    this.f12751t.skip(r2 - r1);
                }
                this.f12750B = -1;
                int i3 = this.f12751t.readInt();
                this.f12757z = 0;
                int i4 = i3 & 65535;
                if (i4 == 65535) {
                    i4 = this.f12751t.readInt();
                }
                this.f12749A = (i3 >> 16) & 65535;
                this.f12750B = i4;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // p000.z4i
    public float readFloat() {
        try {
            return this.f12753v.readFloat();
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public int readInt() {
        try {
            return this.f12753v.readInt();
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public long readLong() {
        try {
            return this.f12753v.readLong();
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public <T extends Parcelable> T readParcelable() {
        return null;
    }

    @Override // p000.z4i
    public String readString() {
        try {
            int i = this.f12753v.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            this.f12753v.readFully(bArr);
            return new String(bArr, f12733C);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public IBinder readStrongBinder() {
        return null;
    }

    @Override // p000.z4i
    public void setOutputField(int i) {
        closeField();
        C1748b c1748b = new C1748b(i, this.f12752u);
        this.f12755x = c1748b;
        this.f12754w = c1748b.f12760b;
    }

    @Override // p000.z4i
    public void setSerializationFlags(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f12756y = z2;
    }

    @Override // p000.z4i
    public void writeBoolean(boolean z) {
        try {
            this.f12754w.writeBoolean(z);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeBundle(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f12754w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f12754w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                writeString(str);
                writeObject(bundle.get(str));
            }
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f12754w.writeInt(bArr.length);
                this.f12754w.write(bArr);
            } else {
                this.f12754w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeDouble(double d) {
        try {
            this.f12754w.writeDouble(d);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeFloat(float f) {
        try {
            this.f12754w.writeFloat(f);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeInt(int i) {
        try {
            this.f12754w.writeInt(i);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeLong(long j) {
        try {
            this.f12754w.writeLong(j);
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeParcelable(Parcelable parcelable) {
        if (!this.f12756y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // p000.z4i
    public void writeString(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f12733C);
                this.f12754w.writeInt(bytes.length);
                this.f12754w.write(bytes);
            } else {
                this.f12754w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }

    @Override // p000.z4i
    public void writeStrongBinder(IBinder iBinder) {
        if (!this.f12756y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // p000.z4i
    public void writeStrongInterface(IInterface iInterface) {
        if (!this.f12756y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    private b5i(InputStream inputStream, OutputStream outputStream, x60<String, Method> x60Var, x60<String, Method> x60Var2, x60<String, Class> x60Var3) {
        super(x60Var, x60Var2, x60Var3);
        this.f12757z = 0;
        this.f12749A = -1;
        this.f12750B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C1747a(inputStream)) : null;
        this.f12751t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f12752u = dataOutputStream;
        this.f12753v = dataInputStream;
        this.f12754w = dataOutputStream;
    }

    /* JADX INFO: renamed from: b5i$a */
    public class C1747a extends FilterInputStream {
        public C1747a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            b5i b5iVar = b5i.this;
            int i = b5iVar.f12750B;
            if (i != -1 && b5iVar.f12757z >= i) {
                throw new IOException();
            }
            int i2 = super.read();
            b5i.this.f12757z++;
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            b5i b5iVar = b5i.this;
            int i = b5iVar.f12750B;
            if (i != -1 && b5iVar.f12757z >= i) {
                throw new IOException();
            }
            long jSkip = super.skip(j);
            if (jSkip > 0) {
                b5i.this.f12757z += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            b5i b5iVar = b5i.this;
            int i3 = b5iVar.f12750B;
            if (i3 != -1 && b5iVar.f12757z >= i3) {
                throw new IOException();
            }
            int i4 = super.read(bArr, i, i2);
            if (i4 > 0) {
                b5i.this.f12757z += i4;
            }
            return i4;
        }
    }

    @Override // p000.z4i
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.f12754w.writeInt(i2);
                this.f12754w.write(bArr, i, i2);
            } else {
                this.f12754w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new z4i.C16005b(e);
        }
    }
}
