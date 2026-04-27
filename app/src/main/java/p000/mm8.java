package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class mm8 {

    /* JADX INFO: renamed from: a */
    public static final int f61488a = 65535;

    /* JADX INFO: renamed from: b */
    public static final int f61489b = 55232;

    /* JADX INFO: renamed from: c */
    public static final int f61490c = 56320;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: mm8$a */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 JsonStreams.kt\nkotlinx/serialization/json/internal/JsonStreamsKt\n*L\n1#1,22:1\n129#2:23\n*E\n"})
    public static final class C9413a<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f61491a;

        public C9413a(Iterator it) {
            this.f61491a = it;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return this.f61491a;
        }
    }

    @jl8
    public static final <T> T decodeByReader(@yfb bk8 bk8Var, @yfb t74<? extends T> t74Var, @yfb ya8 ya8Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(ya8Var, "reader");
        krd krdVarReaderJsonLexer$default = lrd.ReaderJsonLexer$default(bk8Var, ya8Var, null, 4, null);
        try {
            T t = (T) new y6g(bk8Var, csi.f27316c, krdVarReaderJsonLexer$default, t74Var.getDescriptor(), null).decodeSerializableValue(t74Var);
            krdVarReaderJsonLexer$default.expectEof();
            return t;
        } finally {
            krdVarReaderJsonLexer$default.release();
        }
    }

    @jl8
    @ph5
    @yfb
    public static final <T> vye<T> decodeToSequenceByReader(@yfb bk8 bk8Var, @yfb ya8 ya8Var, @yfb t74<? extends T> t74Var, @yfb hl3 hl3Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return ize.constrainOnce(new C9413a(nl8.JsonIterator(hl3Var, bk8Var, lrd.ReaderJsonLexer(bk8Var, ya8Var, new char[16384]), t74Var)));
    }

    public static /* synthetic */ vye decodeToSequenceByReader$default(bk8 bk8Var, ya8 ya8Var, t74 t74Var, hl3 hl3Var, int i, Object obj) {
        if ((i & 8) != 0) {
            hl3Var = hl3.f44066c;
        }
        return decodeToSequenceByReader(bk8Var, ya8Var, t74Var, hl3Var);
    }

    @jl8
    public static final <T> void encodeByWriter(@yfb bk8 bk8Var, @yfb ab8 ab8Var, @yfb e1f<? super T> e1fVar, T t) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ab8Var, "writer");
        md8.checkNotNullParameter(e1fVar, "serializer");
        new a7g(ab8Var, bk8Var, csi.f27316c, new el8[csi.getEntries().size()]).encodeSerializableValue(e1fVar, t);
    }

    public static /* synthetic */ vye decodeToSequenceByReader$default(bk8 bk8Var, ya8 ya8Var, hl3 hl3Var, int i, Object obj) {
        if ((i & 4) != 0) {
            hl3Var = hl3.f44066c;
        }
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(bk8Var, ya8Var, i2f.serializer(serializersModule, (mp8) null), hl3Var);
    }

    @jl8
    @ph5
    public static final /* synthetic */ <T> vye<T> decodeToSequenceByReader(bk8 bk8Var, ya8 ya8Var, hl3 hl3Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(bk8Var, ya8Var, i2f.serializer(serializersModule, (mp8) null), hl3Var);
    }
}
