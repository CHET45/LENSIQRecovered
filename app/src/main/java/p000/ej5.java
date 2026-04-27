package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.hpi;
import p000.qsa;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class ej5 extends bj5<v27.C13828g> {

    /* JADX INFO: renamed from: ej5$a */
    public static /* synthetic */ class C5343a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33192a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f33192a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44496c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44497d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44498e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44499f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44500m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44482C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44483F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44484H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44491X.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44493Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44487M1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44490V1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44494Z1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44492Y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44489Q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44485L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44486M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33192a[hpi.EnumC6968b.f44488N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: a */
    public int mo3199a(Map.Entry<?, ?> extension) {
        return ((v27.C13828g) extension.getKey()).getNumber();
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: b */
    public Object mo3200b(zi5 extensionRegistry, qsa defaultInstance, int number) {
        return extensionRegistry.findLiteExtensionByNumber(defaultInstance, number);
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: c */
    public as5<v27.C13828g> mo3201c(Object message) {
        return ((v27.AbstractC13826e) message).extensions;
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: d */
    public as5<v27.C13828g> mo3202d(Object message) {
        return ((v27.AbstractC13826e) message).m23747j0();
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: e */
    public boolean mo3203e(qsa prototype) {
        return prototype instanceof v27.AbstractC13826e;
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: f */
    public void mo3204f(Object message) {
        mo3201c(message).makeImmutable();
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo3205g(Object obj, hrd hrdVar, Object obj2, zi5 zi5Var, as5<v27.C13828g> as5Var, UB ub, rth<UT, UB> rthVar) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        v27.C13829h c13829h = (v27.C13829h) obj2;
        int number = c13829h.getNumber();
        if (c13829h.f89770d.isRepeated() && c13829h.f89770d.isPacked()) {
            switch (C5343a.f33192a[c13829h.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    hrdVar.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    hrdVar.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    hrdVar.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    hrdVar.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    hrdVar.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    hrdVar.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    hrdVar.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    hrdVar.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    hrdVar.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    hrdVar.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    hrdVar.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    hrdVar.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    hrdVar.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    hrdVar.readEnumList(arrayList);
                    ub = (UB) hqe.m12541B(obj, number, arrayList, c13829h.f89770d.getEnumType(), ub, rthVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c13829h.f89770d.getLiteType());
            }
            as5Var.setField(c13829h.f89770d, arrayList);
        } else {
            if (c13829h.getLiteType() != hpi.EnumC6968b.f44492Y) {
                switch (C5343a.f33192a[c13829h.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(hrdVar.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(hrdVar.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(hrdVar.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(hrdVar.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(hrdVar.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(hrdVar.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(hrdVar.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(hrdVar.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(hrdVar.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(hrdVar.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(hrdVar.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(hrdVar.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(hrdVar.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = hrdVar.readBytes();
                        break;
                    case 16:
                        objValueOf = hrdVar.readString();
                        break;
                    case 17:
                        if (!c13829h.isRepeated()) {
                            Object field2 = as5Var.getField(c13829h.f89770d);
                            if (field2 instanceof v27) {
                                tpe tpeVarSchemaFor = khd.getInstance().schemaFor(field2);
                                if (!((v27) field2).m23725E()) {
                                    Object objNewInstance = tpeVarSchemaFor.newInstance();
                                    tpeVarSchemaFor.mergeFrom(objNewInstance, field2);
                                    as5Var.setField(c13829h.f89770d, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                hrdVar.mergeGroupField(field2, tpeVarSchemaFor, zi5Var);
                                return ub;
                            }
                        }
                        objValueOf = hrdVar.readGroup(c13829h.getMessageDefaultInstance().getClass(), zi5Var);
                        break;
                    case 18:
                        if (!c13829h.isRepeated()) {
                            Object field3 = as5Var.getField(c13829h.f89770d);
                            if (field3 instanceof v27) {
                                tpe tpeVarSchemaFor2 = khd.getInstance().schemaFor(field3);
                                if (!((v27) field3).m23725E()) {
                                    Object objNewInstance2 = tpeVarSchemaFor2.newInstance();
                                    tpeVarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                    as5Var.setField(c13829h.f89770d, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                hrdVar.mergeMessageField(field3, tpeVarSchemaFor2, zi5Var);
                                return ub;
                            }
                        }
                        objValueOf = hrdVar.readMessage(c13829h.getMessageDefaultInstance().getClass(), zi5Var);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = hrdVar.readInt32();
                if (c13829h.f89770d.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) hqe.m12548I(obj, number, int32, ub, rthVar);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (c13829h.isRepeated()) {
                as5Var.addRepeatedField(c13829h.f89770d, objValueOf);
            } else {
                int i = C5343a.f33192a[c13829h.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = as5Var.getField(c13829h.f89770d)) != null) {
                    objValueOf = w98.m24435d(field, objValueOf);
                }
                as5Var.setField(c13829h.f89770d, objValueOf);
            }
        }
        return ub;
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: h */
    public void mo3206h(hrd reader, Object extensionObject, zi5 extensionRegistry, as5<v27.C13828g> extensions) throws IOException {
        v27.C13829h c13829h = (v27.C13829h) extensionObject;
        extensions.setField(c13829h.f89770d, reader.readMessage(c13829h.getMessageDefaultInstance().getClass(), extensionRegistry));
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: i */
    public void mo3207i(vj1 data, Object extensionObject, zi5 extensionRegistry, as5<v27.C13828g> extensions) throws IOException {
        v27.C13829h c13829h = (v27.C13829h) extensionObject;
        qsa.InterfaceC11668a interfaceC11668aNewBuilderForType = c13829h.getMessageDefaultInstance().newBuilderForType();
        f72 f72VarNewCodedInput = data.newCodedInput();
        interfaceC11668aNewBuilderForType.mergeFrom(f72VarNewCodedInput, extensionRegistry);
        extensions.setField(c13829h.f89770d, interfaceC11668aNewBuilderForType.buildPartial());
        f72VarNewCodedInput.checkLastTagWas(0);
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: j */
    public void mo3208j(rsi writer, Map.Entry<?, ?> extension) throws IOException {
        v27.C13828g c13828g = (v27.C13828g) extension.getKey();
        if (!c13828g.isRepeated()) {
            switch (C5343a.f33192a[c13828g.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(c13828g.getNumber(), ((Double) extension.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(c13828g.getNumber(), ((Float) extension.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(c13828g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(c13828g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(c13828g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(c13828g.getNumber(), ((Boolean) extension.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(c13828g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(c13828g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(c13828g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 15:
                    writer.writeBytes(c13828g.getNumber(), (vj1) extension.getValue());
                    break;
                case 16:
                    writer.writeString(c13828g.getNumber(), (String) extension.getValue());
                    break;
                case 17:
                    writer.writeGroup(c13828g.getNumber(), extension.getValue(), khd.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
                case 18:
                    writer.writeMessage(c13828g.getNumber(), extension.getValue(), khd.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
            }
        }
        switch (C5343a.f33192a[c13828g.getLiteType().ordinal()]) {
            case 1:
                hqe.writeDoubleList(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 2:
                hqe.writeFloatList(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 3:
                hqe.writeInt64List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 4:
                hqe.writeUInt64List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 5:
                hqe.writeInt32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 6:
                hqe.writeFixed64List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 7:
                hqe.writeFixed32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 8:
                hqe.writeBoolList(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 9:
                hqe.writeUInt32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 10:
                hqe.writeSFixed32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 11:
                hqe.writeSFixed64List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 12:
                hqe.writeSInt32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 13:
                hqe.writeSInt64List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 14:
                hqe.writeInt32List(c13828g.getNumber(), (List) extension.getValue(), writer, c13828g.isPacked());
                break;
            case 15:
                hqe.writeBytesList(c13828g.getNumber(), (List) extension.getValue(), writer);
                break;
            case 16:
                hqe.writeStringList(c13828g.getNumber(), (List) extension.getValue(), writer);
                break;
            case 17:
                List list = (List) extension.getValue();
                if (list != null && !list.isEmpty()) {
                    hqe.writeGroupList(c13828g.getNumber(), (List) extension.getValue(), writer, khd.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) extension.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    hqe.writeMessageList(c13828g.getNumber(), (List) extension.getValue(), writer, khd.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // p000.bj5
    /* JADX INFO: renamed from: k */
    public void mo3209k(Object message, as5<v27.C13828g> extensions) {
        ((v27.AbstractC13826e) message).extensions = extensions;
    }
}
