package p000;

import java.io.IOException;
import p000.as5;
import p000.hpi;
import p000.ox8;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class xsa<T> implements tpe<T> {

    /* JADX INFO: renamed from: a */
    public final qsa f99138a;

    /* JADX INFO: renamed from: b */
    public final rth<?, ?> f99139b;

    /* JADX INFO: renamed from: c */
    public final boolean f99140c;

    /* JADX INFO: renamed from: d */
    public final bj5<?> f99141d;

    private xsa(rth<?, ?> unknownFieldSchema, bj5<?> extensionSchema, qsa defaultInstance) {
        this.f99139b = unknownFieldSchema;
        this.f99140c = extensionSchema.mo3203e(defaultInstance);
        this.f99141d = extensionSchema;
        this.f99138a = defaultInstance;
    }

    /* JADX INFO: renamed from: a */
    public static <T> xsa<T> m25443a(rth<?, ?> unknownFieldSchema, bj5<?> extensionSchema, qsa defaultInstance) {
        return new xsa<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(rth<UT, UB> schema, T message) {
        return schema.mo21530i(schema.mo21528g(message));
    }

    private <UT, UB, ET extends as5.InterfaceC1587c<ET>> void mergeFromHelper(rth<UT, UB> unknownFieldSchema, bj5<ET> extensionSchema, T message, hrd reader, zi5 extensionRegistry) throws IOException {
        UB ubMo21527f = unknownFieldSchema.mo21527f(message);
        as5<ET> as5VarMo3202d = extensionSchema.mo3202d(message);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(reader, extensionRegistry, extensionSchema, as5VarMo3202d, unknownFieldSchema, ubMo21527f)) {
                    return;
                }
            } finally {
                unknownFieldSchema.mo21535n(message, ubMo21527f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends as5.InterfaceC1587c<ET>> boolean parseMessageSetItemOrUnknownField(hrd reader, zi5 extensionRegistry, bj5<ET> extensionSchema, as5<ET> extensions, rth<UT, UB> unknownFieldSchema, UB unknownFields) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != hpi.f44477q) {
            if (hpi.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objMo3200b = extensionSchema.mo3200b(extensionRegistry, this.f99138a, hpi.getTagFieldNumber(tag));
            if (objMo3200b == null) {
                return unknownFieldSchema.m21533l(unknownFields, reader, 0);
            }
            extensionSchema.mo3206h(reader, objMo3200b, extensionRegistry, extensions);
            return true;
        }
        Object objMo3200b2 = null;
        vj1 bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == hpi.f44479s) {
                uInt32 = reader.readUInt32();
                objMo3200b2 = extensionSchema.mo3200b(extensionRegistry, this.f99138a, uInt32);
            } else if (tag2 == hpi.f44480t) {
                if (objMo3200b2 != null) {
                    extensionSchema.mo3206h(reader, objMo3200b2, extensionRegistry, extensions);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != hpi.f44478r) {
            throw ce8.m3919b();
        }
        if (bytes != null) {
            if (objMo3200b2 != null) {
                extensionSchema.mo3207i(bytes, objMo3200b2, extensionRegistry, extensions);
            } else {
                unknownFieldSchema.mo21525d(unknownFields, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(rth<UT, UB> unknownFieldSchema, T message, rsi writer) throws IOException {
        unknownFieldSchema.mo21539r(unknownFieldSchema.mo21528g(message), writer);
    }

    @Override // p000.tpe
    public boolean equals(T message, T other) {
        if (!this.f99139b.mo21528g(message).equals(this.f99139b.mo21528g(other))) {
            return false;
        }
        if (this.f99140c) {
            return this.f99141d.mo3201c(message).equals(this.f99141d.mo3201c(other));
        }
        return true;
    }

    @Override // p000.tpe
    public int getSerializedSize(T message) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.f99139b, message);
        return this.f99140c ? unknownFieldsSerializedSize + this.f99141d.mo3201c(message).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // p000.tpe
    public int hashCode(T message) {
        int iHashCode = this.f99139b.mo21528g(message).hashCode();
        return this.f99140c ? (iHashCode * 53) + this.f99141d.mo3201c(message).hashCode() : iHashCode;
    }

    @Override // p000.tpe
    public final boolean isInitialized(T message) {
        return this.f99141d.mo3201c(message).isInitialized();
    }

    @Override // p000.tpe
    public void makeImmutable(T message) {
        this.f99139b.mo21531j(message);
        this.f99141d.mo3204f(message);
    }

    @Override // p000.tpe
    public void mergeFrom(T message, T other) {
        hqe.m12546G(this.f99139b, message, other);
        if (this.f99140c) {
            hqe.m12544E(this.f99141d, message, other);
        }
    }

    @Override // p000.tpe
    public T newInstance() {
        qsa qsaVar = this.f99138a;
        return qsaVar instanceof v27 ? (T) ((v27) qsaVar).m23731R() : (T) qsaVar.newBuilderForType().buildPartial();
    }

    @Override // p000.tpe
    public void writeTo(T message, rsi writer) throws IOException {
        for (T t : this.f99141d.mo3201c(message)) {
            as5.InterfaceC1587c interfaceC1587c = (as5.InterfaceC1587c) t.getKey();
            if (interfaceC1587c.getLiteJavaType() != hpi.EnumC6969c.MESSAGE || interfaceC1587c.isRepeated() || interfaceC1587c.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t instanceof ox8.C10708b) {
                writer.writeMessageSetItem(interfaceC1587c.getNumber(), ((ox8.C10708b) t).getField().toByteString());
            } else {
                writer.writeMessageSetItem(interfaceC1587c.getNumber(), t.getValue());
            }
        }
        writeUnknownFieldsHelper(this.f99139b, message, writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // p000.tpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, p000.d60.C4625b r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xsa.mergeFrom(java.lang.Object, byte[], int, int, d60$b):void");
    }

    @Override // p000.tpe
    public void mergeFrom(T message, hrd reader, zi5 extensionRegistry) throws IOException {
        mergeFromHelper(this.f99139b, this.f99141d, message, reader, extensionRegistry);
    }
}
