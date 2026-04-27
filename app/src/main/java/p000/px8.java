package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class px8 {

    /* JADX INFO: renamed from: e */
    public static final zi5 f72453e = zi5.getEmptyRegistry();

    /* JADX INFO: renamed from: a */
    public vj1 f72454a;

    /* JADX INFO: renamed from: b */
    public zi5 f72455b;

    /* JADX INFO: renamed from: c */
    public volatile qsa f72456c;

    /* JADX INFO: renamed from: d */
    public volatile vj1 f72457d;

    public px8(zi5 extensionRegistry, vj1 bytes) {
        checkArguments(extensionRegistry, bytes);
        this.f72455b = extensionRegistry;
        this.f72454a = bytes;
    }

    private static void checkArguments(zi5 extensionRegistry, vj1 bytes) {
        if (extensionRegistry == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static px8 fromValue(qsa value) {
        px8 px8Var = new px8();
        px8Var.setValue(value);
        return px8Var;
    }

    private static qsa mergeValueAndBytes(qsa value, vj1 otherBytes, zi5 extensionRegistry) {
        try {
            return value.toBuilder().mergeFrom(otherBytes, extensionRegistry).build();
        } catch (ce8 unused) {
            return value;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19835a(qsa defaultInstance) {
        if (this.f72456c != null) {
            return;
        }
        synchronized (this) {
            if (this.f72456c != null) {
                return;
            }
            try {
                if (this.f72454a != null) {
                    this.f72456c = defaultInstance.getParserForType().parseFrom(this.f72454a, this.f72455b);
                    this.f72457d = this.f72454a;
                } else {
                    this.f72456c = defaultInstance;
                    this.f72457d = vj1.f91344e;
                }
            } catch (ce8 unused) {
                this.f72456c = defaultInstance;
                this.f72457d = vj1.f91344e;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19836b(rsi writer, int fieldNumber) throws IOException {
        if (this.f72457d != null) {
            writer.writeBytes(fieldNumber, this.f72457d);
            return;
        }
        vj1 vj1Var = this.f72454a;
        if (vj1Var != null) {
            writer.writeBytes(fieldNumber, vj1Var);
        } else if (this.f72456c != null) {
            writer.writeMessage(fieldNumber, this.f72456c);
        } else {
            writer.writeBytes(fieldNumber, vj1.f91344e);
        }
    }

    public void clear() {
        this.f72454a = null;
        this.f72456c = null;
        this.f72457d = null;
    }

    public boolean containsDefaultInstance() {
        vj1 vj1Var;
        vj1 vj1Var2 = this.f72457d;
        vj1 vj1Var3 = vj1.f91344e;
        return vj1Var2 == vj1Var3 || (this.f72456c == null && ((vj1Var = this.f72454a) == null || vj1Var == vj1Var3));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof px8)) {
            return false;
        }
        px8 px8Var = (px8) o;
        qsa qsaVar = this.f72456c;
        qsa qsaVar2 = px8Var.f72456c;
        return (qsaVar == null && qsaVar2 == null) ? toByteString().equals(px8Var.toByteString()) : (qsaVar == null || qsaVar2 == null) ? qsaVar != null ? qsaVar.equals(px8Var.getValue(qsaVar.getDefaultInstanceForType())) : getValue(qsaVar2.getDefaultInstanceForType()).equals(qsaVar2) : qsaVar.equals(qsaVar2);
    }

    public int getSerializedSize() {
        if (this.f72457d != null) {
            return this.f72457d.size();
        }
        vj1 vj1Var = this.f72454a;
        if (vj1Var != null) {
            return vj1Var.size();
        }
        if (this.f72456c != null) {
            return this.f72456c.getSerializedSize();
        }
        return 0;
    }

    public qsa getValue(qsa defaultInstance) {
        m19835a(defaultInstance);
        return this.f72456c;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(px8 other) {
        vj1 vj1Var;
        if (other.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(other);
            return;
        }
        if (this.f72455b == null) {
            this.f72455b = other.f72455b;
        }
        vj1 vj1Var2 = this.f72454a;
        if (vj1Var2 != null && (vj1Var = other.f72454a) != null) {
            this.f72454a = vj1Var2.concat(vj1Var);
            return;
        }
        if (this.f72456c == null && other.f72456c != null) {
            setValue(mergeValueAndBytes(other.f72456c, this.f72454a, this.f72455b));
        } else if (this.f72456c == null || other.f72456c != null) {
            setValue(this.f72456c.toBuilder().mergeFrom(other.f72456c).build());
        } else {
            setValue(mergeValueAndBytes(this.f72456c, other.f72454a, other.f72455b));
        }
    }

    public void mergeFrom(f72 input, zi5 extensionRegistry) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(input.readBytes(), extensionRegistry);
            return;
        }
        if (this.f72455b == null) {
            this.f72455b = extensionRegistry;
        }
        vj1 vj1Var = this.f72454a;
        if (vj1Var != null) {
            setByteString(vj1Var.concat(input.readBytes()), this.f72455b);
        } else {
            try {
                setValue(this.f72456c.toBuilder().mergeFrom(input, extensionRegistry).build());
            } catch (ce8 unused) {
            }
        }
    }

    public void set(px8 other) {
        this.f72454a = other.f72454a;
        this.f72456c = other.f72456c;
        this.f72457d = other.f72457d;
        zi5 zi5Var = other.f72455b;
        if (zi5Var != null) {
            this.f72455b = zi5Var;
        }
    }

    public void setByteString(vj1 bytes, zi5 extensionRegistry) {
        checkArguments(extensionRegistry, bytes);
        this.f72454a = bytes;
        this.f72455b = extensionRegistry;
        this.f72456c = null;
        this.f72457d = null;
    }

    public qsa setValue(qsa value) {
        qsa qsaVar = this.f72456c;
        this.f72454a = null;
        this.f72457d = null;
        this.f72456c = value;
        return qsaVar;
    }

    public vj1 toByteString() {
        if (this.f72457d != null) {
            return this.f72457d;
        }
        vj1 vj1Var = this.f72454a;
        if (vj1Var != null) {
            return vj1Var;
        }
        synchronized (this) {
            try {
                if (this.f72457d != null) {
                    return this.f72457d;
                }
                if (this.f72456c == null) {
                    this.f72457d = vj1.f91344e;
                } else {
                    this.f72457d = this.f72456c.toByteString();
                }
                return this.f72457d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public px8() {
    }
}
