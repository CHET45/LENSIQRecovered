package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.b2i;
import p000.o70;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class zi4 extends v27<zi4, C16148b> implements aj4 {
    private static final zi4 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile uhc<zi4> PARSER;
    private String document_ = "";
    private w98.InterfaceC14504k<C16149c> fieldTransforms_ = v27.m23722x();

    /* JADX INFO: renamed from: zi4$a */
    public static /* synthetic */ class C16147a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105132a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f105132a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105132a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105132a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105132a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105132a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105132a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105132a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zi4$b */
    public static final class C16148b extends v27.AbstractC13823b<zi4, C16148b> implements aj4 {
        public /* synthetic */ C16148b(C16147a c16147a) {
            this();
        }

        public C16148b addAllFieldTransforms(Iterable<? extends C16149c> iterable) {
            m23743e();
            ((zi4) this.f89756b).addAllFieldTransforms(iterable);
            return this;
        }

        public C16148b addFieldTransforms(C16149c c16149c) {
            m23743e();
            ((zi4) this.f89756b).addFieldTransforms(c16149c);
            return this;
        }

        public C16148b clearDocument() {
            m23743e();
            ((zi4) this.f89756b).clearDocument();
            return this;
        }

        public C16148b clearFieldTransforms() {
            m23743e();
            ((zi4) this.f89756b).clearFieldTransforms();
            return this;
        }

        @Override // p000.aj4
        public String getDocument() {
            return ((zi4) this.f89756b).getDocument();
        }

        @Override // p000.aj4
        public vj1 getDocumentBytes() {
            return ((zi4) this.f89756b).getDocumentBytes();
        }

        @Override // p000.aj4
        public C16149c getFieldTransforms(int i) {
            return ((zi4) this.f89756b).getFieldTransforms(i);
        }

        @Override // p000.aj4
        public int getFieldTransformsCount() {
            return ((zi4) this.f89756b).getFieldTransformsCount();
        }

        @Override // p000.aj4
        public List<C16149c> getFieldTransformsList() {
            return Collections.unmodifiableList(((zi4) this.f89756b).getFieldTransformsList());
        }

        public C16148b removeFieldTransforms(int i) {
            m23743e();
            ((zi4) this.f89756b).removeFieldTransforms(i);
            return this;
        }

        public C16148b setDocument(String str) {
            m23743e();
            ((zi4) this.f89756b).setDocument(str);
            return this;
        }

        public C16148b setDocumentBytes(vj1 vj1Var) {
            m23743e();
            ((zi4) this.f89756b).setDocumentBytes(vj1Var);
            return this;
        }

        public C16148b setFieldTransforms(int i, C16149c c16149c) {
            m23743e();
            ((zi4) this.f89756b).setFieldTransforms(i, c16149c);
            return this;
        }

        private C16148b() {
            super(zi4.DEFAULT_INSTANCE);
        }

        public C16148b addFieldTransforms(int i, C16149c c16149c) {
            m23743e();
            ((zi4) this.f89756b).addFieldTransforms(i, c16149c);
            return this;
        }

        public C16148b setFieldTransforms(int i, C16149c.a aVar) {
            m23743e();
            ((zi4) this.f89756b).setFieldTransforms(i, aVar.build());
            return this;
        }

        public C16148b addFieldTransforms(C16149c.a aVar) {
            m23743e();
            ((zi4) this.f89756b).addFieldTransforms(aVar.build());
            return this;
        }

        public C16148b addFieldTransforms(int i, C16149c.a aVar) {
            m23743e();
            ((zi4) this.f89756b).addFieldTransforms(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: zi4$c */
    public static final class C16149c extends v27<C16149c, a> implements InterfaceC16150d {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final C16149c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile uhc<C16149c> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: zi4$c$a */
        public static final class a extends v27.AbstractC13823b<C16149c, a> implements InterfaceC16150d {
            public /* synthetic */ a(C16147a c16147a) {
                this();
            }

            public a clearAppendMissingElements() {
                m23743e();
                ((C16149c) this.f89756b).clearAppendMissingElements();
                return this;
            }

            public a clearFieldPath() {
                m23743e();
                ((C16149c) this.f89756b).clearFieldPath();
                return this;
            }

            public a clearIncrement() {
                m23743e();
                ((C16149c) this.f89756b).clearIncrement();
                return this;
            }

            public a clearMaximum() {
                m23743e();
                ((C16149c) this.f89756b).clearMaximum();
                return this;
            }

            public a clearMinimum() {
                m23743e();
                ((C16149c) this.f89756b).clearMinimum();
                return this;
            }

            public a clearRemoveAllFromArray() {
                m23743e();
                ((C16149c) this.f89756b).clearRemoveAllFromArray();
                return this;
            }

            public a clearSetToServerValue() {
                m23743e();
                ((C16149c) this.f89756b).clearSetToServerValue();
                return this;
            }

            public a clearTransformType() {
                m23743e();
                ((C16149c) this.f89756b).clearTransformType();
                return this;
            }

            @Override // p000.zi4.InterfaceC16150d
            public o70 getAppendMissingElements() {
                return ((C16149c) this.f89756b).getAppendMissingElements();
            }

            @Override // p000.zi4.InterfaceC16150d
            public String getFieldPath() {
                return ((C16149c) this.f89756b).getFieldPath();
            }

            @Override // p000.zi4.InterfaceC16150d
            public vj1 getFieldPathBytes() {
                return ((C16149c) this.f89756b).getFieldPathBytes();
            }

            @Override // p000.zi4.InterfaceC16150d
            public b2i getIncrement() {
                return ((C16149c) this.f89756b).getIncrement();
            }

            @Override // p000.zi4.InterfaceC16150d
            public b2i getMaximum() {
                return ((C16149c) this.f89756b).getMaximum();
            }

            @Override // p000.zi4.InterfaceC16150d
            public b2i getMinimum() {
                return ((C16149c) this.f89756b).getMinimum();
            }

            @Override // p000.zi4.InterfaceC16150d
            public o70 getRemoveAllFromArray() {
                return ((C16149c) this.f89756b).getRemoveAllFromArray();
            }

            @Override // p000.zi4.InterfaceC16150d
            public b getSetToServerValue() {
                return ((C16149c) this.f89756b).getSetToServerValue();
            }

            @Override // p000.zi4.InterfaceC16150d
            public int getSetToServerValueValue() {
                return ((C16149c) this.f89756b).getSetToServerValueValue();
            }

            @Override // p000.zi4.InterfaceC16150d
            public c getTransformTypeCase() {
                return ((C16149c) this.f89756b).getTransformTypeCase();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasAppendMissingElements() {
                return ((C16149c) this.f89756b).hasAppendMissingElements();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasIncrement() {
                return ((C16149c) this.f89756b).hasIncrement();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasMaximum() {
                return ((C16149c) this.f89756b).hasMaximum();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasMinimum() {
                return ((C16149c) this.f89756b).hasMinimum();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasRemoveAllFromArray() {
                return ((C16149c) this.f89756b).hasRemoveAllFromArray();
            }

            @Override // p000.zi4.InterfaceC16150d
            public boolean hasSetToServerValue() {
                return ((C16149c) this.f89756b).hasSetToServerValue();
            }

            public a mergeAppendMissingElements(o70 o70Var) {
                m23743e();
                ((C16149c) this.f89756b).mergeAppendMissingElements(o70Var);
                return this;
            }

            public a mergeIncrement(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).mergeIncrement(b2iVar);
                return this;
            }

            public a mergeMaximum(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).mergeMaximum(b2iVar);
                return this;
            }

            public a mergeMinimum(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).mergeMinimum(b2iVar);
                return this;
            }

            public a mergeRemoveAllFromArray(o70 o70Var) {
                m23743e();
                ((C16149c) this.f89756b).mergeRemoveAllFromArray(o70Var);
                return this;
            }

            public a setAppendMissingElements(o70 o70Var) {
                m23743e();
                ((C16149c) this.f89756b).setAppendMissingElements(o70Var);
                return this;
            }

            public a setFieldPath(String str) {
                m23743e();
                ((C16149c) this.f89756b).setFieldPath(str);
                return this;
            }

            public a setFieldPathBytes(vj1 vj1Var) {
                m23743e();
                ((C16149c) this.f89756b).setFieldPathBytes(vj1Var);
                return this;
            }

            public a setIncrement(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).setIncrement(b2iVar);
                return this;
            }

            public a setMaximum(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).setMaximum(b2iVar);
                return this;
            }

            public a setMinimum(b2i b2iVar) {
                m23743e();
                ((C16149c) this.f89756b).setMinimum(b2iVar);
                return this;
            }

            public a setRemoveAllFromArray(o70 o70Var) {
                m23743e();
                ((C16149c) this.f89756b).setRemoveAllFromArray(o70Var);
                return this;
            }

            public a setSetToServerValue(b bVar) {
                m23743e();
                ((C16149c) this.f89756b).setSetToServerValue(bVar);
                return this;
            }

            public a setSetToServerValueValue(int i) {
                m23743e();
                ((C16149c) this.f89756b).setSetToServerValueValue(i);
                return this;
            }

            private a() {
                super(C16149c.DEFAULT_INSTANCE);
            }

            public a setAppendMissingElements(o70.C10211b c10211b) {
                m23743e();
                ((C16149c) this.f89756b).setAppendMissingElements(c10211b.build());
                return this;
            }

            public a setIncrement(b2i.C1712b c1712b) {
                m23743e();
                ((C16149c) this.f89756b).setIncrement(c1712b.build());
                return this;
            }

            public a setMaximum(b2i.C1712b c1712b) {
                m23743e();
                ((C16149c) this.f89756b).setMaximum(c1712b.build());
                return this;
            }

            public a setMinimum(b2i.C1712b c1712b) {
                m23743e();
                ((C16149c) this.f89756b).setMinimum(c1712b.build());
                return this;
            }

            public a setRemoveAllFromArray(o70.C10211b c10211b) {
                m23743e();
                ((C16149c) this.f89756b).setRemoveAllFromArray(c10211b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: zi4$c$b */
        public enum b implements w98.InterfaceC14497d {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e */
            public static final int f105137e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f105138f = 1;

            /* JADX INFO: renamed from: m */
            public static final w98.InterfaceC14498e<b> f105139m = new a();

            /* JADX INFO: renamed from: a */
            public final int f105140a;

            /* JADX INFO: renamed from: zi4$c$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: zi4$c$b$b, reason: collision with other inner class name */
            public static final class C16580b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f105141a = new C16580b();

                private C16580b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f105140a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f105139m;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16580b.f105141a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f105140a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: zi4$c$c */
        public enum c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f105150a;

            c(int i) {
                this.f105150a = i;
            }

            public static c forNumber(int i) {
                if (i == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f105150a;
            }

            @Deprecated
            public static c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C16149c c16149c = new C16149c();
            DEFAULT_INSTANCE = c16149c;
            v27.m23715h0(C16149c.class, c16149c);
        }

        private C16149c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncrement() {
            if (this.transformTypeCase_ == 3) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximum() {
            if (this.transformTypeCase_ == 4) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimum() {
            if (this.transformTypeCase_ == 5) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransformType() {
            this.transformTypeCase_ = 0;
            this.transformType_ = null;
        }

        public static C16149c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppendMissingElements(o70 o70Var) {
            o70Var.getClass();
            if (this.transformTypeCase_ != 6 || this.transformType_ == o70.getDefaultInstance()) {
                this.transformType_ = o70Var;
            } else {
                this.transformType_ = o70.newBuilder((o70) this.transformType_).mergeFrom(o70Var).buildPartial();
            }
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIncrement(b2i b2iVar) {
            b2iVar.getClass();
            if (this.transformTypeCase_ != 3 || this.transformType_ == b2i.getDefaultInstance()) {
                this.transformType_ = b2iVar;
            } else {
                this.transformType_ = b2i.newBuilder((b2i) this.transformType_).mergeFrom(b2iVar).buildPartial();
            }
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMaximum(b2i b2iVar) {
            b2iVar.getClass();
            if (this.transformTypeCase_ != 4 || this.transformType_ == b2i.getDefaultInstance()) {
                this.transformType_ = b2iVar;
            } else {
                this.transformType_ = b2i.newBuilder((b2i) this.transformType_).mergeFrom(b2iVar).buildPartial();
            }
            this.transformTypeCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMinimum(b2i b2iVar) {
            b2iVar.getClass();
            if (this.transformTypeCase_ != 5 || this.transformType_ == b2i.getDefaultInstance()) {
                this.transformType_ = b2iVar;
            } else {
                this.transformType_ = b2i.newBuilder((b2i) this.transformType_).mergeFrom(b2iVar).buildPartial();
            }
            this.transformTypeCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRemoveAllFromArray(o70 o70Var) {
            o70Var.getClass();
            if (this.transformTypeCase_ != 7 || this.transformType_ == o70.getDefaultInstance()) {
                this.transformType_ = o70Var;
            } else {
                this.transformType_ = o70.newBuilder((o70) this.transformType_).mergeFrom(o70Var).buildPartial();
            }
            this.transformTypeCase_ = 7;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C16149c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C16149c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C16149c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C16149c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C16149c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppendMissingElements(o70 o70Var) {
            o70Var.getClass();
            this.transformType_ = o70Var;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPath(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPathBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.fieldPath_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncrement(b2i b2iVar) {
            b2iVar.getClass();
            this.transformType_ = b2iVar;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximum(b2i b2iVar) {
            b2iVar.getClass();
            this.transformType_ = b2iVar;
            this.transformTypeCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimum(b2i b2iVar) {
            b2iVar.getClass();
            this.transformType_ = b2iVar;
            this.transformTypeCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemoveAllFromArray(o70 o70Var) {
            o70Var.getClass();
            this.transformType_ = o70Var;
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetToServerValue(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.getNumber());
            this.transformTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetToServerValueValue(int i) {
            this.transformTypeCase_ = 2;
            this.transformType_ = Integer.valueOf(i);
        }

        @Override // p000.zi4.InterfaceC16150d
        public o70 getAppendMissingElements() {
            return this.transformTypeCase_ == 6 ? (o70) this.transformType_ : o70.getDefaultInstance();
        }

        @Override // p000.zi4.InterfaceC16150d
        public String getFieldPath() {
            return this.fieldPath_;
        }

        @Override // p000.zi4.InterfaceC16150d
        public vj1 getFieldPathBytes() {
            return vj1.copyFromUtf8(this.fieldPath_);
        }

        @Override // p000.zi4.InterfaceC16150d
        public b2i getIncrement() {
            return this.transformTypeCase_ == 3 ? (b2i) this.transformType_ : b2i.getDefaultInstance();
        }

        @Override // p000.zi4.InterfaceC16150d
        public b2i getMaximum() {
            return this.transformTypeCase_ == 4 ? (b2i) this.transformType_ : b2i.getDefaultInstance();
        }

        @Override // p000.zi4.InterfaceC16150d
        public b2i getMinimum() {
            return this.transformTypeCase_ == 5 ? (b2i) this.transformType_ : b2i.getDefaultInstance();
        }

        @Override // p000.zi4.InterfaceC16150d
        public o70 getRemoveAllFromArray() {
            return this.transformTypeCase_ == 7 ? (o70) this.transformType_ : o70.getDefaultInstance();
        }

        @Override // p000.zi4.InterfaceC16150d
        public b getSetToServerValue() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b bVarForNumber = b.forNumber(((Integer) this.transformType_).intValue());
            return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
        }

        @Override // p000.zi4.InterfaceC16150d
        public int getSetToServerValueValue() {
            if (this.transformTypeCase_ == 2) {
                return ((Integer) this.transformType_).intValue();
            }
            return 0;
        }

        @Override // p000.zi4.InterfaceC16150d
        public c getTransformTypeCase() {
            return c.forNumber(this.transformTypeCase_);
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasAppendMissingElements() {
            return this.transformTypeCase_ == 6;
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasIncrement() {
            return this.transformTypeCase_ == 3;
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasMaximum() {
            return this.transformTypeCase_ == 4;
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasMinimum() {
            return this.transformTypeCase_ == 5;
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasRemoveAllFromArray() {
            return this.transformTypeCase_ == 7;
        }

        @Override // p000.zi4.InterfaceC16150d
        public boolean hasSetToServerValue() {
            return this.transformTypeCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C16147a c16147a = null;
            switch (C16147a.f105132a[enumC13830i.ordinal()]) {
                case 1:
                    return new C16149c();
                case 2:
                    return new a(c16147a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", b2i.class, b2i.class, b2i.class, o70.class, o70.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C16149c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C16149c.class) {
                            try {
                                c13824c = PARSER;
                                if (c13824c == null) {
                                    c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                    PARSER = c13824c;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return c13824c;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C16149c c16149c) {
            return DEFAULT_INSTANCE.m23739o(c16149c);
        }

        public static C16149c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16149c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16149c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C16149c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C16149c parseFrom(vj1 vj1Var) throws ce8 {
            return (C16149c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C16149c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C16149c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C16149c parseFrom(byte[] bArr) throws ce8 {
            return (C16149c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C16149c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C16149c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C16149c parseFrom(InputStream inputStream) throws IOException {
            return (C16149c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C16149c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16149c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16149c parseFrom(f72 f72Var) throws IOException {
            return (C16149c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C16149c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C16149c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: zi4$d */
    public interface InterfaceC16150d extends rsa {
        o70 getAppendMissingElements();

        String getFieldPath();

        vj1 getFieldPathBytes();

        b2i getIncrement();

        b2i getMaximum();

        b2i getMinimum();

        o70 getRemoveAllFromArray();

        C16149c.b getSetToServerValue();

        int getSetToServerValueValue();

        C16149c.c getTransformTypeCase();

        boolean hasAppendMissingElements();

        boolean hasIncrement();

        boolean hasMaximum();

        boolean hasMinimum();

        boolean hasRemoveAllFromArray();

        boolean hasSetToServerValue();
    }

    static {
        zi4 zi4Var = new zi4();
        DEFAULT_INSTANCE = zi4Var;
        v27.m23715h0(zi4.class, zi4Var);
    }

    private zi4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTransforms(Iterable<? extends C16149c> iterable) {
        ensureFieldTransformsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.fieldTransforms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldTransforms(C16149c c16149c) {
        c16149c.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(c16149c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = getDefaultInstance().getDocument();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldTransforms() {
        this.fieldTransforms_ = v27.m23722x();
    }

    private void ensureFieldTransformsIsMutable() {
        w98.InterfaceC14504k<C16149c> interfaceC14504k = this.fieldTransforms_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.fieldTransforms_ = v27.m23698P(interfaceC14504k);
    }

    public static zi4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C16148b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static zi4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (zi4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static zi4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (zi4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<zi4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldTransforms(int i) {
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(String str) {
        str.getClass();
        this.document_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.document_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldTransforms(int i, C16149c c16149c) {
        c16149c.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.set(i, c16149c);
    }

    @Override // p000.aj4
    public String getDocument() {
        return this.document_;
    }

    @Override // p000.aj4
    public vj1 getDocumentBytes() {
        return vj1.copyFromUtf8(this.document_);
    }

    @Override // p000.aj4
    public C16149c getFieldTransforms(int i) {
        return this.fieldTransforms_.get(i);
    }

    @Override // p000.aj4
    public int getFieldTransformsCount() {
        return this.fieldTransforms_.size();
    }

    @Override // p000.aj4
    public List<C16149c> getFieldTransformsList() {
        return this.fieldTransforms_;
    }

    public InterfaceC16150d getFieldTransformsOrBuilder(int i) {
        return this.fieldTransforms_.get(i);
    }

    public List<? extends InterfaceC16150d> getFieldTransformsOrBuilderList() {
        return this.fieldTransforms_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C16147a c16147a = null;
        switch (C16147a.f105132a[enumC13830i.ordinal()]) {
            case 1:
                return new zi4();
            case 2:
                return new C16148b(c16147a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", C16149c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<zi4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (zi4.class) {
                        try {
                            c13824c = PARSER;
                            if (c13824c == null) {
                                c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                PARSER = c13824c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13824c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C16148b newBuilder(zi4 zi4Var) {
        return DEFAULT_INSTANCE.m23739o(zi4Var);
    }

    public static zi4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zi4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zi4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (zi4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static zi4 parseFrom(vj1 vj1Var) throws ce8 {
        return (zi4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldTransforms(int i, C16149c c16149c) {
        c16149c.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(i, c16149c);
    }

    public static zi4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (zi4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static zi4 parseFrom(byte[] bArr) throws ce8 {
        return (zi4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static zi4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (zi4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static zi4 parseFrom(InputStream inputStream) throws IOException {
        return (zi4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static zi4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zi4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zi4 parseFrom(f72 f72Var) throws IOException {
        return (zi4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static zi4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (zi4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
