package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.abg;
import p000.v27;
import p000.w98;
import p000.x58;

/* JADX INFO: loaded from: classes5.dex */
public final class yag extends v27<yag, C15596d> implements zag {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final yag DEFAULT_INSTANCE;
    private static volatile uhc<yag> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private w98.InterfaceC14504k<C15594b> aggregations_ = v27.m23722x();

    /* JADX INFO: renamed from: yag$a */
    public static /* synthetic */ class C15593a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101001a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f101001a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101001a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101001a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101001a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101001a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101001a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101001a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yag$b */
    public static final class C15594b extends v27<C15594b, c> implements InterfaceC15595c {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final C15594b DEFAULT_INSTANCE;
        private static volatile uhc<C15594b> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        /* JADX INFO: renamed from: yag$b$a */
        public static final class a extends v27<a, C16561a> implements b {
            private static final a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile uhc<a> PARSER;
            private int bitField0_;
            private abg.C0161j field_;

            /* JADX INFO: renamed from: yag$b$a$a, reason: collision with other inner class name */
            public static final class C16561a extends v27.AbstractC13823b<a, C16561a> implements b {
                public /* synthetic */ C16561a(C15593a c15593a) {
                    this();
                }

                public C16561a clearField() {
                    m23743e();
                    ((a) this.f89756b).clearField();
                    return this;
                }

                @Override // p000.yag.C15594b.b
                public abg.C0161j getField() {
                    return ((a) this.f89756b).getField();
                }

                @Override // p000.yag.C15594b.b
                public boolean hasField() {
                    return ((a) this.f89756b).hasField();
                }

                public C16561a mergeField(abg.C0161j c0161j) {
                    m23743e();
                    ((a) this.f89756b).mergeField(c0161j);
                    return this;
                }

                public C16561a setField(abg.C0161j c0161j) {
                    m23743e();
                    ((a) this.f89756b).setField(c0161j);
                    return this;
                }

                private C16561a() {
                    super(a.DEFAULT_INSTANCE);
                }

                public C16561a setField(abg.C0161j.a aVar) {
                    m23743e();
                    ((a) this.f89756b).setField(aVar.build());
                    return this;
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                v27.m23715h0(a.class, aVar);
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearField() {
                this.field_ = null;
                this.bitField0_ &= -2;
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeField(abg.C0161j c0161j) {
                c0161j.getClass();
                abg.C0161j c0161j2 = this.field_;
                if (c0161j2 == null || c0161j2 == abg.C0161j.getDefaultInstance()) {
                    this.field_ = c0161j;
                } else {
                    this.field_ = abg.C0161j.newBuilder(this.field_).mergeFrom(c0161j).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C16561a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (a) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<a> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setField(abg.C0161j c0161j) {
                c0161j.getClass();
                this.field_ = c0161j;
                this.bitField0_ |= 1;
            }

            @Override // p000.yag.C15594b.b
            public abg.C0161j getField() {
                abg.C0161j c0161j = this.field_;
                return c0161j == null ? abg.C0161j.getDefaultInstance() : c0161j;
            }

            @Override // p000.yag.C15594b.b
            public boolean hasField() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C15593a c15593a = null;
                switch (C15593a.f101001a[enumC13830i.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C16561a(c15593a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<a> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (a.class) {
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

            public static C16561a newBuilder(a aVar) {
                return DEFAULT_INSTANCE.m23739o(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (a) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static a parseFrom(vj1 vj1Var) throws ce8 {
                return (a) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static a parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (a) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static a parseFrom(byte[] bArr) throws ce8 {
                return (a) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (a) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a parseFrom(f72 f72Var) throws IOException {
                return (a) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static a parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (a) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: yag$b$b */
        public interface b extends rsa {
            abg.C0161j getField();

            boolean hasField();
        }

        /* JADX INFO: renamed from: yag$b$c */
        public static final class c extends v27.AbstractC13823b<C15594b, c> implements InterfaceC15595c {
            public /* synthetic */ c(C15593a c15593a) {
                this();
            }

            public c clearAlias() {
                m23743e();
                ((C15594b) this.f89756b).clearAlias();
                return this;
            }

            public c clearAvg() {
                m23743e();
                ((C15594b) this.f89756b).clearAvg();
                return this;
            }

            public c clearCount() {
                m23743e();
                ((C15594b) this.f89756b).clearCount();
                return this;
            }

            public c clearOperator() {
                m23743e();
                ((C15594b) this.f89756b).clearOperator();
                return this;
            }

            public c clearSum() {
                m23743e();
                ((C15594b) this.f89756b).clearSum();
                return this;
            }

            @Override // p000.yag.InterfaceC15595c
            public String getAlias() {
                return ((C15594b) this.f89756b).getAlias();
            }

            @Override // p000.yag.InterfaceC15595c
            public vj1 getAliasBytes() {
                return ((C15594b) this.f89756b).getAliasBytes();
            }

            @Override // p000.yag.InterfaceC15595c
            public a getAvg() {
                return ((C15594b) this.f89756b).getAvg();
            }

            @Override // p000.yag.InterfaceC15595c
            public d getCount() {
                return ((C15594b) this.f89756b).getCount();
            }

            @Override // p000.yag.InterfaceC15595c
            public f getOperatorCase() {
                return ((C15594b) this.f89756b).getOperatorCase();
            }

            @Override // p000.yag.InterfaceC15595c
            public g getSum() {
                return ((C15594b) this.f89756b).getSum();
            }

            @Override // p000.yag.InterfaceC15595c
            public boolean hasAvg() {
                return ((C15594b) this.f89756b).hasAvg();
            }

            @Override // p000.yag.InterfaceC15595c
            public boolean hasCount() {
                return ((C15594b) this.f89756b).hasCount();
            }

            @Override // p000.yag.InterfaceC15595c
            public boolean hasSum() {
                return ((C15594b) this.f89756b).hasSum();
            }

            public c mergeAvg(a aVar) {
                m23743e();
                ((C15594b) this.f89756b).mergeAvg(aVar);
                return this;
            }

            public c mergeCount(d dVar) {
                m23743e();
                ((C15594b) this.f89756b).mergeCount(dVar);
                return this;
            }

            public c mergeSum(g gVar) {
                m23743e();
                ((C15594b) this.f89756b).mergeSum(gVar);
                return this;
            }

            public c setAlias(String str) {
                m23743e();
                ((C15594b) this.f89756b).setAlias(str);
                return this;
            }

            public c setAliasBytes(vj1 vj1Var) {
                m23743e();
                ((C15594b) this.f89756b).setAliasBytes(vj1Var);
                return this;
            }

            public c setAvg(a aVar) {
                m23743e();
                ((C15594b) this.f89756b).setAvg(aVar);
                return this;
            }

            public c setCount(d dVar) {
                m23743e();
                ((C15594b) this.f89756b).setCount(dVar);
                return this;
            }

            public c setSum(g gVar) {
                m23743e();
                ((C15594b) this.f89756b).setSum(gVar);
                return this;
            }

            private c() {
                super(C15594b.DEFAULT_INSTANCE);
            }

            public c setAvg(a.C16561a c16561a) {
                m23743e();
                ((C15594b) this.f89756b).setAvg(c16561a.build());
                return this;
            }

            public c setCount(d.a aVar) {
                m23743e();
                ((C15594b) this.f89756b).setCount(aVar.build());
                return this;
            }

            public c setSum(g.a aVar) {
                m23743e();
                ((C15594b) this.f89756b).setSum(aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: yag$b$d */
        public static final class d extends v27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            private static volatile uhc<d> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private x58 upTo_;

            /* JADX INFO: renamed from: yag$b$d$a */
            public static final class a extends v27.AbstractC13823b<d, a> implements e {
                public /* synthetic */ a(C15593a c15593a) {
                    this();
                }

                public a clearUpTo() {
                    m23743e();
                    ((d) this.f89756b).clearUpTo();
                    return this;
                }

                @Override // p000.yag.C15594b.e
                public x58 getUpTo() {
                    return ((d) this.f89756b).getUpTo();
                }

                @Override // p000.yag.C15594b.e
                public boolean hasUpTo() {
                    return ((d) this.f89756b).hasUpTo();
                }

                public a mergeUpTo(x58 x58Var) {
                    m23743e();
                    ((d) this.f89756b).mergeUpTo(x58Var);
                    return this;
                }

                public a setUpTo(x58 x58Var) {
                    m23743e();
                    ((d) this.f89756b).setUpTo(x58Var);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }

                public a setUpTo(x58.C14924b c14924b) {
                    m23743e();
                    ((d) this.f89756b).setUpTo(c14924b.build());
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
            public void clearUpTo() {
                this.upTo_ = null;
                this.bitField0_ &= -2;
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeUpTo(x58 x58Var) {
                x58Var.getClass();
                x58 x58Var2 = this.upTo_;
                if (x58Var2 == null || x58Var2 == x58.getDefaultInstance()) {
                    this.upTo_ = x58Var;
                } else {
                    this.upTo_ = x58.newBuilder(this.upTo_).mergeFrom(x58Var).buildPartial();
                }
                this.bitField0_ |= 1;
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
            public void setUpTo(x58 x58Var) {
                x58Var.getClass();
                this.upTo_ = x58Var;
                this.bitField0_ |= 1;
            }

            @Override // p000.yag.C15594b.e
            public x58 getUpTo() {
                x58 x58Var = this.upTo_;
                return x58Var == null ? x58.getDefaultInstance() : x58Var;
            }

            @Override // p000.yag.C15594b.e
            public boolean hasUpTo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C15593a c15593a = null;
                switch (C15593a.f101001a[enumC13830i.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c15593a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
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

        /* JADX INFO: renamed from: yag$b$e */
        public interface e extends rsa {
            x58 getUpTo();

            boolean hasUpTo();
        }

        /* JADX INFO: renamed from: yag$b$f */
        public enum f {
            COUNT(1),
            SUM(2),
            AVG(3),
            OPERATOR_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f101007a;

            f(int i) {
                this.f101007a = i;
            }

            public static f forNumber(int i) {
                if (i == 0) {
                    return OPERATOR_NOT_SET;
                }
                if (i == 1) {
                    return COUNT;
                }
                if (i == 2) {
                    return SUM;
                }
                if (i != 3) {
                    return null;
                }
                return AVG;
            }

            public int getNumber() {
                return this.f101007a;
            }

            @Deprecated
            public static f valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: yag$b$g */
        public static final class g extends v27<g, a> implements h {
            private static final g DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile uhc<g> PARSER;
            private int bitField0_;
            private abg.C0161j field_;

            /* JADX INFO: renamed from: yag$b$g$a */
            public static final class a extends v27.AbstractC13823b<g, a> implements h {
                public /* synthetic */ a(C15593a c15593a) {
                    this();
                }

                public a clearField() {
                    m23743e();
                    ((g) this.f89756b).clearField();
                    return this;
                }

                @Override // p000.yag.C15594b.h
                public abg.C0161j getField() {
                    return ((g) this.f89756b).getField();
                }

                @Override // p000.yag.C15594b.h
                public boolean hasField() {
                    return ((g) this.f89756b).hasField();
                }

                public a mergeField(abg.C0161j c0161j) {
                    m23743e();
                    ((g) this.f89756b).mergeField(c0161j);
                    return this;
                }

                public a setField(abg.C0161j c0161j) {
                    m23743e();
                    ((g) this.f89756b).setField(c0161j);
                    return this;
                }

                private a() {
                    super(g.DEFAULT_INSTANCE);
                }

                public a setField(abg.C0161j.a aVar) {
                    m23743e();
                    ((g) this.f89756b).setField(aVar.build());
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
            public void clearField() {
                this.field_ = null;
                this.bitField0_ &= -2;
            }

            public static g getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeField(abg.C0161j c0161j) {
                c0161j.getClass();
                abg.C0161j c0161j2 = this.field_;
                if (c0161j2 == null || c0161j2 == abg.C0161j.getDefaultInstance()) {
                    this.field_ = c0161j;
                } else {
                    this.field_ = abg.C0161j.newBuilder(this.field_).mergeFrom(c0161j).buildPartial();
                }
                this.bitField0_ |= 1;
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
            public void setField(abg.C0161j c0161j) {
                c0161j.getClass();
                this.field_ = c0161j;
                this.bitField0_ |= 1;
            }

            @Override // p000.yag.C15594b.h
            public abg.C0161j getField() {
                abg.C0161j c0161j = this.field_;
                return c0161j == null ? abg.C0161j.getDefaultInstance() : c0161j;
            }

            @Override // p000.yag.C15594b.h
            public boolean hasField() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C15593a c15593a = null;
                switch (C15593a.f101001a[enumC13830i.ordinal()]) {
                    case 1:
                        return new g();
                    case 2:
                        return new a(c15593a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
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

        /* JADX INFO: renamed from: yag$b$h */
        public interface h extends rsa {
            abg.C0161j getField();

            boolean hasField();
        }

        static {
            C15594b c15594b = new C15594b();
            DEFAULT_INSTANCE = c15594b;
            v27.m23715h0(C15594b.class, c15594b);
        }

        private C15594b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlias() {
            this.alias_ = getDefaultInstance().getAlias();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvg() {
            if (this.operatorCase_ == 3) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            if (this.operatorCase_ == 1) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperator() {
            this.operatorCase_ = 0;
            this.operator_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSum() {
            if (this.operatorCase_ == 2) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        public static C15594b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvg(a aVar) {
            aVar.getClass();
            if (this.operatorCase_ != 3 || this.operator_ == a.getDefaultInstance()) {
                this.operator_ = aVar;
            } else {
                this.operator_ = a.newBuilder((a) this.operator_).mergeFrom(aVar).buildPartial();
            }
            this.operatorCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCount(d dVar) {
            dVar.getClass();
            if (this.operatorCase_ != 1 || this.operator_ == d.getDefaultInstance()) {
                this.operator_ = dVar;
            } else {
                this.operator_ = d.newBuilder((d) this.operator_).mergeFrom(dVar).buildPartial();
            }
            this.operatorCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSum(g gVar) {
            gVar.getClass();
            if (this.operatorCase_ != 2 || this.operator_ == g.getDefaultInstance()) {
                this.operator_ = gVar;
            } else {
                this.operator_ = g.newBuilder((g) this.operator_).mergeFrom(gVar).buildPartial();
            }
            this.operatorCase_ = 2;
        }

        public static c newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C15594b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C15594b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C15594b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C15594b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C15594b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlias(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAliasBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.alias_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvg(a aVar) {
            aVar.getClass();
            this.operator_ = aVar;
            this.operatorCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(d dVar) {
            dVar.getClass();
            this.operator_ = dVar;
            this.operatorCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSum(g gVar) {
            gVar.getClass();
            this.operator_ = gVar;
            this.operatorCase_ = 2;
        }

        @Override // p000.yag.InterfaceC15595c
        public String getAlias() {
            return this.alias_;
        }

        @Override // p000.yag.InterfaceC15595c
        public vj1 getAliasBytes() {
            return vj1.copyFromUtf8(this.alias_);
        }

        @Override // p000.yag.InterfaceC15595c
        public a getAvg() {
            return this.operatorCase_ == 3 ? (a) this.operator_ : a.getDefaultInstance();
        }

        @Override // p000.yag.InterfaceC15595c
        public d getCount() {
            return this.operatorCase_ == 1 ? (d) this.operator_ : d.getDefaultInstance();
        }

        @Override // p000.yag.InterfaceC15595c
        public f getOperatorCase() {
            return f.forNumber(this.operatorCase_);
        }

        @Override // p000.yag.InterfaceC15595c
        public g getSum() {
            return this.operatorCase_ == 2 ? (g) this.operator_ : g.getDefaultInstance();
        }

        @Override // p000.yag.InterfaceC15595c
        public boolean hasAvg() {
            return this.operatorCase_ == 3;
        }

        @Override // p000.yag.InterfaceC15595c
        public boolean hasCount() {
            return this.operatorCase_ == 1;
        }

        @Override // p000.yag.InterfaceC15595c
        public boolean hasSum() {
            return this.operatorCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C15593a c15593a = null;
            switch (C15593a.f101001a[enumC13830i.ordinal()]) {
                case 1:
                    return new C15594b();
                case 2:
                    return new c(c15593a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", d.class, g.class, a.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C15594b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C15594b.class) {
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

        public static c newBuilder(C15594b c15594b) {
            return DEFAULT_INSTANCE.m23739o(c15594b);
        }

        public static C15594b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C15594b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C15594b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C15594b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C15594b parseFrom(vj1 vj1Var) throws ce8 {
            return (C15594b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C15594b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C15594b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C15594b parseFrom(byte[] bArr) throws ce8 {
            return (C15594b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C15594b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C15594b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C15594b parseFrom(InputStream inputStream) throws IOException {
            return (C15594b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C15594b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C15594b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C15594b parseFrom(f72 f72Var) throws IOException {
            return (C15594b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C15594b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C15594b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: yag$c */
    public interface InterfaceC15595c extends rsa {
        String getAlias();

        vj1 getAliasBytes();

        C15594b.a getAvg();

        C15594b.d getCount();

        C15594b.f getOperatorCase();

        C15594b.g getSum();

        boolean hasAvg();

        boolean hasCount();

        boolean hasSum();
    }

    /* JADX INFO: renamed from: yag$d */
    public static final class C15596d extends v27.AbstractC13823b<yag, C15596d> implements zag {
        public /* synthetic */ C15596d(C15593a c15593a) {
            this();
        }

        public C15596d addAggregations(C15594b c15594b) {
            m23743e();
            ((yag) this.f89756b).addAggregations(c15594b);
            return this;
        }

        public C15596d addAllAggregations(Iterable<? extends C15594b> iterable) {
            m23743e();
            ((yag) this.f89756b).addAllAggregations(iterable);
            return this;
        }

        public C15596d clearAggregations() {
            m23743e();
            ((yag) this.f89756b).clearAggregations();
            return this;
        }

        public C15596d clearQueryType() {
            m23743e();
            ((yag) this.f89756b).clearQueryType();
            return this;
        }

        public C15596d clearStructuredQuery() {
            m23743e();
            ((yag) this.f89756b).clearStructuredQuery();
            return this;
        }

        @Override // p000.zag
        public C15594b getAggregations(int i) {
            return ((yag) this.f89756b).getAggregations(i);
        }

        @Override // p000.zag
        public int getAggregationsCount() {
            return ((yag) this.f89756b).getAggregationsCount();
        }

        @Override // p000.zag
        public List<C15594b> getAggregationsList() {
            return Collections.unmodifiableList(((yag) this.f89756b).getAggregationsList());
        }

        @Override // p000.zag
        public EnumC15597e getQueryTypeCase() {
            return ((yag) this.f89756b).getQueryTypeCase();
        }

        @Override // p000.zag
        public abg getStructuredQuery() {
            return ((yag) this.f89756b).getStructuredQuery();
        }

        @Override // p000.zag
        public boolean hasStructuredQuery() {
            return ((yag) this.f89756b).hasStructuredQuery();
        }

        public C15596d mergeStructuredQuery(abg abgVar) {
            m23743e();
            ((yag) this.f89756b).mergeStructuredQuery(abgVar);
            return this;
        }

        public C15596d removeAggregations(int i) {
            m23743e();
            ((yag) this.f89756b).removeAggregations(i);
            return this;
        }

        public C15596d setAggregations(int i, C15594b c15594b) {
            m23743e();
            ((yag) this.f89756b).setAggregations(i, c15594b);
            return this;
        }

        public C15596d setStructuredQuery(abg abgVar) {
            m23743e();
            ((yag) this.f89756b).setStructuredQuery(abgVar);
            return this;
        }

        private C15596d() {
            super(yag.DEFAULT_INSTANCE);
        }

        public C15596d addAggregations(int i, C15594b c15594b) {
            m23743e();
            ((yag) this.f89756b).addAggregations(i, c15594b);
            return this;
        }

        public C15596d setAggregations(int i, C15594b.c cVar) {
            m23743e();
            ((yag) this.f89756b).setAggregations(i, cVar.build());
            return this;
        }

        public C15596d setStructuredQuery(abg.C0153b c0153b) {
            m23743e();
            ((yag) this.f89756b).setStructuredQuery(c0153b.build());
            return this;
        }

        public C15596d addAggregations(C15594b.c cVar) {
            m23743e();
            ((yag) this.f89756b).addAggregations(cVar.build());
            return this;
        }

        public C15596d addAggregations(int i, C15594b.c cVar) {
            m23743e();
            ((yag) this.f89756b).addAggregations(i, cVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: yag$e */
    public enum EnumC15597e {
        STRUCTURED_QUERY(1),
        QUERYTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f101011a;

        EnumC15597e(int i) {
            this.f101011a = i;
        }

        public static EnumC15597e forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 1) {
                return null;
            }
            return STRUCTURED_QUERY;
        }

        public int getNumber() {
            return this.f101011a;
        }

        @Deprecated
        public static EnumC15597e valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        yag yagVar = new yag();
        DEFAULT_INSTANCE = yagVar;
        v27.m23715h0(yag.class, yagVar);
    }

    private yag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggregations(C15594b c15594b) {
        c15594b.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.add(c15594b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAggregations(Iterable<? extends C15594b> iterable) {
        ensureAggregationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.aggregations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregations() {
        this.aggregations_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredQuery() {
        if (this.queryTypeCase_ == 1) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    private void ensureAggregationsIsMutable() {
        w98.InterfaceC14504k<C15594b> interfaceC14504k = this.aggregations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.aggregations_ = v27.m23698P(interfaceC14504k);
    }

    public static yag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredQuery(abg abgVar) {
        abgVar.getClass();
        if (this.queryTypeCase_ != 1 || this.queryType_ == abg.getDefaultInstance()) {
            this.queryType_ = abgVar;
        } else {
            this.queryType_ = abg.newBuilder((abg) this.queryType_).mergeFrom(abgVar).buildPartial();
        }
        this.queryTypeCase_ = 1;
    }

    public static C15596d newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yag) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yag parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yag) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAggregations(int i) {
        ensureAggregationsIsMutable();
        this.aggregations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregations(int i, C15594b c15594b) {
        c15594b.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.set(i, c15594b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredQuery(abg abgVar) {
        abgVar.getClass();
        this.queryType_ = abgVar;
        this.queryTypeCase_ = 1;
    }

    @Override // p000.zag
    public C15594b getAggregations(int i) {
        return this.aggregations_.get(i);
    }

    @Override // p000.zag
    public int getAggregationsCount() {
        return this.aggregations_.size();
    }

    @Override // p000.zag
    public List<C15594b> getAggregationsList() {
        return this.aggregations_;
    }

    public InterfaceC15595c getAggregationsOrBuilder(int i) {
        return this.aggregations_.get(i);
    }

    public List<? extends InterfaceC15595c> getAggregationsOrBuilderList() {
        return this.aggregations_;
    }

    @Override // p000.zag
    public EnumC15597e getQueryTypeCase() {
        return EnumC15597e.forNumber(this.queryTypeCase_);
    }

    @Override // p000.zag
    public abg getStructuredQuery() {
        return this.queryTypeCase_ == 1 ? (abg) this.queryType_ : abg.getDefaultInstance();
    }

    @Override // p000.zag
    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 1;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15593a c15593a = null;
        switch (C15593a.f101001a[enumC13830i.ordinal()]) {
            case 1:
                return new yag();
            case 2:
                return new C15596d(c15593a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", abg.class, "aggregations_", C15594b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yag> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yag.class) {
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

    public static C15596d newBuilder(yag yagVar) {
        return DEFAULT_INSTANCE.m23739o(yagVar);
    }

    public static yag parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yag) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yag parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yag) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yag parseFrom(vj1 vj1Var) throws ce8 {
        return (yag) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggregations(int i, C15594b c15594b) {
        c15594b.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.add(i, c15594b);
    }

    public static yag parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yag) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yag parseFrom(byte[] bArr) throws ce8 {
        return (yag) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yag parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yag) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yag parseFrom(InputStream inputStream) throws IOException {
        return (yag) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yag parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yag) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yag parseFrom(f72 f72Var) throws IOException {
        return (yag) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yag parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yag) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
