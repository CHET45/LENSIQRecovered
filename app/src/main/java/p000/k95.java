package p000;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.p017ws.WebSocketProtocol;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import org.videolan.libvlc.MediaPlayer;
import p000.m95;
import p000.p7e;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public class k95 {

    /* JADX INFO: renamed from: A */
    public static final String f52862A = "Compression";

    /* JADX INFO: renamed from: A0 */
    public static final String f52863A0 = "OECF";

    /* JADX INFO: renamed from: A1 */
    public static final String f52864A1 = "GPSLongitudeRef";

    /* JADX INFO: renamed from: A2 */
    public static final String f52865A2 = "CameraSettingsIFDPointer";

    /* JADX INFO: renamed from: A3 */
    public static final short f52866A3 = 9;

    /* JADX INFO: renamed from: A4 */
    public static final short f52867A4 = 2;

    /* JADX INFO: renamed from: A5 */
    public static final int f52868A5 = 0;

    /* JADX INFO: renamed from: A6 */
    public static final int f52869A6 = 9;

    /* JADX INFO: renamed from: A7 */
    public static final byte f52870A7 = -49;

    /* JADX INFO: renamed from: B */
    public static final String f52871B = "PhotometricInterpretation";

    /* JADX INFO: renamed from: B0 */
    public static final String f52872B0 = "SensitivityType";

    /* JADX INFO: renamed from: B1 */
    public static final String f52873B1 = "GPSLongitude";

    /* JADX INFO: renamed from: B2 */
    public static final String f52874B2 = "ImageProcessingIFDPointer";

    /* JADX INFO: renamed from: B3 */
    public static final short f52875B3 = 10;

    /* JADX INFO: renamed from: B4 */
    public static final short f52876B4 = 3;

    /* JADX INFO: renamed from: B5 */
    public static final int f52877B5 = 1;

    /* JADX INFO: renamed from: B6 */
    public static final int f52878B6 = 10;

    /* JADX INFO: renamed from: B7 */
    public static final byte f52879B7 = -38;

    /* JADX INFO: renamed from: C */
    public static final String f52880C = "Orientation";

    /* JADX INFO: renamed from: C0 */
    public static final String f52881C0 = "StandardOutputSensitivity";

    /* JADX INFO: renamed from: C1 */
    public static final String f52882C1 = "GPSAltitudeRef";

    /* JADX INFO: renamed from: C2 */
    public static final int f52883C2 = 512;

    /* JADX INFO: renamed from: C3 */
    public static final short f52884C3 = 11;

    /* JADX INFO: renamed from: C4 */
    public static final short f52885C4 = 4;

    /* JADX INFO: renamed from: C5 */
    public static final int f52886C5 = 5000;

    /* JADX INFO: renamed from: C6 */
    public static final int f52887C6 = 11;

    /* JADX INFO: renamed from: C7 */
    public static final byte f52888C7 = -31;

    /* JADX INFO: renamed from: D */
    public static final String f52889D = "SamplesPerPixel";

    /* JADX INFO: renamed from: D0 */
    public static final String f52890D0 = "RecommendedExposureIndex";

    /* JADX INFO: renamed from: D1 */
    public static final String f52891D1 = "GPSAltitude";

    /* JADX INFO: renamed from: D2 */
    public static final int f52892D2 = 0;

    /* JADX INFO: renamed from: D3 */
    public static final short f52893D3 = 12;

    /* JADX INFO: renamed from: D4 */
    public static final short f52894D4 = 0;

    /* JADX INFO: renamed from: D6 */
    public static final int f52896D6 = 12;

    /* JADX INFO: renamed from: D7 */
    public static final byte f52897D7 = -2;

    /* JADX INFO: renamed from: E */
    public static final String f52898E = "PlanarConfiguration";

    /* JADX INFO: renamed from: E0 */
    public static final String f52899E0 = "ISOSpeed";

    /* JADX INFO: renamed from: E1 */
    public static final String f52900E1 = "GPSTimeStamp";

    /* JADX INFO: renamed from: E2 */
    public static final int f52901E2 = 1;

    /* JADX INFO: renamed from: E3 */
    public static final short f52902E3 = 13;

    /* JADX INFO: renamed from: E4 */
    public static final short f52903E4 = 1;

    /* JADX INFO: renamed from: E5 */
    public static final String f52904E5 = "FUJIFILMCCD-RAW";

    /* JADX INFO: renamed from: E6 */
    public static final int f52905E6 = 13;

    /* JADX INFO: renamed from: E7 */
    public static final byte f52906E7 = -39;

    /* JADX INFO: renamed from: F */
    public static final String f52907F = "YCbCrSubSampling";

    /* JADX INFO: renamed from: F0 */
    public static final String f52908F0 = "ISOSpeedLatitudeyyy";

    /* JADX INFO: renamed from: F1 */
    public static final String f52909F1 = "GPSSatellites";

    /* JADX INFO: renamed from: F2 */
    public static final int f52910F2 = 2;

    /* JADX INFO: renamed from: F3 */
    public static final short f52911F3 = 14;

    /* JADX INFO: renamed from: F4 */
    public static final short f52912F4 = 2;

    /* JADX INFO: renamed from: F5 */
    public static final int f52913F5 = 84;

    /* JADX INFO: renamed from: F6 */
    public static final int f52914F6 = 8192;

    /* JADX INFO: renamed from: F7 */
    public static final int f52915F7 = 0;

    /* JADX INFO: renamed from: G */
    public static final String f52916G = "YCbCrPositioning";

    /* JADX INFO: renamed from: G0 */
    public static final String f52917G0 = "ISOSpeedLatitudezzz";

    /* JADX INFO: renamed from: G1 */
    public static final String f52918G1 = "GPSStatus";

    /* JADX INFO: renamed from: G2 */
    public static final int f52919G2 = 3;

    /* JADX INFO: renamed from: G3 */
    public static final short f52920G3 = 15;

    /* JADX INFO: renamed from: G4 */
    public static final short f52921G4 = 0;

    /* JADX INFO: renamed from: G7 */
    public static final int f52924G7 = 1;

    /* JADX INFO: renamed from: H */
    public static final String f52925H = "XResolution";

    /* JADX INFO: renamed from: H0 */
    public static final String f52926H0 = "ShutterSpeedValue";

    /* JADX INFO: renamed from: H1 */
    public static final String f52927H1 = "GPSMeasureMode";

    /* JADX INFO: renamed from: H2 */
    public static final int f52928H2 = 4;

    /* JADX INFO: renamed from: H3 */
    public static final short f52929H3 = 16;

    /* JADX INFO: renamed from: H4 */
    public static final short f52930H4 = 0;

    /* JADX INFO: renamed from: H7 */
    public static final int f52933H7 = 2;

    /* JADX INFO: renamed from: I */
    public static final String f52934I = "YResolution";

    /* JADX INFO: renamed from: I0 */
    public static final String f52935I0 = "ApertureValue";

    /* JADX INFO: renamed from: I1 */
    public static final String f52936I1 = "GPSDOP";

    /* JADX INFO: renamed from: I2 */
    public static final int f52937I2 = 5;

    /* JADX INFO: renamed from: I3 */
    public static final short f52938I3 = 17;

    /* JADX INFO: renamed from: I4 */
    public static final short f52939I4 = 0;

    /* JADX INFO: renamed from: I7 */
    public static final int f52942I7 = 3;

    /* JADX INFO: renamed from: J */
    public static final String f52943J = "ResolutionUnit";

    /* JADX INFO: renamed from: J0 */
    public static final String f52944J0 = "BrightnessValue";

    /* JADX INFO: renamed from: J1 */
    public static final String f52945J1 = "GPSSpeedRef";

    /* JADX INFO: renamed from: J2 */
    public static final int f52946J2 = 6;

    /* JADX INFO: renamed from: J3 */
    public static final short f52947J3 = 18;

    /* JADX INFO: renamed from: J4 */
    public static final short f52948J4 = 0;

    /* JADX INFO: renamed from: J5 */
    public static final short f52949J5 = 20306;

    /* JADX INFO: renamed from: J6 */
    public static final C8249f[] f52950J6;

    /* JADX INFO: renamed from: J7 */
    public static final int f52951J7 = 4;

    /* JADX INFO: renamed from: K */
    public static final String f52952K = "StripOffsets";

    /* JADX INFO: renamed from: K0 */
    public static final String f52953K0 = "ExposureBiasValue";

    /* JADX INFO: renamed from: K1 */
    public static final String f52954K1 = "GPSSpeed";

    /* JADX INFO: renamed from: K2 */
    public static final int f52955K2 = 7;

    /* JADX INFO: renamed from: K3 */
    public static final short f52956K3 = 19;

    /* JADX INFO: renamed from: K4 */
    public static final short f52957K4 = 1;

    /* JADX INFO: renamed from: K5 */
    public static final short f52958K5 = 21330;

    /* JADX INFO: renamed from: K6 */
    public static final C8249f[] f52959K6;

    /* JADX INFO: renamed from: K7 */
    public static final int f52960K7 = 5;

    /* JADX INFO: renamed from: L */
    public static final String f52961L = "RowsPerStrip";

    /* JADX INFO: renamed from: L0 */
    public static final String f52962L0 = "MaxApertureValue";

    /* JADX INFO: renamed from: L1 */
    public static final String f52963L1 = "GPSTrackRef";

    /* JADX INFO: renamed from: L2 */
    public static final int f52964L2 = 8;

    /* JADX INFO: renamed from: L3 */
    public static final short f52965L3 = 20;

    /* JADX INFO: renamed from: L4 */
    public static final short f52966L4 = 2;

    /* JADX INFO: renamed from: L6 */
    public static final C8249f[] f52968L6;

    /* JADX INFO: renamed from: L7 */
    public static final int f52969L7 = 6;

    /* JADX INFO: renamed from: M */
    public static final String f52970M = "StripByteCounts";

    /* JADX INFO: renamed from: M0 */
    public static final String f52971M0 = "SubjectDistance";

    /* JADX INFO: renamed from: M1 */
    public static final String f52972M1 = "GPSTrack";

    /* JADX INFO: renamed from: M3 */
    public static final short f52974M3 = 21;

    /* JADX INFO: renamed from: M4 */
    public static final short f52975M4 = 0;

    /* JADX INFO: renamed from: M6 */
    public static final C8249f[] f52977M6;

    /* JADX INFO: renamed from: M7 */
    public static final int f52978M7 = 7;

    /* JADX INFO: renamed from: N */
    public static final String f52979N = "JPEGInterchangeFormat";

    /* JADX INFO: renamed from: N0 */
    public static final String f52980N0 = "MeteringMode";

    /* JADX INFO: renamed from: N1 */
    public static final String f52981N1 = "GPSImgDirectionRef";

    /* JADX INFO: renamed from: N3 */
    public static final short f52983N3 = 22;

    /* JADX INFO: renamed from: N4 */
    public static final short f52984N4 = 1;

    /* JADX INFO: renamed from: N5 */
    public static final int f52985N5 = 8;

    /* JADX INFO: renamed from: N6 */
    public static final C8249f[] f52986N6;

    /* JADX INFO: renamed from: N7 */
    public static final int f52987N7 = 8;

    /* JADX INFO: renamed from: O */
    public static final String f52988O = "JPEGInterchangeFormatLength";

    /* JADX INFO: renamed from: O0 */
    public static final String f52989O0 = "LightSource";

    /* JADX INFO: renamed from: O1 */
    public static final String f52990O1 = "GPSImgDirection";

    /* JADX INFO: renamed from: O2 */
    public static final short f52991O2 = 1;

    /* JADX INFO: renamed from: O3 */
    public static final short f52992O3 = 23;

    /* JADX INFO: renamed from: O4 */
    public static final short f52993O4 = 2;

    /* JADX INFO: renamed from: O5 */
    public static final int f52994O5 = 12;

    /* JADX INFO: renamed from: O6 */
    public static final C8249f f52995O6;

    /* JADX INFO: renamed from: O7 */
    public static final int f52996O7 = 9;

    /* JADX INFO: renamed from: P */
    public static final String f52997P = "TransferFunction";

    /* JADX INFO: renamed from: P0 */
    public static final String f52998P0 = "Flash";

    /* JADX INFO: renamed from: P1 */
    public static final String f52999P1 = "GPSMapDatum";

    /* JADX INFO: renamed from: P2 */
    public static final short f53000P2 = 2;

    /* JADX INFO: renamed from: P3 */
    public static final short f53001P3 = 24;

    /* JADX INFO: renamed from: P4 */
    public static final short f53002P4 = 3;

    /* JADX INFO: renamed from: P5 */
    public static final short f53003P5 = 85;

    /* JADX INFO: renamed from: P6 */
    public static final C8249f[] f53004P6;

    /* JADX INFO: renamed from: P7 */
    public static final int f53005P7 = 10;

    /* JADX INFO: renamed from: Q */
    public static final String f53006Q = "WhitePoint";

    /* JADX INFO: renamed from: Q0 */
    public static final String f53007Q0 = "SubjectArea";

    /* JADX INFO: renamed from: Q1 */
    public static final String f53008Q1 = "GPSDestLatitudeRef";

    /* JADX INFO: renamed from: Q2 */
    public static final short f53009Q2 = 1;

    /* JADX INFO: renamed from: Q3 */
    public static final short f53010Q3 = 255;

    /* JADX INFO: renamed from: Q4 */
    public static final String f53011Q4 = "N";

    /* JADX INFO: renamed from: Q5 */
    public static final String f53012Q5 = "PENTAX";

    /* JADX INFO: renamed from: Q6 */
    public static final C8249f[] f53013Q6;

    /* JADX INFO: renamed from: Q7 */
    public static final int f53014Q7 = 11;

    /* JADX INFO: renamed from: R */
    public static final String f53015R = "PrimaryChromaticities";

    /* JADX INFO: renamed from: R0 */
    public static final String f53016R0 = "FocalLength";

    /* JADX INFO: renamed from: R1 */
    public static final String f53017R1 = "GPSDestLatitude";

    /* JADX INFO: renamed from: R2 */
    public static final short f53018R2 = 2;

    /* JADX INFO: renamed from: R3 */
    public static final short f53019R3 = 1;

    /* JADX INFO: renamed from: R4 */
    public static final String f53020R4 = "S";

    /* JADX INFO: renamed from: R5 */
    public static final int f53021R5 = 6;

    /* JADX INFO: renamed from: R6 */
    public static final C8249f[] f53022R6;

    /* JADX INFO: renamed from: R7 */
    public static final int f53023R7 = 12;

    /* JADX INFO: renamed from: S */
    public static final String f53024S = "YCbCrCoefficients";

    /* JADX INFO: renamed from: S0 */
    public static final String f53025S0 = "FlashEnergy";

    /* JADX INFO: renamed from: S1 */
    public static final String f53026S1 = "GPSDestLongitudeRef";

    /* JADX INFO: renamed from: S2 */
    public static final short f53027S2 = 2;

    /* JADX INFO: renamed from: S3 */
    public static final short f53028S3 = 4;

    /* JADX INFO: renamed from: S4 */
    public static final String f53029S4 = "E";

    /* JADX INFO: renamed from: S6 */
    public static final C8249f[] f53031S6;

    /* JADX INFO: renamed from: S7 */
    public static final int f53032S7 = 13;

    /* JADX INFO: renamed from: T */
    public static final String f53033T = "ReferenceBlackWhite";

    /* JADX INFO: renamed from: T0 */
    public static final String f53034T0 = "SpatialFrequencyResponse";

    /* JADX INFO: renamed from: T1 */
    public static final String f53035T1 = "GPSDestLongitude";

    /* JADX INFO: renamed from: T2 */
    public static final short f53036T2 = 3;

    /* JADX INFO: renamed from: T3 */
    public static final short f53037T3 = 6;

    /* JADX INFO: renamed from: T4 */
    public static final String f53038T4 = "W";

    /* JADX INFO: renamed from: T6 */
    public static final int f53040T6 = 0;

    /* JADX INFO: renamed from: T7 */
    public static final int f53041T7 = 14;

    /* JADX INFO: renamed from: U */
    public static final String f53042U = "DateTime";

    /* JADX INFO: renamed from: U0 */
    public static final String f53043U0 = "FocalPlaneXResolution";

    /* JADX INFO: renamed from: U1 */
    public static final String f53044U1 = "GPSDestBearingRef";

    /* JADX INFO: renamed from: U2 */
    public static final int f53045U2 = 1;

    /* JADX INFO: renamed from: U3 */
    public static final short f53046U3 = 8;

    /* JADX INFO: renamed from: U4 */
    public static final short f53047U4 = 0;

    /* JADX INFO: renamed from: U6 */
    public static final int f53049U6 = 1;

    /* JADX INFO: renamed from: U7 */
    public static final Pattern f53050U7;

    /* JADX INFO: renamed from: V */
    public static final String f53051V = "ImageDescription";

    /* JADX INFO: renamed from: V0 */
    public static final String f53052V0 = "FocalPlaneYResolution";

    /* JADX INFO: renamed from: V1 */
    public static final String f53053V1 = "GPSDestBearing";

    /* JADX INFO: renamed from: V2 */
    public static final int f53054V2 = 65535;

    /* JADX INFO: renamed from: V3 */
    public static final short f53055V3 = 16;

    /* JADX INFO: renamed from: V4 */
    public static final short f53056V4 = 1;

    /* JADX INFO: renamed from: V6 */
    public static final int f53058V6 = 2;

    /* JADX INFO: renamed from: V7 */
    public static final Pattern f53059V7;

    /* JADX INFO: renamed from: W */
    public static final String f53060W = "Make";

    /* JADX INFO: renamed from: W0 */
    public static final String f53061W0 = "FocalPlaneResolutionUnit";

    /* JADX INFO: renamed from: W1 */
    public static final String f53062W1 = "GPSDestDistanceRef";

    /* JADX INFO: renamed from: W2 */
    public static final short f53063W2 = 0;

    /* JADX INFO: renamed from: W3 */
    public static final short f53064W3 = 24;

    /* JADX INFO: renamed from: W4 */
    public static final String f53065W4 = "A";

    /* JADX INFO: renamed from: W5 */
    public static final int f53066W5 = 4;

    /* JADX INFO: renamed from: W6 */
    public static final int f53067W6 = 3;

    /* JADX INFO: renamed from: W7 */
    public static final Pattern f53068W7;

    /* JADX INFO: renamed from: X */
    public static final String f53069X = "Model";

    /* JADX INFO: renamed from: X0 */
    public static final String f53070X0 = "SubjectLocation";

    /* JADX INFO: renamed from: X1 */
    public static final String f53071X1 = "GPSDestDistance";

    /* JADX INFO: renamed from: X2 */
    public static final short f53072X2 = 1;

    /* JADX INFO: renamed from: X3 */
    public static final short f53073X3 = 32;

    /* JADX INFO: renamed from: X4 */
    public static final String f53074X4 = "V";

    /* JADX INFO: renamed from: X5 */
    public static final int f53075X5 = 4;

    /* JADX INFO: renamed from: X6 */
    public static final int f53076X6 = 4;

    /* JADX INFO: renamed from: X7 */
    public static final Pattern f53077X7;

    /* JADX INFO: renamed from: Y */
    public static final String f53078Y = "Software";

    /* JADX INFO: renamed from: Y0 */
    public static final String f53079Y0 = "ExposureIndex";

    /* JADX INFO: renamed from: Y1 */
    public static final String f53080Y1 = "GPSProcessingMethod";

    /* JADX INFO: renamed from: Y2 */
    public static final short f53081Y2 = 2;

    /* JADX INFO: renamed from: Y3 */
    public static final short f53082Y3 = 64;

    /* JADX INFO: renamed from: Y4 */
    public static final String f53083Y4 = "2";

    /* JADX INFO: renamed from: Y6 */
    public static final int f53085Y6 = 5;

    /* JADX INFO: renamed from: Y7 */
    public static final int f53086Y7 = 19;

    /* JADX INFO: renamed from: Z */
    public static final String f53087Z = "Artist";

    /* JADX INFO: renamed from: Z0 */
    public static final String f53088Z0 = "SensingMethod";

    /* JADX INFO: renamed from: Z1 */
    public static final String f53089Z1 = "GPSAreaInformation";

    /* JADX INFO: renamed from: Z2 */
    public static final short f53090Z2 = 3;

    /* JADX INFO: renamed from: Z3 */
    public static final short f53091Z3 = 1;

    /* JADX INFO: renamed from: Z4 */
    public static final String f53092Z4 = "3";

    /* JADX INFO: renamed from: Z6 */
    public static final int f53094Z6 = 6;

    /* JADX INFO: renamed from: a0 */
    public static final String f53095a0 = "Copyright";

    /* JADX INFO: renamed from: a1 */
    public static final String f53096a1 = "FileSource";

    /* JADX INFO: renamed from: a2 */
    public static final String f53097a2 = "GPSDateStamp";

    /* JADX INFO: renamed from: a3 */
    public static final short f53098a3 = 4;

    /* JADX INFO: renamed from: a4 */
    public static final short f53099a4 = 2;

    /* JADX INFO: renamed from: a5 */
    public static final String f53100a5 = "K";

    /* JADX INFO: renamed from: a6 */
    public static final int f53101a6 = 4;

    /* JADX INFO: renamed from: a7 */
    public static final int f53102a7 = 7;

    /* JADX INFO: renamed from: b0 */
    public static final String f53103b0 = "ExifVersion";

    /* JADX INFO: renamed from: b1 */
    public static final String f53104b1 = "SceneType";

    /* JADX INFO: renamed from: b2 */
    public static final String f53105b2 = "GPSDifferential";

    /* JADX INFO: renamed from: b3 */
    public static final short f53106b3 = 5;

    /* JADX INFO: renamed from: b4 */
    public static final short f53107b4 = 3;

    /* JADX INFO: renamed from: b5 */
    public static final String f53108b5 = "M";

    /* JADX INFO: renamed from: b7 */
    public static final int f53110b7 = 8;

    /* JADX INFO: renamed from: c0 */
    public static final String f53111c0 = "FlashpixVersion";

    /* JADX INFO: renamed from: c1 */
    public static final String f53112c1 = "CFAPattern";

    /* JADX INFO: renamed from: c2 */
    public static final String f53113c2 = "GPSHPositioningError";

    /* JADX INFO: renamed from: c3 */
    public static final short f53114c3 = 6;

    /* JADX INFO: renamed from: c4 */
    public static final short f53115c4 = 4;

    /* JADX INFO: renamed from: c5 */
    public static final String f53116c5 = "N";

    /* JADX INFO: renamed from: c7 */
    public static final int f53118c7 = 9;

    /* JADX INFO: renamed from: d0 */
    public static final String f53119d0 = "ColorSpace";

    /* JADX INFO: renamed from: d1 */
    public static final String f53120d1 = "CustomRendered";

    /* JADX INFO: renamed from: d2 */
    public static final String f53121d2 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: d3 */
    public static final short f53122d3 = 7;

    /* JADX INFO: renamed from: d4 */
    public static final short f53123d4 = 5;

    /* JADX INFO: renamed from: d5 */
    public static final String f53124d5 = "T";

    /* JADX INFO: renamed from: d6 */
    public static final byte f53125d6 = 47;

    /* JADX INFO: renamed from: d7 */
    public static final C8249f[][] f53126d7;

    /* JADX INFO: renamed from: e0 */
    public static final String f53127e0 = "Gamma";

    /* JADX INFO: renamed from: e1 */
    public static final String f53128e1 = "ExposureMode";

    /* JADX INFO: renamed from: e2 */
    public static final String f53129e2 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: e3 */
    public static final short f53130e3 = 8;

    /* JADX INFO: renamed from: e4 */
    public static final short f53131e4 = 7;

    /* JADX INFO: renamed from: e5 */
    public static final String f53132e5 = "M";

    /* JADX INFO: renamed from: e7 */
    public static final C8249f[] f53134e7;

    /* JADX INFO: renamed from: f0 */
    public static final String f53135f0 = "PixelXDimension";

    /* JADX INFO: renamed from: f1 */
    public static final String f53136f1 = "WhiteBalance";

    /* JADX INFO: renamed from: f2 */
    public static final String f53137f2 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: f3 */
    public static final short f53138f3 = 0;

    /* JADX INFO: renamed from: f4 */
    public static final short f53139f4 = 8;

    /* JADX INFO: renamed from: f5 */
    public static final String f53140f5 = "K";

    /* JADX INFO: renamed from: f7 */
    public static final HashMap<Integer, C8249f>[] f53142f7;

    /* JADX INFO: renamed from: g0 */
    public static final String f53143g0 = "PixelYDimension";

    /* JADX INFO: renamed from: g1 */
    public static final String f53144g1 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: g2 */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f53145g2 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: g3 */
    public static final short f53146g3 = 1;

    /* JADX INFO: renamed from: g4 */
    public static final short f53147g4 = 0;

    /* JADX INFO: renamed from: g5 */
    public static final String f53148g5 = "M";

    /* JADX INFO: renamed from: g7 */
    public static final HashMap<String, C8249f>[] f53150g7;

    /* JADX INFO: renamed from: h0 */
    public static final String f53151h0 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: h1 */
    public static final String f53152h1 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: h2 */
    public static final String f53153h2 = "DNGVersion";

    /* JADX INFO: renamed from: h3 */
    public static final short f53154h3 = 2;

    /* JADX INFO: renamed from: h4 */
    public static final short f53155h4 = 1;

    /* JADX INFO: renamed from: h5 */
    public static final String f53156h5 = "N";

    /* JADX INFO: renamed from: h7 */
    public static final HashSet<String> f53158h7;

    /* JADX INFO: renamed from: i0 */
    public static final String f53159i0 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: i1 */
    public static final String f53160i1 = "SceneCaptureType";

    /* JADX INFO: renamed from: i2 */
    public static final String f53161i2 = "DefaultCropSize";

    /* JADX INFO: renamed from: i3 */
    public static final short f53162i3 = 3;

    /* JADX INFO: renamed from: i4 */
    public static final short f53163i4 = 2;

    /* JADX INFO: renamed from: i5 */
    public static final short f53164i5 = 0;

    /* JADX INFO: renamed from: i7 */
    public static final HashMap<Integer, Integer> f53166i7;

    /* JADX INFO: renamed from: j0 */
    public static final String f53167j0 = "MakerNote";

    /* JADX INFO: renamed from: j1 */
    public static final String f53168j1 = "GainControl";

    /* JADX INFO: renamed from: j2 */
    public static final String f53169j2 = "ThumbnailImage";

    /* JADX INFO: renamed from: j3 */
    public static final short f53170j3 = 4;

    /* JADX INFO: renamed from: j4 */
    public static final short f53171j4 = 3;

    /* JADX INFO: renamed from: j5 */
    public static final short f53172j5 = 1;

    /* JADX INFO: renamed from: j6 */
    public static final int f53173j6 = 10;

    /* JADX INFO: renamed from: j7 */
    public static final Charset f53174j7;

    /* JADX INFO: renamed from: k0 */
    public static final String f53175k0 = "UserComment";

    /* JADX INFO: renamed from: k1 */
    public static final String f53176k1 = "Contrast";

    /* JADX INFO: renamed from: k2 */
    public static final String f53177k2 = "PreviewImageStart";

    /* JADX INFO: renamed from: k3 */
    public static final short f53178k3 = 5;

    /* JADX INFO: renamed from: k4 */
    public static final short f53179k4 = 1;

    /* JADX INFO: renamed from: k5 */
    public static final int f53180k5 = 1;

    /* JADX INFO: renamed from: k6 */
    public static final int f53181k6 = 4;

    /* JADX INFO: renamed from: k7 */
    public static final byte[] f53182k7;

    /* JADX INFO: renamed from: l0 */
    public static final String f53183l0 = "RelatedSoundFile";

    /* JADX INFO: renamed from: l1 */
    public static final String f53184l1 = "Saturation";

    /* JADX INFO: renamed from: l2 */
    public static final String f53185l2 = "PreviewImageLength";

    /* JADX INFO: renamed from: l3 */
    public static final short f53186l3 = 6;

    /* JADX INFO: renamed from: l4 */
    public static final short f53187l4 = 0;

    /* JADX INFO: renamed from: l5 */
    public static final int f53188l5 = 2;

    /* JADX INFO: renamed from: l6 */
    public static final int f53189l6 = 4;

    /* JADX INFO: renamed from: l7 */
    public static final byte[] f53190l7;

    /* JADX INFO: renamed from: m0 */
    public static final String f53191m0 = "DateTimeOriginal";

    /* JADX INFO: renamed from: m1 */
    public static final String f53192m1 = "Sharpness";

    /* JADX INFO: renamed from: m2 */
    public static final String f53193m2 = "AspectFrame";

    /* JADX INFO: renamed from: m3 */
    public static final short f53194m3 = 7;

    /* JADX INFO: renamed from: m4 */
    public static final short f53195m4 = 1;

    /* JADX INFO: renamed from: m5 */
    public static final int f53196m5 = 6;

    /* JADX INFO: renamed from: m6 */
    public static SimpleDateFormat f53197m6 = null;

    /* JADX INFO: renamed from: m7 */
    public static final byte f53198m7 = -1;

    /* JADX INFO: renamed from: n0 */
    public static final String f53199n0 = "DateTimeDigitized";

    /* JADX INFO: renamed from: n1 */
    public static final String f53200n1 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: n2 */
    public static final String f53201n2 = "SensorBottomBorder";

    /* JADX INFO: renamed from: n3 */
    public static final short f53202n3 = 0;

    /* JADX INFO: renamed from: n4 */
    public static final short f53203n4 = 0;

    /* JADX INFO: renamed from: n5 */
    public static final int f53204n5 = 7;

    /* JADX INFO: renamed from: n6 */
    public static SimpleDateFormat f53205n6 = null;

    /* JADX INFO: renamed from: o0 */
    public static final String f53207o0 = "OffsetTime";

    /* JADX INFO: renamed from: o1 */
    public static final String f53208o1 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: o2 */
    public static final String f53209o2 = "SensorLeftBorder";

    /* JADX INFO: renamed from: o3 */
    public static final short f53210o3 = 1;

    /* JADX INFO: renamed from: o4 */
    public static final short f53211o4 = 1;

    /* JADX INFO: renamed from: o5 */
    public static final int f53212o5 = 8;

    /* JADX INFO: renamed from: o6 */
    public static final short f53213o6 = 18761;

    /* JADX INFO: renamed from: o7 */
    public static final byte f53214o7 = -64;

    /* JADX INFO: renamed from: p0 */
    public static final String f53215p0 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: p1 */
    public static final String f53216p1 = "ImageUniqueID";

    /* JADX INFO: renamed from: p2 */
    public static final String f53217p2 = "SensorRightBorder";

    /* JADX INFO: renamed from: p3 */
    public static final short f53218p3 = 2;

    /* JADX INFO: renamed from: p4 */
    public static final short f53219p4 = 2;

    /* JADX INFO: renamed from: p5 */
    public static final int f53220p5 = 32773;

    /* JADX INFO: renamed from: p6 */
    public static final short f53221p6 = 19789;

    /* JADX INFO: renamed from: p7 */
    public static final byte f53222p7 = -63;

    /* JADX INFO: renamed from: q0 */
    public static final String f53223q0 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: q1 */
    @Deprecated
    public static final String f53224q1 = "CameraOwnerName";

    /* JADX INFO: renamed from: q2 */
    public static final String f53225q2 = "SensorTopBorder";

    /* JADX INFO: renamed from: q3 */
    public static final short f53226q3 = 3;

    /* JADX INFO: renamed from: q4 */
    @Deprecated
    public static final int f53227q4 = 0;

    /* JADX INFO: renamed from: q5 */
    public static final int f53228q5 = 34892;

    /* JADX INFO: renamed from: q6 */
    public static final byte f53229q6 = 42;

    /* JADX INFO: renamed from: q7 */
    public static final byte f53230q7 = -62;

    /* JADX INFO: renamed from: r0 */
    public static final String f53231r0 = "SubSecTime";

    /* JADX INFO: renamed from: r1 */
    public static final String f53232r1 = "CameraOwnerName";

    /* JADX INFO: renamed from: r2 */
    public static final String f53233r2 = "ISO";

    /* JADX INFO: renamed from: r3 */
    public static final short f53234r3 = 4;

    /* JADX INFO: renamed from: r4 */
    @Deprecated
    public static final int f53235r4 = 1;

    /* JADX INFO: renamed from: r6 */
    public static final int f53237r6 = 8;

    /* JADX INFO: renamed from: r7 */
    public static final byte f53238r7 = -61;

    /* JADX INFO: renamed from: s0 */
    public static final String f53239s0 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: s1 */
    public static final String f53240s1 = "BodySerialNumber";

    /* JADX INFO: renamed from: s2 */
    public static final String f53241s2 = "JpgFromRaw";

    /* JADX INFO: renamed from: s3 */
    public static final short f53242s3 = 5;

    /* JADX INFO: renamed from: s4 */
    public static final short f53243s4 = 0;

    /* JADX INFO: renamed from: s6 */
    public static final int f53245s6 = 1;

    /* JADX INFO: renamed from: s7 */
    public static final byte f53246s7 = -59;

    /* JADX INFO: renamed from: t0 */
    public static final String f53247t0 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: t1 */
    public static final String f53248t1 = "LensSpecification";

    /* JADX INFO: renamed from: t2 */
    public static final String f53249t2 = "Xmp";

    /* JADX INFO: renamed from: t3 */
    public static final short f53250t3 = 6;

    /* JADX INFO: renamed from: t4 */
    public static final short f53251t4 = 1;

    /* JADX INFO: renamed from: t6 */
    public static final int f53253t6 = 2;

    /* JADX INFO: renamed from: t7 */
    public static final byte f53254t7 = -58;

    /* JADX INFO: renamed from: u0 */
    public static final String f53255u0 = "ExposureTime";

    /* JADX INFO: renamed from: u1 */
    public static final String f53256u1 = "LensMake";

    /* JADX INFO: renamed from: u2 */
    public static final String f53257u2 = "NewSubfileType";

    /* JADX INFO: renamed from: u3 */
    public static final short f53258u3 = 255;

    /* JADX INFO: renamed from: u4 */
    public static final short f53259u4 = 0;

    /* JADX INFO: renamed from: u5 */
    public static final int f53260u5 = 0;

    /* JADX INFO: renamed from: u6 */
    public static final int f53261u6 = 3;

    /* JADX INFO: renamed from: u7 */
    public static final byte f53262u7 = -57;

    /* JADX INFO: renamed from: v0 */
    public static final String f53264v0 = "FNumber";

    /* JADX INFO: renamed from: v1 */
    public static final String f53265v1 = "LensModel";

    /* JADX INFO: renamed from: v2 */
    public static final String f53266v2 = "SubfileType";

    /* JADX INFO: renamed from: v3 */
    public static final short f53267v3 = 0;

    /* JADX INFO: renamed from: v4 */
    public static final short f53268v4 = 1;

    /* JADX INFO: renamed from: v5 */
    public static final int f53269v5 = 1;

    /* JADX INFO: renamed from: v6 */
    public static final int f53270v6 = 4;

    /* JADX INFO: renamed from: v7 */
    public static final byte f53271v7 = -55;

    /* JADX INFO: renamed from: w0 */
    public static final String f53273w0 = "ExposureProgram";

    /* JADX INFO: renamed from: w1 */
    public static final String f53274w1 = "LensSerialNumber";

    /* JADX INFO: renamed from: w2 */
    public static final String f53275w2 = "ExifIFDPointer";

    /* JADX INFO: renamed from: w3 */
    public static final short f53276w3 = 1;

    /* JADX INFO: renamed from: w4 */
    public static final short f53277w4 = 2;

    /* JADX INFO: renamed from: w5 */
    public static final int f53278w5 = 2;

    /* JADX INFO: renamed from: w6 */
    public static final int f53279w6 = 5;

    /* JADX INFO: renamed from: w7 */
    public static final byte f53280w7 = -54;

    /* JADX INFO: renamed from: x */
    public static final String f53281x = "ImageWidth";

    /* JADX INFO: renamed from: x0 */
    public static final String f53282x0 = "SpectralSensitivity";

    /* JADX INFO: renamed from: x1 */
    public static final String f53283x1 = "GPSVersionID";

    /* JADX INFO: renamed from: x2 */
    public static final String f53284x2 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: x3 */
    public static final short f53285x3 = 2;

    /* JADX INFO: renamed from: x4 */
    public static final short f53286x4 = 3;

    /* JADX INFO: renamed from: x5 */
    public static final int f53287x5 = 6;

    /* JADX INFO: renamed from: x6 */
    public static final int f53288x6 = 6;

    /* JADX INFO: renamed from: x7 */
    public static final byte f53289x7 = -53;

    /* JADX INFO: renamed from: y */
    public static final String f53290y = "ImageLength";

    /* JADX INFO: renamed from: y0 */
    @Deprecated
    public static final String f53291y0 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: y1 */
    public static final String f53292y1 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: y2 */
    public static final String f53293y2 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: y3 */
    public static final short f53294y3 = 3;

    /* JADX INFO: renamed from: y4 */
    public static final short f53295y4 = 0;

    /* JADX INFO: renamed from: y5 */
    public static final int f53296y5 = 0;

    /* JADX INFO: renamed from: y6 */
    public static final int f53297y6 = 7;

    /* JADX INFO: renamed from: y7 */
    public static final byte f53298y7 = -51;

    /* JADX INFO: renamed from: z */
    public static final String f53299z = "BitsPerSample";

    /* JADX INFO: renamed from: z0 */
    public static final String f53300z0 = "PhotographicSensitivity";

    /* JADX INFO: renamed from: z1 */
    public static final String f53301z1 = "GPSLatitude";

    /* JADX INFO: renamed from: z2 */
    public static final String f53302z2 = "SubIFDPointer";

    /* JADX INFO: renamed from: z3 */
    public static final short f53303z3 = 4;

    /* JADX INFO: renamed from: z4 */
    public static final short f53304z4 = 1;

    /* JADX INFO: renamed from: z5 */
    public static final int f53305z5 = 1;

    /* JADX INFO: renamed from: z6 */
    public static final int f53306z6 = 8;

    /* JADX INFO: renamed from: z7 */
    public static final byte f53307z7 = -50;

    /* JADX INFO: renamed from: a */
    public String f53308a;

    /* JADX INFO: renamed from: b */
    public FileDescriptor f53309b;

    /* JADX INFO: renamed from: c */
    public AssetManager.AssetInputStream f53310c;

    /* JADX INFO: renamed from: d */
    public int f53311d;

    /* JADX INFO: renamed from: e */
    public boolean f53312e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, C8247d>[] f53313f;

    /* JADX INFO: renamed from: g */
    public Set<Integer> f53314g;

    /* JADX INFO: renamed from: h */
    public ByteOrder f53315h;

    /* JADX INFO: renamed from: i */
    public boolean f53316i;

    /* JADX INFO: renamed from: j */
    public boolean f53317j;

    /* JADX INFO: renamed from: k */
    public boolean f53318k;

    /* JADX INFO: renamed from: l */
    public int f53319l;

    /* JADX INFO: renamed from: m */
    public int f53320m;

    /* JADX INFO: renamed from: n */
    public byte[] f53321n;

    /* JADX INFO: renamed from: o */
    public int f53322o;

    /* JADX INFO: renamed from: p */
    public int f53323p;

    /* JADX INFO: renamed from: q */
    public int f53324q;

    /* JADX INFO: renamed from: r */
    public int f53325r;

    /* JADX INFO: renamed from: s */
    public int f53326s;

    /* JADX INFO: renamed from: t */
    public boolean f53327t;

    /* JADX INFO: renamed from: u */
    public boolean f53328u;

    /* JADX INFO: renamed from: v */
    public static final String f53263v = "ExifInterface";

    /* JADX INFO: renamed from: w */
    public static final boolean f53272w = Log.isLoggable(f53263v, 3);

    /* JADX INFO: renamed from: M2 */
    public static final List<Integer> f52973M2 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: N2 */
    public static final List<Integer> f52982N2 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: r5 */
    public static final int[] f53236r5 = {8, 8, 8};

    /* JADX INFO: renamed from: s5 */
    public static final int[] f53244s5 = {4};

    /* JADX INFO: renamed from: t5 */
    public static final int[] f53252t5 = {8};

    /* JADX INFO: renamed from: n7 */
    public static final byte f53206n7 = -40;

    /* JADX INFO: renamed from: D5 */
    public static final byte[] f52895D5 = {-1, f53206n7, -1};

    /* JADX INFO: renamed from: G5 */
    public static final byte[] f52922G5 = {BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions};

    /* JADX INFO: renamed from: H5 */
    public static final byte[] f52931H5 = {BuiltinOptions.HashtableImportOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, 49};

    /* JADX INFO: renamed from: I5 */
    public static final byte[] f52940I5 = {BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions};

    /* JADX INFO: renamed from: L5 */
    public static final byte[] f52967L5 = {BuiltinOptions.SplitVOptions, 76, BuiltinOptions.QuantizeOptions, 77, BuiltinOptions.UniqueOptions, 0};

    /* JADX INFO: renamed from: M5 */
    public static final byte[] f52976M5 = {BuiltinOptions.SplitVOptions, 76, BuiltinOptions.QuantizeOptions, 77, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, 83, 0, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions};

    /* JADX INFO: renamed from: S5 */
    public static final byte[] f53030S5 = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};

    /* JADX INFO: renamed from: T5 */
    public static final byte[] f53039T5 = {BuiltinOptions.BatchMatMulOptions, 88, BuiltinOptions.RangeOptions, BuiltinOptions.CumsumOptions};

    /* JADX INFO: renamed from: U5 */
    public static final byte[] f53048U5 = {BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions};

    /* JADX INFO: renamed from: V5 */
    public static final byte[] f53057V5 = {BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions};

    /* JADX INFO: renamed from: Y5 */
    public static final byte[] f53084Y5 = {BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};

    /* JADX INFO: renamed from: Z5 */
    public static final byte[] f53093Z5 = {BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.UniqueOptions};

    /* JADX INFO: renamed from: b6 */
    public static final byte[] f53109b6 = {BuiltinOptions.BidirectionalSequenceLSTMOptions, 88, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};

    /* JADX INFO: renamed from: c6 */
    public static final byte[] f53117c6 = {-99, 1, 42};

    /* JADX INFO: renamed from: e6 */
    public static final byte[] f53133e6 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: f6 */
    public static final byte[] f53141f6 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: g6 */
    public static final byte[] f53149g6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: h6 */
    public static final byte[] f53157h6 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: i6 */
    public static final byte[] f53165i6 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: G6 */
    public static final String[] f52923G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: H6 */
    public static final int[] f52932H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: I6 */
    public static final byte[] f52941I6 = {BuiltinOptions.FloorDivOptions, 83, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, 0, 0, 0};

    /* JADX INFO: renamed from: k95$a */
    public class C8244a extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        public long f53329a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8252i f53330b;

        public C8244a(C8252i c8252i) {
            this.f53330b = c8252i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f53329a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f53330b.available())) {
                        return -1;
                    }
                    this.f53330b.seek(j);
                    this.f53329a = j;
                }
                if (i2 > this.f53330b.available()) {
                    i2 = this.f53330b.available();
                }
                int i3 = this.f53330b.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f53329a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f53329a = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: k95$b */
    public static class C8245b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e */
        public static final ByteOrder f53332e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f */
        public static final ByteOrder f53333f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a */
        public final DataInputStream f53334a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f53335b;

        /* JADX INFO: renamed from: c */
        public int f53336c;

        /* JADX INFO: renamed from: d */
        public byte[] f53337d;

        public C8245b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f53334a.available();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int position() {
            return this.f53336c;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f53336c++;
            return this.f53334a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f53336c++;
            return this.f53334a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f53336c++;
            int i = this.f53334a.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f53336c += 2;
            return this.f53334a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f53336c += i2;
            this.f53334a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f53336c += 4;
            int i = this.f53334a.read();
            int i2 = this.f53334a.read();
            int i3 = this.f53334a.read();
            int i4 = this.f53334a.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f53335b;
            if (byteOrder == f53332e) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f53333f) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f53335b);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f53336c += 8;
            int i = this.f53334a.read();
            int i2 = this.f53334a.read();
            int i3 = this.f53334a.read();
            int i4 = this.f53334a.read();
            int i5 = this.f53334a.read();
            int i6 = this.f53334a.read();
            int i7 = this.f53334a.read();
            int i8 = this.f53334a.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f53335b;
            if (byteOrder == f53332e) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f53333f) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            throw new IOException("Invalid byte order: " + this.f53335b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f53336c += 2;
            int i = this.f53334a.read();
            int i2 = this.f53334a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f53335b;
            if (byteOrder == f53332e) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f53333f) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f53335b);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f53336c += 2;
            return this.f53334a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f53336c++;
            return this.f53334a.readUnsignedByte();
        }

        public long readUnsignedInt() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f53336c += 2;
            int i = this.f53334a.read();
            int i2 = this.f53334a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f53335b;
            if (byteOrder == f53332e) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f53333f) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f53335b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f53335b = byteOrder;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void skipFully(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f53334a.skip(i3);
                if (iSkip <= 0) {
                    if (this.f53337d == null) {
                        this.f53337d = new byte[8192];
                    }
                    iSkip = this.f53334a.read(this.f53337d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.f53336c += i2;
        }

        public C8245b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C8245b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f53335b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f53334a = dataInputStream;
            dataInputStream.mark(0);
            this.f53336c = 0;
            this.f53335b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f53334a.read(bArr, i, i2);
            this.f53336c += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f53336c += bArr.length;
            this.f53334a.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: k95$c */
    public static class C8246c extends FilterOutputStream {

        /* JADX INFO: renamed from: a */
        public final OutputStream f53338a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f53339b;

        public C8246c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f53338a = outputStream;
            this.f53339b = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f53339b = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f53338a.write(bArr);
        }

        public void writeByte(int i) throws IOException {
            this.f53338a.write(i);
        }

        public void writeInt(int i) throws IOException {
            ByteOrder byteOrder = this.f53339b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f53338a.write(i & 255);
                this.f53338a.write((i >>> 8) & 255);
                this.f53338a.write((i >>> 16) & 255);
                this.f53338a.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f53338a.write((i >>> 24) & 255);
                this.f53338a.write((i >>> 16) & 255);
                this.f53338a.write((i >>> 8) & 255);
                this.f53338a.write(i & 255);
            }
        }

        public void writeShort(short s) throws IOException {
            ByteOrder byteOrder = this.f53339b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f53338a.write(s & 255);
                this.f53338a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f53338a.write((s >>> 8) & 255);
                this.f53338a.write(s & 255);
            }
        }

        public void writeUnsignedInt(long j) throws IOException {
            writeInt((int) j);
        }

        public void writeUnsignedShort(int i) throws IOException {
            writeShort((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f53338a.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: k95$d */
    public static class C8247d {

        /* JADX INFO: renamed from: e */
        public static final long f53340e = -1;

        /* JADX INFO: renamed from: a */
        public final int f53341a;

        /* JADX INFO: renamed from: b */
        public final int f53342b;

        /* JADX INFO: renamed from: c */
        public final long f53343c;

        /* JADX INFO: renamed from: d */
        public final byte[] f53344d;

        public C8247d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static C8247d createByte(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C8247d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(k95.f53174j7);
            return new C8247d(1, bytes.length, bytes);
        }

        public static C8247d createDouble(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new C8247d(12, dArr.length, byteBufferWrap.array());
        }

        public static C8247d createSLong(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new C8247d(9, iArr.length, byteBufferWrap.array());
        }

        public static C8247d createSRational(C8251h[] c8251hArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[10] * c8251hArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C8251h c8251h : c8251hArr) {
                byteBufferWrap.putInt((int) c8251h.f53349a);
                byteBufferWrap.putInt((int) c8251h.f53350b);
            }
            return new C8247d(10, c8251hArr.length, byteBufferWrap.array());
        }

        public static C8247d createString(String str) {
            byte[] bytes = (str + (char) 0).getBytes(k95.f53174j7);
            return new C8247d(2, bytes.length, bytes);
        }

        public static C8247d createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new C8247d(4, jArr.length, byteBufferWrap.array());
        }

        public static C8247d createURational(C8251h[] c8251hArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[5] * c8251hArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C8251h c8251h : c8251hArr) {
                byteBufferWrap.putInt((int) c8251h.f53349a);
                byteBufferWrap.putInt((int) c8251h.f53350b);
            }
            return new C8247d(5, c8251hArr.length, byteBufferWrap.array());
        }

        public static C8247d createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[k95.f52932H6[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new C8247d(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object m14600a(java.nio.ByteOrder r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.k95.C8247d.m14600a(java.nio.ByteOrder):java.lang.Object");
        }

        public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
            Object objM14600a = m14600a(byteOrder);
            if (objM14600a == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM14600a instanceof String) {
                return Double.parseDouble((String) objM14600a);
            }
            if (objM14600a instanceof long[]) {
                if (((long[]) objM14600a).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM14600a instanceof int[]) {
                if (((int[]) objM14600a).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM14600a instanceof double[]) {
                double[] dArr = (double[]) objM14600a;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM14600a instanceof C8251h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            C8251h[] c8251hArr = (C8251h[]) objM14600a;
            if (c8251hArr.length == 1) {
                return c8251hArr[0].calculate();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int getIntValue(ByteOrder byteOrder) throws Throwable {
            Object objM14600a = m14600a(byteOrder);
            if (objM14600a == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM14600a instanceof String) {
                return Integer.parseInt((String) objM14600a);
            }
            if (objM14600a instanceof long[]) {
                long[] jArr = (long[]) objM14600a;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM14600a instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM14600a;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String getStringValue(ByteOrder byteOrder) throws Throwable {
            Object objM14600a = m14600a(byteOrder);
            if (objM14600a == null) {
                return null;
            }
            if (objM14600a instanceof String) {
                return (String) objM14600a;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM14600a instanceof long[]) {
                long[] jArr = (long[]) objM14600a;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM14600a instanceof int[]) {
                int[] iArr = (int[]) objM14600a;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM14600a instanceof double[]) {
                double[] dArr = (double[]) objM14600a;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM14600a instanceof C8251h[])) {
                return null;
            }
            C8251h[] c8251hArr = (C8251h[]) objM14600a;
            while (i < c8251hArr.length) {
                sb.append(c8251hArr[i].f53349a);
                sb.append('/');
                sb.append(c8251hArr[i].f53350b);
                i++;
                if (i != c8251hArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public int size() {
            return k95.f52932H6[this.f53341a] * this.f53342b;
        }

        public String toString() {
            return c0b.f15433c + k95.f52923G6[this.f53341a] + ", data length:" + this.f53344d.length + c0b.f15434d;
        }

        public C8247d(int i, int i2, long j, byte[] bArr) {
            this.f53341a = i;
            this.f53342b = i2;
            this.f53343c = j;
            this.f53344d = bArr;
        }

        public static C8247d createDouble(double d, ByteOrder byteOrder) {
            return createDouble(new double[]{d}, byteOrder);
        }

        public static C8247d createSLong(int i, ByteOrder byteOrder) {
            return createSLong(new int[]{i}, byteOrder);
        }

        public static C8247d createULong(long j, ByteOrder byteOrder) {
            return createULong(new long[]{j}, byteOrder);
        }

        public static C8247d createUShort(int i, ByteOrder byteOrder) {
            return createUShort(new int[]{i}, byteOrder);
        }

        public static C8247d createSRational(C8251h c8251h, ByteOrder byteOrder) {
            return createSRational(new C8251h[]{c8251h}, byteOrder);
        }

        public static C8247d createURational(C8251h c8251h, ByteOrder byteOrder) {
            return createURational(new C8251h[]{c8251h}, byteOrder);
        }
    }

    /* JADX INFO: renamed from: k95$e */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC8248e {
    }

    /* JADX INFO: renamed from: k95$g */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC8250g {
    }

    /* JADX INFO: renamed from: k95$h */
    public static class C8251h {

        /* JADX INFO: renamed from: a */
        public final long f53349a;

        /* JADX INFO: renamed from: b */
        public final long f53350b;

        public C8251h(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public double calculate() {
            return this.f53349a / this.f53350b;
        }

        public String toString() {
            return this.f53349a + pj4.f71071b + this.f53350b;
        }

        public C8251h(long j, long j2) {
            if (j2 == 0) {
                this.f53349a = 0L;
                this.f53350b = 1L;
            } else {
                this.f53349a = j;
                this.f53350b = j2;
            }
        }
    }

    static {
        C8249f[] c8249fArr = {new C8249f(f53257u2, gsa.f40915b2, 4), new C8249f(f53266v2, 255, 4), new C8249f(f53281x, 256, 3, 4), new C8249f(f53290y, 257, 3, 4), new C8249f(f53299z, 258, 3), new C8249f(f52862A, 259, 3), new C8249f(f52871B, 262, 3), new C8249f(f53051V, 270, 2), new C8249f(f53060W, 271, 2), new C8249f(f53069X, Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000, 2), new C8249f(f52952K, 273, 3, 4), new C8249f(f52880C, 274, 3), new C8249f(f52889D, MediaPlayer.Event.ESDeleted, 3), new C8249f(f52961L, 278, 3, 4), new C8249f(f52970M, 279, 3, 4), new C8249f(f52925H, 282, 5), new C8249f(f52934I, 283, 5), new C8249f(f52898E, 284, 3), new C8249f(f52943J, 296, 3), new C8249f(f52997P, 301, 3), new C8249f(f53078Y, 305, 2), new C8249f(f53042U, 306, 2), new C8249f(f53087Z, 315, 2), new C8249f(f53006Q, ymh.InterfaceC15722a.f102115s, 5), new C8249f(f53015R, 319, 5), new C8249f(f53302z2, 330, 4), new C8249f(f52979N, 513, 4), new C8249f(f52988O, 514, 4), new C8249f(f53024S, Videoio.CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA, 5), new C8249f(f52907F, 530, 3), new C8249f(f52916G, Videoio.CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT, 3), new C8249f(f53033T, Videoio.CAP_PROP_XI_SENSOR_CLOCK_FREQ_HZ, 5), new C8249f(f53095a0, 33432, 2), new C8249f(f53275w2, 34665, 4), new C8249f(f53284x2, 34853, 4), new C8249f(f53225q2, 4, 4), new C8249f(f53209o2, 5, 4), new C8249f(f53201n2, 6, 4), new C8249f(f53217p2, 7, 4), new C8249f(f53233r2, 23, 3), new C8249f(f53241s2, 46, 7), new C8249f(f53249t2, 700, 1)};
        f52950J6 = c8249fArr;
        C8249f[] c8249fArr2 = {new C8249f(f53255u0, 33434, 5), new C8249f(f53264v0, 33437, 5), new C8249f(f53273w0, 34850, 3), new C8249f(f53282x0, 34852, 2), new C8249f(f53300z0, 34855, 3), new C8249f(f52863A0, 34856, 7), new C8249f(f52872B0, 34864, 3), new C8249f(f52881C0, 34865, 4), new C8249f(f52890D0, 34866, 4), new C8249f(f52899E0, 34867, 4), new C8249f(f52908F0, 34868, 4), new C8249f(f52917G0, 34869, 4), new C8249f(f53103b0, CpioConstants.C_ISNWK, 2), new C8249f(f53191m0, 36867, 2), new C8249f(f53199n0, 36868, 2), new C8249f(f53207o0, 36880, 2), new C8249f(f53215p0, 36881, 2), new C8249f(f53223q0, 36882, 2), new C8249f(f53151h0, 37121, 7), new C8249f(f53159i0, 37122, 5), new C8249f(f52926H0, 37377, 10), new C8249f(f52935I0, 37378, 5), new C8249f(f52944J0, 37379, 10), new C8249f(f52953K0, 37380, 10), new C8249f(f52962L0, 37381, 5), new C8249f(f52971M0, 37382, 5), new C8249f(f52980N0, 37383, 3), new C8249f(f52989O0, 37384, 3), new C8249f(f52998P0, 37385, 3), new C8249f(f53016R0, 37386, 5), new C8249f(f53007Q0, 37396, 3), new C8249f(f53167j0, 37500, 7), new C8249f(f53175k0, 37510, 7), new C8249f(f53231r0, 37520, 2), new C8249f(f53239s0, 37521, 2), new C8249f(f53247t0, 37522, 2), new C8249f(f53111c0, 40960, 7), new C8249f(f53119d0, 40961, 3), new C8249f(f53135f0, 40962, 3, 4), new C8249f(f53143g0, 40963, 3, 4), new C8249f(f53183l0, 40964, 2), new C8249f(f53293y2, 40965, 4), new C8249f(f53025S0, 41483, 5), new C8249f(f53034T0, 41484, 7), new C8249f(f53043U0, 41486, 5), new C8249f(f53052V0, 41487, 5), new C8249f(f53061W0, 41488, 3), new C8249f(f53070X0, 41492, 3), new C8249f(f53079Y0, 41493, 5), new C8249f(f53088Z0, 41495, 3), new C8249f(f53096a1, 41728, 7), new C8249f(f53104b1, 41729, 7), new C8249f(f53112c1, 41730, 7), new C8249f(f53120d1, 41985, 3), new C8249f(f53128e1, 41986, 3), new C8249f(f53136f1, 41987, 3), new C8249f(f53144g1, 41988, 5), new C8249f(f53152h1, 41989, 3), new C8249f(f53160i1, 41990, 3), new C8249f(f53168j1, 41991, 3), new C8249f(f53176k1, 41992, 3), new C8249f(f53184l1, 41993, 3), new C8249f(f53192m1, 41994, 3), new C8249f(f53200n1, 41995, 7), new C8249f(f53208o1, 41996, 3), new C8249f(f53216p1, 42016, 2), new C8249f("CameraOwnerName", 42032, 2), new C8249f(f53240s1, 42033, 2), new C8249f(f53248t1, 42034, 5), new C8249f(f53256u1, 42035, 2), new C8249f(f53265v1, 42036, 2), new C8249f(f53127e0, 42240, 5), new C8249f(f53153h2, 50706, 1), new C8249f(f53161i2, 50720, 3, 4)};
        f52959K6 = c8249fArr2;
        C8249f[] c8249fArr3 = {new C8249f(f53283x1, 0, 1), new C8249f(f53292y1, 1, 2), new C8249f(f53301z1, 2, 5, 10), new C8249f(f52864A1, 3, 2), new C8249f(f52873B1, 4, 5, 10), new C8249f(f52882C1, 5, 1), new C8249f(f52891D1, 6, 5), new C8249f(f52900E1, 7, 5), new C8249f(f52909F1, 8, 2), new C8249f(f52918G1, 9, 2), new C8249f(f52927H1, 10, 2), new C8249f(f52936I1, 11, 5), new C8249f(f52945J1, 12, 2), new C8249f(f52954K1, 13, 5), new C8249f(f52963L1, 14, 2), new C8249f(f52972M1, 15, 5), new C8249f(f52981N1, 16, 2), new C8249f(f52990O1, 17, 5), new C8249f(f52999P1, 18, 2), new C8249f(f53008Q1, 19, 2), new C8249f(f53017R1, 20, 5), new C8249f(f53026S1, 21, 2), new C8249f(f53035T1, 22, 5), new C8249f(f53044U1, 23, 2), new C8249f(f53053V1, 24, 5), new C8249f(f53062W1, 25, 2), new C8249f(f53071X1, 26, 5), new C8249f(f53080Y1, 27, 7), new C8249f(f53089Z1, 28, 7), new C8249f(f53097a2, 29, 2), new C8249f(f53105b2, 30, 3), new C8249f(f53113c2, 31, 5)};
        f52968L6 = c8249fArr3;
        C8249f[] c8249fArr4 = {new C8249f(f53121d2, 1, 2)};
        f52977M6 = c8249fArr4;
        C8249f[] c8249fArr5 = {new C8249f(f53257u2, gsa.f40915b2, 4), new C8249f(f53266v2, 255, 4), new C8249f(f53137f2, 256, 3, 4), new C8249f(f53129e2, 257, 3, 4), new C8249f(f53299z, 258, 3), new C8249f(f52862A, 259, 3), new C8249f(f52871B, 262, 3), new C8249f(f53051V, 270, 2), new C8249f(f53060W, 271, 2), new C8249f(f53069X, Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000, 2), new C8249f(f52952K, 273, 3, 4), new C8249f(f53145g2, 274, 3), new C8249f(f52889D, MediaPlayer.Event.ESDeleted, 3), new C8249f(f52961L, 278, 3, 4), new C8249f(f52970M, 279, 3, 4), new C8249f(f52925H, 282, 5), new C8249f(f52934I, 283, 5), new C8249f(f52898E, 284, 3), new C8249f(f52943J, 296, 3), new C8249f(f52997P, 301, 3), new C8249f(f53078Y, 305, 2), new C8249f(f53042U, 306, 2), new C8249f(f53087Z, 315, 2), new C8249f(f53006Q, ymh.InterfaceC15722a.f102115s, 5), new C8249f(f53015R, 319, 5), new C8249f(f53302z2, 330, 4), new C8249f(f52979N, 513, 4), new C8249f(f52988O, 514, 4), new C8249f(f53024S, Videoio.CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA, 5), new C8249f(f52907F, 530, 3), new C8249f(f52916G, Videoio.CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT, 3), new C8249f(f53033T, Videoio.CAP_PROP_XI_SENSOR_CLOCK_FREQ_HZ, 5), new C8249f(f53095a0, 33432, 2), new C8249f(f53275w2, 34665, 4), new C8249f(f53284x2, 34853, 4), new C8249f(f53153h2, 50706, 1), new C8249f(f53161i2, 50720, 3, 4)};
        f52986N6 = c8249fArr5;
        f52995O6 = new C8249f(f52952K, 273, 3);
        C8249f[] c8249fArr6 = {new C8249f(f53169j2, 256, 7), new C8249f(f52865A2, 8224, 4), new C8249f(f52874B2, 8256, 4)};
        f53004P6 = c8249fArr6;
        C8249f[] c8249fArr7 = {new C8249f(f53177k2, 257, 4), new C8249f(f53185l2, 258, 4)};
        f53013Q6 = c8249fArr7;
        C8249f[] c8249fArr8 = {new C8249f(f53193m2, 4371, 3)};
        f53022R6 = c8249fArr8;
        C8249f[] c8249fArr9 = {new C8249f(f53119d0, 55, 3)};
        f53031S6 = c8249fArr9;
        C8249f[][] c8249fArr10 = {c8249fArr, c8249fArr2, c8249fArr3, c8249fArr4, c8249fArr5, c8249fArr, c8249fArr6, c8249fArr7, c8249fArr8, c8249fArr9};
        f53126d7 = c8249fArr10;
        f53134e7 = new C8249f[]{new C8249f(f53302z2, 330, 4), new C8249f(f53275w2, 34665, 4), new C8249f(f53284x2, 34853, 4), new C8249f(f53293y2, 40965, 4), new C8249f(f52865A2, 8224, 1), new C8249f(f52874B2, 8256, 1)};
        f53142f7 = new HashMap[c8249fArr10.length];
        f53150g7 = new HashMap[c8249fArr10.length];
        f53158h7 = new HashSet<>(Arrays.asList(f53264v0, f53144g1, f53255u0, f52971M0, f52900E1));
        f53166i7 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f53174j7 = charsetForName;
        f53182k7 = bw3.f14993h.getBytes(charsetForName);
        f53190l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f53197m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(jzh.f52305a));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f53205n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(jzh.f52305a));
        int i = 0;
        while (true) {
            C8249f[][] c8249fArr11 = f53126d7;
            if (i >= c8249fArr11.length) {
                HashMap<Integer, Integer> map = f53166i7;
                C8249f[] c8249fArr12 = f53134e7;
                map.put(Integer.valueOf(c8249fArr12[0].f53345a), 5);
                map.put(Integer.valueOf(c8249fArr12[1].f53345a), 1);
                map.put(Integer.valueOf(c8249fArr12[2].f53345a), 2);
                map.put(Integer.valueOf(c8249fArr12[3].f53345a), 3);
                map.put(Integer.valueOf(c8249fArr12[4].f53345a), 7);
                map.put(Integer.valueOf(c8249fArr12[5].f53345a), 8);
                f53050U7 = Pattern.compile(".*[1-9].*");
                f53059V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f53068W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f53077X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f53142f7[i] = new HashMap<>();
            f53150g7[i] = new HashMap<>();
            for (C8249f c8249f : c8249fArr11[i]) {
                f53142f7[i].put(Integer.valueOf(c8249f.f53345a), c8249f);
                f53150g7[i].put(c8249f.f53346b, c8249f);
            }
            i++;
        }
    }

    public k95(@efb File file) throws Throwable {
        C8249f[][] c8249fArr = f53126d7;
        this.f53313f = new HashMap[c8249fArr.length];
        this.f53314g = new HashSet(c8249fArr.length);
        this.f53315h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        initForFilename(file.getAbsolutePath());
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute(f53191m0);
        if (attribute != null && getAttribute(f53042U) == null) {
            this.f53313f[0].put(f53042U, C8247d.createString(attribute));
        }
        if (getAttribute(f53281x) == null) {
            this.f53313f[0].put(f53281x, C8247d.createULong(0L, this.f53315h));
        }
        if (getAttribute(f53290y) == null) {
            this.f53313f[0].put(f53290y, C8247d.createULong(0L, this.f53315h));
        }
        if (getAttribute(f52880C) == null) {
            this.f53313f[0].put(f52880C, C8247d.createULong(0L, this.f53315h));
        }
        if (getAttribute(f52989O0) == null) {
            this.f53313f[1].put(f52989O0, C8247d.createULong(0L, this.f53315h));
        }
    }

    private String convertDecimalDegree(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(pj4.f71071b, -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(pj4.f71071b, -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(pj4.f71071b, -1);
            double d3 = d + (d2 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(f53020R4) && !str2.equals(f53038T4)) {
                if (!str2.equals("N") && !str2.equals(f53029S4)) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void copyChunksUpToGivenChunkType(C8245b c8245b, C8246c c8246c, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c8245b.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f53174j7;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            copyWebPChunk(c8245b, c8246c, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void copyWebPChunk(C8245b c8245b, C8246c c8246c, byte[] bArr) throws IOException {
        int i = c8245b.readInt();
        c8246c.write(bArr);
        c8246c.writeInt(i);
        if (i % 2 == 1) {
            i++;
        }
        m95.m17136f(c8245b, c8246c, i);
    }

    @hib
    private C8247d getExifAttribute(@efb String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f53291y0.equals(str)) {
            str = f53300z0;
        }
        for (int i = 0; i < f53126d7.length; i++) {
            C8247d c8247d = this.f53313f[i].get(str);
            if (c8247d != null) {
                return c8247d;
            }
        }
        return null;
    }

    private void getHeifAttributes(C8252i c8252i) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                m95.C9222b.m17142a(mediaMetadataRetriever, new C8244a(c8252i));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f53313f[0].put(f53281x, C8247d.createUShort(Integer.parseInt(strExtractMetadata), this.f53315h));
                }
                if (strExtractMetadata2 != null) {
                    this.f53313f[0].put(f53290y, C8247d.createUShort(Integer.parseInt(strExtractMetadata2), this.f53315h));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    this.f53313f[0].put(f52880C, C8247d.createUShort(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f53315h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c8252i.seek(i2);
                    byte[] bArr = new byte[6];
                    if (c8252i.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f53182k7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c8252i.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f53323p = i4;
                    readExifSegment(bArr2, 0);
                }
                if (f53272w) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Heif meta: ");
                    sb.append(strExtractMetadata);
                    sb.append("x");
                    sb.append(strExtractMetadata2);
                    sb.append(", rotation ");
                    sb.append(strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b A[LOOP:0: B:10:0x002e->B:61:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getJpegAttributes(p000.k95.C8245b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.getJpegAttributes(k95$b, int, int):void");
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        if (isHeifFormat(bArr)) {
            return 12;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        if (isRw2Format(bArr)) {
            return 10;
        }
        if (isPngFormat(bArr)) {
            return 13;
        }
        return isWebpFormat(bArr) ? 14 : 0;
    }

    private void getOrfAttributes(C8252i c8252i) throws Throwable {
        int i;
        int i2;
        getRawAttributes(c8252i);
        C8247d c8247d = this.f53313f[1].get(f53167j0);
        if (c8247d != null) {
            C8252i c8252i2 = new C8252i(c8247d.f53344d);
            c8252i2.setByteOrder(this.f53315h);
            byte[] bArr = f52967L5;
            byte[] bArr2 = new byte[bArr.length];
            c8252i2.readFully(bArr2);
            c8252i2.seek(0L);
            byte[] bArr3 = f52976M5;
            byte[] bArr4 = new byte[bArr3.length];
            c8252i2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c8252i2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c8252i2.seek(12L);
            }
            readImageFileDirectory(c8252i2, 6);
            C8247d c8247d2 = this.f53313f[7].get(f53177k2);
            C8247d c8247d3 = this.f53313f[7].get(f53185l2);
            if (c8247d2 != null && c8247d3 != null) {
                this.f53313f[5].put(f52979N, c8247d2);
                this.f53313f[5].put(f52988O, c8247d3);
            }
            C8247d c8247d4 = this.f53313f[8].get(f53193m2);
            if (c8247d4 != null) {
                int[] iArr = (int[]) c8247d4.m14600a(this.f53315h);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f53263v, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C8247d c8247dCreateUShort = C8247d.createUShort(i5, this.f53315h);
                C8247d c8247dCreateUShort2 = C8247d.createUShort(i6, this.f53315h);
                this.f53313f[0].put(f53281x, c8247dCreateUShort);
                this.f53313f[0].put(f53290y, c8247dCreateUShort2);
            }
        }
    }

    private void getPngAttributes(C8245b c8245b) throws Throwable {
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(c8245b);
        }
        c8245b.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f53030S5;
        c8245b.skipFully(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c8245b.readInt();
                byte[] bArr2 = new byte[4];
                if (c8245b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f53048U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f53057V5)) {
                    return;
                }
                if (Arrays.equals(bArr2, f53039T5)) {
                    byte[] bArr3 = new byte[i];
                    if (c8245b.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m95.m17131a(bArr2));
                    }
                    int i3 = c8245b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f53323p = i2;
                        readExifSegment(bArr3, 0);
                        validateImages();
                        setThumbnailData(new C8245b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c8245b.skipFully(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void getRafAttributes(C8245b c8245b) throws Throwable {
        boolean z = f53272w;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(c8245b);
        }
        c8245b.skipFully(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c8245b.read(bArr);
        c8245b.read(bArr2);
        c8245b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c8245b.skipFully(i - c8245b.position());
        c8245b.read(bArr4);
        getJpegAttributes(new C8245b(bArr4), i, 5);
        c8245b.skipFully(i3 - c8245b.position());
        c8245b.setByteOrder(ByteOrder.BIG_ENDIAN);
        int i4 = c8245b.readInt();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c8245b.readUnsignedShort();
            int unsignedShort2 = c8245b.readUnsignedShort();
            if (unsignedShort == f52995O6.f53345a) {
                short s = c8245b.readShort();
                short s2 = c8245b.readShort();
                C8247d c8247dCreateUShort = C8247d.createUShort(s, this.f53315h);
                C8247d c8247dCreateUShort2 = C8247d.createUShort(s2, this.f53315h);
                this.f53313f[0].put(f53290y, c8247dCreateUShort);
                this.f53313f[0].put(f53281x, c8247dCreateUShort2);
                if (f53272w) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) s);
                    sb3.append(", width: ");
                    sb3.append((int) s2);
                    return;
                }
                return;
            }
            c8245b.skipFully(unsignedShort2);
        }
    }

    private void getRawAttributes(C8252i c8252i) throws Throwable {
        C8247d c8247d;
        parseTiffHeaders(c8252i);
        readImageFileDirectory(c8252i, 0);
        updateImageSizeValues(c8252i, 0);
        updateImageSizeValues(c8252i, 5);
        updateImageSizeValues(c8252i, 4);
        validateImages();
        if (this.f53311d != 8 || (c8247d = this.f53313f[1].get(f53167j0)) == null) {
            return;
        }
        C8252i c8252i2 = new C8252i(c8247d.f53344d);
        c8252i2.setByteOrder(this.f53315h);
        c8252i2.skipFully(6);
        readImageFileDirectory(c8252i2, 9);
        C8247d c8247d2 = this.f53313f[9].get(f53119d0);
        if (c8247d2 != null) {
            this.f53313f[1].put(f53119d0, c8247d2);
        }
    }

    private void getRw2Attributes(C8252i c8252i) throws Throwable {
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(c8252i);
        }
        getRawAttributes(c8252i);
        C8247d c8247d = this.f53313f[0].get(f53241s2);
        if (c8247d != null) {
            getJpegAttributes(new C8245b(c8247d.f53344d), (int) c8247d.f53343c, 5);
        }
        C8247d c8247d2 = this.f53313f[0].get(f53233r2);
        C8247d c8247d3 = this.f53313f[1].get(f53300z0);
        if (c8247d2 == null || c8247d3 != null) {
            return;
        }
        this.f53313f[1].put(f53300z0, c8247d2);
    }

    private void getStandaloneAttributes(C8252i c8252i) throws IOException {
        byte[] bArr = f53182k7;
        c8252i.skipFully(bArr.length);
        byte[] bArr2 = new byte[c8252i.available()];
        c8252i.readFully(bArr2);
        this.f53323p = bArr.length;
        readExifSegment(bArr2, 0);
    }

    private void getWebpAttributes(C8245b c8245b) throws Throwable {
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(c8245b);
        }
        c8245b.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        c8245b.skipFully(f53084Y5.length);
        int i = c8245b.readInt() + 8;
        byte[] bArr = f53093Z5;
        c8245b.skipFully(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c8245b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c8245b.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f53109b6, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c8245b.read(bArr3) == i2) {
                        this.f53323p = i3;
                        readExifSegment(bArr3, 0);
                        setThumbnailData(new C8245b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m95.m17131a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c8245b.skipFully(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> guessDataFormat(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
            if (((Integer) pairGuessDataFormat.first).intValue() == 2) {
                return pairGuessDataFormat;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i]);
                int iIntValue = (((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) ? ((Integer) pairGuessDataFormat.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairGuessDataFormat;
        }
        if (!str.contains(pj4.f71071b)) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] strArrSplit2 = str.split(pj4.f71071b, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void handleThumbnailFromJfif(C8245b c8245b, HashMap map) throws Throwable {
        C8247d c8247d = (C8247d) map.get(f52979N);
        C8247d c8247d2 = (C8247d) map.get(f52988O);
        if (c8247d == null || c8247d2 == null) {
            return;
        }
        int intValue = c8247d.getIntValue(this.f53315h);
        int intValue2 = c8247d2.getIntValue(this.f53315h);
        if (this.f53311d == 7) {
            intValue += this.f53324q;
        }
        if (intValue > 0 && intValue2 > 0) {
            this.f53316i = true;
            if (this.f53308a == null && this.f53310c == null && this.f53309b == null) {
                byte[] bArr = new byte[intValue2];
                c8245b.skip(intValue);
                c8245b.read(bArr);
                this.f53321n = bArr;
            }
            this.f53319l = intValue;
            this.f53320m = intValue2;
        }
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting thumbnail attributes with offset: ");
            sb.append(intValue);
            sb.append(", length: ");
            sb.append(intValue2);
        }
    }

    private void handleThumbnailFromStrips(C8245b c8245b, HashMap map) throws IOException {
        C8247d c8247d = (C8247d) map.get(f52952K);
        C8247d c8247d2 = (C8247d) map.get(f52970M);
        if (c8247d == null || c8247d2 == null) {
            return;
        }
        long[] jArrM17134d = m95.m17134d(c8247d.m14600a(this.f53315h));
        long[] jArrM17134d2 = m95.m17134d(c8247d2.m14600a(this.f53315h));
        if (jArrM17134d == null || jArrM17134d.length == 0) {
            Log.w(f53263v, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM17134d2 == null || jArrM17134d2.length == 0) {
            Log.w(f53263v, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrM17134d.length != jArrM17134d2.length) {
            Log.w(f53263v, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : jArrM17134d2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.f53318k = true;
        this.f53317j = true;
        this.f53316i = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrM17134d.length; i4++) {
            int i5 = (int) jArrM17134d[i4];
            int i6 = (int) jArrM17134d2[i4];
            if (i4 < jArrM17134d.length - 1 && i5 + i6 != jArrM17134d[i4 + 1]) {
                this.f53318k = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (c8245b.skip(j3) != j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to skip ");
                sb.append(i7);
                sb.append(" bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (c8245b.read(bArr2) != i6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read ");
                sb2.append(i6);
                sb2.append(" bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.f53321n = bArr;
        if (this.f53318k) {
            this.f53319l = (int) jArrM17134d[0];
            this.f53320m = i;
        }
    }

    private void initForFilename(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f53310c = null;
        this.f53308a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.f53309b = fileInputStream2.getFD();
                } else {
                    this.f53309b = null;
                }
                loadAttributes(fileInputStream2);
                m95.m17133c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                m95.m17133c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean isExifDataOnly(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f53182k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f53182k7;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isHeifFormat(byte[] bArr) throws Throwable {
        C8245b c8245b;
        long j;
        C8245b c8245b2 = null;
        try {
            c8245b = new C8245b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = c8245b.readInt();
            byte[] bArr2 = new byte[4];
            c8245b.read(bArr2);
            if (!Arrays.equals(bArr2, f52922G5)) {
                c8245b.close();
                return false;
            }
            if (length == 1) {
                length = c8245b.readLong();
                j = 16;
                if (length < 16) {
                    c8245b.close();
                    return false;
                }
            } else {
                j = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j2 = length - j;
            if (j2 < 8) {
                c8245b.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z = false;
            boolean z2 = false;
            for (long j3 = 0; j3 < j2 / 4; j3++) {
                if (c8245b.read(bArr3) != 4) {
                    c8245b.close();
                    return false;
                }
                if (j3 != 1) {
                    if (Arrays.equals(bArr3, f52931H5)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, f52940I5)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        c8245b.close();
                        return true;
                    }
                }
            }
            c8245b.close();
        } catch (Exception unused2) {
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
            throw th;
        }
        return false;
    }

    private static boolean isJpegFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f52895D5;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isOrfFormat(byte[] bArr) throws Throwable {
        C8245b c8245b;
        C8245b c8245b2 = null;
        try {
            c8245b = new C8245b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrder = readByteOrder(c8245b);
            this.f53315h = byteOrder;
            c8245b.setByteOrder(byteOrder);
            short s = c8245b.readShort();
            boolean z = s == 20306 || s == 21330;
            c8245b.close();
            return z;
        } catch (Exception unused2) {
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
            throw th;
        }
    }

    private boolean isPngFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f53030S5;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isRafFormat(byte[] bArr) throws IOException {
        byte[] bytes = f52904E5.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRw2Format(byte[] bArr) throws Throwable {
        C8245b c8245b;
        C8245b c8245b2 = null;
        try {
            c8245b = new C8245b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrder = readByteOrder(c8245b);
            this.f53315h = byteOrder;
            c8245b.setByteOrder(byteOrder);
            boolean z = c8245b.readShort() == 85;
            c8245b.close();
            return z;
        } catch (Exception unused2) {
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c8245b2 = c8245b;
            if (c8245b2 != null) {
                c8245b2.close();
            }
            throw th;
        }
    }

    private static boolean isSeekableFD(FileDescriptor fileDescriptor) {
        try {
            m95.C9221a.m17141c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isSupportedDataType(HashMap map) throws Throwable {
        C8247d c8247d;
        C8247d c8247d2 = (C8247d) map.get(f53299z);
        if (c8247d2 == null) {
            return false;
        }
        int[] iArr = (int[]) c8247d2.m14600a(this.f53315h);
        int[] iArr2 = f53236r5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f53311d != 3 || (c8247d = (C8247d) map.get(f52871B)) == null) {
            return false;
        }
        int intValue = c8247d.getIntValue(this.f53315h);
        return (intValue == 1 && Arrays.equals(iArr, f53252t5)) || (intValue == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean isSupportedFormatForSavingAttributes(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    public static boolean isSupportedMimeType(@efb String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    private boolean isThumbnail(HashMap map) throws IOException {
        C8247d c8247d = (C8247d) map.get(f53290y);
        C8247d c8247d2 = (C8247d) map.get(f53281x);
        if (c8247d == null || c8247d2 == null) {
            return false;
        }
        return c8247d.getIntValue(this.f53315h) <= 512 && c8247d2.getIntValue(this.f53315h) <= 512;
    }

    private boolean isWebpFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f53084Y5;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f53093Z5;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f53084Y5.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadAttributes(@p000.efb java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            k95$f[][] r2 = p000.k95.f53126d7     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, k95$d>[] r2 = r4.f53313f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f53312e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.getMimeType(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f53311d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f53311d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = shouldSupportSeek(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            k95$i r0 = new k95$i     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f53312e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.getStandaloneAttributes(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f53311d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.getHeifAttributes(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.getOrfAttributes(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.getRw2Attributes(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.getRawAttributes(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f53323p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.seek(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.setThumbnailData(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            k95$b r1 = new k95$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f53311d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.getJpegAttributes(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.getPngAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.getRafAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.getWebpAttributes(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.addDefaultValuesForCompatibility()
            boolean r5 = p000.k95.f53272w
            if (r5 == 0) goto Lac
        L97:
            r4.printAttributes()
            goto Lac
        L9b:
            boolean r0 = p000.k95.f53272w     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.addDefaultValuesForCompatibility()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.addDefaultValuesForCompatibility()
            boolean r0 = p000.k95.f53272w
            if (r0 == 0) goto Lb7
            r4.printAttributes()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.loadAttributes(java.io.InputStream):void");
    }

    private static Long parseDateTime(@hib String str, @hib String str2, @hib String str3) {
        if (str != null && f53050U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f53197m6.parse(str, parsePosition);
                if (date == null && (date = f53205n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i2 = Integer.parseInt(str3.substring(1, 3));
                    int i3 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || "-".equals(strSubstring)) && g1i.f38277c.equals(str3.substring(3, 4)) && i2 <= 14) {
                        int i4 = ((i2 * 60) + i3) * 60000;
                        if (!"-".equals(strSubstring)) {
                            i = -1;
                        }
                        time += (long) (i4 * i);
                    }
                }
                if (str2 != null) {
                    time += m95.m17137g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void parseTiffHeaders(C8245b c8245b) throws IOException {
        ByteOrder byteOrder = readByteOrder(c8245b);
        this.f53315h = byteOrder;
        c8245b.setByteOrder(byteOrder);
        int unsignedShort = c8245b.readUnsignedShort();
        int i = this.f53311d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c8245b.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i2);
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c8245b.skipFully(i3);
        }
    }

    private void printAttributes() {
        for (int i = 0; i < this.f53313f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f53313f[i].size());
            for (Map.Entry<String, C8247d> entry : this.f53313f[i].entrySet()) {
                C8247d value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append(entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(value.toString());
                sb2.append(", tagValue: '");
                sb2.append(value.getStringValue(this.f53315h));
                sb2.append("'");
            }
        }
    }

    private ByteOrder readByteOrder(C8245b c8245b) throws IOException {
        short s = c8245b.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    private void readExifSegment(byte[] bArr, int i) throws IOException {
        C8252i c8252i = new C8252i(bArr);
        parseTiffHeaders(c8252i);
        readImageFileDirectory(c8252i, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readImageFileDirectory(p000.k95.C8252i r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.readImageFileDirectory(k95$i, int):void");
    }

    private void removeAttribute(String str) {
        for (int i = 0; i < f53126d7.length; i++) {
            this.f53313f[i].remove(str);
        }
    }

    private void replaceInvalidTags(int i, String str, String str2) {
        if (this.f53313f[i].isEmpty() || this.f53313f[i].get(str) == null) {
            return;
        }
        HashMap<String, C8247d> map = this.f53313f[i];
        map.put(str2, map.get(str));
        this.f53313f[i].remove(str);
    }

    private void retrieveJpegImageSize(C8252i c8252i, int i) throws Throwable {
        C8247d c8247d = this.f53313f[i].get(f53290y);
        C8247d c8247d2 = this.f53313f[i].get(f53281x);
        if (c8247d == null || c8247d2 == null) {
            C8247d c8247d3 = this.f53313f[i].get(f52979N);
            C8247d c8247d4 = this.f53313f[i].get(f52988O);
            if (c8247d3 == null || c8247d4 == null) {
                return;
            }
            int intValue = c8247d3.getIntValue(this.f53315h);
            int intValue2 = c8247d3.getIntValue(this.f53315h);
            c8252i.seek(intValue);
            byte[] bArr = new byte[intValue2];
            c8252i.read(bArr);
            getJpegAttributes(new C8245b(bArr), intValue, i);
        }
    }

    private void saveJpegAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(c0b.f15434d);
        }
        C8245b c8245b = new C8245b(inputStream);
        C8246c c8246c = new C8246c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c8245b.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c8246c.writeByte(-1);
        if (c8245b.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c8246c.writeByte(-40);
        C8247d c8247dRemove = (getAttribute(f53249t2) == null || !this.f53328u) ? null : this.f53313f[0].remove(f53249t2);
        c8246c.writeByte(-1);
        c8246c.writeByte(-31);
        writeExifSegment(c8246c);
        if (c8247dRemove != null) {
            this.f53313f[0].put(f53249t2, c8247dRemove);
        }
        byte[] bArr = new byte[4096];
        while (c8245b.readByte() == -1) {
            byte b = c8245b.readByte();
            if (b == -39 || b == -38) {
                c8246c.writeByte(-1);
                c8246c.writeByte(b);
                m95.m17135e(c8245b, c8246c);
                return;
            }
            if (b != -31) {
                c8246c.writeByte(-1);
                c8246c.writeByte(b);
                int unsignedShort = c8245b.readUnsignedShort();
                c8246c.writeUnsignedShort(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = c8245b.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        c8246c.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = c8245b.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (c8245b.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f53182k7)) {
                        c8245b.skipFully(unsignedShort2 - 8);
                    }
                }
                c8246c.writeByte(-1);
                c8246c.writeByte(b);
                c8246c.writeUnsignedShort(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    c8246c.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = c8245b.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        c8246c.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void savePngAttributes(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(c0b.f15434d);
        }
        C8245b c8245b = new C8245b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C8246c c8246c = new C8246c(outputStream, byteOrder);
        m95.m17136f(c8245b, c8246c, f53030S5.length);
        if (this.f53323p == 0) {
            int i = c8245b.readInt();
            c8246c.writeInt(i);
            m95.m17136f(c8245b, c8246c, i + 8);
        } else {
            m95.m17136f(c8245b, c8246c, (r2 - r7.length) - 8);
            c8245b.skipFully(c8245b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C8246c c8246c2 = new C8246c(byteArrayOutputStream, byteOrder);
            writeExifSegment(c8246c2);
            byte[] byteArray = ((ByteArrayOutputStream) c8246c2.f53338a).toByteArray();
            c8246c.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c8246c.writeInt((int) crc32.getValue());
            m95.m17133c(byteArrayOutputStream);
            m95.m17135e(c8245b, c8246c);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            m95.m17133c(byteArrayOutputStream2);
            throw th;
        }
    }

    private void saveWebpAttributes(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i;
        int i2;
        int i3;
        if (f53272w) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(c0b.f15434d);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C8245b c8245b = new C8245b(inputStream, byteOrder);
        C8246c c8246c = new C8246c(outputStream, byteOrder);
        byte[] bArr = f53084Y5;
        m95.m17136f(c8245b, c8246c, bArr.length);
        byte[] bArr2 = f53093Z5;
        c8245b.skipFully(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C8246c c8246c2 = new C8246c(byteArrayOutputStream2, byteOrder);
                    int i4 = this.f53323p;
                    if (i4 != 0) {
                        m95.m17136f(c8245b, c8246c2, (i4 - ((bArr.length + 4) + bArr2.length)) - 8);
                        c8245b.skipFully(4);
                        int i5 = c8245b.readInt();
                        if (i5 % 2 != 0) {
                            i5++;
                        }
                        c8245b.skipFully(i5);
                        writeExifSegment(c8246c2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (c8245b.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f53133e6;
                        boolean z = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i6 = c8245b.readInt();
                            byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                            c8245b.read(bArr5);
                            byte b = (byte) (8 | bArr5[0]);
                            bArr5[0] = b;
                            boolean z2 = ((b >> 1) & 1) == 1;
                            c8246c2.write(bArr4);
                            c8246c2.writeInt(i6);
                            c8246c2.write(bArr5);
                            if (z2) {
                                copyChunksUpToGivenChunkType(c8245b, c8246c2, f53157h6, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f53165i6)) {
                                        break;
                                    } else {
                                        copyWebPChunk(c8245b, c8246c2, bArr6);
                                    }
                                }
                                writeExifSegment(c8246c2);
                            } else {
                                copyChunksUpToGivenChunkType(c8245b, c8246c2, f53149g6, f53141f6);
                                writeExifSegment(c8246c2);
                            }
                        } else {
                            byte[] bArr7 = f53149g6;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f53141f6)) {
                                int i7 = c8245b.readInt();
                                int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c8245b.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (c8245b.read(bArr9) != 3 || !Arrays.equals(f53117c6, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = c8245b.readInt();
                                    i8 -= 10;
                                    i3 = (i << 2) >> 18;
                                    i2 = (i << 18) >> 18;
                                    z = false;
                                } else if (!Arrays.equals(bArr3, f53141f6)) {
                                    i = 0;
                                    z = false;
                                    i2 = 0;
                                    i3 = 0;
                                } else {
                                    if (c8245b.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i = c8245b.readInt();
                                    i2 = (i & 16383) + 1;
                                    i3 = ((i & 268419072) >>> 14) + 1;
                                    if ((i & 268435456) == 0) {
                                        z = false;
                                    }
                                    i8 -= 5;
                                }
                                c8246c2.write(bArr4);
                                c8246c2.writeInt(10);
                                byte[] bArr10 = new byte[10];
                                if (z) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i9 = i2 - 1;
                                int i10 = i3 - 1;
                                bArr10[4] = (byte) i9;
                                bArr10[5] = (byte) (i9 >> 8);
                                bArr10[6] = (byte) (i9 >> 16);
                                bArr10[7] = (byte) i10;
                                bArr10[8] = (byte) (i10 >> 8);
                                bArr10[9] = (byte) (i10 >> 16);
                                c8246c2.write(bArr10);
                                c8246c2.write(bArr3);
                                c8246c2.writeInt(i7);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c8246c2.write(bArr8);
                                    c8246c2.write(f53117c6);
                                    c8246c2.writeInt(i);
                                } else if (Arrays.equals(bArr3, f53141f6)) {
                                    c8246c2.write(47);
                                    c8246c2.writeInt(i);
                                }
                                m95.m17136f(c8245b, c8246c2, i8);
                                writeExifSegment(c8246c2);
                            }
                        }
                    }
                    m95.m17135e(c8245b, c8246c2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = f53093Z5;
                    c8246c.writeInt(size + bArr11.length);
                    c8246c.write(bArr11);
                    byteArrayOutputStream2.writeTo(c8246c);
                    m95.m17133c(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    m95.m17133c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void setThumbnailData(C8245b c8245b) throws Throwable {
        HashMap<String, C8247d> map = this.f53313f[4];
        C8247d c8247d = map.get(f52862A);
        if (c8247d == null) {
            this.f53322o = 6;
            handleThumbnailFromJfif(c8245b, map);
            return;
        }
        int intValue = c8247d.getIntValue(this.f53315h);
        this.f53322o = intValue;
        if (intValue != 1) {
            if (intValue == 6) {
                handleThumbnailFromJfif(c8245b, map);
                return;
            } else if (intValue != 7) {
                return;
            }
        }
        if (isSupportedDataType(map)) {
            handleThumbnailFromStrips(c8245b, map);
        }
    }

    private static boolean shouldSupportSeek(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void swapBasedOnImageSize(int i, int i2) throws Throwable {
        if (this.f53313f[i].isEmpty() || this.f53313f[i2].isEmpty()) {
            return;
        }
        C8247d c8247d = this.f53313f[i].get(f53290y);
        C8247d c8247d2 = this.f53313f[i].get(f53281x);
        C8247d c8247d3 = this.f53313f[i2].get(f53290y);
        C8247d c8247d4 = this.f53313f[i2].get(f53281x);
        if (c8247d == null || c8247d2 == null || c8247d3 == null || c8247d4 == null) {
            return;
        }
        int intValue = c8247d.getIntValue(this.f53315h);
        int intValue2 = c8247d2.getIntValue(this.f53315h);
        int intValue3 = c8247d3.getIntValue(this.f53315h);
        int intValue4 = c8247d4.getIntValue(this.f53315h);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        HashMap<String, C8247d>[] mapArr = this.f53313f;
        HashMap<String, C8247d> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    private void updateImageSizeValues(C8252i c8252i, int i) throws Throwable {
        C8247d c8247dCreateUShort;
        C8247d c8247dCreateUShort2;
        C8247d c8247d = this.f53313f[i].get(f53161i2);
        C8247d c8247d2 = this.f53313f[i].get(f53225q2);
        C8247d c8247d3 = this.f53313f[i].get(f53209o2);
        C8247d c8247d4 = this.f53313f[i].get(f53201n2);
        C8247d c8247d5 = this.f53313f[i].get(f53217p2);
        if (c8247d == null) {
            if (c8247d2 == null || c8247d3 == null || c8247d4 == null || c8247d5 == null) {
                retrieveJpegImageSize(c8252i, i);
                return;
            }
            int intValue = c8247d2.getIntValue(this.f53315h);
            int intValue2 = c8247d4.getIntValue(this.f53315h);
            int intValue3 = c8247d5.getIntValue(this.f53315h);
            int intValue4 = c8247d3.getIntValue(this.f53315h);
            if (intValue2 <= intValue || intValue3 <= intValue4) {
                return;
            }
            C8247d c8247dCreateUShort3 = C8247d.createUShort(intValue2 - intValue, this.f53315h);
            C8247d c8247dCreateUShort4 = C8247d.createUShort(intValue3 - intValue4, this.f53315h);
            this.f53313f[i].put(f53290y, c8247dCreateUShort3);
            this.f53313f[i].put(f53281x, c8247dCreateUShort4);
            return;
        }
        if (c8247d.f53341a == 5) {
            C8251h[] c8251hArr = (C8251h[]) c8247d.m14600a(this.f53315h);
            if (c8251hArr == null || c8251hArr.length != 2) {
                Log.w(f53263v, "Invalid crop size values. cropSize=" + Arrays.toString(c8251hArr));
                return;
            }
            c8247dCreateUShort = C8247d.createURational(c8251hArr[0], this.f53315h);
            c8247dCreateUShort2 = C8247d.createURational(c8251hArr[1], this.f53315h);
        } else {
            int[] iArr = (int[]) c8247d.m14600a(this.f53315h);
            if (iArr == null || iArr.length != 2) {
                Log.w(f53263v, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            c8247dCreateUShort = C8247d.createUShort(iArr[0], this.f53315h);
            c8247dCreateUShort2 = C8247d.createUShort(iArr[1], this.f53315h);
        }
        this.f53313f[i].put(f53281x, c8247dCreateUShort);
        this.f53313f[i].put(f53290y, c8247dCreateUShort2);
    }

    private void validateImages() throws Throwable {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        C8247d c8247d = this.f53313f[1].get(f53135f0);
        C8247d c8247d2 = this.f53313f[1].get(f53143g0);
        if (c8247d != null && c8247d2 != null) {
            this.f53313f[0].put(f53281x, c8247d);
            this.f53313f[0].put(f53290y, c8247d2);
        }
        if (this.f53313f[4].isEmpty() && isThumbnail(this.f53313f[5])) {
            HashMap<String, C8247d>[] mapArr = this.f53313f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        isThumbnail(this.f53313f[4]);
        replaceInvalidTags(0, f53145g2, f52880C);
        replaceInvalidTags(0, f53129e2, f53290y);
        replaceInvalidTags(0, f53137f2, f53281x);
        replaceInvalidTags(5, f53145g2, f52880C);
        replaceInvalidTags(5, f53129e2, f53290y);
        replaceInvalidTags(5, f53137f2, f53281x);
        replaceInvalidTags(4, f52880C, f53145g2);
        replaceInvalidTags(4, f53290y, f53129e2);
        replaceInvalidTags(4, f53281x, f53137f2);
    }

    private int writeExifSegment(C8246c c8246c) throws IOException {
        C8249f[][] c8249fArr = f53126d7;
        int[] iArr = new int[c8249fArr.length];
        int[] iArr2 = new int[c8249fArr.length];
        for (C8249f c8249f : f53134e7) {
            removeAttribute(c8249f.f53346b);
        }
        if (this.f53316i) {
            if (this.f53317j) {
                removeAttribute(f52952K);
                removeAttribute(f52970M);
            } else {
                removeAttribute(f52979N);
                removeAttribute(f52988O);
            }
        }
        for (int i = 0; i < f53126d7.length; i++) {
            for (Object obj : this.f53313f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f53313f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f53313f[1].isEmpty()) {
            this.f53313f[0].put(f53134e7[1].f53346b, C8247d.createULong(0L, this.f53315h));
        }
        if (!this.f53313f[2].isEmpty()) {
            this.f53313f[0].put(f53134e7[2].f53346b, C8247d.createULong(0L, this.f53315h));
        }
        if (!this.f53313f[3].isEmpty()) {
            this.f53313f[1].put(f53134e7[3].f53346b, C8247d.createULong(0L, this.f53315h));
        }
        if (this.f53316i) {
            if (this.f53317j) {
                this.f53313f[4].put(f52952K, C8247d.createUShort(0, this.f53315h));
                this.f53313f[4].put(f52970M, C8247d.createUShort(this.f53320m, this.f53315h));
            } else {
                this.f53313f[4].put(f52979N, C8247d.createULong(0L, this.f53315h));
                this.f53313f[4].put(f52988O, C8247d.createULong(this.f53320m, this.f53315h));
            }
        }
        for (int i2 = 0; i2 < f53126d7.length; i2++) {
            Iterator<Map.Entry<String, C8247d>> it = this.f53313f[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int size = it.next().getValue().size();
                if (size > 4) {
                    i3 += size;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size2 = 8;
        for (int i4 = 0; i4 < f53126d7.length; i4++) {
            if (!this.f53313f[i4].isEmpty()) {
                iArr[i4] = size2;
                size2 += (this.f53313f[i4].size() * 12) + 6 + iArr2[i4];
            }
        }
        if (this.f53316i) {
            if (this.f53317j) {
                this.f53313f[4].put(f52952K, C8247d.createUShort(size2, this.f53315h));
            } else {
                this.f53313f[4].put(f52979N, C8247d.createULong(size2, this.f53315h));
            }
            this.f53319l = size2;
            size2 += this.f53320m;
        }
        if (this.f53311d == 4) {
            size2 += 8;
        }
        if (f53272w) {
            for (int i5 = 0; i5 < f53126d7.length; i5++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(this.f53313f[i5].size()), Integer.valueOf(iArr2[i5]), Integer.valueOf(size2));
            }
        }
        if (!this.f53313f[1].isEmpty()) {
            this.f53313f[0].put(f53134e7[1].f53346b, C8247d.createULong(iArr[1], this.f53315h));
        }
        if (!this.f53313f[2].isEmpty()) {
            this.f53313f[0].put(f53134e7[2].f53346b, C8247d.createULong(iArr[2], this.f53315h));
        }
        if (!this.f53313f[3].isEmpty()) {
            this.f53313f[1].put(f53134e7[3].f53346b, C8247d.createULong(iArr[3], this.f53315h));
        }
        int i6 = this.f53311d;
        if (i6 == 4) {
            c8246c.writeUnsignedShort(size2);
            c8246c.write(f53182k7);
        } else if (i6 == 13) {
            c8246c.writeInt(size2);
            c8246c.write(f53039T5);
        } else if (i6 == 14) {
            c8246c.write(f53109b6);
            c8246c.writeInt(size2);
        }
        c8246c.writeShort(this.f53315h == ByteOrder.BIG_ENDIAN ? f53221p6 : f53213o6);
        c8246c.setByteOrder(this.f53315h);
        c8246c.writeUnsignedShort(42);
        c8246c.writeUnsignedInt(8L);
        for (int i7 = 0; i7 < f53126d7.length; i7++) {
            if (!this.f53313f[i7].isEmpty()) {
                c8246c.writeUnsignedShort(this.f53313f[i7].size());
                int size3 = iArr[i7] + 2 + (this.f53313f[i7].size() * 12) + 4;
                for (Map.Entry<String, C8247d> entry2 : this.f53313f[i7].entrySet()) {
                    int i8 = f53150g7[i7].get(entry2.getKey()).f53345a;
                    C8247d value = entry2.getValue();
                    int size4 = value.size();
                    c8246c.writeUnsignedShort(i8);
                    c8246c.writeUnsignedShort(value.f53341a);
                    c8246c.writeInt(value.f53342b);
                    if (size4 > 4) {
                        c8246c.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        c8246c.write(value.f53344d);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                c8246c.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                if (i7 != 0 || this.f53313f[4].isEmpty()) {
                    c8246c.writeUnsignedInt(0L);
                } else {
                    c8246c.writeUnsignedInt(iArr[4]);
                }
                Iterator<Map.Entry<String, C8247d>> it2 = this.f53313f[i7].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f53344d;
                    if (bArr.length > 4) {
                        c8246c.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f53316i) {
            c8246c.write(getThumbnailBytes());
        }
        if (this.f53311d == 14 && size2 % 2 == 1) {
            c8246c.writeByte(0);
        }
        c8246c.setByteOrder(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    public void flipHorizontally() {
        int i = 1;
        switch (getAttributeInt(f52880C, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(f52880C, Integer.toString(i));
    }

    public void flipVertically() {
        int i = 1;
        switch (getAttributeInt(f52880C, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(f52880C, Integer.toString(i));
    }

    public double getAltitude(double d) {
        double attributeDouble = getAttributeDouble(f52891D1, -1.0d);
        int attributeInt = getAttributeInt(f52882C1, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d;
        }
        return attributeDouble * ((double) (attributeInt != 1 ? 1 : -1));
    }

    @hib
    public String getAttribute(@efb String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C8247d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!f53158h7.contains(str)) {
                return exifAttribute.getStringValue(this.f53315h);
            }
            if (str.equals(f52900E1)) {
                int i = exifAttribute.f53341a;
                if (i != 5 && i != 10) {
                    Log.w(f53263v, "GPS Timestamp format is not rational. format=" + exifAttribute.f53341a);
                    return null;
                }
                C8251h[] c8251hArr = (C8251h[]) exifAttribute.m14600a(this.f53315h);
                if (c8251hArr == null || c8251hArr.length != 3) {
                    Log.w(f53263v, "Invalid GPS Timestamp array. array=" + Arrays.toString(c8251hArr));
                    return null;
                }
                C8251h c8251h = c8251hArr[0];
                Integer numValueOf = Integer.valueOf((int) (c8251h.f53349a / c8251h.f53350b));
                C8251h c8251h2 = c8251hArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c8251h2.f53349a / c8251h2.f53350b));
                C8251h c8251h3 = c8251hArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c8251h3.f53349a / c8251h3.f53350b)));
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.f53315h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @hib
    public byte[] getAttributeBytes(@efb String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C8247d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.f53344d;
        }
        return null;
    }

    public double getAttributeDouble(@efb String str, double d) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C8247d exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return d;
        }
        try {
            return exifAttribute.getDoubleValue(this.f53315h);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public int getAttributeInt(@efb String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C8247d exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return i;
        }
        try {
            return exifAttribute.getIntValue(this.f53315h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @hib
    public long[] getAttributeRange(@efb String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f53327t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        C8247d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return new long[]{exifAttribute.f53343c, exifAttribute.f53344d.length};
        }
        return null;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public Long getDateTime() {
        return parseDateTime(getAttribute(f53042U), getAttribute(f53231r0), getAttribute(f53207o0));
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public Long getDateTimeDigitized() {
        return parseDateTime(getAttribute(f53199n0), getAttribute(f53247t0), getAttribute(f53223q0));
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public Long getDateTimeOriginal() {
        return parseDateTime(getAttribute(f53191m0), getAttribute(f53239s0), getAttribute(f53215p0));
    }

    @hib
    @igg({"AutoBoxing"})
    public Long getGpsDateTime() {
        String attribute = getAttribute(f53097a2);
        String attribute2 = getAttribute(f52900E1);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = f53050U7;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f53197m6.parse(str, parsePosition);
                    if (date == null && (date = f53205n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(f52880C, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @hib
    public byte[] getThumbnail() {
        int i = this.f53322o;
        if (i == 6 || i == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    @hib
    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.f53316i) {
            return null;
        }
        if (this.f53321n == null) {
            this.f53321n = getThumbnailBytes();
        }
        int i = this.f53322o;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f53321n, 0, this.f53320m);
        }
        if (i == 1) {
            int length = this.f53321n.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.f53321n;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << 16) + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C8247d c8247d = this.f53313f[4].get(f53129e2);
            C8247d c8247d2 = this.f53313f[4].get(f53137f2);
            if (c8247d != null && c8247d2 != null) {
                return Bitmap.createBitmap(iArr, c8247d2.getIntValue(this.f53315h), c8247d.getIntValue(this.f53315h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] getThumbnailBytes() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.f53316i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.f53321n
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f53310c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L24
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L52
        L1a:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L97
        L21:
            r2 = r1
            goto La0
        L24:
            p000.m95.m17133c(r0)
            return r1
        L28:
            java.lang.String r0 = r8.f53308a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.lang.String r2 = r8.f53308a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            goto L18
        L34:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L97
        L39:
            r0 = r1
            r2 = r0
            goto La0
        L3d:
            java.io.FileDescriptor r0 = r8.f53309b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = p000.m95.C9221a.m17140b(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r3 = 0
            p000.m95.C9221a.m17141c(r0, r3, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r7 = r2
            r2 = r0
            r0 = r7
        L52:
            int r3 = r8.f53319l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r4 = r8.f53323p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r8.f53319l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f53323p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L8a
            int r3 = r8.f53320m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f53320m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            if (r5 != r6) goto L84
            r8.f53321n = r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            p000.m95.m17133c(r0)
            if (r2 == 0) goto L7e
            p000.m95.m17132b(r2)
        L7e:
            return r3
        L7f:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L82:
            r0 = r7
            goto L97
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L8a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L90:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L82
        L94:
            r2 = r0
            r0 = r1
            goto La0
        L97:
            p000.m95.m17133c(r1)
            if (r2 == 0) goto L9f
            p000.m95.m17132b(r2)
        L9f:
            throw r0
        La0:
            p000.m95.m17133c(r0)
            if (r2 == 0) goto La8
            p000.m95.m17132b(r2)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.getThumbnailBytes():byte[]");
    }

    @hib
    public long[] getThumbnailRange() {
        if (this.f53327t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f53316i) {
            return null;
        }
        if (!this.f53317j || this.f53318k) {
            return new long[]{this.f53319l + this.f53323p, this.f53320m};
        }
        return null;
    }

    public boolean hasAttribute(@efb String str) {
        return getExifAttribute(str) != null;
    }

    public boolean hasThumbnail() {
        return this.f53316i;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(f52880C, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.f53316i) {
            return false;
        }
        int i = this.f53322o;
        return i == 6 || i == 7;
    }

    public void resetOrientation() {
        setAttribute(f52880C, Integer.toString(1));
    }

    public void rotate(int i) {
        if (i % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(f52880C, 1);
        List<Integer> list = f52973M2;
        if (list.contains(Integer.valueOf(attributeInt))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = f52982N2;
            if (list2.contains(Integer.valueOf(attributeInt))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(f52880C, Integer.toString(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void saveAttributes() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.saveAttributes():void");
    }

    public void setAltitude(double d) {
        String str = d >= 0.0d ? a43.f347l : "1";
        setAttribute(f52891D1, new C8251h(Math.abs(d)).toString());
        setAttribute(f52882C1, str);
    }

    public void setAttribute(@efb String str, @hib String str2) {
        C8249f c8249f;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((f53042U.equals(str3) || f53191m0.equals(str3) || f53199n0.equals(str3)) && strReplaceAll != null) {
            boolean zFind = f53068W7.matcher(strReplaceAll).find();
            boolean zFind2 = f53077X7.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f53263v, "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", g1i.f38277c);
            }
        }
        if (f53291y0.equals(str3)) {
            str3 = f53300z0;
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && f53158h7.contains(str3)) {
            if (str3.equals(f52900E1)) {
                Matcher matcher = f53059V7.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f53263v, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new C8251h(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f53263v, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < f53126d7.length) {
            if ((i6 != 4 || this.f53316i) && (c8249f = f53150g7[i6].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strReplaceAll);
                    if (c8249f.f53347c == ((Integer) pairGuessDataFormat.first).intValue() || c8249f.f53347c == ((Integer) pairGuessDataFormat.second).intValue()) {
                        i = c8249f.f53347c;
                    } else {
                        int i7 = c8249f.f53348d;
                        if (i7 == -1 || !(i7 == ((Integer) pairGuessDataFormat.first).intValue() || c8249f.f53348d == ((Integer) pairGuessDataFormat.second).intValue())) {
                            int i8 = c8249f.f53347c;
                            if (i8 == i4 || i8 == 7 || i8 == i3) {
                                i = i8;
                            } else if (f53272w) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f52923G6;
                                sb.append(strArr[c8249f.f53347c]);
                                sb.append(c8249f.f53348d == -1 ? "" : ", " + strArr[c8249f.f53348d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairGuessDataFormat.first).intValue()]);
                                sb.append(((Integer) pairGuessDataFormat.second).intValue() != -1 ? ", " + strArr[((Integer) pairGuessDataFormat.second).intValue()] : "");
                                sb.append(c0b.f15434d);
                            }
                        } else {
                            i = c8249f.f53348d;
                        }
                    }
                    String str4 = pj4.f71071b;
                    switch (i) {
                        case 1:
                            i2 = i5;
                            this.f53313f[i6].put(str3, C8247d.createByte(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i2 = i5;
                            this.f53313f[i6].put(str3, C8247d.createString(strReplaceAll));
                            break;
                        case 3:
                            i2 = i5;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i9 = i2; i9 < strArrSplit.length; i9++) {
                                iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                            }
                            this.f53313f[i6].put(str3, C8247d.createUShort(iArr, this.f53315h));
                            break;
                        case 4:
                            i2 = i5;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i10 = i2; i10 < strArrSplit2.length; i10++) {
                                jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                            }
                            this.f53313f[i6].put(str3, C8247d.createULong(jArr, this.f53315h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            C8251h[] c8251hArr = new C8251h[strArrSplit3.length];
                            int i11 = 0;
                            while (i11 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i11].split(str4, -1);
                                c8251hArr[i11] = new C8251h((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i4]));
                                i11++;
                                str4 = str4;
                                i4 = 1;
                            }
                            i2 = 0;
                            this.f53313f[i6].put(str3, C8247d.createURational(c8251hArr, this.f53315h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f53272w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Data format isn't one of expected formats: ");
                                sb2.append(i);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i12 = 0; i12 < strArrSplit5.length; i12++) {
                                iArr2[i12] = Integer.parseInt(strArrSplit5[i12]);
                            }
                            this.f53313f[i6].put(str3, C8247d.createSLong(iArr2, this.f53315h));
                            i2 = 0;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            C8251h[] c8251hArr2 = new C8251h[strArrSplit6.length];
                            int i13 = i5;
                            while (i13 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i13].split(pj4.f71071b, -1);
                                c8251hArr2[i13] = new C8251h((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i13++;
                                i5 = 0;
                            }
                            this.f53313f[i6].put(str3, C8247d.createSRational(c8251hArr2, this.f53315h));
                            i2 = 0;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i14 = i5; i14 < strArrSplit8.length; i14++) {
                                dArr[i14] = Double.parseDouble(strArrSplit8[i14]);
                            }
                            this.f53313f[i6].put(str3, C8247d.createDouble(dArr, this.f53315h));
                            break;
                    }
                } else {
                    this.f53313f[i6].remove(str3);
                }
                i2 = i5;
            } else {
                i2 = i5;
            }
            i6++;
            i5 = i2;
            i3 = 2;
            i4 = 1;
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void setDateTime(@efb Long l) {
        if (l == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = a43.f347l + string;
        }
        setAttribute(f53042U, f53197m6.format(new Date(l.longValue())));
        setAttribute(f53231r0, string);
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(f53080Y1, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(f52945J1, "K");
        setAttribute(f52954K1, new C8251h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f53197m6.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(f53097a2, strArrSplit[0]);
        setAttribute(f52900E1, strArrSplit[1]);
    }

    public void setLatLong(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        }
        if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        setAttribute(f53292y1, d >= 0.0d ? "N" : f53020R4);
        setAttribute(f53301z1, convertDecimalDegree(Math.abs(d)));
        setAttribute(f52864A1, d2 >= 0.0d ? f53029S4 : f53038T4);
        setAttribute(f52873B1, convertDecimalDegree(Math.abs(d2)));
    }

    /* JADX INFO: renamed from: k95$i */
    public static class C8252i extends C8245b {
        public C8252i(byte[] bArr) throws IOException {
            super(bArr);
            this.f53334a.mark(Integer.MAX_VALUE);
        }

        public void seek(long j) throws IOException {
            int i = this.f53336c;
            if (i > j) {
                this.f53336c = 0;
                this.f53334a.reset();
            } else {
                j -= (long) i;
            }
            skipFully((int) j);
        }

        public C8252i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f53334a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    @hib
    public double[] getLatLong() {
        String attribute = getAttribute(f53301z1);
        String attribute2 = getAttribute(f53292y1);
        String attribute3 = getAttribute(f52873B1);
        String attribute4 = getAttribute(f52864A1);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f53263v, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    /* JADX INFO: renamed from: k95$f */
    public static class C8249f {

        /* JADX INFO: renamed from: a */
        public final int f53345a;

        /* JADX INFO: renamed from: b */
        public final String f53346b;

        /* JADX INFO: renamed from: c */
        public final int f53347c;

        /* JADX INFO: renamed from: d */
        public final int f53348d;

        public C8249f(String str, int i, int i2) {
            this.f53346b = str;
            this.f53345a = i;
            this.f53347c = i2;
            this.f53348d = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m14601a(int i) {
            int i2;
            int i3 = this.f53347c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f53348d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public C8249f(String str, int i, int i2, int i3) {
            this.f53346b = str;
            this.f53345a = i;
            this.f53347c = i2;
            this.f53348d = i3;
        }
    }

    public k95(@efb String str) throws Throwable {
        C8249f[][] c8249fArr = f53126d7;
        this.f53313f = new HashMap[c8249fArr.length];
        this.f53314g = new HashSet(c8249fArr.length);
        this.f53315h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            initForFilename(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public k95(@efb FileDescriptor fileDescriptor) throws Throwable {
        boolean z;
        FileInputStream fileInputStream;
        Throwable th;
        C8249f[][] c8249fArr = f53126d7;
        this.f53313f = new HashMap[c8249fArr.length];
        this.f53314g = new HashSet(c8249fArr.length);
        this.f53315h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f53310c = null;
            this.f53308a = null;
            if (isSeekableFD(fileDescriptor)) {
                this.f53309b = fileDescriptor;
                try {
                    fileDescriptor = m95.C9221a.m17140b(fileDescriptor);
                    z = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } else {
                this.f53309b = null;
                z = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                loadAttributes(fileInputStream);
                m95.m17133c(fileInputStream);
                if (z) {
                    m95.m17132b(fileDescriptor);
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                m95.m17133c(fileInputStream);
                if (z) {
                    m95.m17132b(fileDescriptor);
                }
                throw th;
            }
        }
        throw new NullPointerException("fileDescriptor cannot be null");
    }

    public k95(@efb InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k95(@p000.efb java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            k95$f[][] r0 = p000.k95.f53126d7
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f53313f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f53314g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f53315h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f53308a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = p000.k95.f53182k7
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = isExifDataOnly(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f53312e = r1
            r3.f53310c = r0
            r3.f53309b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f53310c = r5
            r3.f53309b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = isSeekableFD(r1)
            if (r1 == 0) goto L62
            r3.f53310c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f53309b = r5
            goto L66
        L62:
            r3.f53310c = r0
            r3.f53309b = r0
        L66:
            r3.loadAttributes(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k95.<init>(java.io.InputStream, int):void");
    }
}
