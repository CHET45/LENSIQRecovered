package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.a54;
import p000.da9;
import p000.dde;
import p000.fa9;
import p000.fde;
import p000.h47;
import p000.iwh;
import p000.k01;
import p000.lae;
import p000.m01;
import p000.nh4;
import p000.o89;
import p000.ow0;
import p000.q89;
import p000.qw0;
import p000.qz4;
import p000.u89;
import p000.v27;
import p000.v53;
import p000.w89;
import p000.w98;
import p000.wb2;
import p000.yb2;

/* JADX INFO: loaded from: classes5.dex */
public final class aj3 {

    /* JADX INFO: renamed from: aj3$a */
    public static /* synthetic */ class C0275a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1716a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f1716a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1716a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1716a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1716a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1716a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1716a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1716a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: aj3$b */
    public static final class C0276b extends v27<C0276b, b> implements InterfaceC0277c {
        public static final int ACTION_ID_FIELD_NUMBER = 200;
        private static final C0276b DEFAULT_INSTANCE;
        public static final int FIRESTORE_V1_ACTION_FIELD_NUMBER = 3;
        private static volatile uhc<C0276b> PARSER = null;
        public static final int VALIDATION_RULE_FIELD_NUMBER = 201;
        private int actionCase_ = 0;
        private int actionId_;
        private Object action_;
        private int bitField0_;
        private C0288n validationRule_;

        /* JADX INFO: renamed from: aj3$b$a */
        public enum a {
            FIRESTORE_V1_ACTION(3),
            ACTION_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f1720a;

            a(int i) {
                this.f1720a = i;
            }

            public static a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return FIRESTORE_V1_ACTION;
            }

            public int getNumber() {
                return this.f1720a;
            }

            @Deprecated
            public static a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: aj3$b$b */
        public static final class b extends v27.AbstractC13823b<C0276b, b> implements InterfaceC0277c {
            public /* synthetic */ b(C0275a c0275a) {
                this();
            }

            public b clearAction() {
                m23743e();
                ((C0276b) this.f89756b).clearAction();
                return this;
            }

            public b clearActionId() {
                m23743e();
                ((C0276b) this.f89756b).clearActionId();
                return this;
            }

            public b clearFirestoreV1Action() {
                m23743e();
                ((C0276b) this.f89756b).clearFirestoreV1Action();
                return this;
            }

            public b clearValidationRule() {
                m23743e();
                ((C0276b) this.f89756b).clearValidationRule();
                return this;
            }

            @Override // p000.aj3.InterfaceC0277c
            public a getActionCase() {
                return ((C0276b) this.f89756b).getActionCase();
            }

            @Override // p000.aj3.InterfaceC0277c
            public int getActionId() {
                return ((C0276b) this.f89756b).getActionId();
            }

            @Override // p000.aj3.InterfaceC0277c
            public C0278d getFirestoreV1Action() {
                return ((C0276b) this.f89756b).getFirestoreV1Action();
            }

            @Override // p000.aj3.InterfaceC0277c
            public C0288n getValidationRule() {
                return ((C0276b) this.f89756b).getValidationRule();
            }

            @Override // p000.aj3.InterfaceC0277c
            public boolean hasFirestoreV1Action() {
                return ((C0276b) this.f89756b).hasFirestoreV1Action();
            }

            @Override // p000.aj3.InterfaceC0277c
            public boolean hasValidationRule() {
                return ((C0276b) this.f89756b).hasValidationRule();
            }

            public b mergeFirestoreV1Action(C0278d c0278d) {
                m23743e();
                ((C0276b) this.f89756b).mergeFirestoreV1Action(c0278d);
                return this;
            }

            public b mergeValidationRule(C0288n c0288n) {
                m23743e();
                ((C0276b) this.f89756b).mergeValidationRule(c0288n);
                return this;
            }

            public b setActionId(int i) {
                m23743e();
                ((C0276b) this.f89756b).setActionId(i);
                return this;
            }

            public b setFirestoreV1Action(C0278d c0278d) {
                m23743e();
                ((C0276b) this.f89756b).setFirestoreV1Action(c0278d);
                return this;
            }

            public b setValidationRule(C0288n c0288n) {
                m23743e();
                ((C0276b) this.f89756b).setValidationRule(c0288n);
                return this;
            }

            private b() {
                super(C0276b.DEFAULT_INSTANCE);
            }

            public b setFirestoreV1Action(C0278d.f fVar) {
                m23743e();
                ((C0276b) this.f89756b).setFirestoreV1Action(fVar.build());
                return this;
            }

            public b setValidationRule(C0288n.a aVar) {
                m23743e();
                ((C0276b) this.f89756b).setValidationRule(aVar.build());
                return this;
            }
        }

        static {
            C0276b c0276b = new C0276b();
            DEFAULT_INSTANCE = c0276b;
            v27.m23715h0(C0276b.class, c0276b);
        }

        private C0276b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActionId() {
            this.actionId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirestoreV1Action() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidationRule() {
            this.validationRule_ = null;
            this.bitField0_ &= -2;
        }

        public static C0276b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFirestoreV1Action(C0278d c0278d) {
            c0278d.getClass();
            if (this.actionCase_ != 3 || this.action_ == C0278d.getDefaultInstance()) {
                this.action_ = c0278d;
            } else {
                this.action_ = C0278d.newBuilder((C0278d) this.action_).mergeFrom(c0278d).buildPartial();
            }
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValidationRule(C0288n c0288n) {
            c0288n.getClass();
            C0288n c0288n2 = this.validationRule_;
            if (c0288n2 == null || c0288n2 == C0288n.getDefaultInstance()) {
                this.validationRule_ = c0288n;
            } else {
                this.validationRule_ = C0288n.newBuilder(this.validationRule_).mergeFrom(c0288n).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0276b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0276b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0276b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0276b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0276b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionId(int i) {
            this.actionId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirestoreV1Action(C0278d c0278d) {
            c0278d.getClass();
            this.action_ = c0278d;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValidationRule(C0288n c0288n) {
            c0288n.getClass();
            this.validationRule_ = c0288n;
            this.bitField0_ |= 1;
        }

        @Override // p000.aj3.InterfaceC0277c
        public a getActionCase() {
            return a.forNumber(this.actionCase_);
        }

        @Override // p000.aj3.InterfaceC0277c
        public int getActionId() {
            return this.actionId_;
        }

        @Override // p000.aj3.InterfaceC0277c
        public C0278d getFirestoreV1Action() {
            return this.actionCase_ == 3 ? (C0278d) this.action_ : C0278d.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0277c
        public C0288n getValidationRule() {
            C0288n c0288n = this.validationRule_;
            return c0288n == null ? C0288n.getDefaultInstance() : c0288n;
        }

        @Override // p000.aj3.InterfaceC0277c
        public boolean hasFirestoreV1Action() {
            return this.actionCase_ == 3;
        }

        @Override // p000.aj3.InterfaceC0277c
        public boolean hasValidationRule() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0276b();
                case 2:
                    return new b(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0003É\u0003\u0000\u0000\u0000\u0003<\u0000È\u0004Éဉ\u0000", new Object[]{"action_", "actionCase_", "bitField0_", C0278d.class, "actionId_", "validationRule_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0276b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0276b.class) {
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

        public static b newBuilder(C0276b c0276b) {
            return DEFAULT_INSTANCE.m23739o(c0276b);
        }

        public static C0276b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0276b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0276b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0276b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0276b parseFrom(vj1 vj1Var) throws ce8 {
            return (C0276b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0276b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0276b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0276b parseFrom(byte[] bArr) throws ce8 {
            return (C0276b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0276b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0276b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0276b parseFrom(InputStream inputStream) throws IOException {
            return (C0276b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0276b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0276b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0276b parseFrom(f72 f72Var) throws IOException {
            return (C0276b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0276b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0276b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$c */
    public interface InterfaceC0277c extends rsa {
        C0276b.a getActionCase();

        int getActionId();

        C0278d getFirestoreV1Action();

        C0288n getValidationRule();

        boolean hasFirestoreV1Action();

        boolean hasValidationRule();
    }

    /* JADX INFO: renamed from: aj3$d */
    public static final class C0278d extends v27<C0278d, f> implements InterfaceC0279e {
        public static final int BATCH_GET_DOCUMENTS_FIELD_NUMBER = 10;
        public static final int BEGIN_TRANSACTION_FIELD_NUMBER = 6;
        public static final int COMMIT_FIELD_NUMBER = 7;
        public static final int CREATE_DOCUMENT_FIELD_NUMBER = 3;
        public static final int DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER = 202;
        private static final C0278d DEFAULT_INSTANCE;
        public static final int DELETE_DOCUMENT_FIELD_NUMBER = 5;
        public static final int GET_DOCUMENT_FIELD_NUMBER = 1;
        public static final int LISTEN_FIELD_NUMBER = 12;
        public static final int LIST_COLLECTION_IDS_FIELD_NUMBER = 9;
        public static final int LIST_DOCUMENTS_FIELD_NUMBER = 2;
        public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 203;
        private static volatile uhc<C0278d> PARSER = null;
        public static final int REMOVE_LISTEN_FIELD_NUMBER = 13;
        public static final int ROLLBACK_FIELD_NUMBER = 8;
        public static final int RUN_QUERY_FIELD_NUMBER = 11;
        public static final int STATUS_FIELD_NUMBER = 201;
        public static final int UPDATE_DOCUMENT_FIELD_NUMBER = 4;
        private Object action_;
        private int bitField0_;
        private a0 databaseContentsBeforeAction_;
        private C0282h status_;
        private int actionCase_ = 0;
        private w98.InterfaceC14504k<u> matchingDocuments_ = v27.m23722x();

        /* JADX INFO: renamed from: aj3$d$a */
        public enum a {
            GET_DOCUMENT(1),
            LIST_DOCUMENTS(2),
            CREATE_DOCUMENT(3),
            UPDATE_DOCUMENT(4),
            DELETE_DOCUMENT(5),
            BEGIN_TRANSACTION(6),
            COMMIT(7),
            ROLLBACK(8),
            LIST_COLLECTION_IDS(9),
            BATCH_GET_DOCUMENTS(10),
            RUN_QUERY(11),
            LISTEN(12),
            REMOVE_LISTEN(13),
            ACTION_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f1736a;

            a(int i) {
                this.f1736a = i;
            }

            public static a forNumber(int i) {
                switch (i) {
                    case 0:
                        return ACTION_NOT_SET;
                    case 1:
                        return GET_DOCUMENT;
                    case 2:
                        return LIST_DOCUMENTS;
                    case 3:
                        return CREATE_DOCUMENT;
                    case 4:
                        return UPDATE_DOCUMENT;
                    case 5:
                        return DELETE_DOCUMENT;
                    case 6:
                        return BEGIN_TRANSACTION;
                    case 7:
                        return COMMIT;
                    case 8:
                        return ROLLBACK;
                    case 9:
                        return LIST_COLLECTION_IDS;
                    case 10:
                        return BATCH_GET_DOCUMENTS;
                    case 11:
                        return RUN_QUERY;
                    case 12:
                        return LISTEN;
                    case 13:
                        return REMOVE_LISTEN;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f1736a;
            }

            @Deprecated
            public static a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: aj3$d$a0 */
        public static final class a0 extends v27<a0, a> implements b0 {
            private static final a0 DEFAULT_INSTANCE;
            private static volatile uhc<a0> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private dde request_;
            private w98.InterfaceC14504k<fde> response_ = v27.m23722x();

            /* JADX INFO: renamed from: aj3$d$a0$a */
            public static final class a extends v27.AbstractC13823b<a0, a> implements b0 {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a addAllResponse(Iterable<? extends fde> iterable) {
                    m23743e();
                    ((a0) this.f89756b).addAllResponse(iterable);
                    return this;
                }

                public a addResponse(fde fdeVar) {
                    m23743e();
                    ((a0) this.f89756b).addResponse(fdeVar);
                    return this;
                }

                public a clearRequest() {
                    m23743e();
                    ((a0) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((a0) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.b0
                public dde getRequest() {
                    return ((a0) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.b0
                public fde getResponse(int i) {
                    return ((a0) this.f89756b).getResponse(i);
                }

                @Override // p000.aj3.C0278d.b0
                public int getResponseCount() {
                    return ((a0) this.f89756b).getResponseCount();
                }

                @Override // p000.aj3.C0278d.b0
                public List<fde> getResponseList() {
                    return Collections.unmodifiableList(((a0) this.f89756b).getResponseList());
                }

                @Override // p000.aj3.C0278d.b0
                public boolean hasRequest() {
                    return ((a0) this.f89756b).hasRequest();
                }

                public a mergeRequest(dde ddeVar) {
                    m23743e();
                    ((a0) this.f89756b).mergeRequest(ddeVar);
                    return this;
                }

                public a removeResponse(int i) {
                    m23743e();
                    ((a0) this.f89756b).removeResponse(i);
                    return this;
                }

                public a setRequest(dde ddeVar) {
                    m23743e();
                    ((a0) this.f89756b).setRequest(ddeVar);
                    return this;
                }

                public a setResponse(int i, fde fdeVar) {
                    m23743e();
                    ((a0) this.f89756b).setResponse(i, fdeVar);
                    return this;
                }

                private a() {
                    super(a0.DEFAULT_INSTANCE);
                }

                public a addResponse(int i, fde fdeVar) {
                    m23743e();
                    ((a0) this.f89756b).addResponse(i, fdeVar);
                    return this;
                }

                public a setRequest(dde.C4757b c4757b) {
                    m23743e();
                    ((a0) this.f89756b).setRequest(c4757b.build());
                    return this;
                }

                public a setResponse(int i, fde.C5735b c5735b) {
                    m23743e();
                    ((a0) this.f89756b).setResponse(i, c5735b.build());
                    return this;
                }

                public a addResponse(fde.C5735b c5735b) {
                    m23743e();
                    ((a0) this.f89756b).addResponse(c5735b.build());
                    return this;
                }

                public a addResponse(int i, fde.C5735b c5735b) {
                    m23743e();
                    ((a0) this.f89756b).addResponse(i, c5735b.build());
                    return this;
                }
            }

            static {
                a0 a0Var = new a0();
                DEFAULT_INSTANCE = a0Var;
                v27.m23715h0(a0.class, a0Var);
            }

            private a0() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllResponse(Iterable<? extends fde> iterable) {
                ensureResponseIsMutable();
                AbstractC1714b3.m2856b(iterable, this.response_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponse(fde fdeVar) {
                fdeVar.getClass();
                ensureResponseIsMutable();
                this.response_.add(fdeVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = v27.m23722x();
            }

            private void ensureResponseIsMutable() {
                w98.InterfaceC14504k<fde> interfaceC14504k = this.response_;
                if (interfaceC14504k.isModifiable()) {
                    return;
                }
                this.response_ = v27.m23698P(interfaceC14504k);
            }

            public static a0 getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(dde ddeVar) {
                ddeVar.getClass();
                dde ddeVar2 = this.request_;
                if (ddeVar2 == null || ddeVar2 == dde.getDefaultInstance()) {
                    this.request_ = ddeVar;
                } else {
                    this.request_ = dde.newBuilder(this.request_).mergeFrom(ddeVar).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static a0 parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static a0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (a0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<a0> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeResponse(int i) {
                ensureResponseIsMutable();
                this.response_.remove(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(dde ddeVar) {
                ddeVar.getClass();
                this.request_ = ddeVar;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(int i, fde fdeVar) {
                fdeVar.getClass();
                ensureResponseIsMutable();
                this.response_.set(i, fdeVar);
            }

            @Override // p000.aj3.C0278d.b0
            public dde getRequest() {
                dde ddeVar = this.request_;
                return ddeVar == null ? dde.getDefaultInstance() : ddeVar;
            }

            @Override // p000.aj3.C0278d.b0
            public fde getResponse(int i) {
                return this.response_.get(i);
            }

            @Override // p000.aj3.C0278d.b0
            public int getResponseCount() {
                return this.response_.size();
            }

            @Override // p000.aj3.C0278d.b0
            public List<fde> getResponseList() {
                return this.response_;
            }

            public gde getResponseOrBuilder(int i) {
                return this.response_.get(i);
            }

            public List<? extends gde> getResponseOrBuilderList() {
                return this.response_;
            }

            @Override // p000.aj3.C0278d.b0
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new a0();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", fde.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<a0> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (a0.class) {
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

            public static a newBuilder(a0 a0Var) {
                return DEFAULT_INSTANCE.m23739o(a0Var);
            }

            public static a0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (a0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static a0 parseFrom(vj1 vj1Var) throws ce8 {
                return (a0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponse(int i, fde fdeVar) {
                fdeVar.getClass();
                ensureResponseIsMutable();
                this.response_.add(i, fdeVar);
            }

            public static a0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (a0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static a0 parseFrom(byte[] bArr) throws ce8 {
                return (a0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static a0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (a0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static a0 parseFrom(InputStream inputStream) throws IOException {
                return (a0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static a0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a0 parseFrom(f72 f72Var) throws IOException {
                return (a0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static a0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (a0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$b */
        public static final class b extends v27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            private static volatile uhc<b> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private ow0 request_;
            private w98.InterfaceC14504k<qw0> response_ = v27.m23722x();

            /* JADX INFO: renamed from: aj3$d$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a addAllResponse(Iterable<? extends qw0> iterable) {
                    m23743e();
                    ((b) this.f89756b).addAllResponse(iterable);
                    return this;
                }

                public a addResponse(qw0 qw0Var) {
                    m23743e();
                    ((b) this.f89756b).addResponse(qw0Var);
                    return this;
                }

                public a clearRequest() {
                    m23743e();
                    ((b) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((b) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.c
                public ow0 getRequest() {
                    return ((b) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.c
                public qw0 getResponse(int i) {
                    return ((b) this.f89756b).getResponse(i);
                }

                @Override // p000.aj3.C0278d.c
                public int getResponseCount() {
                    return ((b) this.f89756b).getResponseCount();
                }

                @Override // p000.aj3.C0278d.c
                public List<qw0> getResponseList() {
                    return Collections.unmodifiableList(((b) this.f89756b).getResponseList());
                }

                @Override // p000.aj3.C0278d.c
                public boolean hasRequest() {
                    return ((b) this.f89756b).hasRequest();
                }

                public a mergeRequest(ow0 ow0Var) {
                    m23743e();
                    ((b) this.f89756b).mergeRequest(ow0Var);
                    return this;
                }

                public a removeResponse(int i) {
                    m23743e();
                    ((b) this.f89756b).removeResponse(i);
                    return this;
                }

                public a setRequest(ow0 ow0Var) {
                    m23743e();
                    ((b) this.f89756b).setRequest(ow0Var);
                    return this;
                }

                public a setResponse(int i, qw0 qw0Var) {
                    m23743e();
                    ((b) this.f89756b).setResponse(i, qw0Var);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }

                public a addResponse(int i, qw0 qw0Var) {
                    m23743e();
                    ((b) this.f89756b).addResponse(i, qw0Var);
                    return this;
                }

                public a setRequest(ow0.C10673b c10673b) {
                    m23743e();
                    ((b) this.f89756b).setRequest(c10673b.build());
                    return this;
                }

                public a setResponse(int i, qw0.C11720b c11720b) {
                    m23743e();
                    ((b) this.f89756b).setResponse(i, c11720b.build());
                    return this;
                }

                public a addResponse(qw0.C11720b c11720b) {
                    m23743e();
                    ((b) this.f89756b).addResponse(c11720b.build());
                    return this;
                }

                public a addResponse(int i, qw0.C11720b c11720b) {
                    m23743e();
                    ((b) this.f89756b).addResponse(i, c11720b.build());
                    return this;
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                v27.m23715h0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllResponse(Iterable<? extends qw0> iterable) {
                ensureResponseIsMutable();
                AbstractC1714b3.m2856b(iterable, this.response_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponse(qw0 qw0Var) {
                qw0Var.getClass();
                ensureResponseIsMutable();
                this.response_.add(qw0Var);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = v27.m23722x();
            }

            private void ensureResponseIsMutable() {
                w98.InterfaceC14504k<qw0> interfaceC14504k = this.response_;
                if (interfaceC14504k.isModifiable()) {
                    return;
                }
                this.response_ = v27.m23698P(interfaceC14504k);
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(ow0 ow0Var) {
                ow0Var.getClass();
                ow0 ow0Var2 = this.request_;
                if (ow0Var2 == null || ow0Var2 == ow0.getDefaultInstance()) {
                    this.request_ = ow0Var;
                } else {
                    this.request_ = ow0.newBuilder(this.request_).mergeFrom(ow0Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeResponse(int i) {
                ensureResponseIsMutable();
                this.response_.remove(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(ow0 ow0Var) {
                ow0Var.getClass();
                this.request_ = ow0Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(int i, qw0 qw0Var) {
                qw0Var.getClass();
                ensureResponseIsMutable();
                this.response_.set(i, qw0Var);
            }

            @Override // p000.aj3.C0278d.c
            public ow0 getRequest() {
                ow0 ow0Var = this.request_;
                return ow0Var == null ? ow0.getDefaultInstance() : ow0Var;
            }

            @Override // p000.aj3.C0278d.c
            public qw0 getResponse(int i) {
                return this.response_.get(i);
            }

            @Override // p000.aj3.C0278d.c
            public int getResponseCount() {
                return this.response_.size();
            }

            @Override // p000.aj3.C0278d.c
            public List<qw0> getResponseList() {
                return this.response_;
            }

            public rw0 getResponseOrBuilder(int i) {
                return this.response_.get(i);
            }

            public List<? extends rw0> getResponseOrBuilderList() {
                return this.response_;
            }

            @Override // p000.aj3.C0278d.c
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", qw0.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<b> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b bVar) {
                return DEFAULT_INSTANCE.m23739o(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static b parseFrom(vj1 vj1Var) throws ce8 {
                return (b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addResponse(int i, qw0 qw0Var) {
                qw0Var.getClass();
                ensureResponseIsMutable();
                this.response_.add(i, qw0Var);
            }

            public static b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static b parseFrom(byte[] bArr) throws ce8 {
                return (b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(f72 f72Var) throws IOException {
                return (b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$b0 */
        public interface b0 extends rsa {
            dde getRequest();

            fde getResponse(int i);

            int getResponseCount();

            List<fde> getResponseList();

            boolean hasRequest();
        }

        /* JADX INFO: renamed from: aj3$d$c */
        public interface c extends rsa {
            ow0 getRequest();

            qw0 getResponse(int i);

            int getResponseCount();

            List<qw0> getResponseList();

            boolean hasRequest();
        }

        /* JADX INFO: renamed from: aj3$d$c0 */
        public static final class c0 extends v27<c0, a> implements d0 {
            private static final c0 DEFAULT_INSTANCE;
            private static volatile uhc<c0> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private iwh request_;
            private nh4 response_;

            /* JADX INFO: renamed from: aj3$d$c0$a */
            public static final class a extends v27.AbstractC13823b<c0, a> implements d0 {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((c0) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((c0) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.d0
                public iwh getRequest() {
                    return ((c0) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.d0
                public nh4 getResponse() {
                    return ((c0) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.d0
                public boolean hasRequest() {
                    return ((c0) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.d0
                public boolean hasResponse() {
                    return ((c0) this.f89756b).hasResponse();
                }

                public a mergeRequest(iwh iwhVar) {
                    m23743e();
                    ((c0) this.f89756b).mergeRequest(iwhVar);
                    return this;
                }

                public a mergeResponse(nh4 nh4Var) {
                    m23743e();
                    ((c0) this.f89756b).mergeResponse(nh4Var);
                    return this;
                }

                public a setRequest(iwh iwhVar) {
                    m23743e();
                    ((c0) this.f89756b).setRequest(iwhVar);
                    return this;
                }

                public a setResponse(nh4 nh4Var) {
                    m23743e();
                    ((c0) this.f89756b).setResponse(nh4Var);
                    return this;
                }

                private a() {
                    super(c0.DEFAULT_INSTANCE);
                }

                public a setRequest(iwh.C7645b c7645b) {
                    m23743e();
                    ((c0) this.f89756b).setRequest(c7645b.build());
                    return this;
                }

                public a setResponse(nh4.C9874b c9874b) {
                    m23743e();
                    ((c0) this.f89756b).setResponse(c9874b.build());
                    return this;
                }
            }

            static {
                c0 c0Var = new c0();
                DEFAULT_INSTANCE = c0Var;
                v27.m23715h0(c0.class, c0Var);
            }

            private c0() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static c0 getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(iwh iwhVar) {
                iwhVar.getClass();
                iwh iwhVar2 = this.request_;
                if (iwhVar2 == null || iwhVar2 == iwh.getDefaultInstance()) {
                    this.request_ = iwhVar;
                } else {
                    this.request_ = iwh.newBuilder(this.request_).mergeFrom(iwhVar).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(nh4 nh4Var) {
                nh4Var.getClass();
                nh4 nh4Var2 = this.response_;
                if (nh4Var2 == null || nh4Var2 == nh4.getDefaultInstance()) {
                    this.response_ = nh4Var;
                } else {
                    this.response_ = nh4.newBuilder(this.response_).mergeFrom(nh4Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static c0 parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (c0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static c0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (c0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<c0> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(iwh iwhVar) {
                iwhVar.getClass();
                this.request_ = iwhVar;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(nh4 nh4Var) {
                nh4Var.getClass();
                this.response_ = nh4Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.d0
            public iwh getRequest() {
                iwh iwhVar = this.request_;
                return iwhVar == null ? iwh.getDefaultInstance() : iwhVar;
            }

            @Override // p000.aj3.C0278d.d0
            public nh4 getResponse() {
                nh4 nh4Var = this.response_;
                return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
            }

            @Override // p000.aj3.C0278d.d0
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.d0
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new c0();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<c0> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (c0.class) {
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

            public static a newBuilder(c0 c0Var) {
                return DEFAULT_INSTANCE.m23739o(c0Var);
            }

            public static c0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (c0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static c0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (c0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static c0 parseFrom(vj1 vj1Var) throws ce8 {
                return (c0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static c0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (c0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static c0 parseFrom(byte[] bArr) throws ce8 {
                return (c0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static c0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (c0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static c0 parseFrom(InputStream inputStream) throws IOException {
                return (c0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static c0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (c0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static c0 parseFrom(f72 f72Var) throws IOException {
                return (c0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static c0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (c0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$d */
        public static final class d extends v27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            private static volatile uhc<d> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private k01 request_;
            private m01 response_;

            /* JADX INFO: renamed from: aj3$d$d$a */
            public static final class a extends v27.AbstractC13823b<d, a> implements e {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((d) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((d) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.e
                public k01 getRequest() {
                    return ((d) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.e
                public m01 getResponse() {
                    return ((d) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.e
                public boolean hasRequest() {
                    return ((d) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.e
                public boolean hasResponse() {
                    return ((d) this.f89756b).hasResponse();
                }

                public a mergeRequest(k01 k01Var) {
                    m23743e();
                    ((d) this.f89756b).mergeRequest(k01Var);
                    return this;
                }

                public a mergeResponse(m01 m01Var) {
                    m23743e();
                    ((d) this.f89756b).mergeResponse(m01Var);
                    return this;
                }

                public a setRequest(k01 k01Var) {
                    m23743e();
                    ((d) this.f89756b).setRequest(k01Var);
                    return this;
                }

                public a setResponse(m01 m01Var) {
                    m23743e();
                    ((d) this.f89756b).setResponse(m01Var);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }

                public a setRequest(k01.C8152b c8152b) {
                    m23743e();
                    ((d) this.f89756b).setRequest(c8152b.build());
                    return this;
                }

                public a setResponse(m01.C9065b c9065b) {
                    m23743e();
                    ((d) this.f89756b).setResponse(c9065b.build());
                    return this;
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                v27.m23715h0(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(k01 k01Var) {
                k01Var.getClass();
                k01 k01Var2 = this.request_;
                if (k01Var2 == null || k01Var2 == k01.getDefaultInstance()) {
                    this.request_ = k01Var;
                } else {
                    this.request_ = k01.newBuilder(this.request_).mergeFrom(k01Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(m01 m01Var) {
                m01Var.getClass();
                m01 m01Var2 = this.response_;
                if (m01Var2 == null || m01Var2 == m01.getDefaultInstance()) {
                    this.response_ = m01Var;
                } else {
                    this.response_ = m01.newBuilder(this.response_).mergeFrom(m01Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<d> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(k01 k01Var) {
                k01Var.getClass();
                this.request_ = k01Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(m01 m01Var) {
                m01Var.getClass();
                this.response_ = m01Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.e
            public k01 getRequest() {
                k01 k01Var = this.request_;
                return k01Var == null ? k01.getDefaultInstance() : k01Var;
            }

            @Override // p000.aj3.C0278d.e
            public m01 getResponse() {
                m01 m01Var = this.response_;
                return m01Var == null ? m01.getDefaultInstance() : m01Var;
            }

            @Override // p000.aj3.C0278d.e
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.e
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<d> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (d.class) {
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

            public static a newBuilder(d dVar) {
                return DEFAULT_INSTANCE.m23739o(dVar);
            }

            public static d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static d parseFrom(vj1 vj1Var) throws ce8 {
                return (d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static d parseFrom(byte[] bArr) throws ce8 {
                return (d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static d parseFrom(InputStream inputStream) throws IOException {
                return (d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static d parseFrom(f72 f72Var) throws IOException {
                return (d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$d0 */
        public interface d0 extends rsa {
            iwh getRequest();

            nh4 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$e */
        public interface e extends rsa {
            k01 getRequest();

            m01 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$f */
        public static final class f extends v27.AbstractC13823b<C0278d, f> implements InterfaceC0279e {
            public /* synthetic */ f(C0275a c0275a) {
                this();
            }

            public f addAllMatchingDocuments(Iterable<? extends u> iterable) {
                m23743e();
                ((C0278d) this.f89756b).addAllMatchingDocuments(iterable);
                return this;
            }

            public f addMatchingDocuments(u uVar) {
                m23743e();
                ((C0278d) this.f89756b).addMatchingDocuments(uVar);
                return this;
            }

            public f clearAction() {
                m23743e();
                ((C0278d) this.f89756b).clearAction();
                return this;
            }

            public f clearBatchGetDocuments() {
                m23743e();
                ((C0278d) this.f89756b).clearBatchGetDocuments();
                return this;
            }

            public f clearBeginTransaction() {
                m23743e();
                ((C0278d) this.f89756b).clearBeginTransaction();
                return this;
            }

            public f clearCommit() {
                m23743e();
                ((C0278d) this.f89756b).clearCommit();
                return this;
            }

            public f clearCreateDocument() {
                m23743e();
                ((C0278d) this.f89756b).clearCreateDocument();
                return this;
            }

            public f clearDatabaseContentsBeforeAction() {
                m23743e();
                ((C0278d) this.f89756b).clearDatabaseContentsBeforeAction();
                return this;
            }

            public f clearDeleteDocument() {
                m23743e();
                ((C0278d) this.f89756b).clearDeleteDocument();
                return this;
            }

            public f clearGetDocument() {
                m23743e();
                ((C0278d) this.f89756b).clearGetDocument();
                return this;
            }

            public f clearListCollectionIds() {
                m23743e();
                ((C0278d) this.f89756b).clearListCollectionIds();
                return this;
            }

            public f clearListDocuments() {
                m23743e();
                ((C0278d) this.f89756b).clearListDocuments();
                return this;
            }

            public f clearListen() {
                m23743e();
                ((C0278d) this.f89756b).clearListen();
                return this;
            }

            public f clearMatchingDocuments() {
                m23743e();
                ((C0278d) this.f89756b).clearMatchingDocuments();
                return this;
            }

            public f clearRemoveListen() {
                m23743e();
                ((C0278d) this.f89756b).clearRemoveListen();
                return this;
            }

            public f clearRollback() {
                m23743e();
                ((C0278d) this.f89756b).clearRollback();
                return this;
            }

            public f clearRunQuery() {
                m23743e();
                ((C0278d) this.f89756b).clearRunQuery();
                return this;
            }

            public f clearStatus() {
                m23743e();
                ((C0278d) this.f89756b).clearStatus();
                return this;
            }

            public f clearUpdateDocument() {
                m23743e();
                ((C0278d) this.f89756b).clearUpdateDocument();
                return this;
            }

            @Override // p000.aj3.InterfaceC0279e
            public a getActionCase() {
                return ((C0278d) this.f89756b).getActionCase();
            }

            @Override // p000.aj3.InterfaceC0279e
            public b getBatchGetDocuments() {
                return ((C0278d) this.f89756b).getBatchGetDocuments();
            }

            @Override // p000.aj3.InterfaceC0279e
            public d getBeginTransaction() {
                return ((C0278d) this.f89756b).getBeginTransaction();
            }

            @Override // p000.aj3.InterfaceC0279e
            public g getCommit() {
                return ((C0278d) this.f89756b).getCommit();
            }

            @Override // p000.aj3.InterfaceC0279e
            public i getCreateDocument() {
                return ((C0278d) this.f89756b).getCreateDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public a0 getDatabaseContentsBeforeAction() {
                return ((C0278d) this.f89756b).getDatabaseContentsBeforeAction();
            }

            @Override // p000.aj3.InterfaceC0279e
            public k getDeleteDocument() {
                return ((C0278d) this.f89756b).getDeleteDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public m getGetDocument() {
                return ((C0278d) this.f89756b).getGetDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public o getListCollectionIds() {
                return ((C0278d) this.f89756b).getListCollectionIds();
            }

            @Override // p000.aj3.InterfaceC0279e
            public q getListDocuments() {
                return ((C0278d) this.f89756b).getListDocuments();
            }

            @Override // p000.aj3.InterfaceC0279e
            public s getListen() {
                return ((C0278d) this.f89756b).getListen();
            }

            @Override // p000.aj3.InterfaceC0279e
            public u getMatchingDocuments(int i) {
                return ((C0278d) this.f89756b).getMatchingDocuments(i);
            }

            @Override // p000.aj3.InterfaceC0279e
            public int getMatchingDocumentsCount() {
                return ((C0278d) this.f89756b).getMatchingDocumentsCount();
            }

            @Override // p000.aj3.InterfaceC0279e
            public List<u> getMatchingDocumentsList() {
                return Collections.unmodifiableList(((C0278d) this.f89756b).getMatchingDocumentsList());
            }

            @Override // p000.aj3.InterfaceC0279e
            public w getRemoveListen() {
                return ((C0278d) this.f89756b).getRemoveListen();
            }

            @Override // p000.aj3.InterfaceC0279e
            public y getRollback() {
                return ((C0278d) this.f89756b).getRollback();
            }

            @Override // p000.aj3.InterfaceC0279e
            public a0 getRunQuery() {
                return ((C0278d) this.f89756b).getRunQuery();
            }

            @Override // p000.aj3.InterfaceC0279e
            public C0282h getStatus() {
                return ((C0278d) this.f89756b).getStatus();
            }

            @Override // p000.aj3.InterfaceC0279e
            public c0 getUpdateDocument() {
                return ((C0278d) this.f89756b).getUpdateDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasBatchGetDocuments() {
                return ((C0278d) this.f89756b).hasBatchGetDocuments();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasBeginTransaction() {
                return ((C0278d) this.f89756b).hasBeginTransaction();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasCommit() {
                return ((C0278d) this.f89756b).hasCommit();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasCreateDocument() {
                return ((C0278d) this.f89756b).hasCreateDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasDatabaseContentsBeforeAction() {
                return ((C0278d) this.f89756b).hasDatabaseContentsBeforeAction();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasDeleteDocument() {
                return ((C0278d) this.f89756b).hasDeleteDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasGetDocument() {
                return ((C0278d) this.f89756b).hasGetDocument();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasListCollectionIds() {
                return ((C0278d) this.f89756b).hasListCollectionIds();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasListDocuments() {
                return ((C0278d) this.f89756b).hasListDocuments();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasListen() {
                return ((C0278d) this.f89756b).hasListen();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasRemoveListen() {
                return ((C0278d) this.f89756b).hasRemoveListen();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasRollback() {
                return ((C0278d) this.f89756b).hasRollback();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasRunQuery() {
                return ((C0278d) this.f89756b).hasRunQuery();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasStatus() {
                return ((C0278d) this.f89756b).hasStatus();
            }

            @Override // p000.aj3.InterfaceC0279e
            public boolean hasUpdateDocument() {
                return ((C0278d) this.f89756b).hasUpdateDocument();
            }

            public f mergeBatchGetDocuments(b bVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeBatchGetDocuments(bVar);
                return this;
            }

            public f mergeBeginTransaction(d dVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeBeginTransaction(dVar);
                return this;
            }

            public f mergeCommit(g gVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeCommit(gVar);
                return this;
            }

            public f mergeCreateDocument(i iVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeCreateDocument(iVar);
                return this;
            }

            public f mergeDatabaseContentsBeforeAction(a0 a0Var) {
                m23743e();
                ((C0278d) this.f89756b).mergeDatabaseContentsBeforeAction(a0Var);
                return this;
            }

            public f mergeDeleteDocument(k kVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeDeleteDocument(kVar);
                return this;
            }

            public f mergeGetDocument(m mVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeGetDocument(mVar);
                return this;
            }

            public f mergeListCollectionIds(o oVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeListCollectionIds(oVar);
                return this;
            }

            public f mergeListDocuments(q qVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeListDocuments(qVar);
                return this;
            }

            public f mergeListen(s sVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeListen(sVar);
                return this;
            }

            public f mergeRemoveListen(w wVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeRemoveListen(wVar);
                return this;
            }

            public f mergeRollback(y yVar) {
                m23743e();
                ((C0278d) this.f89756b).mergeRollback(yVar);
                return this;
            }

            public f mergeRunQuery(a0 a0Var) {
                m23743e();
                ((C0278d) this.f89756b).mergeRunQuery(a0Var);
                return this;
            }

            public f mergeStatus(C0282h c0282h) {
                m23743e();
                ((C0278d) this.f89756b).mergeStatus(c0282h);
                return this;
            }

            public f mergeUpdateDocument(c0 c0Var) {
                m23743e();
                ((C0278d) this.f89756b).mergeUpdateDocument(c0Var);
                return this;
            }

            public f removeMatchingDocuments(int i) {
                m23743e();
                ((C0278d) this.f89756b).removeMatchingDocuments(i);
                return this;
            }

            public f setBatchGetDocuments(b bVar) {
                m23743e();
                ((C0278d) this.f89756b).setBatchGetDocuments(bVar);
                return this;
            }

            public f setBeginTransaction(d dVar) {
                m23743e();
                ((C0278d) this.f89756b).setBeginTransaction(dVar);
                return this;
            }

            public f setCommit(g gVar) {
                m23743e();
                ((C0278d) this.f89756b).setCommit(gVar);
                return this;
            }

            public f setCreateDocument(i iVar) {
                m23743e();
                ((C0278d) this.f89756b).setCreateDocument(iVar);
                return this;
            }

            public f setDatabaseContentsBeforeAction(a0 a0Var) {
                m23743e();
                ((C0278d) this.f89756b).setDatabaseContentsBeforeAction(a0Var);
                return this;
            }

            public f setDeleteDocument(k kVar) {
                m23743e();
                ((C0278d) this.f89756b).setDeleteDocument(kVar);
                return this;
            }

            public f setGetDocument(m mVar) {
                m23743e();
                ((C0278d) this.f89756b).setGetDocument(mVar);
                return this;
            }

            public f setListCollectionIds(o oVar) {
                m23743e();
                ((C0278d) this.f89756b).setListCollectionIds(oVar);
                return this;
            }

            public f setListDocuments(q qVar) {
                m23743e();
                ((C0278d) this.f89756b).setListDocuments(qVar);
                return this;
            }

            public f setListen(s sVar) {
                m23743e();
                ((C0278d) this.f89756b).setListen(sVar);
                return this;
            }

            public f setMatchingDocuments(int i, u uVar) {
                m23743e();
                ((C0278d) this.f89756b).setMatchingDocuments(i, uVar);
                return this;
            }

            public f setRemoveListen(w wVar) {
                m23743e();
                ((C0278d) this.f89756b).setRemoveListen(wVar);
                return this;
            }

            public f setRollback(y yVar) {
                m23743e();
                ((C0278d) this.f89756b).setRollback(yVar);
                return this;
            }

            public f setRunQuery(a0 a0Var) {
                m23743e();
                ((C0278d) this.f89756b).setRunQuery(a0Var);
                return this;
            }

            public f setStatus(C0282h c0282h) {
                m23743e();
                ((C0278d) this.f89756b).setStatus(c0282h);
                return this;
            }

            public f setUpdateDocument(c0 c0Var) {
                m23743e();
                ((C0278d) this.f89756b).setUpdateDocument(c0Var);
                return this;
            }

            private f() {
                super(C0278d.DEFAULT_INSTANCE);
            }

            public f addMatchingDocuments(int i, u uVar) {
                m23743e();
                ((C0278d) this.f89756b).addMatchingDocuments(i, uVar);
                return this;
            }

            public f setBatchGetDocuments(b.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setBatchGetDocuments(aVar.build());
                return this;
            }

            public f setBeginTransaction(d.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setBeginTransaction(aVar.build());
                return this;
            }

            public f setCommit(g.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setCommit(aVar.build());
                return this;
            }

            public f setCreateDocument(i.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setCreateDocument(aVar.build());
                return this;
            }

            public f setDatabaseContentsBeforeAction(a0.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setDatabaseContentsBeforeAction(aVar.build());
                return this;
            }

            public f setDeleteDocument(k.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setDeleteDocument(aVar.build());
                return this;
            }

            public f setGetDocument(m.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setGetDocument(aVar.build());
                return this;
            }

            public f setListCollectionIds(o.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setListCollectionIds(aVar.build());
                return this;
            }

            public f setListDocuments(q.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setListDocuments(aVar.build());
                return this;
            }

            public f setListen(s.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setListen(aVar.build());
                return this;
            }

            public f setMatchingDocuments(int i, u.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setMatchingDocuments(i, aVar.build());
                return this;
            }

            public f setRemoveListen(w.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setRemoveListen(aVar.build());
                return this;
            }

            public f setRollback(y.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setRollback(aVar.build());
                return this;
            }

            public f setRunQuery(a0.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setRunQuery(aVar.build());
                return this;
            }

            public f setStatus(C0282h.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setStatus(aVar.build());
                return this;
            }

            public f setUpdateDocument(c0.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).setUpdateDocument(aVar.build());
                return this;
            }

            public f addMatchingDocuments(u.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).addMatchingDocuments(aVar.build());
                return this;
            }

            public f addMatchingDocuments(int i, u.a aVar) {
                m23743e();
                ((C0278d) this.f89756b).addMatchingDocuments(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: aj3$d$g */
        public static final class g extends v27<g, a> implements h {
            private static final g DEFAULT_INSTANCE;
            private static volatile uhc<g> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private wb2 request_;
            private yb2 response_;

            /* JADX INFO: renamed from: aj3$d$g$a */
            public static final class a extends v27.AbstractC13823b<g, a> implements h {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((g) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((g) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.h
                public wb2 getRequest() {
                    return ((g) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.h
                public yb2 getResponse() {
                    return ((g) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.h
                public boolean hasRequest() {
                    return ((g) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.h
                public boolean hasResponse() {
                    return ((g) this.f89756b).hasResponse();
                }

                public a mergeRequest(wb2 wb2Var) {
                    m23743e();
                    ((g) this.f89756b).mergeRequest(wb2Var);
                    return this;
                }

                public a mergeResponse(yb2 yb2Var) {
                    m23743e();
                    ((g) this.f89756b).mergeResponse(yb2Var);
                    return this;
                }

                public a setRequest(wb2 wb2Var) {
                    m23743e();
                    ((g) this.f89756b).setRequest(wb2Var);
                    return this;
                }

                public a setResponse(yb2 yb2Var) {
                    m23743e();
                    ((g) this.f89756b).setResponse(yb2Var);
                    return this;
                }

                private a() {
                    super(g.DEFAULT_INSTANCE);
                }

                public a setRequest(wb2.C14542b c14542b) {
                    m23743e();
                    ((g) this.f89756b).setRequest(c14542b.build());
                    return this;
                }

                public a setResponse(yb2.C15600b c15600b) {
                    m23743e();
                    ((g) this.f89756b).setResponse(c15600b.build());
                    return this;
                }
            }

            static {
                g gVar = new g();
                DEFAULT_INSTANCE = gVar;
                v27.m23715h0(g.class, gVar);
            }

            private g() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static g getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(wb2 wb2Var) {
                wb2Var.getClass();
                wb2 wb2Var2 = this.request_;
                if (wb2Var2 == null || wb2Var2 == wb2.getDefaultInstance()) {
                    this.request_ = wb2Var;
                } else {
                    this.request_ = wb2.newBuilder(this.request_).mergeFrom(wb2Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(yb2 yb2Var) {
                yb2Var.getClass();
                yb2 yb2Var2 = this.response_;
                if (yb2Var2 == null || yb2Var2 == yb2.getDefaultInstance()) {
                    this.response_ = yb2Var;
                } else {
                    this.response_ = yb2.newBuilder(this.response_).mergeFrom(yb2Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static g parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (g) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static g parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (g) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<g> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(wb2 wb2Var) {
                wb2Var.getClass();
                this.request_ = wb2Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(yb2 yb2Var) {
                yb2Var.getClass();
                this.response_ = yb2Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.h
            public wb2 getRequest() {
                wb2 wb2Var = this.request_;
                return wb2Var == null ? wb2.getDefaultInstance() : wb2Var;
            }

            @Override // p000.aj3.C0278d.h
            public yb2 getResponse() {
                yb2 yb2Var = this.response_;
                return yb2Var == null ? yb2.getDefaultInstance() : yb2Var;
            }

            @Override // p000.aj3.C0278d.h
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.h
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new g();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<g> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (g.class) {
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

            public static a newBuilder(g gVar) {
                return DEFAULT_INSTANCE.m23739o(gVar);
            }

            public static g parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (g) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static g parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (g) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static g parseFrom(vj1 vj1Var) throws ce8 {
                return (g) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static g parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (g) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static g parseFrom(byte[] bArr) throws ce8 {
                return (g) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static g parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (g) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static g parseFrom(InputStream inputStream) throws IOException {
                return (g) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static g parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (g) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static g parseFrom(f72 f72Var) throws IOException {
                return (g) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static g parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (g) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$h */
        public interface h extends rsa {
            wb2 getRequest();

            yb2 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$i */
        public static final class i extends v27<i, a> implements j {
            private static final i DEFAULT_INSTANCE;
            private static volatile uhc<i> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private v53 request_;
            private nh4 response_;

            /* JADX INFO: renamed from: aj3$d$i$a */
            public static final class a extends v27.AbstractC13823b<i, a> implements j {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((i) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((i) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.j
                public v53 getRequest() {
                    return ((i) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.j
                public nh4 getResponse() {
                    return ((i) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.j
                public boolean hasRequest() {
                    return ((i) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.j
                public boolean hasResponse() {
                    return ((i) this.f89756b).hasResponse();
                }

                public a mergeRequest(v53 v53Var) {
                    m23743e();
                    ((i) this.f89756b).mergeRequest(v53Var);
                    return this;
                }

                public a mergeResponse(nh4 nh4Var) {
                    m23743e();
                    ((i) this.f89756b).mergeResponse(nh4Var);
                    return this;
                }

                public a setRequest(v53 v53Var) {
                    m23743e();
                    ((i) this.f89756b).setRequest(v53Var);
                    return this;
                }

                public a setResponse(nh4 nh4Var) {
                    m23743e();
                    ((i) this.f89756b).setResponse(nh4Var);
                    return this;
                }

                private a() {
                    super(i.DEFAULT_INSTANCE);
                }

                public a setRequest(v53.C13870b c13870b) {
                    m23743e();
                    ((i) this.f89756b).setRequest(c13870b.build());
                    return this;
                }

                public a setResponse(nh4.C9874b c9874b) {
                    m23743e();
                    ((i) this.f89756b).setResponse(c9874b.build());
                    return this;
                }
            }

            static {
                i iVar = new i();
                DEFAULT_INSTANCE = iVar;
                v27.m23715h0(i.class, iVar);
            }

            private i() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static i getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(v53 v53Var) {
                v53Var.getClass();
                v53 v53Var2 = this.request_;
                if (v53Var2 == null || v53Var2 == v53.getDefaultInstance()) {
                    this.request_ = v53Var;
                } else {
                    this.request_ = v53.newBuilder(this.request_).mergeFrom(v53Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(nh4 nh4Var) {
                nh4Var.getClass();
                nh4 nh4Var2 = this.response_;
                if (nh4Var2 == null || nh4Var2 == nh4.getDefaultInstance()) {
                    this.response_ = nh4Var;
                } else {
                    this.response_ = nh4.newBuilder(this.response_).mergeFrom(nh4Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static i parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (i) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static i parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (i) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<i> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(v53 v53Var) {
                v53Var.getClass();
                this.request_ = v53Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(nh4 nh4Var) {
                nh4Var.getClass();
                this.response_ = nh4Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.j
            public v53 getRequest() {
                v53 v53Var = this.request_;
                return v53Var == null ? v53.getDefaultInstance() : v53Var;
            }

            @Override // p000.aj3.C0278d.j
            public nh4 getResponse() {
                nh4 nh4Var = this.response_;
                return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
            }

            @Override // p000.aj3.C0278d.j
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.j
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new i();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<i> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (i.class) {
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

            public static a newBuilder(i iVar) {
                return DEFAULT_INSTANCE.m23739o(iVar);
            }

            public static i parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (i) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static i parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (i) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static i parseFrom(vj1 vj1Var) throws ce8 {
                return (i) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static i parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (i) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static i parseFrom(byte[] bArr) throws ce8 {
                return (i) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static i parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (i) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static i parseFrom(InputStream inputStream) throws IOException {
                return (i) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static i parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (i) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static i parseFrom(f72 f72Var) throws IOException {
                return (i) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static i parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (i) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$j */
        public interface j extends rsa {
            v53 getRequest();

            nh4 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$k */
        public static final class k extends v27<k, a> implements l {
            private static final k DEFAULT_INSTANCE;
            private static volatile uhc<k> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private a54 request_;
            private qz4 response_;

            /* JADX INFO: renamed from: aj3$d$k$a */
            public static final class a extends v27.AbstractC13823b<k, a> implements l {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((k) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((k) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.l
                public a54 getRequest() {
                    return ((k) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.l
                public qz4 getResponse() {
                    return ((k) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.l
                public boolean hasRequest() {
                    return ((k) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.l
                public boolean hasResponse() {
                    return ((k) this.f89756b).hasResponse();
                }

                public a mergeRequest(a54 a54Var) {
                    m23743e();
                    ((k) this.f89756b).mergeRequest(a54Var);
                    return this;
                }

                public a mergeResponse(qz4 qz4Var) {
                    m23743e();
                    ((k) this.f89756b).mergeResponse(qz4Var);
                    return this;
                }

                public a setRequest(a54 a54Var) {
                    m23743e();
                    ((k) this.f89756b).setRequest(a54Var);
                    return this;
                }

                public a setResponse(qz4 qz4Var) {
                    m23743e();
                    ((k) this.f89756b).setResponse(qz4Var);
                    return this;
                }

                private a() {
                    super(k.DEFAULT_INSTANCE);
                }

                public a setRequest(a54.C0060b c0060b) {
                    m23743e();
                    ((k) this.f89756b).setRequest(c0060b.build());
                    return this;
                }

                public a setResponse(qz4.C11769b c11769b) {
                    m23743e();
                    ((k) this.f89756b).setResponse(c11769b.build());
                    return this;
                }
            }

            static {
                k kVar = new k();
                DEFAULT_INSTANCE = kVar;
                v27.m23715h0(k.class, kVar);
            }

            private k() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static k getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(a54 a54Var) {
                a54Var.getClass();
                a54 a54Var2 = this.request_;
                if (a54Var2 == null || a54Var2 == a54.getDefaultInstance()) {
                    this.request_ = a54Var;
                } else {
                    this.request_ = a54.newBuilder(this.request_).mergeFrom(a54Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(qz4 qz4Var) {
                qz4Var.getClass();
                qz4 qz4Var2 = this.response_;
                if (qz4Var2 == null || qz4Var2 == qz4.getDefaultInstance()) {
                    this.response_ = qz4Var;
                } else {
                    this.response_ = qz4.newBuilder(this.response_).mergeFrom(qz4Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static k parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (k) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static k parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (k) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<k> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(a54 a54Var) {
                a54Var.getClass();
                this.request_ = a54Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(qz4 qz4Var) {
                qz4Var.getClass();
                this.response_ = qz4Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.l
            public a54 getRequest() {
                a54 a54Var = this.request_;
                return a54Var == null ? a54.getDefaultInstance() : a54Var;
            }

            @Override // p000.aj3.C0278d.l
            public qz4 getResponse() {
                qz4 qz4Var = this.response_;
                return qz4Var == null ? qz4.getDefaultInstance() : qz4Var;
            }

            @Override // p000.aj3.C0278d.l
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.l
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new k();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<k> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (k.class) {
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

            public static a newBuilder(k kVar) {
                return DEFAULT_INSTANCE.m23739o(kVar);
            }

            public static k parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (k) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static k parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (k) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static k parseFrom(vj1 vj1Var) throws ce8 {
                return (k) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static k parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (k) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static k parseFrom(byte[] bArr) throws ce8 {
                return (k) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static k parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (k) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static k parseFrom(InputStream inputStream) throws IOException {
                return (k) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static k parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (k) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static k parseFrom(f72 f72Var) throws IOException {
                return (k) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static k parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (k) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$l */
        public interface l extends rsa {
            a54 getRequest();

            qz4 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$m */
        public static final class m extends v27<m, a> implements n {
            private static final m DEFAULT_INSTANCE;
            private static volatile uhc<m> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private h47 request_;
            private nh4 response_;

            /* JADX INFO: renamed from: aj3$d$m$a */
            public static final class a extends v27.AbstractC13823b<m, a> implements n {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((m) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((m) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.n
                public h47 getRequest() {
                    return ((m) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.n
                public nh4 getResponse() {
                    return ((m) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.n
                public boolean hasRequest() {
                    return ((m) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.n
                public boolean hasResponse() {
                    return ((m) this.f89756b).hasResponse();
                }

                public a mergeRequest(h47 h47Var) {
                    m23743e();
                    ((m) this.f89756b).mergeRequest(h47Var);
                    return this;
                }

                public a mergeResponse(nh4 nh4Var) {
                    m23743e();
                    ((m) this.f89756b).mergeResponse(nh4Var);
                    return this;
                }

                public a setRequest(h47 h47Var) {
                    m23743e();
                    ((m) this.f89756b).setRequest(h47Var);
                    return this;
                }

                public a setResponse(nh4 nh4Var) {
                    m23743e();
                    ((m) this.f89756b).setResponse(nh4Var);
                    return this;
                }

                private a() {
                    super(m.DEFAULT_INSTANCE);
                }

                public a setRequest(h47.C6703b c6703b) {
                    m23743e();
                    ((m) this.f89756b).setRequest(c6703b.build());
                    return this;
                }

                public a setResponse(nh4.C9874b c9874b) {
                    m23743e();
                    ((m) this.f89756b).setResponse(c9874b.build());
                    return this;
                }
            }

            static {
                m mVar = new m();
                DEFAULT_INSTANCE = mVar;
                v27.m23715h0(m.class, mVar);
            }

            private m() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static m getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(h47 h47Var) {
                h47Var.getClass();
                h47 h47Var2 = this.request_;
                if (h47Var2 == null || h47Var2 == h47.getDefaultInstance()) {
                    this.request_ = h47Var;
                } else {
                    this.request_ = h47.newBuilder(this.request_).mergeFrom(h47Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(nh4 nh4Var) {
                nh4Var.getClass();
                nh4 nh4Var2 = this.response_;
                if (nh4Var2 == null || nh4Var2 == nh4.getDefaultInstance()) {
                    this.response_ = nh4Var;
                } else {
                    this.response_ = nh4.newBuilder(this.response_).mergeFrom(nh4Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static m parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (m) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static m parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (m) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<m> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(h47 h47Var) {
                h47Var.getClass();
                this.request_ = h47Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(nh4 nh4Var) {
                nh4Var.getClass();
                this.response_ = nh4Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.n
            public h47 getRequest() {
                h47 h47Var = this.request_;
                return h47Var == null ? h47.getDefaultInstance() : h47Var;
            }

            @Override // p000.aj3.C0278d.n
            public nh4 getResponse() {
                nh4 nh4Var = this.response_;
                return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
            }

            @Override // p000.aj3.C0278d.n
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.n
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new m();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<m> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (m.class) {
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

            public static a newBuilder(m mVar) {
                return DEFAULT_INSTANCE.m23739o(mVar);
            }

            public static m parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (m) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static m parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (m) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static m parseFrom(vj1 vj1Var) throws ce8 {
                return (m) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static m parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (m) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static m parseFrom(byte[] bArr) throws ce8 {
                return (m) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static m parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (m) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static m parseFrom(InputStream inputStream) throws IOException {
                return (m) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static m parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (m) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static m parseFrom(f72 f72Var) throws IOException {
                return (m) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static m parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (m) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$n */
        public interface n extends rsa {
            h47 getRequest();

            nh4 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$o */
        public static final class o extends v27<o, a> implements p {
            private static final o DEFAULT_INSTANCE;
            private static volatile uhc<o> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private o89 request_;
            private q89 response_;

            /* JADX INFO: renamed from: aj3$d$o$a */
            public static final class a extends v27.AbstractC13823b<o, a> implements p {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((o) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((o) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.p
                public o89 getRequest() {
                    return ((o) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.p
                public q89 getResponse() {
                    return ((o) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.p
                public boolean hasRequest() {
                    return ((o) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.p
                public boolean hasResponse() {
                    return ((o) this.f89756b).hasResponse();
                }

                public a mergeRequest(o89 o89Var) {
                    m23743e();
                    ((o) this.f89756b).mergeRequest(o89Var);
                    return this;
                }

                public a mergeResponse(q89 q89Var) {
                    m23743e();
                    ((o) this.f89756b).mergeResponse(q89Var);
                    return this;
                }

                public a setRequest(o89 o89Var) {
                    m23743e();
                    ((o) this.f89756b).setRequest(o89Var);
                    return this;
                }

                public a setResponse(q89 q89Var) {
                    m23743e();
                    ((o) this.f89756b).setResponse(q89Var);
                    return this;
                }

                private a() {
                    super(o.DEFAULT_INSTANCE);
                }

                public a setRequest(o89.C10223b c10223b) {
                    m23743e();
                    ((o) this.f89756b).setRequest(c10223b.build());
                    return this;
                }

                public a setResponse(q89.C11369b c11369b) {
                    m23743e();
                    ((o) this.f89756b).setResponse(c11369b.build());
                    return this;
                }
            }

            static {
                o oVar = new o();
                DEFAULT_INSTANCE = oVar;
                v27.m23715h0(o.class, oVar);
            }

            private o() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static o getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(o89 o89Var) {
                o89Var.getClass();
                o89 o89Var2 = this.request_;
                if (o89Var2 == null || o89Var2 == o89.getDefaultInstance()) {
                    this.request_ = o89Var;
                } else {
                    this.request_ = o89.newBuilder(this.request_).mergeFrom(o89Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(q89 q89Var) {
                q89Var.getClass();
                q89 q89Var2 = this.response_;
                if (q89Var2 == null || q89Var2 == q89.getDefaultInstance()) {
                    this.response_ = q89Var;
                } else {
                    this.response_ = q89.newBuilder(this.response_).mergeFrom(q89Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static o parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (o) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static o parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (o) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<o> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(o89 o89Var) {
                o89Var.getClass();
                this.request_ = o89Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(q89 q89Var) {
                q89Var.getClass();
                this.response_ = q89Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.p
            public o89 getRequest() {
                o89 o89Var = this.request_;
                return o89Var == null ? o89.getDefaultInstance() : o89Var;
            }

            @Override // p000.aj3.C0278d.p
            public q89 getResponse() {
                q89 q89Var = this.response_;
                return q89Var == null ? q89.getDefaultInstance() : q89Var;
            }

            @Override // p000.aj3.C0278d.p
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.p
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new o();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<o> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (o.class) {
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

            public static a newBuilder(o oVar) {
                return DEFAULT_INSTANCE.m23739o(oVar);
            }

            public static o parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (o) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static o parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (o) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static o parseFrom(vj1 vj1Var) throws ce8 {
                return (o) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static o parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (o) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static o parseFrom(byte[] bArr) throws ce8 {
                return (o) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static o parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (o) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static o parseFrom(InputStream inputStream) throws IOException {
                return (o) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static o parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (o) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static o parseFrom(f72 f72Var) throws IOException {
                return (o) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static o parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (o) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$p */
        public interface p extends rsa {
            o89 getRequest();

            q89 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$q */
        public static final class q extends v27<q, a> implements r {
            private static final q DEFAULT_INSTANCE;
            private static volatile uhc<q> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private u89 request_;
            private w89 response_;

            /* JADX INFO: renamed from: aj3$d$q$a */
            public static final class a extends v27.AbstractC13823b<q, a> implements r {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((q) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((q) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.r
                public u89 getRequest() {
                    return ((q) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.r
                public w89 getResponse() {
                    return ((q) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.r
                public boolean hasRequest() {
                    return ((q) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.r
                public boolean hasResponse() {
                    return ((q) this.f89756b).hasResponse();
                }

                public a mergeRequest(u89 u89Var) {
                    m23743e();
                    ((q) this.f89756b).mergeRequest(u89Var);
                    return this;
                }

                public a mergeResponse(w89 w89Var) {
                    m23743e();
                    ((q) this.f89756b).mergeResponse(w89Var);
                    return this;
                }

                public a setRequest(u89 u89Var) {
                    m23743e();
                    ((q) this.f89756b).setRequest(u89Var);
                    return this;
                }

                public a setResponse(w89 w89Var) {
                    m23743e();
                    ((q) this.f89756b).setResponse(w89Var);
                    return this;
                }

                private a() {
                    super(q.DEFAULT_INSTANCE);
                }

                public a setRequest(u89.C13404b c13404b) {
                    m23743e();
                    ((q) this.f89756b).setRequest(c13404b.build());
                    return this;
                }

                public a setResponse(w89.C14478b c14478b) {
                    m23743e();
                    ((q) this.f89756b).setResponse(c14478b.build());
                    return this;
                }
            }

            static {
                q qVar = new q();
                DEFAULT_INSTANCE = qVar;
                v27.m23715h0(q.class, qVar);
            }

            private q() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static q getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(u89 u89Var) {
                u89Var.getClass();
                u89 u89Var2 = this.request_;
                if (u89Var2 == null || u89Var2 == u89.getDefaultInstance()) {
                    this.request_ = u89Var;
                } else {
                    this.request_ = u89.newBuilder(this.request_).mergeFrom(u89Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(w89 w89Var) {
                w89Var.getClass();
                w89 w89Var2 = this.response_;
                if (w89Var2 == null || w89Var2 == w89.getDefaultInstance()) {
                    this.response_ = w89Var;
                } else {
                    this.response_ = w89.newBuilder(this.response_).mergeFrom(w89Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static q parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (q) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static q parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (q) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<q> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(u89 u89Var) {
                u89Var.getClass();
                this.request_ = u89Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(w89 w89Var) {
                w89Var.getClass();
                this.response_ = w89Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.r
            public u89 getRequest() {
                u89 u89Var = this.request_;
                return u89Var == null ? u89.getDefaultInstance() : u89Var;
            }

            @Override // p000.aj3.C0278d.r
            public w89 getResponse() {
                w89 w89Var = this.response_;
                return w89Var == null ? w89.getDefaultInstance() : w89Var;
            }

            @Override // p000.aj3.C0278d.r
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.r
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new q();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<q> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (q.class) {
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

            public static a newBuilder(q qVar) {
                return DEFAULT_INSTANCE.m23739o(qVar);
            }

            public static q parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (q) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static q parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (q) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static q parseFrom(vj1 vj1Var) throws ce8 {
                return (q) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static q parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (q) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static q parseFrom(byte[] bArr) throws ce8 {
                return (q) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static q parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (q) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static q parseFrom(InputStream inputStream) throws IOException {
                return (q) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static q parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (q) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static q parseFrom(f72 f72Var) throws IOException {
                return (q) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static q parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (q) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$r */
        public interface r extends rsa {
            u89 getRequest();

            w89 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$s */
        public static final class s extends v27<s, a> implements t {
            private static final s DEFAULT_INSTANCE;
            private static volatile uhc<s> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private da9 request_;
            private fa9 response_;

            /* JADX INFO: renamed from: aj3$d$s$a */
            public static final class a extends v27.AbstractC13823b<s, a> implements t {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((s) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((s) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.t
                public da9 getRequest() {
                    return ((s) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.t
                public fa9 getResponse() {
                    return ((s) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.t
                public boolean hasRequest() {
                    return ((s) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.t
                public boolean hasResponse() {
                    return ((s) this.f89756b).hasResponse();
                }

                public a mergeRequest(da9 da9Var) {
                    m23743e();
                    ((s) this.f89756b).mergeRequest(da9Var);
                    return this;
                }

                public a mergeResponse(fa9 fa9Var) {
                    m23743e();
                    ((s) this.f89756b).mergeResponse(fa9Var);
                    return this;
                }

                public a setRequest(da9 da9Var) {
                    m23743e();
                    ((s) this.f89756b).setRequest(da9Var);
                    return this;
                }

                public a setResponse(fa9 fa9Var) {
                    m23743e();
                    ((s) this.f89756b).setResponse(fa9Var);
                    return this;
                }

                private a() {
                    super(s.DEFAULT_INSTANCE);
                }

                public a setRequest(da9.C4700b c4700b) {
                    m23743e();
                    ((s) this.f89756b).setRequest(c4700b.build());
                    return this;
                }

                public a setResponse(fa9.C5705b c5705b) {
                    m23743e();
                    ((s) this.f89756b).setResponse(c5705b.build());
                    return this;
                }
            }

            static {
                s sVar = new s();
                DEFAULT_INSTANCE = sVar;
                v27.m23715h0(s.class, sVar);
            }

            private s() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static s getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(da9 da9Var) {
                da9Var.getClass();
                da9 da9Var2 = this.request_;
                if (da9Var2 == null || da9Var2 == da9.getDefaultInstance()) {
                    this.request_ = da9Var;
                } else {
                    this.request_ = da9.newBuilder(this.request_).mergeFrom(da9Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(fa9 fa9Var) {
                fa9Var.getClass();
                fa9 fa9Var2 = this.response_;
                if (fa9Var2 == null || fa9Var2 == fa9.getDefaultInstance()) {
                    this.response_ = fa9Var;
                } else {
                    this.response_ = fa9.newBuilder(this.response_).mergeFrom(fa9Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static s parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (s) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static s parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (s) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<s> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(da9 da9Var) {
                da9Var.getClass();
                this.request_ = da9Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(fa9 fa9Var) {
                fa9Var.getClass();
                this.response_ = fa9Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.t
            public da9 getRequest() {
                da9 da9Var = this.request_;
                return da9Var == null ? da9.getDefaultInstance() : da9Var;
            }

            @Override // p000.aj3.C0278d.t
            public fa9 getResponse() {
                fa9 fa9Var = this.response_;
                return fa9Var == null ? fa9.getDefaultInstance() : fa9Var;
            }

            @Override // p000.aj3.C0278d.t
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.t
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new s();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<s> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (s.class) {
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

            public static a newBuilder(s sVar) {
                return DEFAULT_INSTANCE.m23739o(sVar);
            }

            public static s parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (s) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static s parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (s) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static s parseFrom(vj1 vj1Var) throws ce8 {
                return (s) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static s parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (s) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static s parseFrom(byte[] bArr) throws ce8 {
                return (s) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static s parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (s) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static s parseFrom(InputStream inputStream) throws IOException {
                return (s) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static s parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (s) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static s parseFrom(f72 f72Var) throws IOException {
                return (s) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static s parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (s) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$t */
        public interface t extends rsa {
            da9 getRequest();

            fa9 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        /* JADX INFO: renamed from: aj3$d$u */
        public static final class u extends v27<u, a> implements v {
            private static final u DEFAULT_INSTANCE;
            public static final int LISTEN_RESPONSE_FIELD_NUMBER = 1;
            public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 2;
            private static volatile uhc<u> PARSER;
            private int bitField0_;
            private fa9 listenResponse_;
            private fde matchingDocuments_;

            /* JADX INFO: renamed from: aj3$d$u$a */
            public static final class a extends v27.AbstractC13823b<u, a> implements v {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearListenResponse() {
                    m23743e();
                    ((u) this.f89756b).clearListenResponse();
                    return this;
                }

                public a clearMatchingDocuments() {
                    m23743e();
                    ((u) this.f89756b).clearMatchingDocuments();
                    return this;
                }

                @Override // p000.aj3.C0278d.v
                public fa9 getListenResponse() {
                    return ((u) this.f89756b).getListenResponse();
                }

                @Override // p000.aj3.C0278d.v
                public fde getMatchingDocuments() {
                    return ((u) this.f89756b).getMatchingDocuments();
                }

                @Override // p000.aj3.C0278d.v
                public boolean hasListenResponse() {
                    return ((u) this.f89756b).hasListenResponse();
                }

                @Override // p000.aj3.C0278d.v
                public boolean hasMatchingDocuments() {
                    return ((u) this.f89756b).hasMatchingDocuments();
                }

                public a mergeListenResponse(fa9 fa9Var) {
                    m23743e();
                    ((u) this.f89756b).mergeListenResponse(fa9Var);
                    return this;
                }

                public a mergeMatchingDocuments(fde fdeVar) {
                    m23743e();
                    ((u) this.f89756b).mergeMatchingDocuments(fdeVar);
                    return this;
                }

                public a setListenResponse(fa9 fa9Var) {
                    m23743e();
                    ((u) this.f89756b).setListenResponse(fa9Var);
                    return this;
                }

                public a setMatchingDocuments(fde fdeVar) {
                    m23743e();
                    ((u) this.f89756b).setMatchingDocuments(fdeVar);
                    return this;
                }

                private a() {
                    super(u.DEFAULT_INSTANCE);
                }

                public a setListenResponse(fa9.C5705b c5705b) {
                    m23743e();
                    ((u) this.f89756b).setListenResponse(c5705b.build());
                    return this;
                }

                public a setMatchingDocuments(fde.C5735b c5735b) {
                    m23743e();
                    ((u) this.f89756b).setMatchingDocuments(c5735b.build());
                    return this;
                }
            }

            static {
                u uVar = new u();
                DEFAULT_INSTANCE = uVar;
                v27.m23715h0(u.class, uVar);
            }

            private u() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearListenResponse() {
                this.listenResponse_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMatchingDocuments() {
                this.matchingDocuments_ = null;
                this.bitField0_ &= -3;
            }

            public static u getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeListenResponse(fa9 fa9Var) {
                fa9Var.getClass();
                fa9 fa9Var2 = this.listenResponse_;
                if (fa9Var2 == null || fa9Var2 == fa9.getDefaultInstance()) {
                    this.listenResponse_ = fa9Var;
                } else {
                    this.listenResponse_ = fa9.newBuilder(this.listenResponse_).mergeFrom(fa9Var).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeMatchingDocuments(fde fdeVar) {
                fdeVar.getClass();
                fde fdeVar2 = this.matchingDocuments_;
                if (fdeVar2 == null || fdeVar2 == fde.getDefaultInstance()) {
                    this.matchingDocuments_ = fdeVar;
                } else {
                    this.matchingDocuments_ = fde.newBuilder(this.matchingDocuments_).mergeFrom(fdeVar).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static u parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (u) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static u parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (u) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<u> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setListenResponse(fa9 fa9Var) {
                fa9Var.getClass();
                this.listenResponse_ = fa9Var;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMatchingDocuments(fde fdeVar) {
                fdeVar.getClass();
                this.matchingDocuments_ = fdeVar;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.v
            public fa9 getListenResponse() {
                fa9 fa9Var = this.listenResponse_;
                return fa9Var == null ? fa9.getDefaultInstance() : fa9Var;
            }

            @Override // p000.aj3.C0278d.v
            public fde getMatchingDocuments() {
                fde fdeVar = this.matchingDocuments_;
                return fdeVar == null ? fde.getDefaultInstance() : fdeVar;
            }

            @Override // p000.aj3.C0278d.v
            public boolean hasListenResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.v
            public boolean hasMatchingDocuments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new u();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "listenResponse_", "matchingDocuments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<u> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (u.class) {
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

            public static a newBuilder(u uVar) {
                return DEFAULT_INSTANCE.m23739o(uVar);
            }

            public static u parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (u) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static u parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (u) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static u parseFrom(vj1 vj1Var) throws ce8 {
                return (u) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static u parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (u) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static u parseFrom(byte[] bArr) throws ce8 {
                return (u) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static u parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (u) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static u parseFrom(InputStream inputStream) throws IOException {
                return (u) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static u parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (u) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static u parseFrom(f72 f72Var) throws IOException {
                return (u) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static u parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (u) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$v */
        public interface v extends rsa {
            fa9 getListenResponse();

            fde getMatchingDocuments();

            boolean hasListenResponse();

            boolean hasMatchingDocuments();
        }

        /* JADX INFO: renamed from: aj3$d$w */
        public static final class w extends v27<w, a> implements x {
            private static final w DEFAULT_INSTANCE;
            private static volatile uhc<w> PARSER = null;
            public static final int TARGET_ID_FIELD_NUMBER = 1;
            private int targetId_;

            /* JADX INFO: renamed from: aj3$d$w$a */
            public static final class a extends v27.AbstractC13823b<w, a> implements x {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearTargetId() {
                    m23743e();
                    ((w) this.f89756b).clearTargetId();
                    return this;
                }

                @Override // p000.aj3.C0278d.x
                public int getTargetId() {
                    return ((w) this.f89756b).getTargetId();
                }

                public a setTargetId(int i) {
                    m23743e();
                    ((w) this.f89756b).setTargetId(i);
                    return this;
                }

                private a() {
                    super(w.DEFAULT_INSTANCE);
                }
            }

            static {
                w wVar = new w();
                DEFAULT_INSTANCE = wVar;
                v27.m23715h0(w.class, wVar);
            }

            private w() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTargetId() {
                this.targetId_ = 0;
            }

            public static w getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static w parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (w) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static w parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (w) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<w> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTargetId(int i) {
                this.targetId_ = i;
            }

            @Override // p000.aj3.C0278d.x
            public int getTargetId() {
                return this.targetId_;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new w();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"targetId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<w> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (w.class) {
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

            public static a newBuilder(w wVar) {
                return DEFAULT_INSTANCE.m23739o(wVar);
            }

            public static w parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (w) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static w parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (w) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static w parseFrom(vj1 vj1Var) throws ce8 {
                return (w) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static w parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (w) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static w parseFrom(byte[] bArr) throws ce8 {
                return (w) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static w parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (w) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static w parseFrom(InputStream inputStream) throws IOException {
                return (w) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static w parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (w) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static w parseFrom(f72 f72Var) throws IOException {
                return (w) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static w parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (w) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$x */
        public interface x extends rsa {
            int getTargetId();
        }

        /* JADX INFO: renamed from: aj3$d$y */
        public static final class y extends v27<y, a> implements z {
            private static final y DEFAULT_INSTANCE;
            private static volatile uhc<y> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int RESPONSE_FIELD_NUMBER = 2;
            private int bitField0_;
            private lae request_;
            private qz4 response_;

            /* JADX INFO: renamed from: aj3$d$y$a */
            public static final class a extends v27.AbstractC13823b<y, a> implements z {
                public /* synthetic */ a(C0275a c0275a) {
                    this();
                }

                public a clearRequest() {
                    m23743e();
                    ((y) this.f89756b).clearRequest();
                    return this;
                }

                public a clearResponse() {
                    m23743e();
                    ((y) this.f89756b).clearResponse();
                    return this;
                }

                @Override // p000.aj3.C0278d.z
                public lae getRequest() {
                    return ((y) this.f89756b).getRequest();
                }

                @Override // p000.aj3.C0278d.z
                public qz4 getResponse() {
                    return ((y) this.f89756b).getResponse();
                }

                @Override // p000.aj3.C0278d.z
                public boolean hasRequest() {
                    return ((y) this.f89756b).hasRequest();
                }

                @Override // p000.aj3.C0278d.z
                public boolean hasResponse() {
                    return ((y) this.f89756b).hasResponse();
                }

                public a mergeRequest(lae laeVar) {
                    m23743e();
                    ((y) this.f89756b).mergeRequest(laeVar);
                    return this;
                }

                public a mergeResponse(qz4 qz4Var) {
                    m23743e();
                    ((y) this.f89756b).mergeResponse(qz4Var);
                    return this;
                }

                public a setRequest(lae laeVar) {
                    m23743e();
                    ((y) this.f89756b).setRequest(laeVar);
                    return this;
                }

                public a setResponse(qz4 qz4Var) {
                    m23743e();
                    ((y) this.f89756b).setResponse(qz4Var);
                    return this;
                }

                private a() {
                    super(y.DEFAULT_INSTANCE);
                }

                public a setRequest(lae.C8746b c8746b) {
                    m23743e();
                    ((y) this.f89756b).setRequest(c8746b.build());
                    return this;
                }

                public a setResponse(qz4.C11769b c11769b) {
                    m23743e();
                    ((y) this.f89756b).setResponse(c11769b.build());
                    return this;
                }
            }

            static {
                y yVar = new y();
                DEFAULT_INSTANCE = yVar;
                v27.m23715h0(y.class, yVar);
            }

            private y() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                this.request_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResponse() {
                this.response_ = null;
                this.bitField0_ &= -3;
            }

            public static y getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRequest(lae laeVar) {
                laeVar.getClass();
                lae laeVar2 = this.request_;
                if (laeVar2 == null || laeVar2 == lae.getDefaultInstance()) {
                    this.request_ = laeVar;
                } else {
                    this.request_ = lae.newBuilder(this.request_).mergeFrom(laeVar).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeResponse(qz4 qz4Var) {
                qz4Var.getClass();
                qz4 qz4Var2 = this.response_;
                if (qz4Var2 == null || qz4Var2 == qz4.getDefaultInstance()) {
                    this.response_ = qz4Var;
                } else {
                    this.response_ = qz4.newBuilder(this.response_).mergeFrom(qz4Var).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static y parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (y) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static y parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (y) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<y> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(lae laeVar) {
                laeVar.getClass();
                this.request_ = laeVar;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResponse(qz4 qz4Var) {
                qz4Var.getClass();
                this.response_ = qz4Var;
                this.bitField0_ |= 2;
            }

            @Override // p000.aj3.C0278d.z
            public lae getRequest() {
                lae laeVar = this.request_;
                return laeVar == null ? lae.getDefaultInstance() : laeVar;
            }

            @Override // p000.aj3.C0278d.z
            public qz4 getResponse() {
                qz4 qz4Var = this.response_;
                return qz4Var == null ? qz4.getDefaultInstance() : qz4Var;
            }

            @Override // p000.aj3.C0278d.z
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.aj3.C0278d.z
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C0275a c0275a = null;
                switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                    case 1:
                        return new y();
                    case 2:
                        return new a(c0275a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<y> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (y.class) {
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

            public static a newBuilder(y yVar) {
                return DEFAULT_INSTANCE.m23739o(yVar);
            }

            public static y parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (y) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static y parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (y) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static y parseFrom(vj1 vj1Var) throws ce8 {
                return (y) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static y parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (y) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static y parseFrom(byte[] bArr) throws ce8 {
                return (y) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static y parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (y) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static y parseFrom(InputStream inputStream) throws IOException {
                return (y) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static y parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (y) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static y parseFrom(f72 f72Var) throws IOException {
                return (y) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static y parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (y) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: aj3$d$z */
        public interface z extends rsa {
            lae getRequest();

            qz4 getResponse();

            boolean hasRequest();

            boolean hasResponse();
        }

        static {
            C0278d c0278d = new C0278d();
            DEFAULT_INSTANCE = c0278d;
            v27.m23715h0(C0278d.class, c0278d);
        }

        private C0278d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMatchingDocuments(Iterable<? extends u> iterable) {
            ensureMatchingDocumentsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.matchingDocuments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMatchingDocuments(u uVar) {
            uVar.getClass();
            ensureMatchingDocumentsIsMutable();
            this.matchingDocuments_.add(uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatchGetDocuments() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeginTransaction() {
            if (this.actionCase_ == 6) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommit() {
            if (this.actionCase_ == 7) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateDocument() {
            if (this.actionCase_ == 3) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDatabaseContentsBeforeAction() {
            this.databaseContentsBeforeAction_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeleteDocument() {
            if (this.actionCase_ == 5) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGetDocument() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearListCollectionIds() {
            if (this.actionCase_ == 9) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearListDocuments() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearListen() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMatchingDocuments() {
            this.matchingDocuments_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemoveListen() {
            if (this.actionCase_ == 13) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRollback() {
            if (this.actionCase_ == 8) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunQuery() {
            if (this.actionCase_ == 11) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateDocument() {
            if (this.actionCase_ == 4) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void ensureMatchingDocumentsIsMutable() {
            w98.InterfaceC14504k<u> interfaceC14504k = this.matchingDocuments_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.matchingDocuments_ = v27.m23698P(interfaceC14504k);
        }

        public static C0278d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatchGetDocuments(b bVar) {
            bVar.getClass();
            if (this.actionCase_ != 10 || this.action_ == b.getDefaultInstance()) {
                this.action_ = bVar;
            } else {
                this.action_ = b.newBuilder((b) this.action_).mergeFrom(bVar).buildPartial();
            }
            this.actionCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBeginTransaction(d dVar) {
            dVar.getClass();
            if (this.actionCase_ != 6 || this.action_ == d.getDefaultInstance()) {
                this.action_ = dVar;
            } else {
                this.action_ = d.newBuilder((d) this.action_).mergeFrom(dVar).buildPartial();
            }
            this.actionCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCommit(g gVar) {
            gVar.getClass();
            if (this.actionCase_ != 7 || this.action_ == g.getDefaultInstance()) {
                this.action_ = gVar;
            } else {
                this.action_ = g.newBuilder((g) this.action_).mergeFrom(gVar).buildPartial();
            }
            this.actionCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCreateDocument(i iVar) {
            iVar.getClass();
            if (this.actionCase_ != 3 || this.action_ == i.getDefaultInstance()) {
                this.action_ = iVar;
            } else {
                this.action_ = i.newBuilder((i) this.action_).mergeFrom(iVar).buildPartial();
            }
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDatabaseContentsBeforeAction(a0 a0Var) {
            a0Var.getClass();
            a0 a0Var2 = this.databaseContentsBeforeAction_;
            if (a0Var2 == null || a0Var2 == a0.getDefaultInstance()) {
                this.databaseContentsBeforeAction_ = a0Var;
            } else {
                this.databaseContentsBeforeAction_ = a0.newBuilder(this.databaseContentsBeforeAction_).mergeFrom(a0Var).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDeleteDocument(k kVar) {
            kVar.getClass();
            if (this.actionCase_ != 5 || this.action_ == k.getDefaultInstance()) {
                this.action_ = kVar;
            } else {
                this.action_ = k.newBuilder((k) this.action_).mergeFrom(kVar).buildPartial();
            }
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGetDocument(m mVar) {
            mVar.getClass();
            if (this.actionCase_ != 1 || this.action_ == m.getDefaultInstance()) {
                this.action_ = mVar;
            } else {
                this.action_ = m.newBuilder((m) this.action_).mergeFrom(mVar).buildPartial();
            }
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListCollectionIds(o oVar) {
            oVar.getClass();
            if (this.actionCase_ != 9 || this.action_ == o.getDefaultInstance()) {
                this.action_ = oVar;
            } else {
                this.action_ = o.newBuilder((o) this.action_).mergeFrom(oVar).buildPartial();
            }
            this.actionCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListDocuments(q qVar) {
            qVar.getClass();
            if (this.actionCase_ != 2 || this.action_ == q.getDefaultInstance()) {
                this.action_ = qVar;
            } else {
                this.action_ = q.newBuilder((q) this.action_).mergeFrom(qVar).buildPartial();
            }
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListen(s sVar) {
            sVar.getClass();
            if (this.actionCase_ != 12 || this.action_ == s.getDefaultInstance()) {
                this.action_ = sVar;
            } else {
                this.action_ = s.newBuilder((s) this.action_).mergeFrom(sVar).buildPartial();
            }
            this.actionCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRemoveListen(w wVar) {
            wVar.getClass();
            if (this.actionCase_ != 13 || this.action_ == w.getDefaultInstance()) {
                this.action_ = wVar;
            } else {
                this.action_ = w.newBuilder((w) this.action_).mergeFrom(wVar).buildPartial();
            }
            this.actionCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRollback(y yVar) {
            yVar.getClass();
            if (this.actionCase_ != 8 || this.action_ == y.getDefaultInstance()) {
                this.action_ = yVar;
            } else {
                this.action_ = y.newBuilder((y) this.action_).mergeFrom(yVar).buildPartial();
            }
            this.actionCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRunQuery(a0 a0Var) {
            a0Var.getClass();
            if (this.actionCase_ != 11 || this.action_ == a0.getDefaultInstance()) {
                this.action_ = a0Var;
            } else {
                this.action_ = a0.newBuilder((a0) this.action_).mergeFrom(a0Var).buildPartial();
            }
            this.actionCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(C0282h c0282h) {
            c0282h.getClass();
            C0282h c0282h2 = this.status_;
            if (c0282h2 == null || c0282h2 == C0282h.getDefaultInstance()) {
                this.status_ = c0282h;
            } else {
                this.status_ = C0282h.newBuilder(this.status_).mergeFrom(c0282h).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpdateDocument(c0 c0Var) {
            c0Var.getClass();
            if (this.actionCase_ != 4 || this.action_ == c0.getDefaultInstance()) {
                this.action_ = c0Var;
            } else {
                this.action_ = c0.newBuilder((c0) this.action_).mergeFrom(c0Var).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static f newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0278d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0278d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0278d parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0278d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0278d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMatchingDocuments(int i2) {
            ensureMatchingDocumentsIsMutable();
            this.matchingDocuments_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatchGetDocuments(b bVar) {
            bVar.getClass();
            this.action_ = bVar;
            this.actionCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeginTransaction(d dVar) {
            dVar.getClass();
            this.action_ = dVar;
            this.actionCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommit(g gVar) {
            gVar.getClass();
            this.action_ = gVar;
            this.actionCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateDocument(i iVar) {
            iVar.getClass();
            this.action_ = iVar;
            this.actionCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDatabaseContentsBeforeAction(a0 a0Var) {
            a0Var.getClass();
            this.databaseContentsBeforeAction_ = a0Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeleteDocument(k kVar) {
            kVar.getClass();
            this.action_ = kVar;
            this.actionCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGetDocument(m mVar) {
            mVar.getClass();
            this.action_ = mVar;
            this.actionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setListCollectionIds(o oVar) {
            oVar.getClass();
            this.action_ = oVar;
            this.actionCase_ = 9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setListDocuments(q qVar) {
            qVar.getClass();
            this.action_ = qVar;
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setListen(s sVar) {
            sVar.getClass();
            this.action_ = sVar;
            this.actionCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMatchingDocuments(int i2, u uVar) {
            uVar.getClass();
            ensureMatchingDocumentsIsMutable();
            this.matchingDocuments_.set(i2, uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemoveListen(w wVar) {
            wVar.getClass();
            this.action_ = wVar;
            this.actionCase_ = 13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRollback(y yVar) {
            yVar.getClass();
            this.action_ = yVar;
            this.actionCase_ = 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunQuery(a0 a0Var) {
            a0Var.getClass();
            this.action_ = a0Var;
            this.actionCase_ = 11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(C0282h c0282h) {
            c0282h.getClass();
            this.status_ = c0282h;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateDocument(c0 c0Var) {
            c0Var.getClass();
            this.action_ = c0Var;
            this.actionCase_ = 4;
        }

        @Override // p000.aj3.InterfaceC0279e
        public a getActionCase() {
            return a.forNumber(this.actionCase_);
        }

        @Override // p000.aj3.InterfaceC0279e
        public b getBatchGetDocuments() {
            return this.actionCase_ == 10 ? (b) this.action_ : b.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public d getBeginTransaction() {
            return this.actionCase_ == 6 ? (d) this.action_ : d.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public g getCommit() {
            return this.actionCase_ == 7 ? (g) this.action_ : g.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public i getCreateDocument() {
            return this.actionCase_ == 3 ? (i) this.action_ : i.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public a0 getDatabaseContentsBeforeAction() {
            a0 a0Var = this.databaseContentsBeforeAction_;
            return a0Var == null ? a0.getDefaultInstance() : a0Var;
        }

        @Override // p000.aj3.InterfaceC0279e
        public k getDeleteDocument() {
            return this.actionCase_ == 5 ? (k) this.action_ : k.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public m getGetDocument() {
            return this.actionCase_ == 1 ? (m) this.action_ : m.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public o getListCollectionIds() {
            return this.actionCase_ == 9 ? (o) this.action_ : o.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public q getListDocuments() {
            return this.actionCase_ == 2 ? (q) this.action_ : q.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public s getListen() {
            return this.actionCase_ == 12 ? (s) this.action_ : s.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public u getMatchingDocuments(int i2) {
            return this.matchingDocuments_.get(i2);
        }

        @Override // p000.aj3.InterfaceC0279e
        public int getMatchingDocumentsCount() {
            return this.matchingDocuments_.size();
        }

        @Override // p000.aj3.InterfaceC0279e
        public List<u> getMatchingDocumentsList() {
            return this.matchingDocuments_;
        }

        public v getMatchingDocumentsOrBuilder(int i2) {
            return this.matchingDocuments_.get(i2);
        }

        public List<? extends v> getMatchingDocumentsOrBuilderList() {
            return this.matchingDocuments_;
        }

        @Override // p000.aj3.InterfaceC0279e
        public w getRemoveListen() {
            return this.actionCase_ == 13 ? (w) this.action_ : w.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public y getRollback() {
            return this.actionCase_ == 8 ? (y) this.action_ : y.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public a0 getRunQuery() {
            return this.actionCase_ == 11 ? (a0) this.action_ : a0.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public C0282h getStatus() {
            C0282h c0282h = this.status_;
            return c0282h == null ? C0282h.getDefaultInstance() : c0282h;
        }

        @Override // p000.aj3.InterfaceC0279e
        public c0 getUpdateDocument() {
            return this.actionCase_ == 4 ? (c0) this.action_ : c0.getDefaultInstance();
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasBatchGetDocuments() {
            return this.actionCase_ == 10;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasBeginTransaction() {
            return this.actionCase_ == 6;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasCommit() {
            return this.actionCase_ == 7;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasCreateDocument() {
            return this.actionCase_ == 3;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasDatabaseContentsBeforeAction() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasDeleteDocument() {
            return this.actionCase_ == 5;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasGetDocument() {
            return this.actionCase_ == 1;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasListCollectionIds() {
            return this.actionCase_ == 9;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasListDocuments() {
            return this.actionCase_ == 2;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasListen() {
            return this.actionCase_ == 12;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasRemoveListen() {
            return this.actionCase_ == 13;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasRollback() {
            return this.actionCase_ == 8;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasRunQuery() {
            return this.actionCase_ == 11;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.aj3.InterfaceC0279e
        public boolean hasUpdateDocument() {
            return this.actionCase_ == 4;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0278d();
                case 2:
                    return new f(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001Ë\u0010\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000Éဉ\u0000Êဉ\u0001Ë\u001b", new Object[]{"action_", "actionCase_", "bitField0_", m.class, q.class, i.class, c0.class, k.class, d.class, g.class, y.class, o.class, b.class, a0.class, s.class, w.class, "status_", "databaseContentsBeforeAction_", "matchingDocuments_", u.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0278d> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0278d.class) {
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

        public static f newBuilder(C0278d c0278d) {
            return DEFAULT_INSTANCE.m23739o(c0278d);
        }

        public static C0278d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0278d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0278d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0278d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0278d parseFrom(vj1 vj1Var) throws ce8 {
            return (C0278d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMatchingDocuments(int i2, u uVar) {
            uVar.getClass();
            ensureMatchingDocumentsIsMutable();
            this.matchingDocuments_.add(i2, uVar);
        }

        public static C0278d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0278d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0278d parseFrom(byte[] bArr) throws ce8 {
            return (C0278d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0278d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0278d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0278d parseFrom(InputStream inputStream) throws IOException {
            return (C0278d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0278d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0278d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0278d parseFrom(f72 f72Var) throws IOException {
            return (C0278d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0278d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0278d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$e */
    public interface InterfaceC0279e extends rsa {
        C0278d.a getActionCase();

        C0278d.b getBatchGetDocuments();

        C0278d.d getBeginTransaction();

        C0278d.g getCommit();

        C0278d.i getCreateDocument();

        C0278d.a0 getDatabaseContentsBeforeAction();

        C0278d.k getDeleteDocument();

        C0278d.m getGetDocument();

        C0278d.o getListCollectionIds();

        C0278d.q getListDocuments();

        C0278d.s getListen();

        C0278d.u getMatchingDocuments(int i);

        int getMatchingDocumentsCount();

        List<C0278d.u> getMatchingDocumentsList();

        C0278d.w getRemoveListen();

        C0278d.y getRollback();

        C0278d.a0 getRunQuery();

        C0282h getStatus();

        C0278d.c0 getUpdateDocument();

        boolean hasBatchGetDocuments();

        boolean hasBeginTransaction();

        boolean hasCommit();

        boolean hasCreateDocument();

        boolean hasDatabaseContentsBeforeAction();

        boolean hasDeleteDocument();

        boolean hasGetDocument();

        boolean hasListCollectionIds();

        boolean hasListDocuments();

        boolean hasListen();

        boolean hasRemoveListen();

        boolean hasRollback();

        boolean hasRunQuery();

        boolean hasStatus();

        boolean hasUpdateDocument();
    }

    /* JADX INFO: renamed from: aj3$f */
    public static final class C0280f extends v27<C0280f, a> implements InterfaceC0281g {
        private static final C0280f DEFAULT_INSTANCE;
        private static volatile uhc<C0280f> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C0284j testTrace_;

        /* JADX INFO: renamed from: aj3$f$a */
        public static final class a extends v27.AbstractC13823b<C0280f, a> implements InterfaceC0281g {
            public /* synthetic */ a(C0275a c0275a) {
                this();
            }

            public a clearTestTrace() {
                m23743e();
                ((C0280f) this.f89756b).clearTestTrace();
                return this;
            }

            @Override // p000.aj3.InterfaceC0281g
            public C0284j getTestTrace() {
                return ((C0280f) this.f89756b).getTestTrace();
            }

            @Override // p000.aj3.InterfaceC0281g
            public boolean hasTestTrace() {
                return ((C0280f) this.f89756b).hasTestTrace();
            }

            public a mergeTestTrace(C0284j c0284j) {
                m23743e();
                ((C0280f) this.f89756b).mergeTestTrace(c0284j);
                return this;
            }

            public a setTestTrace(C0284j c0284j) {
                m23743e();
                ((C0280f) this.f89756b).setTestTrace(c0284j);
                return this;
            }

            private a() {
                super(C0280f.DEFAULT_INSTANCE);
            }

            public a setTestTrace(C0284j.a aVar) {
                m23743e();
                ((C0280f) this.f89756b).setTestTrace(aVar.build());
                return this;
            }
        }

        static {
            C0280f c0280f = new C0280f();
            DEFAULT_INSTANCE = c0280f;
            v27.m23715h0(C0280f.class, c0280f);
        }

        private C0280f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestTrace() {
            this.testTrace_ = null;
            this.bitField0_ &= -2;
        }

        public static C0280f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTestTrace(C0284j c0284j) {
            c0284j.getClass();
            C0284j c0284j2 = this.testTrace_;
            if (c0284j2 == null || c0284j2 == C0284j.getDefaultInstance()) {
                this.testTrace_ = c0284j;
            } else {
                this.testTrace_ = C0284j.newBuilder(this.testTrace_).mergeFrom(c0284j).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0280f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0280f) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0280f parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0280f) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0280f> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestTrace(C0284j c0284j) {
            c0284j.getClass();
            this.testTrace_ = c0284j;
            this.bitField0_ |= 1;
        }

        @Override // p000.aj3.InterfaceC0281g
        public C0284j getTestTrace() {
            C0284j c0284j = this.testTrace_;
            return c0284j == null ? C0284j.getDefaultInstance() : c0284j;
        }

        @Override // p000.aj3.InterfaceC0281g
        public boolean hasTestTrace() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0280f();
                case 2:
                    return new a(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "testTrace_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0280f> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0280f.class) {
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

        public static a newBuilder(C0280f c0280f) {
            return DEFAULT_INSTANCE.m23739o(c0280f);
        }

        public static C0280f parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0280f) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0280f parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0280f) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0280f parseFrom(vj1 vj1Var) throws ce8 {
            return (C0280f) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0280f parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0280f) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0280f parseFrom(byte[] bArr) throws ce8 {
            return (C0280f) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0280f parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0280f) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0280f parseFrom(InputStream inputStream) throws IOException {
            return (C0280f) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0280f parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0280f) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0280f parseFrom(f72 f72Var) throws IOException {
            return (C0280f) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0280f parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0280f) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$g */
    public interface InterfaceC0281g extends rsa {
        C0284j getTestTrace();

        boolean hasTestTrace();
    }

    /* JADX INFO: renamed from: aj3$h */
    public static final class C0282h extends v27<C0282h, a> implements InterfaceC0283i {
        public static final int CANONICAL_CODE_FIELD_NUMBER = 6;
        public static final int CODE_FIELD_NUMBER = 1;
        private static final C0282h DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        private static volatile uhc<C0282h> PARSER = null;
        public static final int SPACE_FIELD_NUMBER = 2;
        private int canonicalCode_;
        private int code_;
        private String space_ = "";
        private String message_ = "";

        /* JADX INFO: renamed from: aj3$h$a */
        public static final class a extends v27.AbstractC13823b<C0282h, a> implements InterfaceC0283i {
            public /* synthetic */ a(C0275a c0275a) {
                this();
            }

            public a clearCanonicalCode() {
                m23743e();
                ((C0282h) this.f89756b).clearCanonicalCode();
                return this;
            }

            public a clearCode() {
                m23743e();
                ((C0282h) this.f89756b).clearCode();
                return this;
            }

            public a clearMessage() {
                m23743e();
                ((C0282h) this.f89756b).clearMessage();
                return this;
            }

            public a clearSpace() {
                m23743e();
                ((C0282h) this.f89756b).clearSpace();
                return this;
            }

            @Override // p000.aj3.InterfaceC0283i
            public int getCanonicalCode() {
                return ((C0282h) this.f89756b).getCanonicalCode();
            }

            @Override // p000.aj3.InterfaceC0283i
            public int getCode() {
                return ((C0282h) this.f89756b).getCode();
            }

            @Override // p000.aj3.InterfaceC0283i
            public String getMessage() {
                return ((C0282h) this.f89756b).getMessage();
            }

            @Override // p000.aj3.InterfaceC0283i
            public vj1 getMessageBytes() {
                return ((C0282h) this.f89756b).getMessageBytes();
            }

            @Override // p000.aj3.InterfaceC0283i
            public String getSpace() {
                return ((C0282h) this.f89756b).getSpace();
            }

            @Override // p000.aj3.InterfaceC0283i
            public vj1 getSpaceBytes() {
                return ((C0282h) this.f89756b).getSpaceBytes();
            }

            public a setCanonicalCode(int i) {
                m23743e();
                ((C0282h) this.f89756b).setCanonicalCode(i);
                return this;
            }

            public a setCode(int i) {
                m23743e();
                ((C0282h) this.f89756b).setCode(i);
                return this;
            }

            public a setMessage(String str) {
                m23743e();
                ((C0282h) this.f89756b).setMessage(str);
                return this;
            }

            public a setMessageBytes(vj1 vj1Var) {
                m23743e();
                ((C0282h) this.f89756b).setMessageBytes(vj1Var);
                return this;
            }

            public a setSpace(String str) {
                m23743e();
                ((C0282h) this.f89756b).setSpace(str);
                return this;
            }

            public a setSpaceBytes(vj1 vj1Var) {
                m23743e();
                ((C0282h) this.f89756b).setSpaceBytes(vj1Var);
                return this;
            }

            private a() {
                super(C0282h.DEFAULT_INSTANCE);
            }
        }

        static {
            C0282h c0282h = new C0282h();
            DEFAULT_INSTANCE = c0282h;
            v27.m23715h0(C0282h.class, c0282h);
        }

        private C0282h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanonicalCode() {
            this.canonicalCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpace() {
            this.space_ = getDefaultInstance().getSpace();
        }

        public static C0282h getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0282h parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0282h) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0282h parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0282h) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0282h> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanonicalCode(int i) {
            this.canonicalCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.message_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpace(String str) {
            str.getClass();
            this.space_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpaceBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.space_ = vj1Var.toStringUtf8();
        }

        @Override // p000.aj3.InterfaceC0283i
        public int getCanonicalCode() {
            return this.canonicalCode_;
        }

        @Override // p000.aj3.InterfaceC0283i
        public int getCode() {
            return this.code_;
        }

        @Override // p000.aj3.InterfaceC0283i
        public String getMessage() {
            return this.message_;
        }

        @Override // p000.aj3.InterfaceC0283i
        public vj1 getMessageBytes() {
            return vj1.copyFromUtf8(this.message_);
        }

        @Override // p000.aj3.InterfaceC0283i
        public String getSpace() {
            return this.space_;
        }

        @Override // p000.aj3.InterfaceC0283i
        public vj1 getSpaceBytes() {
            return vj1.copyFromUtf8(this.space_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0282h();
                case 2:
                    return new a(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0006\u0004", new Object[]{"code_", "space_", "message_", "canonicalCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0282h> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0282h.class) {
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

        public static a newBuilder(C0282h c0282h) {
            return DEFAULT_INSTANCE.m23739o(c0282h);
        }

        public static C0282h parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0282h) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0282h parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0282h) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0282h parseFrom(vj1 vj1Var) throws ce8 {
            return (C0282h) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0282h parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0282h) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0282h parseFrom(byte[] bArr) throws ce8 {
            return (C0282h) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0282h parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0282h) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0282h parseFrom(InputStream inputStream) throws IOException {
            return (C0282h) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0282h parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0282h) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0282h parseFrom(f72 f72Var) throws IOException {
            return (C0282h) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0282h parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0282h) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$i */
    public interface InterfaceC0283i extends rsa {
        int getCanonicalCode();

        int getCode();

        String getMessage();

        vj1 getMessageBytes();

        String getSpace();

        vj1 getSpaceBytes();
    }

    /* JADX INFO: renamed from: aj3$j */
    public static final class C0284j extends v27<C0284j, a> implements InterfaceC0285k {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final C0284j DEFAULT_INSTANCE;
        private static volatile uhc<C0284j> PARSER = null;
        public static final int TRACE_DESCRIPTION_FIELD_NUMBER = 3;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        private String traceId_ = "";
        private w98.InterfaceC14504k<C0276b> action_ = v27.m23722x();
        private String traceDescription_ = "";

        /* JADX INFO: renamed from: aj3$j$a */
        public static final class a extends v27.AbstractC13823b<C0284j, a> implements InterfaceC0285k {
            public /* synthetic */ a(C0275a c0275a) {
                this();
            }

            public a addAction(C0276b c0276b) {
                m23743e();
                ((C0284j) this.f89756b).addAction(c0276b);
                return this;
            }

            public a addAllAction(Iterable<? extends C0276b> iterable) {
                m23743e();
                ((C0284j) this.f89756b).addAllAction(iterable);
                return this;
            }

            public a clearAction() {
                m23743e();
                ((C0284j) this.f89756b).clearAction();
                return this;
            }

            public a clearTraceDescription() {
                m23743e();
                ((C0284j) this.f89756b).clearTraceDescription();
                return this;
            }

            public a clearTraceId() {
                m23743e();
                ((C0284j) this.f89756b).clearTraceId();
                return this;
            }

            @Override // p000.aj3.InterfaceC0285k
            public C0276b getAction(int i) {
                return ((C0284j) this.f89756b).getAction(i);
            }

            @Override // p000.aj3.InterfaceC0285k
            public int getActionCount() {
                return ((C0284j) this.f89756b).getActionCount();
            }

            @Override // p000.aj3.InterfaceC0285k
            public List<C0276b> getActionList() {
                return Collections.unmodifiableList(((C0284j) this.f89756b).getActionList());
            }

            @Override // p000.aj3.InterfaceC0285k
            public String getTraceDescription() {
                return ((C0284j) this.f89756b).getTraceDescription();
            }

            @Override // p000.aj3.InterfaceC0285k
            public vj1 getTraceDescriptionBytes() {
                return ((C0284j) this.f89756b).getTraceDescriptionBytes();
            }

            @Override // p000.aj3.InterfaceC0285k
            public String getTraceId() {
                return ((C0284j) this.f89756b).getTraceId();
            }

            @Override // p000.aj3.InterfaceC0285k
            public vj1 getTraceIdBytes() {
                return ((C0284j) this.f89756b).getTraceIdBytes();
            }

            public a removeAction(int i) {
                m23743e();
                ((C0284j) this.f89756b).removeAction(i);
                return this;
            }

            public a setAction(int i, C0276b c0276b) {
                m23743e();
                ((C0284j) this.f89756b).setAction(i, c0276b);
                return this;
            }

            public a setTraceDescription(String str) {
                m23743e();
                ((C0284j) this.f89756b).setTraceDescription(str);
                return this;
            }

            public a setTraceDescriptionBytes(vj1 vj1Var) {
                m23743e();
                ((C0284j) this.f89756b).setTraceDescriptionBytes(vj1Var);
                return this;
            }

            public a setTraceId(String str) {
                m23743e();
                ((C0284j) this.f89756b).setTraceId(str);
                return this;
            }

            public a setTraceIdBytes(vj1 vj1Var) {
                m23743e();
                ((C0284j) this.f89756b).setTraceIdBytes(vj1Var);
                return this;
            }

            private a() {
                super(C0284j.DEFAULT_INSTANCE);
            }

            public a addAction(int i, C0276b c0276b) {
                m23743e();
                ((C0284j) this.f89756b).addAction(i, c0276b);
                return this;
            }

            public a setAction(int i, C0276b.b bVar) {
                m23743e();
                ((C0284j) this.f89756b).setAction(i, bVar.build());
                return this;
            }

            public a addAction(C0276b.b bVar) {
                m23743e();
                ((C0284j) this.f89756b).addAction(bVar.build());
                return this;
            }

            public a addAction(int i, C0276b.b bVar) {
                m23743e();
                ((C0284j) this.f89756b).addAction(i, bVar.build());
                return this;
            }
        }

        static {
            C0284j c0284j = new C0284j();
            DEFAULT_INSTANCE = c0284j;
            v27.m23715h0(C0284j.class, c0284j);
        }

        private C0284j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAction(C0276b c0276b) {
            c0276b.getClass();
            ensureActionIsMutable();
            this.action_.add(c0276b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAction(Iterable<? extends C0276b> iterable) {
            ensureActionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.action_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceDescription() {
            this.traceDescription_ = getDefaultInstance().getTraceDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceId() {
            this.traceId_ = getDefaultInstance().getTraceId();
        }

        private void ensureActionIsMutable() {
            w98.InterfaceC14504k<C0276b> interfaceC14504k = this.action_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.action_ = v27.m23698P(interfaceC14504k);
        }

        public static C0284j getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0284j parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0284j) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0284j parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0284j) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0284j> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAction(int i) {
            ensureActionIsMutable();
            this.action_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(int i, C0276b c0276b) {
            c0276b.getClass();
            ensureActionIsMutable();
            this.action_.set(i, c0276b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceDescription(String str) {
            str.getClass();
            this.traceDescription_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceDescriptionBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.traceDescription_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceId(String str) {
            str.getClass();
            this.traceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceIdBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.traceId_ = vj1Var.toStringUtf8();
        }

        @Override // p000.aj3.InterfaceC0285k
        public C0276b getAction(int i) {
            return this.action_.get(i);
        }

        @Override // p000.aj3.InterfaceC0285k
        public int getActionCount() {
            return this.action_.size();
        }

        @Override // p000.aj3.InterfaceC0285k
        public List<C0276b> getActionList() {
            return this.action_;
        }

        public InterfaceC0277c getActionOrBuilder(int i) {
            return this.action_.get(i);
        }

        public List<? extends InterfaceC0277c> getActionOrBuilderList() {
            return this.action_;
        }

        @Override // p000.aj3.InterfaceC0285k
        public String getTraceDescription() {
            return this.traceDescription_;
        }

        @Override // p000.aj3.InterfaceC0285k
        public vj1 getTraceDescriptionBytes() {
            return vj1.copyFromUtf8(this.traceDescription_);
        }

        @Override // p000.aj3.InterfaceC0285k
        public String getTraceId() {
            return this.traceId_;
        }

        @Override // p000.aj3.InterfaceC0285k
        public vj1 getTraceIdBytes() {
            return vj1.copyFromUtf8(this.traceId_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0284j();
                case 2:
                    return new a(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"traceId_", "action_", C0276b.class, "traceDescription_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0284j> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0284j.class) {
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

        public static a newBuilder(C0284j c0284j) {
            return DEFAULT_INSTANCE.m23739o(c0284j);
        }

        public static C0284j parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0284j) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0284j parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0284j) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0284j parseFrom(vj1 vj1Var) throws ce8 {
            return (C0284j) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAction(int i, C0276b c0276b) {
            c0276b.getClass();
            ensureActionIsMutable();
            this.action_.add(i, c0276b);
        }

        public static C0284j parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0284j) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0284j parseFrom(byte[] bArr) throws ce8 {
            return (C0284j) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0284j parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0284j) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0284j parseFrom(InputStream inputStream) throws IOException {
            return (C0284j) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0284j parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0284j) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0284j parseFrom(f72 f72Var) throws IOException {
            return (C0284j) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0284j parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0284j) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$k */
    public interface InterfaceC0285k extends rsa {
        C0276b getAction(int i);

        int getActionCount();

        List<C0276b> getActionList();

        String getTraceDescription();

        vj1 getTraceDescriptionBytes();

        String getTraceId();

        vj1 getTraceIdBytes();
    }

    /* JADX INFO: renamed from: aj3$l */
    public static final class C0286l extends v27<C0286l, a> implements InterfaceC0287m {
        private static final C0286l DEFAULT_INSTANCE;
        private static volatile uhc<C0286l> PARSER = null;
        public static final int TEST_TRACE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C0284j testTrace_;

        /* JADX INFO: renamed from: aj3$l$a */
        public static final class a extends v27.AbstractC13823b<C0286l, a> implements InterfaceC0287m {
            public /* synthetic */ a(C0275a c0275a) {
                this();
            }

            public a clearTestTrace() {
                m23743e();
                ((C0286l) this.f89756b).clearTestTrace();
                return this;
            }

            @Override // p000.aj3.InterfaceC0287m
            public C0284j getTestTrace() {
                return ((C0286l) this.f89756b).getTestTrace();
            }

            @Override // p000.aj3.InterfaceC0287m
            public boolean hasTestTrace() {
                return ((C0286l) this.f89756b).hasTestTrace();
            }

            public a mergeTestTrace(C0284j c0284j) {
                m23743e();
                ((C0286l) this.f89756b).mergeTestTrace(c0284j);
                return this;
            }

            public a setTestTrace(C0284j c0284j) {
                m23743e();
                ((C0286l) this.f89756b).setTestTrace(c0284j);
                return this;
            }

            private a() {
                super(C0286l.DEFAULT_INSTANCE);
            }

            public a setTestTrace(C0284j.a aVar) {
                m23743e();
                ((C0286l) this.f89756b).setTestTrace(aVar.build());
                return this;
            }
        }

        static {
            C0286l c0286l = new C0286l();
            DEFAULT_INSTANCE = c0286l;
            v27.m23715h0(C0286l.class, c0286l);
        }

        private C0286l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestTrace() {
            this.testTrace_ = null;
            this.bitField0_ &= -2;
        }

        public static C0286l getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTestTrace(C0284j c0284j) {
            c0284j.getClass();
            C0284j c0284j2 = this.testTrace_;
            if (c0284j2 == null || c0284j2 == C0284j.getDefaultInstance()) {
                this.testTrace_ = c0284j;
            } else {
                this.testTrace_ = C0284j.newBuilder(this.testTrace_).mergeFrom(c0284j).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0286l parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0286l) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0286l parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0286l) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0286l> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestTrace(C0284j c0284j) {
            c0284j.getClass();
            this.testTrace_ = c0284j;
            this.bitField0_ |= 1;
        }

        @Override // p000.aj3.InterfaceC0287m
        public C0284j getTestTrace() {
            C0284j c0284j = this.testTrace_;
            return c0284j == null ? C0284j.getDefaultInstance() : c0284j;
        }

        @Override // p000.aj3.InterfaceC0287m
        public boolean hasTestTrace() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0286l();
                case 2:
                    return new a(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "testTrace_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0286l> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0286l.class) {
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

        public static a newBuilder(C0286l c0286l) {
            return DEFAULT_INSTANCE.m23739o(c0286l);
        }

        public static C0286l parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0286l) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0286l parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0286l) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0286l parseFrom(vj1 vj1Var) throws ce8 {
            return (C0286l) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0286l parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0286l) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0286l parseFrom(byte[] bArr) throws ce8 {
            return (C0286l) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0286l parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0286l) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0286l parseFrom(InputStream inputStream) throws IOException {
            return (C0286l) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0286l parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0286l) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0286l parseFrom(f72 f72Var) throws IOException {
            return (C0286l) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0286l parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0286l) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$m */
    public interface InterfaceC0287m extends rsa {
        C0284j getTestTrace();

        boolean hasTestTrace();
    }

    /* JADX INFO: renamed from: aj3$n */
    public static final class C0288n extends v27<C0288n, a> implements InterfaceC0289o {
        private static final C0288n DEFAULT_INSTANCE;
        private static volatile uhc<C0288n> PARSER = null;
        public static final int VALIDATE_QUERY_INDEXES_FIELD_NUMBER = 2;
        public static final int VALIDATE_QUERY_RESULT_ORDER_FIELD_NUMBER = 1;
        private boolean validateQueryIndexes_;
        private boolean validateQueryResultOrder_;

        /* JADX INFO: renamed from: aj3$n$a */
        public static final class a extends v27.AbstractC13823b<C0288n, a> implements InterfaceC0289o {
            public /* synthetic */ a(C0275a c0275a) {
                this();
            }

            public a clearValidateQueryIndexes() {
                m23743e();
                ((C0288n) this.f89756b).clearValidateQueryIndexes();
                return this;
            }

            public a clearValidateQueryResultOrder() {
                m23743e();
                ((C0288n) this.f89756b).clearValidateQueryResultOrder();
                return this;
            }

            @Override // p000.aj3.InterfaceC0289o
            public boolean getValidateQueryIndexes() {
                return ((C0288n) this.f89756b).getValidateQueryIndexes();
            }

            @Override // p000.aj3.InterfaceC0289o
            public boolean getValidateQueryResultOrder() {
                return ((C0288n) this.f89756b).getValidateQueryResultOrder();
            }

            public a setValidateQueryIndexes(boolean z) {
                m23743e();
                ((C0288n) this.f89756b).setValidateQueryIndexes(z);
                return this;
            }

            public a setValidateQueryResultOrder(boolean z) {
                m23743e();
                ((C0288n) this.f89756b).setValidateQueryResultOrder(z);
                return this;
            }

            private a() {
                super(C0288n.DEFAULT_INSTANCE);
            }
        }

        static {
            C0288n c0288n = new C0288n();
            DEFAULT_INSTANCE = c0288n;
            v27.m23715h0(C0288n.class, c0288n);
        }

        private C0288n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidateQueryIndexes() {
            this.validateQueryIndexes_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidateQueryResultOrder() {
            this.validateQueryResultOrder_ = false;
        }

        public static C0288n getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0288n parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0288n) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0288n parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0288n) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0288n> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValidateQueryIndexes(boolean z) {
            this.validateQueryIndexes_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValidateQueryResultOrder(boolean z) {
            this.validateQueryResultOrder_ = z;
        }

        @Override // p000.aj3.InterfaceC0289o
        public boolean getValidateQueryIndexes() {
            return this.validateQueryIndexes_;
        }

        @Override // p000.aj3.InterfaceC0289o
        public boolean getValidateQueryResultOrder() {
            return this.validateQueryResultOrder_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0275a c0275a = null;
            switch (C0275a.f1716a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0288n();
                case 2:
                    return new a(c0275a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"validateQueryResultOrder_", "validateQueryIndexes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0288n> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0288n.class) {
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

        public static a newBuilder(C0288n c0288n) {
            return DEFAULT_INSTANCE.m23739o(c0288n);
        }

        public static C0288n parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0288n) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0288n parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0288n) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0288n parseFrom(vj1 vj1Var) throws ce8 {
            return (C0288n) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0288n parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0288n) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0288n parseFrom(byte[] bArr) throws ce8 {
            return (C0288n) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0288n parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0288n) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0288n parseFrom(InputStream inputStream) throws IOException {
            return (C0288n) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0288n parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0288n) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0288n parseFrom(f72 f72Var) throws IOException {
            return (C0288n) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0288n parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0288n) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: aj3$o */
    public interface InterfaceC0289o extends rsa {
        boolean getValidateQueryIndexes();

        boolean getValidateQueryResultOrder();
    }

    private aj3() {
    }

    public static void registerAllExtensions(zi5 zi5Var) {
    }
}
