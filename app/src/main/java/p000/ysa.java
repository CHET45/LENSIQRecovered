package p000;

import java.io.IOException;
import p000.gpi;
import p000.nx8;
import p000.zr5;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class ysa<T> implements upe<T> {

    /* JADX INFO: renamed from: a */
    public final psa f102900a;

    /* JADX INFO: renamed from: b */
    public final sth<?, ?> f102901b;

    /* JADX INFO: renamed from: c */
    public final boolean f102902c;

    /* JADX INFO: renamed from: d */
    public final cj5<?> f102903d;

    private ysa(sth<?, ?> unknownFieldSchema, cj5<?> extensionSchema, psa defaultInstance) {
        this.f102901b = unknownFieldSchema;
        this.f102902c = extensionSchema.mo3994e(defaultInstance);
        this.f102903d = extensionSchema;
        this.f102900a = defaultInstance;
    }

    /* JADX INFO: renamed from: a */
    public static <T> ysa<T> m26351a(sth<?, ?> unknownFieldSchema, cj5<?> extensionSchema, psa defaultInstance) {
        return new ysa<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(sth<UT, UB> schema, T message) {
        return schema.mo22236i(schema.mo22234g(message));
    }

    private <UT, UB, ET extends zr5.InterfaceC16225c<ET>> void mergeFromHelper(sth<UT, UB> unknownFieldSchema, cj5<ET> extensionSchema, T message, ird reader, yi5 extensionRegistry) throws IOException {
        UB ubMo22233f = unknownFieldSchema.mo22233f(message);
        zr5<ET> zr5VarMo3993d = extensionSchema.mo3993d(message);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(reader, extensionRegistry, extensionSchema, zr5VarMo3993d, unknownFieldSchema, ubMo22233f)) {
                    return;
                }
            } finally {
                unknownFieldSchema.mo22241n(message, ubMo22233f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends zr5.InterfaceC16225c<ET>> boolean parseMessageSetItemOrUnknownField(ird reader, yi5 extensionRegistry, cj5<ET> extensionSchema, zr5<ET> extensions, sth<UT, UB> unknownFieldSchema, UB unknownFields) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != gpi.f40743q) {
            if (gpi.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objMo3991b = extensionSchema.mo3991b(extensionRegistry, this.f102900a, gpi.getTagFieldNumber(tag));
            if (objMo3991b == null) {
                return unknownFieldSchema.m22239l(unknownFields, reader, 0);
            }
            extensionSchema.mo3997h(reader, objMo3991b, extensionRegistry, extensions);
            return true;
        }
        Object objMo3991b2 = null;
        wj1 bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == gpi.f40745s) {
                uInt32 = reader.readUInt32();
                objMo3991b2 = extensionSchema.mo3991b(extensionRegistry, this.f102900a, uInt32);
            } else if (tag2 == gpi.f40746t) {
                if (objMo3991b2 != null) {
                    extensionSchema.mo3997h(reader, objMo3991b2, extensionRegistry, extensions);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != gpi.f40744r) {
            throw be8.m3075b();
        }
        if (bytes != null) {
            if (objMo3991b2 != null) {
                extensionSchema.mo3998i(bytes, objMo3991b2, extensionRegistry, extensions);
            } else {
                unknownFieldSchema.mo22231d(unknownFields, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(sth<UT, UB> unknownFieldSchema, T message, qsi writer) throws IOException {
        unknownFieldSchema.mo22245r(unknownFieldSchema.mo22234g(message), writer);
    }

    @Override // p000.upe
    public boolean equals(T message, T other) {
        if (!this.f102901b.mo22234g(message).equals(this.f102901b.mo22234g(other))) {
            return false;
        }
        if (this.f102902c) {
            return this.f102903d.mo3992c(message).equals(this.f102903d.mo3992c(other));
        }
        return true;
    }

    @Override // p000.upe
    public int getSerializedSize(T message) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.f102901b, message);
        return this.f102902c ? unknownFieldsSerializedSize + this.f102903d.mo3992c(message).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // p000.upe
    public int hashCode(T message) {
        int iHashCode = this.f102901b.mo22234g(message).hashCode();
        return this.f102902c ? (iHashCode * 53) + this.f102903d.mo3992c(message).hashCode() : iHashCode;
    }

    @Override // p000.upe
    public final boolean isInitialized(T message) {
        return this.f102903d.mo3992c(message).isInitialized();
    }

    @Override // p000.upe
    public void makeImmutable(T message) {
        this.f102901b.mo22237j(message);
        this.f102903d.mo3995f(message);
    }

    @Override // p000.upe
    public void mergeFrom(T message, T other) {
        iqe.m13311G(this.f102901b, message, other);
        if (this.f102902c) {
            iqe.m13309E(this.f102903d, message, other);
        }
    }

    @Override // p000.upe
    public T newInstance() {
        psa psaVar = this.f102900a;
        return psaVar instanceof u27 ? (T) ((u27) psaVar).m23046Q() : (T) psaVar.newBuilderForType().buildPartial();
    }

    @Override // p000.upe
    public void writeTo(T message, qsi writer) throws IOException {
        for (T t : this.f102903d.mo3992c(message)) {
            zr5.InterfaceC16225c interfaceC16225c = (zr5.InterfaceC16225c) t.getKey();
            if (interfaceC16225c.getLiteJavaType() != gpi.EnumC6461c.MESSAGE || interfaceC16225c.isRepeated() || interfaceC16225c.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t instanceof nx8.C10105b) {
                writer.writeMessageSetItem(interfaceC16225c.getNumber(), ((nx8.C10105b) t).getField().toByteString());
            } else {
                writer.writeMessageSetItem(interfaceC16225c.getNumber(), t.getValue());
            }
        }
        writeUnknownFieldsHelper(this.f102901b, message, writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // p000.upe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, p000.c60.C2209b r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ysa.mergeFrom(java.lang.Object, byte[], int, int, c60$b):void");
    }

    @Override // p000.upe
    public void mergeFrom(T message, ird reader, yi5 extensionRegistry) throws IOException {
        mergeFromHelper(this.f102901b, this.f102903d, message, reader, extensionRegistry);
    }
}
