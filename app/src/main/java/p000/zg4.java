package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C15896yz;
import p000.f2h;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class zg4 extends v27<zg4, C16123d> implements ah4 {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final zg4 DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile uhc<zg4> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private C16121b bucketOptions_;
    private long count_;
    private double mean_;
    private C16126g range_;
    private double sumOfSquaredDeviation_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private w98.InterfaceC14503j bucketCounts_ = v27.m23721w();
    private w98.InterfaceC14504k<C16124e> exemplars_ = v27.m23722x();

    /* JADX INFO: renamed from: zg4$a */
    public static /* synthetic */ class C16120a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105038a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f105038a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105038a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105038a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105038a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105038a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105038a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105038a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zg4$b */
    public static final class C16121b extends v27<C16121b, a> implements InterfaceC16122c {
        private static final C16121b DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile uhc<C16121b> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        /* JADX INFO: renamed from: zg4$b$a */
        public static final class a extends v27.AbstractC13823b<C16121b, a> implements InterfaceC16122c {
            public /* synthetic */ a(C16120a c16120a) {
                this();
            }

            public a clearExplicitBuckets() {
                m23743e();
                ((C16121b) this.f89756b).clearExplicitBuckets();
                return this;
            }

            public a clearExponentialBuckets() {
                m23743e();
                ((C16121b) this.f89756b).clearExponentialBuckets();
                return this;
            }

            public a clearLinearBuckets() {
                m23743e();
                ((C16121b) this.f89756b).clearLinearBuckets();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C16121b) this.f89756b).clearOptions();
                return this;
            }

            @Override // p000.zg4.InterfaceC16122c
            public b getExplicitBuckets() {
                return ((C16121b) this.f89756b).getExplicitBuckets();
            }

            @Override // p000.zg4.InterfaceC16122c
            public d getExponentialBuckets() {
                return ((C16121b) this.f89756b).getExponentialBuckets();
            }

            @Override // p000.zg4.InterfaceC16122c
            public f getLinearBuckets() {
                return ((C16121b) this.f89756b).getLinearBuckets();
            }

            @Override // p000.zg4.InterfaceC16122c
            public h getOptionsCase() {
                return ((C16121b) this.f89756b).getOptionsCase();
            }

            @Override // p000.zg4.InterfaceC16122c
            public boolean hasExplicitBuckets() {
                return ((C16121b) this.f89756b).hasExplicitBuckets();
            }

            @Override // p000.zg4.InterfaceC16122c
            public boolean hasExponentialBuckets() {
                return ((C16121b) this.f89756b).hasExponentialBuckets();
            }

            @Override // p000.zg4.InterfaceC16122c
            public boolean hasLinearBuckets() {
                return ((C16121b) this.f89756b).hasLinearBuckets();
            }

            public a mergeExplicitBuckets(b bVar) {
                m23743e();
                ((C16121b) this.f89756b).mergeExplicitBuckets(bVar);
                return this;
            }

            public a mergeExponentialBuckets(d dVar) {
                m23743e();
                ((C16121b) this.f89756b).mergeExponentialBuckets(dVar);
                return this;
            }

            public a mergeLinearBuckets(f fVar) {
                m23743e();
                ((C16121b) this.f89756b).mergeLinearBuckets(fVar);
                return this;
            }

            public a setExplicitBuckets(b bVar) {
                m23743e();
                ((C16121b) this.f89756b).setExplicitBuckets(bVar);
                return this;
            }

            public a setExponentialBuckets(d dVar) {
                m23743e();
                ((C16121b) this.f89756b).setExponentialBuckets(dVar);
                return this;
            }

            public a setLinearBuckets(f fVar) {
                m23743e();
                ((C16121b) this.f89756b).setLinearBuckets(fVar);
                return this;
            }

            private a() {
                super(C16121b.DEFAULT_INSTANCE);
            }

            public a setExplicitBuckets(b.a aVar) {
                m23743e();
                ((C16121b) this.f89756b).setExplicitBuckets(aVar.build());
                return this;
            }

            public a setExponentialBuckets(d.a aVar) {
                m23743e();
                ((C16121b) this.f89756b).setExponentialBuckets(aVar.build());
                return this;
            }

            public a setLinearBuckets(f.a aVar) {
                m23743e();
                ((C16121b) this.f89756b).setLinearBuckets(aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: zg4$b$b */
        public static final class b extends v27<b, a> implements c {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final b DEFAULT_INSTANCE;
            private static volatile uhc<b> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private w98.InterfaceC14496c bounds_ = v27.m23718t();

            /* JADX INFO: renamed from: zg4$b$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C16120a c16120a) {
                    this();
                }

                public a addAllBounds(Iterable<? extends Double> iterable) {
                    m23743e();
                    ((b) this.f89756b).addAllBounds(iterable);
                    return this;
                }

                public a addBounds(double d) {
                    m23743e();
                    ((b) this.f89756b).addBounds(d);
                    return this;
                }

                public a clearBounds() {
                    m23743e();
                    ((b) this.f89756b).clearBounds();
                    return this;
                }

                @Override // p000.zg4.C16121b.c
                public double getBounds(int i) {
                    return ((b) this.f89756b).getBounds(i);
                }

                @Override // p000.zg4.C16121b.c
                public int getBoundsCount() {
                    return ((b) this.f89756b).getBoundsCount();
                }

                @Override // p000.zg4.C16121b.c
                public List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((b) this.f89756b).getBoundsList());
                }

                public a setBounds(int i, double d) {
                    m23743e();
                    ((b) this.f89756b).setBounds(i, d);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
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
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                AbstractC1714b3.m2856b(iterable, this.bounds_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBounds(double d) {
                ensureBoundsIsMutable();
                this.bounds_.addDouble(d);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = v27.m23718t();
            }

            private void ensureBoundsIsMutable() {
                w98.InterfaceC14496c interfaceC14496c = this.bounds_;
                if (interfaceC14496c.isModifiable()) {
                    return;
                }
                this.bounds_ = v27.m23694L(interfaceC14496c);
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
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
            public void setBounds(int i, double d) {
                ensureBoundsIsMutable();
                this.bounds_.setDouble(i, d);
            }

            @Override // p000.zg4.C16121b.c
            public double getBounds(int i) {
                return this.bounds_.getDouble(i);
            }

            @Override // p000.zg4.C16121b.c
            public int getBoundsCount() {
                return this.bounds_.size();
            }

            @Override // p000.zg4.C16121b.c
            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C16120a c16120a = null;
                switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c16120a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
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

        /* JADX INFO: renamed from: zg4$b$c */
        public interface c extends rsa {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();
        }

        /* JADX INFO: renamed from: zg4$b$d */
        public static final class d extends v27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile uhc<d> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            /* JADX INFO: renamed from: zg4$b$d$a */
            public static final class a extends v27.AbstractC13823b<d, a> implements e {
                public /* synthetic */ a(C16120a c16120a) {
                    this();
                }

                public a clearGrowthFactor() {
                    m23743e();
                    ((d) this.f89756b).clearGrowthFactor();
                    return this;
                }

                public a clearNumFiniteBuckets() {
                    m23743e();
                    ((d) this.f89756b).clearNumFiniteBuckets();
                    return this;
                }

                public a clearScale() {
                    m23743e();
                    ((d) this.f89756b).clearScale();
                    return this;
                }

                @Override // p000.zg4.C16121b.e
                public double getGrowthFactor() {
                    return ((d) this.f89756b).getGrowthFactor();
                }

                @Override // p000.zg4.C16121b.e
                public int getNumFiniteBuckets() {
                    return ((d) this.f89756b).getNumFiniteBuckets();
                }

                @Override // p000.zg4.C16121b.e
                public double getScale() {
                    return ((d) this.f89756b).getScale();
                }

                public a setGrowthFactor(double d) {
                    m23743e();
                    ((d) this.f89756b).setGrowthFactor(d);
                    return this;
                }

                public a setNumFiniteBuckets(int i) {
                    m23743e();
                    ((d) this.f89756b).setNumFiniteBuckets(i);
                    return this;
                }

                public a setScale(double d) {
                    m23743e();
                    ((d) this.f89756b).setScale(d);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
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
            public void clearGrowthFactor() {
                this.growthFactor_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = 0.0d;
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
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
            public void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScale(double d) {
                this.scale_ = d;
            }

            @Override // p000.zg4.C16121b.e
            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            @Override // p000.zg4.C16121b.e
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // p000.zg4.C16121b.e
            public double getScale() {
                return this.scale_;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C16120a c16120a = null;
                switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c16120a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
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

        /* JADX INFO: renamed from: zg4$b$e */
        public interface e extends rsa {
            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();
        }

        /* JADX INFO: renamed from: zg4$b$f */
        public static final class f extends v27<f, a> implements g {
            private static final f DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile uhc<f> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            /* JADX INFO: renamed from: zg4$b$f$a */
            public static final class a extends v27.AbstractC13823b<f, a> implements g {
                public /* synthetic */ a(C16120a c16120a) {
                    this();
                }

                public a clearNumFiniteBuckets() {
                    m23743e();
                    ((f) this.f89756b).clearNumFiniteBuckets();
                    return this;
                }

                public a clearOffset() {
                    m23743e();
                    ((f) this.f89756b).clearOffset();
                    return this;
                }

                public a clearWidth() {
                    m23743e();
                    ((f) this.f89756b).clearWidth();
                    return this;
                }

                @Override // p000.zg4.C16121b.g
                public int getNumFiniteBuckets() {
                    return ((f) this.f89756b).getNumFiniteBuckets();
                }

                @Override // p000.zg4.C16121b.g
                public double getOffset() {
                    return ((f) this.f89756b).getOffset();
                }

                @Override // p000.zg4.C16121b.g
                public double getWidth() {
                    return ((f) this.f89756b).getWidth();
                }

                public a setNumFiniteBuckets(int i) {
                    m23743e();
                    ((f) this.f89756b).setNumFiniteBuckets(i);
                    return this;
                }

                public a setOffset(double d) {
                    m23743e();
                    ((f) this.f89756b).setOffset(d);
                    return this;
                }

                public a setWidth(double d) {
                    m23743e();
                    ((f) this.f89756b).setWidth(d);
                    return this;
                }

                private a() {
                    super(f.DEFAULT_INSTANCE);
                }
            }

            static {
                f fVar = new f();
                DEFAULT_INSTANCE = fVar;
                v27.m23715h0(f.class, fVar);
            }

            private f() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = 0.0d;
            }

            public static f getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (f) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static f parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (f) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<f> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOffset(double d) {
                this.offset_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWidth(double d) {
                this.width_ = d;
            }

            @Override // p000.zg4.C16121b.g
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // p000.zg4.C16121b.g
            public double getOffset() {
                return this.offset_;
            }

            @Override // p000.zg4.C16121b.g
            public double getWidth() {
                return this.width_;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C16120a c16120a = null;
                switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                    case 1:
                        return new f();
                    case 2:
                        return new a(c16120a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<f> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (f.class) {
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

            public static a newBuilder(f fVar) {
                return DEFAULT_INSTANCE.m23739o(fVar);
            }

            public static f parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (f) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static f parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (f) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static f parseFrom(vj1 vj1Var) throws ce8 {
                return (f) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static f parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (f) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static f parseFrom(byte[] bArr) throws ce8 {
                return (f) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static f parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (f) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static f parseFrom(InputStream inputStream) throws IOException {
                return (f) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static f parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (f) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static f parseFrom(f72 f72Var) throws IOException {
                return (f) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static f parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (f) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: zg4$b$g */
        public interface g extends rsa {
            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();
        }

        /* JADX INFO: renamed from: zg4$b$h */
        public enum h {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f105044a;

            h(int i) {
                this.f105044a = i;
            }

            public static h forNumber(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            public int getNumber() {
                return this.f105044a;
            }

            @Deprecated
            public static h valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C16121b c16121b = new C16121b();
            DEFAULT_INSTANCE = c16121b;
            v27.m23715h0(C16121b.class, c16121b);
        }

        private C16121b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static C16121b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExplicitBuckets(b bVar) {
            bVar.getClass();
            if (this.optionsCase_ != 3 || this.options_ == b.getDefaultInstance()) {
                this.options_ = bVar;
            } else {
                this.options_ = b.newBuilder((b) this.options_).mergeFrom(bVar).buildPartial();
            }
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExponentialBuckets(d dVar) {
            dVar.getClass();
            if (this.optionsCase_ != 2 || this.options_ == d.getDefaultInstance()) {
                this.options_ = dVar;
            } else {
                this.options_ = d.newBuilder((d) this.options_).mergeFrom(dVar).buildPartial();
            }
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLinearBuckets(f fVar) {
            fVar.getClass();
            if (this.optionsCase_ != 1 || this.options_ == f.getDefaultInstance()) {
                this.options_ = fVar;
            } else {
                this.options_ = f.newBuilder((f) this.options_).mergeFrom(fVar).buildPartial();
            }
            this.optionsCase_ = 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C16121b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C16121b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C16121b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C16121b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C16121b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExplicitBuckets(b bVar) {
            bVar.getClass();
            this.options_ = bVar;
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExponentialBuckets(d dVar) {
            dVar.getClass();
            this.options_ = dVar;
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinearBuckets(f fVar) {
            fVar.getClass();
            this.options_ = fVar;
            this.optionsCase_ = 1;
        }

        @Override // p000.zg4.InterfaceC16122c
        public b getExplicitBuckets() {
            return this.optionsCase_ == 3 ? (b) this.options_ : b.getDefaultInstance();
        }

        @Override // p000.zg4.InterfaceC16122c
        public d getExponentialBuckets() {
            return this.optionsCase_ == 2 ? (d) this.options_ : d.getDefaultInstance();
        }

        @Override // p000.zg4.InterfaceC16122c
        public f getLinearBuckets() {
            return this.optionsCase_ == 1 ? (f) this.options_ : f.getDefaultInstance();
        }

        @Override // p000.zg4.InterfaceC16122c
        public h getOptionsCase() {
            return h.forNumber(this.optionsCase_);
        }

        @Override // p000.zg4.InterfaceC16122c
        public boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        @Override // p000.zg4.InterfaceC16122c
        public boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        @Override // p000.zg4.InterfaceC16122c
        public boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C16120a c16120a = null;
            switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                case 1:
                    return new C16121b();
                case 2:
                    return new a(c16120a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", f.class, d.class, b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C16121b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C16121b.class) {
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

        public static a newBuilder(C16121b c16121b) {
            return DEFAULT_INSTANCE.m23739o(c16121b);
        }

        public static C16121b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16121b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16121b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C16121b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C16121b parseFrom(vj1 vj1Var) throws ce8 {
            return (C16121b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C16121b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C16121b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C16121b parseFrom(byte[] bArr) throws ce8 {
            return (C16121b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C16121b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C16121b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C16121b parseFrom(InputStream inputStream) throws IOException {
            return (C16121b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C16121b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16121b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16121b parseFrom(f72 f72Var) throws IOException {
            return (C16121b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C16121b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C16121b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: zg4$c */
    public interface InterfaceC16122c extends rsa {
        C16121b.b getExplicitBuckets();

        C16121b.d getExponentialBuckets();

        C16121b.f getLinearBuckets();

        C16121b.h getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();
    }

    /* JADX INFO: renamed from: zg4$d */
    public static final class C16123d extends v27.AbstractC13823b<zg4, C16123d> implements ah4 {
        public /* synthetic */ C16123d(C16120a c16120a) {
            this();
        }

        public C16123d addAllBucketCounts(Iterable<? extends Long> iterable) {
            m23743e();
            ((zg4) this.f89756b).addAllBucketCounts(iterable);
            return this;
        }

        public C16123d addAllExemplars(Iterable<? extends C16124e> iterable) {
            m23743e();
            ((zg4) this.f89756b).addAllExemplars(iterable);
            return this;
        }

        public C16123d addBucketCounts(long j) {
            m23743e();
            ((zg4) this.f89756b).addBucketCounts(j);
            return this;
        }

        public C16123d addExemplars(C16124e c16124e) {
            m23743e();
            ((zg4) this.f89756b).addExemplars(c16124e);
            return this;
        }

        public C16123d clearBucketCounts() {
            m23743e();
            ((zg4) this.f89756b).clearBucketCounts();
            return this;
        }

        public C16123d clearBucketOptions() {
            m23743e();
            ((zg4) this.f89756b).clearBucketOptions();
            return this;
        }

        public C16123d clearCount() {
            m23743e();
            ((zg4) this.f89756b).clearCount();
            return this;
        }

        public C16123d clearExemplars() {
            m23743e();
            ((zg4) this.f89756b).clearExemplars();
            return this;
        }

        public C16123d clearMean() {
            m23743e();
            ((zg4) this.f89756b).clearMean();
            return this;
        }

        public C16123d clearRange() {
            m23743e();
            ((zg4) this.f89756b).clearRange();
            return this;
        }

        public C16123d clearSumOfSquaredDeviation() {
            m23743e();
            ((zg4) this.f89756b).clearSumOfSquaredDeviation();
            return this;
        }

        @Override // p000.ah4
        public long getBucketCounts(int i) {
            return ((zg4) this.f89756b).getBucketCounts(i);
        }

        @Override // p000.ah4
        public int getBucketCountsCount() {
            return ((zg4) this.f89756b).getBucketCountsCount();
        }

        @Override // p000.ah4
        public List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((zg4) this.f89756b).getBucketCountsList());
        }

        @Override // p000.ah4
        public C16121b getBucketOptions() {
            return ((zg4) this.f89756b).getBucketOptions();
        }

        @Override // p000.ah4
        public long getCount() {
            return ((zg4) this.f89756b).getCount();
        }

        @Override // p000.ah4
        public C16124e getExemplars(int i) {
            return ((zg4) this.f89756b).getExemplars(i);
        }

        @Override // p000.ah4
        public int getExemplarsCount() {
            return ((zg4) this.f89756b).getExemplarsCount();
        }

        @Override // p000.ah4
        public List<C16124e> getExemplarsList() {
            return Collections.unmodifiableList(((zg4) this.f89756b).getExemplarsList());
        }

        @Override // p000.ah4
        public double getMean() {
            return ((zg4) this.f89756b).getMean();
        }

        @Override // p000.ah4
        public C16126g getRange() {
            return ((zg4) this.f89756b).getRange();
        }

        @Override // p000.ah4
        public double getSumOfSquaredDeviation() {
            return ((zg4) this.f89756b).getSumOfSquaredDeviation();
        }

        @Override // p000.ah4
        public boolean hasBucketOptions() {
            return ((zg4) this.f89756b).hasBucketOptions();
        }

        @Override // p000.ah4
        public boolean hasRange() {
            return ((zg4) this.f89756b).hasRange();
        }

        public C16123d mergeBucketOptions(C16121b c16121b) {
            m23743e();
            ((zg4) this.f89756b).mergeBucketOptions(c16121b);
            return this;
        }

        public C16123d mergeRange(C16126g c16126g) {
            m23743e();
            ((zg4) this.f89756b).mergeRange(c16126g);
            return this;
        }

        public C16123d removeExemplars(int i) {
            m23743e();
            ((zg4) this.f89756b).removeExemplars(i);
            return this;
        }

        public C16123d setBucketCounts(int i, long j) {
            m23743e();
            ((zg4) this.f89756b).setBucketCounts(i, j);
            return this;
        }

        public C16123d setBucketOptions(C16121b c16121b) {
            m23743e();
            ((zg4) this.f89756b).setBucketOptions(c16121b);
            return this;
        }

        public C16123d setCount(long j) {
            m23743e();
            ((zg4) this.f89756b).setCount(j);
            return this;
        }

        public C16123d setExemplars(int i, C16124e c16124e) {
            m23743e();
            ((zg4) this.f89756b).setExemplars(i, c16124e);
            return this;
        }

        public C16123d setMean(double d) {
            m23743e();
            ((zg4) this.f89756b).setMean(d);
            return this;
        }

        public C16123d setRange(C16126g c16126g) {
            m23743e();
            ((zg4) this.f89756b).setRange(c16126g);
            return this;
        }

        public C16123d setSumOfSquaredDeviation(double d) {
            m23743e();
            ((zg4) this.f89756b).setSumOfSquaredDeviation(d);
            return this;
        }

        private C16123d() {
            super(zg4.DEFAULT_INSTANCE);
        }

        public C16123d addExemplars(int i, C16124e c16124e) {
            m23743e();
            ((zg4) this.f89756b).addExemplars(i, c16124e);
            return this;
        }

        public C16123d setBucketOptions(C16121b.a aVar) {
            m23743e();
            ((zg4) this.f89756b).setBucketOptions(aVar.build());
            return this;
        }

        public C16123d setExemplars(int i, C16124e.a aVar) {
            m23743e();
            ((zg4) this.f89756b).setExemplars(i, aVar.build());
            return this;
        }

        public C16123d setRange(C16126g.a aVar) {
            m23743e();
            ((zg4) this.f89756b).setRange(aVar.build());
            return this;
        }

        public C16123d addExemplars(C16124e.a aVar) {
            m23743e();
            ((zg4) this.f89756b).addExemplars(aVar.build());
            return this;
        }

        public C16123d addExemplars(int i, C16124e.a aVar) {
            m23743e();
            ((zg4) this.f89756b).addExemplars(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: zg4$e */
    public static final class C16124e extends v27<C16124e, a> implements InterfaceC16125f {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final C16124e DEFAULT_INSTANCE;
        private static volatile uhc<C16124e> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private w98.InterfaceC14504k<C15896yz> attachments_ = v27.m23722x();
        private int bitField0_;
        private f2h timestamp_;
        private double value_;

        /* JADX INFO: renamed from: zg4$e$a */
        public static final class a extends v27.AbstractC13823b<C16124e, a> implements InterfaceC16125f {
            public /* synthetic */ a(C16120a c16120a) {
                this();
            }

            public a addAllAttachments(Iterable<? extends C15896yz> iterable) {
                m23743e();
                ((C16124e) this.f89756b).addAllAttachments(iterable);
                return this;
            }

            public a addAttachments(C15896yz c15896yz) {
                m23743e();
                ((C16124e) this.f89756b).addAttachments(c15896yz);
                return this;
            }

            public a clearAttachments() {
                m23743e();
                ((C16124e) this.f89756b).clearAttachments();
                return this;
            }

            public a clearTimestamp() {
                m23743e();
                ((C16124e) this.f89756b).clearTimestamp();
                return this;
            }

            public a clearValue() {
                m23743e();
                ((C16124e) this.f89756b).clearValue();
                return this;
            }

            @Override // p000.zg4.InterfaceC16125f
            public C15896yz getAttachments(int i) {
                return ((C16124e) this.f89756b).getAttachments(i);
            }

            @Override // p000.zg4.InterfaceC16125f
            public int getAttachmentsCount() {
                return ((C16124e) this.f89756b).getAttachmentsCount();
            }

            @Override // p000.zg4.InterfaceC16125f
            public List<C15896yz> getAttachmentsList() {
                return Collections.unmodifiableList(((C16124e) this.f89756b).getAttachmentsList());
            }

            @Override // p000.zg4.InterfaceC16125f
            public f2h getTimestamp() {
                return ((C16124e) this.f89756b).getTimestamp();
            }

            @Override // p000.zg4.InterfaceC16125f
            public double getValue() {
                return ((C16124e) this.f89756b).getValue();
            }

            @Override // p000.zg4.InterfaceC16125f
            public boolean hasTimestamp() {
                return ((C16124e) this.f89756b).hasTimestamp();
            }

            public a mergeTimestamp(f2h f2hVar) {
                m23743e();
                ((C16124e) this.f89756b).mergeTimestamp(f2hVar);
                return this;
            }

            public a removeAttachments(int i) {
                m23743e();
                ((C16124e) this.f89756b).removeAttachments(i);
                return this;
            }

            public a setAttachments(int i, C15896yz c15896yz) {
                m23743e();
                ((C16124e) this.f89756b).setAttachments(i, c15896yz);
                return this;
            }

            public a setTimestamp(f2h f2hVar) {
                m23743e();
                ((C16124e) this.f89756b).setTimestamp(f2hVar);
                return this;
            }

            public a setValue(double d) {
                m23743e();
                ((C16124e) this.f89756b).setValue(d);
                return this;
            }

            private a() {
                super(C16124e.DEFAULT_INSTANCE);
            }

            public a addAttachments(int i, C15896yz c15896yz) {
                m23743e();
                ((C16124e) this.f89756b).addAttachments(i, c15896yz);
                return this;
            }

            public a setAttachments(int i, C15896yz.b bVar) {
                m23743e();
                ((C16124e) this.f89756b).setAttachments(i, bVar.build());
                return this;
            }

            public a setTimestamp(f2h.C5567b c5567b) {
                m23743e();
                ((C16124e) this.f89756b).setTimestamp(c5567b.build());
                return this;
            }

            public a addAttachments(C15896yz.b bVar) {
                m23743e();
                ((C16124e) this.f89756b).addAttachments(bVar.build());
                return this;
            }

            public a addAttachments(int i, C15896yz.b bVar) {
                m23743e();
                ((C16124e) this.f89756b).addAttachments(i, bVar.build());
                return this;
            }
        }

        static {
            C16124e c16124e = new C16124e();
            DEFAULT_INSTANCE = c16124e;
            v27.m23715h0(C16124e.class, c16124e);
        }

        private C16124e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends C15896yz> iterable) {
            ensureAttachmentsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.attachments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(C15896yz c15896yz) {
            c15896yz.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(c15896yz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        private void ensureAttachmentsIsMutable() {
            w98.InterfaceC14504k<C15896yz> interfaceC14504k = this.attachments_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.attachments_ = v27.m23698P(interfaceC14504k);
        }

        public static C16124e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(f2h f2hVar) {
            f2hVar.getClass();
            f2h f2hVar2 = this.timestamp_;
            if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
                this.timestamp_ = f2hVar;
            } else {
                this.timestamp_ = f2h.newBuilder(this.timestamp_).mergeFrom(f2hVar).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C16124e parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C16124e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C16124e parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C16124e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C16124e> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttachments(int i) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttachments(int i, C15896yz c15896yz) {
            c15896yz.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.set(i, c15896yz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(f2h f2hVar) {
            f2hVar.getClass();
            this.timestamp_ = f2hVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        @Override // p000.zg4.InterfaceC16125f
        public C15896yz getAttachments(int i) {
            return this.attachments_.get(i);
        }

        @Override // p000.zg4.InterfaceC16125f
        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        @Override // p000.zg4.InterfaceC16125f
        public List<C15896yz> getAttachmentsList() {
            return this.attachments_;
        }

        public a00 getAttachmentsOrBuilder(int i) {
            return this.attachments_.get(i);
        }

        public List<? extends a00> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        @Override // p000.zg4.InterfaceC16125f
        public f2h getTimestamp() {
            f2h f2hVar = this.timestamp_;
            return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
        }

        @Override // p000.zg4.InterfaceC16125f
        public double getValue() {
            return this.value_;
        }

        @Override // p000.zg4.InterfaceC16125f
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C16120a c16120a = null;
            switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                case 1:
                    return new C16124e();
                case 2:
                    return new a(c16120a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "value_", "timestamp_", "attachments_", C15896yz.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C16124e> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C16124e.class) {
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

        public static a newBuilder(C16124e c16124e) {
            return DEFAULT_INSTANCE.m23739o(c16124e);
        }

        public static C16124e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16124e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16124e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C16124e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C16124e parseFrom(vj1 vj1Var) throws ce8 {
            return (C16124e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(int i, C15896yz c15896yz) {
            c15896yz.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(i, c15896yz);
        }

        public static C16124e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C16124e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C16124e parseFrom(byte[] bArr) throws ce8 {
            return (C16124e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C16124e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C16124e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C16124e parseFrom(InputStream inputStream) throws IOException {
            return (C16124e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C16124e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16124e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16124e parseFrom(f72 f72Var) throws IOException {
            return (C16124e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C16124e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C16124e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: zg4$f */
    public interface InterfaceC16125f extends rsa {
        C15896yz getAttachments(int i);

        int getAttachmentsCount();

        List<C15896yz> getAttachmentsList();

        f2h getTimestamp();

        double getValue();

        boolean hasTimestamp();
    }

    /* JADX INFO: renamed from: zg4$g */
    public static final class C16126g extends v27<C16126g, a> implements InterfaceC16127h {
        private static final C16126g DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile uhc<C16126g> PARSER;
        private double max_;
        private double min_;

        /* JADX INFO: renamed from: zg4$g$a */
        public static final class a extends v27.AbstractC13823b<C16126g, a> implements InterfaceC16127h {
            public /* synthetic */ a(C16120a c16120a) {
                this();
            }

            public a clearMax() {
                m23743e();
                ((C16126g) this.f89756b).clearMax();
                return this;
            }

            public a clearMin() {
                m23743e();
                ((C16126g) this.f89756b).clearMin();
                return this;
            }

            @Override // p000.zg4.InterfaceC16127h
            public double getMax() {
                return ((C16126g) this.f89756b).getMax();
            }

            @Override // p000.zg4.InterfaceC16127h
            public double getMin() {
                return ((C16126g) this.f89756b).getMin();
            }

            public a setMax(double d) {
                m23743e();
                ((C16126g) this.f89756b).setMax(d);
                return this;
            }

            public a setMin(double d) {
                m23743e();
                ((C16126g) this.f89756b).setMin(d);
                return this;
            }

            private a() {
                super(C16126g.DEFAULT_INSTANCE);
            }
        }

        static {
            C16126g c16126g = new C16126g();
            DEFAULT_INSTANCE = c16126g;
            v27.m23715h0(C16126g.class, c16126g);
        }

        private C16126g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0.0d;
        }

        public static C16126g getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C16126g parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C16126g) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C16126g parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C16126g) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C16126g> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(double d) {
            this.max_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(double d) {
            this.min_ = d;
        }

        @Override // p000.zg4.InterfaceC16127h
        public double getMax() {
            return this.max_;
        }

        @Override // p000.zg4.InterfaceC16127h
        public double getMin() {
            return this.min_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C16120a c16120a = null;
            switch (C16120a.f105038a[enumC13830i.ordinal()]) {
                case 1:
                    return new C16126g();
                case 2:
                    return new a(c16120a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C16126g> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C16126g.class) {
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

        public static a newBuilder(C16126g c16126g) {
            return DEFAULT_INSTANCE.m23739o(c16126g);
        }

        public static C16126g parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16126g) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16126g parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C16126g) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C16126g parseFrom(vj1 vj1Var) throws ce8 {
            return (C16126g) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C16126g parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C16126g) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C16126g parseFrom(byte[] bArr) throws ce8 {
            return (C16126g) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C16126g parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C16126g) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C16126g parseFrom(InputStream inputStream) throws IOException {
            return (C16126g) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C16126g parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C16126g) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C16126g parseFrom(f72 f72Var) throws IOException {
            return (C16126g) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C16126g parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C16126g) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: zg4$h */
    public interface InterfaceC16127h extends rsa {
        double getMax();

        double getMin();
    }

    static {
        zg4 zg4Var = new zg4();
        DEFAULT_INSTANCE = zg4Var;
        v27.m23715h0(zg4.class, zg4Var);
    }

    private zg4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.bucketCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends C16124e> iterable) {
        ensureExemplarsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(C16124e c16124e) {
        c16124e.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(c16124e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = v27.m23721w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    private void ensureBucketCountsIsMutable() {
        w98.InterfaceC14503j interfaceC14503j = this.bucketCounts_;
        if (interfaceC14503j.isModifiable()) {
            return;
        }
        this.bucketCounts_ = v27.m23697O(interfaceC14503j);
    }

    private void ensureExemplarsIsMutable() {
        w98.InterfaceC14504k<C16124e> interfaceC14504k = this.exemplars_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.exemplars_ = v27.m23698P(interfaceC14504k);
    }

    public static zg4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBucketOptions(C16121b c16121b) {
        c16121b.getClass();
        C16121b c16121b2 = this.bucketOptions_;
        if (c16121b2 == null || c16121b2 == C16121b.getDefaultInstance()) {
            this.bucketOptions_ = c16121b;
        } else {
            this.bucketOptions_ = C16121b.newBuilder(this.bucketOptions_).mergeFrom(c16121b).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRange(C16126g c16126g) {
        c16126g.getClass();
        C16126g c16126g2 = this.range_;
        if (c16126g2 == null || c16126g2 == C16126g.getDefaultInstance()) {
            this.range_ = c16126g;
        } else {
            this.range_ = C16126g.newBuilder(this.range_).mergeFrom(c16126g).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C16123d newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static zg4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (zg4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static zg4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (zg4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<zg4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketOptions(C16121b c16121b) {
        c16121b.getClass();
        this.bucketOptions_ = c16121b;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i, C16124e c16124e) {
        c16124e.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, c16124e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMean(double d) {
        this.mean_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(C16126g c16126g) {
        c16126g.getClass();
        this.range_ = c16126g;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    @Override // p000.ah4
    public long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    @Override // p000.ah4
    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    @Override // p000.ah4
    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    @Override // p000.ah4
    public C16121b getBucketOptions() {
        C16121b c16121b = this.bucketOptions_;
        return c16121b == null ? C16121b.getDefaultInstance() : c16121b;
    }

    @Override // p000.ah4
    public long getCount() {
        return this.count_;
    }

    @Override // p000.ah4
    public C16124e getExemplars(int i) {
        return this.exemplars_.get(i);
    }

    @Override // p000.ah4
    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    @Override // p000.ah4
    public List<C16124e> getExemplarsList() {
        return this.exemplars_;
    }

    public InterfaceC16125f getExemplarsOrBuilder(int i) {
        return this.exemplars_.get(i);
    }

    public List<? extends InterfaceC16125f> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    @Override // p000.ah4
    public double getMean() {
        return this.mean_;
    }

    @Override // p000.ah4
    public C16126g getRange() {
        C16126g c16126g = this.range_;
        return c16126g == null ? C16126g.getDefaultInstance() : c16126g;
    }

    @Override // p000.ah4
    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    @Override // p000.ah4
    public boolean hasBucketOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.ah4
    public boolean hasRange() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C16120a c16120a = null;
        switch (C16120a.f105038a[enumC13830i.ordinal()]) {
            case 1:
                return new zg4();
            case 2:
                return new C16123d(c16120a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004ဉ\u0000\u0006ဉ\u0001\u0007%\n\u001b", new Object[]{"bitField0_", "count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", C16124e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<zg4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (zg4.class) {
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

    public static C16123d newBuilder(zg4 zg4Var) {
        return DEFAULT_INSTANCE.m23739o(zg4Var);
    }

    public static zg4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zg4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zg4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (zg4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static zg4 parseFrom(vj1 vj1Var) throws ce8 {
        return (zg4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(int i, C16124e c16124e) {
        c16124e.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, c16124e);
    }

    public static zg4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (zg4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static zg4 parseFrom(byte[] bArr) throws ce8 {
        return (zg4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static zg4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (zg4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static zg4 parseFrom(InputStream inputStream) throws IOException {
        return (zg4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static zg4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zg4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zg4 parseFrom(f72 f72Var) throws IOException {
        return (zg4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static zg4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (zg4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
