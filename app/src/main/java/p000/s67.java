package p000;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class s67 {

    /* JADX INFO: renamed from: g */
    public static final int f80755g = 35815;

    /* JADX INFO: renamed from: a */
    public final int f80756a;

    /* JADX INFO: renamed from: b */
    public final C12459a[] f80757b;

    /* JADX INFO: renamed from: c */
    public final C12460b[] f80758c;

    /* JADX INFO: renamed from: d */
    public final Map<String, C12459a> f80759d;

    /* JADX INFO: renamed from: e */
    public final Map<String, C12460b> f80760e;

    /* JADX INFO: renamed from: f */
    public boolean f80761f;

    /* JADX INFO: renamed from: s67$a */
    public static final class C12459a {

        /* JADX INFO: renamed from: a */
        public final String f80762a;

        /* JADX INFO: renamed from: b */
        public final int f80763b;

        /* JADX INFO: renamed from: c */
        @hib
        public Buffer f80764c;

        /* JADX INFO: renamed from: d */
        public int f80765d;

        private C12459a(String str, int i) {
            this.f80762a = str;
            this.f80763b = i;
        }

        public static C12459a create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, s67.getCStringLength(bArr));
            return new C12459a(str, s67.getAttributeLocation(i, str));
        }

        public void bind() throws x67.C14938a {
            Buffer buffer = (Buffer) v80.checkNotNull(this.f80764c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f80763b, this.f80765d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f80763b);
            x67.checkGlError();
        }

        public void setBuffer(float[] fArr, int i) {
            this.f80764c = x67.createBuffer(fArr);
            this.f80765d = i;
        }
    }

    /* JADX INFO: renamed from: s67$b */
    public static final class C12460b {

        /* JADX INFO: renamed from: a */
        public final String f80766a;

        /* JADX INFO: renamed from: b */
        public final int f80767b;

        /* JADX INFO: renamed from: c */
        public final int f80768c;

        /* JADX INFO: renamed from: f */
        public int f80771f;

        /* JADX INFO: renamed from: g */
        public int f80772g;

        /* JADX INFO: renamed from: d */
        public final float[] f80769d = new float[16];

        /* JADX INFO: renamed from: e */
        public final int[] f80770e = new int[4];

        /* JADX INFO: renamed from: h */
        public int f80773h = jk1.f50790I3;

        private C12460b(String str, int i, int i2) {
            this.f80766a = str;
            this.f80767b = i;
            this.f80768c = i2;
        }

        public static C12460b create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, s67.getCStringLength(bArr));
            return new C12460b(str, s67.getUniformLocation(i, str), iArr2[0]);
        }

        public void bind(boolean z) throws x67.C14938a {
            int i = this.f80768c;
            if (i == 5124) {
                GLES20.glUniform1iv(this.f80767b, 1, this.f80770e, 0);
                x67.checkGlError();
                return;
            }
            if (i == 5126) {
                GLES20.glUniform1fv(this.f80767b, 1, this.f80769d, 0);
                x67.checkGlError();
                return;
            }
            if (i == 35678 || i == 35815 || i == 36198) {
                if (this.f80771f == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.f80772g + 33984);
                x67.checkGlError();
                int i2 = this.f80768c;
                x67.bindTexture(i2 == 35678 ? 3553 : 36197, this.f80771f, (i2 == 35678 || !z) ? jk1.f50790I3 : 9728);
                if (this.f80768c == 35678) {
                    if (this.f80773h == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        x67.checkGlError();
                    }
                    GLES20.glTexParameteri(3553, 10241, this.f80773h);
                    x67.checkGlError();
                }
                GLES20.glUniform1i(this.f80767b, this.f80772g);
                x67.checkGlError();
                return;
            }
            switch (i) {
                case 35664:
                    GLES20.glUniform2fv(this.f80767b, 1, this.f80769d, 0);
                    x67.checkGlError();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f80767b, 1, this.f80769d, 0);
                    x67.checkGlError();
                    return;
                case 35666:
                    GLES20.glUniform4fv(this.f80767b, 1, this.f80769d, 0);
                    x67.checkGlError();
                    return;
                case 35667:
                    GLES20.glUniform2iv(this.f80767b, 1, this.f80770e, 0);
                    x67.checkGlError();
                    return;
                case 35668:
                    GLES20.glUniform3iv(this.f80767b, 1, this.f80770e, 0);
                    x67.checkGlError();
                    return;
                case 35669:
                    GLES20.glUniform4iv(this.f80767b, 1, this.f80770e, 0);
                    x67.checkGlError();
                    return;
                default:
                    switch (i) {
                        case 35675:
                            GLES20.glUniformMatrix3fv(this.f80767b, 1, false, this.f80769d, 0);
                            x67.checkGlError();
                            return;
                        case 35676:
                            GLES20.glUniformMatrix4fv(this.f80767b, 1, false, this.f80769d, 0);
                            x67.checkGlError();
                            return;
                        default:
                            throw new IllegalStateException("Unexpected uniform type: " + this.f80768c);
                    }
            }
        }

        public void setFloat(float f) {
            this.f80769d[0] = f;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.f80769d, 0, fArr.length);
        }

        public void setInt(int i) {
            this.f80770e[0] = i;
        }

        public void setInts(int[] iArr) {
            System.arraycopy(iArr, 0, this.f80770e, 0, iArr.length);
        }

        public void setSamplerTexId(int i, int i2) {
            this.f80771f = i;
            this.f80772g = i2;
        }

        public void setTexMinFilter(int i) {
            this.f80773h = i;
        }
    }

    public s67(Context context, String str, String str2) throws x67.C14938a, IOException {
        this(t0i.loadAsset(context, str), t0i.loadAsset(context, str2));
    }

    private static void addShader(int i, int i2, String str) throws x67.C14938a {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        x67.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        x67.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public void bindAttributesAndUniforms() throws x67.C14938a {
        for (C12459a c12459a : this.f80757b) {
            c12459a.bind();
        }
        for (C12460b c12460b : this.f80758c) {
            c12460b.bind(this.f80761f);
        }
    }

    public void delete() throws x67.C14938a {
        GLES20.glDeleteProgram(this.f80756a);
        x67.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws x67.C14938a {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        x67.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        ((C12459a) v80.checkNotNull(this.f80759d.get(str))).setBuffer(fArr, i);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z) {
        this.f80761f = z;
    }

    public void setFloatUniform(String str, float f) {
        ((C12460b) v80.checkNotNull(this.f80760e.get(str))).setFloat(f);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((C12460b) v80.checkNotNull(this.f80760e.get(str))).setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(String str, float[] fArr) {
        C12460b c12460b = this.f80760e.get(str);
        if (c12460b == null) {
            return;
        }
        c12460b.setFloats(fArr);
    }

    public void setIntUniform(String str, int i) {
        ((C12460b) v80.checkNotNull(this.f80760e.get(str))).setInt(i);
    }

    public void setIntsUniform(String str, int[] iArr) {
        ((C12460b) v80.checkNotNull(this.f80760e.get(str))).setInts(iArr);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        ((C12460b) v80.checkNotNull(this.f80760e.get(str))).setSamplerTexId(i, i2);
    }

    public void use() throws x67.C14938a {
        GLES20.glUseProgram(this.f80756a);
        x67.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.f80756a, str);
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.f80756a, str);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2, int i3) {
        C12460b c12460b = (C12460b) v80.checkNotNull(this.f80760e.get(str));
        c12460b.setSamplerTexId(i, i2);
        c12460b.setTexMinFilter(i3);
    }

    public s67(String str, String str2) throws x67.C14938a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f80756a = iGlCreateProgram;
        x67.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        x67.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f80759d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f80757b = new C12459a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C12459a c12459aCreate = C12459a.create(this.f80756a, i);
            this.f80757b[i] = c12459aCreate;
            this.f80759d.put(c12459aCreate.f80762a, c12459aCreate);
        }
        this.f80760e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f80756a, 35718, iArr3, 0);
        this.f80758c = new C12460b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C12460b c12460bCreate = C12460b.create(this.f80756a, i2);
            this.f80758c[i2] = c12460bCreate;
            this.f80760e.put(c12460bCreate.f80766a, c12460bCreate);
        }
        x67.checkGlError();
    }
}
