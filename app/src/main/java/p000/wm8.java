package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n513#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class wm8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC2163c2 f94746a;

    /* JADX INFO: renamed from: b */
    public final boolean f94747b;

    /* JADX INFO: renamed from: c */
    public final boolean f94748c;

    /* JADX INFO: renamed from: d */
    public int f94749d;

    /* JADX INFO: renamed from: wm8$a */
    @ck3(m4009c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m4010f = "JsonTreeReader.kt", m4011i = {}, m4012l = {115}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14691a extends t7e implements kz6<km3<bth, sk8>, bth, zy2<? super sk8>, Object> {

        /* JADX INFO: renamed from: a */
        public int f94750a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f94751b;

        public C14691a(zy2<? super C14691a> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public final Object invoke(km3<bth, sk8> km3Var, bth bthVar, zy2<? super sk8> zy2Var) {
            C14691a c14691a = wm8.this.new C14691a(zy2Var);
            c14691a.f94751b = km3Var;
            return c14691a.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f94750a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                km3 km3Var = (km3) this.f94751b;
                byte bPeekNextToken = wm8.this.f94746a.peekNextToken();
                if (bPeekNextToken == 1) {
                    return wm8.this.readValue(true);
                }
                if (bPeekNextToken == 0) {
                    return wm8.this.readValue(false);
                }
                if (bPeekNextToken != 6) {
                    if (bPeekNextToken == 8) {
                        return wm8.this.readArray();
                    }
                    AbstractC2163c2.fail$default(wm8.this.f94746a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new us8();
                }
                wm8 wm8Var = wm8.this;
                this.f94750a = 1;
                obj = wm8Var.readObject(km3Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return (sk8) obj;
        }
    }

    /* JADX INFO: renamed from: wm8$b */
    @ck3(m4009c = "kotlinx.serialization.json.internal.JsonTreeReader", m4010f = "JsonTreeReader.kt", m4011i = {0, 0, 0, 0}, m4012l = {24}, m4013m = "readObject", m4014n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C14692b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f94753a;

        /* JADX INFO: renamed from: b */
        public Object f94754b;

        /* JADX INFO: renamed from: c */
        public Object f94755c;

        /* JADX INFO: renamed from: d */
        public Object f94756d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f94757e;

        /* JADX INFO: renamed from: m */
        public int f94759m;

        public C14692b(zy2<? super C14692b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f94757e = obj;
            this.f94759m |= Integer.MIN_VALUE;
            return wm8.this.readObject(null, this);
        }
    }

    public wm8(@yfb hk8 hk8Var, @yfb AbstractC2163c2 abstractC2163c2) {
        md8.checkNotNullParameter(hk8Var, "configuration");
        md8.checkNotNullParameter(abstractC2163c2, "lexer");
        this.f94746a = abstractC2163c2;
        this.f94747b = hk8Var.isLenient();
        this.f94748c = hk8Var.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sk8 readArray() {
        byte bConsumeNextToken = this.f94746a.consumeNextToken();
        if (this.f94746a.peekNextToken() == 4) {
            AbstractC2163c2.fail$default(this.f94746a, "Unexpected leading comma", 0, null, 6, null);
            throw new us8();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f94746a.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.f94746a.consumeNextToken();
            if (bConsumeNextToken != 4) {
                AbstractC2163c2 abstractC2163c2 = this.f94746a;
                boolean z = bConsumeNextToken == 9;
                int i = abstractC2163c2.f15565a;
                if (!z) {
                    AbstractC2163c2.fail$default(abstractC2163c2, "Expected end of the array or comma", i, null, 4, null);
                    throw new us8();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.f94746a.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            if (!this.f94748c) {
                il8.invalidTrailingComma(this.f94746a, "array");
                throw new us8();
            }
            this.f94746a.consumeNextToken((byte) 9);
        }
        return new ck8(arrayList);
    }

    private final sk8 readDeepRecursive() {
        return (sk8) jm3.invoke(new im3(new C14691a(null)), bth.f14751a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readObject(p000.km3<p000.bth, p000.sk8> r21, p000.zy2<? super p000.sk8> r22) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wm8.readObject(km3, zy2):java.lang.Object");
    }

    private final am8 readObjectImpl(ny6<? extends sk8> ny6Var) {
        byte bConsumeNextToken = this.f94746a.consumeNextToken((byte) 6);
        if (this.f94746a.peekNextToken() == 4) {
            AbstractC2163c2.fail$default(this.f94746a, "Unexpected leading comma", 0, null, 6, null);
            throw new us8();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f94746a.canConsumeValue()) {
                break;
            }
            String strConsumeStringLenient = this.f94747b ? this.f94746a.consumeStringLenient() : this.f94746a.consumeString();
            this.f94746a.consumeNextToken((byte) 5);
            linkedHashMap.put(strConsumeStringLenient, ny6Var.invoke());
            bConsumeNextToken = this.f94746a.consumeNextToken();
            if (bConsumeNextToken != 4) {
                if (bConsumeNextToken != 7) {
                    AbstractC2163c2.fail$default(this.f94746a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new us8();
                }
            }
        }
        if (bConsumeNextToken == 6) {
            this.f94746a.consumeNextToken((byte) 7);
        } else if (bConsumeNextToken == 4) {
            if (!this.f94748c) {
                il8.invalidTrailingComma$default(this.f94746a, null, 1, null);
                throw new us8();
            }
            this.f94746a.consumeNextToken((byte) 7);
        }
        return new am8(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fm8 readValue(boolean z) {
        String strConsumeStringLenient = (this.f94747b || !z) ? this.f94746a.consumeStringLenient() : this.f94746a.consumeString();
        return (z || !md8.areEqual(strConsumeStringLenient, "null")) ? new ql8(strConsumeStringLenient, z, null, 4, null) : xl8.INSTANCE;
    }

    @yfb
    public final sk8 read() {
        byte bPeekNextToken = this.f94746a.peekNextToken();
        if (bPeekNextToken == 1) {
            return readValue(true);
        }
        if (bPeekNextToken == 0) {
            return readValue(false);
        }
        if (bPeekNextToken == 6) {
            int i = this.f94749d + 1;
            this.f94749d = i;
            this.f94749d--;
            return i == 200 ? readDeepRecursive() : readObject();
        }
        if (bPeekNextToken == 8) {
            return readArray();
        }
        AbstractC2163c2.fail$default(this.f94746a, "Cannot read Json element because of unexpected " + C4584d2.tokenDescription(bPeekNextToken), 0, null, 6, null);
        throw new us8();
    }

    private final sk8 readObject() {
        byte bConsumeNextToken = this.f94746a.consumeNextToken((byte) 6);
        if (this.f94746a.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f94746a.canConsumeValue()) {
                    break;
                }
                String strConsumeStringLenient = this.f94747b ? this.f94746a.consumeStringLenient() : this.f94746a.consumeString();
                this.f94746a.consumeNextToken((byte) 5);
                linkedHashMap.put(strConsumeStringLenient, read());
                bConsumeNextToken = this.f94746a.consumeNextToken();
                if (bConsumeNextToken != 4) {
                    if (bConsumeNextToken != 7) {
                        AbstractC2163c2.fail$default(this.f94746a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new us8();
                    }
                }
            }
            if (bConsumeNextToken == 6) {
                this.f94746a.consumeNextToken((byte) 7);
            } else if (bConsumeNextToken == 4) {
                if (this.f94748c) {
                    this.f94746a.consumeNextToken((byte) 7);
                } else {
                    il8.invalidTrailingComma$default(this.f94746a, null, 1, null);
                    throw new us8();
                }
            }
            return new am8(linkedHashMap);
        }
        AbstractC2163c2.fail$default(this.f94746a, "Unexpected leading comma", 0, null, 6, null);
        throw new us8();
    }
}
