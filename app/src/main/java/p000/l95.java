package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@c5e(27)
public final class l95 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@efb InputStream inputStream, @efb z60 z60Var) throws IOException {
        int attributeInt = new k95(inputStream).getAttributeInt(k95.f52880C, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @efb
    public ImageHeaderParser.ImageType getType(@efb InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @efb
    public ImageHeaderParser.ImageType getType(@efb ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@efb ByteBuffer byteBuffer, @efb z60 z60Var) throws IOException {
        return getOrientation(ej1.toStream(byteBuffer), z60Var);
    }
}
