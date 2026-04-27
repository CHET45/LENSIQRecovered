package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.gpi;
import p000.psa;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class dj5 extends cj5<u27.C13329g> {

    /* JADX INFO: renamed from: dj5$a */
    public static /* synthetic */ class C4804a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29779a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f29779a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40762c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40763d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40764e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40765f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40766m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40748C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40749F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40750H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40757X.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40759Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40753M1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40756V1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40760Z1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40758Y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40755Q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40751L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40752M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29779a[gpi.EnumC6460b.f40754N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: a */
    public int mo3990a(Map.Entry<?, ?> extension) {
        return ((u27.C13329g) extension.getKey()).getNumber();
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: b */
    public Object mo3991b(yi5 extensionRegistry, psa defaultInstance, int number) {
        return extensionRegistry.findLiteExtensionByNumber(defaultInstance, number);
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: c */
    public zr5<u27.C13329g> mo3992c(Object message) {
        return ((u27.AbstractC13327e) message).extensions;
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: d */
    public zr5<u27.C13329g> mo3993d(Object message) {
        return ((u27.AbstractC13327e) message).m23062i0();
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: e */
    public boolean mo3994e(psa prototype) {
        return prototype instanceof u27.AbstractC13327e;
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: f */
    public void mo3995f(Object message) {
        mo3992c(message).makeImmutable();
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo3996g(Object obj, ird irdVar, Object obj2, yi5 yi5Var, zr5<u27.C13329g> zr5Var, UB ub, sth<UT, UB> sthVar) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        u27.C13330h c13330h = (u27.C13330h) obj2;
        int number = c13330h.getNumber();
        if (c13330h.f86621d.isRepeated() && c13330h.f86621d.isPacked()) {
            switch (C4804a.f29779a[c13330h.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    irdVar.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    irdVar.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    irdVar.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    irdVar.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    irdVar.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    irdVar.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    irdVar.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    irdVar.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    irdVar.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    irdVar.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    irdVar.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    irdVar.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    irdVar.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    irdVar.readEnumList(arrayList);
                    ub = (UB) iqe.m13306B(obj, number, arrayList, c13330h.f86621d.getEnumType(), ub, sthVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c13330h.f86621d.getLiteType());
            }
            zr5Var.setField(c13330h.f86621d, arrayList);
        } else {
            if (c13330h.getLiteType() != gpi.EnumC6460b.f40758Y) {
                switch (C4804a.f29779a[c13330h.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(irdVar.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(irdVar.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(irdVar.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(irdVar.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(irdVar.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(irdVar.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(irdVar.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(irdVar.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(irdVar.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(irdVar.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(irdVar.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(irdVar.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(irdVar.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = irdVar.readBytes();
                        break;
                    case 16:
                        objValueOf = irdVar.readString();
                        break;
                    case 17:
                        if (!c13330h.isRepeated()) {
                            Object field2 = zr5Var.getField(c13330h.f86621d);
                            if (field2 instanceof u27) {
                                upe upeVarSchemaFor = lhd.getInstance().schemaFor(field2);
                                if (!((u27) field2).m23040D()) {
                                    Object objNewInstance = upeVarSchemaFor.newInstance();
                                    upeVarSchemaFor.mergeFrom(objNewInstance, field2);
                                    zr5Var.setField(c13330h.f86621d, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                irdVar.mergeGroupField(field2, upeVarSchemaFor, yi5Var);
                                return ub;
                            }
                        }
                        objValueOf = irdVar.readGroup(c13330h.getMessageDefaultInstance().getClass(), yi5Var);
                        break;
                    case 18:
                        if (!c13330h.isRepeated()) {
                            Object field3 = zr5Var.getField(c13330h.f86621d);
                            if (field3 instanceof u27) {
                                upe upeVarSchemaFor2 = lhd.getInstance().schemaFor(field3);
                                if (!((u27) field3).m23040D()) {
                                    Object objNewInstance2 = upeVarSchemaFor2.newInstance();
                                    upeVarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                    zr5Var.setField(c13330h.f86621d, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                irdVar.mergeMessageField(field3, upeVarSchemaFor2, yi5Var);
                                return ub;
                            }
                        }
                        objValueOf = irdVar.readMessage(c13330h.getMessageDefaultInstance().getClass(), yi5Var);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = irdVar.readInt32();
                if (c13330h.f86621d.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) iqe.m13313I(obj, number, int32, ub, sthVar);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (c13330h.isRepeated()) {
                zr5Var.addRepeatedField(c13330h.f86621d, objValueOf);
            } else {
                int i = C4804a.f29779a[c13330h.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = zr5Var.getField(c13330h.f86621d)) != null) {
                    objValueOf = v98.m23884d(field, objValueOf);
                }
                zr5Var.setField(c13330h.f86621d, objValueOf);
            }
        }
        return ub;
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: h */
    public void mo3997h(ird reader, Object extensionObject, yi5 extensionRegistry, zr5<u27.C13329g> extensions) throws IOException {
        u27.C13330h c13330h = (u27.C13330h) extensionObject;
        extensions.setField(c13330h.f86621d, reader.readMessage(c13330h.getMessageDefaultInstance().getClass(), extensionRegistry));
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: i */
    public void mo3998i(wj1 data, Object extensionObject, yi5 extensionRegistry, zr5<u27.C13329g> extensions) throws IOException {
        u27.C13330h c13330h = (u27.C13330h) extensionObject;
        psa.InterfaceC11106a interfaceC11106aNewBuilderForType = c13330h.getMessageDefaultInstance().newBuilderForType();
        e72 e72VarNewCodedInput = data.newCodedInput();
        interfaceC11106aNewBuilderForType.mergeFrom(e72VarNewCodedInput, extensionRegistry);
        extensions.setField(c13330h.f86621d, interfaceC11106aNewBuilderForType.buildPartial());
        e72VarNewCodedInput.checkLastTagWas(0);
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: j */
    public void mo3999j(qsi writer, Map.Entry<?, ?> extension) throws IOException {
        u27.C13329g c13329g = (u27.C13329g) extension.getKey();
        if (!c13329g.isRepeated()) {
            switch (C4804a.f29779a[c13329g.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(c13329g.getNumber(), ((Double) extension.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(c13329g.getNumber(), ((Float) extension.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(c13329g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(c13329g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(c13329g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(c13329g.getNumber(), ((Boolean) extension.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(c13329g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(c13329g.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(c13329g.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 15:
                    writer.writeBytes(c13329g.getNumber(), (wj1) extension.getValue());
                    break;
                case 16:
                    writer.writeString(c13329g.getNumber(), (String) extension.getValue());
                    break;
                case 17:
                    writer.writeGroup(c13329g.getNumber(), extension.getValue(), lhd.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
                case 18:
                    writer.writeMessage(c13329g.getNumber(), extension.getValue(), lhd.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
            }
        }
        switch (C4804a.f29779a[c13329g.getLiteType().ordinal()]) {
            case 1:
                iqe.writeDoubleList(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 2:
                iqe.writeFloatList(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 3:
                iqe.writeInt64List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 4:
                iqe.writeUInt64List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 5:
                iqe.writeInt32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 6:
                iqe.writeFixed64List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 7:
                iqe.writeFixed32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 8:
                iqe.writeBoolList(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 9:
                iqe.writeUInt32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 10:
                iqe.writeSFixed32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 11:
                iqe.writeSFixed64List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 12:
                iqe.writeSInt32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 13:
                iqe.writeSInt64List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 14:
                iqe.writeInt32List(c13329g.getNumber(), (List) extension.getValue(), writer, c13329g.isPacked());
                break;
            case 15:
                iqe.writeBytesList(c13329g.getNumber(), (List) extension.getValue(), writer);
                break;
            case 16:
                iqe.writeStringList(c13329g.getNumber(), (List) extension.getValue(), writer);
                break;
            case 17:
                List list = (List) extension.getValue();
                if (list != null && !list.isEmpty()) {
                    iqe.writeGroupList(c13329g.getNumber(), (List) extension.getValue(), writer, lhd.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) extension.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    iqe.writeMessageList(c13329g.getNumber(), (List) extension.getValue(), writer, lhd.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // p000.cj5
    /* JADX INFO: renamed from: k */
    public void mo4000k(Object message, zr5<u27.C13329g> extensions) {
        ((u27.AbstractC13327e) message).extensions = extensions;
    }
}
