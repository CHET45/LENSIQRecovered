package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class eo8 {
    @ph5
    public static final <T> T decodeFromStream(@yfb bk8 bk8Var, @yfb t74<? extends T> t74Var, @yfb InputStream inputStream) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(inputStream, "stream");
        yi8 yi8Var = new yi8(inputStream);
        try {
            return (T) mm8.decodeByReader(bk8Var, t74Var, yi8Var);
        } finally {
            yi8Var.release();
        }
    }

    @ph5
    @yfb
    public static final <T> vye<T> decodeToSequence(@yfb bk8 bk8Var, @yfb InputStream inputStream, @yfb t74<? extends T> t74Var, @yfb hl3 hl3Var) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(inputStream, "stream");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return mm8.decodeToSequenceByReader(bk8Var, new yi8(inputStream), t74Var, hl3Var);
    }

    public static /* synthetic */ vye decodeToSequence$default(bk8 bk8Var, InputStream inputStream, t74 t74Var, hl3 hl3Var, int i, Object obj) {
        if ((i & 4) != 0) {
            hl3Var = hl3.f44066c;
        }
        return decodeToSequence(bk8Var, inputStream, t74Var, hl3Var);
    }

    @ph5
    public static final <T> void encodeToStream(@yfb bk8 bk8Var, @yfb e1f<? super T> e1fVar, T t, @yfb OutputStream outputStream) throws IOException {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(e1fVar, "serializer");
        md8.checkNotNullParameter(outputStream, "stream");
        nm8 nm8Var = new nm8(outputStream);
        try {
            mm8.encodeByWriter(bk8Var, nm8Var, e1fVar, t);
        } finally {
            nm8Var.release();
        }
    }

    @ph5
    public static final /* synthetic */ <T> vye<T> decodeToSequence(bk8 bk8Var, InputStream inputStream, hl3 hl3Var) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(inputStream, "stream");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(bk8Var, inputStream, i2f.serializer(serializersModule, (mp8) null), hl3Var);
    }

    public static /* synthetic */ vye decodeToSequence$default(bk8 bk8Var, InputStream inputStream, hl3 hl3Var, int i, Object obj) {
        if ((i & 2) != 0) {
            hl3Var = hl3.f44066c;
        }
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(inputStream, "stream");
        md8.checkNotNullParameter(hl3Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(bk8Var, inputStream, i2f.serializer(serializersModule, (mp8) null), hl3Var);
    }

    @ph5
    public static final /* synthetic */ <T> T decodeFromStream(bk8 bk8Var, InputStream inputStream) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(inputStream, "stream");
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(bk8Var, i2f.serializer(serializersModule, (mp8) null), inputStream);
    }

    @ph5
    public static final /* synthetic */ <T> void encodeToStream(bk8 bk8Var, T t, OutputStream outputStream) throws IOException {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(outputStream, "stream");
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToStream(bk8Var, i2f.serializer(serializersModule, (mp8) null), t, outputStream);
    }
}
