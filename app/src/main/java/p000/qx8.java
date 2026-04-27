package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qx8 {

    /* JADX INFO: renamed from: a */
    public wj1 f76272a;

    /* JADX INFO: renamed from: b */
    public yi5 f76273b;

    /* JADX INFO: renamed from: c */
    public volatile psa f76274c;

    /* JADX INFO: renamed from: d */
    public volatile wj1 f76275d;

    public qx8(yi5 extensionRegistry, wj1 bytes) {
        checkArguments(extensionRegistry, bytes);
        this.f76273b = extensionRegistry;
        this.f76272a = bytes;
    }

    private static void checkArguments(yi5 extensionRegistry, wj1 bytes) {
        if (extensionRegistry == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static qx8 fromValue(psa value) {
        qx8 qx8Var = new qx8();
        qx8Var.setValue(value);
        return qx8Var;
    }

    private static psa mergeValueAndBytes(psa value, wj1 otherBytes, yi5 extensionRegistry) {
        try {
            return value.toBuilder().mergeFrom(otherBytes, extensionRegistry).build();
        } catch (be8 unused) {
            return value;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20704a(psa defaultInstance) {
        if (this.f76274c != null) {
            return;
        }
        synchronized (this) {
            if (this.f76274c != null) {
                return;
            }
            try {
                if (this.f76272a != null) {
                    this.f76274c = defaultInstance.getParserForType().parseFrom(this.f76272a, this.f76273b);
                    this.f76275d = this.f76272a;
                } else {
                    this.f76274c = defaultInstance;
                    this.f76275d = wj1.f94379e;
                }
            } catch (be8 unused) {
                this.f76274c = defaultInstance;
                this.f76275d = wj1.f94379e;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20705b(qsi writer, int fieldNumber) throws IOException {
        if (this.f76275d != null) {
            writer.writeBytes(fieldNumber, this.f76275d);
            return;
        }
        wj1 wj1Var = this.f76272a;
        if (wj1Var != null) {
            writer.writeBytes(fieldNumber, wj1Var);
        } else if (this.f76274c != null) {
            writer.writeMessage(fieldNumber, this.f76274c);
        } else {
            writer.writeBytes(fieldNumber, wj1.f94379e);
        }
    }

    public void clear() {
        this.f76272a = null;
        this.f76274c = null;
        this.f76275d = null;
    }

    public boolean containsDefaultInstance() {
        wj1 wj1Var;
        wj1 wj1Var2 = this.f76275d;
        wj1 wj1Var3 = wj1.f94379e;
        return wj1Var2 == wj1Var3 || (this.f76274c == null && ((wj1Var = this.f76272a) == null || wj1Var == wj1Var3));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qx8)) {
            return false;
        }
        qx8 qx8Var = (qx8) o;
        psa psaVar = this.f76274c;
        psa psaVar2 = qx8Var.f76274c;
        return (psaVar == null && psaVar2 == null) ? toByteString().equals(qx8Var.toByteString()) : (psaVar == null || psaVar2 == null) ? psaVar != null ? psaVar.equals(qx8Var.getValue(psaVar.getDefaultInstanceForType())) : getValue(psaVar2.getDefaultInstanceForType()).equals(psaVar2) : psaVar.equals(psaVar2);
    }

    public int getSerializedSize() {
        if (this.f76275d != null) {
            return this.f76275d.size();
        }
        wj1 wj1Var = this.f76272a;
        if (wj1Var != null) {
            return wj1Var.size();
        }
        if (this.f76274c != null) {
            return this.f76274c.getSerializedSize();
        }
        return 0;
    }

    public psa getValue(psa defaultInstance) {
        m20704a(defaultInstance);
        return this.f76274c;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(qx8 other) {
        wj1 wj1Var;
        if (other.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(other);
            return;
        }
        if (this.f76273b == null) {
            this.f76273b = other.f76273b;
        }
        wj1 wj1Var2 = this.f76272a;
        if (wj1Var2 != null && (wj1Var = other.f76272a) != null) {
            this.f76272a = wj1Var2.concat(wj1Var);
            return;
        }
        if (this.f76274c == null && other.f76274c != null) {
            setValue(mergeValueAndBytes(other.f76274c, this.f76272a, this.f76273b));
        } else if (this.f76274c == null || other.f76274c != null) {
            setValue(this.f76274c.toBuilder().mergeFrom(other.f76274c).build());
        } else {
            setValue(mergeValueAndBytes(this.f76274c, other.f76272a, other.f76273b));
        }
    }

    public void mergeFrom(e72 input, yi5 extensionRegistry) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(input.readBytes(), extensionRegistry);
            return;
        }
        if (this.f76273b == null) {
            this.f76273b = extensionRegistry;
        }
        wj1 wj1Var = this.f76272a;
        if (wj1Var != null) {
            setByteString(wj1Var.concat(input.readBytes()), this.f76273b);
        } else {
            try {
                setValue(this.f76274c.toBuilder().mergeFrom(input, extensionRegistry).build());
            } catch (be8 unused) {
            }
        }
    }

    public void set(qx8 other) {
        this.f76272a = other.f76272a;
        this.f76274c = other.f76274c;
        this.f76275d = other.f76275d;
        yi5 yi5Var = other.f76273b;
        if (yi5Var != null) {
            this.f76273b = yi5Var;
        }
    }

    public void setByteString(wj1 bytes, yi5 extensionRegistry) {
        checkArguments(extensionRegistry, bytes);
        this.f76272a = bytes;
        this.f76273b = extensionRegistry;
        this.f76274c = null;
        this.f76275d = null;
    }

    public psa setValue(psa value) {
        psa psaVar = this.f76274c;
        this.f76272a = null;
        this.f76275d = null;
        this.f76274c = value;
        return psaVar;
    }

    public wj1 toByteString() {
        if (this.f76275d != null) {
            return this.f76275d;
        }
        wj1 wj1Var = this.f76272a;
        if (wj1Var != null) {
            return wj1Var;
        }
        synchronized (this) {
            try {
                if (this.f76275d != null) {
                    return this.f76275d;
                }
                if (this.f76274c == null) {
                    this.f76275d = wj1.f94379e;
                } else {
                    this.f76275d = this.f76274c.toByteString();
                }
                return this.f76275d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qx8() {
    }
}
